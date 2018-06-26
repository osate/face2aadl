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
package face.uop.impl;

import face.uop.ThreadType;
import face.uop.UopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.uop.impl.ThreadImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link face.uop.impl.ThreadImpl#getTimeCapacity <em>Time Capacity</em>}</li>
 *   <li>{@link face.uop.impl.ThreadImpl#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link face.uop.impl.ThreadImpl#getRelativeCoreAffinity <em>Relative Core Affinity</em>}</li>
 *   <li>{@link face.uop.impl.ThreadImpl#getThreadType <em>Thread Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadImpl extends MinimalEObjectImpl.Container implements face.uop.Thread {
	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected float period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeCapacity() <em>Time Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeCapacity() <em>Time Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCapacity()
	 * @generated
	 * @ordered
	 */
	protected float timeCapacity = TIME_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected static final int RELATIVE_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected int relativePriority = RELATIVE_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeCoreAffinity() <em>Relative Core Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeCoreAffinity()
	 * @generated
	 * @ordered
	 */
	protected static final int RELATIVE_CORE_AFFINITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelativeCoreAffinity() <em>Relative Core Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeCoreAffinity()
	 * @generated
	 * @ordered
	 */
	protected int relativeCoreAffinity = RELATIVE_CORE_AFFINITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadType() <em>Thread Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadType()
	 * @generated
	 * @ordered
	 */
	protected static final ThreadType THREAD_TYPE_EDEFAULT = ThreadType.FOREGROUND;

	/**
	 * The cached value of the '{@link #getThreadType() <em>Thread Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadType()
	 * @generated
	 * @ordered
	 */
	protected ThreadType threadType = THREAD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(float newPeriod) {
		float oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.THREAD__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeCapacity() {
		return timeCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCapacity(float newTimeCapacity) {
		float oldTimeCapacity = timeCapacity;
		timeCapacity = newTimeCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.THREAD__TIME_CAPACITY, oldTimeCapacity, timeCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelativePriority() {
		return relativePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePriority(int newRelativePriority) {
		int oldRelativePriority = relativePriority;
		relativePriority = newRelativePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.THREAD__RELATIVE_PRIORITY, oldRelativePriority, relativePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelativeCoreAffinity() {
		return relativeCoreAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeCoreAffinity(int newRelativeCoreAffinity) {
		int oldRelativeCoreAffinity = relativeCoreAffinity;
		relativeCoreAffinity = newRelativeCoreAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.THREAD__RELATIVE_CORE_AFFINITY, oldRelativeCoreAffinity, relativeCoreAffinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadType getThreadType() {
		return threadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadType(ThreadType newThreadType) {
		ThreadType oldThreadType = threadType;
		threadType = newThreadType == null ? THREAD_TYPE_EDEFAULT : newThreadType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.THREAD__THREAD_TYPE, oldThreadType, threadType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UopPackage.THREAD__PERIOD:
				return getPeriod();
			case UopPackage.THREAD__TIME_CAPACITY:
				return getTimeCapacity();
			case UopPackage.THREAD__RELATIVE_PRIORITY:
				return getRelativePriority();
			case UopPackage.THREAD__RELATIVE_CORE_AFFINITY:
				return getRelativeCoreAffinity();
			case UopPackage.THREAD__THREAD_TYPE:
				return getThreadType();
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
			case UopPackage.THREAD__PERIOD:
				setPeriod((Float)newValue);
				return;
			case UopPackage.THREAD__TIME_CAPACITY:
				setTimeCapacity((Float)newValue);
				return;
			case UopPackage.THREAD__RELATIVE_PRIORITY:
				setRelativePriority((Integer)newValue);
				return;
			case UopPackage.THREAD__RELATIVE_CORE_AFFINITY:
				setRelativeCoreAffinity((Integer)newValue);
				return;
			case UopPackage.THREAD__THREAD_TYPE:
				setThreadType((ThreadType)newValue);
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
			case UopPackage.THREAD__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case UopPackage.THREAD__TIME_CAPACITY:
				setTimeCapacity(TIME_CAPACITY_EDEFAULT);
				return;
			case UopPackage.THREAD__RELATIVE_PRIORITY:
				setRelativePriority(RELATIVE_PRIORITY_EDEFAULT);
				return;
			case UopPackage.THREAD__RELATIVE_CORE_AFFINITY:
				setRelativeCoreAffinity(RELATIVE_CORE_AFFINITY_EDEFAULT);
				return;
			case UopPackage.THREAD__THREAD_TYPE:
				setThreadType(THREAD_TYPE_EDEFAULT);
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
			case UopPackage.THREAD__PERIOD:
				return period != PERIOD_EDEFAULT;
			case UopPackage.THREAD__TIME_CAPACITY:
				return timeCapacity != TIME_CAPACITY_EDEFAULT;
			case UopPackage.THREAD__RELATIVE_PRIORITY:
				return relativePriority != RELATIVE_PRIORITY_EDEFAULT;
			case UopPackage.THREAD__RELATIVE_CORE_AFFINITY:
				return relativeCoreAffinity != RELATIVE_CORE_AFFINITY_EDEFAULT;
			case UopPackage.THREAD__THREAD_TYPE:
				return threadType != THREAD_TYPE_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (period: ");
		result.append(period);
		result.append(", timeCapacity: ");
		result.append(timeCapacity);
		result.append(", relativePriority: ");
		result.append(relativePriority);
		result.append(", relativeCoreAffinity: ");
		result.append(relativeCoreAffinity);
		result.append(", threadType: ");
		result.append(threadType);
		result.append(')');
		return result.toString();
	}

} //ThreadImpl
