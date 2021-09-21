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
import org.xtext.mdd.dgen.Feature;
import org.xtext.mdd.dgen.ViewOptions;

@SuppressWarnings("all")
public class DjangoHtmlGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      {
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
        boolean _equals = Objects.equal(what, "group");
        if (_equals) {
          String _name = e.getViews().getViewGroup().getName();
          boolean _equals_1 = Objects.equal(_name, "All");
          if (_equals_1) {
            String _lowerCase = e.getName().toLowerCase();
            String _plus = ("app/templates/app/" + _lowerCase);
            String _plus_1 = (_plus + "_form.html");
            fsa.generateFile(_plus_1, this.formHtml(e));
            String _lowerCase_1 = e.getName().toLowerCase();
            String _plus_2 = ("app/templates/app/" + _lowerCase_1);
            String _plus_3 = (_plus_2 + "_read.html");
            fsa.generateFile(_plus_3, this.readHtml(e));
            String _lowerCase_2 = e.getName().toLowerCase();
            String _plus_4 = ("app/templates/app/" + _lowerCase_2);
            String _plus_5 = (_plus_4 + "_confirm_delete.html");
            fsa.generateFile(_plus_5, this.confirmDeleteHtml(e));
          }
        } else {
          EList<ViewOptions> _viewOption = e.getViews().getViewOption();
          for (final ViewOptions opt : _viewOption) {
            {
              String _name_1 = opt.getName();
              boolean _equals_2 = Objects.equal(_name_1, "Create");
              if (_equals_2) {
                String _lowerCase_3 = e.getName().toLowerCase();
                String _plus_6 = ("app/templates/app/" + _lowerCase_3);
                String _plus_7 = (_plus_6 + "_form.html");
                fsa.generateFile(_plus_7, this.formHtml(e));
              }
              String _name_2 = opt.getName();
              boolean _equals_3 = Objects.equal(_name_2, "Read");
              if (_equals_3) {
                String _lowerCase_4 = e.getName().toLowerCase();
                String _plus_8 = ("app/templates/app/" + _lowerCase_4);
                String _plus_9 = (_plus_8 + "_read.html");
                fsa.generateFile(_plus_9, this.readHtml(e));
              }
              String _name_3 = opt.getName();
              boolean _equals_4 = Objects.equal(_name_3, "Update");
              if (_equals_4) {
                String _lowerCase_5 = e.getName().toLowerCase();
                String _plus_10 = ("app/templates/app/" + _lowerCase_5);
                String _plus_11 = (_plus_10 + "_form.html");
                fsa.generateFile(_plus_11, this.formHtml(e));
              }
              String _name_4 = opt.getName();
              boolean _equals_5 = Objects.equal(_name_4, "Delete");
              if (_equals_5) {
                String _lowerCase_6 = e.getName().toLowerCase();
                String _plus_12 = ("app/templates/app/" + _lowerCase_6);
                String _plus_13 = (_plus_12 + "_confirm_delete.html");
                fsa.generateFile(_plus_13, this.confirmDeleteHtml(e));
              }
            }
          }
        }
      }
    }
  }
  
  private CharSequence formHtml(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{% extends \'bootstrap/index.html\' %}");
    _builder.newLine();
    _builder.append("{% load crispy_forms_tags %}");
    _builder.newLine();
    _builder.append("{% block content %}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<h1>");
    String _name = e.getName();
    _builder.append(_name, "    ");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<form action=\"\" method=\"post\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("{% csrf_token %}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("{{ form|crispy }}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<input name=\"submit\" class=\"btn btn-success\" type=\"submit\" value=\"Salvar\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("{% endblock %}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence readHtml(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{% extends \'bootstrap/index.html\' %}");
    _builder.newLine();
    _builder.append("{% load static %}");
    _builder.newLine();
    _builder.append("{% block content %}");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{% comment %} <link rel=\"stylesheet\" type=\"text/css\" href=\"{% static \'vendor/datatables/dataTables.bootstrap4.min.css\' %}\"> {% endcomment %}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<h1 style=\"text-align: center\">");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("<div style=\"margin: auto; width: 80%;\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<a href = \"{% url \'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_add\' %}\" class=\"btn btn-success\" style=\"float: right; margin-bottom: 10px; margin-right: 10px;\"><i class=\"fas fa-plus\"></i> Criar</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("#table_filter > label > input[type=\"search\"] {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("border: 1px solid grey;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("border-radius: 4px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("#table_length > label > select {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("border-radius: 4px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("<div style=\"margin: auto; width: 80%; padding: 10px;\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<table id=\"table\" class=\"table table-hover table-bordered\" style=\"width:100%\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("                ");
        _builder.append("<th>");
        String _name_1 = f.getName();
        _builder.append(_name_1, "                ");
        _builder.append("</th>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Entity _superType = e.getSuperType();
      boolean _tripleNotEquals = (_superType != null);
      if (_tripleNotEquals) {
        {
          EList<Feature> _features_1 = e.getSuperType().getFeatures();
          for(final Feature f_1 : _features_1) {
            _builder.append("                ");
            _builder.append("<th>");
            String _name_2 = f_1.getName();
            _builder.append(_name_2, "                ");
            _builder.append("</th>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("                ");
    _builder.append("<th>Ações</th>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<tbody>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("{% for ");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "            ");
    _builder.append(" in ");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2, "            ");
    _builder.append("_list %}");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<Feature> _features_2 = e.getFeatures();
      for(final Feature f_2 : _features_2) {
        _builder.append("                    ");
        _builder.append("<td>{{ ");
        String _lowerCase_3 = e.getName().toLowerCase();
        _builder.append(_lowerCase_3, "                    ");
        _builder.append(".");
        String _lowerCase_4 = f_2.getName().toLowerCase();
        _builder.append(_lowerCase_4, "                    ");
        _builder.append(" }}</td>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Entity _superType_1 = e.getSuperType();
      boolean _tripleNotEquals_1 = (_superType_1 != null);
      if (_tripleNotEquals_1) {
        {
          EList<Feature> _features_3 = e.getSuperType().getFeatures();
          for(final Feature f_3 : _features_3) {
            _builder.append("                    ");
            _builder.append("<td>{{ ");
            String _lowerCase_5 = e.getName().toLowerCase();
            _builder.append(_lowerCase_5, "                    ");
            _builder.append(".");
            String _lowerCase_6 = f_3.getName().toLowerCase();
            _builder.append(_lowerCase_6, "                    ");
            _builder.append(" }}</td>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("                    ");
    _builder.append("<td>");
    _builder.newLine();
    _builder.append("                        ");
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
          String _name_3 = e.getViews().getViewGroup().getName();
          boolean _equals_1 = Objects.equal(_name_3, "All");
          if (_equals_1) {
            _builder.append("                        ");
            _builder.append("<a href=\"{% url \'");
            String _lowerCase_7 = e.getName().toLowerCase();
            _builder.append(_lowerCase_7, "                        ");
            _builder.append("_update\' ");
            String _lowerCase_8 = e.getName().toLowerCase();
            _builder.append(_lowerCase_8, "                        ");
            _builder.append(".pk %}\" class=\"btn\"><i class=\"fas fa-edit\"></i></a>");
            _builder.newLineIfNotEmpty();
            _builder.append("                        ");
            _builder.append("<a href=\"{% url \'");
            String _lowerCase_9 = e.getName().toLowerCase();
            _builder.append(_lowerCase_9, "                        ");
            _builder.append("_delete\' ");
            String _lowerCase_10 = e.getName().toLowerCase();
            _builder.append(_lowerCase_10, "                        ");
            _builder.append(".pk %}\" class=\"btn\"><i class=\"fas fa-trash\"></i></a>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          EList<ViewOptions> _viewOption = e.getViews().getViewOption();
          for(final ViewOptions opt : _viewOption) {
            {
              String _name_4 = opt.getName();
              boolean _equals_2 = Objects.equal(_name_4, "Update");
              if (_equals_2) {
                _builder.append("                        ");
                _builder.append("<a href=\"{% url \'");
                String _lowerCase_11 = e.getName().toLowerCase();
                _builder.append(_lowerCase_11, "                        ");
                _builder.append("_update\' ");
                String _lowerCase_12 = e.getName().toLowerCase();
                _builder.append(_lowerCase_12, "                        ");
                _builder.append(".pk %}\" class=\"btn\"><i class=\"fas fa-edit\"></i></a>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_5 = opt.getName();
              boolean _equals_3 = Objects.equal(_name_5, "Delete");
              if (_equals_3) {
                _builder.append("                        ");
                _builder.append("<a href=\"{% url \'");
                String _lowerCase_13 = e.getName().toLowerCase();
                _builder.append(_lowerCase_13, "                        ");
                _builder.append("_delete\' ");
                String _lowerCase_14 = e.getName().toLowerCase();
                _builder.append(_lowerCase_14, "                        ");
                _builder.append(".pk %}\" class=\"btn\"><i class=\"fas fa-trash\"></i></a>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("                    ");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("{% endfor %}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("$(\'#table\').DataTable({");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"language\": {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"url\": \"//cdn.datatables.net/plug-ins/1.11.1/i18n/pt_br.json\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("{% endblock %} ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence confirmDeleteHtml(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{% extends \'bootstrap/index.html\' %}");
    _builder.newLine();
    _builder.append("{% block content %}  ");
    _builder.newLine();
    _builder.append("<div class=\"my-container\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<form action=\"\" method=\"post\">{% csrf_token %}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p>Tem certeza que deseja deletar este(a) ");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "        ");
    _builder.append(" \"{{ object }}\"?</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<div class=\"my-container\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<input type=\"submit\" value=\"Deletar\" class=\"btn btn-danger\"/>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<button type=\'button\' class=\"btn\" onclick=\"window.location.href={% url \'");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "            ");
    _builder.append("_read\' %}\">Cancelar</button>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("{% endblock %}");
    _builder.newLine();
    return _builder;
  }
}
