package org.xtext.mdd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class DjangoLoginGenerator extends AbstractGenerator{
	
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    	fsa.generateFile("app/login.py", resource.createLogin);
	}
	
	private def createLogin(Resource resource)'''
		from django import forms
		from django.contrib.auth.forms import UserCreationForm
		from django.contrib.auth.models import User
		
		# Autenticação de usuário
		from django.shortcuts import render, redirect
		from django.urls import reverse_lazy
		from django.contrib.auth import login, authenticate
		from django.contrib.auth.forms import UserCreationForm
		from django.contrib.auth.views import LoginView
		from django.contrib.auth import logout
		from django.contrib.auth.mixins import LoginRequiredMixin
		
		
		class SignUpForm(UserCreationForm):
		    email = forms.EmailField(max_length=254)
		
		    class Meta:
		        model = User
		        fields = ('username', 'email', 'password1', 'password2', )
		
		
		def SignUpView(request):
		    if request.method == 'POST':
		        form = SignUpForm(request.POST)
		        if form.is_valid():
		            form.save()
		            username = form.cleaned_data.get('username')
		            raw_password = form.cleaned_data.get('password1')
		            user = authenticate(username=username, password=raw_password)
		            login(request, user)
		            return redirect('home')
		    else:
		        form = SignUpForm()
		    return render(request, 'bootstrap/register.html', {'form': form})
		
		## Login
		class LoginUserView(LoginView):
		    template_name = "bootstrap/login.html"
		
		    def get_success_url(self):
		        return reverse_lazy("home")
		
		## Logout
		def LogoutView(request):
		    logout(request)
		    return redirect('login')
		
		
	'''
}