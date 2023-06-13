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

import org.osate.datamodel10.conceptual.Observable;

import org.osate.datamodel10.logical.AbstractMeasurementSystem;
import org.osate.datamodel10.logical.LogicalPackage;
import org.osate.datamodel10.logical.Measurement;
import org.osate.datamodel10.logical.MeasurementAttribute;
import org.osate.datamodel10.logical.MeasurementAxis;
import org.osate.datamodel10.logical.MeasurementConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.impl.MeasurementImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.MeasurementImpl#getMeasurementAxis <em>Measurement Axis</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.MeasurementImpl#getMeasurementSystem <em>Measurement System</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.MeasurementImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.MeasurementImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementImpl extends ComposableElementImpl implements Measurement {
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
	 * The cached value of the '{@link #getMeasurementAxis() <em>Measurement Axis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementAxis> measurementAxis;

	/**
	 * The cached value of the '{@link #getMeasurementSystem() <em>Measurement System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementSystem()
	 * @generated
	 * @ordered
	 */
	protected AbstractMeasurementSystem measurementSystem;

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementAttribute> attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasurementConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<MeasurementConstraint>(MeasurementConstraint.class, this, LogicalPackage.MEASUREMENT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasurementAxis> getMeasurementAxis() {
		if (measurementAxis == null) {
			measurementAxis = new EObjectResolvingEList<MeasurementAxis>(MeasurementAxis.class, this, LogicalPackage.MEASUREMENT__MEASUREMENT_AXIS);
		}
		return measurementAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMeasurementSystem getMeasurementSystem() {
		if (measurementSystem != null && measurementSystem.eIsProxy()) {
			InternalEObject oldMeasurementSystem = (InternalEObject)measurementSystem;
			measurementSystem = (AbstractMeasurementSystem)eResolveProxy(oldMeasurementSystem);
			if (measurementSystem != oldMeasurementSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT__MEASUREMENT_SYSTEM, oldMeasurementSystem, measurementSystem));
			}
		}
		return measurementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMeasurementSystem basicGetMeasurementSystem() {
		return measurementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasurementSystem(AbstractMeasurementSystem newMeasurementSystem) {
		AbstractMeasurementSystem oldMeasurementSystem = measurementSystem;
		measurementSystem = newMeasurementSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT__MEASUREMENT_SYSTEM, oldMeasurementSystem, measurementSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observable getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (Observable)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT__REALIZES, oldRealizes, realizes));
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
	@Override
	public void setRealizes(Observable newRealizes) {
		Observable oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasurementAttribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<MeasurementAttribute>(MeasurementAttribute.class, this, LogicalPackage.MEASUREMENT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalPackage.MEASUREMENT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case LogicalPackage.MEASUREMENT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case LogicalPackage.MEASUREMENT__CONSTRAINT:
				return getConstraint();
			case LogicalPackage.MEASUREMENT__MEASUREMENT_AXIS:
				return getMeasurementAxis();
			case LogicalPackage.MEASUREMENT__MEASUREMENT_SYSTEM:
				if (resolve) return getMeasurementSystem();
				return basicGetMeasurementSystem();
			case LogicalPackage.MEASUREMENT__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case LogicalPackage.MEASUREMENT__ATTRIBUTE:
				return getAttribute();
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
			case LogicalPackage.MEASUREMENT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends MeasurementConstraint>)newValue);
				return;
			case LogicalPackage.MEASUREMENT__MEASUREMENT_AXIS:
				getMeasurementAxis().clear();
				getMeasurementAxis().addAll((Collection<? extends MeasurementAxis>)newValue);
				return;
			case LogicalPackage.MEASUREMENT__MEASUREMENT_SYSTEM:
				setMeasurementSystem((AbstractMeasurementSystem)newValue);
				return;
			case LogicalPackage.MEASUREMENT__REALIZES:
				setRealizes((Observable)newValue);
				return;
			case LogicalPackage.MEASUREMENT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends MeasurementAttribute>)newValue);
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
			case LogicalPackage.MEASUREMENT__CONSTRAINT:
				getConstraint().clear();
				return;
			case LogicalPackage.MEASUREMENT__MEASUREMENT_AXIS:
				getMeasurementAxis().clear();
				return;
			case LogicalPackage.MEASUREMENT__MEASUREMENT_SYSTEM:
				setMeasurementSystem((AbstractMeasurementSystem)null);
				return;
			case LogicalPackage.MEASUREMENT__REALIZES:
				setRealizes((Observable)null);
				return;
			case LogicalPackage.MEASUREMENT__ATTRIBUTE:
				getAttribute().clear();
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
			case LogicalPackage.MEASUREMENT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case LogicalPackage.MEASUREMENT__MEASUREMENT_AXIS:
				return measurementAxis != null && !measurementAxis.isEmpty();
			case LogicalPackage.MEASUREMENT__MEASUREMENT_SYSTEM:
				return measurementSystem != null;
			case LogicalPackage.MEASUREMENT__REALIZES:
				return realizes != null;
			case LogicalPackage.MEASUREMENT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementImpl
