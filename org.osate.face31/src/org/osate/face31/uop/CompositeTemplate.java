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

import org.eclipse.emf.common.util.EList;

import org.osate.datamodel10.logical.CompositeQuery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.CompositeTemplate#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.osate.face31.uop.CompositeTemplate#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.face31.uop.CompositeTemplate#isIsUnion <em>Is Union</em>}</li>
 * </ul>
 *
 * @see org.osate.face31.uop.UopPackage#getCompositeTemplate()
 * @model
 * @generated
 */
public interface CompositeTemplate extends Element, MessageType {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.face31.uop.TemplateComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see org.osate.face31.uop.UopPackage#getCompositeTemplate_Composition()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<TemplateComposition> getComposition();

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(CompositeQuery)
	 * @see org.osate.face31.uop.UopPackage#getCompositeTemplate_Realizes()
	 * @model
	 * @generated
	 */
	CompositeQuery getRealizes();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.CompositeTemplate#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(CompositeQuery value);

	/**
	 * Returns the value of the '<em><b>Is Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Union</em>' attribute.
	 * @see #setIsUnion(boolean)
	 * @see org.osate.face31.uop.UopPackage#getCompositeTemplate_IsUnion()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsUnion();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.CompositeTemplate#isIsUnion <em>Is Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Union</em>' attribute.
	 * @see #isIsUnion()
	 * @generated
	 */
	void setIsUnion(boolean value);

} // CompositeTemplate
