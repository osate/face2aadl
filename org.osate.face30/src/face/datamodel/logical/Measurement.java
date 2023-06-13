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

import face.datamodel.conceptual.Observable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.Measurement#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link face.datamodel.logical.Measurement#getMeasurementAxis <em>Measurement Axis</em>}</li>
 *   <li>{@link face.datamodel.logical.Measurement#getMeasurementSystem <em>Measurement System</em>}</li>
 *   <li>{@link face.datamodel.logical.Measurement#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link face.datamodel.logical.Measurement#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see face.datamodel.logical.LogicalPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends ComposableElement, AbstractMeasurement {
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
	 * @see face.datamodel.logical.LogicalPackage#getMeasurement_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasurementConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Measurement Axis</b></em>' reference list.
	 * The list contents are of type {@link face.datamodel.logical.MeasurementAxis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Axis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Axis</em>' reference list.
	 * @see face.datamodel.logical.LogicalPackage#getMeasurement_MeasurementAxis()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MeasurementAxis> getMeasurementAxis();

	/**
	 * Returns the value of the '<em><b>Measurement System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement System</em>' reference.
	 * @see #setMeasurementSystem(AbstractMeasurementSystem)
	 * @see face.datamodel.logical.LogicalPackage#getMeasurement_MeasurementSystem()
	 * @model required="true"
	 * @generated
	 */
	AbstractMeasurementSystem getMeasurementSystem();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.Measurement#getMeasurementSystem <em>Measurement System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement System</em>' reference.
	 * @see #getMeasurementSystem()
	 * @generated
	 */
	void setMeasurementSystem(AbstractMeasurementSystem value);

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
	 * @see face.datamodel.logical.LogicalPackage#getMeasurement_Realizes()
	 * @model required="true"
	 * @generated
	 */
	Observable getRealizes();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.Measurement#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(Observable value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.logical.MeasurementAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see face.datamodel.logical.LogicalPackage#getMeasurement_Attribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MeasurementAttribute> getAttribute();

} // Measurement
