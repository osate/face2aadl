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
package face.uop;

import face.Element;

import face.datamodel.conceptual.View;

import face.traceability.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.uop.AbstractConnection#getConceptualView <em>Conceptual View</em>}</li>
 *   <li>{@link face.uop.AbstractConnection#getLogicalView <em>Logical View</em>}</li>
 * </ul>
 *
 * @see face.uop.UopPackage#getAbstractConnection()
 * @model
 * @generated
 */
public interface AbstractConnection extends Element, TraceableElement {
	/**
	 * Returns the value of the '<em><b>Conceptual View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual View</em>' reference.
	 * @see #setConceptualView(View)
	 * @see face.uop.UopPackage#getAbstractConnection_ConceptualView()
	 * @model
	 * @generated
	 */
	View getConceptualView();

	/**
	 * Sets the value of the '{@link face.uop.AbstractConnection#getConceptualView <em>Conceptual View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conceptual View</em>' reference.
	 * @see #getConceptualView()
	 * @generated
	 */
	void setConceptualView(View value);

	/**
	 * Returns the value of the '<em><b>Logical View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical View</em>' reference.
	 * @see #setLogicalView(face.datamodel.logical.View)
	 * @see face.uop.UopPackage#getAbstractConnection_LogicalView()
	 * @model
	 * @generated
	 */
	face.datamodel.logical.View getLogicalView();

	/**
	 * Sets the value of the '{@link face.uop.AbstractConnection#getLogicalView <em>Logical View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical View</em>' reference.
	 * @see #getLogicalView()
	 * @generated
	 */
	void setLogicalView(face.datamodel.logical.View value);

} // AbstractConnection
