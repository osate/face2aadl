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
package org.osate.datamodel10.logical;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.MeasurementSystem#getMeasurementSystemAxis <em>Measurement System Axis</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.MeasurementSystem#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.MeasurementSystem#getReferencePoint <em>Reference Point</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.MeasurementSystem#getExternalStandardReference <em>External Standard Reference</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.MeasurementSystem#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.MeasurementSystem#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.logical.LogicalPackage#getMeasurementSystem()
 * @model
 * @generated
 */
public interface MeasurementSystem extends AbstractMeasurementSystem {
	/**
	 * Returns the value of the '<em><b>Measurement System Axis</b></em>' reference list.
	 * The list contents are of type {@link org.osate.datamodel10.logical.MeasurementSystemAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement System Axis</em>' reference list.
	 * @see org.osate.datamodel10.logical.LogicalPackage#getMeasurementSystem_MeasurementSystemAxis()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<MeasurementSystemAxis> getMeasurementSystemAxis();

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System</em>' reference.
	 * @see #setCoordinateSystem(CoordinateSystem)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getMeasurementSystem_CoordinateSystem()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CoordinateSystem getCoordinateSystem();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.MeasurementSystem#getCoordinateSystem <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(CoordinateSystem value);

	/**
	 * Returns the value of the '<em><b>Reference Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.datamodel10.logical.ReferencePoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Point</em>' containment reference list.
	 * @see org.osate.datamodel10.logical.LogicalPackage#getMeasurementSystem_ReferencePoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ReferencePoint> getReferencePoint();

	/**
	 * Returns the value of the '<em><b>External Standard Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Standard Reference</em>' attribute.
	 * @see #setExternalStandardReference(String)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getMeasurementSystem_ExternalStandardReference()
	 * @model
	 * @generated
	 */
	String getExternalStandardReference();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.MeasurementSystem#getExternalStandardReference <em>External Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Standard Reference</em>' attribute.
	 * @see #getExternalStandardReference()
	 * @generated
	 */
	void setExternalStandardReference(String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getMeasurementSystem_Orientation()
	 * @model
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.MeasurementSystem#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.datamodel10.logical.MeasurementConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see org.osate.datamodel10.logical.LogicalPackage#getMeasurementSystem_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasurementConstraint> getConstraint();

} // MeasurementSystem
