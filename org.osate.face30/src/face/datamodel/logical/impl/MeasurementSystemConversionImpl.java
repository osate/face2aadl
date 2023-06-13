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

import face.datamodel.logical.LogicalPackage;
import face.datamodel.logical.MeasurementSystem;
import face.datamodel.logical.MeasurementSystemConversion;

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
 * An implementation of the model object '<em><b>Measurement System Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemConversionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemConversionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemConversionImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link face.datamodel.logical.impl.MeasurementSystemConversionImpl#getConversionLossDescription <em>Conversion Loss Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementSystemConversionImpl extends ElementImpl implements MeasurementSystemConversion {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MeasurementSystem source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected MeasurementSystem target;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementSystemConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.MEASUREMENT_SYSTEM_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystem getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (MeasurementSystem)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystem basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MeasurementSystem newSource) {
		MeasurementSystem oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystem getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (MeasurementSystem)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystem basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(MeasurementSystem newTarget) {
		MeasurementSystem oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEquation() {
		if (equation == null) {
			equation = new EDataTypeUniqueEList<String>(String.class, this, LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__EQUATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION, oldConversionLossDescription, conversionLossDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__EQUATION:
				return getEquation();
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				return getConversionLossDescription();
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
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__SOURCE:
				setSource((MeasurementSystem)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__TARGET:
				setTarget((MeasurementSystem)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__EQUATION:
				getEquation().clear();
				getEquation().addAll((Collection<? extends String>)newValue);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				setConversionLossDescription((String)newValue);
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
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__SOURCE:
				setSource((MeasurementSystem)null);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__TARGET:
				setTarget((MeasurementSystem)null);
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__EQUATION:
				getEquation().clear();
				return;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				setConversionLossDescription(CONVERSION_LOSS_DESCRIPTION_EDEFAULT);
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
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__SOURCE:
				return source != null;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__TARGET:
				return target != null;
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__EQUATION:
				return equation != null && !equation.isEmpty();
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION:
				return CONVERSION_LOSS_DESCRIPTION_EDEFAULT == null ? conversionLossDescription != null : !CONVERSION_LOSS_DESCRIPTION_EDEFAULT.equals(conversionLossDescription);
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

} //MeasurementSystemConversionImpl
