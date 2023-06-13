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
package org.osate.datamodel10.conceptual.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.datamodel10.conceptual.CompositeQuery;
import org.osate.datamodel10.conceptual.ConceptualPackage;
import org.osate.datamodel10.conceptual.QueryComposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.conceptual.impl.CompositeQueryImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.osate.datamodel10.conceptual.impl.CompositeQueryImpl#isIsUnion <em>Is Union</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeQueryImpl extends ElementImpl implements CompositeQuery {
	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryComposition> composition;

	/**
	 * The default value of the '{@link #isIsUnion() <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnion() <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnion = IS_UNION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.COMPOSITE_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QueryComposition> getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList<QueryComposition>(QueryComposition.class, this, ConceptualPackage.COMPOSITE_QUERY__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnion() {
		return isUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnion(boolean newIsUnion) {
		boolean oldIsUnion = isUnion;
		isUnion = newIsUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.COMPOSITE_QUERY__IS_UNION, oldIsUnion, isUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.COMPOSITE_QUERY__COMPOSITION:
				return ((InternalEList<?>)getComposition()).basicRemove(otherEnd, msgs);
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
			case ConceptualPackage.COMPOSITE_QUERY__COMPOSITION:
				return getComposition();
			case ConceptualPackage.COMPOSITE_QUERY__IS_UNION:
				return isIsUnion();
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
			case ConceptualPackage.COMPOSITE_QUERY__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection<? extends QueryComposition>)newValue);
				return;
			case ConceptualPackage.COMPOSITE_QUERY__IS_UNION:
				setIsUnion((Boolean)newValue);
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
			case ConceptualPackage.COMPOSITE_QUERY__COMPOSITION:
				getComposition().clear();
				return;
			case ConceptualPackage.COMPOSITE_QUERY__IS_UNION:
				setIsUnion(IS_UNION_EDEFAULT);
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
			case ConceptualPackage.COMPOSITE_QUERY__COMPOSITION:
				return composition != null && !composition.isEmpty();
			case ConceptualPackage.COMPOSITE_QUERY__IS_UNION:
				return isUnion != IS_UNION_EDEFAULT;
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
		result.append(" (isUnion: ");
		result.append(isUnion);
		result.append(')');
		return result.toString();
	}

} //CompositeQueryImpl
