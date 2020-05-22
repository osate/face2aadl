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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.simpleidl.simpleIDL.AnyDeclarator;
import org.osate.simpleidl.simpleIDL.FixedArraySize;
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.simpleidl.simpleIDL.impl.AnyDeclaratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.simpleidl.simpleIDL.impl.AnyDeclaratorImpl#getArraySize <em>Array Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyDeclaratorImpl extends MinimalEObjectImpl.Container implements AnyDeclarator
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraySize()
   * @generated
   * @ordered
   */
  protected FixedArraySize arraySize;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnyDeclaratorImpl()
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
    return SimpleIDLPackage.Literals.ANY_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleIDLPackage.ANY_DECLARATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FixedArraySize getArraySize()
  {
    return arraySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArraySize(FixedArraySize newArraySize, NotificationChain msgs)
  {
    FixedArraySize oldArraySize = arraySize;
    arraySize = newArraySize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE, oldArraySize, newArraySize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArraySize(FixedArraySize newArraySize)
  {
    if (newArraySize != arraySize)
    {
      NotificationChain msgs = null;
      if (arraySize != null)
        msgs = ((InternalEObject)arraySize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE, null, msgs);
      if (newArraySize != null)
        msgs = ((InternalEObject)newArraySize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE, null, msgs);
      msgs = basicSetArraySize(newArraySize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE, newArraySize, newArraySize));
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
      case SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE:
        return basicSetArraySize(null, msgs);
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
      case SimpleIDLPackage.ANY_DECLARATOR__NAME:
        return getName();
      case SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE:
        return getArraySize();
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
      case SimpleIDLPackage.ANY_DECLARATOR__NAME:
        setName((String)newValue);
        return;
      case SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE:
        setArraySize((FixedArraySize)newValue);
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
      case SimpleIDLPackage.ANY_DECLARATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE:
        setArraySize((FixedArraySize)null);
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
      case SimpleIDLPackage.ANY_DECLARATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimpleIDLPackage.ANY_DECLARATOR__ARRAY_SIZE:
        return arraySize != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AnyDeclaratorImpl
