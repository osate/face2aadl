/*******************************************************************************
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
 *******************************************************************************/
package face.datamodel.platform.impl;

import face.datamodel.platform.Characteristic;
import face.datamodel.platform.CharacteristicPathNode;
import face.datamodel.platform.PlatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Path Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.platform.impl.CharacteristicPathNodeImpl#getProjectedCharacteristic <em>Projected Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicPathNodeImpl extends PathNodeImpl implements CharacteristicPathNode {
	/**
	 * The cached value of the '{@link #getProjectedCharacteristic() <em>Projected Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectedCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected Characteristic projectedCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicPathNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.CHARACTERISTIC_PATH_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic getProjectedCharacteristic() {
		if (projectedCharacteristic != null && projectedCharacteristic.eIsProxy()) {
			InternalEObject oldProjectedCharacteristic = (InternalEObject)projectedCharacteristic;
			projectedCharacteristic = (Characteristic)eResolveProxy(oldProjectedCharacteristic);
			if (projectedCharacteristic != oldProjectedCharacteristic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC, oldProjectedCharacteristic, projectedCharacteristic));
			}
		}
		return projectedCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic basicGetProjectedCharacteristic() {
		return projectedCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedCharacteristic(Characteristic newProjectedCharacteristic) {
		Characteristic oldProjectedCharacteristic = projectedCharacteristic;
		projectedCharacteristic = newProjectedCharacteristic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC, oldProjectedCharacteristic, projectedCharacteristic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
				if (resolve) return getProjectedCharacteristic();
				return basicGetProjectedCharacteristic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
				setProjectedCharacteristic((Characteristic)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatformPackage.CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
				setProjectedCharacteristic((Characteristic)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
				return projectedCharacteristic != null;
		}
		return super.eIsSet(featureID);
	}

} //CharacteristicPathNodeImpl
