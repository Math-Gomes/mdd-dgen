package org.xtext.mdd.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class DjangoBaseGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("manage.py", this.createManage(resource));
    fsa.generateFile("project/asgi.py", this.createAsgi(resource));
    fsa.generateFile("project/settings.py", this.createSettings(resource));
    fsa.generateFile("project/urls.py", this.createUrls(resource));
    fsa.generateFile("project/wsgi.py", this.createWsgi(resource));
    fsa.generateFile("scripts/init.sh", this.createInit(resource));
    fsa.generateFile("app/admin.py", this.createAdmin(resource));
    fsa.generateFile("app/apps.py", this.createApps(resource));
    fsa.generateFile("app/models.py", this.createModels(resource));
    fsa.generateFile("app/tests.py", this.createTests(resource));
    fsa.generateFile("app/views.py", this.createViews(resource));
  }
  
  private CharSequence createInit(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/bin/bash");
    _builder.newLine();
    _builder.append("# sudo apt install python3 -y");
    _builder.newLine();
    _builder.append("# sudo apt install python3.8-venv -y");
    _builder.newLine();
    _builder.append("python3 -m venv env");
    _builder.newLine();
    _builder.append("source env/bin/activate");
    _builder.newLine();
    _builder.append("pip install -r requirements.txt");
    _builder.newLine();
    _builder.append("deactivate");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createManage(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/usr/bin/env python");
    _builder.newLine();
    _builder.append("\"\"\"Django\'s command-line utility for administrative tasks.\"\"\"");
    _builder.newLine();
    _builder.append("import os");
    _builder.newLine();
    _builder.append("import sys");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("def main():");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"\"\"Run administrative tasks.\"\"\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("os.environ.setdefault(\'DJANGO_SETTINGS_MODULE\', \'project.settings\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("try:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("from django.core.management import execute_from_command_line");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("except ImportError as exc:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("raise ImportError(");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("\"Couldn\'t import Django. Are you sure it\'s installed and \"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("\"available on your PYTHONPATH environment variable? Did you \"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("\"forget to activate a virtual environment?\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(") from exc");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("execute_from_command_line(sys.argv)");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("if __name__ == \'__main__\':");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("main()");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createAsgi(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("ASGI config for project project.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("It exposes the ASGI callable as a module-level variable named ``application``.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("For more information on this file, see");
    _builder.newLine();
    _builder.append("https://docs.djangoproject.com/en/3.2/howto/deployment/asgi/");
    _builder.newLine();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import os");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from django.core.asgi import get_asgi_application");
    _builder.newLine();
    _builder.newLine();
    _builder.append("os.environ.setdefault(\'DJANGO_SETTINGS_MODULE\', \'project.settings\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("application = get_asgi_application()");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createSettings(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("Django settings for project project.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Generated by \'django-admin startproject\' using Django 3.2.7.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("For more information on this file, see");
    _builder.newLine();
    _builder.append("https://docs.djangoproject.com/en/3.2/topics/settings/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("For the full list of settings and their values, see");
    _builder.newLine();
    _builder.append("https://docs.djangoproject.com/en/3.2/ref/settings/");
    _builder.newLine();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import os");
    _builder.newLine();
    _builder.append("from pathlib import Path");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Build paths inside the project like this: BASE_DIR / \'subdir\'.");
    _builder.newLine();
    _builder.append("BASE_DIR = Path(__file__).resolve().parent.parent");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Quick-start development settings - unsuitable for production");
    _builder.newLine();
    _builder.append("# See https://docs.djangoproject.com/en/3.2/howto/deployment/checklist/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# SECURITY WARNING: keep the secret key used in production secret!");
    _builder.newLine();
    _builder.append("SECRET_KEY = \'django-insecure-00pt26+*gs9=!ls-x%fucn&*p3tubo1j#!n28+pgd9+$tw#!u$\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# SECURITY WARNING: don\'t run with debug turned on in production!");
    _builder.newLine();
    _builder.append("DEBUG = True");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ALLOWED_HOSTS = []");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Application definition");
    _builder.newLine();
    _builder.newLine();
    _builder.append("INSTALLED_APPS = [");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.admin\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.auth\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.contenttypes\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.sessions\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.messages\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.staticfiles\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'app\',");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("MIDDLEWARE = [");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.middleware.security.SecurityMiddleware\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.sessions.middleware.SessionMiddleware\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.middleware.common.CommonMiddleware\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.middleware.csrf.CsrfViewMiddleware\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.auth.middleware.AuthenticationMiddleware\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.contrib.messages.middleware.MessageMiddleware\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'django.middleware.clickjacking.XFrameOptionsMiddleware\',");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ROOT_URLCONF = \'project.urls\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("TEMPLATES = [");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'BACKEND\': \'django.template.backends.django.DjangoTemplates\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'DIRS\': [],");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'APP_DIRS\': True,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'OPTIONS\': {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("\'context_processors\': [");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\'django.template.context_processors.debug\',");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\'django.template.context_processors.request\',");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\'django.contrib.auth.context_processors.auth\',");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\'django.contrib.messages.context_processors.messages\',");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("WSGI_APPLICATION = \'project.wsgi.application\'");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Database");
    _builder.newLine();
    _builder.append("# https://docs.djangoproject.com/en/3.2/ref/settings/#databases");
    _builder.newLine();
    _builder.newLine();
    _builder.append("DATABASES = {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\'default\': {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'ENGINE\': \'django.db.backends.sqlite3\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'NAME\': BASE_DIR / \'db.sqlite3\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Password validation");
    _builder.newLine();
    _builder.append("# https://docs.djangoproject.com/en/3.2/ref/settings/#auth-password-validators");
    _builder.newLine();
    _builder.newLine();
    _builder.append("AUTH_PASSWORD_VALIDATORS = [");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'NAME\': \'django.contrib.auth.password_validation.UserAttributeSimilarityValidator\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'NAME\': \'django.contrib.auth.password_validation.MinimumLengthValidator\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'NAME\': \'django.contrib.auth.password_validation.CommonPasswordValidator\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\'NAME\': \'django.contrib.auth.password_validation.NumericPasswordValidator\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Internationalization");
    _builder.newLine();
    _builder.append("# https://docs.djangoproject.com/en/3.2/topics/i18n/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("LANGUAGE_CODE = \'pt-BR\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("TIME_ZONE = \'America/Sao_Paulo\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("USE_I18N = True");
    _builder.newLine();
    _builder.newLine();
    _builder.append("USE_L10N = True");
    _builder.newLine();
    _builder.newLine();
    _builder.append("USE_TZ = True");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Static files (CSS, JavaScript, Images)");
    _builder.newLine();
    _builder.append("# https://docs.djangoproject.com/en/3.2/howto/static-files/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("STATIC_URL = \'/static/\'");
    _builder.newLine();
    _builder.append("STATIC_ROOT = os.path.join(BASE_DIR, \'static\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Default primary key field type");
    _builder.newLine();
    _builder.append("# https://docs.djangoproject.com/en/3.2/ref/settings/#default-auto-field");
    _builder.newLine();
    _builder.newLine();
    _builder.append("DEFAULT_AUTO_FIELD = \'django.db.models.BigAutoField\'");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createUrls(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"\"\"project URL Configuration");
    _builder.newLine();
    _builder.newLine();
    _builder.append("The `urlpatterns` list routes URLs to views. For more information please see:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("https://docs.djangoproject.com/en/3.2/topics/http/urls/");
    _builder.newLine();
    _builder.append("Examples:");
    _builder.newLine();
    _builder.append("Function views");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("1. Add an import:  from my_app import views");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("2. Add a URL to urlpatterns:  path(\'\', views.home, name=\'home\')");
    _builder.newLine();
    _builder.append("Class-based views");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("1. Add an import:  from other_app.views import Home");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("2. Add a URL to urlpatterns:  path(\'\', Home.as_view(), name=\'home\')");
    _builder.newLine();
    _builder.append("Including another URLconf");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("1. Import the include() function: from django.urls import include, path");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("2. Add a URL to urlpatterns:  path(\'blog/\', include(\'blog.urls\'))");
    _builder.newLine();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("from django.contrib import admin");
    _builder.newLine();
    _builder.append("from django.urls import path");
    _builder.newLine();
    _builder.newLine();
    _builder.append("urlpatterns = [");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path(\'admin/\', admin.site.urls),");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createWsgi(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("WSGI config for project project.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("It exposes the WSGI callable as a module-level variable named ``application``.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("For more information on this file, see");
    _builder.newLine();
    _builder.append("https://docs.djangoproject.com/en/3.2/howto/deployment/wsgi/");
    _builder.newLine();
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import os");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from django.core.wsgi import get_wsgi_application");
    _builder.newLine();
    _builder.newLine();
    _builder.append("os.environ.setdefault(\'DJANGO_SETTINGS_MODULE\', \'project.settings\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("application = get_wsgi_application()");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createAdmin(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.contrib import admin");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Register your models here.");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createApps(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.apps import AppConfig");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class AppConfig(AppConfig):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("default_auto_field = \'django.db.models.BigAutoField\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("name = \'app\'");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createModels(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createTests(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.test import TestCase");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Create your tests here.");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createViews(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.shortcuts import render");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Create your views here.");
    _builder.newLine();
    return _builder;
  }
}