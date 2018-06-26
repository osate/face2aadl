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

import face.uop.LifeCycleManagementPort;
import face.uop.MessageExchangeType;
import face.uop.UopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Cycle Management Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.uop.impl.LifeCycleManagementPortImpl#getMessageExchangeType <em>Message Exchange Type</em>}</li>
 *   <li>{@link face.uop.impl.LifeCycleManagementPortImpl#getLcmMessageType <em>Lcm Message Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifeCycleManagementPortImpl extends MinimalEObjectImpl.Container implements LifeCycleManagementPort {
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
	 * The cached value of the '{@link #getLcmMessageType() <em>Lcm Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcmMessageType()
	 * @generated
	 * @ordered
	 */
	protected View lcmMessageType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeCycleManagementPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.LIFE_CYCLE_MANAGEMENT_PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE, oldMessageExchangeType, messageExchangeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLcmMessageType() {
		if (lcmMessageType != null && lcmMessageType.eIsProxy()) {
			InternalEObject oldLcmMessageType = (InternalEObject)lcmMessageType;
			lcmMessageType = (View)eResolveProxy(oldLcmMessageType);
			if (lcmMessageType != oldLcmMessageType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE, oldLcmMessageType, lcmMessageType));
			}
		}
		return lcmMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLcmMessageType() {
		return lcmMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLcmMessageType(View newLcmMessageType) {
		View oldLcmMessageType = lcmMessageType;
		lcmMessageType = newLcmMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE, oldLcmMessageType, lcmMessageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE:
				return getMessageExchangeType();
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE:
				if (resolve) return getLcmMessageType();
				return basicGetLcmMessageType();
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
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE:
				setMessageExchangeType((MessageExchangeType)newValue);
				return;
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE:
				setLcmMessageType((View)newValue);
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
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE:
				setMessageExchangeType(MESSAGE_EXCHANGE_TYPE_EDEFAULT);
				return;
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE:
				setLcmMessageType((View)null);
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
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE:
				return messageExchangeType != MESSAGE_EXCHANGE_TYPE_EDEFAULT;
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE:
				return lcmMessageType != null;
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

} //LifeCycleManagementPortImpl
