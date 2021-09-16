package org.xtext.mdd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.mdd.dgen.Entity
import org.eclipse.xtext.naming.IQualifiedNameProvider

class DjangoViewsGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("app/views.py", resource.createViews);
	}
	
	private def createViews(Resource resource)'''
        from django.shortcuts import render, redirect
        from django.views.generic.base import TemplateView
        from django.views.generic.edit import CreateView, UpdateView, DeleteView
        from django.views.generic.list import ListView
        from .models import «FOR e : resource.allContents.toIterable.filter(Entity) SEPARATOR ', '»«e.fullyQualifiedName»«ENDFOR»
        from django.urls import reverse_lazy
        from django.contrib.auth.mixins import LoginRequiredMixin

        class Home(LoginRequiredMixin, TemplateView):
            template_name = 'bootstrap/index.html'

        «FOR entity : resource.allContents.toIterable.filter(Entity)»
        	«val what = try {
			    val group = entity.views.viewGroup.name
			    if (group.length > 0) {}
			    'group'
		  	} catch (Exception e) {
		    	'option'
		  	}»
        	«IF what == 'group'»
        		«IF entity.views.viewGroup.name == 'All'»
				    «entity.createView»«entity.readView»«entity.updateView»«entity.deleteView»
				«ENDIF»
            «ELSE»
                «FOR opt : entity.views.viewOption»
                    «IF opt.name == 'Create'»
                        «entity.createView»
                    «ENDIF»
                    «IF opt.name == 'Read'»
                        «entity.readView»
                    «ENDIF»
                    «IF opt.name == 'Update'»
                        «entity.updateView»
                    «ENDIF»
                    «IF opt.name == 'Delete'»
                        «entity.deleteView»
                    «ENDIF»
                «ENDFOR»
            «ENDIF»
		«ENDFOR»
    '''
    
    private def createView(Entity e)'''
        class «e.fullyQualifiedName»Create(LoginRequiredMixin, CreateView):
            model = «e.fullyQualifiedName»
            fields = '__all__'
            success_url = reverse_lazy('«e.name.toLowerCase»_read')

    '''

    private def readView(Entity e) '''
        class «e.fullyQualifiedName»Read(LoginRequiredMixin, ListView):
            model = «e.fullyQualifiedName»
            template_name = "app/«e.name.toLowerCase»_read.html"

    '''

    private def updateView(Entity e)'''
        class «e.fullyQualifiedName»Update(LoginRequiredMixin, UpdateView):
            model = «e.fullyQualifiedName»
            fields = '__all__'
            success_url = reverse_lazy('«e.name.toLowerCase»_read')

    '''

    private def deleteView(Entity e)'''
        class «e.fullyQualifiedName»Delete(LoginRequiredMixin, DeleteView):
            model = «e.fullyQualifiedName»
            success_url = reverse_lazy('«e.name.toLowerCase»_read')

    '''
}