/*
 * generated by Xtext 2.19.0
 */
package org.xtext.behavior.withstatemachine.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.behavior.withstatemachine.myDSL.MyDSLPackage.eINSTANCE);
		return result;
	}
}