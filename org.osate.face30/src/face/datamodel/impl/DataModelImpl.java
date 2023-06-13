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
package face.datamodel.impl;

import face.datamodel.ConceptualDataModel;
import face.datamodel.DataModel;
import face.datamodel.DatamodelPackage;
import face.datamodel.LogicalDataModel;
import face.datamodel.PlatformDataModel;

import face.impl.ElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.datamodel.impl.DataModelImpl#getCdm <em>Cdm</em>}</li>
 *   <li>{@link face.datamodel.impl.DataModelImpl#getLdm <em>Ldm</em>}</li>
 *   <li>{@link face.datamodel.impl.DataModelImpl#getPdm <em>Pdm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataModelImpl extends ElementImpl implements DataModel {
	/**
	 * The cached value of the '{@link #getCdm() <em>Cdm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdm()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualDataModel> cdm;

	/**
	 * The cached value of the '{@link #getLdm() <em>Ldm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdm()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalDataModel> ldm;

	/**
	 * The cached value of the '{@link #getPdm() <em>Pdm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdm()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformDataModel> pdm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualDataModel> getCdm() {
		if (cdm == null) {
			cdm = new EObjectContainmentEList<ConceptualDataModel>(ConceptualDataModel.class, this, DatamodelPackage.DATA_MODEL__CDM);
		}
		return cdm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalDataModel> getLdm() {
		if (ldm == null) {
			ldm = new EObjectContainmentEList<LogicalDataModel>(LogicalDataModel.class, this, DatamodelPackage.DATA_MODEL__LDM);
		}
		return ldm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformDataModel> getPdm() {
		if (pdm == null) {
			pdm = new EObjectContainmentEList<PlatformDataModel>(PlatformDataModel.class, this, DatamodelPackage.DATA_MODEL__PDM);
		}
		return pdm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.DATA_MODEL__CDM:
				return ((InternalEList<?>)getCdm()).basicRemove(otherEnd, msgs);
			case DatamodelPackage.DATA_MODEL__LDM:
				return ((InternalEList<?>)getLdm()).basicRemove(otherEnd, msgs);
			case DatamodelPackage.DATA_MODEL__PDM:
				return ((InternalEList<?>)getPdm()).basicRemove(otherEnd, msgs);
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
			case DatamodelPackage.DATA_MODEL__CDM:
				return getCdm();
			case DatamodelPackage.DATA_MODEL__LDM:
				return getLdm();
			case DatamodelPackage.DATA_MODEL__PDM:
				return getPdm();
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
			case DatamodelPackage.DATA_MODEL__CDM:
				getCdm().clear();
				getCdm().addAll((Collection<? extends ConceptualDataModel>)newValue);
				return;
			case DatamodelPackage.DATA_MODEL__LDM:
				getLdm().clear();
				getLdm().addAll((Collection<? extends LogicalDataModel>)newValue);
				return;
			case DatamodelPackage.DATA_MODEL__PDM:
				getPdm().clear();
				getPdm().addAll((Collection<? extends PlatformDataModel>)newValue);
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
			case DatamodelPackage.DATA_MODEL__CDM:
				getCdm().clear();
				return;
			case DatamodelPackage.DATA_MODEL__LDM:
				getLdm().clear();
				return;
			case DatamodelPackage.DATA_MODEL__PDM:
				getPdm().clear();
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
			case DatamodelPackage.DATA_MODEL__CDM:
				return cdm != null && !cdm.isEmpty();
			case DatamodelPackage.DATA_MODEL__LDM:
				return ldm != null && !ldm.isEmpty();
			case DatamodelPackage.DATA_MODEL__PDM:
				return pdm != null && !pdm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataModelImpl
