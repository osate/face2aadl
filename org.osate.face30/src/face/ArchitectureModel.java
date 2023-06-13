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
package face;

import face.datamodel.DataModel;

import face.integration.IntegrationModel;

import face.traceability.TraceabilityModel;

import face.uop.UoPModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.ArchitectureModel#getDm <em>Dm</em>}</li>
 *   <li>{@link face.ArchitectureModel#getUm <em>Um</em>}</li>
 *   <li>{@link face.ArchitectureModel#getIm <em>Im</em>}</li>
 *   <li>{@link face.ArchitectureModel#getTm <em>Tm</em>}</li>
 * </ul>
 *
 * @see face.FacePackage#getArchitectureModel()
 * @model
 * @generated
 */
public interface ArchitectureModel extends Element {
	/**
	 * Returns the value of the '<em><b>Dm</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.DataModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dm</em>' containment reference list.
	 * @see face.FacePackage#getArchitectureModel_Dm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataModel> getDm();

	/**
	 * Returns the value of the '<em><b>Um</b></em>' containment reference list.
	 * The list contents are of type {@link face.uop.UoPModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Um</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Um</em>' containment reference list.
	 * @see face.FacePackage#getArchitectureModel_Um()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UoPModel> getUm();

	/**
	 * Returns the value of the '<em><b>Im</b></em>' containment reference list.
	 * The list contents are of type {@link face.integration.IntegrationModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Im</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Im</em>' containment reference list.
	 * @see face.FacePackage#getArchitectureModel_Im()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IntegrationModel> getIm();

	/**
	 * Returns the value of the '<em><b>Tm</b></em>' containment reference list.
	 * The list contents are of type {@link face.traceability.TraceabilityModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm</em>' containment reference list.
	 * @see face.FacePackage#getArchitectureModel_Tm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TraceabilityModel> getTm();

} // ArchitectureModel
