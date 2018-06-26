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
package face.datamodel.conceptual;

import face.traceability.TraceableElement;

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
 *   <li>{@link face.datamodel.conceptual.Entity#getComposition <em>Composition</em>}</li>
 *   <li>{@link face.datamodel.conceptual.Entity#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link face.datamodel.conceptual.Entity#getBasisEntity <em>Basis Entity</em>}</li>
 * </ul>
 *
 * @see face.datamodel.conceptual.ConceptualPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends ComposableElement, TraceableElement {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.conceptual.Composition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see face.datamodel.conceptual.ConceptualPackage#getEntity_Composition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Composition> getComposition();

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(Entity)
	 * @see face.datamodel.conceptual.ConceptualPackage#getEntity_Specializes()
	 * @model ordered="false"
	 * @generated
	 */
	Entity getSpecializes();

	/**
	 * Sets the value of the '{@link face.datamodel.conceptual.Entity#getSpecializes <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' reference.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(Entity value);

	/**
	 * Returns the value of the '<em><b>Basis Entity</b></em>' reference list.
	 * The list contents are of type {@link face.datamodel.conceptual.BasisEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Entity</em>' reference list.
	 * @see face.datamodel.conceptual.ConceptualPackage#getEntity_BasisEntity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisEntity> getBasisEntity();

} // Entity
