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
package org.osate.datamodel10.conceptual;

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
 *   <li>{@link org.osate.datamodel10.conceptual.Entity#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.osate.datamodel10.conceptual.Entity#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.osate.datamodel10.conceptual.Entity#getBasisEntity <em>Basis Entity</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.conceptual.ConceptualPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends ComposableElement {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.datamodel10.conceptual.Composition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see org.osate.datamodel10.conceptual.ConceptualPackage#getEntity_Composition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Composition> getComposition();

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(Entity)
	 * @see org.osate.datamodel10.conceptual.ConceptualPackage#getEntity_Specializes()
	 * @model ordered="false"
	 * @generated
	 */
	Entity getSpecializes();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.conceptual.Entity#getSpecializes <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' reference.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(Entity value);

	/**
	 * Returns the value of the '<em><b>Basis Entity</b></em>' reference list.
	 * The list contents are of type {@link org.osate.datamodel10.conceptual.BasisEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Entity</em>' reference list.
	 * @see org.osate.datamodel10.conceptual.ConceptualPackage#getEntity_BasisEntity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisEntity> getBasisEntity();

} // Entity
