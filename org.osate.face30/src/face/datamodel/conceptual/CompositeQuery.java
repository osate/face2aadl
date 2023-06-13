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
package face.datamodel.conceptual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.conceptual.CompositeQuery#getComposition <em>Composition</em>}</li>
 *   <li>{@link face.datamodel.conceptual.CompositeQuery#isIsUnion <em>Is Union</em>}</li>
 * </ul>
 *
 * @see face.datamodel.conceptual.ConceptualPackage#getCompositeQuery()
 * @model
 * @generated
 */
public interface CompositeQuery extends Element, View {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.conceptual.QueryComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see face.datamodel.conceptual.ConceptualPackage#getCompositeQuery_Composition()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<QueryComposition> getComposition();

	/**
	 * Returns the value of the '<em><b>Is Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Union</em>' attribute.
	 * @see #setIsUnion(boolean)
	 * @see face.datamodel.conceptual.ConceptualPackage#getCompositeQuery_IsUnion()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsUnion();

	/**
	 * Sets the value of the '{@link face.datamodel.conceptual.CompositeQuery#isIsUnion <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Union</em>' attribute.
	 * @see #isIsUnion()
	 * @generated
	 */
	void setIsUnion(boolean value);

} // CompositeQuery
