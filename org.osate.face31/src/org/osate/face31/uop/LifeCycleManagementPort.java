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
package org.osate.face31.uop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle Management Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.LifeCycleManagementPort#getMessageExchangeType <em>Message Exchange Type</em>}</li>
 *   <li>{@link org.osate.face31.uop.LifeCycleManagementPort#getLcmMessageType <em>Lcm Message Type</em>}</li>
 * </ul>
 *
 * @see org.osate.face31.uop.UopPackage#getLifeCycleManagementPort()
 * @model
 * @generated
 */
public interface LifeCycleManagementPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Exchange Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.face31.uop.MessageExchangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchange Type</em>' attribute.
	 * @see org.osate.face31.uop.MessageExchangeType
	 * @see #setMessageExchangeType(MessageExchangeType)
	 * @see org.osate.face31.uop.UopPackage#getLifeCycleManagementPort_MessageExchangeType()
	 * @model required="true"
	 * @generated
	 */
	MessageExchangeType getMessageExchangeType();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.LifeCycleManagementPort#getMessageExchangeType <em>Message Exchange Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange Type</em>' attribute.
	 * @see org.osate.face31.uop.MessageExchangeType
	 * @see #getMessageExchangeType()
	 * @generated
	 */
	void setMessageExchangeType(MessageExchangeType value);

	/**
	 * Returns the value of the '<em><b>Lcm Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lcm Message Type</em>' reference.
	 * @see #setLcmMessageType(MessageType)
	 * @see org.osate.face31.uop.UopPackage#getLifeCycleManagementPort_LcmMessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getLcmMessageType();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.LifeCycleManagementPort#getLcmMessageType <em>Lcm Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lcm Message Type</em>' reference.
	 * @see #getLcmMessageType()
	 * @generated
	 */
	void setLcmMessageType(MessageType value);

} // LifeCycleManagementPort
