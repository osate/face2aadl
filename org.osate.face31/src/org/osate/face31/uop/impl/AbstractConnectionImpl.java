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

import org.osate.datamodel10.conceptual.View;

import org.osate.face31.impl.ElementImpl;

import org.osate.face31.traceability.TraceabilityPackage;
import org.osate.face31.traceability.TraceabilityPoint;
import org.osate.face31.traceability.TraceableElement;

import org.osate.face31.uop.AbstractConnection;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.impl.AbstractConnectionImpl#getTraceabilityPoint <em>Traceability Point</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.AbstractConnectionImpl#getConceptualView <em>Conceptual View</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.AbstractConnectionImpl#getLogicalView <em>Logical View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractConnectionImpl extends ElementImpl implements AbstractConnection {
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
	 * The cached value of the '{@link #getConceptualView() <em>Conceptual View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualView()
	 * @generated
	 * @ordered
	 */
	protected View conceptualView;

	/**
	 * The cached value of the '{@link #getLogicalView() <em>Logical View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalView()
	 * @generated
	 * @ordered
	 */
	protected org.osate.datamodel10.logical.View logicalView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.ABSTRACT_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TraceabilityPoint> getTraceabilityPoint() {
		if (traceabilityPoint == null) {
			traceabilityPoint = new EObjectContainmentEList<TraceabilityPoint>(TraceabilityPoint.class, this, UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT);
		}
		return traceabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View getConceptualView() {
		if (conceptualView != null && conceptualView.eIsProxy()) {
			InternalEObject oldConceptualView = (InternalEObject)conceptualView;
			conceptualView = (View)eResolveProxy(oldConceptualView);
			if (conceptualView != oldConceptualView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.ABSTRACT_CONNECTION__CONCEPTUAL_VIEW, oldConceptualView, conceptualView));
			}
		}
		return conceptualView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetConceptualView() {
		return conceptualView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConceptualView(View newConceptualView) {
		View oldConceptualView = conceptualView;
		conceptualView = newConceptualView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.ABSTRACT_CONNECTION__CONCEPTUAL_VIEW, oldConceptualView, conceptualView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.logical.View getLogicalView() {
		if (logicalView != null && logicalView.eIsProxy()) {
			InternalEObject oldLogicalView = (InternalEObject)logicalView;
			logicalView = (org.osate.datamodel10.logical.View)eResolveProxy(oldLogicalView);
			if (logicalView != oldLogicalView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.ABSTRACT_CONNECTION__LOGICAL_VIEW, oldLogicalView, logicalView));
			}
		}
		return logicalView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.osate.datamodel10.logical.View basicGetLogicalView() {
		return logicalView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalView(org.osate.datamodel10.logical.View newLogicalView) {
		org.osate.datamodel10.logical.View oldLogicalView = logicalView;
		logicalView = newLogicalView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.ABSTRACT_CONNECTION__LOGICAL_VIEW, oldLogicalView, logicalView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT:
				return ((InternalEList<?>)getTraceabilityPoint()).basicRemove(otherEnd, msgs);
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
			case UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT:
				return getTraceabilityPoint();
			case UopPackage.ABSTRACT_CONNECTION__CONCEPTUAL_VIEW:
				if (resolve) return getConceptualView();
				return basicGetConceptualView();
			case UopPackage.ABSTRACT_CONNECTION__LOGICAL_VIEW:
				if (resolve) return getLogicalView();
				return basicGetLogicalView();
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
			case UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				getTraceabilityPoint().addAll((Collection<? extends TraceabilityPoint>)newValue);
				return;
			case UopPackage.ABSTRACT_CONNECTION__CONCEPTUAL_VIEW:
				setConceptualView((View)newValue);
				return;
			case UopPackage.ABSTRACT_CONNECTION__LOGICAL_VIEW:
				setLogicalView((org.osate.datamodel10.logical.View)newValue);
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
			case UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				return;
			case UopPackage.ABSTRACT_CONNECTION__CONCEPTUAL_VIEW:
				setConceptualView((View)null);
				return;
			case UopPackage.ABSTRACT_CONNECTION__LOGICAL_VIEW:
				setLogicalView((org.osate.datamodel10.logical.View)null);
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
			case UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT:
				return traceabilityPoint != null && !traceabilityPoint.isEmpty();
			case UopPackage.ABSTRACT_CONNECTION__CONCEPTUAL_VIEW:
				return conceptualView != null;
			case UopPackage.ABSTRACT_CONNECTION__LOGICAL_VIEW:
				return logicalView != null;
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
				case UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT: return TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT;
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
				case TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT: return UopPackage.ABSTRACT_CONNECTION__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractConnectionImpl
