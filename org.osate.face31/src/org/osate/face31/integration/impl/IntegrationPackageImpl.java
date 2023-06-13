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
package org.osate.face31.integration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.datamodel10.DatamodelPackage;

import org.osate.datamodel10.conceptual.ConceptualPackage;

import org.osate.datamodel10.conceptual.impl.ConceptualPackageImpl;

import org.osate.datamodel10.impl.DatamodelPackageImpl;

import org.osate.datamodel10.logical.LogicalPackage;

import org.osate.datamodel10.logical.impl.LogicalPackageImpl;

import org.osate.datamodel10.platform.PlatformPackage;

import org.osate.datamodel10.platform.impl.PlatformPackageImpl;

import org.osate.face31.FacePackage;

import org.osate.face31.impl.FacePackageImpl;

import org.osate.face31.integration.Element;
import org.osate.face31.integration.IntegrationContext;
import org.osate.face31.integration.IntegrationFactory;
import org.osate.face31.integration.IntegrationModel;
import org.osate.face31.integration.IntegrationPackage;
import org.osate.face31.integration.TSNodeConnection;
import org.osate.face31.integration.TSNodeInputPort;
import org.osate.face31.integration.TSNodeOutputPort;
import org.osate.face31.integration.TSNodePort;
import org.osate.face31.integration.TSNodePortBase;
import org.osate.face31.integration.TransportChannel;
import org.osate.face31.integration.TransportNode;
import org.osate.face31.integration.UoPEndPoint;
import org.osate.face31.integration.UoPInputEndPoint;
import org.osate.face31.integration.UoPInstance;
import org.osate.face31.integration.UoPOutputEndPoint;
import org.osate.face31.integration.ViewAggregation;
import org.osate.face31.integration.ViewFilter;
import org.osate.face31.integration.ViewSink;
import org.osate.face31.integration.ViewSource;
import org.osate.face31.integration.ViewTransformation;
import org.osate.face31.integration.ViewTransporter;

import org.osate.face31.traceability.TraceabilityPackage;

import org.osate.face31.traceability.impl.TraceabilityPackageImpl;

import org.osate.face31.uop.UopPackage;

