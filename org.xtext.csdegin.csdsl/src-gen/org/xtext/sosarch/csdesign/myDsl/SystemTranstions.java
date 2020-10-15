/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Transtions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.SystemTranstions#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.SystemTranstions#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.SystemTranstions#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getSystemTranstions()
 * @model
 * @generated
 */
public interface SystemTranstions extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getSystemTranstions_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sosarch.csdesign.myDsl.SystemTranstions#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosarch.csdesign.myDsl.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getSystemTranstions_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosarch.csdesign.myDsl.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getSystemTranstions_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

} // SystemTranstions