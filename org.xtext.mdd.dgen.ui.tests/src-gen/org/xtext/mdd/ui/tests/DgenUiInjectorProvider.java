/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.mdd.dgen.ui.internal.DgenActivator;

public class DgenUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DgenActivator.getInstance().getInjector("org.xtext.mdd.Dgen");
	}

}