package org.xtext.mdd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.mdd.dgen.Entity
import org.xtext.mdd.dgen.Feature
import org.eclipse.xtext.naming.IQualifiedNameProvider

class DjangoTemplateGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("app/templates/bootstrap/index.html", resource.createIndex);
		fsa.generateFile("app/templates/bootstrap/login.html", resource.createLogin);
		fsa.generateFile("app/templates/bootstrap/register.html", resource.createRegister);
		fsa.generateFile("app/templates/bootstrap/home.html", resource.createHome);
	}
	
	private def createIndex(Resource resource)'''
		<!DOCTYPE html>
		
		{% load static %}
		<html lang="en">
		
		<head>
		
		  <meta charset="utf-8">
		  <meta http-equiv="X-UA-Compatible" content="IE=edge">
		  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		  <meta name="description" content="">
		  <meta name="author" content="">
		
		  <title>DGen</title>
		
		  <!-- Custom fonts for this template-->
		  <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
		  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
		  <link rel="icon" type="image/png" href="https://i.imgur.com/tZHHQj3.png"/>
		  <!-- Custom styles for this template-->
		  <link href="{% static 'css/styles.css' %}" rel="stylesheet">
		  <link href="{% static 'css/sb-admin-2.min.css' %}" rel="stylesheet">
		
		</head>
		
		<body id="page-top">
		
		  <!-- Page Wrapper -->
		  <div id="wrapper">
		
		    <!-- Sidebar -->
		    <ul class="navbar-nav sidebar sidebar-dark" id="dgen-sb">
		
		      <!-- Sidebar - Brand -->
		      <a class="sidebar-brand d-flex align-items-center justify-content-center" id="dgen-sb-brand" href="{% url 'home' %}">
		        <div class="sidebar-brand-icon">
		          <i class="fas fa-project-diagram"></i>
		        </div>
		        <div class="sidebar-brand-text mx-3">Dgen</div>
		      </a>
		
		      <!-- Divider -->
		      <hr class="sidebar-divider my-0">
	
				?FOR e : resource.allContents.toIterable.filter(Entity)?
					?val what = try {
						val group = e.views.viewGroup.name
						if (group.length > 0) {}
						'group'
					} catch (Exception ex) {
						'option'
					}?
					?IF what == 'group'?
						?IF e.views.viewGroup.name == 'All'?
						<!-- ?e.fullyQualifiedName? -->
						<li class="nav-item">
							<a class="nav-link" href="{% url '?e.name.toLowerCase?_read' %}">
								<i class="fad fa-sitemap"></i>
								<span>?e.fullyQualifiedName?</span>
							</a>
						</li>
						?ENDIF?
					?ELSE?
						?IF e.views.viewOption.filter(opt | opt.name.equals('Read')).size > 0?
							<!-- ?e.fullyQualifiedName? -->
							<li class="nav-item">
								<a class="nav-link" href="{% url '?e.name.toLowerCase?_read' %}">
									<i class="fad fa-sitemap"></i>
									<span>?e.fullyQualifiedName?</span>
								</a>
							</li>
						?ELSEIF e.views.viewOption.filter(opt | opt.name.equals('Create')).size > 0?
							<!-- ?e.fullyQualifiedName? -->
							<li class="nav-item">
								<a class="nav-link" href="{% url '?e.name.toLowerCase?_add' %}">
									<i class="fad fa-sitemap"></i>
									<span>?e.fullyQualifiedName?</span>
								</a>
							</li>
						?ELSEIF e.views.viewOption.filter(opt | opt.name.equals('Update')).size > 0?
							<!-- ?e.fullyQualifiedName? -->
							<li class="nav-item">
								<a class="nav-link" href="{% url '?e.name.toLowerCase?_update' %}">
									<i class="fad fa-sitemap"></i>
									<span>?e.fullyQualifiedName?</span>
								</a>
							</li>
						?ELSEIF  e.views.viewOption.filter(opt | opt.name.equals('Delete')).size > 0?
							<!-- ?e.fullyQualifiedName? -->
							<li class="nav-item">
								<a class="nav-link" href="{% url '?e.name.toLowerCase?_delete' %}">
									<i class="fad fa-sitemap"></i>
									<span>?e.fullyQualifiedName?</span>
								</a>
							</li>
						?ENDIF?
					?ENDIF?
				?ENDFOR?
		
		      <!-- Divider -->
		      <hr class="sidebar-divider d-none d-md-block">
		
		      <!-- Sidebar Toggler (Sidebar) -->
		      <div class="text-center d-none d-md-inline">
		        <button class="rounded-circle border-0" id="sidebarToggle"></button>
		      </div>
		
		    </ul>
		    <!-- End of Sidebar -->
		
		    <!-- Content Wrapper -->
		    <div id="content-wrapper" class="d-flex flex-column">
		
		      <!-- Main Content -->
		      <div id="content">
		
		        <!-- Topbar -->
		        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
		
		          <!-- Sidebar Toggle (Topbar) -->
		          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
		            <i class="fa fa-bars"></i>
		          </button>
		
		          <!-- Topbar Search -->
		          <!-- <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
		            <div class="input-group">
		              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
		              <div class="input-group-append">
		                <button class="btn btn-primary" type="button">
		                  <i class="fas fa-search fa-sm"></i>
		                </button>
		              </div>
		            </div>
		          </form> -->
		
		          <!-- Topbar Navbar -->
		          <ul class="navbar-nav ml-auto">
		
		            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
		            <li class="nav-item dropdown no-arrow d-sm-none">
		              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		                <i class="fas fa-search fa-fw"></i>
		              </a>
		              <!-- Dropdown - Messages -->
		              <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
		                <form class="form-inline mr-auto w-100 navbar-search">
		                  <div class="input-group">
		                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
		                    <div class="input-group-append">
		                      <button class="btn btn-primary" type="button">
		                        <i class="fas fa-search fa-sm"></i>
		                      </button>
		                    </div>
		                  </div>
		                </form>
		              </div>
		            </li>
		
		            <!-- Nav Item - Alerts -->
		            {% comment %} <li class="nav-item dropdown no-arrow mx-1">
		              <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		                <i class="fas fa-bell fa-fw"></i>
		                <!-- Counter - Alerts -->
		                <span class="badge badge-danger badge-counter">3+</span>
		              </a>
		              <!-- Dropdown - Alerts -->
		              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="alertsDropdown">
		                <h6 class="dropdown-header">
		                  Alerts Center
		                </h6>
		                <a class="dropdown-item d-flex align-items-center" href="#">
		                  <div class="mr-3">
		                    <div class="icon-circle bg-primary">
		                      <i class="fas fa-file-alt text-white"></i>
		                    </div>
		                  </div>
		                  <div>
		                    <div class="small text-gray-500">December 12, 2019</div>
		                    <span class="font-weight-bold">A new monthly report is ready to download!</span>
		                  </div>
		                </a>
		                <a class="dropdown-item d-flex align-items-center" href="#">
		                  <div class="mr-3">
		                    <div class="icon-circle bg-success">
		                      <i class="fas fa-donate text-white"></i>
		                    </div>
		                  </div>
		                  <div>
		                    <div class="small text-gray-500">December 7, 2019</div>
		                    $290.29 has been deposited into your account!
		                  </div>
		                </a>
		                <a class="dropdown-item d-flex align-items-center" href="#">
		                  <div class="mr-3">
		                    <div class="icon-circle bg-warning">
		                      <i class="fas fa-exclamation-triangle text-white"></i>
		                    </div>
		                  </div>
		                  <div>
		                    <div class="small text-gray-500">December 2, 2019</div>
		                    Spending Alert: We've noticed unusually high spending for your account.
		                  </div>
		                </a>
		                <a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
		              </div>
		            </li>
		
		            <!-- Nav Item - Messages -->
		            <li class="nav-item dropdown no-arrow mx-1">
		              <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		                <i class="fas fa-envelope fa-fw"></i>
		                <!-- Counter - Messages -->
		                <span class="badge badge-danger badge-counter">7</span>
		              </a>
		              <!-- Dropdown - Messages -->
		              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="messagesDropdown">
		                <h6 class="dropdown-header">
		                  Message Center
		                </h6>
		                <a class="dropdown-item d-flex align-items-center" href="#">
		                  <div class="dropdown-list-image mr-3">
		                    <img class="rounded-circle" src="https://source.unsplash.com/fn_BT9fwg_E/60x60" alt="">
		                    <div class="status-indicator bg-success"></div>
		                  </div>
		                  <div class="font-weight-bold">
		                    <div class="text-truncate">Hi there! I am wondering if you can help me with a problem I've been having.</div>
		                    <div class="small text-gray-500">Emily Fowler ? 58m</div>
		                  </div>
		                </a>
		                <a class="dropdown-item d-flex align-items-center" href="#">
		                  <div class="dropdown-list-image mr-3">
		                    <img class="rounded-circle" src="https://source.unsplash.com/AU4VPcFN4LE/60x60" alt="">
		                    <div class="status-indicator"></div>
		                  </div>
		                  <div>
		                    <div class="text-truncate">I have the photos that you ordered last month, how would you like them sent to you?</div>
		                    <div class="small text-gray-500">Jae Chun ? 1d</div>
		                  </div>
		                </a>
		                <a class="dropdown-item d-flex align-items-center" href="#">
		                  <div class="dropdown-list-image mr-3">
		                    <img class="rounded-circle" src="https://source.unsplash.com/CS2uCrpNzJY/60x60" alt="">
		                    <div class="status-indicator bg-warning"></div>
		                  </div>
		                  <div>
		                    <div class="text-truncate">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>
		                    <div class="small text-gray-500">Morgan Alvarez ? 2d</div>
		                  </div>
		                </a>
		                <a class="dropdown-item d-flex align-items-center" href="#">
		                  <div class="dropdown-list-image mr-3">
		                    <img class="rounded-circle" src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="">
		                    <div class="status-indicator bg-success"></div>
		                  </div>
		                  <div>
		                    <div class="text-truncate">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>
		                    <div class="small text-gray-500">Chicken the Dog ? 2w</div>
		                  </div>
		                </a>
		                <a class="dropdown-item text-center small text-gray-500" href="#">Read More Messages</a>
		              </div>
		            </li> {% endcomment %}
		
		            <div class="topbar-divider d-none d-sm-block"></div>
		
		            <!-- Nav Item - User Information -->
		            <li class="nav-item dropdown no-arrow">
		              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		                <span class="mr-2 d-none d-lg-inline text-gray-600 small">
		                {% if user.is_authenticated %}
		                  {{ user.username }}
		                {% else %}
		                  Usu?rio n?o logado
		                {% endif %}</span>
		                <img class="img-profile rounded-circle" src="https://upload.wikimedia.org/wikipedia/commons/7/72/Default-welcomer.png">
		              </a>
		              <!-- Dropdown - User Information -->
		              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
		                <a class="dropdown-item" href="{% url 'home' %}">
		                  <i class="fas fa-home fa-sm fa-fw mr-2 text-gray-400"></i>
		                  Home
		                </a>
		                <div class="dropdown-divider"></div>
		                <a class="dropdown-item" data-toggle="modal" data-target="#logoutModal">
		                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
		                  Logout
		                </a>
		              </div>
		            </li>
		          </ul>
		        </nav>
		        <!-- End of Topbar -->
		
		        <!-- Begin Page Content -->
		        <div class="container-fluid" id="dgen-content">
		
		          {% if messages %}
		            {% for message in messages %}
		              <div class="text-center alert alert-{{ message.tags }} alert-dismissible fade show" role="alert" style="margin: auto; width: 80%;">
		                {{ message|safe }}
		                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		                  <span aria-hidden="true">&times;</span>
		                </button>
		              </div>
		            {% endfor %}
		          {% endif %}
		
		
		          {% block content %}
		          {% endblock %}
		
		        </div>
		        <!-- /.container-fluid -->
		
		      </div>
		      <!-- End of Main Content -->
		
		      <!-- Footer -->
		      
		      <!-- End of Footer -->
		
		    </div>
		    <!-- End of Content Wrapper -->
		
		  </div>
		  <!-- End of Page Wrapper -->
		
		  <!-- Scroll to Top Button-->
		  <a class="scroll-to-top rounded" href="#page-top">
		    <i class="fas fa-angle-up"></i>
		  </a>
		
		  <!-- Logout Modal-->
		  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		    <div class="modal-dialog" role="document">
		      <div class="modal-content">
		        <div class="modal-header">
		          <h5 class="modal-title" id="exampleModalLabel">Pronto para sair?</h5>
		          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
		            <span aria-hidden="true">?</span>
		          </button>
		        </div>
		        <div class="modal-body">Escolha "Logout" abaixo se voc? est? pronto para finalizar a sess?o atual.</div>
		        <div class="modal-footer">
		          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancelar</button>
		          <a class="btn btn-primary" href="{% url 'logout' %}">Logout</a>
		        </div>
		      </div>
		    </div>
		  </div>
		
		  <!-- Bootstrap core JavaScript-->
		  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		  <script src="{% static 'vendor/jquery/jquery.min.js' %}"></script>
		  <script src="{% static 'vendor/bootstrap/js/bootstrap.bundle.min.js' %}"></script>
		
		  <!-- Core plugin JavaScript-->
		  <script src="{% static 'vendor/jquery-easing/jquery.easing.min.js' %}"></script>
		
		  <!-- Custom scripts for all pages-->
		  <script src="{% static 'js/sb-admin-2.min.js' %}"></script>
		
		  <!-- Page level plugins -->
		  {% comment %} <script src="{% static 'vendor/chart.js/Chart.min.js' %}"></script> {% endcomment %}
		
		  <!-- Page level custom scripts -->
		  {% comment %} <script src="{% static 'js/demo/chart-area-demo.js' %}"></script>
		  <script src="{% static 'js/demo/chart-pie-demo.js' %}"></script> {% endcomment %}
		
		</body>
		
		</html>
		
	'''

	private def createLogin(Resource resource)'''
		<!DOCTYPE html>

		{% load static %}

		{% load crispy_forms_tags %}
		<html lang="en">

		<head>

		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">

		<title>Login</title>

		<!-- Custom fonts for this template-->
		<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
		<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

		<!-- Custom styles for this template-->
		<link href="{% static 'css/sb-admin-2.min.css' %}" rel="stylesheet">

		</head>

		<style>
		.bg-gradient-primary {
			background-color: #153e5c;
			background-image: linear-gradient(180deg, #153e5c 10%, #191a1d 100%);
			background-size: cover;
		}

		.bg-login-image{
			background-image: url("https://www.infoq.com/i18n/software-architecture-trends-2019/styles/illustration.svg");
		}

		</style>

		<body class="bg-gradient-primary">

		<div class="container">

			<!-- Outer Row -->
			<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
				<div class="card-body p-0">
					<!-- Nested Row within Card Body -->
					<div class="row">
					<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
					<div class="col-lg-6">
						<div class="p-5">
						<div class="text-center">
							<h1 class="h4 text-gray-900 mb-4">Bem vindo!</h1>
						</div>
						{% block content %}
							{% if form.errors %}
							<p id="error_wrong_user_or_pass" style="color: red;">Usu?rio ou senha incorretos. Tente novamente.</p>
							{% endif %}
							{% if next %}
								{% if user.is_authenticated %}
								<p>Sua conta n?o possui acesso ? essa p?gina. Para continuar
								fa?a login com uma conta que possua acesso.</p>
								{% else %}
								<p>Favor fazer o login para acessar essa p?gina.</p>
								{% endif %}
							{% endif %}
							<form method="post" action="{% url 'login' %}">
							{% csrf_token %}
								<p>{{ form.username|as_crispy_field }}</p>
								<p>{{ form.password|as_crispy_field }}</p>
							<input type="submit" name="submit" value="Login" class="btn btn-primary btn-user btn-block">
							<input type="hidden" name="next" value="{{ next }}">
							</form>
							{% comment %} <p><a href="{% url 'password_reset' %}">Lost password?</a></p> {% endcomment %}
						{% endblock %}
						<hr>
						<!-- <div class="text-center">
							<a class="small" href="forgot-password.html">Forgot Password?</a>
						</div> -->
						<div class="text-center">
							<a class="small" href="{% url 'signup' %}">Criar uma Conta!</a>
						</div>
						</div>
					</div>
					</div>
				</div>
				</div>

			</div>

			</div>

		</div>

		<!-- Bootstrap core JavaScript-->
		<script src="{% static 'vendor/jquery/jquery.min.js' %}"></script>
		<script src="{% static 'vendor/bootstrap/js/bootstrap.bundle.min.js' %}"></script>

		<!-- Core plugin JavaScript-->
		<script src="{% static 'vendor/jquery-easing/jquery.easing.min.js' %}"></script>

		<!-- Custom scripts for all pages-->
		<script src="{% static 'js/sb-admin-2.min.js' %}"></script>

		</body>

		</html>

	'''

	private def createRegister(Resource resource)'''
		<!DOCTYPE html>

		{% load static %}

		{% load crispy_forms_tags %}
		<html lang="en">

		<head>

		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">

		<title>Registre-se</title>

		<!-- Custom fonts for this template-->
		<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
		<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

		<!-- Custom styles for this template-->
		<link href="{% static 'css/sb-admin-2.min.css' %}" rel="stylesheet">

		</head>

		<style>
		.bg-gradient-primary {
			background-color: #153e5c;
			background-image: linear-gradient(180deg, #153e5c 10%, #191a1d 100%);
			background-size: cover;
		}

		.bg-register-image{
			background-image: url("https://images.pexels.com/photos/1978126/pexels-photo-1978126.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
		}
		

		</style>

		<body class="bg-gradient-primary">

		<div class="container">

			<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
				<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
				<div class="col-lg-7">
					<div class="p-5">
					<div class="text-center">
						<h1 class="h4 text-gray-900 mb-4">Crie uma conta!</h1>
					</div>
					{% block content %}
						<form method="post">
						{% csrf_token %}
						{% for field in form %}
							<p>
							{{ field|as_crispy_field }}
							</p>
						{% endfor %}
						<button class="btn btn-primary btn-user btn-block" type="submit">Registrar</button>
						</form>
					{% endblock %}
					<hr>
					<div class="text-center">
						<a class="small" href="{% url 'login' %}">J? tem uma conta? Entre!</a>
					</div>
					</div>
				</div>
				</div>
			</div>
			</div>

		</div>

		<!-- Bootstrap core JavaScript-->
		<script src="{% static 'vendor/jquery/jquery.min.js' %}"></script>
		<script src="{% static 'vendor/bootstrap/js/bootstrap.bundle.min.js' %}"></script>

		<!-- Core plugin JavaScript-->
		<script src="{% static 'vendor/jquery-easing/jquery.easing.min.js' %}"></script>

		<!-- Custom scripts for all pages-->
		<script src="{% static 'js/sb-admin-2.min.js' %}"></script>

		</body>

		</html>

	'''

	private def createHome(Resource resource)'''
		{% extends 'bootstrap/index.html' %}
		{% block content %}
		<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
		<style>
			.grid-container {
				display: grid;
				grid-template-columns: 1fr 1fr;
				grid-gap: 15px;
				row-gap: 15px;
				margin-top: 15px;
			}
			.grid-item {
				display: flex;
				align-items: center;
				justify-content: center;
				padding: 10px 0;
			}
			.grid-item {
				min-width: 380px;
				background-color: white;
				border-radius: 10px;
				box-shadow: 0 0 15px 1px #eeecec;
			}
			.title{
				text-align: center; 
				color: #153e5c;
				font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol","Noto Color Emoji"
			}
		</style>

		<h1 class="title"><i class="fas fa-project-diagram"></i> DGEN</h1>
		<div style="width: 100%; margin-top: 20px;">
			<div class="grid-item" style="text-align: center;">
				<div id="chart" style="display: inline-block; text-align: left;"></div>
			</div>
		</div>
		<div class="grid-container">
			?FOR e : resource.allContents.toIterable.filter(Entity)?
			?IF !e.features.filter(Feature).filter[type.name=="Int"].isEmpty?
			<div class="grid-item">
				<div id="chart-?e.name.toLowerCase?"></div>
			</div>
			?ENDIF?
			?ENDFOR?
		</div>

		<script>
			var options = {
				chart: {
				width: 380,
				type: 'pie',
				},
				theme: {
					palette: 'palette4' // upto palette10
				},
				title: {
					text: 'Percentual das Entidades Cadastradas',
					align: 'center'
				},
				series: [?FOR e : resource.allContents.toIterable.filter(Entity) SEPARATOR ', '?{{ len_?e.name.toLowerCase? }}?ENDFOR?],
				labels: [?FOR e : resource.allContents.toIterable.filter(Entity) SEPARATOR ', '?'?e.fullyQualifiedName?'?ENDFOR?]
			}
			var chart = new ApexCharts(document.querySelector("#chart"), options);
			chart.render();

			?FOR e : resource.allContents.toIterable.filter(Entity)?
				?IF !e.features.filter(Feature).filter[type.name=="Int"].isEmpty?
				var options_?e.name.toLowerCase? = {
					chart: {
						type: 'bar'
					},
					plotOptions: {
						bar: {
							distributed: true
						}
					},
					theme: {
						palette: 'palette4' // upto palette10
					},
					legend:{
						show: false
					},
					title: {
						text: '?e.features.filter(Feature).filter[type.name=="Int"].get(0).name.toFirstUpper? dos(as) ?e.fullyQualifiedName?s',
						align: 'center'
					},
					series: [{
						name: '?e.features.filter(Feature).filter[type.name=="Int"].get(0).name.toFirstUpper?',
						data: [{% for o in ?e.name.toLowerCase? %}{{ o.?e.features.filter(Feature).filter[type.name=="Int"].get(0).name? }},{% endfor %}]
					}],
					xaxis: {
						categories: [{% for o in ?e.name.toLowerCase? %}"{{ o }}",{% endfor %}]
					}
				}
				var chart = new ApexCharts(document.querySelector("#chart-?e.name.toLowerCase?"), options_?e.name.toLowerCase?);
				chart.render();
				?ENDIF?
			?ENDFOR?		

		</script>

		{% endblock %}
	'''
}