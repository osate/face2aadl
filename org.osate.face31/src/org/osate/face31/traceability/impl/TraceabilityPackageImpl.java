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
package org.osate.face31.traceability.impl;

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

import org.osate.face31.integration.IntegrationPackage;

import org.osate.face31.integration.impl.IntegrationPackageImpl;

import org.osate.face31.traceability.ConceptualEntityTrace;
import org.osate.face31.traceability.ConceptualViewTrace;
import org.osate.face31.traceability.ConnectionTraceabilitySet;
import org.osate.face31.traceability.Element;
import org.osate.face31.traceability.LogicalEntityTrace;
import org.osate.face31.traceability.LogicalViewTrace;
import org.osate.face31.traceability.PlatformEntityTrace;
import org.osate.face31.traceability.PlatformViewTrace;
import org.osate.face31.traceability.TraceabilityFactory;
import org.osate.face31.traceability.TraceabilityModel;
import org.osate.face31.traceability.TraceabilityPackage;
import org.osate.face31.traceability.TraceabilityPoint;
import org.osate.face31.traceability.TraceableElement;
import org.osate.face31.traceability.UoPTraceabilitySet;

import org.osate.face31.uop.UopPackage;

import org.osate.face31.uop.impl.UopPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityPackageImpl extends EPackageImpl implements TraceabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceabilityModelEClass = null;

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
	private EClass traceableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceabilityPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoPTraceabilitySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTraceabilitySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualEntityTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualViewTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalEntityTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalViewTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEntityTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformViewTraceEClass = null;

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
	 * @see org.osate.face31.traceability.TraceabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraceabilityPackageImpl() {
		super(eNS_URI, TraceabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TraceabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraceabilityPackage init() {
		if (isInited) return (TraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTraceabilityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TraceabilityPackageImpl theTraceabilityPackage = registeredTraceabilityPackage instanceof TraceabilityPackageImpl ? (TraceabilityPackageImpl)registeredTraceabilityPackage : new TraceabilityPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FacePackage.eNS_URI);
		FacePackageImpl theFacePackage = (FacePackageImpl)(registeredPackage instanceof FacePackageImpl ? registeredPackage : FacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UopPackage.eNS_URI);
		UopPackageImpl theUopPackage = (UopPackageImpl)(registeredPackage instanceof UopPackageImpl ? registeredPackage : UopPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(registeredPackage instanceof IntegrationPackageImpl ? registeredPackage : IntegrationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI);
		DatamodelPackageImpl theDatamodelPackage = (DatamodelPackageImpl)(registeredPackage instanceof DatamodelPackageImpl ? registeredPackage : DatamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(registeredPackage instanceof ConceptualPackageImpl ? registeredPackage : ConceptualPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(registeredPackage instanceof LogicalPackageImpl ? registeredPackage : LogicalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(registeredPackage instanceof PlatformPackageImpl ? registeredPackage : PlatformPackage.eINSTANCE);

		// Create package meta-data objects
		theTraceabilityPackage.createPackageContents();
		theFacePackage.createPackageContents();
		theUopPackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theDatamodelPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theLogicalPackage.createPackageContents();
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theTraceabilityPackage.initializePackageContents();
		theFacePackage.initializePackageContents();
		theUopPackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theDatamodelPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theLogicalPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraceabilityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraceabilityPackage.eNS_URI, theTraceabilityPackage);
		return theTraceabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraceabilityModel() {
		return traceabilityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTraceabilityModel_Element() {
		return (EReference)traceabilityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTraceabilityModel_Tm() {
		return (EReference)traceabilityModelEClass.getEStructuralFeatures().get(1);
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
	public EClass getTraceableElement() {
		return traceableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTraceableElement_TraceabilityPoint() {
		return (EReference)traceableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraceabilityPoint() {
		return traceabilityPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraceabilityPoint_Rationale() {
		return (EAttribute)traceabilityPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraceabilityPoint_Reference() {
		return (EAttribute)traceabilityPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUoPTraceabilitySet() {
		return uoPTraceabilitySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPTraceabilitySet_Uop() {
		return (EReference)uoPTraceabilitySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPTraceabilitySet_AbstractUoP() {
		return (EReference)uoPTraceabilitySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionTraceabilitySet() {
		return connectionTraceabilitySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionTraceabilitySet_Connection() {
		return (EReference)connectionTraceabilitySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionTraceabilitySet_AbstractConnection() {
		return (EReference)connectionTraceabilitySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConceptualEntityTrace() {
		return conceptualEntityTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConceptualEntityTrace_Entity() {
		return (EReference)conceptualEntityTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConceptualViewTrace() {
		return conceptualViewTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConceptualViewTrace_View() {
		return (EReference)conceptualViewTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalEntityTrace() {
		return logicalEntityTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalEntityTrace_Entity() {
		return (EReference)logicalEntityTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalViewTrace() {
		return logicalViewTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalViewTrace_View() {
		return (EReference)logicalViewTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformEntityTrace() {
		return platformEntityTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformEntityTrace_Entity() {
		return (EReference)platformEntityTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformViewTrace() {
		return platformViewTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformViewTrace_View() {
		return (EReference)platformViewTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraceabilityFactory getTraceabilityFactory() {
		return (TraceabilityFactory)getEFactoryInstance();
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
		traceabilityModelEClass = createEClass(TRACEABILITY_MODEL);
		createEReference(traceabilityModelEClass, TRACEABILITY_MODEL__ELEMENT);
		createEReference(traceabilityModelEClass, TRACEABILITY_MODEL__TM);

		elementEClass = createEClass(ELEMENT);

		traceableElementEClass = createEClass(TRACEABLE_ELEMENT);
		createEReference(traceableElementEClass, TRACEABLE_ELEMENT__TRACEABILITY_POINT);

		traceabilityPointEClass = createEClass(TRACEABILITY_POINT);
		createEAttribute(traceabilityPointEClass, TRACEABILITY_POINT__RATIONALE);
		createEAttribute(traceabilityPointEClass, TRACEABILITY_POINT__REFERENCE);

		uoPTraceabilitySetEClass = createEClass(UO_PTRACEABILITY_SET);
		createEReference(uoPTraceabilitySetEClass, UO_PTRACEABILITY_SET__UOP);
		createEReference(uoPTraceabilitySetEClass, UO_PTRACEABILITY_SET__ABSTRACT_UO_P);

		connectionTraceabilitySetEClass = createEClass(CONNECTION_TRACEABILITY_SET);
		createEReference(connectionTraceabilitySetEClass, CONNECTION_TRACEABILITY_SET__CONNECTION);
		createEReference(connectionTraceabilitySetEClass, CONNECTION_TRACEABILITY_SET__ABSTRACT_CONNECTION);

		conceptualEntityTraceEClass = createEClass(CONCEPTUAL_ENTITY_TRACE);
		createEReference(conceptualEntityTraceEClass, CONCEPTUAL_ENTITY_TRACE__ENTITY);

		conceptualViewTraceEClass = createEClass(CONCEPTUAL_VIEW_TRACE);
		createEReference(conceptualViewTraceEClass, CONCEPTUAL_VIEW_TRACE__VIEW);

		logicalEntityTraceEClass = createEClass(LOGICAL_ENTITY_TRACE);
		createEReference(logicalEntityTraceEClass, LOGICAL_ENTITY_TRACE__ENTITY);

		logicalViewTraceEClass = createEClass(LOGICAL_VIEW_TRACE);
		createEReference(logicalViewTraceEClass, LOGICAL_VIEW_TRACE__VIEW);

		platformEntityTraceEClass = createEClass(PLATFORM_ENTITY_TRACE);
		createEReference(platformEntityTraceEClass, PLATFORM_ENTITY_TRACE__ENTITY);

		platformViewTraceEClass = createEClass(PLATFORM_VIEW_TRACE);
		createEReference(platformViewTraceEClass, PLATFORM_VIEW_TRACE__VIEW);
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
		ConceptualPackage theConceptualPackage = (ConceptualPackage)EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI);
		LogicalPackage theLogicalPackage = (LogicalPackage)EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		PlatformPackage thePlatformPackage = (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		traceabilityModelEClass.getESuperTypes().add(theFacePackage.getElement());
		elementEClass.getESuperTypes().add(theFacePackage.getElement());
		uoPTraceabilitySetEClass.getESuperTypes().add(this.getElement());
		uoPTraceabilitySetEClass.getESuperTypes().add(this.getTraceableElement());
		connectionTraceabilitySetEClass.getESuperTypes().add(this.getElement());
		connectionTraceabilitySetEClass.getESuperTypes().add(this.getTraceableElement());
		conceptualEntityTraceEClass.getESuperTypes().add(this.getElement());
		conceptualEntityTraceEClass.getESuperTypes().add(this.getTraceableElement());
		conceptualViewTraceEClass.getESuperTypes().add(this.getElement());
		conceptualViewTraceEClass.getESuperTypes().add(this.getTraceableElement());
		logicalEntityTraceEClass.getESuperTypes().add(this.getElement());
		logicalEntityTraceEClass.getESuperTypes().add(this.getTraceableElement());
		logicalViewTraceEClass.getESuperTypes().add(this.getElement());
		logicalViewTraceEClass.getESuperTypes().add(this.getTraceableElement());
		platformEntityTraceEClass.getESuperTypes().add(this.getElement());
		platformEntityTraceEClass.getESuperTypes().add(this.getTraceableElement());
		platformViewTraceEClass.getESuperTypes().add(this.getElement());
		platformViewTraceEClass.getESuperTypes().add(this.getTraceableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(traceabilityModelEClass, TraceabilityModel.class, "TraceabilityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceabilityModel_Element(), this.getElement(), null, "element", null, 0, -1, TraceabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTraceabilityModel_Tm(), this.getTraceabilityModel(), null, "tm", null, 0, -1, TraceabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traceableElementEClass, TraceableElement.class, "TraceableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceableElement_TraceabilityPoint(), this.getTraceabilityPoint(), null, "traceabilityPoint", null, 0, -1, TraceableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(traceabilityPointEClass, TraceabilityPoint.class, "TraceabilityPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceabilityPoint_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, TraceabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceabilityPoint_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, TraceabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uoPTraceabilitySetEClass, UoPTraceabilitySet.class, "UoPTraceabilitySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUoPTraceabilitySet_Uop(), theUopPackage.getUnitOfPortability(), null, "uop", null, 0, -1, UoPTraceabilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUoPTraceabilitySet_AbstractUoP(), theUopPackage.getAbstractUoP(), null, "abstractUoP", null, 0, -1, UoPTraceabilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(connectionTraceabilitySetEClass, ConnectionTraceabilitySet.class, "ConnectionTraceabilitySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionTraceabilitySet_Connection(), theUopPackage.getConnection(), null, "connection", null, 0, -1, ConnectionTraceabilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectionTraceabilitySet_AbstractConnection(), theUopPackage.getAbstractConnection(), null, "abstractConnection", null, 0, -1, ConnectionTraceabilitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conceptualEntityTraceEClass, ConceptualEntityTrace.class, "ConceptualEntityTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualEntityTrace_Entity(), theConceptualPackage.getEntity(), null, "entity", null, 1, 1, ConceptualEntityTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptualViewTraceEClass, ConceptualViewTrace.class, "ConceptualViewTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualViewTrace_View(), theConceptualPackage.getView(), null, "view", null, 1, 1, ConceptualViewTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalEntityTraceEClass, LogicalEntityTrace.class, "LogicalEntityTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalEntityTrace_Entity(), theLogicalPackage.getEntity(), null, "entity", null, 1, 1, LogicalEntityTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalViewTraceEClass, LogicalViewTrace.class, "LogicalViewTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalViewTrace_View(), theLogicalPackage.getView(), null, "view", null, 1, 1, LogicalViewTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEntityTraceEClass, PlatformEntityTrace.class, "PlatformEntityTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformEntityTrace_Entity(), thePlatformPackage.getEntity(), null, "entity", null, 1, 1, PlatformEntityTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformViewTraceEClass, PlatformViewTrace.class, "PlatformViewTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformViewTrace_View(), thePlatformPackage.getView(), null, "view", null, 1, 1, PlatformViewTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TraceabilityPackageImpl
