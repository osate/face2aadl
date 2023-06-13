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

import face.datamodel.logical.CoordinateSystem;
import face.datamodel.logical.LogicalPackage;
import face.datamodel.logical.MeasurementConstraint;
import face.datamodel.logical.MeasurementSystem;
import face.datamodel.logical.MeasurementSystemAxis;
import face.datamodel.logical.ReferencePoint;

import java.lang.String;

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
 * An implementation of the model object '<em><b>Measurement System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemImpl#getMeasurementSystemAxis <em>Measurement System Axis</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemImpl#getReferencePoint <em>Reference Point</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemImpl#getExternalStandardReference <em>External Standard Reference</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementSystemImpl extends AbstractMeasurementSystemImpl implements MeasurementSystem {
	/**
	 * The cached value of the '{@link #getMeasurementSystemAxis() <em>Measurement System Axis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementSystemAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementSystemAxis> measurementSystemAxis;

	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected CoordinateSystem coordinateSystem;

	/**
	 * The cached value of the '{@link #getReferencePoint() <em>Reference Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencePoint> referencePoint;

	/**
	 * The default value of the '{@link #getExternalStandardReference() <em>External Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalStandardReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_STANDARD_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalStandardReference() <em>External Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalStandardReference()
	 * @generated
	 * @ordered
	 */
	protected String externalStandardReference = EXTERNAL_STANDARD_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

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
	protected MeasurementSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.MEASUREMENT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementSystemAxis> getMeasurementSystemAxis() {
		if (measurementSystemAxis == null) {
			measurementSystemAxis = new EObjectResolvingEList<MeasurementSystemAxis>(MeasurementSystemAxis.class, this, LogicalPackage.MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS);
		}
		return measurementSystemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem getCoordinateSystem() {
		if (coordinateSystem != null && coordinateSystem.eIsProxy()) {
			InternalEObject oldCoordinateSystem = (InternalEObject)coordinateSystem;
			coordinateSystem = (CoordinateSystem)eResolveProxy(oldCoordinateSystem);
			if (coordinateSystem != oldCoordinateSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_SYSTEM__COORDINATE_SYSTEM, oldCoordinateSystem, coordinateSystem));
			}
		}
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem basicGetCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSystem(CoordinateSystem newCoordinateSystem) {
		CoordinateSystem oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_SYSTEM__COORDINATE_SYSTEM, oldCoordinateSystem, coordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferencePoint> getReferencePoint() {
		if (referencePoint == null) {
			referencePoint = new EObjectContainmentEList<ReferencePoint>(ReferencePoint.class, this, LogicalPackage.MEASUREMENT_SYSTEM__REFERENCE_POINT);
		}
		return referencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalStandardReference() {
		return externalStandardReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalStandardReference(String newExternalStandardReference) {
		String oldExternalStandardReference = externalStandardReference;
		externalStandardReference = newExternalStandardReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE, oldExternalStandardReference, externalStandardReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		String oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_SYSTEM__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<MeasurementConstraint>(MeasurementConstraint.class, this, LogicalPackage.MEASUREMENT_SYSTEM__CONSTRAINT);
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
			case LogicalPackage.MEASUREMENT_SYSTEM__REFERENCE_POINT:
				return ((InternalEList<?>)getReferencePoint()).basicRemove(otherEnd, msgs);
			case LogicalPackage.MEASUREMENT_SYSTEM__CONSTRAINT:
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
			case LogicalPackage.MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS:
				return getMeasurementSystemAxis();
			case LogicalPackage.MEASUREMENT_SYSTEM__COORDINATE_SYSTEM:
				if (resolve) return getCoordinateSystem();
				return basicGetCoordinateSystem();
			case LogicalPackage.MEASUREMENT_SYSTEM__REFERENCE_POINT:
				return getReferencePoint();
			case LogicalPackage.MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE:
				return getExternalStandardReference();
			case LogicalPackage.MEASUREMENT_SYSTEM__ORIENTATION:
				return getOrientation();
			case LogicalPackage.MEASUREMENT_SYSTEM__CONSTRAINT:
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
			case LogicalPackage.MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS:
				getMeasurementSystemAxis().clear();
				getMeasurementSystemAxis().addAll((Collection<? extends MeasurementSystemAxis>)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__REFERENCE_POINT:
				getReferencePoint().clear();
				getReferencePoint().addAll((Collection<? extends ReferencePoint>)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE:
				setExternalStandardReference((String)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__CONSTRAINT:
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
			case LogicalPackage.MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS:
				getMeasurementSystemAxis().clear();
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)null);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__REFERENCE_POINT:
				getReferencePoint().clear();
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE:
				setExternalStandardReference(EXTERNAL_STANDARD_REFERENCE_EDEFAULT);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM__CONSTRAINT:
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
			case LogicalPackage.MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS:
				return measurementSystemAxis != null && !measurementSystemAxis.isEmpty();
			case LogicalPackage.MEASUREMENT_SYSTEM__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case LogicalPackage.MEASUREMENT_SYSTEM__REFERENCE_POINT:
				return referencePoint != null && !referencePoint.isEmpty();
			case LogicalPackage.MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE:
				return EXTERNAL_STANDARD_REFERENCE_EDEFAULT == null ? externalStandardReference != null : !EXTERNAL_STANDARD_REFERENCE_EDEFAULT.equals(externalStandardReference);
			case LogicalPackage.MEASUREMENT_SYSTEM__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case LogicalPackage.MEASUREMENT_SYSTEM__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (externalStandardReference: ");
		result.append(externalStandardReference);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //MeasurementSystemImpl
