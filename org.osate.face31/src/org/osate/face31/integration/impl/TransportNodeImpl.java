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
package org.osate.face31.integration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.face31.impl.ElementImpl;

import org.osate.face31.integration.IntegrationPackage;
import org.osate.face31.integration.TSNodeInputPort;
import org.osate.face31.integration.TSNodeOutputPort;
import org.osate.face31.integration.TransportNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.integration.impl.TransportNodeImpl#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.osate.face31.integration.impl.TransportNodeImpl#getInPort <em>In Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransportNodeImpl extends ElementImpl implements TransportNode {
	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected TSNodeOutputPort outPort;

	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected EList<TSNodeInputPort> inPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrationPackage.Literals.TRANSPORT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSNodeOutputPort getOutPort() {
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutPort(TSNodeOutputPort newOutPort, NotificationChain msgs) {
		TSNodeOutputPort oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntegrationPackage.TRANSPORT_NODE__OUT_PORT, oldOutPort, newOutPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutPort(TSNodeOutputPort newOutPort) {
		if (newOutPort != outPort) {
			NotificationChain msgs = null;
			if (outPort != null)
				msgs = ((InternalEObject)outPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntegrationPackage.TRANSPORT_NODE__OUT_PORT, null, msgs);
			if (newOutPort != null)
				msgs = ((InternalEObject)newOutPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntegrationPackage.TRANSPORT_NODE__OUT_PORT, null, msgs);
			msgs = basicSetOutPort(newOutPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.TRANSPORT_NODE__OUT_PORT, newOutPort, newOutPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSNodeInputPort> getInPort() {
		if (inPort == null) {
			inPort = new EObjectContainmentEList<TSNodeInputPort>(TSNodeInputPort.class, this, IntegrationPackage.TRANSPORT_NODE__IN_PORT);
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntegrationPackage.TRANSPORT_NODE__OUT_PORT:
				return basicSetOutPort(null, msgs);
			case IntegrationPackage.TRANSPORT_NODE__IN_PORT:
				return ((InternalEList<?>)getInPort()).basicRemove(otherEnd, msgs);
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
			case IntegrationPackage.TRANSPORT_NODE__OUT_PORT:
				return getOutPort();
			case IntegrationPackage.TRANSPORT_NODE__IN_PORT:
				return getInPort();
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
			case IntegrationPackage.TRANSPORT_NODE__OUT_PORT:
				setOutPort((TSNodeOutputPort)newValue);
				return;
			case IntegrationPackage.TRANSPORT_NODE__IN_PORT:
				getInPort().clear();
				getInPort().addAll((Collection<? extends TSNodeInputPort>)newValue);
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
			case IntegrationPackage.TRANSPORT_NODE__OUT_PORT:
				setOutPort((TSNodeOutputPort)null);
				return;
			case IntegrationPackage.TRANSPORT_NODE__IN_PORT:
				getInPort().clear();
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
			case IntegrationPackage.TRANSPORT_NODE__OUT_PORT:
				return outPort != null;
			case IntegrationPackage.TRANSPORT_NODE__IN_PORT:
				return inPort != null && !inPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransportNodeImpl
