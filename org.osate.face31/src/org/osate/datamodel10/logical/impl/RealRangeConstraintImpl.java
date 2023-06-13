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

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.datamodel10.logical.LogicalPackage;
import org.osate.datamodel10.logical.RealRangeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.impl.RealRangeConstraintImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.RealRangeConstraintImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.RealRangeConstraintImpl#isLowerBoundInclusive <em>Lower Bound Inclusive</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.RealRangeConstraintImpl#isUpperBoundInclusive <em>Upper Bound Inclusive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealRangeConstraintImpl extends RealConstraintImpl implements RealRangeConstraint {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_BOUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected float lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final float UPPER_BOUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected float upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isLowerBoundInclusive() <em>Lower Bound Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowerBoundInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOWER_BOUND_INCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLowerBoundInclusive() <em>Lower Bound Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowerBoundInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean lowerBoundInclusive = LOWER_BOUND_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpperBoundInclusive() <em>Upper Bound Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpperBoundInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPPER_BOUND_INCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUpperBoundInclusive() <em>Upper Bound Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpperBoundInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean upperBoundInclusive = UPPER_BOUND_INCLUSIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealRangeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.REAL_RANGE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(float newLowerBound) {
		float oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(float newUpperBound) {
		float oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLowerBoundInclusive() {
		return lowerBoundInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBoundInclusive(boolean newLowerBoundInclusive) {
		boolean oldLowerBoundInclusive = lowerBoundInclusive;
		lowerBoundInclusive = newLowerBoundInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE, oldLowerBoundInclusive, lowerBoundInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUpperBoundInclusive() {
		return upperBoundInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBoundInclusive(boolean newUpperBoundInclusive) {
		boolean oldUpperBoundInclusive = upperBoundInclusive;
		upperBoundInclusive = newUpperBoundInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE, oldUpperBoundInclusive, upperBoundInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND:
				return getLowerBound();
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND:
				return getUpperBound();
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
				return isLowerBoundInclusive();
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
				return isUpperBoundInclusive();
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
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND:
				setLowerBound((Float)newValue);
				return;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND:
				setUpperBound((Float)newValue);
				return;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
				setLowerBoundInclusive((Boolean)newValue);
				return;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
				setUpperBoundInclusive((Boolean)newValue);
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
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
				setLowerBoundInclusive(LOWER_BOUND_INCLUSIVE_EDEFAULT);
				return;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
				setUpperBoundInclusive(UPPER_BOUND_INCLUSIVE_EDEFAULT);
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
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
				return lowerBoundInclusive != LOWER_BOUND_INCLUSIVE_EDEFAULT;
			case LogicalPackage.REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
				return upperBoundInclusive != UPPER_BOUND_INCLUSIVE_EDEFAULT;
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", lowerBoundInclusive: ");
		result.append(lowerBoundInclusive);
		result.append(", upperBoundInclusive: ");
		result.append(upperBoundInclusive);
		result.append(')');
		return result.toString();
	}

} //RealRangeConstraintImpl
