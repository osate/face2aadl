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
package org.osate.datamodel10.platform;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.platform.QueryComposition#getRolename <em>Rolename</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.QueryComposition#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.QueryComposition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.platform.PlatformPackage#getQueryComposition()
 * @model
 * @generated
 */
public interface QueryComposition extends EObject {
	/**
	 * Returns the value of the '<em><b>Rolename</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolename</em>' attribute.
	 * @see #setRolename(String)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getQueryComposition_Rolename()
	 * @model default="" required="true"
	 * @generated
	 */
	String getRolename();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.QueryComposition#getRolename <em>Rolename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolename</em>' attribute.
	 * @see #getRolename()
	 * @generated
	 */
	void setRolename(String value);

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(org.osate.datamodel10.logical.QueryComposition)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getQueryComposition_Realizes()
	 * @model
	 * @generated
	 */
	org.osate.datamodel10.logical.QueryComposition getRealizes();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.QueryComposition#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(org.osate.datamodel10.logical.QueryComposition value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(View)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getQueryComposition_Type()
	 * @model required="true"
	 * @generated
	 */
	View getType();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.QueryComposition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(View value);

} // QueryComposition
