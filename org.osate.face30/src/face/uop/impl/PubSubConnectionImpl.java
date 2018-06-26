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
package face.uop.impl;

import face.datamodel.platform.View;

import face.uop.MessageExchangeType;
import face.uop.PubSubConnection;
import face.uop.UopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pub Sub Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.uop.impl.PubSubConnectionImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link face.uop.impl.PubSubConnectionImpl#getMessageExchangeType <em>Message Exchange Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PubSubConnectionImpl extends ConnectionImpl implements PubSubConnection {
	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected View messageType;

	/**
	 * The default value of the '{@link #getMessageExchangeType() <em>Message Exchange Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangeType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageExchangeType MESSAGE_EXCHANGE_TYPE_EDEFAULT = MessageExchangeType.INBOUND_MESSAGE;

	/**
	 * The cached value of the '{@link #getMessageExchangeType() <em>Message Exchange Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangeType()
	 * @generated
	 * @ordered
	 */
	protected MessageExchangeType messageExchangeType = MESSAGE_EXCHANGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubSubConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.PUB_SUB_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getMessageType() {
		if (messageType != null && messageType.eIsProxy()) {
			InternalEObject oldMessageType = (InternalEObject)messageType;
			messageType = (View)eResolveProxy(oldMessageType);
			if (messageType != oldMessageType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.PUB_SUB_CONNECTION__MESSAGE_TYPE, oldMessageType, messageType));
			}
		}
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(View newMessageType) {
		View oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.PUB_SUB_CONNECTION__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchangeType getMessageExchangeType() {
		return messageExchangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchangeType(MessageExchangeType newMessageExchangeType) {
		MessageExchangeType oldMessageExchangeType = messageExchangeType;
		messageExchangeType = newMessageExchangeType == null ? MESSAGE_EXCHANGE_TYPE_EDEFAULT : newMessageExchangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE, oldMessageExchangeType, messageExchangeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_TYPE:
				if (resolve) return getMessageType();
				return basicGetMessageType();
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE:
				return getMessageExchangeType();
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
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_TYPE:
				setMessageType((View)newValue);
				return;
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE:
				setMessageExchangeType((MessageExchangeType)newValue);
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
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_TYPE:
				setMessageType((View)null);
				return;
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE:
				setMessageExchangeType(MESSAGE_EXCHANGE_TYPE_EDEFAULT);
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
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_TYPE:
				return messageType != null;
			case UopPackage.PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE:
				return messageExchangeType != MESSAGE_EXCHANGE_TYPE_EDEFAULT;
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
		result.append(" (messageExchangeType: ");
		result.append(messageExchangeType);
		result.append(')');
		return result.toString();
	}

} //PubSubConnectionImpl
