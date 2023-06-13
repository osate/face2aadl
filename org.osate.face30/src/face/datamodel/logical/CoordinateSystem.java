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

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.CoordinateSystem#getAxis <em>Axis</em>}</li>
 *   <li>{@link face.datamodel.logical.CoordinateSystem#getAxisRelationshipDescription <em>Axis Relationship Description</em>}</li>
 *   <li>{@link face.datamodel.logical.CoordinateSystem#getAngleEquation <em>Angle Equation</em>}</li>
 *   <li>{@link face.datamodel.logical.CoordinateSystem#getDistanceEquation <em>Distance Equation</em>}</li>
 * </ul>
 *
 * @see face.datamodel.logical.LogicalPackage#getCoordinateSystem()
 * @model
 * @generated
 */
public interface CoordinateSystem extends Element {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference list.
	 * The list contents are of type {@link face.datamodel.logical.CoordinateSystemAxis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference list.
	 * @see face.datamodel.logical.LogicalPackage#getCoordinateSystem_Axis()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CoordinateSystemAxis> getAxis();

	/**
	 * Returns the value of the '<em><b>Axis Relationship Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Relationship Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Relationship Description</em>' attribute.
	 * @see #setAxisRelationshipDescription(String)
	 * @see face.datamodel.logical.LogicalPackage#getCoordinateSystem_AxisRelationshipDescription()
	 * @model
	 * @generated
	 */
	String getAxisRelationshipDescription();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.CoordinateSystem#getAxisRelationshipDescription <em>Axis Relationship Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Relationship Description</em>' attribute.
	 * @see #getAxisRelationshipDescription()
	 * @generated
	 */
	void setAxisRelationshipDescription(String value);

	/**
	 * Returns the value of the '<em><b>Angle Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Equation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Equation</em>' attribute.
	 * @see #setAngleEquation(String)
	 * @see face.datamodel.logical.LogicalPackage#getCoordinateSystem_AngleEquation()
	 * @model
	 * @generated
	 */
	String getAngleEquation();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.CoordinateSystem#getAngleEquation <em>Angle Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Equation</em>' attribute.
	 * @see #getAngleEquation()
	 * @generated
	 */
	void setAngleEquation(String value);

	/**
	 * Returns the value of the '<em><b>Distance Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Equation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Equation</em>' attribute.
	 * @see #setDistanceEquation(String)
	 * @see face.datamodel.logical.LogicalPackage#getCoordinateSystem_DistanceEquation()
	 * @model
	 * @generated
	 */
	String getDistanceEquation();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.CoordinateSystem#getDistanceEquation <em>Distance Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Equation</em>' attribute.
	 * @see #getDistanceEquation()
	 * @generated
	 */
	void setDistanceEquation(String value);

} // CoordinateSystem
