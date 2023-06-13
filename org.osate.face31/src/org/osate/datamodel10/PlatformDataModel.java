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
package org.osate.datamodel10;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.PlatformDataModel#getElement <em>Element</em>}</li>
 *   <li>{@link org.osate.datamodel10.PlatformDataModel#getPdm <em>Pdm</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.DatamodelPackage#getPlatformDataModel()
 * @model
 * @generated
 */
public interface PlatformDataModel extends Element {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.datamodel10.platform.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.osate.datamodel10.DatamodelPackage#getPlatformDataModel_Element()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<org.osate.datamodel10.platform.Element> getElement();

	/**
	 * Returns the value of the '<em><b>Pdm</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.datamodel10.PlatformDataModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdm</em>' containment reference list.
	 * @see org.osate.datamodel10.DatamodelPackage#getPlatformDataModel_Pdm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PlatformDataModel> getPdm();

} // PlatformDataModel