import org.osate.face31.uop.impl.UopPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationPackageImpl extends EPackageImpl implements IntegrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsNodeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsNodePortBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoPInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoPEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoPInputEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoPOutputEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsNodePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsNodeInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsNodeOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTransporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportChannelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.osate.face31.integration.IntegrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegrationPackageImpl() {
		super(eNS_URI, IntegrationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IntegrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntegrationPackage init() {
		if (isInited) return (IntegrationPackage)EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIntegrationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IntegrationPackageImpl theIntegrationPackage = registeredIntegrationPackage instanceof IntegrationPackageImpl ? (IntegrationPackageImpl)registeredIntegrationPackage : new IntegrationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FacePackage.eNS_URI);
		FacePackageImpl theFacePackage = (FacePackageImpl)(registeredPackage instanceof FacePackageImpl ? registeredPackage : FacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UopPackage.eNS_URI);
		UopPackageImpl theUopPackage = (UopPackageImpl)(registeredPackage instanceof UopPackageImpl ? registeredPackage : UopPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(registeredPackage instanceof TraceabilityPackageImpl ? registeredPackage : TraceabilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI);
		DatamodelPackageImpl theDatamodelPackage = (DatamodelPackageImpl)(registeredPackage instanceof DatamodelPackageImpl ? registeredPackage : DatamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(registeredPackage instanceof ConceptualPackageImpl ? registeredPackage : ConceptualPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(registeredPackage instanceof LogicalPackageImpl ? registeredPackage : LogicalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(registeredPackage instanceof PlatformPackageImpl ? registeredPackage : PlatformPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegrationPackage.createPackageContents();
		theFacePackage.createPackageContents();
		theUopPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theDatamodelPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theLogicalPackage.createPackageContents();
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theIntegrationPackage.initializePackageContents();
		theFacePackage.initializePackageContents();
		theUopPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theDatamodelPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theLogicalPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntegrationPackage.eNS_URI, theIntegrationPackage);
		return theIntegrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrationModel() {
		return integrationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntegrationModel_Im() {
		return (EReference)integrationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntegrationModel_Element() {
		return (EReference)integrationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrationContext() {
		return integrationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntegrationContext_Connection() {
		return (EReference)integrationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntegrationContext_Node() {
		return (EReference)integrationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSNodeConnection() {
		return tsNodeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSNodeConnection_Source() {
		return (EReference)tsNodeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSNodeConnection_Destination() {
		return (EReference)tsNodeConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSNodePortBase() {
		return tsNodePortBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUoPInstance() {
		return uoPInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPInstance_Realizes() {
		return (EReference)uoPInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPInstance_Output() {
		return (EReference)uoPInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPInstance_Input() {
		return (EReference)uoPInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUoPInstance_ConfigurationURI() {
		return (EAttribute)uoPInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUoPEndPoint() {
		return uoPEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPEndPoint_Connection() {
		return (EReference)uoPEndPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUoPInputEndPoint() {
		return uoPInputEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUoPOutputEndPoint() {
		return uoPOutputEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportNode() {
		return transportNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransportNode_OutPort() {
		return (EReference)transportNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransportNode_InPort() {
		return (EReference)transportNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSNodePort() {
		return tsNodePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSNodePort_View() {
		return (EReference)tsNodePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSNodeInputPort() {
		return tsNodeInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSNodeOutputPort() {
		return tsNodeOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewAggregation() {
		return viewAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewFilter() {
		return viewFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewSource() {
		return viewSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewSink() {
		return viewSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewTransformation() {
		return viewTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewTransporter() {
		return viewTransporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewTransporter_Channel() {
		return (EReference)viewTransporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportChannel() {
		return transportChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationFactory getIntegrationFactory() {
		return (IntegrationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		integrationModelEClass = createEClass(INTEGRATION_MODEL);
		createEReference(integrationModelEClass, INTEGRATION_MODEL__IM);
		createEReference(integrationModelEClass, INTEGRATION_MODEL__ELEMENT);

		elementEClass = createEClass(ELEMENT);

		integrationContextEClass = createEClass(INTEGRATION_CONTEXT);
		createEReference(integrationContextEClass, INTEGRATION_CONTEXT__CONNECTION);
		createEReference(integrationContextEClass, INTEGRATION_CONTEXT__NODE);

		tsNodeConnectionEClass = createEClass(TS_NODE_CONNECTION);
		createEReference(tsNodeConnectionEClass, TS_NODE_CONNECTION__SOURCE);
		createEReference(tsNodeConnectionEClass, TS_NODE_CONNECTION__DESTINATION);

		tsNodePortBaseEClass = createEClass(TS_NODE_PORT_BASE);

		uoPInstanceEClass = createEClass(UO_PINSTANCE);
		createEReference(uoPInstanceEClass, UO_PINSTANCE__REALIZES);
		createEReference(uoPInstanceEClass, UO_PINSTANCE__OUTPUT);
		createEReference(uoPInstanceEClass, UO_PINSTANCE__INPUT);
		createEAttribute(uoPInstanceEClass, UO_PINSTANCE__CONFIGURATION_URI);

		uoPEndPointEClass = createEClass(UO_PEND_POINT);
		createEReference(uoPEndPointEClass, UO_PEND_POINT__CONNECTION);

		uoPInputEndPointEClass = createEClass(UO_PINPUT_END_POINT);

		uoPOutputEndPointEClass = createEClass(UO_POUTPUT_END_POINT);

		transportNodeEClass = createEClass(TRANSPORT_NODE);
		createEReference(transportNodeEClass, TRANSPORT_NODE__OUT_PORT);
		createEReference(transportNodeEClass, TRANSPORT_NODE__IN_PORT);

		tsNodePortEClass = createEClass(TS_NODE_PORT);
		createEReference(tsNodePortEClass, TS_NODE_PORT__VIEW);

		tsNodeInputPortEClass = createEClass(TS_NODE_INPUT_PORT);

		tsNodeOutputPortEClass = createEClass(TS_NODE_OUTPUT_PORT);

		viewAggregationEClass = createEClass(VIEW_AGGREGATION);

		viewFilterEClass = createEClass(VIEW_FILTER);

		viewSourceEClass = createEClass(VIEW_SOURCE);

		viewSinkEClass = createEClass(VIEW_SINK);

		viewTransformationEClass = createEClass(VIEW_TRANSFORMATION);

		viewTransporterEClass = createEClass(VIEW_TRANSPORTER);
		createEReference(viewTransporterEClass, VIEW_TRANSPORTER__CHANNEL);

		transportChannelEClass = createEClass(TRANSPORT_CHANNEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FacePackage theFacePackage = (FacePackage)EPackage.Registry.INSTANCE.getEPackage(FacePackage.eNS_URI);
		UopPackage theUopPackage = (UopPackage)EPackage.Registry.INSTANCE.getEPackage(UopPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		integrationModelEClass.getESuperTypes().add(theFacePackage.getElement());
		elementEClass.getESuperTypes().add(theFacePackage.getElement());
		integrationContextEClass.getESuperTypes().add(this.getElement());
		uoPInstanceEClass.getESuperTypes().add(this.getElement());
		uoPEndPointEClass.getESuperTypes().add(this.getTSNodePortBase());
		uoPInputEndPointEClass.getESuperTypes().add(this.getUoPEndPoint());
		uoPOutputEndPointEClass.getESuperTypes().add(this.getUoPEndPoint());
		transportNodeEClass.getESuperTypes().add(theFacePackage.getElement());
		tsNodePortEClass.getESuperTypes().add(this.getTSNodePortBase());
		tsNodeInputPortEClass.getESuperTypes().add(this.getTSNodePort());
		tsNodeOutputPortEClass.getESuperTypes().add(this.getTSNodePort());
		viewAggregationEClass.getESuperTypes().add(this.getTransportNode());
		viewFilterEClass.getESuperTypes().add(this.getTransportNode());
		viewSourceEClass.getESuperTypes().add(this.getTransportNode());
		viewSinkEClass.getESuperTypes().add(this.getTransportNode());
		viewTransformationEClass.getESuperTypes().add(this.getTransportNode());
		viewTransporterEClass.getESuperTypes().add(this.getTransportNode());
		transportChannelEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(integrationModelEClass, IntegrationModel.class, "IntegrationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrationModel_Im(), this.getIntegrationModel(), null, "im", null, 0, -1, IntegrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntegrationModel_Element(), this.getElement(), null, "element", null, 0, -1, IntegrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integrationContextEClass, IntegrationContext.class, "IntegrationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrationContext_Connection(), this.getTSNodeConnection(), null, "connection", null, 0, -1, IntegrationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntegrationContext_Node(), this.getTransportNode(), null, "node", null, 0, -1, IntegrationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tsNodeConnectionEClass, TSNodeConnection.class, "TSNodeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSNodeConnection_Source(), this.getTSNodePortBase(), null, "source", null, 1, 1, TSNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSNodeConnection_Destination(), this.getTSNodePortBase(), null, "destination", null, 1, 1, TSNodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tsNodePortBaseEClass, TSNodePortBase.class, "TSNodePortBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uoPInstanceEClass, UoPInstance.class, "UoPInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUoPInstance_Realizes(), theUopPackage.getUnitOfPortability(), null, "realizes", null, 1, 1, UoPInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUoPInstance_Output(), this.getUoPOutputEndPoint(), null, "output", null, 0, -1, UoPInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUoPInstance_Input(), this.getUoPInputEndPoint(), null, "input", null, 0, -1, UoPInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUoPInstance_ConfigurationURI(), ecorePackage.getEString(), "configurationURI", null, 0, 1, UoPInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uoPEndPointEClass, UoPEndPoint.class, "UoPEndPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUoPEndPoint_Connection(), theUopPackage.getConnection(), null, "connection", null, 1, 1, UoPEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uoPInputEndPointEClass, UoPInputEndPoint.class, "UoPInputEndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uoPOutputEndPointEClass, UoPOutputEndPoint.class, "UoPOutputEndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportNodeEClass, TransportNode.class, "TransportNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransportNode_OutPort(), this.getTSNodeOutputPort(), null, "outPort", null, 0, 1, TransportNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportNode_InPort(), this.getTSNodeInputPort(), null, "inPort", null, 0, -1, TransportNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tsNodePortEClass, TSNodePort.class, "TSNodePort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSNodePort_View(), theUopPackage.getMessageType(), null, "view", null, 1, 1, TSNodePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tsNodeInputPortEClass, TSNodeInputPort.class, "TSNodeInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tsNodeOutputPortEClass, TSNodeOutputPort.class, "TSNodeOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewAggregationEClass, ViewAggregation.class, "ViewAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewFilterEClass, ViewFilter.class, "ViewFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewSourceEClass, ViewSource.class, "ViewSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewSinkEClass, ViewSink.class, "ViewSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewTransformationEClass, ViewTransformation.class, "ViewTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewTransporterEClass, ViewTransporter.class, "ViewTransporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewTransporter_Channel(), this.getTransportChannel(), null, "channel", null, 1, 1, ViewTransporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportChannelEClass, TransportChannel.class, "TransportChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //IntegrationPackageImpl
