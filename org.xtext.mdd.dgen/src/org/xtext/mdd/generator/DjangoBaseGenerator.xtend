package org.xtext.mdd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class DjangoBaseGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("manage.py", resource.createManage);
		fsa.generateFile("project/asgi.py", resource.createAsgi);
		fsa.generateFile("project/settings.py", resource.createSettings);
		fsa.generateFile("project/urls.py", resource.createUrls);
		fsa.generateFile("project/wsgi.py", resource.createWsgi);
		
		fsa.generateFile("requirements.txt", resource.createRequirements)
		
		fsa.generateFile("scripts/init.sh", resource.createInit);
		
		fsa.generateFile("app/admin.py", resource.createAdmin);
		fsa.generateFile("app/apps.py", resource.createApps);
		fsa.generateFile("app/models.py", resource.createModels);
		fsa.generateFile("app/tests.py", resource.createTests);
		fsa.generateFile("app/views.py", resource.createViews);
		
	}
	
	private def createRequirements(Resource resource)'''
		asgiref==3.4.1
		Django==3.2.7
		django-crispy-forms==1.12.0
		pkg_resources==0.0.0
		pytz==2021.1
		sqlparse==0.4.1
	'''
	
	private def createInit(Resource resource)'''
		#!/bin/bash
		# sudo apt install python3 -y
		# sudo apt install python3.8-venv -y
		python3 -m venv env
		source env/bin/activate
		pip install -r requirements.txt
		python manage.py makemigrations app
		python manage.py migrate
		deactivate
		
	'''
	
	private def createManage(Resource resource)'''
		#!/usr/bin/env python
		"""Django's command-line utility for administrative tasks."""
		import os
		import sys
		
		
		def main():
		    """Run administrative tasks."""
		    os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'project.settings')
		    try:
		        from django.core.management import execute_from_command_line
		    except ImportError as exc:
		        raise ImportError(
		            "Couldn't import Django. Are you sure it's installed and "
		            "available on your PYTHONPATH environment variable? Did you "
		            "forget to activate a virtual environment?"
		        ) from exc
		    execute_from_command_line(sys.argv)
		
		
		if __name__ == '__main__':
		    main()
		
	'''
	
	private def createAsgi(Resource resource)'''
		"""
		ASGI config for project project.
		
		It exposes the ASGI callable as a module-level variable named ``application``.
		
		For more information on this file, see
		https://docs.djangoproject.com/en/3.2/howto/deployment/asgi/
		"""
		
		import os
		
		from django.core.asgi import get_asgi_application
		
		os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'project.settings')
		
		application = get_asgi_application()
		
	'''
	
	private def createSettings(Resource resource)'''
		"""
		Django settings for project project.
		
		Generated by 'django-admin startproject' using Django 3.2.7.
		
		For more information on this file, see
		https://docs.djangoproject.com/en/3.2/topics/settings/
		
		For the full list of settings and their values, see
		https://docs.djangoproject.com/en/3.2/ref/settings/
		"""
		
		import os
		from pathlib import Path
		
		# Build paths inside the project like this: BASE_DIR / 'subdir'.
		BASE_DIR = Path(__file__).resolve().parent.parent
		
		
		# Quick-start development settings - unsuitable for production
		# See https://docs.djangoproject.com/en/3.2/howto/deployment/checklist/
		
		# SECURITY WARNING: keep the secret key used in production secret!
		SECRET_KEY = 'django-insecure-00pt26+*gs9=!ls-x%fucn&*p3tubo1j#!n28+pgd9+$tw#!u$'
		
		# SECURITY WARNING: don't run with debug turned on in production!
		DEBUG = True
		
		ALLOWED_HOSTS = []
		
		
		# Application definition
		
		INSTALLED_APPS = [
		    'django.contrib.admin',
		    'django.contrib.auth',
		    'django.contrib.contenttypes',
		    'django.contrib.sessions',
		    'django.contrib.messages',
		    'django.contrib.staticfiles',
		    'crispy_forms',
		    'app',
		]
		
		MIDDLEWARE = [
		    'django.middleware.security.SecurityMiddleware',
		    'django.contrib.sessions.middleware.SessionMiddleware',
		    'django.middleware.common.CommonMiddleware',
		    'django.middleware.csrf.CsrfViewMiddleware',
		    'django.contrib.auth.middleware.AuthenticationMiddleware',
		    'django.contrib.messages.middleware.MessageMiddleware',
		    'django.middleware.clickjacking.XFrameOptionsMiddleware',
		]
		
		ROOT_URLCONF = 'project.urls'
		
		TEMPLATES = [
		    {
		        'BACKEND': 'django.template.backends.django.DjangoTemplates',
		        'DIRS': [],
		        'APP_DIRS': True,
		        'OPTIONS': {
		            'context_processors': [
		                'django.template.context_processors.debug',
		                'django.template.context_processors.request',
		                'django.contrib.auth.context_processors.auth',
		                'django.contrib.messages.context_processors.messages',
		            ],
		        },
		    },
		]
		
		WSGI_APPLICATION = 'project.wsgi.application'
		
		
		# Database
		# https://docs.djangoproject.com/en/3.2/ref/settings/#databases
		
		DATABASES = {
		    'default': {
		        'ENGINE': 'django.db.backends.sqlite3',
		        'NAME': BASE_DIR / 'db.sqlite3',
		    }
		}
		
		
		# Password validation
		# https://docs.djangoproject.com/en/3.2/ref/settings/#auth-password-validators
		
		AUTH_PASSWORD_VALIDATORS = [
		    {
		        'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
		    },
		    {
		        'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
		    },
		    {
		        'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
		    },
		    {
		        'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
		    },
		]
		
		
		# Internationalization
		# https://docs.djangoproject.com/en/3.2/topics/i18n/
		
		LANGUAGE_CODE = 'pt-BR'
		
		TIME_ZONE = 'America/Sao_Paulo'
		
		USE_I18N = True
		
		USE_L10N = True
		
		USE_TZ = True
		
		
		# Static files (CSS, JavaScript, Images)
		# https://docs.djangoproject.com/en/3.2/howto/static-files/
		
		STATIC_URL = '/static/'
		STATIC_ROOT = os.path.join(BASE_DIR, 'static')
		
		# Default primary key field type
		# https://docs.djangoproject.com/en/3.2/ref/settings/#default-auto-field
		
		DEFAULT_AUTO_FIELD = 'django.db.models.BigAutoField'

		CRISPY_TEMPLATE_PACK = 'bootstrap4'
	'''

	private def createUrls(Resource resource)'''
		"""project URL Configuration
		
		The `urlpatterns` list routes URLs to views. For more information please see:
		    https://docs.djangoproject.com/en/3.2/topics/http/urls/
		Examples:
		Function views
		    1. Add an import:  from my_app import views
		    2. Add a URL to urlpatterns:  path('', views.home, name='home')
		Class-based views
		    1. Add an import:  from other_app.views import Home
		    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
		Including another URLconf
		    1. Import the include() function: from django.urls import include, path
		    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
		"""
		from django.contrib import admin
		from django.urls import path, include
		
		urlpatterns = [
		    path('admin/', admin.site.urls),
		    path('', include('app.urls')),
		]
		
	'''
	
	private def createWsgi(Resource resource)'''
		"""
		WSGI config for project project.
		
		It exposes the WSGI callable as a module-level variable named ``application``.
		
		For more information on this file, see
		https://docs.djangoproject.com/en/3.2/howto/deployment/wsgi/
		"""
		
		import os
		
		from django.core.wsgi import get_wsgi_application
		
		os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'project.settings')
		
		application = get_wsgi_application()
		
	'''

	private def createAdmin(Resource resource)'''
		from django.contrib import admin

		# Register your models here.
	'''
	
	private def createApps(Resource resource)'''
		from django.apps import AppConfig
		
		class AppConfig(AppConfig):
		    default_auto_field = 'django.db.models.BigAutoField'
		    name = 'app'
	'''
	
	private def createModels(Resource resource)'''
		
	'''
	
	private def createTests(Resource resource)'''
		from django.test import TestCase
		
		# Create your tests here.
	'''
	
	private def createViews(Resource resource)'''
		from django.shortcuts import render
		
		# Create your views here.
	'''
}
