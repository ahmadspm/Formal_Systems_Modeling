/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.Operation#getRecieves <em>Recieves</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Recieves</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recieves</em>' attribute list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getOperation_Recieves()
   * @model unique="false"
   * @generated
   */
  EList<String> getRecieves();

} // Operation