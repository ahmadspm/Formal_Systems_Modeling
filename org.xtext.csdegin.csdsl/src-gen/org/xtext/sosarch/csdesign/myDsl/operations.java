/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.operations#getSends <em>Sends</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getoperations()
 * @model
 * @generated
 */
public interface operations extends Operation
{
  /**
   * Returns the value of the '<em><b>Sends</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sends</em>' attribute list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getoperations_Sends()
   * @model unique="false"
   * @generated
   */
  EList<String> getSends();

} // operations
