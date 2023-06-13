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
package org.osate.datamodel10.platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.datamodel10.platform.Participant#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.Participant#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.Participant#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.Participant#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link org.osate.datamodel10.platform.Participant#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.osate.datamodel10.platform.PlatformPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends Characteristic {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Entity)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getParticipant_Type()
	 * @model required="true"
	 * @generated
	 */
	Entity getType();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.Participant#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Entity value);

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(org.osate.datamodel10.logical.Participant)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getParticipant_Realizes()
	 * @model required="true"
	 * @generated
	 */
	org.osate.datamodel10.logical.Participant getRealizes();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.Participant#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(org.osate.datamodel10.logical.Participant value);

	/**
	 * Returns the value of the '<em><b>Source Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Lower Bound</em>' attribute.
	 * @see #setSourceLowerBound(int)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getParticipant_SourceLowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getSourceLowerBound();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.Participant#getSourceLowerBound <em>Source Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Lower Bound</em>' attribute.
	 * @see #getSourceLowerBound()
	 * @generated
	 */
	void setSourceLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Source Upper Bound</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Upper Bound</em>' attribute.
	 * @see #setSourceUpperBound(int)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getParticipant_SourceUpperBound()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getSourceUpperBound();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.Participant#getSourceUpperBound <em>Source Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Upper Bound</em>' attribute.
	 * @see #getSourceUpperBound()
	 * @generated
	 */
	void setSourceUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(PathNode)
	 * @see org.osate.datamodel10.platform.PlatformPackage#getParticipant_Path()
	 * @model containment="true"
	 * @generated
	 */
	PathNode getPath();

	/**
	 * Sets the value of the '{@link org.osate.datamodel10.platform.Participant#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathNode value);

} // Participant
