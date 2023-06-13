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
package face.integration;

import face.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.integration.TransportNode#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link face.integration.TransportNode#getInPort <em>In Port</em>}</li>
 * </ul>
 *
 * @see face.integration.IntegrationPackage#getTransportNode()
 * @model abstract="true"
 * @generated
 */
public interface TransportNode extends Element {
	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' containment reference.
	 * @see #setOutPort(TSNodeOutputPort)
	 * @see face.integration.IntegrationPackage#getTransportNode_OutPort()
	 * @model containment="true"
	 * @generated
	 */
	TSNodeOutputPort getOutPort();

	/**
	 * Sets the value of the '{@link face.integration.TransportNode#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(TSNodeOutputPort value);

	/**
	 * Returns the value of the '<em><b>In Port</b></em>' containment reference list.
	 * The list contents are of type {@link face.integration.TSNodeInputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' containment reference list.
	 * @see face.integration.IntegrationPackage#getTransportNode_InPort()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TSNodeInputPort> getInPort();

} // TransportNode
