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
package org.osate.datamodel10.logical.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.datamodel10.logical.Enumerated;
import org.osate.datamodel10.logical.EnumerationLabel;
import org.osate.datamodel10.logical.LogicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.impl.EnumeratedImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.impl.EnumeratedImpl#getStandardReference <em>Standard Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratedImpl extends ValueTypeImpl implements Enumerated {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLabel> label;

	/**
	 * The default value of the '{@link #getStandardReference() <em>Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardReference()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardReference() <em>Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardReference()
	 * @generated
	 * @ordered
	 */
	protected String standardReference = STANDARD_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.ENUMERATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationLabel> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<EnumerationLabel>(EnumerationLabel.class, this, LogicalPackage.ENUMERATED__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardReference() {
		return standardReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardReference(String newStandardReference) {
		String oldStandardReference = standardReference;
		standardReference = newStandardReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.ENUMERATED__STANDARD_REFERENCE, oldStandardReference, standardReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalPackage.ENUMERATED__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
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
			case LogicalPackage.ENUMERATED__LABEL:
				return getLabel();
			case LogicalPackage.ENUMERATED__STANDARD_REFERENCE:
				return getStandardReference();
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
			case LogicalPackage.ENUMERATED__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends EnumerationLabel>)newValue);
				return;
			case LogicalPackage.ENUMERATED__STANDARD_REFERENCE:
				setStandardReference((String)newValue);
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
			case LogicalPackage.ENUMERATED__LABEL:
				getLabel().clear();
				return;
			case LogicalPackage.ENUMERATED__STANDARD_REFERENCE:
				setStandardReference(STANDARD_REFERENCE_EDEFAULT);
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
			case LogicalPackage.ENUMERATED__LABEL:
				return label != null && !label.isEmpty();
			case LogicalPackage.ENUMERATED__STANDARD_REFERENCE:
				return STANDARD_REFERENCE_EDEFAULT == null ? standardReference != null : !STANDARD_REFERENCE_EDEFAULT.equals(standardReference);
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
		result.append(" (standardReference: ");
		result.append(standardReference);
		result.append(')');
		return result.toString();
	}

} //EnumeratedImpl
