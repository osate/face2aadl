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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.datamodel10.logical.CompositeQuery;

import org.osate.face31.traceability.TraceabilityPackage;
import org.osate.face31.traceability.TraceabilityPoint;
import org.osate.face31.traceability.TraceableElement;

import org.osate.face31.uop.CompositeTemplate;
import org.osate.face31.uop.MessageType;
import org.osate.face31.uop.TemplateComposition;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.impl.CompositeTemplateImpl#getTraceabilityPoint <em>Traceability Point</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.CompositeTemplateImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.CompositeTemplateImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.CompositeTemplateImpl#isIsUnion <em>Is Union</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeTemplateImpl extends ElementImpl implements CompositeTemplate {
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
	protected EList<TemplateComposition> composition;

	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected CompositeQuery realizes;

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
	protected CompositeTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.COMPOSITE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TraceabilityPoint> getTraceabilityPoint() {
		if (traceabilityPoint == null) {
			traceabilityPoint = new EObjectContainmentEList<TraceabilityPoint>(TraceabilityPoint.class, this, UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT);
		}
		return traceabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateComposition> getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList<TemplateComposition>(TemplateComposition.class, this, UopPackage.COMPOSITE_TEMPLATE__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeQuery getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (CompositeQuery)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.COMPOSITE_TEMPLATE__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeQuery basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizes(CompositeQuery newRealizes) {
		CompositeQuery oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.COMPOSITE_TEMPLATE__REALIZES, oldRealizes, realizes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.COMPOSITE_TEMPLATE__IS_UNION, oldIsUnion, isUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT:
				return ((InternalEList<?>)getTraceabilityPoint()).basicRemove(otherEnd, msgs);
			case UopPackage.COMPOSITE_TEMPLATE__COMPOSITION:
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
			case UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT:
				return getTraceabilityPoint();
			case UopPackage.COMPOSITE_TEMPLATE__COMPOSITION:
				return getComposition();
			case UopPackage.COMPOSITE_TEMPLATE__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case UopPackage.COMPOSITE_TEMPLATE__IS_UNION:
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
			case UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				getTraceabilityPoint().addAll((Collection<? extends TraceabilityPoint>)newValue);
				return;
			case UopPackage.COMPOSITE_TEMPLATE__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection<? extends TemplateComposition>)newValue);
				return;
			case UopPackage.COMPOSITE_TEMPLATE__REALIZES:
				setRealizes((CompositeQuery)newValue);
				return;
			case UopPackage.COMPOSITE_TEMPLATE__IS_UNION:
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
			case UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				return;
			case UopPackage.COMPOSITE_TEMPLATE__COMPOSITION:
				getComposition().clear();
				return;
			case UopPackage.COMPOSITE_TEMPLATE__REALIZES:
				setRealizes((CompositeQuery)null);
				return;
			case UopPackage.COMPOSITE_TEMPLATE__IS_UNION:
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
			case UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT:
				return traceabilityPoint != null && !traceabilityPoint.isEmpty();
			case UopPackage.COMPOSITE_TEMPLATE__COMPOSITION:
				return composition != null && !composition.isEmpty();
			case UopPackage.COMPOSITE_TEMPLATE__REALIZES:
				return realizes != null;
			case UopPackage.COMPOSITE_TEMPLATE__IS_UNION:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT: return TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		if (baseClass == MessageType.class) {
			switch (derivedFeatureID) {
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
				case TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT: return UopPackage.COMPOSITE_TEMPLATE__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		if (baseClass == MessageType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //CompositeTemplateImpl
