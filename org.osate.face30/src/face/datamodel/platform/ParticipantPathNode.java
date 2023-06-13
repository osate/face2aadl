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
package face.datamodel.platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Path Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.platform.ParticipantPathNode#getProjectedParticipant <em>Projected Participant</em>}</li>
 * </ul>
 *
 * @see face.datamodel.platform.PlatformPackage#getParticipantPathNode()
 * @model
 * @generated
 */
public interface ParticipantPathNode extends PathNode {
	/**
	 * Returns the value of the '<em><b>Projected Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projected Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projected Participant</em>' reference.
	 * @see #setProjectedParticipant(Participant)
	 * @see face.datamodel.platform.PlatformPackage#getParticipantPathNode_ProjectedParticipant()
	 * @model required="true"
	 * @generated
	 */
	Participant getProjectedParticipant();

	/**
	 * Sets the value of the '{@link face.datamodel.platform.ParticipantPathNode#getProjectedParticipant <em>Projected Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected Participant</em>' reference.
	 * @see #getProjectedParticipant()
	 * @generated
	 */
	void setProjectedParticipant(Participant value);

} // ParticipantPathNode
