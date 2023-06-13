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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Server Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.ClientServerConnection#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.osate.face31.uop.ClientServerConnection#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link org.osate.face31.uop.ClientServerConnection#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.osate.face31.uop.UopPackage#getClientServerConnection()
 * @model
 * @generated
 */
public interface ClientServerConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' reference.
	 * @see #setRequestType(MessageType)
	 * @see org.osate.face31.uop.UopPackage#getClientServerConnection_RequestType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getRequestType();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.ClientServerConnection#getRequestType <em>Request Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' reference.
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Response Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Type</em>' reference.
	 * @see #setResponseType(MessageType)
	 * @see org.osate.face31.uop.UopPackage#getClientServerConnection_ResponseType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getResponseType();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.ClientServerConnection#getResponseType <em>Response Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Type</em>' reference.
	 * @see #getResponseType()
	 * @generated
	 */
	void setResponseType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.face31.uop.ClientServerRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.osate.face31.uop.ClientServerRole
	 * @see #setRole(ClientServerRole)
	 * @see org.osate.face31.uop.UopPackage#getClientServerConnection_Role()
	 * @model required="true"
	 * @generated
	 */
	ClientServerRole getRole();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.ClientServerConnection#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.osate.face31.uop.ClientServerRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ClientServerRole value);

} // ClientServerConnection
