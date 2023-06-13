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
package face.datamodel.logical.impl;

import face.datamodel.conceptual.Observable;

import face.datamodel.logical.LogicalPackage;
import face.datamodel.logical.MeasurementAxis;
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
 * An implementation of the model object '<em><b>Measurement Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.impl.MeasurementAxisImpl#getValueTypeUnit <em>Value Type Unit</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementAxisImpl#getMeasurementSystemAxis <em>Measurement System Axis</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementAxisImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementAxisImpl#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementAxisImpl extends ElementImpl implements MeasurementAxis {
	/**
	 * The cached value of the '{@link #getValueTypeUnit() <em>Value Type Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueTypeUnit> valueTypeUnit;

	/**
	 * The cached value of the '{@link #getMeasurementSystemAxis() <em>Measurement System Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementSystemAxis()
	 * @generated
	 * @ordered
	 */
	protected MeasurementSystemAxis measurementSystemAxis;

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
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected Observable realizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.MEASUREMENT_AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueTypeUnit> getValueTypeUnit() {
		if (valueTypeUnit == null) {
			valueTypeUnit = new EObjectResolvingEList<ValueTypeUnit>(ValueTypeUnit.class, this, LogicalPackage.MEASUREMENT_AXIS__VALUE_TYPE_UNIT);
		}
		return valueTypeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystemAxis getMeasurementSystemAxis() {
		if (measurementSystemAxis != null && measurementSystemAxis.eIsProxy()) {
			InternalEObject oldMeasurementSystemAxis = (InternalEObject)measurementSystemAxis;
			measurementSystemAxis = (MeasurementSystemAxis)eResolveProxy(oldMeasurementSystemAxis);
			if (measurementSystemAxis != oldMeasurementSystemAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS, oldMeasurementSystemAxis, measurementSystemAxis));
			}
		}
		return measurementSystemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystemAxis basicGetMeasurementSystemAxis() {
		return measurementSystemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementSystemAxis(MeasurementSystemAxis newMeasurementSystemAxis) {
		MeasurementSystemAxis oldMeasurementSystemAxis = measurementSystemAxis;
		measurementSystemAxis = newMeasurementSystemAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS, oldMeasurementSystemAxis, measurementSystemAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<MeasurementConstraint>(MeasurementConstraint.class, this, LogicalPackage.MEASUREMENT_AXIS__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observable getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (Observable)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_AXIS__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observable basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizes(Observable newRealizes) {
		Observable oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_AXIS__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalPackage.MEASUREMENT_AXIS__CONSTRAINT:
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
			case LogicalPackage.MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
				return getValueTypeUnit();
			case LogicalPackage.MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
				if (resolve) return getMeasurementSystemAxis();
				return basicGetMeasurementSystemAxis();
			case LogicalPackage.MEASUREMENT_AXIS__CONSTRAINT:
				return getConstraint();
			case LogicalPackage.MEASUREMENT_AXIS__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
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
			case LogicalPackage.MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
				getValueTypeUnit().clear();
				getValueTypeUnit().addAll((Collection<? extends ValueTypeUnit>)newValue);
				return;
			case LogicalPackage.MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
				setMeasurementSystemAxis((MeasurementSystemAxis)newValue);
				return;
			case LogicalPackage.MEASUREMENT_AXIS__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends MeasurementConstraint>)newValue);
				return;
			case LogicalPackage.MEASUREMENT_AXIS__REALIZES:
				setRealizes((Observable)newValue);
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
			case LogicalPackage.MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
				getValueTypeUnit().clear();
				return;
			case LogicalPackage.MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
				setMeasurementSystemAxis((MeasurementSystemAxis)null);
				return;
			case LogicalPackage.MEASUREMENT_AXIS__CONSTRAINT:
				getConstraint().clear();
				return;
			case LogicalPackage.MEASUREMENT_AXIS__REALIZES:
				setRealizes((Observable)null);
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
			case LogicalPackage.MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
				return valueTypeUnit != null && !valueTypeUnit.isEmpty();
			case LogicalPackage.MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
				return measurementSystemAxis != null;
			case LogicalPackage.MEASUREMENT_AXIS__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case LogicalPackage.MEASUREMENT_AXIS__REALIZES:
				return realizes != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurementAxisImpl
