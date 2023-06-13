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
package face.traceability;

import face.uop.AbstractUoP;
import face.uop.UnitOfPortability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uo PTraceability Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.traceability.UoPTraceabilitySet#getUop <em>Uop</em>}</li>
 *   <li>{@link face.traceability.UoPTraceabilitySet#getAbstractUoP <em>Abstract Uo P</em>}</li>
 * </ul>
 *
 * @see face.traceability.TraceabilityPackage#getUoPTraceabilitySet()
 * @model
 * @generated
 */
public interface UoPTraceabilitySet extends Element, TraceableElement {
	/**
	 * Returns the value of the '<em><b>Uop</b></em>' reference list.
	 * The list contents are of type {@link face.uop.UnitOfPortability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uop</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uop</em>' reference list.
	 * @see face.traceability.TraceabilityPackage#getUoPTraceabilitySet_Uop()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UnitOfPortability> getUop();

	/**
	 * Returns the value of the '<em><b>Abstract Uo P</b></em>' reference list.
	 * The list contents are of type {@link face.uop.AbstractUoP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Uo P</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Uo P</em>' reference list.
	 * @see face.traceability.TraceabilityPackage#getUoPTraceabilitySet_AbstractUoP()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractUoP> getAbstractUoP();

} // UoPTraceabilitySet
