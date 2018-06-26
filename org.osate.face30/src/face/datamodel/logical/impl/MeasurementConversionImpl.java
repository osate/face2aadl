/*******************************************************************************
 * FACE Data Model to AADL Translator
 * 
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
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
 * DM18-0762
 *******************************************************************************/
package face.datamodel.logical.impl;

import face.datamodel.logical.LogicalPackage;
import face.datamodel.logical.Measurement;
import face.datamodel.logical.MeasurementConversion;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.impl.MeasurementConversionImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementConversionImpl#getConversionLossDescription <em>Conversion Loss Description</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementConversionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementConversionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementConversionImpl extends ElementImpl implements MeasurementConversion {
	/**
	 * The cached value of the '{@link #getEquation() <em>Equation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> equation;

	/**
	 * The default value of the '{@link #getConversionLossDescription() <em>Conversion Loss Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionLossDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERSION_LOSS_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConversionLossDescription() <em>Conversion Loss Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionLossDescription()
	 * @generated
	 * @ordered
	 */
	protected String conversionLossDescription = CONVERSION_LOSS_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Measurement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Measurement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.MEASUREMENT_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEquation() {
		if (equation == null) {
			equation = new EDataTypeUniqueEList<String>(String.class, this, LogicalPackage.MEASUREMENT_CONVERSION__EQUATION);
		}
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConversionLossDescription() {
		return conversionLossDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionLossDescription(String newConversionLossDescription) {
		String oldConversionLossDescription = conversionLossDescription;
		conversionLossDescription = newConversionLossDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION, oldConversionLossDescription, conversionLossDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Measurement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_CONVERSION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Measurement newSource) {
		Measurement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_CONVERSION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Measurement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_CONVERSION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Measurement newTarget) {
		Measurement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_CONVERSION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalPackage.MEASUREMENT_CONVERSION__EQUATION:
				return getEquation();
			case LogicalPackage.MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				return getConversionLossDescription();
			case LogicalPackage.MEASUREMENT_CONVERSION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case LogicalPackage.MEASUREMENT_CONVERSION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case LogicalPackage.MEASUREMENT_CONVERSION__EQUATION:
				getEquation().clear();
				getEquation().addAll((Collection<? extends String>)newValue);
				return;
			case LogicalPackage.MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				setConversionLossDescription((String)newValue);
				return;
			case LogicalPackage.MEASUREMENT_CONVERSION__SOURCE:
				setSource((Measurement)newValue);
				return;
			case LogicalPackage.MEASUREMENT_CONVERSION__TARGET:
				setTarget((Measurement)newValue);
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
			case LogicalPackage.MEASUREMENT_CONVERSION__EQUATION:
				getEquation().clear();
				return;
			case LogicalPackage.MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				setConversionLossDescription(CONVERSION_LOSS_DESCRIPTION_EDEFAULT);
				return;
			case LogicalPackage.MEASUREMENT_CONVERSION__SOURCE:
				setSource((Measurement)null);
				return;
			case LogicalPackage.MEASUREMENT_CONVERSION__TARGET:
				setTarget((Measurement)null);
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
			case LogicalPackage.MEASUREMENT_CONVERSION__EQUATION:
				return equation != null && !equation.isEmpty();
			case LogicalPackage.MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				return CONVERSION_LOSS_DESCRIPTION_EDEFAULT == null ? conversionLossDescription != null : !CONVERSION_LOSS_DESCRIPTION_EDEFAULT.equals(conversionLossDescription);
			case LogicalPackage.MEASUREMENT_CONVERSION__SOURCE:
				return source != null;
			case LogicalPackage.MEASUREMENT_CONVERSION__TARGET:
				return target != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (equation: ");
		result.append(equation);
		result.append(", conversionLossDescription: ");
		result.append(conversionLossDescription);
		result.append(')');
		return result.toString();
	}

} //MeasurementConversionImpl
