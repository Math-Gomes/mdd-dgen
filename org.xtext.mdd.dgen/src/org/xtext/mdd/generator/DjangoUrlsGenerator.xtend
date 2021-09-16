package org.xtext.mdd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.mdd.dgen.Entity

class DjangoUrlsGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("app/urls.py", resource.createUrls)
	}
	
	private def createUrls(Resource resource)'''
        from django.contrib import admin
        from django.urls import path
        from django.conf.urls import url

        from .views import (
            Home,
            «FOR entity : resource.allContents.toIterable.filter(Entity)»
                «entity.importViews»
            «ENDFOR»
        )

        from .login import SignUpView, LoginUserView, LogoutView
        
        urlpatterns = [
            path('', Home.as_view(), name='home'),
            path('signup/', SignUpView, name='signup'),
            path('accounts/login/', LoginUserView.as_view(), name='login'),
            path('logout/', LogoutView, name='logout'),
            «FOR entity : resource.allContents.toIterable.filter(Entity)»«entity.path»«ENDFOR»
        ]
    '''

    private def importViews(Entity e)'''
    	«
    	val what = try {
		    val group = e.views.viewGroup.name
		    if (group.length > 0) {}
		    'group'
	  	} catch (Exception ex) {
	    	'option'
	  	}
    	»
    	«IF what == 'group'»
    		«IF e.views.viewGroup.name == 'All'»
			    «e.name»Create, «e.name»Read, «e.name»Update, «e.name»Delete, 
			«ENDIF»
        «ELSE»
            «FOR opt : e.views.viewOption»
                «IF opt.name == 'Create'»
                    «e.name»Create, 
                «ENDIF»
                «IF opt.name == 'Read'»
                    «e.name»Read, 
                «ENDIF»
                «IF opt.name == 'Update'»
                    «e.name»Update, 
                «ENDIF»
                «IF opt.name == 'Delete'»
                    «e.name»Delete, 
                «ENDIF»
            «ENDFOR»
        «ENDIF»
    '''

    private def path(Entity e)'''
    	«val what = try {
		    val group = e.views.viewGroup.name
		    if (group.length > 0) {}
		    'group'
	  	} catch (Exception ex) {
	    	'option'
	  	}»
    	«IF what == 'group'»
    		«IF e.views.viewGroup.name == 'All'»
    		    path('«e.name.toLowerCase»/', «e.name»Read.as_view(), name='«e.name.toLowerCase»_read'),
    		    path('«e.name.toLowerCase»/add/', «e.name»Create.as_view(), name='«e.name.toLowerCase»_add'),
    		    path('«e.name.toLowerCase»/<int:pk>/update/', «e.name»Update.as_view(), name='«e.name.toLowerCase»_update'),
    		    path('«e.name.toLowerCase»/<int:pk>/delete/', «e.name»Delete.as_view(), name='«e.name.toLowerCase»_delete'),
			«ENDIF»
        «ELSE»
            «FOR opt : e.views.viewOption»
                «IF opt.name == 'Create'» 
                	path('«e.name.toLowerCase»/add/', «e.name»Create.as_view(), name='«e.name.toLowerCase»_add'),
                «ENDIF»
                «IF opt.name == 'Read'»
                    path('«e.name.toLowerCase»/', «e.name»Read.as_view(), name='«e.name.toLowerCase»_read'),
                «ENDIF»
                «IF opt.name == 'Update'»
                    path('«e.name.toLowerCase»/<int:pk>/update/', «e.name»Update.as_view(), name='«e.name.toLowerCase»_update'),
                «ENDIF»
                «IF opt.name == 'Delete'»
                    path('«e.name.toLowerCase»/<int:pk>/delete/', «e.name»Delete.as_view(), name='«e.name.toLowerCase»_delete'),
                «ENDIF»
            «ENDFOR»
        «ENDIF»
    '''
}
