package org.xtext.mdd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.mdd.dgen.Entity

class DjangoHtmlGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {	
		for(e : resource.allContents.toIterable.filter(Entity)){
			val what = try {
			    val group = e.views.viewGroup.name
			    if (group.length > 0) {}
			    'group'
		  	} catch (Exception ex) {
		    	'option'
		  	}
	    	if(what == 'group'){
	    		if(e.views.viewGroup.name == 'All'){
				    fsa.generateFile("app/templates/app/"+e.name.toLowerCase+"_form.html", e.formHtml)
	                fsa.generateFile("app/templates/app/"+e.name.toLowerCase+"_read.html", e.readHtml)
	                fsa.generateFile("app/templates/app/"+e.name.toLowerCase+"_confirm_delete.html", e.confirmDeleteHtml)
				}
	        } else {
	            for(opt : e.views.viewOption){
	                if(opt.name == 'Create'){
	                    fsa.generateFile("app/templates/app/"+e.name.toLowerCase+"_form.html", e.formHtml)
	                }
	                if(opt.name == 'Read'){
	                    fsa.generateFile("app/templates/app/"+e.name.toLowerCase+"_read.html", e.readHtml)
	                }
	                if(opt.name == 'Update'){
	                    fsa.generateFile("app/templates/app/"+e.name.toLowerCase+"_form.html", e.formHtml)
	                }
	                if(opt.name == 'Delete'){
	                    fsa.generateFile("app/templates/app/"+e.name.toLowerCase+"_confirm_delete.html", e.confirmDeleteHtml)
	                }
	            }
	        }
        }
		
	}
	
	private def formHtml(Entity e)'''
        {% extends 'bootstrap/index.html' %}
        {% load crispy_forms_tags %}
        {% block content %}
            <h1>Criar «e.name»</h1>

            <form action="" method="post">
                {% csrf_token %}
                {{ form|crispy }}
                <input name="submit" type="submit" value="Criar" />
            </form>
        {% endblock %}
    '''

    private def readHtml(Entity e)'''
        {% extends 'bootstrap/index.html' %}
        {% load static %}
        {% block content %}
        <head>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
            {% comment %} <link rel="stylesheet" type="text/css" href="{% static 'vendor/datatables/dataTables.bootstrap4.min.css' %}"> {% endcomment %}
            <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
        </head>
        <h1 style="text-align: center">«e.name»</h1>
        <div style="margin: auto; width: 80%;">
            <a href = "{% url '«e.name.toLowerCase»_add' %}" class="btn btn-success" style="float: right; margin-bottom: 10px; margin-right: 10px;">Criar</a>
        </div>
        <div style="margin: auto; width: 80%; padding: 10px;">
            <table id="table" class="display" style="width:100%">
                <thead>
                    <tr>
                        {% for column in object_list.cols %}
                            <th>{{ column }}</th>
                        {% endfor %}
                    </tr>
                </thead>
                <tbody>
                    {% for «e.name.toLowerCase» in object_list.rows %}
                        <tr>
                            «FOR f : e.features»
                            <td>{{ «e.name.toLowerCase».«f.name» }}</td>
                            «ENDFOR»
                            <td>
                                <a href="{% url '«e.name.toLowerCase»_update' «e.name.toLowerCase».pk %}">Atualizar</a>
                                <a href="{% url '«e.name.toLowerCase»_delete' «e.name.toLowerCase».pk %}">Deletar</a>
                            </td>
                        </tr>
                    {% endfor %}
                </tbody>
            </table>
        </div>
        <script>
        $('#table').DataTable();
        </script>
        {% endblock %} 
    '''

    private def confirmDeleteHtml(Entity e)'''
        {% extends 'bootstrap/index.html' %}
        {% block content %}  
        <form action="" method="post">{% csrf_token %}
            <p>Tem certeza que deseja deletar a «e.name.toLowerCase» "{{ object.name }}"?</p>
            <input type="submit" value="Confirm" />
            <button type='button' onclick="window.location.href={% url '«e.name.toLowerCase»_list' %}">No</button>
        </form>
        {% endblock %}
    '''
	
}
