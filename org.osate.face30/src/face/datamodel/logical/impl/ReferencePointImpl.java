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
package face.datamodel.logical.impl;

import face.datamodel.logical.Landmark;
import face.datamodel.logical.LogicalPackage;
import face.datamodel.logical.ReferencePoint;
import face.datamodel.logical.ReferencePointPart;

import face.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Reference Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.impl.ReferencePointImpl#getReferencePointPart <em>Reference Point Part</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.ReferencePointImpl#getLandmark <em>Landmark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencePointImpl extends ElementImpl implements ReferencePoint {
	/**
	 * The cached value of the '{@link #getReferencePointPart() <em>Reference Point Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePointPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencePointPart> referencePointPart;

	/**
	 * The cached value of the '{@link #getLandmark() <em>Landmark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandmark()
	 * @generated
	 * @ordered
	 */
	protected Landmark landmark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.REFERENCE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferencePointPart> getReferencePointPart() {
		if (referencePointPart == null) {
			referencePointPart = new EObjectContainmentEList<ReferencePointPart>(ReferencePointPart.class, this, LogicalPackage.REFERENCE_POINT__REFERENCE_POINT_PART);
		}
		return referencePointPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Landmark getLandmark() {
		if (landmark != null && landmark.eIsProxy()) {
			InternalEObject oldLandmark = (InternalEObject)landmark;
			landmark = (Landmark)eResolveProxy(oldLandmark);
			if (landmark != oldLandmark) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.REFERENCE_POINT__LANDMARK, oldLandmark, landmark));
			}
		}
		return landmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Landmark basicGetLandmark() {
		return landmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandmark(Landmark newLandmark) {
		Landmark oldLandmark = landmark;
		landmark = newLandmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.REFERENCE_POINT__LANDMARK, oldLandmark, landmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalPackage.REFERENCE_POINT__REFERENCE_POINT_PART:
				return ((InternalEList<?>)getReferencePointPart()).basicRemove(otherEnd, msgs);
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
			case LogicalPackage.REFERENCE_POINT__REFERENCE_POINT_PART:
				return getReferencePointPart();
			case LogicalPackage.REFERENCE_POINT__LANDMARK:
				if (resolve) return getLandmark();
				return basicGetLandmark();
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
			case LogicalPackage.REFERENCE_POINT__REFERENCE_POINT_PART:
				getReferencePointPart().clear();
				getReferencePointPart().addAll((Collection<? extends ReferencePointPart>)newValue);
				return;
			case LogicalPackage.REFERENCE_POINT__LANDMARK:
				setLandmark((Landmark)newValue);
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
			case LogicalPackage.REFERENCE_POINT__REFERENCE_POINT_PART:
				getReferencePointPart().clear();
				return;
			case LogicalPackage.REFERENCE_POINT__LANDMARK:
				setLandmark((Landmark)null);
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
			case LogicalPackage.REFERENCE_POINT__REFERENCE_POINT_PART:
				return referencePointPart != null && !referencePointPart.isEmpty();
			case LogicalPackage.REFERENCE_POINT__LANDMARK:
				return landmark != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferencePointImpl
