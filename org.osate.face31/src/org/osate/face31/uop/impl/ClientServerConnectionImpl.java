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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.face31.uop.ClientServerConnection;
import org.osate.face31.uop.ClientServerRole;
import org.osate.face31.uop.MessageType;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Server Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.impl.ClientServerConnectionImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.ClientServerConnectionImpl#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.ClientServerConnectionImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientServerConnectionImpl extends ConnectionImpl implements ClientServerConnection {
	/**
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected MessageType requestType;

	/**
	 * The cached value of the '{@link #getResponseType() <em>Response Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected MessageType responseType;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final ClientServerRole ROLE_EDEFAULT = ClientServerRole.CLIENT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ClientServerRole role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientServerConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.CLIENT_SERVER_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageType getRequestType() {
		if (requestType != null && requestType.eIsProxy()) {
			InternalEObject oldRequestType = (InternalEObject)requestType;
			requestType = (MessageType)eResolveProxy(oldRequestType);
			if (requestType != oldRequestType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.CLIENT_SERVER_CONNECTION__REQUEST_TYPE, oldRequestType, requestType));
			}
		}
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestType(MessageType newRequestType) {
		MessageType oldRequestType = requestType;
		requestType = newRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.CLIENT_SERVER_CONNECTION__REQUEST_TYPE, oldRequestType, requestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageType getResponseType() {
		if (responseType != null && responseType.eIsProxy()) {
			InternalEObject oldResponseType = (InternalEObject)responseType;
			responseType = (MessageType)eResolveProxy(oldResponseType);
			if (responseType != oldResponseType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.CLIENT_SERVER_CONNECTION__RESPONSE_TYPE, oldResponseType, responseType));
			}
		}
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetResponseType() {
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseType(MessageType newResponseType) {
		MessageType oldResponseType = responseType;
		responseType = newResponseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.CLIENT_SERVER_CONNECTION__RESPONSE_TYPE, oldResponseType, responseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClientServerRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(ClientServerRole newRole) {
		ClientServerRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.CLIENT_SERVER_CONNECTION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UopPackage.CLIENT_SERVER_CONNECTION__REQUEST_TYPE:
				if (resolve) return getRequestType();
				return basicGetRequestType();
			case UopPackage.CLIENT_SERVER_CONNECTION__RESPONSE_TYPE:
				if (resolve) return getResponseType();
				return basicGetResponseType();
			case UopPackage.CLIENT_SERVER_CONNECTION__ROLE:
				return getRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UopPackage.CLIENT_SERVER_CONNECTION__REQUEST_TYPE:
				setRequestType((MessageType)newValue);
				return;
			case UopPackage.CLIENT_SERVER_CONNECTION__RESPONSE_TYPE:
				setResponseType((MessageType)newValue);
				return;
			case UopPackage.CLIENT_SERVER_CONNECTION__ROLE:
				setRole((ClientServerRole)newValue);
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
			case UopPackage.CLIENT_SERVER_CONNECTION__REQUEST_TYPE:
				setRequestType((MessageType)null);
				return;
			case UopPackage.CLIENT_SERVER_CONNECTION__RESPONSE_TYPE:
				setResponseType((MessageType)null);
				return;
			case UopPackage.CLIENT_SERVER_CONNECTION__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case UopPackage.CLIENT_SERVER_CONNECTION__REQUEST_TYPE:
				return requestType != null;
			case UopPackage.CLIENT_SERVER_CONNECTION__RESPONSE_TYPE:
				return responseType != null;
			case UopPackage.CLIENT_SERVER_CONNECTION__ROLE:
				return role != ROLE_EDEFAULT;
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
		result.append(" (role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //ClientServerConnectionImpl
