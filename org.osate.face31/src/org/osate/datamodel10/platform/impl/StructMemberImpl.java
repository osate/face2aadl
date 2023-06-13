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
package org.osate.datamodel10.platform.impl;

import java.lang.Float;
import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.datamodel10.logical.MeasurementAttribute;

import org.osate.datamodel10.platform.PlatformDataType;
import org.osate.datamodel10.platform.PlatformPackage;
import org.osate.datamodel10.platform.StructMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.platform.impl.StructMemberImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.impl.StructMemberImpl#getRolename <em>Rolename</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.impl.StructMemberImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.impl.StructMemberImpl#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructMemberImpl extends MinimalEObjectImpl.Container implements StructMember {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PlatformDataType type;

	/**
	 * The default value of the '{@link #getRolename() <em>Rolename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolename()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolename() <em>Rolename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolename()
	 * @generated
	 * @ordered
	 */
	protected String rolename = ROLENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final float PRECISION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected float precision = PRECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected MeasurementAttribute realizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.STRUCT_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (PlatformDataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.STRUCT_MEMBER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PlatformDataType newType) {
		PlatformDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.STRUCT_MEMBER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRolename() {
		return rolename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRolename(String newRolename) {
		String oldRolename = rolename;
		rolename = newRolename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.STRUCT_MEMBER__ROLENAME, oldRolename, rolename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(float newPrecision) {
		float oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.STRUCT_MEMBER__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementAttribute getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (MeasurementAttribute)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.STRUCT_MEMBER__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementAttribute basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizes(MeasurementAttribute newRealizes) {
		MeasurementAttribute oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.STRUCT_MEMBER__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.STRUCT_MEMBER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PlatformPackage.STRUCT_MEMBER__ROLENAME:
				return getRolename();
			case PlatformPackage.STRUCT_MEMBER__PRECISION:
				return getPrecision();
			case PlatformPackage.STRUCT_MEMBER__REALIZES:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.STRUCT_MEMBER__TYPE:
				setType((PlatformDataType)newValue);
				return;
			case PlatformPackage.STRUCT_MEMBER__ROLENAME:
				setRolename((String)newValue);
				return;
			case PlatformPackage.STRUCT_MEMBER__PRECISION:
				setPrecision((Float)newValue);
				return;
			case PlatformPackage.STRUCT_MEMBER__REALIZES:
				setRealizes((MeasurementAttribute)newValue);
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
			case PlatformPackage.STRUCT_MEMBER__TYPE:
				setType((PlatformDataType)null);
				return;
			case PlatformPackage.STRUCT_MEMBER__ROLENAME:
				setRolename(ROLENAME_EDEFAULT);
				return;
			case PlatformPackage.STRUCT_MEMBER__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case PlatformPackage.STRUCT_MEMBER__REALIZES:
				setRealizes((MeasurementAttribute)null);
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
			case PlatformPackage.STRUCT_MEMBER__TYPE:
				return type != null;
			case PlatformPackage.STRUCT_MEMBER__ROLENAME:
				return ROLENAME_EDEFAULT == null ? rolename != null : !ROLENAME_EDEFAULT.equals(rolename);
			case PlatformPackage.STRUCT_MEMBER__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case PlatformPackage.STRUCT_MEMBER__REALIZES:
				return realizes != null;
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
		result.append(" (rolename: ");
		result.append(rolename);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //StructMemberImpl
