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
package face.integration;

import face.uop.UnitOfPortability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uo PInstance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.integration.UoPInstance#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link face.integration.UoPInstance#getOutput <em>Output</em>}</li>
 *   <li>{@link face.integration.UoPInstance#getInput <em>Input</em>}</li>
 *   <li>{@link face.integration.UoPInstance#getConfigurationURI <em>Configuration URI</em>}</li>
 * </ul>
 *
 * @see face.integration.IntegrationPackage#getUoPInstance()
 * @model
 * @generated
 */
public interface UoPInstance extends Element {
	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(UnitOfPortability)
	 * @see face.integration.IntegrationPackage#getUoPInstance_Realizes()
	 * @model required="true"
	 * @generated
	 */
	UnitOfPortability getRealizes();

	/**
	 * Sets the value of the '{@link face.integration.UoPInstance#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(UnitOfPortability value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link face.integration.UoPOutputEndPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see face.integration.IntegrationPackage#getUoPInstance_Output()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UoPOutputEndPoint> getOutput();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link face.integration.UoPInputEndPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see face.integration.IntegrationPackage#getUoPInstance_Input()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UoPInputEndPoint> getInput();

	/**
	 * Returns the value of the '<em><b>Configuration URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration URI</em>' attribute.
	 * @see #setConfigurationURI(String)
	 * @see face.integration.IntegrationPackage#getUoPInstance_ConfigurationURI()
	 * @model
	 * @generated
	 */
	String getConfigurationURI();

	/**
	 * Sets the value of the '{@link face.integration.UoPInstance#getConfigurationURI <em>Configuration URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration URI</em>' attribute.
	 * @see #getConfigurationURI()
	 * @generated
	 */
	void setConfigurationURI(String value);

} // UoPInstance
