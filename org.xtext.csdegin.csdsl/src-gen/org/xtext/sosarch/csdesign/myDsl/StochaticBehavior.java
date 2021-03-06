/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stochatic Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.StochaticBehavior#getSystemTransition <em>System Transition</em>}</li>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.StochaticBehavior#getConConstraint <em>Con Constraint</em>}</li>
 * </ul>
 *
 * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getStochaticBehavior()
 * @model
 * @generated
 */
public interface StochaticBehavior extends Stochasticbehavior
{
  /**
   * Returns the value of the '<em><b>System Transition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosarch.csdesign.myDsl.SystemTranstions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Transition</em>' containment reference list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getStochaticBehavior_SystemTransition()
   * @model containment="true"
   * @generated
   */
  EList<SystemTranstions> getSystemTransition();

  /**
   * Returns the value of the '<em><b>Con Constraint</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sosarch.csdesign.myDsl.StochaticConstriants}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Con Constraint</em>' containment reference list.
   * @see org.xtext.sosarch.csdesign.myDsl.MyDslPackage#getStochaticBehavior_ConConstraint()
   * @model containment="true"
   * @generated
   */
  EList<StochaticConstriants> getConConstraint();

} // StochaticBehavior
