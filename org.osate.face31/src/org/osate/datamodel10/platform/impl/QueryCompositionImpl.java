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

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.datamodel10.platform.PlatformPackage;
import org.osate.datamodel10.platform.QueryComposition;
import org.osate.datamodel10.platform.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.platform.impl.QueryCompositionImpl#getRolename <em>Rolename</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.impl.QueryCompositionImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.impl.QueryCompositionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryCompositionImpl extends MinimalEObjectImpl.Container implements QueryComposition {
	/**
	 * The default value of the '{@link #getRolename() <em>Rolename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolename()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLENAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected org.osate.datamodel10.logical.QueryComposition realizes;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected View type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.QUERY_COMPOSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.QUERY_COMPOSITION__ROLENAME, oldRolename, rolename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.logical.QueryComposition getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (org.osate.datamodel10.logical.QueryComposition)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.QUERY_COMPOSITION__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.osate.datamodel10.logical.QueryComposition basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizes(org.osate.datamodel10.logical.QueryComposition newRealizes) {
		org.osate.datamodel10.logical.QueryComposition oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.QUERY_COMPOSITION__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (View)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.QUERY_COMPOSITION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(View newType) {
		View oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.QUERY_COMPOSITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.QUERY_COMPOSITION__ROLENAME:
				return getRolename();
			case PlatformPackage.QUERY_COMPOSITION__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case PlatformPackage.QUERY_COMPOSITION__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case PlatformPackage.QUERY_COMPOSITION__ROLENAME:
				setRolename((String)newValue);
				return;
			case PlatformPackage.QUERY_COMPOSITION__REALIZES:
				setRealizes((org.osate.datamodel10.logical.QueryComposition)newValue);
				return;
			case PlatformPackage.QUERY_COMPOSITION__TYPE:
				setType((View)newValue);
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
			case PlatformPackage.QUERY_COMPOSITION__ROLENAME:
				setRolename(ROLENAME_EDEFAULT);
				return;
			case PlatformPackage.QUERY_COMPOSITION__REALIZES:
				setRealizes((org.osate.datamodel10.logical.QueryComposition)null);
				return;
			case PlatformPackage.QUERY_COMPOSITION__TYPE:
				setType((View)null);
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
			case PlatformPackage.QUERY_COMPOSITION__ROLENAME:
				return ROLENAME_EDEFAULT == null ? rolename != null : !ROLENAME_EDEFAULT.equals(rolename);
			case PlatformPackage.QUERY_COMPOSITION__REALIZES:
				return realizes != null;
			case PlatformPackage.QUERY_COMPOSITION__TYPE:
				return type != null;
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
		result.append(')');
		return result.toString();
	}

} //QueryCompositionImpl
