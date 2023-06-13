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
package org.osate.face31.uop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAM Memory Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMin <em>Heap Stack Min</em>}</li>
 *   <li>{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMax <em>Heap Stack Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackTypical <em>Heap Stack Typical</em>}</li>
 *   <li>{@link org.osate.face31.uop.RAMMemoryRequirements#getTextMax <em>Text Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.RAMMemoryRequirements#getRoDataMax <em>Ro Data Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.RAMMemoryRequirements#getDataMax <em>Data Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.RAMMemoryRequirements#getBssMax <em>Bss Max</em>}</li>
 * </ul>
 *
 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements()
 * @model
 * @generated
 */
public interface RAMMemoryRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Heap Stack Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heap Stack Min</em>' attribute.
	 * @see #setHeapStackMin(int)
	 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements_HeapStackMin()
	 * @model
	 * @generated
	 */
	int getHeapStackMin();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMin <em>Heap Stack Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Stack Min</em>' attribute.
	 * @see #getHeapStackMin()
	 * @generated
	 */
	void setHeapStackMin(int value);

	/**
	 * Returns the value of the '<em><b>Heap Stack Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heap Stack Max</em>' attribute.
	 * @see #setHeapStackMax(int)
	 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements_HeapStackMax()
	 * @model
	 * @generated
	 */
	int getHeapStackMax();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMax <em>Heap Stack Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Stack Max</em>' attribute.
	 * @see #getHeapStackMax()
	 * @generated
	 */
	void setHeapStackMax(int value);

	/**
	 * Returns the value of the '<em><b>Heap Stack Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heap Stack Typical</em>' attribute.
	 * @see #setHeapStackTypical(int)
	 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements_HeapStackTypical()
	 * @model
	 * @generated
	 */
	int getHeapStackTypical();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackTypical <em>Heap Stack Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Stack Typical</em>' attribute.
	 * @see #getHeapStackTypical()
	 * @generated
	 */
	void setHeapStackTypical(int value);

	/**
	 * Returns the value of the '<em><b>Text Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Max</em>' attribute.
	 * @see #setTextMax(int)
	 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements_TextMax()
	 * @model
	 * @generated
	 */
	int getTextMax();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.RAMMemoryRequirements#getTextMax <em>Text Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Max</em>' attribute.
	 * @see #getTextMax()
	 * @generated
	 */
	void setTextMax(int value);

	/**
	 * Returns the value of the '<em><b>Ro Data Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ro Data Max</em>' attribute.
	 * @see #setRoDataMax(int)
	 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements_RoDataMax()
	 * @model
	 * @generated
	 */
	int getRoDataMax();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.RAMMemoryRequirements#getRoDataMax <em>Ro Data Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ro Data Max</em>' attribute.
	 * @see #getRoDataMax()
	 * @generated
	 */
	void setRoDataMax(int value);

	/**
	 * Returns the value of the '<em><b>Data Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Max</em>' attribute.
	 * @see #setDataMax(int)
	 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements_DataMax()
	 * @model
	 * @generated
	 */
	int getDataMax();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.RAMMemoryRequirements#getDataMax <em>Data Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Max</em>' attribute.
	 * @see #getDataMax()
	 * @generated
	 */
	void setDataMax(int value);

	/**
	 * Returns the value of the '<em><b>Bss Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bss Max</em>' attribute.
	 * @see #setBssMax(int)
	 * @see org.osate.face31.uop.UopPackage#getRAMMemoryRequirements_BssMax()
	 * @model
	 * @generated
	 */
	int getBssMax();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.RAMMemoryRequirements#getBssMax <em>Bss Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bss Max</em>' attribute.
	 * @see #getBssMax()
	 * @generated
	 */
	void setBssMax(int value);

} // RAMMemoryRequirements
