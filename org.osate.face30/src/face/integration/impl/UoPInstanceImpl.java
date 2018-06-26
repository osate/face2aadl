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
package face.integration.impl;

import face.integration.IntegrationPackage;
import face.integration.UoPInputEndPoint;
import face.integration.UoPInstance;
import face.integration.UoPOutputEndPoint;

import face.uop.UnitOfPortability;

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
 * An implementation of the model object '<em><b>Uo PInstance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.integration.impl.UoPInstanceImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link face.integration.impl.UoPInstanceImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link face.integration.impl.UoPInstanceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link face.integration.impl.UoPInstanceImpl#getConfigurationURI <em>Configuration URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UoPInstanceImpl extends ElementImpl implements UoPInstance {
	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected UnitOfPortability realizes;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<UoPOutputEndPoint> output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<UoPInputEndPoint> input;

	/**
	 * The default value of the '{@link #getConfigurationURI() <em>Configuration URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationURI() <em>Configuration URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationURI()
	 * @generated
	 * @ordered
	 */
	protected String configurationURI = CONFIGURATION_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoPInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrationPackage.Literals.UO_PINSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfPortability getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (UnitOfPortability)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntegrationPackage.UO_PINSTANCE__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfPortability basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizes(UnitOfPortability newRealizes) {
		UnitOfPortability oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.UO_PINSTANCE__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UoPOutputEndPoint> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<UoPOutputEndPoint>(UoPOutputEndPoint.class, this, IntegrationPackage.UO_PINSTANCE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UoPInputEndPoint> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<UoPInputEndPoint>(UoPInputEndPoint.class, this, IntegrationPackage.UO_PINSTANCE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationURI() {
		return configurationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationURI(String newConfigurationURI) {
		String oldConfigurationURI = configurationURI;
		configurationURI = newConfigurationURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.UO_PINSTANCE__CONFIGURATION_URI, oldConfigurationURI, configurationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntegrationPackage.UO_PINSTANCE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case IntegrationPackage.UO_PINSTANCE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
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
			case IntegrationPackage.UO_PINSTANCE__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case IntegrationPackage.UO_PINSTANCE__OUTPUT:
				return getOutput();
			case IntegrationPackage.UO_PINSTANCE__INPUT:
				return getInput();
			case IntegrationPackage.UO_PINSTANCE__CONFIGURATION_URI:
				return getConfigurationURI();
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
			case IntegrationPackage.UO_PINSTANCE__REALIZES:
				setRealizes((UnitOfPortability)newValue);
				return;
			case IntegrationPackage.UO_PINSTANCE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends UoPOutputEndPoint>)newValue);
				return;
			case IntegrationPackage.UO_PINSTANCE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends UoPInputEndPoint>)newValue);
				return;
			case IntegrationPackage.UO_PINSTANCE__CONFIGURATION_URI:
				setConfigurationURI((String)newValue);
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
			case IntegrationPackage.UO_PINSTANCE__REALIZES:
				setRealizes((UnitOfPortability)null);
				return;
			case IntegrationPackage.UO_PINSTANCE__OUTPUT:
				getOutput().clear();
				return;
			case IntegrationPackage.UO_PINSTANCE__INPUT:
				getInput().clear();
				return;
			case IntegrationPackage.UO_PINSTANCE__CONFIGURATION_URI:
				setConfigurationURI(CONFIGURATION_URI_EDEFAULT);
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
			case IntegrationPackage.UO_PINSTANCE__REALIZES:
				return realizes != null;
			case IntegrationPackage.UO_PINSTANCE__OUTPUT:
				return output != null && !output.isEmpty();
			case IntegrationPackage.UO_PINSTANCE__INPUT:
				return input != null && !input.isEmpty();
			case IntegrationPackage.UO_PINSTANCE__CONFIGURATION_URI:
				return CONFIGURATION_URI_EDEFAULT == null ? configurationURI != null : !CONFIGURATION_URI_EDEFAULT.equals(configurationURI);
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
		result.append(" (configurationURI: ");
		result.append(configurationURI);
		result.append(')');
		return result.toString();
	}

} //UoPInstanceImpl
