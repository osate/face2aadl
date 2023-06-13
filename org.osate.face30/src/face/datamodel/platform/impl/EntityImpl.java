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
package face.datamodel.platform.impl;

import face.datamodel.platform.Composition;
import face.datamodel.platform.Entity;
import face.datamodel.platform.PlatformPackage;

import face.traceability.TraceabilityPackage;
import face.traceability.TraceabilityPoint;
import face.traceability.TraceableElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.platform.impl.EntityImpl#getTraceabilityPoint <em>Traceability Point</em>}</li>
 *   <li>{@link face.datamodel.platform.impl.EntityImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link face.datamodel.platform.impl.EntityImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link face.datamodel.platform.impl.EntityImpl#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends ComposableElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getTraceabilityPoint() <em>Traceability Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceabilityPoint> traceabilityPoint;

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
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected face.datamodel.logical.Entity realizes;

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
		return PlatformPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceabilityPoint> getTraceabilityPoint() {
		if (traceabilityPoint == null) {
			traceabilityPoint = new EObjectContainmentEList<TraceabilityPoint>(TraceabilityPoint.class, this, PlatformPackage.ENTITY__TRACEABILITY_POINT);
		}
		return traceabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList<Composition>(Composition.class, this, PlatformPackage.ENTITY__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.logical.Entity getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (face.datamodel.logical.Entity)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.ENTITY__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.logical.Entity basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizes(face.datamodel.logical.Entity newRealizes) {
		face.datamodel.logical.Entity oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ENTITY__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSpecializes() {
		if (specializes != null && specializes.eIsProxy()) {
			InternalEObject oldSpecializes = (InternalEObject)specializes;
			specializes = (Entity)eResolveProxy(oldSpecializes);
			if (specializes != oldSpecializes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.ENTITY__SPECIALIZES, oldSpecializes, specializes));
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
	public void setSpecializes(Entity newSpecializes) {
		Entity oldSpecializes = specializes;
		specializes = newSpecializes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ENTITY__SPECIALIZES, oldSpecializes, specializes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.ENTITY__TRACEABILITY_POINT:
				return ((InternalEList<?>)getTraceabilityPoint()).basicRemove(otherEnd, msgs);
			case PlatformPackage.ENTITY__COMPOSITION:
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
			case PlatformPackage.ENTITY__TRACEABILITY_POINT:
				return getTraceabilityPoint();
			case PlatformPackage.ENTITY__COMPOSITION:
				return getComposition();
			case PlatformPackage.ENTITY__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case PlatformPackage.ENTITY__SPECIALIZES:
				if (resolve) return getSpecializes();
				return basicGetSpecializes();
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
			case PlatformPackage.ENTITY__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				getTraceabilityPoint().addAll((Collection<? extends TraceabilityPoint>)newValue);
				return;
			case PlatformPackage.ENTITY__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection<? extends Composition>)newValue);
				return;
			case PlatformPackage.ENTITY__REALIZES:
				setRealizes((face.datamodel.logical.Entity)newValue);
				return;
			case PlatformPackage.ENTITY__SPECIALIZES:
				setSpecializes((Entity)newValue);
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
			case PlatformPackage.ENTITY__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				return;
			case PlatformPackage.ENTITY__COMPOSITION:
				getComposition().clear();
				return;
			case PlatformPackage.ENTITY__REALIZES:
				setRealizes((face.datamodel.logical.Entity)null);
				return;
			case PlatformPackage.ENTITY__SPECIALIZES:
				setSpecializes((Entity)null);
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
			case PlatformPackage.ENTITY__TRACEABILITY_POINT:
				return traceabilityPoint != null && !traceabilityPoint.isEmpty();
			case PlatformPackage.ENTITY__COMPOSITION:
				return composition != null && !composition.isEmpty();
			case PlatformPackage.ENTITY__REALIZES:
				return realizes != null;
			case PlatformPackage.ENTITY__SPECIALIZES:
				return specializes != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case PlatformPackage.ENTITY__TRACEABILITY_POINT: return TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				case TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT: return PlatformPackage.ENTITY__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntityImpl
