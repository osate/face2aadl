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
package face.uop;

import face.Element;

import face.traceability.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.uop.Connection#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link face.uop.Connection#getPeriod <em>Period</em>}</li>
 *   <li>{@link face.uop.Connection#getSynchronizationStyle <em>Synchronization Style</em>}</li>
 * </ul>
 *
 * @see face.uop.UopPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends TraceableElement, Element {
	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(AbstractConnection)
	 * @see face.uop.UopPackage#getConnection_Realizes()
	 * @model
	 * @generated
	 */
	AbstractConnection getRealizes();

	/**
	 * Sets the value of the '{@link face.uop.Connection#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(AbstractConnection value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(float)
	 * @see face.uop.UopPackage#getConnection_Period()
	 * @model required="true"
	 * @generated
	 */
	float getPeriod();

	/**
	 * Sets the value of the '{@link face.uop.Connection#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(float value);

	/**
	 * Returns the value of the '<em><b>Synchronization Style</b></em>' attribute.
	 * The literals are from the enumeration {@link face.uop.SynchronizationStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Style</em>' attribute.
	 * @see face.uop.SynchronizationStyle
	 * @see #setSynchronizationStyle(SynchronizationStyle)
	 * @see face.uop.UopPackage#getConnection_SynchronizationStyle()
	 * @model required="true"
	 * @generated
	 */
	SynchronizationStyle getSynchronizationStyle();

	/**
	 * Sets the value of the '{@link face.uop.Connection#getSynchronizationStyle <em>Synchronization Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization Style</em>' attribute.
	 * @see face.uop.SynchronizationStyle
	 * @see #getSynchronizationStyle()
	 * @generated
	 */
	void setSynchronizationStyle(SynchronizationStyle value);

} // Connection
