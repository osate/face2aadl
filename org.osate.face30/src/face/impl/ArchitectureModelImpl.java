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
package face.impl;

import face.ArchitectureModel;
import face.FacePackage;

import face.datamodel.DataModel;

import face.integration.IntegrationModel;

import face.traceability.TraceabilityModel;

import face.uop.UoPModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.impl.ArchitectureModelImpl#getDm <em>Dm</em>}</li>
 *   <li>{@link face.impl.ArchitectureModelImpl#getUm <em>Um</em>}</li>
 *   <li>{@link face.impl.ArchitectureModelImpl#getIm <em>Im</em>}</li>
 *   <li>{@link face.impl.ArchitectureModelImpl#getTm <em>Tm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureModelImpl extends ElementImpl implements ArchitectureModel {
	/**
	 * The cached value of the '{@link #getDm() <em>Dm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDm()
	 * @generated
	 * @ordered
	 */
	protected EList<DataModel> dm;

	/**
	 * The cached value of the '{@link #getUm() <em>Um</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUm()
	 * @generated
	 * @ordered
	 */
	protected EList<UoPModel> um;

	/**
	 * The cached value of the '{@link #getIm() <em>Im</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrationModel> im;

	/**
	 * The cached value of the '{@link #getTm() <em>Tm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTm()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceabilityModel> tm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacePackage.Literals.ARCHITECTURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataModel> getDm() {
		if (dm == null) {
			dm = new EObjectContainmentEList<DataModel>(DataModel.class, this, FacePackage.ARCHITECTURE_MODEL__DM);
		}
		return dm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UoPModel> getUm() {
		if (um == null) {
			um = new EObjectContainmentEList<UoPModel>(UoPModel.class, this, FacePackage.ARCHITECTURE_MODEL__UM);
		}
		return um;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrationModel> getIm() {
		if (im == null) {
			im = new EObjectContainmentEList<IntegrationModel>(IntegrationModel.class, this, FacePackage.ARCHITECTURE_MODEL__IM);
		}
		return im;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceabilityModel> getTm() {
		if (tm == null) {
			tm = new EObjectContainmentEList<TraceabilityModel>(TraceabilityModel.class, this, FacePackage.ARCHITECTURE_MODEL__TM);
		}
		return tm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FacePackage.ARCHITECTURE_MODEL__DM:
				return ((InternalEList<?>)getDm()).basicRemove(otherEnd, msgs);
			case FacePackage.ARCHITECTURE_MODEL__UM:
				return ((InternalEList<?>)getUm()).basicRemove(otherEnd, msgs);
			case FacePackage.ARCHITECTURE_MODEL__IM:
				return ((InternalEList<?>)getIm()).basicRemove(otherEnd, msgs);
			case FacePackage.ARCHITECTURE_MODEL__TM:
				return ((InternalEList<?>)getTm()).basicRemove(otherEnd, msgs);
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
			case FacePackage.ARCHITECTURE_MODEL__DM:
				return getDm();
			case FacePackage.ARCHITECTURE_MODEL__UM:
				return getUm();
			case FacePackage.ARCHITECTURE_MODEL__IM:
				return getIm();
			case FacePackage.ARCHITECTURE_MODEL__TM:
				return getTm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FacePackage.ARCHITECTURE_MODEL__DM:
				getDm().clear();
				getDm().addAll((Collection<? extends DataModel>)newValue);
				return;
			case FacePackage.ARCHITECTURE_MODEL__UM:
				getUm().clear();
				getUm().addAll((Collection<? extends UoPModel>)newValue);
				return;
			case FacePackage.ARCHITECTURE_MODEL__IM:
				getIm().clear();
				getIm().addAll((Collection<? extends IntegrationModel>)newValue);
				return;
			case FacePackage.ARCHITECTURE_MODEL__TM:
				getTm().clear();
				getTm().addAll((Collection<? extends TraceabilityModel>)newValue);
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
			case FacePackage.ARCHITECTURE_MODEL__DM:
				getDm().clear();
				return;
			case FacePackage.ARCHITECTURE_MODEL__UM:
				getUm().clear();
				return;
			case FacePackage.ARCHITECTURE_MODEL__IM:
				getIm().clear();
				return;
			case FacePackage.ARCHITECTURE_MODEL__TM:
				getTm().clear();
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
			case FacePackage.ARCHITECTURE_MODEL__DM:
				return dm != null && !dm.isEmpty();
			case FacePackage.ARCHITECTURE_MODEL__UM:
				return um != null && !um.isEmpty();
			case FacePackage.ARCHITECTURE_MODEL__IM:
				return im != null && !im.isEmpty();
			case FacePackage.ARCHITECTURE_MODEL__TM:
				return tm != null && !tm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureModelImpl
