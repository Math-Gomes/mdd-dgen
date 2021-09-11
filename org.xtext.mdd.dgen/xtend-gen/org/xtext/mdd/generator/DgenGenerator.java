/**
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.generator;

import javax.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DgenGenerator extends AbstractGenerator {
  @Inject
  private DjangoBaseGenerator djangoBaseGenerator;
  
  @Inject
  private DjangoModelsGenerator djangoModelsGenerator;
  
  @Inject
  private DjangoViewsGenerator djangoViewsGenerator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.djangoBaseGenerator.doGenerate(resource, fsa, context);
    this.djangoModelsGenerator.doGenerate(resource, fsa, context);
    this.djangoViewsGenerator.doGenerate(resource, fsa, context);
  }
}
