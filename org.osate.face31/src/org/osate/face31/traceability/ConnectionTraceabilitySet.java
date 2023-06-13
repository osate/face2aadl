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
package org.osate.face31.traceability;

import org.eclipse.emf.common.util.EList;

import org.osate.face31.uop.AbstractConnection;
import org.osate.face31.uop.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Traceability Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.traceability.ConnectionTraceabilitySet#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.osate.face31.traceability.ConnectionTraceabilitySet#getAbstractConnection <em>Abstract Connection</em>}</li>
 * </ul>
 *
 * @see org.osate.face31.traceability.TraceabilityPackage#getConnectionTraceabilitySet()
 * @model
 * @generated
 */
public interface ConnectionTraceabilitySet extends Element, TraceableElement {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link org.osate.face31.uop.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see org.osate.face31.traceability.TraceabilityPackage#getConnectionTraceabilitySet_Connection()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Abstract Connection</b></em>' reference list.
	 * The list contents are of type {@link org.osate.face31.uop.AbstractConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connection</em>' reference list.
	 * @see org.osate.face31.traceability.TraceabilityPackage#getConnectionTraceabilitySet_AbstractConnection()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractConnection> getAbstractConnection();

} // ConnectionTraceabilitySet
