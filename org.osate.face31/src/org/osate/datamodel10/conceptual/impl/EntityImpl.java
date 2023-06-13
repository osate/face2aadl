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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.datamodel10.conceptual.BasisEntity;
import org.osate.datamodel10.conceptual.Composition;
import org.osate.datamodel10.conceptual.ConceptualPackage;
import org.osate.datamodel10.conceptual.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.conceptual.impl.EntityImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.osate.datamodel10.conceptual.impl.EntityImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.osate.datamodel10.conceptual.impl.EntityImpl#getBasisEntity <em>Basis Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends ComposableElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Composition> composition;

	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected Entity specializes;

	/**
	 * The cached value of the '{@link #getBasisEntity() <em>Basis Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<BasisEntity> basisEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Composition> getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList<Composition>(Composition.class, this, ConceptualPackage.ENTITY__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getSpecializes() {
		if (specializes != null && specializes.eIsProxy()) {
			InternalEObject oldSpecializes = (InternalEObject)specializes;
			specializes = (Entity)eResolveProxy(oldSpecializes);
			if (specializes != oldSpecializes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConceptualPackage.ENTITY__SPECIALIZES, oldSpecializes, specializes));
			}
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSpecializes() {
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializes(Entity newSpecializes) {
		Entity oldSpecializes = specializes;
		specializes = newSpecializes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.ENTITY__SPECIALIZES, oldSpecializes, specializes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasisEntity> getBasisEntity() {
		if (basisEntity == null) {
			basisEntity = new EObjectResolvingEList<BasisEntity>(BasisEntity.class, this, ConceptualPackage.ENTITY__BASIS_ENTITY);
		}
		return basisEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.ENTITY__COMPOSITION:
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
			case ConceptualPackage.ENTITY__COMPOSITION:
				return getComposition();
			case ConceptualPackage.ENTITY__SPECIALIZES:
				if (resolve) return getSpecializes();
				return basicGetSpecializes();
			case ConceptualPackage.ENTITY__BASIS_ENTITY:
				return getBasisEntity();
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
			case ConceptualPackage.ENTITY__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection<? extends Composition>)newValue);
				return;
			case ConceptualPackage.ENTITY__SPECIALIZES:
				setSpecializes((Entity)newValue);
				return;
			case ConceptualPackage.ENTITY__BASIS_ENTITY:
				getBasisEntity().clear();
				getBasisEntity().addAll((Collection<? extends BasisEntity>)newValue);
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
			case ConceptualPackage.ENTITY__COMPOSITION:
				getComposition().clear();
				return;
			case ConceptualPackage.ENTITY__SPECIALIZES:
				setSpecializes((Entity)null);
				return;
			case ConceptualPackage.ENTITY__BASIS_ENTITY:
				getBasisEntity().clear();
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
			case ConceptualPackage.ENTITY__COMPOSITION:
				return composition != null && !composition.isEmpty();
			case ConceptualPackage.ENTITY__SPECIALIZES:
				return specializes != null;
			case ConceptualPackage.ENTITY__BASIS_ENTITY:
				return basisEntity != null && !basisEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
