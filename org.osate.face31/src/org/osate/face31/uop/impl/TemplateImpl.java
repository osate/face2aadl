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
package org.osate.face31.uop.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.datamodel10.platform.Query;

import org.osate.face31.uop.Template;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.impl.TemplateImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.TemplateImpl#getBoundQuery <em>Bound Query</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.TemplateImpl#getEffectiveQuery <em>Effective Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateImpl extends MessageTypeImpl implements Template {
	/**
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected String specification = SPECIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoundQuery() <em>Bound Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundQuery()
	 * @generated
	 * @ordered
	 */
	protected Query boundQuery;

	/**
	 * The cached value of the '{@link #getEffectiveQuery() <em>Effective Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveQuery()
	 * @generated
	 * @ordered
	 */
	protected Query effectiveQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification(String newSpecification) {
		String oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.TEMPLATE__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query getBoundQuery() {
		if (boundQuery != null && boundQuery.eIsProxy()) {
			InternalEObject oldBoundQuery = (InternalEObject)boundQuery;
			boundQuery = (Query)eResolveProxy(oldBoundQuery);
			if (boundQuery != oldBoundQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.TEMPLATE__BOUND_QUERY, oldBoundQuery, boundQuery));
			}
		}
		return boundQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query basicGetBoundQuery() {
		return boundQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundQuery(Query newBoundQuery) {
		Query oldBoundQuery = boundQuery;
		boundQuery = newBoundQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.TEMPLATE__BOUND_QUERY, oldBoundQuery, boundQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query getEffectiveQuery() {
		if (effectiveQuery != null && effectiveQuery.eIsProxy()) {
			InternalEObject oldEffectiveQuery = (InternalEObject)effectiveQuery;
			effectiveQuery = (Query)eResolveProxy(oldEffectiveQuery);
			if (effectiveQuery != oldEffectiveQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.TEMPLATE__EFFECTIVE_QUERY, oldEffectiveQuery, effectiveQuery));
			}
		}
		return effectiveQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query basicGetEffectiveQuery() {
		return effectiveQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveQuery(Query newEffectiveQuery) {
		Query oldEffectiveQuery = effectiveQuery;
		effectiveQuery = newEffectiveQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.TEMPLATE__EFFECTIVE_QUERY, oldEffectiveQuery, effectiveQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UopPackage.TEMPLATE__SPECIFICATION:
				return getSpecification();
			case UopPackage.TEMPLATE__BOUND_QUERY:
				if (resolve) return getBoundQuery();
				return basicGetBoundQuery();
			case UopPackage.TEMPLATE__EFFECTIVE_QUERY:
				if (resolve) return getEffectiveQuery();
				return basicGetEffectiveQuery();
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
			case UopPackage.TEMPLATE__SPECIFICATION:
				setSpecification((String)newValue);
				return;
			case UopPackage.TEMPLATE__BOUND_QUERY:
				setBoundQuery((Query)newValue);
				return;
			case UopPackage.TEMPLATE__EFFECTIVE_QUERY:
				setEffectiveQuery((Query)newValue);
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
			case UopPackage.TEMPLATE__SPECIFICATION:
				setSpecification(SPECIFICATION_EDEFAULT);
				return;
			case UopPackage.TEMPLATE__BOUND_QUERY:
				setBoundQuery((Query)null);
				return;
			case UopPackage.TEMPLATE__EFFECTIVE_QUERY:
				setEffectiveQuery((Query)null);
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
			case UopPackage.TEMPLATE__SPECIFICATION:
				return SPECIFICATION_EDEFAULT == null ? specification != null : !SPECIFICATION_EDEFAULT.equals(specification);
			case UopPackage.TEMPLATE__BOUND_QUERY:
				return boundQuery != null;
			case UopPackage.TEMPLATE__EFFECTIVE_QUERY:
				return effectiveQuery != null;
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
		result.append(" (specification: ");
		result.append(specification);
		result.append(')');
		return result.toString();
	}

} //TemplateImpl
