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
package face.datamodel;

import face.FacePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see face.datamodel.DatamodelFactory
 * @model kind="package"
 * @generated
 */
public interface DatamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengroup.us/face/datamodel/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatamodelPackage eINSTANCE = face.datamodel.impl.DatamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link face.datamodel.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.impl.DataModelImpl
	 * @see face.datamodel.impl.DatamodelPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NAME = FacePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DESCRIPTION = FacePackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cdm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__CDM = FacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ldm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__LDM = FacePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pdm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__PDM = FacePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = FacePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = FacePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.impl.ElementImpl
	 * @see face.datamodel.impl.DatamodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = FacePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = FacePackage.ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = FacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = FacePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.impl.ConceptualDataModelImpl <em>Conceptual Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.impl.ConceptualDataModelImpl
	 * @see face.datamodel.impl.DatamodelPackageImpl#getConceptualDataModel()
	 * @generated
	 */
	int CONCEPTUAL_DATA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_DATA_MODEL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_DATA_MODEL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_DATA_MODEL__ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cdm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_DATA_MODEL__CDM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_DATA_MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conceptual Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_DATA_MODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.impl.LogicalDataModelImpl <em>Logical Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.impl.LogicalDataModelImpl
	 * @see face.datamodel.impl.DatamodelPackageImpl#getLogicalDataModel()
	 * @generated
	 */
	int LOGICAL_DATA_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_MODEL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_MODEL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_MODEL__ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ldm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_MODEL__LDM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logical Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_MODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.impl.PlatformDataModelImpl <em>Platform Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.impl.PlatformDataModelImpl
	 * @see face.datamodel.impl.DatamodelPackageImpl#getPlatformDataModel()
	 * @generated
	 */
	int PLATFORM_DATA_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_MODEL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_MODEL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_MODEL__ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pdm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_MODEL__PDM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Platform Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Platform Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_MODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link face.datamodel.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see face.datamodel.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.DataModel#getCdm <em>Cdm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cdm</em>'.
	 * @see face.datamodel.DataModel#getCdm()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Cdm();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.DataModel#getLdm <em>Ldm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ldm</em>'.
	 * @see face.datamodel.DataModel#getLdm()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Ldm();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.DataModel#getPdm <em>Pdm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pdm</em>'.
	 * @see face.datamodel.DataModel#getPdm()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Pdm();

	/**
	 * Returns the meta object for class '{@link face.datamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see face.datamodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link face.datamodel.ConceptualDataModel <em>Conceptual Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Data Model</em>'.
	 * @see face.datamodel.ConceptualDataModel
	 * @generated
	 */
	EClass getConceptualDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.ConceptualDataModel#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see face.datamodel.ConceptualDataModel#getElement()
	 * @see #getConceptualDataModel()
	 * @generated
	 */
	EReference getConceptualDataModel_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.ConceptualDataModel#getCdm <em>Cdm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cdm</em>'.
	 * @see face.datamodel.ConceptualDataModel#getCdm()
	 * @see #getConceptualDataModel()
	 * @generated
	 */
	EReference getConceptualDataModel_Cdm();

	/**
	 * Returns the meta object for class '{@link face.datamodel.LogicalDataModel <em>Logical Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Data Model</em>'.
	 * @see face.datamodel.LogicalDataModel
	 * @generated
	 */
	EClass getLogicalDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.LogicalDataModel#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see face.datamodel.LogicalDataModel#getElement()
	 * @see #getLogicalDataModel()
	 * @generated
	 */
	EReference getLogicalDataModel_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.LogicalDataModel#getLdm <em>Ldm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ldm</em>'.
	 * @see face.datamodel.LogicalDataModel#getLdm()
	 * @see #getLogicalDataModel()
	 * @generated
	 */
	EReference getLogicalDataModel_Ldm();

	/**
	 * Returns the meta object for class '{@link face.datamodel.PlatformDataModel <em>Platform Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Data Model</em>'.
	 * @see face.datamodel.PlatformDataModel
	 * @generated
	 */
	EClass getPlatformDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.PlatformDataModel#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see face.datamodel.PlatformDataModel#getElement()
	 * @see #getPlatformDataModel()
	 * @generated
	 */
	EReference getPlatformDataModel_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.PlatformDataModel#getPdm <em>Pdm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pdm</em>'.
	 * @see face.datamodel.PlatformDataModel#getPdm()
	 * @see #getPlatformDataModel()
	 * @generated
	 */
	EReference getPlatformDataModel_Pdm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatamodelFactory getDatamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link face.datamodel.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.impl.DataModelImpl
		 * @see face.datamodel.impl.DatamodelPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Cdm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__CDM = eINSTANCE.getDataModel_Cdm();

		/**
		 * The meta object literal for the '<em><b>Ldm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__LDM = eINSTANCE.getDataModel_Ldm();

		/**
		 * The meta object literal for the '<em><b>Pdm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__PDM = eINSTANCE.getDataModel_Pdm();

		/**
		 * The meta object literal for the '{@link face.datamodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.impl.ElementImpl
		 * @see face.datamodel.impl.DatamodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link face.datamodel.impl.ConceptualDataModelImpl <em>Conceptual Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.impl.ConceptualDataModelImpl
		 * @see face.datamodel.impl.DatamodelPackageImpl#getConceptualDataModel()
		 * @generated
		 */
		EClass CONCEPTUAL_DATA_MODEL = eINSTANCE.getConceptualDataModel();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_DATA_MODEL__ELEMENT = eINSTANCE.getConceptualDataModel_Element();

		/**
		 * The meta object literal for the '<em><b>Cdm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_DATA_MODEL__CDM = eINSTANCE.getConceptualDataModel_Cdm();

		/**
		 * The meta object literal for the '{@link face.datamodel.impl.LogicalDataModelImpl <em>Logical Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.impl.LogicalDataModelImpl
		 * @see face.datamodel.impl.DatamodelPackageImpl#getLogicalDataModel()
		 * @generated
		 */
		EClass LOGICAL_DATA_MODEL = eINSTANCE.getLogicalDataModel();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DATA_MODEL__ELEMENT = eINSTANCE.getLogicalDataModel_Element();

		/**
		 * The meta object literal for the '<em><b>Ldm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DATA_MODEL__LDM = eINSTANCE.getLogicalDataModel_Ldm();

		/**
		 * The meta object literal for the '{@link face.datamodel.impl.PlatformDataModelImpl <em>Platform Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.impl.PlatformDataModelImpl
		 * @see face.datamodel.impl.DatamodelPackageImpl#getPlatformDataModel()
		 * @generated
		 */
		EClass PLATFORM_DATA_MODEL = eINSTANCE.getPlatformDataModel();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_DATA_MODEL__ELEMENT = eINSTANCE.getPlatformDataModel_Element();

		/**
		 * The meta object literal for the '<em><b>Pdm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_DATA_MODEL__PDM = eINSTANCE.getPlatformDataModel_Pdm();

	}

} //DatamodelPackage
