package org.xtext.mdd.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.mdd.dgen.Entity;
import org.xtext.mdd.dgen.Feature;
import org.xtext.mdd.dgen.ViewOptions;

@SuppressWarnings("all")
public class DjangoViewsGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("app/views.py", this.createViews(resource));
  }
  
  private CharSequence createViews(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.shortcuts import render, redirect");
    _builder.newLine();
    _builder.append("from django.views.generic.base import TemplateView");
    _builder.newLine();
    _builder.append("from django.views.generic.edit import CreateView, UpdateView, DeleteView");
    _builder.newLine();
    _builder.append("from django.views.generic.list import ListView");
    _builder.newLine();
    _builder.append("from django.contrib.messages.views import SuccessMessageMixin");
    _builder.newLine();
    _builder.append("from .models import ");
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e : _filter) {
        _builder.append(" ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
        _builder.append(_fullyQualifiedName);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("from django.urls import reverse_lazy");
    _builder.newLine();
    _builder.append("from django.contrib import messages");
    _builder.newLine();
    _builder.newLine();
    {
      Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity entity : _filter_1) {
        String _xtrycatchfinallyexpression = null;
        try {
          String _xblockexpression = null;
          {
            final String group = entity.getViews().getViewGroup().getName();
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
              String _name = entity.getViews().getViewGroup().getName();
              boolean _equals_1 = Objects.equal(_name, "All");
              if (_equals_1) {
                CharSequence _createView = this.createView(entity);
                _builder.append(_createView);
                CharSequence _readView = this.readView(entity);
                _builder.append(_readView);
                CharSequence _updateView = this.updateView(entity);
                _builder.append(_updateView);
                CharSequence _deleteView = this.deleteView(entity);
                _builder.append(_deleteView);
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            {
              EList<ViewOptions> _viewOption = entity.getViews().getViewOption();
              for(final ViewOptions opt : _viewOption) {
                {
                  String _name_1 = opt.getName();
                  boolean _equals_2 = Objects.equal(_name_1, "Create");
                  if (_equals_2) {
                    CharSequence _createView_1 = this.createView(entity);
                    _builder.append(_createView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _name_2 = opt.getName();
                  boolean _equals_3 = Objects.equal(_name_2, "Read");
                  if (_equals_3) {
                    CharSequence _readView_1 = this.readView(entity);
                    _builder.append(_readView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _name_3 = opt.getName();
                  boolean _equals_4 = Objects.equal(_name_3, "Update");
                  if (_equals_4) {
                    CharSequence _updateView_1 = this.updateView(entity);
                    _builder.append(_updateView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _name_4 = opt.getName();
                  boolean _equals_5 = Objects.equal(_name_4, "Delete");
                  if (_equals_5) {
                    CharSequence _deleteView_1 = this.deleteView(entity);
                    _builder.append(_deleteView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence createView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("Create(CreateView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("fields = \'__all__\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("success_url = reverse_lazy(\'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list\')");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence readView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("Read(ListView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("template_name = \"app/");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list.html\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def get_querySet(self):");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return {\'rows\' : ");
    QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_2, "        ");
    _builder.append(".objects.filter(),");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("\'cols\' : [");
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("\'");
        String _name = f.getName();
        _builder.append(_name, "                ");
        _builder.append("\', ");
      }
    }
    _builder.append("\'Acoes\']}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence updateView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("Update(UpdateView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("fields = \'__all__\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("success_url = reverse_lazy(\'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list\')");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence deleteView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("Delete(DeleteView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("sucess_url = reverse_lazy(\'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list\')");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
}
