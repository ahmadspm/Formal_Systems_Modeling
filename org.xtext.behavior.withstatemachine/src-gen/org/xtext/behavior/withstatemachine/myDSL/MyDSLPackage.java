/**
 * generated by Xtext 2.19.0
 */
package org.xtext.behavior.withstatemachine.myDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.behavior.withstatemachine.myDSL.MyDSLFactory
 * @model kind="package"
 * @generated
 */
public interface MyDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/behavior/withstatemachine/MyDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDSLPackage eINSTANCE = org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.StatemachineImpl
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__EVENTS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATES = 2;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.EventImpl
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Evenrates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENRATES = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.StateImpl
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getState()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.RateImpl <em>Rate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.RateImpl
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getRate()
   * @generated
   */
  int RATE = 3;

  /**
   * The feature id for the '<em><b>Eventval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE__EVENTVAL = 0;

  /**
   * The number of structural features of the '<em>Rate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.TransitionsImpl <em>Transitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.TransitionsImpl
   * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getTransitions()
   * @generated
   */
  int TRANSITIONS = 4;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS__EVENT = 0;

  /**
   * The feature id for the '<em><b>Eventrates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS__EVENTRATES = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS__TARGET = 2;

  /**
   * The number of structural features of the '<em>Transitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.behavior.withstatemachine.myDSL.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.behavior.withstatemachine.myDSL.Statemachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Statemachine#getName()
   * @see #getStatemachine()
   * @generated
   */
  EAttribute getStatemachine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.behavior.withstatemachine.myDSL.Statemachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Statemachine#getEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.behavior.withstatemachine.myDSL.Statemachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_States();

  /**
   * Returns the meta object for class '{@link org.xtext.behavior.withstatemachine.myDSL.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.behavior.withstatemachine.myDSL.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.behavior.withstatemachine.myDSL.Event#getEvenrates <em>Evenrates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evenrates</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Event#getEvenrates()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Evenrates();

  /**
   * Returns the meta object for class '{@link org.xtext.behavior.withstatemachine.myDSL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.behavior.withstatemachine.myDSL.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.behavior.withstatemachine.myDSL.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link org.xtext.behavior.withstatemachine.myDSL.Rate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rate</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Rate
   * @generated
   */
  EClass getRate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.behavior.withstatemachine.myDSL.Rate#getEventval <em>Eventval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eventval</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Rate#getEventval()
   * @see #getRate()
   * @generated
   */
  EAttribute getRate_Eventval();

  /**
   * Returns the meta object for class '{@link org.xtext.behavior.withstatemachine.myDSL.Transitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitions</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Transitions
   * @generated
   */
  EClass getTransitions();

  /**
   * Returns the meta object for the reference '{@link org.xtext.behavior.withstatemachine.myDSL.Transitions#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Transitions#getEvent()
   * @see #getTransitions()
   * @generated
   */
  EReference getTransitions_Event();

  /**
   * Returns the meta object for the reference '{@link org.xtext.behavior.withstatemachine.myDSL.Transitions#getEventrates <em>Eventrates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Eventrates</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Transitions#getEventrates()
   * @see #getTransitions()
   * @generated
   */
  EReference getTransitions_Eventrates();

  /**
   * Returns the meta object for the reference '{@link org.xtext.behavior.withstatemachine.myDSL.Transitions#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.xtext.behavior.withstatemachine.myDSL.Transitions#getTarget()
   * @see #getTransitions()
   * @generated
   */
  EReference getTransitions_Target();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDSLFactory getMyDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.StatemachineImpl
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMACHINE__NAME = eINSTANCE.getStatemachine_Name();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__EVENTS = eINSTANCE.getStatemachine_Events();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATES = eINSTANCE.getStatemachine_States();

    /**
     * The meta object literal for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.EventImpl
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Evenrates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__EVENRATES = eINSTANCE.getEvent_Evenrates();

    /**
     * The meta object literal for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.StateImpl
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.RateImpl <em>Rate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.RateImpl
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getRate()
     * @generated
     */
    EClass RATE = eINSTANCE.getRate();

    /**
     * The meta object literal for the '<em><b>Eventval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATE__EVENTVAL = eINSTANCE.getRate_Eventval();

    /**
     * The meta object literal for the '{@link org.xtext.behavior.withstatemachine.myDSL.impl.TransitionsImpl <em>Transitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.TransitionsImpl
     * @see org.xtext.behavior.withstatemachine.myDSL.impl.MyDSLPackageImpl#getTransitions()
     * @generated
     */
    EClass TRANSITIONS = eINSTANCE.getTransitions();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITIONS__EVENT = eINSTANCE.getTransitions_Event();

    /**
     * The meta object literal for the '<em><b>Eventrates</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITIONS__EVENTRATES = eINSTANCE.getTransitions_Eventrates();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITIONS__TARGET = eINSTANCE.getTransitions_Target();

  }

} //MyDSLPackage
