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
package face.datamodel.logical;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement System Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.MeasurementSystemAxis#getAxis <em>Axis</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementSystemAxis#getDefaultValueTypeUnit <em>Default Value Type Unit</em>}</li>
 *   <li>{@link face.datamodel.logical.MeasurementSystemAxis#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemAxis()
 * @model
 * @generated
 */
public interface MeasurementSystemAxis extends Element {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #setAxis(CoordinateSystemAxis)
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemAxis_Axis()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CoordinateSystemAxis getAxis();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.MeasurementSystemAxis#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(CoordinateSystemAxis value);

	/**
	 * Returns the value of the '<em><b>Default Value Type Unit</b></em>' reference list.
	 * The list contents are of type {@link face.datamodel.logical.ValueTypeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Type Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Type Unit</em>' reference list.
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemAxis_DefaultValueTypeUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ValueTypeUnit> getDefaultValueTypeUnit();

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
	 * @see face.datamodel.logical.LogicalPackage#getMeasurementSystemAxis_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasurementConstraint> getConstraint();

} // MeasurementSystemAxis
