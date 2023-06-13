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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.face31.FacePackage;

import org.osate.face31.traceability.TraceabilityPackage;

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
 * @see org.osate.face31.uop.UopFactory
 * @model kind="package"
 * @generated
 */
public interface UopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengroup.us/face/uop/3.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UopPackage eINSTANCE = org.osate.face31.uop.impl.UopPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.UoPModelImpl <em>Uo PModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.UoPModelImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getUoPModel()
	 * @generated
	 */
	int UO_PMODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PMODEL__NAME = FacePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PMODEL__DESCRIPTION = FacePackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PMODEL__ELEMENT = FacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Um</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PMODEL__UM = FacePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uo PModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PMODEL_FEATURE_COUNT = FacePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uo PModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PMODEL_OPERATION_COUNT = FacePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.ElementImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getElement()
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
	 * The meta object id for the '{@link org.osate.face31.uop.impl.SupportingComponentImpl <em>Supporting Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.SupportingComponentImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getSupportingComponent()
	 * @generated
	 */
	int SUPPORTING_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_COMPONENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_COMPONENT__VERSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Supporting Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Supporting Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_COMPONENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.LanguageRunTimeImpl <em>Language Run Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.LanguageRunTimeImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getLanguageRunTime()
	 * @generated
	 */
	int LANGUAGE_RUN_TIME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_RUN_TIME__NAME = SUPPORTING_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_RUN_TIME__DESCRIPTION = SUPPORTING_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_RUN_TIME__VERSION = SUPPORTING_COMPONENT__VERSION;

	/**
	 * The number of structural features of the '<em>Language Run Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_RUN_TIME_FEATURE_COUNT = SUPPORTING_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Language Run Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_RUN_TIME_OPERATION_COUNT = SUPPORTING_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.ComponentFrameworkImpl <em>Component Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.ComponentFrameworkImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getComponentFramework()
	 * @generated
	 */
	int COMPONENT_FRAMEWORK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRAMEWORK__NAME = SUPPORTING_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRAMEWORK__DESCRIPTION = SUPPORTING_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRAMEWORK__VERSION = SUPPORTING_COMPONENT__VERSION;

	/**
	 * The number of structural features of the '<em>Component Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRAMEWORK_FEATURE_COUNT = SUPPORTING_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRAMEWORK_OPERATION_COUNT = SUPPORTING_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.AbstractUoPImpl <em>Abstract Uo P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.AbstractUoPImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getAbstractUoP()
	 * @generated
	 */
	int ABSTRACT_UO_P = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UO_P__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UO_P__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UO_P__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UO_P__CONNECTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Uo P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UO_P_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Uo P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UO_P_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.AbstractConnectionImpl <em>Abstract Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.AbstractConnectionImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getAbstractConnection()
	 * @generated
	 */
	int ABSTRACT_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION__NAME = FacePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION__DESCRIPTION = FacePackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION__TRACEABILITY_POINT = FacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conceptual View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION__CONCEPTUAL_VIEW = FacePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION__LOGICAL_VIEW = FacePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION_FEATURE_COUNT = FacePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION_OPERATION_COUNT = FacePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.UnitOfPortabilityImpl <em>Unit Of Portability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.UnitOfPortabilityImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getUnitOfPortability()
	 * @generated
	 */
	int UNIT_OF_PORTABILITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supporting Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__THREAD = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__REALIZES = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__CONNECTION = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transport API Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Design Assurance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Partition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__PARTITION_TYPE = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Design Assurance Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Face Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__FACE_PROFILE = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lcm Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY__LCM_PORT = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Unit Of Portability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Unit Of Portability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_PORTABILITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.PortableComponentImpl <em>Portable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.PortableComponentImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getPortableComponent()
	 * @generated
	 */
	int PORTABLE_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__NAME = UNIT_OF_PORTABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__DESCRIPTION = UNIT_OF_PORTABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__TRACEABILITY_POINT = UNIT_OF_PORTABILITY__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Supporting Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__SUPPORTING_COMPONENT = UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__THREAD = UNIT_OF_PORTABILITY__THREAD;

	/**
	 * The feature id for the '<em><b>Memory Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__MEMORY_REQUIREMENTS = UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__REALIZES = UNIT_OF_PORTABILITY__REALIZES;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__CONNECTION = UNIT_OF_PORTABILITY__CONNECTION;

	/**
	 * The feature id for the '<em><b>Transport API Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__TRANSPORT_API_LANGUAGE = UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Design Assurance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__DESIGN_ASSURANCE_LEVEL = UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Partition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__PARTITION_TYPE = UNIT_OF_PORTABILITY__PARTITION_TYPE;

	/**
	 * The feature id for the '<em><b>Design Assurance Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__DESIGN_ASSURANCE_STANDARD = UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD;

	/**
	 * The feature id for the '<em><b>Face Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__FACE_PROFILE = UNIT_OF_PORTABILITY__FACE_PROFILE;

	/**
	 * The feature id for the '<em><b>Lcm Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT__LCM_PORT = UNIT_OF_PORTABILITY__LCM_PORT;

	/**
	 * The number of structural features of the '<em>Portable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT_FEATURE_COUNT = UNIT_OF_PORTABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Portable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTABLE_COMPONENT_OPERATION_COUNT = UNIT_OF_PORTABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.PlatformSpecificComponentImpl <em>Platform Specific Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.PlatformSpecificComponentImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getPlatformSpecificComponent()
	 * @generated
	 */
	int PLATFORM_SPECIFIC_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__NAME = UNIT_OF_PORTABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__DESCRIPTION = UNIT_OF_PORTABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__TRACEABILITY_POINT = UNIT_OF_PORTABILITY__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Supporting Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__SUPPORTING_COMPONENT = UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__THREAD = UNIT_OF_PORTABILITY__THREAD;

	/**
	 * The feature id for the '<em><b>Memory Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__MEMORY_REQUIREMENTS = UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__REALIZES = UNIT_OF_PORTABILITY__REALIZES;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__CONNECTION = UNIT_OF_PORTABILITY__CONNECTION;

	/**
	 * The feature id for the '<em><b>Transport API Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__TRANSPORT_API_LANGUAGE = UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Design Assurance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__DESIGN_ASSURANCE_LEVEL = UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Partition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__PARTITION_TYPE = UNIT_OF_PORTABILITY__PARTITION_TYPE;

	/**
	 * The feature id for the '<em><b>Design Assurance Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__DESIGN_ASSURANCE_STANDARD = UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD;

	/**
	 * The feature id for the '<em><b>Face Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__FACE_PROFILE = UNIT_OF_PORTABILITY__FACE_PROFILE;

	/**
	 * The feature id for the '<em><b>Lcm Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT__LCM_PORT = UNIT_OF_PORTABILITY__LCM_PORT;

	/**
	 * The number of structural features of the '<em>Platform Specific Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT_FEATURE_COUNT = UNIT_OF_PORTABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Specific Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SPECIFIC_COMPONENT_OPERATION_COUNT = UNIT_OF_PORTABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.ThreadImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 10;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Time Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__TIME_CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__RELATIVE_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Relative Core Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__RELATIVE_CORE_AFFINITY = 3;

	/**
	 * The feature id for the '<em><b>Thread Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__THREAD_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl <em>RAM Memory Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.RAMMemoryRequirementsImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getRAMMemoryRequirements()
	 * @generated
	 */
	int RAM_MEMORY_REQUIREMENTS = 11;

	/**
	 * The feature id for the '<em><b>Heap Stack Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN = 0;

	/**
	 * The feature id for the '<em><b>Heap Stack Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX = 1;

	/**
	 * The feature id for the '<em><b>Heap Stack Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL = 2;

	/**
	 * The feature id for the '<em><b>Text Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS__TEXT_MAX = 3;

	/**
	 * The feature id for the '<em><b>Ro Data Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX = 4;

	/**
	 * The feature id for the '<em><b>Data Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS__DATA_MAX = 5;

	/**
	 * The feature id for the '<em><b>Bss Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS__BSS_MAX = 6;

	/**
	 * The number of structural features of the '<em>RAM Memory Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>RAM Memory Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MEMORY_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.ConnectionImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TRACEABILITY_POINT = TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = TraceabilityPackage.TRACEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = TraceabilityPackage.TRACEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REALIZES = TraceabilityPackage.TRACEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PERIOD = TraceabilityPackage.TRACEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Synchronization Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SYNCHRONIZATION_STYLE = TraceabilityPackage.TRACEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = TraceabilityPackage.TRACEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = TraceabilityPackage.TRACEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.ClientServerConnectionImpl <em>Client Server Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.ClientServerConnectionImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getClientServerConnection()
	 * @generated
	 */
	int CLIENT_SERVER_CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__TRACEABILITY_POINT = CONNECTION__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__REALIZES = CONNECTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__PERIOD = CONNECTION__PERIOD;

	/**
	 * The feature id for the '<em><b>Synchronization Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__SYNCHRONIZATION_STYLE = CONNECTION__SYNCHRONIZATION_STYLE;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__REQUEST_TYPE = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__RESPONSE_TYPE = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION__ROLE = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Client Server Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Client Server Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.PubSubConnectionImpl <em>Pub Sub Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.PubSubConnectionImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getPubSubConnection()
	 * @generated
	 */
	int PUB_SUB_CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__TRACEABILITY_POINT = CONNECTION__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__REALIZES = CONNECTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__PERIOD = CONNECTION__PERIOD;

	/**
	 * The feature id for the '<em><b>Synchronization Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__SYNCHRONIZATION_STYLE = CONNECTION__SYNCHRONIZATION_STYLE;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__MESSAGE_TYPE = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Exchange Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pub Sub Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pub Sub Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.QueuingConnectionImpl <em>Queuing Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.QueuingConnectionImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getQueuingConnection()
	 * @generated
	 */
	int QUEUING_CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__TRACEABILITY_POINT = PUB_SUB_CONNECTION__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__NAME = PUB_SUB_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__DESCRIPTION = PUB_SUB_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__REALIZES = PUB_SUB_CONNECTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__PERIOD = PUB_SUB_CONNECTION__PERIOD;

	/**
	 * The feature id for the '<em><b>Synchronization Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__SYNCHRONIZATION_STYLE = PUB_SUB_CONNECTION__SYNCHRONIZATION_STYLE;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__MESSAGE_TYPE = PUB_SUB_CONNECTION__MESSAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Message Exchange Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__MESSAGE_EXCHANGE_TYPE = PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION__DEPTH = PUB_SUB_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Queuing Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION_FEATURE_COUNT = PUB_SUB_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Queuing Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_CONNECTION_OPERATION_COUNT = PUB_SUB_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.SingleInstanceMessageConnectionImpl <em>Single Instance Message Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.SingleInstanceMessageConnectionImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getSingleInstanceMessageConnection()
	 * @generated
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION = 16;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__TRACEABILITY_POINT = PUB_SUB_CONNECTION__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__NAME = PUB_SUB_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__DESCRIPTION = PUB_SUB_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__REALIZES = PUB_SUB_CONNECTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__PERIOD = PUB_SUB_CONNECTION__PERIOD;

	/**
	 * The feature id for the '<em><b>Synchronization Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__SYNCHRONIZATION_STYLE = PUB_SUB_CONNECTION__SYNCHRONIZATION_STYLE;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__MESSAGE_TYPE = PUB_SUB_CONNECTION__MESSAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Message Exchange Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION__MESSAGE_EXCHANGE_TYPE = PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE;

	/**
	 * The number of structural features of the '<em>Single Instance Message Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION_FEATURE_COUNT = PUB_SUB_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Instance Message Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INSTANCE_MESSAGE_CONNECTION_OPERATION_COUNT = PUB_SUB_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.LifeCycleManagementPortImpl <em>Life Cycle Management Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.LifeCycleManagementPortImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getLifeCycleManagementPort()
	 * @generated
	 */
	int LIFE_CYCLE_MANAGEMENT_PORT = 17;

	/**
	 * The feature id for the '<em><b>Message Exchange Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Lcm Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Life Cycle Management Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_MANAGEMENT_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Life Cycle Management Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_MANAGEMENT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.MessageTypeImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.CompositeTemplateImpl <em>Composite Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.CompositeTemplateImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getCompositeTemplate()
	 * @generated
	 */
	int COMPOSITE_TEMPLATE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__COMPOSITION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__REALIZES = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__IS_UNION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composite Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Composite Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.TemplateCompositionImpl <em>Template Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.TemplateCompositionImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getTemplateComposition()
	 * @generated
	 */
	int TEMPLATE_COMPOSITION = 20;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION__ROLENAME = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION__REALIZES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Template Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Template Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.impl.TemplateImpl
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DESCRIPTION = MESSAGE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__TRACEABILITY_POINT = MESSAGE_TYPE__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__SPECIFICATION = MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__BOUND_QUERY = MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effective Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__EFFECTIVE_QUERY = MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = MESSAGE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.ClientServerRole <em>Client Server Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.ClientServerRole
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getClientServerRole()
	 * @generated
	 */
	int CLIENT_SERVER_ROLE = 22;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.FaceProfile <em>Face Profile</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.FaceProfile
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getFaceProfile()
	 * @generated
	 */
	int FACE_PROFILE = 23;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.DesignAssuranceLevel <em>Design Assurance Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.DesignAssuranceLevel
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getDesignAssuranceLevel()
	 * @generated
	 */
	int DESIGN_ASSURANCE_LEVEL = 24;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.DesignAssuranceStandard <em>Design Assurance Standard</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.DesignAssuranceStandard
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getDesignAssuranceStandard()
	 * @generated
	 */
	int DESIGN_ASSURANCE_STANDARD = 25;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.MessageExchangeType <em>Message Exchange Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.MessageExchangeType
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getMessageExchangeType()
	 * @generated
	 */
	int MESSAGE_EXCHANGE_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.PartitionType <em>Partition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.PartitionType
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getPartitionType()
	 * @generated
	 */
	int PARTITION_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.ProgrammingLanguage
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 28;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.SynchronizationStyle <em>Synchronization Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.SynchronizationStyle
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getSynchronizationStyle()
	 * @generated
	 */
	int SYNCHRONIZATION_STYLE = 29;

	/**
	 * The meta object id for the '{@link org.osate.face31.uop.ThreadType <em>Thread Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.uop.ThreadType
	 * @see org.osate.face31.uop.impl.UopPackageImpl#getThreadType()
	 * @generated
	 */
	int THREAD_TYPE = 30;


	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.UoPModel <em>Uo PModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo PModel</em>'.
	 * @see org.osate.face31.uop.UoPModel
	 * @generated
	 */
	EClass getUoPModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.uop.UoPModel#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.osate.face31.uop.UoPModel#getElement()
	 * @see #getUoPModel()
	 * @generated
	 */
	EReference getUoPModel_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.uop.UoPModel#getUm <em>Um</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Um</em>'.
	 * @see org.osate.face31.uop.UoPModel#getUm()
	 * @see #getUoPModel()
	 * @generated
	 */
	EReference getUoPModel_Um();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.osate.face31.uop.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.SupportingComponent <em>Supporting Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Component</em>'.
	 * @see org.osate.face31.uop.SupportingComponent
	 * @generated
	 */
	EClass getSupportingComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.SupportingComponent#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.osate.face31.uop.SupportingComponent#getVersion()
	 * @see #getSupportingComponent()
	 * @generated
	 */
	EAttribute getSupportingComponent_Version();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.LanguageRunTime <em>Language Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Run Time</em>'.
	 * @see org.osate.face31.uop.LanguageRunTime
	 * @generated
	 */
	EClass getLanguageRunTime();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.ComponentFramework <em>Component Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Framework</em>'.
	 * @see org.osate.face31.uop.ComponentFramework
	 * @generated
	 */
	EClass getComponentFramework();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.AbstractUoP <em>Abstract Uo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Uo P</em>'.
	 * @see org.osate.face31.uop.AbstractUoP
	 * @generated
	 */
	EClass getAbstractUoP();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.uop.AbstractUoP#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see org.osate.face31.uop.AbstractUoP#getConnection()
	 * @see #getAbstractUoP()
	 * @generated
	 */
	EReference getAbstractUoP_Connection();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.AbstractConnection <em>Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connection</em>'.
	 * @see org.osate.face31.uop.AbstractConnection
	 * @generated
	 */
	EClass getAbstractConnection();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.AbstractConnection#getConceptualView <em>Conceptual View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conceptual View</em>'.
	 * @see org.osate.face31.uop.AbstractConnection#getConceptualView()
	 * @see #getAbstractConnection()
	 * @generated
	 */
	EReference getAbstractConnection_ConceptualView();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.AbstractConnection#getLogicalView <em>Logical View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical View</em>'.
	 * @see org.osate.face31.uop.AbstractConnection#getLogicalView()
	 * @see #getAbstractConnection()
	 * @generated
	 */
	EReference getAbstractConnection_LogicalView();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.UnitOfPortability <em>Unit Of Portability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Of Portability</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability
	 * @generated
	 */
	EClass getUnitOfPortability();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.face31.uop.UnitOfPortability#getSupportingComponent <em>Supporting Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Component</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getSupportingComponent()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EReference getUnitOfPortability_SupportingComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.uop.UnitOfPortability#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thread</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getThread()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EReference getUnitOfPortability_Thread();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.face31.uop.UnitOfPortability#getMemoryRequirements <em>Memory Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Requirements</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getMemoryRequirements()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EReference getUnitOfPortability_MemoryRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.UnitOfPortability#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getRealizes()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EReference getUnitOfPortability_Realizes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.uop.UnitOfPortability#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getConnection()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EReference getUnitOfPortability_Connection();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.UnitOfPortability#getTransportAPILanguage <em>Transport API Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport API Language</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getTransportAPILanguage()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EAttribute getUnitOfPortability_TransportAPILanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.UnitOfPortability#getDesignAssuranceLevel <em>Design Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Assurance Level</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getDesignAssuranceLevel()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EAttribute getUnitOfPortability_DesignAssuranceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.UnitOfPortability#getPartitionType <em>Partition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Type</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getPartitionType()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EAttribute getUnitOfPortability_PartitionType();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.UnitOfPortability#getDesignAssuranceStandard <em>Design Assurance Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Assurance Standard</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getDesignAssuranceStandard()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EAttribute getUnitOfPortability_DesignAssuranceStandard();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.UnitOfPortability#getFaceProfile <em>Face Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Face Profile</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getFaceProfile()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EAttribute getUnitOfPortability_FaceProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.uop.UnitOfPortability#getLcmPort <em>Lcm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lcm Port</em>'.
	 * @see org.osate.face31.uop.UnitOfPortability#getLcmPort()
	 * @see #getUnitOfPortability()
	 * @generated
	 */
	EReference getUnitOfPortability_LcmPort();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.PortableComponent <em>Portable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portable Component</em>'.
	 * @see org.osate.face31.uop.PortableComponent
	 * @generated
	 */
	EClass getPortableComponent();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.PlatformSpecificComponent <em>Platform Specific Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Specific Component</em>'.
	 * @see org.osate.face31.uop.PlatformSpecificComponent
	 * @generated
	 */
	EClass getPlatformSpecificComponent();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see org.osate.face31.uop.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Thread#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.osate.face31.uop.Thread#getPeriod()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Thread#getTimeCapacity <em>Time Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Capacity</em>'.
	 * @see org.osate.face31.uop.Thread#getTimeCapacity()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_TimeCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Thread#getRelativePriority <em>Relative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Priority</em>'.
	 * @see org.osate.face31.uop.Thread#getRelativePriority()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_RelativePriority();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Thread#getRelativeCoreAffinity <em>Relative Core Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Core Affinity</em>'.
	 * @see org.osate.face31.uop.Thread#getRelativeCoreAffinity()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_RelativeCoreAffinity();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Thread#getThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Type</em>'.
	 * @see org.osate.face31.uop.Thread#getThreadType()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_ThreadType();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.RAMMemoryRequirements <em>RAM Memory Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM Memory Requirements</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements
	 * @generated
	 */
	EClass getRAMMemoryRequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMin <em>Heap Stack Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heap Stack Min</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMin()
	 * @see #getRAMMemoryRequirements()
	 * @generated
	 */
	EAttribute getRAMMemoryRequirements_HeapStackMin();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMax <em>Heap Stack Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heap Stack Max</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements#getHeapStackMax()
	 * @see #getRAMMemoryRequirements()
	 * @generated
	 */
	EAttribute getRAMMemoryRequirements_HeapStackMax();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.RAMMemoryRequirements#getHeapStackTypical <em>Heap Stack Typical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heap Stack Typical</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements#getHeapStackTypical()
	 * @see #getRAMMemoryRequirements()
	 * @generated
	 */
	EAttribute getRAMMemoryRequirements_HeapStackTypical();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.RAMMemoryRequirements#getTextMax <em>Text Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Max</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements#getTextMax()
	 * @see #getRAMMemoryRequirements()
	 * @generated
	 */
	EAttribute getRAMMemoryRequirements_TextMax();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.RAMMemoryRequirements#getRoDataMax <em>Ro Data Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ro Data Max</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements#getRoDataMax()
	 * @see #getRAMMemoryRequirements()
	 * @generated
	 */
	EAttribute getRAMMemoryRequirements_RoDataMax();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.RAMMemoryRequirements#getDataMax <em>Data Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Max</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements#getDataMax()
	 * @see #getRAMMemoryRequirements()
	 * @generated
	 */
	EAttribute getRAMMemoryRequirements_DataMax();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.RAMMemoryRequirements#getBssMax <em>Bss Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bss Max</em>'.
	 * @see org.osate.face31.uop.RAMMemoryRequirements#getBssMax()
	 * @see #getRAMMemoryRequirements()
	 * @generated
	 */
	EAttribute getRAMMemoryRequirements_BssMax();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.osate.face31.uop.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.Connection#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.face31.uop.Connection#getRealizes()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Connection#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.osate.face31.uop.Connection#getPeriod()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Connection#getSynchronizationStyle <em>Synchronization Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronization Style</em>'.
	 * @see org.osate.face31.uop.Connection#getSynchronizationStyle()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_SynchronizationStyle();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.ClientServerConnection <em>Client Server Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Server Connection</em>'.
	 * @see org.osate.face31.uop.ClientServerConnection
	 * @generated
	 */
	EClass getClientServerConnection();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.ClientServerConnection#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Type</em>'.
	 * @see org.osate.face31.uop.ClientServerConnection#getRequestType()
	 * @see #getClientServerConnection()
	 * @generated
	 */
	EReference getClientServerConnection_RequestType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.ClientServerConnection#getResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Type</em>'.
	 * @see org.osate.face31.uop.ClientServerConnection#getResponseType()
	 * @see #getClientServerConnection()
	 * @generated
	 */
	EReference getClientServerConnection_ResponseType();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.ClientServerConnection#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.osate.face31.uop.ClientServerConnection#getRole()
	 * @see #getClientServerConnection()
	 * @generated
	 */
	EAttribute getClientServerConnection_Role();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.PubSubConnection <em>Pub Sub Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pub Sub Connection</em>'.
	 * @see org.osate.face31.uop.PubSubConnection
	 * @generated
	 */
	EClass getPubSubConnection();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.PubSubConnection#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see org.osate.face31.uop.PubSubConnection#getMessageType()
	 * @see #getPubSubConnection()
	 * @generated
	 */
	EReference getPubSubConnection_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.PubSubConnection#getMessageExchangeType <em>Message Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange Type</em>'.
	 * @see org.osate.face31.uop.PubSubConnection#getMessageExchangeType()
	 * @see #getPubSubConnection()
	 * @generated
	 */
	EAttribute getPubSubConnection_MessageExchangeType();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.QueuingConnection <em>Queuing Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queuing Connection</em>'.
	 * @see org.osate.face31.uop.QueuingConnection
	 * @generated
	 */
	EClass getQueuingConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.QueuingConnection#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see org.osate.face31.uop.QueuingConnection#getDepth()
	 * @see #getQueuingConnection()
	 * @generated
	 */
	EAttribute getQueuingConnection_Depth();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.SingleInstanceMessageConnection <em>Single Instance Message Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Instance Message Connection</em>'.
	 * @see org.osate.face31.uop.SingleInstanceMessageConnection
	 * @generated
	 */
	EClass getSingleInstanceMessageConnection();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.LifeCycleManagementPort <em>Life Cycle Management Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle Management Port</em>'.
	 * @see org.osate.face31.uop.LifeCycleManagementPort
	 * @generated
	 */
	EClass getLifeCycleManagementPort();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.LifeCycleManagementPort#getMessageExchangeType <em>Message Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange Type</em>'.
	 * @see org.osate.face31.uop.LifeCycleManagementPort#getMessageExchangeType()
	 * @see #getLifeCycleManagementPort()
	 * @generated
	 */
	EAttribute getLifeCycleManagementPort_MessageExchangeType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.LifeCycleManagementPort#getLcmMessageType <em>Lcm Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lcm Message Type</em>'.
	 * @see org.osate.face31.uop.LifeCycleManagementPort#getLcmMessageType()
	 * @see #getLifeCycleManagementPort()
	 * @generated
	 */
	EReference getLifeCycleManagementPort_LcmMessageType();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see org.osate.face31.uop.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.CompositeTemplate <em>Composite Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Template</em>'.
	 * @see org.osate.face31.uop.CompositeTemplate
	 * @generated
	 */
	EClass getCompositeTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.uop.CompositeTemplate#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.osate.face31.uop.CompositeTemplate#getComposition()
	 * @see #getCompositeTemplate()
	 * @generated
	 */
	EReference getCompositeTemplate_Composition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.CompositeTemplate#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.face31.uop.CompositeTemplate#getRealizes()
	 * @see #getCompositeTemplate()
	 * @generated
	 */
	EReference getCompositeTemplate_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.CompositeTemplate#isIsUnion <em>Is Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Union</em>'.
	 * @see org.osate.face31.uop.CompositeTemplate#isIsUnion()
	 * @see #getCompositeTemplate()
	 * @generated
	 */
	EAttribute getCompositeTemplate_IsUnion();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.TemplateComposition <em>Template Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Composition</em>'.
	 * @see org.osate.face31.uop.TemplateComposition
	 * @generated
	 */
	EClass getTemplateComposition();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.TemplateComposition#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.face31.uop.TemplateComposition#getRolename()
	 * @see #getTemplateComposition()
	 * @generated
	 */
	EAttribute getTemplateComposition_Rolename();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.TemplateComposition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.face31.uop.TemplateComposition#getRealizes()
	 * @see #getTemplateComposition()
	 * @generated
	 */
	EReference getTemplateComposition_Realizes();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.TemplateComposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.face31.uop.TemplateComposition#getType()
	 * @see #getTemplateComposition()
	 * @generated
	 */
	EReference getTemplateComposition_Type();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.uop.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.osate.face31.uop.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.uop.Template#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.osate.face31.uop.Template#getSpecification()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Specification();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.Template#getBoundQuery <em>Bound Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Query</em>'.
	 * @see org.osate.face31.uop.Template#getBoundQuery()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_BoundQuery();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.uop.Template#getEffectiveQuery <em>Effective Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Query</em>'.
	 * @see org.osate.face31.uop.Template#getEffectiveQuery()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_EffectiveQuery();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.ClientServerRole <em>Client Server Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Client Server Role</em>'.
	 * @see org.osate.face31.uop.ClientServerRole
	 * @generated
	 */
	EEnum getClientServerRole();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.FaceProfile <em>Face Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Face Profile</em>'.
	 * @see org.osate.face31.uop.FaceProfile
	 * @generated
	 */
	EEnum getFaceProfile();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.DesignAssuranceLevel <em>Design Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Assurance Level</em>'.
	 * @see org.osate.face31.uop.DesignAssuranceLevel
	 * @generated
	 */
	EEnum getDesignAssuranceLevel();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.DesignAssuranceStandard <em>Design Assurance Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Assurance Standard</em>'.
	 * @see org.osate.face31.uop.DesignAssuranceStandard
	 * @generated
	 */
	EEnum getDesignAssuranceStandard();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.MessageExchangeType <em>Message Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Exchange Type</em>'.
	 * @see org.osate.face31.uop.MessageExchangeType
	 * @generated
	 */
	EEnum getMessageExchangeType();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.PartitionType <em>Partition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Partition Type</em>'.
	 * @see org.osate.face31.uop.PartitionType
	 * @generated
	 */
	EEnum getPartitionType();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see org.osate.face31.uop.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.SynchronizationStyle <em>Synchronization Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronization Style</em>'.
	 * @see org.osate.face31.uop.SynchronizationStyle
	 * @generated
	 */
	EEnum getSynchronizationStyle();

	/**
	 * Returns the meta object for enum '{@link org.osate.face31.uop.ThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thread Type</em>'.
	 * @see org.osate.face31.uop.ThreadType
	 * @generated
	 */
	EEnum getThreadType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UopFactory getUopFactory();

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
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.UoPModelImpl <em>Uo PModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.UoPModelImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getUoPModel()
		 * @generated
		 */
		EClass UO_PMODEL = eINSTANCE.getUoPModel();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PMODEL__ELEMENT = eINSTANCE.getUoPModel_Element();

		/**
		 * The meta object literal for the '<em><b>Um</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PMODEL__UM = eINSTANCE.getUoPModel_Um();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.ElementImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.SupportingComponentImpl <em>Supporting Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.SupportingComponentImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getSupportingComponent()
		 * @generated
		 */
		EClass SUPPORTING_COMPONENT = eINSTANCE.getSupportingComponent();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTING_COMPONENT__VERSION = eINSTANCE.getSupportingComponent_Version();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.LanguageRunTimeImpl <em>Language Run Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.LanguageRunTimeImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getLanguageRunTime()
		 * @generated
		 */
		EClass LANGUAGE_RUN_TIME = eINSTANCE.getLanguageRunTime();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.ComponentFrameworkImpl <em>Component Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.ComponentFrameworkImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getComponentFramework()
		 * @generated
		 */
		EClass COMPONENT_FRAMEWORK = eINSTANCE.getComponentFramework();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.AbstractUoPImpl <em>Abstract Uo P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.AbstractUoPImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getAbstractUoP()
		 * @generated
		 */
		EClass ABSTRACT_UO_P = eINSTANCE.getAbstractUoP();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UO_P__CONNECTION = eINSTANCE.getAbstractUoP_Connection();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.AbstractConnectionImpl <em>Abstract Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.AbstractConnectionImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getAbstractConnection()
		 * @generated
		 */
		EClass ABSTRACT_CONNECTION = eINSTANCE.getAbstractConnection();

		/**
		 * The meta object literal for the '<em><b>Conceptual View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTION__CONCEPTUAL_VIEW = eINSTANCE.getAbstractConnection_ConceptualView();

		/**
		 * The meta object literal for the '<em><b>Logical View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTION__LOGICAL_VIEW = eINSTANCE.getAbstractConnection_LogicalView();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.UnitOfPortabilityImpl <em>Unit Of Portability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.UnitOfPortabilityImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getUnitOfPortability()
		 * @generated
		 */
		EClass UNIT_OF_PORTABILITY = eINSTANCE.getUnitOfPortability();

		/**
		 * The meta object literal for the '<em><b>Supporting Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT = eINSTANCE.getUnitOfPortability_SupportingComponent();

		/**
		 * The meta object literal for the '<em><b>Thread</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_PORTABILITY__THREAD = eINSTANCE.getUnitOfPortability_Thread();

		/**
		 * The meta object literal for the '<em><b>Memory Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS = eINSTANCE.getUnitOfPortability_MemoryRequirements();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_PORTABILITY__REALIZES = eINSTANCE.getUnitOfPortability_Realizes();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_PORTABILITY__CONNECTION = eINSTANCE.getUnitOfPortability_Connection();

		/**
		 * The meta object literal for the '<em><b>Transport API Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE = eINSTANCE.getUnitOfPortability_TransportAPILanguage();

		/**
		 * The meta object literal for the '<em><b>Design Assurance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL = eINSTANCE.getUnitOfPortability_DesignAssuranceLevel();

		/**
		 * The meta object literal for the '<em><b>Partition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_PORTABILITY__PARTITION_TYPE = eINSTANCE.getUnitOfPortability_PartitionType();

		/**
		 * The meta object literal for the '<em><b>Design Assurance Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD = eINSTANCE.getUnitOfPortability_DesignAssuranceStandard();

		/**
		 * The meta object literal for the '<em><b>Face Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_PORTABILITY__FACE_PROFILE = eINSTANCE.getUnitOfPortability_FaceProfile();

		/**
		 * The meta object literal for the '<em><b>Lcm Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_PORTABILITY__LCM_PORT = eINSTANCE.getUnitOfPortability_LcmPort();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.PortableComponentImpl <em>Portable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.PortableComponentImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getPortableComponent()
		 * @generated
		 */
		EClass PORTABLE_COMPONENT = eINSTANCE.getPortableComponent();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.PlatformSpecificComponentImpl <em>Platform Specific Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.PlatformSpecificComponentImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getPlatformSpecificComponent()
		 * @generated
		 */
		EClass PLATFORM_SPECIFIC_COMPONENT = eINSTANCE.getPlatformSpecificComponent();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.ThreadImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__PERIOD = eINSTANCE.getThread_Period();

		/**
		 * The meta object literal for the '<em><b>Time Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__TIME_CAPACITY = eINSTANCE.getThread_TimeCapacity();

		/**
		 * The meta object literal for the '<em><b>Relative Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__RELATIVE_PRIORITY = eINSTANCE.getThread_RelativePriority();

		/**
		 * The meta object literal for the '<em><b>Relative Core Affinity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__RELATIVE_CORE_AFFINITY = eINSTANCE.getThread_RelativeCoreAffinity();

		/**
		 * The meta object literal for the '<em><b>Thread Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__THREAD_TYPE = eINSTANCE.getThread_ThreadType();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.RAMMemoryRequirementsImpl <em>RAM Memory Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.RAMMemoryRequirementsImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getRAMMemoryRequirements()
		 * @generated
		 */
		EClass RAM_MEMORY_REQUIREMENTS = eINSTANCE.getRAMMemoryRequirements();

		/**
		 * The meta object literal for the '<em><b>Heap Stack Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN = eINSTANCE.getRAMMemoryRequirements_HeapStackMin();

		/**
		 * The meta object literal for the '<em><b>Heap Stack Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX = eINSTANCE.getRAMMemoryRequirements_HeapStackMax();

		/**
		 * The meta object literal for the '<em><b>Heap Stack Typical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL = eINSTANCE.getRAMMemoryRequirements_HeapStackTypical();

		/**
		 * The meta object literal for the '<em><b>Text Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_MEMORY_REQUIREMENTS__TEXT_MAX = eINSTANCE.getRAMMemoryRequirements_TextMax();

		/**
		 * The meta object literal for the '<em><b>Ro Data Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX = eINSTANCE.getRAMMemoryRequirements_RoDataMax();

		/**
		 * The meta object literal for the '<em><b>Data Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_MEMORY_REQUIREMENTS__DATA_MAX = eINSTANCE.getRAMMemoryRequirements_DataMax();

		/**
		 * The meta object literal for the '<em><b>Bss Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM_MEMORY_REQUIREMENTS__BSS_MAX = eINSTANCE.getRAMMemoryRequirements_BssMax();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.ConnectionImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__REALIZES = eINSTANCE.getConnection_Realizes();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PERIOD = eINSTANCE.getConnection_Period();

		/**
		 * The meta object literal for the '<em><b>Synchronization Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__SYNCHRONIZATION_STYLE = eINSTANCE.getConnection_SynchronizationStyle();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.ClientServerConnectionImpl <em>Client Server Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.ClientServerConnectionImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getClientServerConnection()
		 * @generated
		 */
		EClass CLIENT_SERVER_CONNECTION = eINSTANCE.getClientServerConnection();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVER_CONNECTION__REQUEST_TYPE = eINSTANCE.getClientServerConnection_RequestType();

		/**
		 * The meta object literal for the '<em><b>Response Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVER_CONNECTION__RESPONSE_TYPE = eINSTANCE.getClientServerConnection_ResponseType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_SERVER_CONNECTION__ROLE = eINSTANCE.getClientServerConnection_Role();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.PubSubConnectionImpl <em>Pub Sub Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.PubSubConnectionImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getPubSubConnection()
		 * @generated
		 */
		EClass PUB_SUB_CONNECTION = eINSTANCE.getPubSubConnection();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUB_SUB_CONNECTION__MESSAGE_TYPE = eINSTANCE.getPubSubConnection_MessageType();

		/**
		 * The meta object literal for the '<em><b>Message Exchange Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE = eINSTANCE.getPubSubConnection_MessageExchangeType();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.QueuingConnectionImpl <em>Queuing Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.QueuingConnectionImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getQueuingConnection()
		 * @generated
		 */
		EClass QUEUING_CONNECTION = eINSTANCE.getQueuingConnection();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUING_CONNECTION__DEPTH = eINSTANCE.getQueuingConnection_Depth();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.SingleInstanceMessageConnectionImpl <em>Single Instance Message Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.SingleInstanceMessageConnectionImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getSingleInstanceMessageConnection()
		 * @generated
		 */
		EClass SINGLE_INSTANCE_MESSAGE_CONNECTION = eINSTANCE.getSingleInstanceMessageConnection();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.LifeCycleManagementPortImpl <em>Life Cycle Management Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.LifeCycleManagementPortImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getLifeCycleManagementPort()
		 * @generated
		 */
		EClass LIFE_CYCLE_MANAGEMENT_PORT = eINSTANCE.getLifeCycleManagementPort();

		/**
		 * The meta object literal for the '<em><b>Message Exchange Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE = eINSTANCE.getLifeCycleManagementPort_MessageExchangeType();

		/**
		 * The meta object literal for the '<em><b>Lcm Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE = eINSTANCE.getLifeCycleManagementPort_LcmMessageType();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.MessageTypeImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.CompositeTemplateImpl <em>Composite Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.CompositeTemplateImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getCompositeTemplate()
		 * @generated
		 */
		EClass COMPOSITE_TEMPLATE = eINSTANCE.getCompositeTemplate();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TEMPLATE__COMPOSITION = eINSTANCE.getCompositeTemplate_Composition();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TEMPLATE__REALIZES = eINSTANCE.getCompositeTemplate_Realizes();

		/**
		 * The meta object literal for the '<em><b>Is Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TEMPLATE__IS_UNION = eINSTANCE.getCompositeTemplate_IsUnion();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.TemplateCompositionImpl <em>Template Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.TemplateCompositionImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getTemplateComposition()
		 * @generated
		 */
		EClass TEMPLATE_COMPOSITION = eINSTANCE.getTemplateComposition();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_COMPOSITION__ROLENAME = eINSTANCE.getTemplateComposition_Rolename();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITION__REALIZES = eINSTANCE.getTemplateComposition_Realizes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITION__TYPE = eINSTANCE.getTemplateComposition_Type();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.impl.TemplateImpl
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__SPECIFICATION = eINSTANCE.getTemplate_Specification();

		/**
		 * The meta object literal for the '<em><b>Bound Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__BOUND_QUERY = eINSTANCE.getTemplate_BoundQuery();

		/**
		 * The meta object literal for the '<em><b>Effective Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__EFFECTIVE_QUERY = eINSTANCE.getTemplate_EffectiveQuery();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.ClientServerRole <em>Client Server Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.ClientServerRole
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getClientServerRole()
		 * @generated
		 */
		EEnum CLIENT_SERVER_ROLE = eINSTANCE.getClientServerRole();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.FaceProfile <em>Face Profile</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.FaceProfile
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getFaceProfile()
		 * @generated
		 */
		EEnum FACE_PROFILE = eINSTANCE.getFaceProfile();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.DesignAssuranceLevel <em>Design Assurance Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.DesignAssuranceLevel
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getDesignAssuranceLevel()
		 * @generated
		 */
		EEnum DESIGN_ASSURANCE_LEVEL = eINSTANCE.getDesignAssuranceLevel();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.DesignAssuranceStandard <em>Design Assurance Standard</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.DesignAssuranceStandard
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getDesignAssuranceStandard()
		 * @generated
		 */
		EEnum DESIGN_ASSURANCE_STANDARD = eINSTANCE.getDesignAssuranceStandard();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.MessageExchangeType <em>Message Exchange Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.MessageExchangeType
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getMessageExchangeType()
		 * @generated
		 */
		EEnum MESSAGE_EXCHANGE_TYPE = eINSTANCE.getMessageExchangeType();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.PartitionType <em>Partition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.PartitionType
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getPartitionType()
		 * @generated
		 */
		EEnum PARTITION_TYPE = eINSTANCE.getPartitionType();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.ProgrammingLanguage
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.SynchronizationStyle <em>Synchronization Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.SynchronizationStyle
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getSynchronizationStyle()
		 * @generated
		 */
		EEnum SYNCHRONIZATION_STYLE = eINSTANCE.getSynchronizationStyle();

		/**
		 * The meta object literal for the '{@link org.osate.face31.uop.ThreadType <em>Thread Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.uop.ThreadType
		 * @see org.osate.face31.uop.impl.UopPackageImpl#getThreadType()
		 * @generated
		 */
		EEnum THREAD_TYPE = eINSTANCE.getThreadType();

	}

} //UopPackage
