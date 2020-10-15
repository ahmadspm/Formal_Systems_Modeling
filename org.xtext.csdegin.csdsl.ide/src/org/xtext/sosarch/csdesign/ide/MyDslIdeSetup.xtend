/*
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.sosarch.csdesign.MyDslRuntimeModule
import org.xtext.sosarch.csdesign.MyDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MyDslIdeSetup extends MyDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule, new MyDslIdeModule))
	}
	
}
