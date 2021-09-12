package org.xtext.mdd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.mdd.dgen.Entity
import org.xtext.mdd.dgen.Feature
import org.eclipse.xtext.naming.IQualifiedNameProvider

class DjangoModelsGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("app/models.py", resource.createModel);
	}
	
	private def createModel(Resource resource)'''
		from django.conf import settings
		from django.db import models
		from django.utils import timezone
		
		«FOR entity : resource.allContents.toIterable.filter(Entity) »
			«entity.createClass»
			
		«ENDFOR»
	'''
	
	private def createClass(Entity e)'''     
        class «e.name»«
        	IF e.superType !== null
        		»(«e.superType.fullyQualifiedName»)«
            ELSE
            	»(models.Model)«
            ENDIF»:
            «FOR feature : e.features»
                «feature.createAttributes»
            «ENDFOR»
    '''

    private def createAttributes(Feature f)'''
        «f.name.toLowerCase» = «
        IF     f.type.name == "String" »models.CharField(max_length=200)«
        ELSEIF f.type.name == "Int"    »models.BigIntegerField()«
        ELSEIF f.type.name == "Float"  »models.FloatField()«
        ELSEIF f.type.name == "Bool"   »models.BooleanField()«
        ELSEIF f.type.name == "Date"   »models.DateTimeField(default=timezone.now)«
        ELSE                           »models.ForeignKey('«f.type.name»', on_delete=models.CASCADE)«
        ENDIF»
    '''
}