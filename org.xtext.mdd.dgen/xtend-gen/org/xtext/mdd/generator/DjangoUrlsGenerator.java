package org.xtext.mdd.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.mdd.dgen.Entity;
import org.xtext.mdd.dgen.ViewOptions;

@SuppressWarnings("all")
public class DjangoUrlsGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("app/urls.py", this.createUrls(resource));
  }
  
  private CharSequence createUrls(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.contrib import admin");
    _builder.newLine();
    _builder.append("from django.urls import path");
    _builder.newLine();
    _builder.append("from django.conf.urls import url");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from .views import (");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Home,");
    _builder.newLine();
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity entity : _filter) {
        _builder.append("    ");
        CharSequence _importViews = this.importViews(entity);
        _builder.append(_importViews, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("urlpatterns = [");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path(\'\', Home.as_view(), name=\'home\'),");
    _builder.newLine();
    _builder.append("    ");
    {
      Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity entity_1 : _filter_1) {
        CharSequence _path = this.path(entity_1);
        _builder.append(_path, "    ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence importViews(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    String _xtrycatchfinallyexpression = null;
    try {
      String _xblockexpression = null;
      {
        final String group = e.getViews().getViewGroup().getName();
        int _length = group.length();
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
        }
        _xblockexpression = "group";
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        _xtrycatchfinallyexpression = "option";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    final String what = _xtrycatchfinallyexpression;
    _builder.newLineIfNotEmpty();
    {
      boolean _equals = Objects.equal(what, "group");
      if (_equals) {
        {
          String _name = e.getViews().getViewGroup().getName();
          boolean _equals_1 = Objects.equal(_name, "All");
          if (_equals_1) {
            String _name_1 = e.getName();
            _builder.append(_name_1);
            _builder.append("Create, ");
            String _name_2 = e.getName();
            _builder.append(_name_2);
            _builder.append("Read, ");
            String _name_3 = e.getName();
            _builder.append(_name_3);
            _builder.append("Update, ");
            String _name_4 = e.getName();
            _builder.append(_name_4);
            _builder.append("Delete, ");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          EList<ViewOptions> _viewOption = e.getViews().getViewOption();
          for(final ViewOptions opt : _viewOption) {
            {
              String _name_5 = opt.getName();
              boolean _equals_2 = Objects.equal(_name_5, "Create");
              if (_equals_2) {
                String _name_6 = e.getName();
                _builder.append(_name_6);
                _builder.append("Create, ");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_7 = opt.getName();
              boolean _equals_3 = Objects.equal(_name_7, "Read");
              if (_equals_3) {
                String _name_8 = e.getName();
                _builder.append(_name_8);
                _builder.append("Read, ");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_9 = opt.getName();
              boolean _equals_4 = Objects.equal(_name_9, "Update");
              if (_equals_4) {
                String _name_10 = e.getName();
                _builder.append(_name_10);
                _builder.append("Update, ");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_11 = opt.getName();
              boolean _equals_5 = Objects.equal(_name_11, "Delete");
              if (_equals_5) {
                String _name_12 = e.getName();
                _builder.append(_name_12);
                _builder.append("Delete, ");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence path(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    String _xtrycatchfinallyexpression = null;
    try {
      String _xblockexpression = null;
      {
        final String group = e.getViews().getViewGroup().getName();
        int _length = group.length();
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
        }
        _xblockexpression = "group";
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        _xtrycatchfinallyexpression = "option";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    final String what = _xtrycatchfinallyexpression;
    _builder.newLineIfNotEmpty();
    {
      boolean _equals = Objects.equal(what, "group");
      if (_equals) {
        {
          String _name = e.getViews().getViewGroup().getName();
          boolean _equals_1 = Objects.equal(_name, "All");
          if (_equals_1) {
            _builder.append("path(\'");
            String _lowerCase = e.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append("/\', ");
            String _name_1 = e.getName();
            _builder.append(_name_1);
            _builder.append("Read.as_view(), name=\'");
            String _lowerCase_1 = e.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append("_read\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("path(\'");
            String _lowerCase_2 = e.getName().toLowerCase();
            _builder.append(_lowerCase_2);
            _builder.append("/add/\', ");
            String _name_2 = e.getName();
            _builder.append(_name_2);
            _builder.append("Create.as_view(), name=\'");
            String _lowerCase_3 = e.getName().toLowerCase();
            _builder.append(_lowerCase_3);
            _builder.append("_add\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("path(\'");
            String _lowerCase_4 = e.getName().toLowerCase();
            _builder.append(_lowerCase_4);
            _builder.append("/<int:pk>/update/\', ");
            String _name_3 = e.getName();
            _builder.append(_name_3);
            _builder.append("Update.as_view(), name=\'");
            String _lowerCase_5 = e.getName().toLowerCase();
            _builder.append(_lowerCase_5);
            _builder.append("_update\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("path(\'");
            String _lowerCase_6 = e.getName().toLowerCase();
            _builder.append(_lowerCase_6);
            _builder.append("/<int:pk>/delete/\', ");
            String _name_4 = e.getName();
            _builder.append(_name_4);
            _builder.append("Delete.as_view(), name=\'");
            String _lowerCase_7 = e.getName().toLowerCase();
            _builder.append(_lowerCase_7);
            _builder.append("_delete\'),");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          EList<ViewOptions> _viewOption = e.getViews().getViewOption();
          for(final ViewOptions opt : _viewOption) {
            {
              String _name_5 = opt.getName();
              boolean _equals_2 = Objects.equal(_name_5, "Create");
              if (_equals_2) {
                _builder.append("path(\'");
                String _lowerCase_8 = e.getName().toLowerCase();
                _builder.append(_lowerCase_8);
                _builder.append("/add/\', ");
                String _name_6 = e.getName();
                _builder.append(_name_6);
                _builder.append("Create.as_view(), name=\'");
                String _lowerCase_9 = e.getName().toLowerCase();
                _builder.append(_lowerCase_9);
                _builder.append("_add\'),");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_7 = opt.getName();
              boolean _equals_3 = Objects.equal(_name_7, "Read");
              if (_equals_3) {
                _builder.append("path(\'");
                String _lowerCase_10 = e.getName().toLowerCase();
                _builder.append(_lowerCase_10);
                _builder.append("/\', ");
                String _name_8 = e.getName();
                _builder.append(_name_8);
                _builder.append("Read.as_view(), name=\'");
                String _lowerCase_11 = e.getName().toLowerCase();
                _builder.append(_lowerCase_11);
                _builder.append("_read\'),");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_9 = opt.getName();
              boolean _equals_4 = Objects.equal(_name_9, "Update");
              if (_equals_4) {
                _builder.append("path(\'");
                String _lowerCase_12 = e.getName().toLowerCase();
                _builder.append(_lowerCase_12);
                _builder.append("/<int:pk>/update/\', ");
                String _name_10 = e.getName();
                _builder.append(_name_10);
                _builder.append("Update.as_view(), name=\'");
                String _lowerCase_13 = e.getName().toLowerCase();
                _builder.append(_lowerCase_13);
                _builder.append("_update\'),");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_11 = opt.getName();
              boolean _equals_5 = Objects.equal(_name_11, "Delete");
              if (_equals_5) {
                _builder.append("path(\'");
                String _lowerCase_14 = e.getName().toLowerCase();
                _builder.append(_lowerCase_14);
                _builder.append("/<int:pk>/delete/\', ");
                String _name_12 = e.getName();
                _builder.append(_name_12);
                _builder.append("Delete.as_view(), name=\'");
                String _lowerCase_15 = e.getName().toLowerCase();
                _builder.append(_lowerCase_15);
                _builder.append("_delete\'),");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
