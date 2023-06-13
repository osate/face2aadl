/**
 * FACE Data Model to AADL Translator
 * 
 * Copyright 2023 Carnegie Mellon University.
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
 * DM23-0412
 */
package org.osate.datamodel10.logical.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.datamodel10.logical.LogicalPackage;
import org.osate.datamodel10.logical.MeasurementSystemAxis;
import org.osate.datamodel10.logical.ReferencePointPart;
import org.osate.datamodel10.logical.ValueTypeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Point Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.impl.ReferencePointPartImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.ReferencePointPartImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.ReferencePointPartImpl#getValueTypeUnit <em>Value Type Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencePointPartImpl extends MinimalEObjectImpl.Container implements ReferencePointPart {
	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected MeasurementSystemAxis axis;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueTypeUnit() <em>Value Type Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeUnit()
	 * @generated
	 * @ordered
	 */
	protected ValueTypeUnit valueTypeUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencePointPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.REFERENCE_POINT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementSystemAxis getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (MeasurementSystemAxis)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.REFERENCE_POINT_PART__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystemAxis basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxis(MeasurementSystemAxis newAxis) {
		MeasurementSystemAxis oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REFERENCE_POINT_PART__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REFERENCE_POINT_PART__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueTypeUnit getValueTypeUnit() {
		if (valueTypeUnit != null && valueTypeUnit.eIsProxy()) {
			InternalEObject oldValueTypeUnit = (InternalEObject)valueTypeUnit;
			valueTypeUnit = (ValueTypeUnit)eResolveProxy(oldValueTypeUnit);
			if (valueTypeUnit != oldValueTypeUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.REFERENCE_POINT_PART__VALUE_TYPE_UNIT, oldValueTypeUnit, valueTypeUnit));
			}
		}
		return valueTypeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeUnit basicGetValueTypeUnit() {
		return valueTypeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueTypeUnit(ValueTypeUnit newValueTypeUnit) {
		ValueTypeUnit oldValueTypeUnit = valueTypeUnit;
		valueTypeUnit = newValueTypeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REFERENCE_POINT_PART__VALUE_TYPE_UNIT, oldValueTypeUnit, valueTypeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalPackage.REFERENCE_POINT_PART__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
			case LogicalPackage.REFERENCE_POINT_PART__VALUE:
				return getValue();
			case LogicalPackage.REFERENCE_POINT_PART__VALUE_TYPE_UNIT:
				if (resolve) return getValueTypeUnit();
				return basicGetValueTypeUnit();
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
			case LogicalPackage.REFERENCE_POINT_PART__AXIS:
				setAxis((MeasurementSystemAxis)newValue);
				return;
			case LogicalPackage.REFERENCE_POINT_PART__VALUE:
				setValue((String)newValue);
				return;
			case LogicalPackage.REFERENCE_POINT_PART__VALUE_TYPE_UNIT:
				setValueTypeUnit((ValueTypeUnit)newValue);
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
			case LogicalPackage.REFERENCE_POINT_PART__AXIS:
				setAxis((MeasurementSystemAxis)null);
				return;
			case LogicalPackage.REFERENCE_POINT_PART__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case LogicalPackage.REFERENCE_POINT_PART__VALUE_TYPE_UNIT:
				setValueTypeUnit((ValueTypeUnit)null);
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
			case LogicalPackage.REFERENCE_POINT_PART__AXIS:
				return axis != null;
			case LogicalPackage.REFERENCE_POINT_PART__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case LogicalPackage.REFERENCE_POINT_PART__VALUE_TYPE_UNIT:
				return valueTypeUnit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ReferencePointPartImpl
