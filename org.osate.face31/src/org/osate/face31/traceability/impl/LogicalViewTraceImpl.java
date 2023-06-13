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
package org.osate.face31.traceability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.datamodel10.logical.View;

import org.osate.face31.traceability.LogicalViewTrace;
import org.osate.face31.traceability.TraceabilityPackage;
import org.osate.face31.traceability.TraceabilityPoint;
import org.osate.face31.traceability.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical View Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.traceability.impl.LogicalViewTraceImpl#getTraceabilityPoint <em>Traceability Point</em>}</li>
 *   <li>{@link org.osate.face31.traceability.impl.LogicalViewTraceImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalViewTraceImpl extends ElementImpl implements LogicalViewTrace {
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
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalViewTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.LOGICAL_VIEW_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TraceabilityPoint> getTraceabilityPoint() {
		if (traceabilityPoint == null) {
			traceabilityPoint = new EObjectContainmentEList<TraceabilityPoint>(TraceabilityPoint.class, this, TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT);
		}
		return traceabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject)view;
			view = (View)eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.LOGICAL_VIEW_TRACE__VIEW, oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setView(View newView) {
		View oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.LOGICAL_VIEW_TRACE__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT:
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
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT:
				return getTraceabilityPoint();
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__VIEW:
				if (resolve) return getView();
				return basicGetView();
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
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				getTraceabilityPoint().addAll((Collection<? extends TraceabilityPoint>)newValue);
				return;
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__VIEW:
				setView((View)newValue);
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
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				return;
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__VIEW:
				setView((View)null);
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
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT:
				return traceabilityPoint != null && !traceabilityPoint.isEmpty();
			case TraceabilityPackage.LOGICAL_VIEW_TRACE__VIEW:
				return view != null;
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
				case TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT: return TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT;
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
				case TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT: return TraceabilityPackage.LOGICAL_VIEW_TRACE__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LogicalViewTraceImpl
