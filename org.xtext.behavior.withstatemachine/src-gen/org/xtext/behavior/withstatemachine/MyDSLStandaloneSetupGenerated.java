/*
 * generated by Xtext 2.19.0
 */
package org.xtext.behavior.withstatemachine;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.xtext.behavior.withstatemachine.myDSL.MyDSLPackage;

@SuppressWarnings("all")
public class MyDSLStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new MyDSLRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.xtext.org/behavior/withstatemachine/MyDSL")) {
			EPackage.Registry.INSTANCE.put("http://www.xtext.org/behavior/withstatemachine/MyDSL", MyDSLPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sm", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("sm", serviceProvider);
	}
}
