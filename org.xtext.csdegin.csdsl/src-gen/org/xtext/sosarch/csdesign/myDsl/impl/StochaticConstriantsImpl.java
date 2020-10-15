/**
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.sosarch.csdesign.myDsl.Datatoinfer;
import org.xtext.sosarch.csdesign.myDsl.MyDslPackage;
import org.xtext.sosarch.csdesign.myDsl.StochaticConstriants;
import org.xtext.sosarch.csdesign.myDsl.rates;
import org.xtext.sosarch.csdesign.myDsl.shardata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stochatic Constriants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.impl.StochaticConstriantsImpl#getConstraintShareDate <em>Constraint Share Date</em>}</li>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.impl.StochaticConstriantsImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.xtext.sosarch.csdesign.myDsl.impl.StochaticConstriantsImpl#getConstraintData <em>Constraint Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StochaticConstriantsImpl extends MinimalEObjectImpl.Container implements StochaticConstriants
{
  /**
   * The cached value of the '{@link #getConstraintShareDate() <em>Constraint Share Date</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintShareDate()
   * @generated
   * @ordered
   */
  protected EList<shardata> constraintShareDate;

  /**
   * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
  protected EList<rates> rate;

  /**
   * The cached value of the '{@link #getConstraintData() <em>Constraint Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintData()
   * @generated
   * @ordered
   */
  protected EList<Datatoinfer> constraintData;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StochaticConstriantsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.STOCHATIC_CONSTRIANTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<shardata> getConstraintShareDate()
  {
    if (constraintShareDate == null)
    {
      constraintShareDate = new EObjectContainmentEList<shardata>(shardata.class, this, MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_SHARE_DATE);
    }
    return constraintShareDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<rates> getRate()
  {
    if (rate == null)
    {
      rate = new EObjectContainmentEList<rates>(rates.class, this, MyDslPackage.STOCHATIC_CONSTRIANTS__RATE);
    }
    return rate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Datatoinfer> getConstraintData()
  {
    if (constraintData == null)
    {
      constraintData = new EObjectContainmentEList<Datatoinfer>(Datatoinfer.class, this, MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_DATA);
    }
    return constraintData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_SHARE_DATE:
        return ((InternalEList<?>)getConstraintShareDate()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STOCHATIC_CONSTRIANTS__RATE:
        return ((InternalEList<?>)getRate()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_DATA:
        return ((InternalEList<?>)getConstraintData()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_SHARE_DATE:
        return getConstraintShareDate();
      case MyDslPackage.STOCHATIC_CONSTRIANTS__RATE:
        return getRate();
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_DATA:
        return getConstraintData();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_SHARE_DATE:
        getConstraintShareDate().clear();
        getConstraintShareDate().addAll((Collection<? extends shardata>)newValue);
        return;
      case MyDslPackage.STOCHATIC_CONSTRIANTS__RATE:
        getRate().clear();
        getRate().addAll((Collection<? extends rates>)newValue);
        return;
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_DATA:
        getConstraintData().clear();
        getConstraintData().addAll((Collection<? extends Datatoinfer>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_SHARE_DATE:
        getConstraintShareDate().clear();
        return;
      case MyDslPackage.STOCHATIC_CONSTRIANTS__RATE:
        getRate().clear();
        return;
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_DATA:
        getConstraintData().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_SHARE_DATE:
        return constraintShareDate != null && !constraintShareDate.isEmpty();
      case MyDslPackage.STOCHATIC_CONSTRIANTS__RATE:
        return rate != null && !rate.isEmpty();
      case MyDslPackage.STOCHATIC_CONSTRIANTS__CONSTRAINT_DATA:
        return constraintData != null && !constraintData.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StochaticConstriantsImpl
