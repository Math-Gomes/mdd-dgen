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
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.mdd.dgen.Entity;
import org.xtext.mdd.dgen.Feature;

@SuppressWarnings("all")
public class DjangoModelsGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("app/models.py", this.createModel(resource));
  }
  
  private CharSequence createModel(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.conf import settings");
    _builder.newLine();
    _builder.append("from django.db import models");
    _builder.newLine();
    _builder.append("from django.utils import timezone");
    _builder.newLine();
    _builder.newLine();
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity entity : _filter) {
        CharSequence _createClass = this.createClass(entity);
        _builder.append(_createClass);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence createClass(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = e.getName();
    _builder.append(_name);
    {
      Entity _superType = e.getSuperType();
      boolean _tripleNotEquals = (_superType != null);
      if (_tripleNotEquals) {
        _builder.append("(");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName);
        _builder.append(")");
      } else {
        _builder.append("(models.Model)");
      }
    }
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature feature : _features) {
        _builder.append("    ");
        CharSequence _createAttributes = this.createAttributes(feature);
        _builder.append(_createAttributes, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def __str__(self):");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return str(self.");
    {
      Entity _superType_1 = e.getSuperType();
      boolean _tripleNotEquals_1 = (_superType_1 != null);
      if (_tripleNotEquals_1) {
        String _name_1 = e.getSuperType().getFeatures().get(0).getName();
        _builder.append(_name_1, "        ");
      } else {
        String _name_2 = e.getFeatures().get(0).getName();
        _builder.append(_name_2, "        ");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createAttributes(final Feature f) {
    StringConcatenation _builder = new StringConcatenation();
    String _lowerCase = f.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(" = ");
    {
      boolean _isMany = f.isMany();
      if (_isMany) {
        _builder.append("models.ManyToManyField(");
        String _name = f.getType().getName();
        _builder.append(_name);
        {
          boolean _isOptional = f.isOptional();
          if (_isOptional) {
            _builder.append(", blank=True, null=True");
          }
        }
        _builder.append(")");
      } else {
        String _name_1 = f.getType().getName();
        boolean _equals = Objects.equal(_name_1, "String");
        if (_equals) {
          _builder.append("models.CharField(max_length=200");
          {
            boolean _isOptional_1 = f.isOptional();
            if (_isOptional_1) {
              _builder.append(", blank=True");
            }
          }
          _builder.append(")");
        } else {
          String _name_2 = f.getType().getName();
          boolean _equals_1 = Objects.equal(_name_2, "Int");
          if (_equals_1) {
            _builder.append("models.BigIntegerField(");
            {
              boolean _isOptional_2 = f.isOptional();
              if (_isOptional_2) {
                _builder.append("blank=True");
              }
            }
            _builder.append(")");
          } else {
            String _name_3 = f.getType().getName();
            boolean _equals_2 = Objects.equal(_name_3, "Float");
            if (_equals_2) {
              _builder.append("models.FloatField(");
              {
                boolean _isOptional_3 = f.isOptional();
                if (_isOptional_3) {
                  _builder.append("blank=True");
                }
              }
              _builder.append(")");
            } else {
              String _name_4 = f.getType().getName();
              boolean _equals_3 = Objects.equal(_name_4, "Bool");
              if (_equals_3) {
                _builder.append("models.BooleanField(");
                {
                  boolean _isOptional_4 = f.isOptional();
                  if (_isOptional_4) {
                    _builder.append("blank=True");
                  }
                }
                _builder.append(")");
              } else {
                String _name_5 = f.getType().getName();
                boolean _equals_4 = Objects.equal(_name_5, "Date");
                if (_equals_4) {
                  _builder.append("models.DateTimeField(default=timezone.now");
                  {
                    boolean _isOptional_5 = f.isOptional();
                    if (_isOptional_5) {
                      _builder.append(", blank=True, null=True");
                    }
                  }
                  _builder.append(")");
                } else {
                  _builder.append("models.ForeignKey(\'");
                  String _name_6 = f.getType().getName();
                  _builder.append(_name_6);
                  _builder.append("\', on_delete=models.CASCADE");
                  {
                    boolean _isOptional_6 = f.isOptional();
                    if (_isOptional_6) {
                      _builder.append(", blank=True, null=True");
                    }
                  }
                  _builder.append(")");
                }
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
