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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.datamodel10.logical.CoordinateSystem;
import org.osate.datamodel10.logical.CoordinateSystemAxis;
import org.osate.datamodel10.logical.LogicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.impl.CoordinateSystemImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.CoordinateSystemImpl#getAxisRelationshipDescription <em>Axis Relationship Description</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.CoordinateSystemImpl#getAngleEquation <em>Angle Equation</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.CoordinateSystemImpl#getDistanceEquation <em>Distance Equation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinateSystemImpl extends ElementImpl implements CoordinateSystem {
	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateSystemAxis> axis;

	/**
	 * The default value of the '{@link #getAxisRelationshipDescription() <em>Axis Relationship Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisRelationshipDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxisRelationshipDescription() <em>Axis Relationship Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisRelationshipDescription()
	 * @generated
	 * @ordered
	 */
	protected String axisRelationshipDescription = AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngleEquation() <em>Angle Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleEquation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANGLE_EQUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngleEquation() <em>Angle Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleEquation()
	 * @generated
	 * @ordered
	 */
	protected String angleEquation = ANGLE_EQUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceEquation() <em>Distance Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEquation()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_EQUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceEquation() <em>Distance Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEquation()
	 * @generated
	 * @ordered
	 */
	protected String distanceEquation = DISTANCE_EQUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.COORDINATE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoordinateSystemAxis> getAxis() {
		if (axis == null) {
			axis = new EObjectResolvingEList<CoordinateSystemAxis>(CoordinateSystemAxis.class, this, LogicalPackage.COORDINATE_SYSTEM__AXIS);
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAxisRelationshipDescription() {
		return axisRelationshipDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxisRelationshipDescription(String newAxisRelationshipDescription) {
		String oldAxisRelationshipDescription = axisRelationshipDescription;
		axisRelationshipDescription = newAxisRelationshipDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION, oldAxisRelationshipDescription, axisRelationshipDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAngleEquation() {
		return angleEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngleEquation(String newAngleEquation) {
		String oldAngleEquation = angleEquation;
		angleEquation = newAngleEquation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.COORDINATE_SYSTEM__ANGLE_EQUATION, oldAngleEquation, angleEquation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistanceEquation() {
		return distanceEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistanceEquation(String newDistanceEquation) {
		String oldDistanceEquation = distanceEquation;
		distanceEquation = newDistanceEquation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.COORDINATE_SYSTEM__DISTANCE_EQUATION, oldDistanceEquation, distanceEquation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalPackage.COORDINATE_SYSTEM__AXIS:
				return getAxis();
			case LogicalPackage.COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
				return getAxisRelationshipDescription();
			case LogicalPackage.COORDINATE_SYSTEM__ANGLE_EQUATION:
				return getAngleEquation();
			case LogicalPackage.COORDINATE_SYSTEM__DISTANCE_EQUATION:
				return getDistanceEquation();
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
			case LogicalPackage.COORDINATE_SYSTEM__AXIS:
				getAxis().clear();
				getAxis().addAll((Collection<? extends CoordinateSystemAxis>)newValue);
				return;
			case LogicalPackage.COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
				setAxisRelationshipDescription((String)newValue);
				return;
			case LogicalPackage.COORDINATE_SYSTEM__ANGLE_EQUATION:
				setAngleEquation((String)newValue);
				return;
			case LogicalPackage.COORDINATE_SYSTEM__DISTANCE_EQUATION:
				setDistanceEquation((String)newValue);
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
			case LogicalPackage.COORDINATE_SYSTEM__AXIS:
				getAxis().clear();
				return;
			case LogicalPackage.COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
				setAxisRelationshipDescription(AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT);
				return;
			case LogicalPackage.COORDINATE_SYSTEM__ANGLE_EQUATION:
				setAngleEquation(ANGLE_EQUATION_EDEFAULT);
				return;
			case LogicalPackage.COORDINATE_SYSTEM__DISTANCE_EQUATION:
				setDistanceEquation(DISTANCE_EQUATION_EDEFAULT);
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
			case LogicalPackage.COORDINATE_SYSTEM__AXIS:
				return axis != null && !axis.isEmpty();
			case LogicalPackage.COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
				return AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT == null ? axisRelationshipDescription != null : !AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT.equals(axisRelationshipDescription);
			case LogicalPackage.COORDINATE_SYSTEM__ANGLE_EQUATION:
				return ANGLE_EQUATION_EDEFAULT == null ? angleEquation != null : !ANGLE_EQUATION_EDEFAULT.equals(angleEquation);
			case LogicalPackage.COORDINATE_SYSTEM__DISTANCE_EQUATION:
				return DISTANCE_EQUATION_EDEFAULT == null ? distanceEquation != null : !DISTANCE_EQUATION_EDEFAULT.equals(distanceEquation);
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
		result.append(" (axisRelationshipDescription: ");
		result.append(axisRelationshipDescription);
		result.append(", angleEquation: ");
		result.append(angleEquation);
		result.append(", distanceEquation: ");
		result.append(distanceEquation);
		result.append(')');
		return result.toString();
	}

} //CoordinateSystemImpl
