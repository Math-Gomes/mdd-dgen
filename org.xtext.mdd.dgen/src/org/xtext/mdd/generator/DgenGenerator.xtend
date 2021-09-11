/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import javax.inject.Inject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DgenGenerator extends AbstractGenerator {
	
	@Inject DjangoBaseGenerator djangoBaseGenerator
	@Inject DjangoModelsGenerator djangoModelsGenerator
	@Inject DjangoViewsGenerator djangoViewsGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		djangoBaseGenerator.doGenerate(resource, fsa, context);
		djangoModelsGenerator.doGenerate(resource, fsa, context);
		djangoViewsGenerator.doGenerate(resource, fsa, context);
	}
}