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
package face.uop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link face.uop.Thread#getPeriod <em>Period</em>}</li>
 *   <li>{@link face.uop.Thread#getTimeCapacity <em>Time Capacity</em>}</li>
 *   <li>{@link face.uop.Thread#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link face.uop.Thread#getRelativeCoreAffinity <em>Relative Core Affinity</em>}</li>
 *   <li>{@link face.uop.Thread#getThreadType <em>Thread Type</em>}</li>
 * </ul>
 *
 * @see face.uop.UopPackage#getThread()
 * @model
 * @generated
 */
public interface Thread extends EObject {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(float)
	 * @see face.uop.UopPackage#getThread_Period()
	 * @model required="true"
	 * @generated
	 */
	float getPeriod();

	/**
	 * Sets the value of the '{@link face.uop.Thread#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(float value);

	/**
	 * Returns the value of the '<em><b>Time Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Capacity</em>' attribute.
	 * @see #setTimeCapacity(float)
	 * @see face.uop.UopPackage#getThread_TimeCapacity()
	 * @model required="true"
	 * @generated
	 */
	float getTimeCapacity();

	/**
	 * Sets the value of the '{@link face.uop.Thread#getTimeCapacity <em>Time Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Capacity</em>' attribute.
	 * @see #getTimeCapacity()
	 * @generated
	 */
	void setTimeCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Priority</em>' attribute.
	 * @see #setRelativePriority(int)
	 * @see face.uop.UopPackage#getThread_RelativePriority()
	 * @model required="true"
	 * @generated
	 */
	int getRelativePriority();

	/**
	 * Sets the value of the '{@link face.uop.Thread#getRelativePriority <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Priority</em>' attribute.
	 * @see #getRelativePriority()
	 * @generated
	 */
	void setRelativePriority(int value);

	/**
	 * Returns the value of the '<em><b>Relative Core Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Core Affinity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Core Affinity</em>' attribute.
	 * @see #setRelativeCoreAffinity(int)
	 * @see face.uop.UopPackage#getThread_RelativeCoreAffinity()
	 * @model required="true"
	 * @generated
	 */
	int getRelativeCoreAffinity();

	/**
	 * Sets the value of the '{@link face.uop.Thread#getRelativeCoreAffinity <em>Relative Core Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Core Affinity</em>' attribute.
	 * @see #getRelativeCoreAffinity()
	 * @generated
	 */
	void setRelativeCoreAffinity(int value);

	/**
	 * Returns the value of the '<em><b>Thread Type</b></em>' attribute.
	 * The literals are from the enumeration {@link face.uop.ThreadType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Type</em>' attribute.
	 * @see face.uop.ThreadType
	 * @see #setThreadType(ThreadType)
	 * @see face.uop.UopPackage#getThread_ThreadType()
	 * @model required="true"
	 * @generated
	 */
	ThreadType getThreadType();

	/**
	 * Sets the value of the '{@link face.uop.Thread#getThreadType <em>Thread Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Type</em>' attribute.
	 * @see face.uop.ThreadType
	 * @see #getThreadType()
	 * @generated
	 */
	void setThreadType(ThreadType value);

} // Thread
