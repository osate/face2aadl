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
package org.osate.face31.uop.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.face31.uop.RAMMemoryRequirements;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAM Memory Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl#getHeapStackMin <em>Heap Stack Min</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl#getHeapStackMax <em>Heap Stack Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl#getHeapStackTypical <em>Heap Stack Typical</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl#getTextMax <em>Text Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl#getRoDataMax <em>Ro Data Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl#getDataMax <em>Data Max</em>}</li>
 *   <li>{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl#getBssMax <em>Bss Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RAMMemoryRequirementsImpl extends MinimalEObjectImpl.Container implements RAMMemoryRequirements {
	/**
	 * The default value of the '{@link #getHeapStackMin() <em>Heap Stack Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapStackMin()
	 * @generated
	 * @ordered
	 */
	protected static final int HEAP_STACK_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeapStackMin() <em>Heap Stack Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapStackMin()
	 * @generated
	 * @ordered
	 */
	protected int heapStackMin = HEAP_STACK_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeapStackMax() <em>Heap Stack Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapStackMax()
	 * @generated
	 * @ordered
	 */
	protected static final int HEAP_STACK_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeapStackMax() <em>Heap Stack Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapStackMax()
	 * @generated
	 * @ordered
	 */
	protected int heapStackMax = HEAP_STACK_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeapStackTypical() <em>Heap Stack Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapStackTypical()
	 * @generated
	 * @ordered
	 */
	protected static final int HEAP_STACK_TYPICAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeapStackTypical() <em>Heap Stack Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapStackTypical()
	 * @generated
	 * @ordered
	 */
	protected int heapStackTypical = HEAP_STACK_TYPICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextMax() <em>Text Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMax()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTextMax() <em>Text Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMax()
	 * @generated
	 * @ordered
	 */
	protected int textMax = TEXT_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoDataMax() <em>Ro Data Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoDataMax()
	 * @generated
	 * @ordered
	 */
	protected static final int RO_DATA_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoDataMax() <em>Ro Data Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoDataMax()
	 * @generated
	 * @ordered
	 */
	protected int roDataMax = RO_DATA_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataMax() <em>Data Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMax()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataMax() <em>Data Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMax()
	 * @generated
	 * @ordered
	 */
	protected int dataMax = DATA_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBssMax() <em>Bss Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBssMax()
	 * @generated
	 * @ordered
	 */
	protected static final int BSS_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBssMax() <em>Bss Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBssMax()
	 * @generated
	 * @ordered
	 */
	protected int bssMax = BSS_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAMMemoryRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.RAM_MEMORY_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeapStackMin() {
		return heapStackMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapStackMin(int newHeapStackMin) {
		int oldHeapStackMin = heapStackMin;
		heapStackMin = newHeapStackMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN, oldHeapStackMin, heapStackMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeapStackMax() {
		return heapStackMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapStackMax(int newHeapStackMax) {
		int oldHeapStackMax = heapStackMax;
		heapStackMax = newHeapStackMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX, oldHeapStackMax, heapStackMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeapStackTypical() {
		return heapStackTypical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapStackTypical(int newHeapStackTypical) {
		int oldHeapStackTypical = heapStackTypical;
		heapStackTypical = newHeapStackTypical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL, oldHeapStackTypical, heapStackTypical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTextMax() {
		return textMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextMax(int newTextMax) {
		int oldTextMax = textMax;
		textMax = newTextMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.RAM_MEMORY_REQUIREMENTS__TEXT_MAX, oldTextMax, textMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRoDataMax() {
		return roDataMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoDataMax(int newRoDataMax) {
		int oldRoDataMax = roDataMax;
		roDataMax = newRoDataMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX, oldRoDataMax, roDataMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDataMax() {
		return dataMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataMax(int newDataMax) {
		int oldDataMax = dataMax;
		dataMax = newDataMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.RAM_MEMORY_REQUIREMENTS__DATA_MAX, oldDataMax, dataMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBssMax() {
		return bssMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBssMax(int newBssMax) {
		int oldBssMax = bssMax;
		bssMax = newBssMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.RAM_MEMORY_REQUIREMENTS__BSS_MAX, oldBssMax, bssMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN:
				return getHeapStackMin();
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX:
				return getHeapStackMax();
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL:
				return getHeapStackTypical();
			case UopPackage.RAM_MEMORY_REQUIREMENTS__TEXT_MAX:
				return getTextMax();
			case UopPackage.RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX:
				return getRoDataMax();
			case UopPackage.RAM_MEMORY_REQUIREMENTS__DATA_MAX:
				return getDataMax();
			case UopPackage.RAM_MEMORY_REQUIREMENTS__BSS_MAX:
				return getBssMax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN:
				setHeapStackMin((Integer)newValue);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX:
				setHeapStackMax((Integer)newValue);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL:
				setHeapStackTypical((Integer)newValue);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__TEXT_MAX:
				setTextMax((Integer)newValue);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX:
				setRoDataMax((Integer)newValue);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__DATA_MAX:
				setDataMax((Integer)newValue);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__BSS_MAX:
				setBssMax((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN:
				setHeapStackMin(HEAP_STACK_MIN_EDEFAULT);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX:
				setHeapStackMax(HEAP_STACK_MAX_EDEFAULT);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL:
				setHeapStackTypical(HEAP_STACK_TYPICAL_EDEFAULT);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__TEXT_MAX:
				setTextMax(TEXT_MAX_EDEFAULT);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX:
				setRoDataMax(RO_DATA_MAX_EDEFAULT);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__DATA_MAX:
				setDataMax(DATA_MAX_EDEFAULT);
				return;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__BSS_MAX:
				setBssMax(BSS_MAX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN:
				return heapStackMin != HEAP_STACK_MIN_EDEFAULT;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX:
				return heapStackMax != HEAP_STACK_MAX_EDEFAULT;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL:
				return heapStackTypical != HEAP_STACK_TYPICAL_EDEFAULT;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__TEXT_MAX:
				return textMax != TEXT_MAX_EDEFAULT;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX:
				return roDataMax != RO_DATA_MAX_EDEFAULT;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__DATA_MAX:
				return dataMax != DATA_MAX_EDEFAULT;
			case UopPackage.RAM_MEMORY_REQUIREMENTS__BSS_MAX:
				return bssMax != BSS_MAX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (heapStackMin: ");
		result.append(heapStackMin);
		result.append(", heapStackMax: ");
		result.append(heapStackMax);
		result.append(", heapStackTypical: ");
		result.append(heapStackTypical);
		result.append(", textMax: ");
		result.append(textMax);
		result.append(", roDataMax: ");
		result.append(roDataMax);
		result.append(", dataMax: ");
		result.append(dataMax);
		result.append(", bssMax: ");
		result.append(bssMax);
		result.append(')');
		return result.toString();
	}

} //RAMMemoryRequirementsImpl
