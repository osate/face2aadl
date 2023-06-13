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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.face31.traceability.TraceabilityPackage;
import org.osate.face31.traceability.TraceabilityPoint;
import org.osate.face31.traceability.TraceableElement;
import org.osate.face31.traceability.UoPTraceabilitySet;

import org.osate.face31.uop.AbstractUoP;
import org.osate.face31.uop.UnitOfPortability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uo PTraceability Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.traceability.impl.UoPTraceabilitySetImpl#getTraceabilityPoint <em>Traceability Point</em>}</li>
 *   <li>{@link org.osate.face31.traceability.impl.UoPTraceabilitySetImpl#getUop <em>Uop</em>}</li>
 *   <li>{@link org.osate.face31.traceability.impl.UoPTraceabilitySetImpl#getAbstractUoP <em>Abstract Uo P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UoPTraceabilitySetImpl extends ElementImpl implements UoPTraceabilitySet {
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
	 * The cached value of the '{@link #getUop() <em>Uop</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUop()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitOfPortability> uop;

	/**
	 * The cached value of the '{@link #getAbstractUoP() <em>Abstract Uo P</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractUoP()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUoP> abstractUoP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoPTraceabilitySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.UO_PTRACEABILITY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TraceabilityPoint> getTraceabilityPoint() {
		if (traceabilityPoint == null) {
			traceabilityPoint = new EObjectContainmentEList<TraceabilityPoint>(TraceabilityPoint.class, this, TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT);
		}
		return traceabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnitOfPortability> getUop() {
		if (uop == null) {
			uop = new EObjectResolvingEList<UnitOfPortability>(UnitOfPortability.class, this, TraceabilityPackage.UO_PTRACEABILITY_SET__UOP);
		}
		return uop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractUoP> getAbstractUoP() {
		if (abstractUoP == null) {
			abstractUoP = new EObjectResolvingEList<AbstractUoP>(AbstractUoP.class, this, TraceabilityPackage.UO_PTRACEABILITY_SET__ABSTRACT_UO_P);
		}
		return abstractUoP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT:
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
			case TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT:
				return getTraceabilityPoint();
			case TraceabilityPackage.UO_PTRACEABILITY_SET__UOP:
				return getUop();
			case TraceabilityPackage.UO_PTRACEABILITY_SET__ABSTRACT_UO_P:
				return getAbstractUoP();
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
			case TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				getTraceabilityPoint().addAll((Collection<? extends TraceabilityPoint>)newValue);
				return;
			case TraceabilityPackage.UO_PTRACEABILITY_SET__UOP:
				getUop().clear();
				getUop().addAll((Collection<? extends UnitOfPortability>)newValue);
				return;
			case TraceabilityPackage.UO_PTRACEABILITY_SET__ABSTRACT_UO_P:
				getAbstractUoP().clear();
				getAbstractUoP().addAll((Collection<? extends AbstractUoP>)newValue);
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
			case TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				return;
			case TraceabilityPackage.UO_PTRACEABILITY_SET__UOP:
				getUop().clear();
				return;
			case TraceabilityPackage.UO_PTRACEABILITY_SET__ABSTRACT_UO_P:
				getAbstractUoP().clear();
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
			case TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT:
				return traceabilityPoint != null && !traceabilityPoint.isEmpty();
			case TraceabilityPackage.UO_PTRACEABILITY_SET__UOP:
				return uop != null && !uop.isEmpty();
			case TraceabilityPackage.UO_PTRACEABILITY_SET__ABSTRACT_UO_P:
				return abstractUoP != null && !abstractUoP.isEmpty();
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
				case TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT: return TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT;
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
				case TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT: return TraceabilityPackage.UO_PTRACEABILITY_SET__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UoPTraceabilitySetImpl
