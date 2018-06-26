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
package face.datamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.ConceptualDataModel#getElement <em>Element</em>}</li>
 *   <li>{@link face.datamodel.ConceptualDataModel#getCdm <em>Cdm</em>}</li>
 * </ul>
 *
 * @see face.datamodel.DatamodelPackage#getConceptualDataModel()
 * @model
 * @generated
 */
public interface ConceptualDataModel extends Element {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.conceptual.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see face.datamodel.DatamodelPackage#getConceptualDataModel_Element()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<face.datamodel.conceptual.Element> getElement();

	/**
	 * Returns the value of the '<em><b>Cdm</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.ConceptualDataModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdm</em>' containment reference list.
	 * @see face.datamodel.DatamodelPackage#getConceptualDataModel_Cdm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConceptualDataModel> getCdm();

} // ConceptualDataModel
