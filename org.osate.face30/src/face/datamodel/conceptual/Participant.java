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
package face.datamodel.conceptual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.conceptual.Participant#getType <em>Type</em>}</li>
 *   <li>{@link face.datamodel.conceptual.Participant#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link face.datamodel.conceptual.Participant#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link face.datamodel.conceptual.Participant#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see face.datamodel.conceptual.ConceptualPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends Characteristic {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Entity)
	 * @see face.datamodel.conceptual.ConceptualPackage#getParticipant_Type()
	 * @model required="true"
	 * @generated
	 */
	Entity getType();

	/**
	 * Sets the value of the '{@link face.datamodel.conceptual.Participant#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Entity value);

	/**
	 * Returns the value of the '<em><b>Source Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Lower Bound</em>' attribute.
	 * @see #setSourceLowerBound(int)
	 * @see face.datamodel.conceptual.ConceptualPackage#getParticipant_SourceLowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getSourceLowerBound();

	/**
	 * Sets the value of the '{@link face.datamodel.conceptual.Participant#getSourceLowerBound <em>Source Lower Bound</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Source Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Upper Bound</em>' attribute.
	 * @see #setSourceUpperBound(int)
	 * @see face.datamodel.conceptual.ConceptualPackage#getParticipant_SourceUpperBound()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getSourceUpperBound();

	/**
	 * Sets the value of the '{@link face.datamodel.conceptual.Participant#getSourceUpperBound <em>Source Upper Bound</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(PathNode)
	 * @see face.datamodel.conceptual.ConceptualPackage#getParticipant_Path()
	 * @model containment="true"
	 * @generated
	 */
	PathNode getPath();

	/**
	 * Sets the value of the '{@link face.datamodel.conceptual.Participant#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathNode value);

} // Participant
