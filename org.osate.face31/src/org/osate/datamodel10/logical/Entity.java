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
package org.osate.datamodel10.logical;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.Entity#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.Entity#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.Entity#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.logical.LogicalPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends ComposableElement {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.datamodel10.logical.Composition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see org.osate.datamodel10.logical.LogicalPackage#getEntity_Composition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Composition> getComposition();

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(org.osate.datamodel10.conceptual.Entity)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getEntity_Realizes()
	 * @model required="true"
	 * @generated
	 */
	org.osate.datamodel10.conceptual.Entity getRealizes();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.Entity#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(org.osate.datamodel10.conceptual.Entity value);

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(Entity)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getEntity_Specializes()
	 * @model ordered="false"
	 * @generated
	 */
	Entity getSpecializes();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.Entity#getSpecializes <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' reference.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(Entity value);

} // Entity
