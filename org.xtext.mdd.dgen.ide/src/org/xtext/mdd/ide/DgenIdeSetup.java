/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.mdd.DgenRuntimeModule;
import org.xtext.mdd.DgenStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DgenIdeSetup extends DgenStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DgenRuntimeModule(), new DgenIdeModule()));
	}
	
}
