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
package org.osate.datamodel10.conceptual;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.datamodel10.DatamodelPackage;

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
 * @see org.osate.datamodel10.conceptual.ConceptualFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptualPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conceptual";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengroup.us/datamodel/conceptual/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conceptual";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptualPackage eINSTANCE = org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.ElementImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = DatamodelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = DatamodelPackage.ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = DatamodelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = DatamodelPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.ComposableElementImpl <em>Composable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.ComposableElementImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getComposableElement()
	 * @generated
	 */
	int COMPOSABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Composable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.BasisElementImpl <em>Basis Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.BasisElementImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getBasisElement()
	 * @generated
	 */
	int BASIS_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ELEMENT__NAME = COMPOSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ELEMENT__DESCRIPTION = COMPOSABLE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Basis Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ELEMENT_FEATURE_COUNT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basis Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ELEMENT_OPERATION_COUNT = COMPOSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.BasisEntityImpl <em>Basis Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.BasisEntityImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getBasisEntity()
	 * @generated
	 */
	int BASIS_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ENTITY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Basis Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basis Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_ENTITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.DomainImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Basis Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__BASIS_ENTITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.ObservableImpl <em>Observable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.ObservableImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getObservable()
	 * @generated
	 */
	int OBSERVABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVABLE__NAME = BASIS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVABLE__DESCRIPTION = BASIS_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Observable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVABLE_FEATURE_COUNT = BASIS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Observable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVABLE_OPERATION_COUNT = BASIS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.CharacteristicImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 6;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ROLENAME = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__SPECIALIZES = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.EntityImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = COMPOSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = COMPOSABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMPOSITION = COMPOSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = COMPOSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basis Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BASIS_ENTITY = COMPOSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = COMPOSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.CompositionImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 8;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__ROLENAME = CHARACTERISTIC__ROLENAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__LOWER_BOUND = CHARACTERISTIC__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__UPPER_BOUND = CHARACTERISTIC__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SPECIALIZES = CHARACTERISTIC__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__DESCRIPTION = CHARACTERISTIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TYPE = CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.AssociationImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMPOSITION = ENTITY__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SPECIALIZES = ENTITY__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Basis Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BASIS_ENTITY = ENTITY__BASIS_ENTITY;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PARTICIPANT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.ParticipantImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 10;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ROLENAME = CHARACTERISTIC__ROLENAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__LOWER_BOUND = CHARACTERISTIC__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__UPPER_BOUND = CHARACTERISTIC__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SPECIALIZES = CHARACTERISTIC__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DESCRIPTION = CHARACTERISTIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__TYPE = CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SOURCE_LOWER_BOUND = CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SOURCE_UPPER_BOUND = CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PATH = CHARACTERISTIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = CHARACTERISTIC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.PathNodeImpl <em>Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.PathNodeImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getPathNode()
	 * @generated
	 */
	int PATH_NODE = 11;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__NODE = 0;

	/**
	 * The number of structural features of the '<em>Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.ParticipantPathNodeImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getParticipantPathNode()
	 * @generated
	 */
	int PARTICIPANT_PATH_NODE = 12;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE__NODE = PATH_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Projected Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Participant Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Participant Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE_OPERATION_COUNT = PATH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.CharacteristicPathNodeImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getCharacteristicPathNode()
	 * @generated
	 */
	int CHARACTERISTIC_PATH_NODE = 13;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE__NODE = PATH_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Projected Characteristic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristic Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Characteristic Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE_OPERATION_COUNT = PATH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.ViewImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.QueryImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DESCRIPTION = VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SPECIFICATION = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.CompositeQueryImpl <em>Composite Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.CompositeQueryImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getCompositeQuery()
	 * @generated
	 */
	int COMPOSITE_QUERY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__COMPOSITION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__IS_UNION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.conceptual.impl.QueryCompositionImpl <em>Query Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.conceptual.impl.QueryCompositionImpl
	 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getQueryComposition()
	 * @generated
	 */
	int QUERY_COMPOSITION = 17;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION__ROLENAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Query Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.osate.datamodel10.conceptual.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composable Element</em>'.
	 * @see org.osate.datamodel10.conceptual.ComposableElement
	 * @generated
	 */
	EClass getComposableElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.BasisElement <em>Basis Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basis Element</em>'.
	 * @see org.osate.datamodel10.conceptual.BasisElement
	 * @generated
	 */
	EClass getBasisElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.BasisEntity <em>Basis Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basis Entity</em>'.
	 * @see org.osate.datamodel10.conceptual.BasisEntity
	 * @generated
	 */
	EClass getBasisEntity();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.osate.datamodel10.conceptual.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.conceptual.Domain#getBasisEntity <em>Basis Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basis Entity</em>'.
	 * @see org.osate.datamodel10.conceptual.Domain#getBasisEntity()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_BasisEntity();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Observable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observable</em>'.
	 * @see org.osate.datamodel10.conceptual.Observable
	 * @generated
	 */
	EClass getObservable();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see org.osate.datamodel10.conceptual.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.Characteristic#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.conceptual.Characteristic#getRolename()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Rolename();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.Characteristic#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.osate.datamodel10.conceptual.Characteristic#getLowerBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.Characteristic#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.osate.datamodel10.conceptual.Characteristic#getUpperBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.conceptual.Characteristic#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see org.osate.datamodel10.conceptual.Characteristic#getSpecializes()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Specializes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.Characteristic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.osate.datamodel10.conceptual.Characteristic#getDescription()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Description();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.osate.datamodel10.conceptual.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.conceptual.Entity#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.osate.datamodel10.conceptual.Entity#getComposition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Composition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.conceptual.Entity#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see org.osate.datamodel10.conceptual.Entity#getSpecializes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Specializes();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.conceptual.Entity#getBasisEntity <em>Basis Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basis Entity</em>'.
	 * @see org.osate.datamodel10.conceptual.Entity#getBasisEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_BasisEntity();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see org.osate.datamodel10.conceptual.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.conceptual.Composition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.conceptual.Composition#getType()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Type();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.osate.datamodel10.conceptual.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.conceptual.Association#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.osate.datamodel10.conceptual.Association#getParticipant()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Participant();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.osate.datamodel10.conceptual.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.conceptual.Participant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.conceptual.Participant#getType()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.Participant#getSourceLowerBound <em>Source Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Lower Bound</em>'.
	 * @see org.osate.datamodel10.conceptual.Participant#getSourceLowerBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.Participant#getSourceUpperBound <em>Source Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Upper Bound</em>'.
	 * @see org.osate.datamodel10.conceptual.Participant#getSourceUpperBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceUpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.datamodel10.conceptual.Participant#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.osate.datamodel10.conceptual.Participant#getPath()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Path();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Node</em>'.
	 * @see org.osate.datamodel10.conceptual.PathNode
	 * @generated
	 */
	EClass getPathNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.datamodel10.conceptual.PathNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.osate.datamodel10.conceptual.PathNode#getNode()
	 * @see #getPathNode()
	 * @generated
	 */
	EReference getPathNode_Node();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Path Node</em>'.
	 * @see org.osate.datamodel10.conceptual.ParticipantPathNode
	 * @generated
	 */
	EClass getParticipantPathNode();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.conceptual.ParticipantPathNode#getProjectedParticipant <em>Projected Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Participant</em>'.
	 * @see org.osate.datamodel10.conceptual.ParticipantPathNode#getProjectedParticipant()
	 * @see #getParticipantPathNode()
	 * @generated
	 */
	EReference getParticipantPathNode_ProjectedParticipant();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Path Node</em>'.
	 * @see org.osate.datamodel10.conceptual.CharacteristicPathNode
	 * @generated
	 */
	EClass getCharacteristicPathNode();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.conceptual.CharacteristicPathNode#getProjectedCharacteristic <em>Projected Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Characteristic</em>'.
	 * @see org.osate.datamodel10.conceptual.CharacteristicPathNode#getProjectedCharacteristic()
	 * @see #getCharacteristicPathNode()
	 * @generated
	 */
	EReference getCharacteristicPathNode_ProjectedCharacteristic();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.osate.datamodel10.conceptual.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.osate.datamodel10.conceptual.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.Query#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.osate.datamodel10.conceptual.Query#getSpecification()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Specification();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.CompositeQuery <em>Composite Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Query</em>'.
	 * @see org.osate.datamodel10.conceptual.CompositeQuery
	 * @generated
	 */
	EClass getCompositeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.conceptual.CompositeQuery#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.osate.datamodel10.conceptual.CompositeQuery#getComposition()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EReference getCompositeQuery_Composition();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.CompositeQuery#isIsUnion <em>Is Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Union</em>'.
	 * @see org.osate.datamodel10.conceptual.CompositeQuery#isIsUnion()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EAttribute getCompositeQuery_IsUnion();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.conceptual.QueryComposition <em>Query Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Composition</em>'.
	 * @see org.osate.datamodel10.conceptual.QueryComposition
	 * @generated
	 */
	EClass getQueryComposition();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.conceptual.QueryComposition#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.conceptual.QueryComposition#getRolename()
	 * @see #getQueryComposition()
	 * @generated
	 */
	EAttribute getQueryComposition_Rolename();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.conceptual.QueryComposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.conceptual.QueryComposition#getType()
	 * @see #getQueryComposition()
	 * @generated
	 */
	EReference getQueryComposition_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptualFactory getConceptualFactory();

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
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.ElementImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.ComposableElementImpl <em>Composable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.ComposableElementImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getComposableElement()
		 * @generated
		 */
		EClass COMPOSABLE_ELEMENT = eINSTANCE.getComposableElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.BasisElementImpl <em>Basis Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.BasisElementImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getBasisElement()
		 * @generated
		 */
		EClass BASIS_ELEMENT = eINSTANCE.getBasisElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.BasisEntityImpl <em>Basis Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.BasisEntityImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getBasisEntity()
		 * @generated
		 */
		EClass BASIS_ENTITY = eINSTANCE.getBasisEntity();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.DomainImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Basis Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__BASIS_ENTITY = eINSTANCE.getDomain_BasisEntity();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.ObservableImpl <em>Observable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.ObservableImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getObservable()
		 * @generated
		 */
		EClass OBSERVABLE = eINSTANCE.getObservable();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.CharacteristicImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__ROLENAME = eINSTANCE.getCharacteristic_Rolename();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__LOWER_BOUND = eINSTANCE.getCharacteristic_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__UPPER_BOUND = eINSTANCE.getCharacteristic_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__SPECIALIZES = eINSTANCE.getCharacteristic_Specializes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__DESCRIPTION = eINSTANCE.getCharacteristic_Description();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.EntityImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__COMPOSITION = eINSTANCE.getEntity_Composition();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SPECIALIZES = eINSTANCE.getEntity_Specializes();

		/**
		 * The meta object literal for the '<em><b>Basis Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BASIS_ENTITY = eINSTANCE.getEntity_BasisEntity();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.CompositionImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__TYPE = eINSTANCE.getComposition_Type();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.AssociationImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__PARTICIPANT = eINSTANCE.getAssociation_Participant();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.ParticipantImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__TYPE = eINSTANCE.getParticipant_Type();

		/**
		 * The meta object literal for the '<em><b>Source Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__SOURCE_LOWER_BOUND = eINSTANCE.getParticipant_SourceLowerBound();

		/**
		 * The meta object literal for the '<em><b>Source Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__SOURCE_UPPER_BOUND = eINSTANCE.getParticipant_SourceUpperBound();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PATH = eINSTANCE.getParticipant_Path();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.PathNodeImpl <em>Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.PathNodeImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getPathNode()
		 * @generated
		 */
		EClass PATH_NODE = eINSTANCE.getPathNode();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_NODE__NODE = eINSTANCE.getPathNode_Node();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.ParticipantPathNodeImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getParticipantPathNode()
		 * @generated
		 */
		EClass PARTICIPANT_PATH_NODE = eINSTANCE.getParticipantPathNode();

		/**
		 * The meta object literal for the '<em><b>Projected Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT = eINSTANCE.getParticipantPathNode_ProjectedParticipant();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.CharacteristicPathNodeImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getCharacteristicPathNode()
		 * @generated
		 */
		EClass CHARACTERISTIC_PATH_NODE = eINSTANCE.getCharacteristicPathNode();

		/**
		 * The meta object literal for the '<em><b>Projected Characteristic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC = eINSTANCE.getCharacteristicPathNode_ProjectedCharacteristic();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.ViewImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.QueryImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__SPECIFICATION = eINSTANCE.getQuery_Specification();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.CompositeQueryImpl <em>Composite Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.CompositeQueryImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getCompositeQuery()
		 * @generated
		 */
		EClass COMPOSITE_QUERY = eINSTANCE.getCompositeQuery();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_QUERY__COMPOSITION = eINSTANCE.getCompositeQuery_Composition();

		/**
		 * The meta object literal for the '<em><b>Is Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_QUERY__IS_UNION = eINSTANCE.getCompositeQuery_IsUnion();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.conceptual.impl.QueryCompositionImpl <em>Query Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.conceptual.impl.QueryCompositionImpl
		 * @see org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl#getQueryComposition()
		 * @generated
		 */
		EClass QUERY_COMPOSITION = eINSTANCE.getQueryComposition();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_COMPOSITION__ROLENAME = eINSTANCE.getQueryComposition_Rolename();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_COMPOSITION__TYPE = eINSTANCE.getQueryComposition_Type();

	}

} //ConceptualPackage
