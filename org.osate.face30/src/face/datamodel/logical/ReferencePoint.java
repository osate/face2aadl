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

import face.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.logical.ReferencePoint#getReferencePointPart <em>Reference Point Part</em>}</li>
 *   <li>{@link face.datamodel.logical.ReferencePoint#getLandmark <em>Landmark</em>}</li>
 * </ul>
 *
 * @see face.datamodel.logical.LogicalPackage#getReferencePoint()
 * @model
 * @generated
 */
public interface ReferencePoint extends Element {
	/**
	 * Returns the value of the '<em><b>Reference Point Part</b></em>' containment reference list.
	 * The list contents are of type {@link face.datamodel.logical.ReferencePointPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Point Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Point Part</em>' containment reference list.
	 * @see face.datamodel.logical.LogicalPackage#getReferencePoint_ReferencePointPart()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ReferencePointPart> getReferencePointPart();

	/**
	 * Returns the value of the '<em><b>Landmark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Landmark</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landmark</em>' reference.
	 * @see #setLandmark(Landmark)
	 * @see face.datamodel.logical.LogicalPackage#getReferencePoint_Landmark()
	 * @model required="true"
	 * @generated
	 */
	Landmark getLandmark();

	/**
	 * Sets the value of the '{@link face.datamodel.logical.ReferencePoint#getLandmark <em>Landmark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landmark</em>' reference.
	 * @see #getLandmark()
	 * @generated
	 */
	void setLandmark(Landmark value);

} // ReferencePoint
