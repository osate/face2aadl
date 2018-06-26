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
package face.datamodel.logical.impl;

import face.datamodel.logical.CoordinateSystemAxis;
import face.datamodel.logical.LogicalPackage;
import face.datamodel.logical.MeasurementConstraint;
import face.datamodel.logical.MeasurementSystemAxis;
import face.datamodel.logical.ValueTypeUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement System Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemAxisImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemAxisImpl#getDefaultValueTypeUnit <em>Default Value Type Unit</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemAxisImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementSystemAxisImpl extends ElementImpl implements MeasurementSystemAxis {
	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected CoordinateSystemAxis axis;

	/**
	 * The cached value of the '{@link #getDefaultValueTypeUnit() <em>Default Value Type Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueTypeUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueTypeUnit> defaultValueTypeUnit;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementConstraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementSystemAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.MEASUREMENT_SYSTEM_AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemAxis getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (CoordinateSystemAxis)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_SYSTEM_AXIS__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemAxis basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(CoordinateSystemAxis newAxis) {
		CoordinateSystemAxis oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_SYSTEM_AXIS__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueTypeUnit> getDefaultValueTypeUnit() {
		if (defaultValueTypeUnit == null) {
			defaultValueTypeUnit = new EObjectResolvingEList<ValueTypeUnit>(ValueTypeUnit.class, this, LogicalPackage.MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT);
		}
		return defaultValueTypeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<MeasurementConstraint>(MeasurementConstraint.class, this, LogicalPackage.MEASUREMENT_SYSTEM_AXIS__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
				return getDefaultValueTypeUnit();
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
				return getConstraint();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__AXIS:
				setAxis((CoordinateSystemAxis)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
				getDefaultValueTypeUnit().clear();
				getDefaultValueTypeUnit().addAll((Collection<? extends ValueTypeUnit>)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends MeasurementConstraint>)newValue);
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
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__AXIS:
				setAxis((CoordinateSystemAxis)null);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
				getDefaultValueTypeUnit().clear();
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
				getConstraint().clear();
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
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__AXIS:
				return axis != null;
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
				return defaultValueTypeUnit != null && !defaultValueTypeUnit.isEmpty();
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementSystemAxisImpl
