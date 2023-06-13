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
package face.integration;

import face.FacePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see face.integration.IntegrationFactory
 * @model kind="package"
 * @generated
 */
public interface IntegrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "integration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengroup.us/face/integration/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "integration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegrationPackage eINSTANCE = face.integration.impl.IntegrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link face.integration.impl.IntegrationModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.IntegrationModelImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getIntegrationModel()
	 * @generated
	 */
	int INTEGRATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MODEL__NAME = FacePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MODEL__DESCRIPTION = FacePackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Im</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MODEL__IM = FacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MODEL__ELEMENT = FacePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MODEL_FEATURE_COUNT = FacePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MODEL_OPERATION_COUNT = FacePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.ElementImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getElement()
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
	 * The meta object id for the '{@link face.integration.impl.IntegrationContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.IntegrationContextImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getIntegrationContext()
	 * @generated
	 */
	int INTEGRATION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_CONTEXT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_CONTEXT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_CONTEXT__CONNECTION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_CONTEXT__NODE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_CONTEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_CONTEXT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.TSNodeConnectionImpl <em>TS Node Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.TSNodeConnectionImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getTSNodeConnection()
	 * @generated
	 */
	int TS_NODE_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_CONNECTION__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>TS Node Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TS Node Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.TSNodePortBaseImpl <em>TS Node Port Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.TSNodePortBaseImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getTSNodePortBase()
	 * @generated
	 */
	int TS_NODE_PORT_BASE = 4;

	/**
	 * The number of structural features of the '<em>TS Node Port Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_PORT_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>TS Node Port Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_PORT_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.UoPInstanceImpl <em>Uo PInstance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.UoPInstanceImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getUoPInstance()
	 * @generated
	 */
	int UO_PINSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE__REALIZES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE__OUTPUT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE__INPUT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configuration URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE__CONFIGURATION_URI = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Uo PInstance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Uo PInstance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINSTANCE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.UoPEndPointImpl <em>Uo PEnd Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.UoPEndPointImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getUoPEndPoint()
	 * @generated
	 */
	int UO_PEND_POINT = 6;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PEND_POINT__CONNECTION = TS_NODE_PORT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uo PEnd Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PEND_POINT_FEATURE_COUNT = TS_NODE_PORT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uo PEnd Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PEND_POINT_OPERATION_COUNT = TS_NODE_PORT_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.UoPInputEndPointImpl <em>Uo PInput End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.UoPInputEndPointImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getUoPInputEndPoint()
	 * @generated
	 */
	int UO_PINPUT_END_POINT = 7;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINPUT_END_POINT__CONNECTION = UO_PEND_POINT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Uo PInput End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINPUT_END_POINT_FEATURE_COUNT = UO_PEND_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uo PInput End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PINPUT_END_POINT_OPERATION_COUNT = UO_PEND_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.UoPOutputEndPointImpl <em>Uo POutput End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.UoPOutputEndPointImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getUoPOutputEndPoint()
	 * @generated
	 */
	int UO_POUTPUT_END_POINT = 8;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_POUTPUT_END_POINT__CONNECTION = UO_PEND_POINT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Uo POutput End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_POUTPUT_END_POINT_FEATURE_COUNT = UO_PEND_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uo POutput End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_POUTPUT_END_POINT_OPERATION_COUNT = UO_PEND_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.TransportNodeImpl <em>Transport Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.TransportNodeImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getTransportNode()
	 * @generated
	 */
	int TRANSPORT_NODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_NODE__NAME = FacePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_NODE__DESCRIPTION = FacePackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_NODE__OUT_PORT = FacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_NODE__IN_PORT = FacePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transport Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_NODE_FEATURE_COUNT = FacePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transport Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_NODE_OPERATION_COUNT = FacePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.TSNodePortImpl <em>TS Node Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.TSNodePortImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getTSNodePort()
	 * @generated
	 */
	int TS_NODE_PORT = 10;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_PORT__VIEW = TS_NODE_PORT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TS Node Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_PORT_FEATURE_COUNT = TS_NODE_PORT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TS Node Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_PORT_OPERATION_COUNT = TS_NODE_PORT_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.TSNodeInputPortImpl <em>TS Node Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.TSNodeInputPortImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getTSNodeInputPort()
	 * @generated
	 */
	int TS_NODE_INPUT_PORT = 11;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_INPUT_PORT__VIEW = TS_NODE_PORT__VIEW;

	/**
	 * The number of structural features of the '<em>TS Node Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_INPUT_PORT_FEATURE_COUNT = TS_NODE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TS Node Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_INPUT_PORT_OPERATION_COUNT = TS_NODE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.TSNodeOutputPortImpl <em>TS Node Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.TSNodeOutputPortImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getTSNodeOutputPort()
	 * @generated
	 */
	int TS_NODE_OUTPUT_PORT = 12;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_OUTPUT_PORT__VIEW = TS_NODE_PORT__VIEW;

	/**
	 * The number of structural features of the '<em>TS Node Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_OUTPUT_PORT_FEATURE_COUNT = TS_NODE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TS Node Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_NODE_OUTPUT_PORT_OPERATION_COUNT = TS_NODE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.ViewAggregationImpl <em>View Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.ViewAggregationImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getViewAggregation()
	 * @generated
	 */
	int VIEW_AGGREGATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AGGREGATION__NAME = TRANSPORT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AGGREGATION__DESCRIPTION = TRANSPORT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AGGREGATION__OUT_PORT = TRANSPORT_NODE__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AGGREGATION__IN_PORT = TRANSPORT_NODE__IN_PORT;

	/**
	 * The number of structural features of the '<em>View Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AGGREGATION_FEATURE_COUNT = TRANSPORT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_AGGREGATION_OPERATION_COUNT = TRANSPORT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.ViewFilterImpl <em>View Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.ViewFilterImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getViewFilter()
	 * @generated
	 */
	int VIEW_FILTER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FILTER__NAME = TRANSPORT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FILTER__DESCRIPTION = TRANSPORT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FILTER__OUT_PORT = TRANSPORT_NODE__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FILTER__IN_PORT = TRANSPORT_NODE__IN_PORT;

	/**
	 * The number of structural features of the '<em>View Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FILTER_FEATURE_COUNT = TRANSPORT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FILTER_OPERATION_COUNT = TRANSPORT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.ViewSourceImpl <em>View Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.ViewSourceImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getViewSource()
	 * @generated
	 */
	int VIEW_SOURCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SOURCE__NAME = TRANSPORT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SOURCE__DESCRIPTION = TRANSPORT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SOURCE__OUT_PORT = TRANSPORT_NODE__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SOURCE__IN_PORT = TRANSPORT_NODE__IN_PORT;

	/**
	 * The number of structural features of the '<em>View Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SOURCE_FEATURE_COUNT = TRANSPORT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SOURCE_OPERATION_COUNT = TRANSPORT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.ViewSinkImpl <em>View Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.ViewSinkImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getViewSink()
	 * @generated
	 */
	int VIEW_SINK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SINK__NAME = TRANSPORT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SINK__DESCRIPTION = TRANSPORT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SINK__OUT_PORT = TRANSPORT_NODE__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SINK__IN_PORT = TRANSPORT_NODE__IN_PORT;

	/**
	 * The number of structural features of the '<em>View Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SINK_FEATURE_COUNT = TRANSPORT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SINK_OPERATION_COUNT = TRANSPORT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.ViewTransformationImpl <em>View Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.ViewTransformationImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getViewTransformation()
	 * @generated
	 */
	int VIEW_TRANSFORMATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSFORMATION__NAME = TRANSPORT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSFORMATION__DESCRIPTION = TRANSPORT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSFORMATION__OUT_PORT = TRANSPORT_NODE__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSFORMATION__IN_PORT = TRANSPORT_NODE__IN_PORT;

	/**
	 * The number of structural features of the '<em>View Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSFORMATION_FEATURE_COUNT = TRANSPORT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSFORMATION_OPERATION_COUNT = TRANSPORT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.ViewTransporterImpl <em>View Transporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.ViewTransporterImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getViewTransporter()
	 * @generated
	 */
	int VIEW_TRANSPORTER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSPORTER__NAME = TRANSPORT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSPORTER__DESCRIPTION = TRANSPORT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSPORTER__OUT_PORT = TRANSPORT_NODE__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSPORTER__IN_PORT = TRANSPORT_NODE__IN_PORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSPORTER__CHANNEL = TRANSPORT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Transporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSPORTER_FEATURE_COUNT = TRANSPORT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Transporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSPORTER_OPERATION_COUNT = TRANSPORT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.integration.impl.TransportChannelImpl <em>Transport Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.integration.impl.TransportChannelImpl
	 * @see face.integration.impl.IntegrationPackageImpl#getTransportChannel()
	 * @generated
	 */
	int TRANSPORT_CHANNEL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHANNEL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHANNEL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Transport Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHANNEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHANNEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link face.integration.IntegrationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see face.integration.IntegrationModel
	 * @generated
	 */
	EClass getIntegrationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link face.integration.IntegrationModel#getIm <em>Im</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Im</em>'.
	 * @see face.integration.IntegrationModel#getIm()
	 * @see #getIntegrationModel()
	 * @generated
	 */
	EReference getIntegrationModel_Im();

	/**
	 * Returns the meta object for the containment reference list '{@link face.integration.IntegrationModel#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see face.integration.IntegrationModel#getElement()
	 * @see #getIntegrationModel()
	 * @generated
	 */
	EReference getIntegrationModel_Element();

	/**
	 * Returns the meta object for class '{@link face.integration.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see face.integration.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link face.integration.IntegrationContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see face.integration.IntegrationContext
	 * @generated
	 */
	EClass getIntegrationContext();

	/**
	 * Returns the meta object for the containment reference list '{@link face.integration.IntegrationContext#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see face.integration.IntegrationContext#getConnection()
	 * @see #getIntegrationContext()
	 * @generated
	 */
	EReference getIntegrationContext_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link face.integration.IntegrationContext#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see face.integration.IntegrationContext#getNode()
	 * @see #getIntegrationContext()
	 * @generated
	 */
	EReference getIntegrationContext_Node();

	/**
	 * Returns the meta object for class '{@link face.integration.TSNodeConnection <em>TS Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS Node Connection</em>'.
	 * @see face.integration.TSNodeConnection
	 * @generated
	 */
	EClass getTSNodeConnection();

	/**
	 * Returns the meta object for the reference '{@link face.integration.TSNodeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see face.integration.TSNodeConnection#getSource()
	 * @see #getTSNodeConnection()
	 * @generated
	 */
	EReference getTSNodeConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link face.integration.TSNodeConnection#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see face.integration.TSNodeConnection#getDestination()
	 * @see #getTSNodeConnection()
	 * @generated
	 */
	EReference getTSNodeConnection_Destination();

	/**
	 * Returns the meta object for class '{@link face.integration.TSNodePortBase <em>TS Node Port Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS Node Port Base</em>'.
	 * @see face.integration.TSNodePortBase
	 * @generated
	 */
	EClass getTSNodePortBase();

	/**
	 * Returns the meta object for class '{@link face.integration.UoPInstance <em>Uo PInstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo PInstance</em>'.
	 * @see face.integration.UoPInstance
	 * @generated
	 */
	EClass getUoPInstance();

	/**
	 * Returns the meta object for the reference '{@link face.integration.UoPInstance#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.integration.UoPInstance#getRealizes()
	 * @see #getUoPInstance()
	 * @generated
	 */
	EReference getUoPInstance_Realizes();

	/**
	 * Returns the meta object for the containment reference list '{@link face.integration.UoPInstance#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see face.integration.UoPInstance#getOutput()
	 * @see #getUoPInstance()
	 * @generated
	 */
	EReference getUoPInstance_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link face.integration.UoPInstance#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see face.integration.UoPInstance#getInput()
	 * @see #getUoPInstance()
	 * @generated
	 */
	EReference getUoPInstance_Input();

	/**
	 * Returns the meta object for the attribute '{@link face.integration.UoPInstance#getConfigurationURI <em>Configuration URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration URI</em>'.
	 * @see face.integration.UoPInstance#getConfigurationURI()
	 * @see #getUoPInstance()
	 * @generated
	 */
	EAttribute getUoPInstance_ConfigurationURI();

	/**
	 * Returns the meta object for class '{@link face.integration.UoPEndPoint <em>Uo PEnd Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo PEnd Point</em>'.
	 * @see face.integration.UoPEndPoint
	 * @generated
	 */
	EClass getUoPEndPoint();

	/**
	 * Returns the meta object for the reference '{@link face.integration.UoPEndPoint#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see face.integration.UoPEndPoint#getConnection()
	 * @see #getUoPEndPoint()
	 * @generated
	 */
	EReference getUoPEndPoint_Connection();

	/**
	 * Returns the meta object for class '{@link face.integration.UoPInputEndPoint <em>Uo PInput End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo PInput End Point</em>'.
	 * @see face.integration.UoPInputEndPoint
	 * @generated
	 */
	EClass getUoPInputEndPoint();

	/**
	 * Returns the meta object for class '{@link face.integration.UoPOutputEndPoint <em>Uo POutput End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo POutput End Point</em>'.
	 * @see face.integration.UoPOutputEndPoint
	 * @generated
	 */
	EClass getUoPOutputEndPoint();

	/**
	 * Returns the meta object for class '{@link face.integration.TransportNode <em>Transport Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Node</em>'.
	 * @see face.integration.TransportNode
	 * @generated
	 */
	EClass getTransportNode();

	/**
	 * Returns the meta object for the containment reference '{@link face.integration.TransportNode#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see face.integration.TransportNode#getOutPort()
	 * @see #getTransportNode()
	 * @generated
	 */
	EReference getTransportNode_OutPort();

	/**
	 * Returns the meta object for the containment reference list '{@link face.integration.TransportNode#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Port</em>'.
	 * @see face.integration.TransportNode#getInPort()
	 * @see #getTransportNode()
	 * @generated
	 */
	EReference getTransportNode_InPort();

	/**
	 * Returns the meta object for class '{@link face.integration.TSNodePort <em>TS Node Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS Node Port</em>'.
	 * @see face.integration.TSNodePort
	 * @generated
	 */
	EClass getTSNodePort();

	/**
	 * Returns the meta object for the reference '{@link face.integration.TSNodePort#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see face.integration.TSNodePort#getView()
	 * @see #getTSNodePort()
	 * @generated
	 */
	EReference getTSNodePort_View();

	/**
	 * Returns the meta object for class '{@link face.integration.TSNodeInputPort <em>TS Node Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS Node Input Port</em>'.
	 * @see face.integration.TSNodeInputPort
	 * @generated
	 */
	EClass getTSNodeInputPort();

	/**
	 * Returns the meta object for class '{@link face.integration.TSNodeOutputPort <em>TS Node Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS Node Output Port</em>'.
	 * @see face.integration.TSNodeOutputPort
	 * @generated
	 */
	EClass getTSNodeOutputPort();

	/**
	 * Returns the meta object for class '{@link face.integration.ViewAggregation <em>View Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Aggregation</em>'.
	 * @see face.integration.ViewAggregation
	 * @generated
	 */
	EClass getViewAggregation();

	/**
	 * Returns the meta object for class '{@link face.integration.ViewFilter <em>View Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Filter</em>'.
	 * @see face.integration.ViewFilter
	 * @generated
	 */
	EClass getViewFilter();

	/**
	 * Returns the meta object for class '{@link face.integration.ViewSource <em>View Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Source</em>'.
	 * @see face.integration.ViewSource
	 * @generated
	 */
	EClass getViewSource();

	/**
	 * Returns the meta object for class '{@link face.integration.ViewSink <em>View Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Sink</em>'.
	 * @see face.integration.ViewSink
	 * @generated
	 */
	EClass getViewSink();

	/**
	 * Returns the meta object for class '{@link face.integration.ViewTransformation <em>View Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Transformation</em>'.
	 * @see face.integration.ViewTransformation
	 * @generated
	 */
	EClass getViewTransformation();

	/**
	 * Returns the meta object for class '{@link face.integration.ViewTransporter <em>View Transporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Transporter</em>'.
	 * @see face.integration.ViewTransporter
	 * @generated
	 */
	EClass getViewTransporter();

	/**
	 * Returns the meta object for the reference '{@link face.integration.ViewTransporter#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see face.integration.ViewTransporter#getChannel()
	 * @see #getViewTransporter()
	 * @generated
	 */
	EReference getViewTransporter_Channel();

	/**
	 * Returns the meta object for class '{@link face.integration.TransportChannel <em>Transport Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Channel</em>'.
	 * @see face.integration.TransportChannel
	 * @generated
	 */
	EClass getTransportChannel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntegrationFactory getIntegrationFactory();

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
		 * The meta object literal for the '{@link face.integration.impl.IntegrationModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.IntegrationModelImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getIntegrationModel()
		 * @generated
		 */
		EClass INTEGRATION_MODEL = eINSTANCE.getIntegrationModel();

		/**
		 * The meta object literal for the '<em><b>Im</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_MODEL__IM = eINSTANCE.getIntegrationModel_Im();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_MODEL__ELEMENT = eINSTANCE.getIntegrationModel_Element();

		/**
		 * The meta object literal for the '{@link face.integration.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.ElementImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link face.integration.impl.IntegrationContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.IntegrationContextImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getIntegrationContext()
		 * @generated
		 */
		EClass INTEGRATION_CONTEXT = eINSTANCE.getIntegrationContext();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_CONTEXT__CONNECTION = eINSTANCE.getIntegrationContext_Connection();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_CONTEXT__NODE = eINSTANCE.getIntegrationContext_Node();

		/**
		 * The meta object literal for the '{@link face.integration.impl.TSNodeConnectionImpl <em>TS Node Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.TSNodeConnectionImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getTSNodeConnection()
		 * @generated
		 */
		EClass TS_NODE_CONNECTION = eINSTANCE.getTSNodeConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TS_NODE_CONNECTION__SOURCE = eINSTANCE.getTSNodeConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TS_NODE_CONNECTION__DESTINATION = eINSTANCE.getTSNodeConnection_Destination();

		/**
		 * The meta object literal for the '{@link face.integration.impl.TSNodePortBaseImpl <em>TS Node Port Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.TSNodePortBaseImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getTSNodePortBase()
		 * @generated
		 */
		EClass TS_NODE_PORT_BASE = eINSTANCE.getTSNodePortBase();

		/**
		 * The meta object literal for the '{@link face.integration.impl.UoPInstanceImpl <em>Uo PInstance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.UoPInstanceImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getUoPInstance()
		 * @generated
		 */
		EClass UO_PINSTANCE = eINSTANCE.getUoPInstance();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PINSTANCE__REALIZES = eINSTANCE.getUoPInstance_Realizes();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PINSTANCE__OUTPUT = eINSTANCE.getUoPInstance_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PINSTANCE__INPUT = eINSTANCE.getUoPInstance_Input();

		/**
		 * The meta object literal for the '<em><b>Configuration URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UO_PINSTANCE__CONFIGURATION_URI = eINSTANCE.getUoPInstance_ConfigurationURI();

		/**
		 * The meta object literal for the '{@link face.integration.impl.UoPEndPointImpl <em>Uo PEnd Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.UoPEndPointImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getUoPEndPoint()
		 * @generated
		 */
		EClass UO_PEND_POINT = eINSTANCE.getUoPEndPoint();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_PEND_POINT__CONNECTION = eINSTANCE.getUoPEndPoint_Connection();

		/**
		 * The meta object literal for the '{@link face.integration.impl.UoPInputEndPointImpl <em>Uo PInput End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.UoPInputEndPointImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getUoPInputEndPoint()
		 * @generated
		 */
		EClass UO_PINPUT_END_POINT = eINSTANCE.getUoPInputEndPoint();

		/**
		 * The meta object literal for the '{@link face.integration.impl.UoPOutputEndPointImpl <em>Uo POutput End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.UoPOutputEndPointImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getUoPOutputEndPoint()
		 * @generated
		 */
		EClass UO_POUTPUT_END_POINT = eINSTANCE.getUoPOutputEndPoint();

		/**
		 * The meta object literal for the '{@link face.integration.impl.TransportNodeImpl <em>Transport Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.TransportNodeImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getTransportNode()
		 * @generated
		 */
		EClass TRANSPORT_NODE = eINSTANCE.getTransportNode();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_NODE__OUT_PORT = eINSTANCE.getTransportNode_OutPort();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_NODE__IN_PORT = eINSTANCE.getTransportNode_InPort();

		/**
		 * The meta object literal for the '{@link face.integration.impl.TSNodePortImpl <em>TS Node Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.TSNodePortImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getTSNodePort()
		 * @generated
		 */
		EClass TS_NODE_PORT = eINSTANCE.getTSNodePort();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TS_NODE_PORT__VIEW = eINSTANCE.getTSNodePort_View();

		/**
		 * The meta object literal for the '{@link face.integration.impl.TSNodeInputPortImpl <em>TS Node Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.TSNodeInputPortImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getTSNodeInputPort()
		 * @generated
		 */
		EClass TS_NODE_INPUT_PORT = eINSTANCE.getTSNodeInputPort();

		/**
		 * The meta object literal for the '{@link face.integration.impl.TSNodeOutputPortImpl <em>TS Node Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.TSNodeOutputPortImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getTSNodeOutputPort()
		 * @generated
		 */
		EClass TS_NODE_OUTPUT_PORT = eINSTANCE.getTSNodeOutputPort();

		/**
		 * The meta object literal for the '{@link face.integration.impl.ViewAggregationImpl <em>View Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.ViewAggregationImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getViewAggregation()
		 * @generated
		 */
		EClass VIEW_AGGREGATION = eINSTANCE.getViewAggregation();

		/**
		 * The meta object literal for the '{@link face.integration.impl.ViewFilterImpl <em>View Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.ViewFilterImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getViewFilter()
		 * @generated
		 */
		EClass VIEW_FILTER = eINSTANCE.getViewFilter();

		/**
		 * The meta object literal for the '{@link face.integration.impl.ViewSourceImpl <em>View Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.ViewSourceImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getViewSource()
		 * @generated
		 */
		EClass VIEW_SOURCE = eINSTANCE.getViewSource();

		/**
		 * The meta object literal for the '{@link face.integration.impl.ViewSinkImpl <em>View Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.ViewSinkImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getViewSink()
		 * @generated
		 */
		EClass VIEW_SINK = eINSTANCE.getViewSink();

		/**
		 * The meta object literal for the '{@link face.integration.impl.ViewTransformationImpl <em>View Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.ViewTransformationImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getViewTransformation()
		 * @generated
		 */
		EClass VIEW_TRANSFORMATION = eINSTANCE.getViewTransformation();

		/**
		 * The meta object literal for the '{@link face.integration.impl.ViewTransporterImpl <em>View Transporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.ViewTransporterImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getViewTransporter()
		 * @generated
		 */
		EClass VIEW_TRANSPORTER = eINSTANCE.getViewTransporter();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TRANSPORTER__CHANNEL = eINSTANCE.getViewTransporter_Channel();

		/**
		 * The meta object literal for the '{@link face.integration.impl.TransportChannelImpl <em>Transport Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.integration.impl.TransportChannelImpl
		 * @see face.integration.impl.IntegrationPackageImpl#getTransportChannel()
		 * @generated
		 */
		EClass TRANSPORT_CHANNEL = eINSTANCE.getTransportChannel();

	}

} //IntegrationPackage
