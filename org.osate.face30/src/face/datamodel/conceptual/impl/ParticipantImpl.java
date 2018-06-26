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
package face.datamodel.conceptual.impl;

import face.datamodel.conceptual.ConceptualPackage;
import face.datamodel.conceptual.Entity;
import face.datamodel.conceptual.Participant;
import face.datamodel.conceptual.PathNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.conceptual.impl.ParticipantImpl#getType <em>Type</em>}</li>
 *   <li>{@link face.datamodel.conceptual.impl.ParticipantImpl#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link face.datamodel.conceptual.impl.ParticipantImpl#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link face.datamodel.conceptual.impl.ParticipantImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends CharacteristicImpl implements Participant {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Entity type;

	/**
	 * The default value of the '{@link #getSourceLowerBound() <em>Source Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourceLowerBound() <em>Source Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int sourceLowerBound = SOURCE_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceUpperBound() <em>Source Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_UPPER_BOUND_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSourceUpperBound() <em>Source Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int sourceUpperBound = SOURCE_UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected PathNode path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Entity)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConceptualPackage.PARTICIPANT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Entity newType) {
		Entity oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.PARTICIPANT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceLowerBound() {
		return sourceLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLowerBound(int newSourceLowerBound) {
		int oldSourceLowerBound = sourceLowerBound;
		sourceLowerBound = newSourceLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.PARTICIPANT__SOURCE_LOWER_BOUND, oldSourceLowerBound, sourceLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceUpperBound() {
		return sourceUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUpperBound(int newSourceUpperBound) {
		int oldSourceUpperBound = sourceUpperBound;
		sourceUpperBound = newSourceUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.PARTICIPANT__SOURCE_UPPER_BOUND, oldSourceUpperBound, sourceUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathNode getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(PathNode newPath, NotificationChain msgs) {
		PathNode oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConceptualPackage.PARTICIPANT__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(PathNode newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConceptualPackage.PARTICIPANT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConceptualPackage.PARTICIPANT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.PARTICIPANT__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.PARTICIPANT__PATH:
				return basicSetPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConceptualPackage.PARTICIPANT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ConceptualPackage.PARTICIPANT__SOURCE_LOWER_BOUND:
				return getSourceLowerBound();
			case ConceptualPackage.PARTICIPANT__SOURCE_UPPER_BOUND:
				return getSourceUpperBound();
			case ConceptualPackage.PARTICIPANT__PATH:
				return getPath();
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
			case ConceptualPackage.PARTICIPANT__TYPE:
				setType((Entity)newValue);
				return;
			case ConceptualPackage.PARTICIPANT__SOURCE_LOWER_BOUND:
				setSourceLowerBound((Integer)newValue);
				return;
			case ConceptualPackage.PARTICIPANT__SOURCE_UPPER_BOUND:
				setSourceUpperBound((Integer)newValue);
				return;
			case ConceptualPackage.PARTICIPANT__PATH:
				setPath((PathNode)newValue);
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
			case ConceptualPackage.PARTICIPANT__TYPE:
				setType((Entity)null);
				return;
			case ConceptualPackage.PARTICIPANT__SOURCE_LOWER_BOUND:
				setSourceLowerBound(SOURCE_LOWER_BOUND_EDEFAULT);
				return;
			case ConceptualPackage.PARTICIPANT__SOURCE_UPPER_BOUND:
				setSourceUpperBound(SOURCE_UPPER_BOUND_EDEFAULT);
				return;
			case ConceptualPackage.PARTICIPANT__PATH:
				setPath((PathNode)null);
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
			case ConceptualPackage.PARTICIPANT__TYPE:
				return type != null;
			case ConceptualPackage.PARTICIPANT__SOURCE_LOWER_BOUND:
				return sourceLowerBound != SOURCE_LOWER_BOUND_EDEFAULT;
			case ConceptualPackage.PARTICIPANT__SOURCE_UPPER_BOUND:
				return sourceUpperBound != SOURCE_UPPER_BOUND_EDEFAULT;
			case ConceptualPackage.PARTICIPANT__PATH:
				return path != null;
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
		result.append(" (sourceLowerBound: ");
		result.append(sourceLowerBound);
		result.append(", sourceUpperBound: ");
		result.append(sourceUpperBound);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
