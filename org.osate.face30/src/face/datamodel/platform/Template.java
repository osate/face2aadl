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
package face.datamodel.platform;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.platform.Template#getSpecification <em>Specification</em>}</li>
 *   <li>{@link face.datamodel.platform.Template#getBoundQuery <em>Bound Query</em>}</li>
 *   <li>{@link face.datamodel.platform.Template#getEffectiveQuery <em>Effective Query</em>}</li>
 * </ul>
 *
 * @see face.datamodel.platform.PlatformPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends View {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see face.datamodel.platform.PlatformPackage#getTemplate_Specification()
	 * @model required="true"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link face.datamodel.platform.Template#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Bound Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Query</em>' reference.
	 * @see #setBoundQuery(Query)
	 * @see face.datamodel.platform.PlatformPackage#getTemplate_BoundQuery()
	 * @model
	 * @generated
	 */
	Query getBoundQuery();

	/**
	 * Sets the value of the '{@link face.datamodel.platform.Template#getBoundQuery <em>Bound Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Query</em>' reference.
	 * @see #getBoundQuery()
	 * @generated
	 */
	void setBoundQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Effective Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Query</em>' reference.
	 * @see #setEffectiveQuery(Query)
	 * @see face.datamodel.platform.PlatformPackage#getTemplate_EffectiveQuery()
	 * @model
	 * @generated
	 */
	Query getEffectiveQuery();

	/**
	 * Sets the value of the '{@link face.datamodel.platform.Template#getEffectiveQuery <em>Effective Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Query</em>' reference.
	 * @see #getEffectiveQuery()
	 * @generated
	 */
	void setEffectiveQuery(Query value);

} // Template
