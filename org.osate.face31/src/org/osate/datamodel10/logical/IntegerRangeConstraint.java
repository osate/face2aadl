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
 * A representation of the model object '<em><b>Integer Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.logical.IntegerRangeConstraint#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.osate.datamodel10.logical.IntegerRangeConstraint#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.logical.LogicalPackage#getIntegerRangeConstraint()
 * @model
 * @generated
 */
public interface IntegerRangeConstraint extends IntegerConstraint {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getIntegerRangeConstraint_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.IntegerRangeConstraint#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see org.osate.datamodel10.logical.LogicalPackage#getIntegerRangeConstraint_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.logical.IntegerRangeConstraint#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // IntegerRangeConstraint
