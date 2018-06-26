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

import face.datamodel.conceptual.Observable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.MeasurementAxis#getValueTypeUnit <em>Value Type Unit</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementAxis#getMeasurementSystemAxis <em>Measurement System Axis</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementAxis#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementAxis#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @see face.datamodel.logical.LogicalPackage#getMeasurementAxis()
 * @model
 * @generated
 */
public interface MeasurementAxis extends Element, AbstractMeasurement {
	/**
	 * Returns the value of the '<em><b>Value Type Unit</b></em>' reference list.
	 * The list contents are of type {@link face.datamodel.logical.ValueTypeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Unit</em>' reference list.
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementAxis_ValueTypeUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueTypeUnit> getValueTypeUnit();

	/**
	 * Returns the value of the '<em><b>Measurement System Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement System Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement System Axis</em>' reference.
	 * @see #setMeasurementSystemAxis(MeasurementSystemAxis)
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementAxis_MeasurementSystemAxis()
	 * @model required="true"
	 * @generated
	 */
	MeasurementSystemAxis getMeasurementSystemAxis();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.MeasurementAxis#getMeasurementSystemAxis <em>Measurement System Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement System Axis</em>' reference.
	 * @see #getMeasurementSystemAxis()
	 * @generated
	 */
	void setMeasurementSystemAxis(MeasurementSystemAxis value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.logical.MeasurementConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementAxis_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasurementConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(Observable)
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementAxis_Realizes()
	 * @model
	 * @generated
	 */
	Observable getRealizes();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.MeasurementAxis#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(Observable value);

} // MeasurementAxis
