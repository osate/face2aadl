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
package org.osate.face31.traceability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.face31.FacePackage;

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
 * @see org.osate.face31.traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengroup.us/face/traceability/3.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = org.osate.face31.traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.TraceabilityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.TraceabilityModelImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getTraceabilityModel()
	 * @generated
	 */
	int TRACEABILITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__NAME = FacePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__DESCRIPTION = FacePackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__ELEMENT = FacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__TM = FacePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL_FEATURE_COUNT = FacePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL_OPERATION_COUNT = FacePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.ElementImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getElement()
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
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.TraceableElementImpl <em>Traceable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.TraceableElementImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getTraceableElement()
	 * @generated
	 */
	int TRACEABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT__TRACEABILITY_POINT = 0;

	/**
	 * The number of structural features of the '<em>Traceable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traceable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.TraceabilityPointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.TraceabilityPointImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getTraceabilityPoint()
	 * @generated
	 */
	int TRACEABILITY_POINT = 3;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_POINT__RATIONALE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_POINT__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.UoPTraceabilitySetImpl <em>Uo PTraceability Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.UoPTraceabilitySetImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getUoPTraceabilitySet()
	 * @generated
	 */
	int UO_PTRACEABILITY_SET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PTRACEABILITY_SET__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PTRACEABILITY_SET__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PTRACEABILITY_SET__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uop</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PTRACEABILITY_SET__UOP = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Uo P</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PTRACEABILITY_SET__ABSTRACT_UO_P = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uo PTraceability Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PTRACEABILITY_SET_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Uo PTraceability Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PTRACEABILITY_SET_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.ConnectionTraceabilitySetImpl <em>Connection Traceability Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.ConnectionTraceabilitySetImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getConnectionTraceabilitySet()
	 * @generated
	 */
	int CONNECTION_TRACEABILITY_SET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TRACEABILITY_SET__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TRACEABILITY_SET__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TRACEABILITY_SET__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TRACEABILITY_SET__CONNECTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TRACEABILITY_SET__ABSTRACT_CONNECTION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Traceability Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TRACEABILITY_SET_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Traceability Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TRACEABILITY_SET_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.ConceptualEntityTraceImpl <em>Conceptual Entity Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.ConceptualEntityTraceImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getConceptualEntityTrace()
	 * @generated
	 */
	int CONCEPTUAL_ENTITY_TRACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_TRACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_TRACE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_TRACE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_TRACE__ENTITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Entity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_TRACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conceptual Entity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_TRACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.ConceptualViewTraceImpl <em>Conceptual View Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.ConceptualViewTraceImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getConceptualViewTrace()
	 * @generated
	 */
	int CONCEPTUAL_VIEW_TRACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_VIEW_TRACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_VIEW_TRACE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_VIEW_TRACE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_VIEW_TRACE__VIEW = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual View Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_VIEW_TRACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conceptual View Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_VIEW_TRACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.LogicalEntityTraceImpl <em>Logical Entity Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.LogicalEntityTraceImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getLogicalEntityTrace()
	 * @generated
	 */
	int LOGICAL_ENTITY_TRACE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ENTITY_TRACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ENTITY_TRACE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ENTITY_TRACE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ENTITY_TRACE__ENTITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Entity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ENTITY_TRACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logical Entity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ENTITY_TRACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.LogicalViewTraceImpl <em>Logical View Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.LogicalViewTraceImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getLogicalViewTrace()
	 * @generated
	 */
	int LOGICAL_VIEW_TRACE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW_TRACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW_TRACE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW_TRACE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW_TRACE__VIEW = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical View Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW_TRACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logical View Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW_TRACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.PlatformEntityTraceImpl <em>Platform Entity Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.PlatformEntityTraceImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getPlatformEntityTrace()
	 * @generated
	 */
	int PLATFORM_ENTITY_TRACE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ENTITY_TRACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ENTITY_TRACE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ENTITY_TRACE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ENTITY_TRACE__ENTITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Platform Entity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ENTITY_TRACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Platform Entity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ENTITY_TRACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.face31.traceability.impl.PlatformViewTraceImpl <em>Platform View Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.face31.traceability.impl.PlatformViewTraceImpl
	 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getPlatformViewTrace()
	 * @generated
	 */
	int PLATFORM_VIEW_TRACE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_VIEW_TRACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_VIEW_TRACE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_VIEW_TRACE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_VIEW_TRACE__VIEW = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Platform View Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_VIEW_TRACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Platform View Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_VIEW_TRACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.TraceabilityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.osate.face31.traceability.TraceabilityModel
	 * @generated
	 */
	EClass getTraceabilityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.traceability.TraceabilityModel#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.osate.face31.traceability.TraceabilityModel#getElement()
	 * @see #getTraceabilityModel()
	 * @generated
	 */
	EReference getTraceabilityModel_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.traceability.TraceabilityModel#getTm <em>Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tm</em>'.
	 * @see org.osate.face31.traceability.TraceabilityModel#getTm()
	 * @see #getTraceabilityModel()
	 * @generated
	 */
	EReference getTraceabilityModel_Tm();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.osate.face31.traceability.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable Element</em>'.
	 * @see org.osate.face31.traceability.TraceableElement
	 * @generated
	 */
	EClass getTraceableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.face31.traceability.TraceableElement#getTraceabilityPoint <em>Traceability Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traceability Point</em>'.
	 * @see org.osate.face31.traceability.TraceableElement#getTraceabilityPoint()
	 * @see #getTraceableElement()
	 * @generated
	 */
	EReference getTraceableElement_TraceabilityPoint();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.TraceabilityPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.osate.face31.traceability.TraceabilityPoint
	 * @generated
	 */
	EClass getTraceabilityPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.traceability.TraceabilityPoint#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.osate.face31.traceability.TraceabilityPoint#getRationale()
	 * @see #getTraceabilityPoint()
	 * @generated
	 */
	EAttribute getTraceabilityPoint_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.face31.traceability.TraceabilityPoint#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.osate.face31.traceability.TraceabilityPoint#getReference()
	 * @see #getTraceabilityPoint()
	 * @generated
	 */
	EAttribute getTraceabilityPoint_Reference();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.UoPTraceabilitySet <em>Uo PTraceability Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo PTraceability Set</em>'.
	 * @see org.osate.face31.traceability.UoPTraceabilitySet
	 * @generated
	 */
	EClass getUoPTraceabilitySet();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.face31.traceability.UoPTraceabilitySet#getUop <em>Uop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uop</em>'.
	 * @see org.osate.face31.traceability.UoPTraceabilitySet#getUop()
	 * @see #getUoPTraceabilitySet()
	 * @generated
	 */
	EReference getUoPTraceabilitySet_Uop();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.face31.traceability.UoPTraceabilitySet#getAbstractUoP <em>Abstract Uo P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract Uo P</em>'.
	 * @see org.osate.face31.traceability.UoPTraceabilitySet#getAbstractUoP()
	 * @see #getUoPTraceabilitySet()
	 * @generated
	 */
	EReference getUoPTraceabilitySet_AbstractUoP();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.ConnectionTraceabilitySet <em>Connection Traceability Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Traceability Set</em>'.
	 * @see org.osate.face31.traceability.ConnectionTraceabilitySet
	 * @generated
	 */
	EClass getConnectionTraceabilitySet();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.face31.traceability.ConnectionTraceabilitySet#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection</em>'.
	 * @see org.osate.face31.traceability.ConnectionTraceabilitySet#getConnection()
	 * @see #getConnectionTraceabilitySet()
	 * @generated
	 */
	EReference getConnectionTraceabilitySet_Connection();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.face31.traceability.ConnectionTraceabilitySet#getAbstractConnection <em>Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract Connection</em>'.
	 * @see org.osate.face31.traceability.ConnectionTraceabilitySet#getAbstractConnection()
	 * @see #getConnectionTraceabilitySet()
	 * @generated
	 */
	EReference getConnectionTraceabilitySet_AbstractConnection();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.ConceptualEntityTrace <em>Conceptual Entity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Entity Trace</em>'.
	 * @see org.osate.face31.traceability.ConceptualEntityTrace
	 * @generated
	 */
	EClass getConceptualEntityTrace();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.traceability.ConceptualEntityTrace#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.osate.face31.traceability.ConceptualEntityTrace#getEntity()
	 * @see #getConceptualEntityTrace()
	 * @generated
	 */
	EReference getConceptualEntityTrace_Entity();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.ConceptualViewTrace <em>Conceptual View Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual View Trace</em>'.
	 * @see org.osate.face31.traceability.ConceptualViewTrace
	 * @generated
	 */
	EClass getConceptualViewTrace();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.traceability.ConceptualViewTrace#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.osate.face31.traceability.ConceptualViewTrace#getView()
	 * @see #getConceptualViewTrace()
	 * @generated
	 */
	EReference getConceptualViewTrace_View();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.LogicalEntityTrace <em>Logical Entity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Entity Trace</em>'.
	 * @see org.osate.face31.traceability.LogicalEntityTrace
	 * @generated
	 */
	EClass getLogicalEntityTrace();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.traceability.LogicalEntityTrace#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.osate.face31.traceability.LogicalEntityTrace#getEntity()
	 * @see #getLogicalEntityTrace()
	 * @generated
	 */
	EReference getLogicalEntityTrace_Entity();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.LogicalViewTrace <em>Logical View Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical View Trace</em>'.
	 * @see org.osate.face31.traceability.LogicalViewTrace
	 * @generated
	 */
	EClass getLogicalViewTrace();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.traceability.LogicalViewTrace#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.osate.face31.traceability.LogicalViewTrace#getView()
	 * @see #getLogicalViewTrace()
	 * @generated
	 */
	EReference getLogicalViewTrace_View();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.PlatformEntityTrace <em>Platform Entity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Entity Trace</em>'.
	 * @see org.osate.face31.traceability.PlatformEntityTrace
	 * @generated
	 */
	EClass getPlatformEntityTrace();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.traceability.PlatformEntityTrace#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.osate.face31.traceability.PlatformEntityTrace#getEntity()
	 * @see #getPlatformEntityTrace()
	 * @generated
	 */
	EReference getPlatformEntityTrace_Entity();

	/**
	 * Returns the meta object for class '{@link org.osate.face31.traceability.PlatformViewTrace <em>Platform View Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform View Trace</em>'.
	 * @see org.osate.face31.traceability.PlatformViewTrace
	 * @generated
	 */
	EClass getPlatformViewTrace();

	/**
	 * Returns the meta object for the reference '{@link org.osate.face31.traceability.PlatformViewTrace#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.osate.face31.traceability.PlatformViewTrace#getView()
	 * @see #getPlatformViewTrace()
	 * @generated
	 */
	EReference getPlatformViewTrace_View();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

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
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.TraceabilityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.TraceabilityModelImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getTraceabilityModel()
		 * @generated
		 */
		EClass TRACEABILITY_MODEL = eINSTANCE.getTraceabilityModel();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MODEL__ELEMENT = eINSTANCE.getTraceabilityModel_Element();

		/**
		 * The meta object literal for the '<em><b>Tm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MODEL__TM = eINSTANCE.getTraceabilityModel_Tm();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.ElementImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.TraceableElementImpl <em>Traceable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.TraceableElementImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getTraceableElement()
		 * @generated
		 */
		EClass TRACEABLE_ELEMENT = eINSTANCE.getTraceableElement();

		/**
		 * The meta object literal for the '<em><b>Traceability Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE_ELEMENT__TRACEABILITY_POINT = eINSTANCE.getTraceableElement_TraceabilityPoint();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.TraceabilityPointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.TraceabilityPointImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getTraceabilityPoint()
		 * @generated
		 */
		EClass TRACEABILITY_POINT = eINSTANCE.getTraceabilityPoint();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_POINT__RATIONALE = eINSTANCE.getTraceabilityPoint_Rationale();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_POINT__REFERENCE = eINSTANCE.getTraceabilityPoint_Reference();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.UoPTraceabilitySetImpl <em>Uo PTraceability Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.UoPTraceabilitySetImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getUoPTraceabilitySet()
		 * @generated
		 */
		EClass UO_PTRACEABILITY_SET = eINSTANCE.getUoPTraceabilitySet();

		/**
		 * The meta object literal for the '<em><b>Uop</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PTRACEABILITY_SET__UOP = eINSTANCE.getUoPTraceabilitySet_Uop();

		/**
		 * The meta object literal for the '<em><b>Abstract Uo P</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PTRACEABILITY_SET__ABSTRACT_UO_P = eINSTANCE.getUoPTraceabilitySet_AbstractUoP();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.ConnectionTraceabilitySetImpl <em>Connection Traceability Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.ConnectionTraceabilitySetImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getConnectionTraceabilitySet()
		 * @generated
		 */
		EClass CONNECTION_TRACEABILITY_SET = eINSTANCE.getConnectionTraceabilitySet();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TRACEABILITY_SET__CONNECTION = eINSTANCE.getConnectionTraceabilitySet_Connection();

		/**
		 * The meta object literal for the '<em><b>Abstract Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TRACEABILITY_SET__ABSTRACT_CONNECTION = eINSTANCE.getConnectionTraceabilitySet_AbstractConnection();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.ConceptualEntityTraceImpl <em>Conceptual Entity Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.ConceptualEntityTraceImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getConceptualEntityTrace()
		 * @generated
		 */
		EClass CONCEPTUAL_ENTITY_TRACE = eINSTANCE.getConceptualEntityTrace();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_ENTITY_TRACE__ENTITY = eINSTANCE.getConceptualEntityTrace_Entity();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.ConceptualViewTraceImpl <em>Conceptual View Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.ConceptualViewTraceImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getConceptualViewTrace()
		 * @generated
		 */
		EClass CONCEPTUAL_VIEW_TRACE = eINSTANCE.getConceptualViewTrace();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_VIEW_TRACE__VIEW = eINSTANCE.getConceptualViewTrace_View();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.LogicalEntityTraceImpl <em>Logical Entity Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.LogicalEntityTraceImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getLogicalEntityTrace()
		 * @generated
		 */
		EClass LOGICAL_ENTITY_TRACE = eINSTANCE.getLogicalEntityTrace();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ENTITY_TRACE__ENTITY = eINSTANCE.getLogicalEntityTrace_Entity();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.LogicalViewTraceImpl <em>Logical View Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.LogicalViewTraceImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getLogicalViewTrace()
		 * @generated
		 */
		EClass LOGICAL_VIEW_TRACE = eINSTANCE.getLogicalViewTrace();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_VIEW_TRACE__VIEW = eINSTANCE.getLogicalViewTrace_View();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.PlatformEntityTraceImpl <em>Platform Entity Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.PlatformEntityTraceImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getPlatformEntityTrace()
		 * @generated
		 */
		EClass PLATFORM_ENTITY_TRACE = eINSTANCE.getPlatformEntityTrace();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_ENTITY_TRACE__ENTITY = eINSTANCE.getPlatformEntityTrace_Entity();

		/**
		 * The meta object literal for the '{@link org.osate.face31.traceability.impl.PlatformViewTraceImpl <em>Platform View Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.face31.traceability.impl.PlatformViewTraceImpl
		 * @see org.osate.face31.traceability.impl.TraceabilityPackageImpl#getPlatformViewTrace()
		 * @generated
		 */
		EClass PLATFORM_VIEW_TRACE = eINSTANCE.getPlatformViewTrace();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_VIEW_TRACE__VIEW = eINSTANCE.getPlatformViewTrace_View();

	}

} //TraceabilityPackage
