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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.RealRangeConstraint#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.RealRangeConstraint#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.RealRangeConstraint#isLowerBoundInclusive <em>Lower Bound Inclusive</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.RealRangeConstraint#isUpperBoundInclusive <em>Upper Bound Inclusive</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.logical.LogicalPackage#getRealRangeConstraint()
 * @model
 * @generated
 */
public interface RealRangeConstraint extends RealConstraint {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(float)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getRealRangeConstraint_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	float getLowerBound();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.RealRangeConstraint#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(float value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(float)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getRealRangeConstraint_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	float getUpperBound();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.RealRangeConstraint#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(float value);

	/**
	 * Returns the value of the '<em><b>Lower Bound Inclusive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound Inclusive</em>' attribute.
	 * @see #setLowerBoundInclusive(boolean)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getRealRangeConstraint_LowerBoundInclusive()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLowerBoundInclusive();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.RealRangeConstraint#isLowerBoundInclusive <em>Lower Bound Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound Inclusive</em>' attribute.
	 * @see #isLowerBoundInclusive()
	 * @generated
	 */
	void setLowerBoundInclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Upper Bound Inclusive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound Inclusive</em>' attribute.
	 * @see #setUpperBoundInclusive(boolean)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getRealRangeConstraint_UpperBoundInclusive()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUpperBoundInclusive();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.RealRangeConstraint#isUpperBoundInclusive <em>Upper Bound Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound Inclusive</em>' attribute.
	 * @see #isUpperBoundInclusive()
	 * @generated
	 */
	void setUpperBoundInclusive(boolean value);

} // RealRangeConstraint
