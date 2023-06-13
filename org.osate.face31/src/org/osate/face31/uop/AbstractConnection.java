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

import org.osate.datamodel10.conceptual.View;

import org.osate.face31.Element;

import org.osate.face31.traceability.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.AbstractConnection#getConceptualView <em>Conceptual View</em>}</li>
 *   <li>{@link org.osate.face31.uop.AbstractConnection#getLogicalView <em>Logical View</em>}</li>
 * </ul>
 *
 * @see org.osate.face31.uop.UopPackage#getAbstractConnection()
 * @model
 * @generated
 */
public interface AbstractConnection extends Element, TraceableElement {
	/**
	 * Returns the value of the '<em><b>Conceptual View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual View</em>' reference.
	 * @see #setConceptualView(View)
	 * @see org.osate.face31.uop.UopPackage#getAbstractConnection_ConceptualView()
	 * @model
	 * @generated
	 */
	View getConceptualView();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.AbstractConnection#getConceptualView <em>Conceptual View</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical View</em>' reference.
	 * @see #setLogicalView(org.osate.datamodel10.logical.View)
	 * @see org.osate.face31.uop.UopPackage#getAbstractConnection_LogicalView()
	 * @model
	 * @generated
	 */
	org.osate.datamodel10.logical.View getLogicalView();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.AbstractConnection#getLogicalView <em>Logical View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical View</em>' reference.
	 * @see #getLogicalView()
	 * @generated
	 */
	void setLogicalView(org.osate.datamodel10.logical.View value);

} // AbstractConnection
