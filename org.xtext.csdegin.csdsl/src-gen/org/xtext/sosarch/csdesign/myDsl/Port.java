/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.Port#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.Port#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.Port#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sosarch.csdesign.myDsl.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosarch.csdesign.myDsl.provide}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provides</em>' containment reference list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getPort_Provides()
   * @model containment="true"
   * @generated
   */
  EList<provide> getProvides();

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosarch.csdesign.myDsl.require}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getPort_Requires()
   * @model containment="true"
   * @generated
   */
  EList<require> getRequires();

} // Port
