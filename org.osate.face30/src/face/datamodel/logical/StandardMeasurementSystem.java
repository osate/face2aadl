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
package face.datamodel.logical;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Measurement System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.StandardMeasurementSystem#getReferenceStandard <em>Reference Standard</em>}</li>
 * </ul>
 *
 * @see face.datamodel.logical.LogicalPackage#getStandardMeasurementSystem()
 * @model
 * @generated
 */
public interface StandardMeasurementSystem extends AbstractMeasurementSystem {
	/**
	 * Returns the value of the '<em><b>Reference Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Standard</em>' attribute.
	 * @see #setReferenceStandard(String)
	 * @see face.datamodel.logical.LogicalPackage#getStandardMeasurementSystem_ReferenceStandard()
	 * @model
	 * @generated
	 */
	String getReferenceStandard();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.StandardMeasurementSystem#getReferenceStandard <em>Reference Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Standard</em>' attribute.
	 * @see #getReferenceStandard()
	 * @generated
	 */
	void setReferenceStandard(String value);

} // StandardMeasurementSystem
