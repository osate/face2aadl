/**
 * ******************************************************************************
 * FACE Data Model to AADL Translator
 * 
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE MATERIAL IS FURNISHED ON
 * AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED,
 * AS TO ANY MATTER INCLUDING, BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT MAKE ANY
 * WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under an Eclipse Public License - v1.0-style license, please see license.txt or contact
 * permission@sei.cmu.edu for full terms.
 * 
 * [DISTRIBUTION STATEMENT A] This material has been approved for public release and unlimited distribution.
 * Please see Copyright notice for non-US Government use and distribution.
 * 
 * DM18-0762
 *  ******************************************************************************
 */
package org.osate.simpleidl.simpleIDL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.simpleidl.simpleIDL.FixedPtType;
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Pt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.simpleidl.simpleIDL.impl.FixedPtTypeImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link org.osate.simpleidl.simpleIDL.impl.FixedPtTypeImpl#getFractionalDigits <em>Fractional Digits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedPtTypeImpl extends TypeImpl implements FixedPtType
{
  /**
   * The default value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalDigits()
   * @generated
   * @ordered
   */
  protected static final int TOTAL_DIGITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalDigits()
   * @generated
   * @ordered
   */
  protected int totalDigits = TOTAL_DIGITS_EDEFAULT;

  /**
   * The default value of the '{@link #getFractionalDigits() <em>Fractional Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionalDigits()
   * @generated
   * @ordered
   */
  protected static final int FRACTIONAL_DIGITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFractionalDigits() <em>Fractional Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionalDigits()
   * @generated
   * @ordered
   */
  protected int fractionalDigits = FRACTIONAL_DIGITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FixedPtTypeImpl()
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
    return SimpleIDLPackage.Literals.FIXED_PT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTotalDigits()
  {
    return totalDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTotalDigits(int newTotalDigits)
  {
    int oldTotalDigits = totalDigits;
    totalDigits = newTotalDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleIDLPackage.FIXED_PT_TYPE__TOTAL_DIGITS, oldTotalDigits, totalDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getFractionalDigits()
  {
    return fractionalDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFractionalDigits(int newFractionalDigits)
  {
    int oldFractionalDigits = fractionalDigits;
    fractionalDigits = newFractionalDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleIDLPackage.FIXED_PT_TYPE__FRACTIONAL_DIGITS, oldFractionalDigits, fractionalDigits));
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
      case SimpleIDLPackage.FIXED_PT_TYPE__TOTAL_DIGITS:
        return getTotalDigits();
      case SimpleIDLPackage.FIXED_PT_TYPE__FRACTIONAL_DIGITS:
        return getFractionalDigits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleIDLPackage.FIXED_PT_TYPE__TOTAL_DIGITS:
        setTotalDigits((Integer)newValue);
        return;
      case SimpleIDLPackage.FIXED_PT_TYPE__FRACTIONAL_DIGITS:
        setFractionalDigits((Integer)newValue);
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
      case SimpleIDLPackage.FIXED_PT_TYPE__TOTAL_DIGITS:
        setTotalDigits(TOTAL_DIGITS_EDEFAULT);
        return;
      case SimpleIDLPackage.FIXED_PT_TYPE__FRACTIONAL_DIGITS:
        setFractionalDigits(FRACTIONAL_DIGITS_EDEFAULT);
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
      case SimpleIDLPackage.FIXED_PT_TYPE__TOTAL_DIGITS:
        return totalDigits != TOTAL_DIGITS_EDEFAULT;
      case SimpleIDLPackage.FIXED_PT_TYPE__FRACTIONAL_DIGITS:
        return fractionalDigits != FRACTIONAL_DIGITS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (totalDigits: ");
    result.append(totalDigits);
    result.append(", fractionalDigits: ");
    result.append(fractionalDigits);
    result.append(')');
    return result.toString();
  }

} //FixedPtTypeImpl
