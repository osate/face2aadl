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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement System Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.MeasurementSystemConversion#getSource <em>Source</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementSystemConversion#getTarget <em>Target</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementSystemConversion#getEquation <em>Equation</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementSystemConversion#getConversionLossDescription <em>Conversion Loss Description</em>}</li>
 * </ul>
 *
 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemConversion()
 * @model
 * @generated
 */
public interface MeasurementSystemConversion extends Element {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MeasurementSystem)
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemConversion_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasurementSystem getSource();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.MeasurementSystemConversion#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MeasurementSystem value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MeasurementSystem)
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemConversion_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasurementSystem getTarget();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.MeasurementSystemConversion#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MeasurementSystem value);

	/**
	 * Returns the value of the '<em><b>Equation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' attribute list.
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemConversion_Equation()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getEquation();

	/**
	 * Returns the value of the '<em><b>Conversion Loss Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Loss Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Loss Description</em>' attribute.
	 * @see #setConversionLossDescription(String)
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemConversion_ConversionLossDescription()
	 * @model
	 * @generated
	 */
	String getConversionLossDescription();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.MeasurementSystemConversion#getConversionLossDescription <em>Conversion Loss Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Loss Description</em>' attribute.
	 * @see #getConversionLossDescription()
	 * @generated
	 */
	void setConversionLossDescription(String value);

} // MeasurementSystemConversion
