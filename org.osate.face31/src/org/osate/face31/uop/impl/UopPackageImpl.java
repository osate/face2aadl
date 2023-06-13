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
package org.osate.face31.uop.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.osate.face31.traceability.TraceabilityPackage;

import org.osate.face31.traceability.impl.TraceabilityPackageImpl;

import org.osate.face31.uop.AbstractConnection;
import org.osate.face31.uop.AbstractUoP;
import org.osate.face31.uop.ClientServerConnection;
import org.osate.face31.uop.ClientServerRole;
import org.osate.face31.uop.ComponentFramework;
import org.osate.face31.uop.CompositeTemplate;
import org.osate.face31.uop.Connection;
import org.osate.face31.uop.DesignAssuranceLevel;
import org.osate.face31.uop.DesignAssuranceStandard;
import org.osate.face31.uop.Element;
import org.osate.face31.uop.FaceProfile;
import org.osate.face31.uop.LanguageRunTime;
import org.osate.face31.uop.LifeCycleManagementPort;
import org.osate.face31.uop.MessageExchangeType;
import org.osate.face31.uop.MessageType;
import org.osate.face31.uop.PartitionType;
import org.osate.face31.uop.PlatformSpecificComponent;
import org.osate.face31.uop.PortableComponent;
import org.osate.face31.uop.ProgrammingLanguage;
import org.osate.face31.uop.PubSubConnection;
import org.osate.face31.uop.QueuingConnection;
import org.osate.face31.uop.RAMMemoryRequirements;
import org.osate.face31.uop.SingleInstanceMessageConnection;
import org.osate.face31.uop.SupportingComponent;
import org.osate.face31.uop.SynchronizationStyle;
import org.osate.face31.uop.Template;
import org.osate.face31.uop.TemplateComposition;
import org.osate.face31.uop.ThreadType;
import org.osate.face31.uop.UnitOfPortability;
import org.osate.face31.uop.UoPModel;
import org.osate.face31.uop.UopFactory;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UopPackageImpl extends EPackageImpl implements UopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoPModelEClass = null;

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
	private EClass supportingComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageRunTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractUoPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitOfPortabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portableComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformSpecificComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramMemoryRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientServerConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pubSubConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queuingConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleInstanceMessageConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCycleManagementPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientServerRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum faceProfileEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designAssuranceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designAssuranceStandardEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageExchangeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partitionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programmingLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronizationStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threadTypeEEnum = null;

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
	 * @see org.osate.face31.uop.UopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UopPackageImpl() {
		super(eNS_URI, UopFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UopPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UopPackage init() {
		if (isInited) return (UopPackage)EPackage.Registry.INSTANCE.getEPackage(UopPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUopPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UopPackageImpl theUopPackage = registeredUopPackage instanceof UopPackageImpl ? (UopPackageImpl)registeredUopPackage : new UopPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FacePackage.eNS_URI);
		FacePackageImpl theFacePackage = (FacePackageImpl)(registeredPackage instanceof FacePackageImpl ? registeredPackage : FacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(registeredPackage instanceof IntegrationPackageImpl ? registeredPackage : IntegrationPackage.eINSTANCE);
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
		theUopPackage.createPackageContents();
		theFacePackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theDatamodelPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theLogicalPackage.createPackageContents();
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theUopPackage.initializePackageContents();
		theFacePackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theDatamodelPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theLogicalPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUopPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UopPackage.eNS_URI, theUopPackage);
		return theUopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUoPModel() {
		return uoPModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPModel_Element() {
		return (EReference)uoPModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUoPModel_Um() {
		return (EReference)uoPModelEClass.getEStructuralFeatures().get(1);
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
	public EClass getSupportingComponent() {
		return supportingComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportingComponent_Version() {
		return (EAttribute)supportingComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageRunTime() {
		return languageRunTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentFramework() {
		return componentFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractUoP() {
		return abstractUoPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractUoP_Connection() {
		return (EReference)abstractUoPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractConnection() {
		return abstractConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractConnection_ConceptualView() {
		return (EReference)abstractConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractConnection_LogicalView() {
		return (EReference)abstractConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitOfPortability() {
		return unitOfPortabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitOfPortability_SupportingComponent() {
		return (EReference)unitOfPortabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitOfPortability_Thread() {
		return (EReference)unitOfPortabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitOfPortability_MemoryRequirements() {
		return (EReference)unitOfPortabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitOfPortability_Realizes() {
		return (EReference)unitOfPortabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitOfPortability_Connection() {
		return (EReference)unitOfPortabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfPortability_TransportAPILanguage() {
		return (EAttribute)unitOfPortabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfPortability_DesignAssuranceLevel() {
		return (EAttribute)unitOfPortabilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfPortability_PartitionType() {
		return (EAttribute)unitOfPortabilityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfPortability_DesignAssuranceStandard() {
		return (EAttribute)unitOfPortabilityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitOfPortability_FaceProfile() {
		return (EAttribute)unitOfPortabilityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitOfPortability_LcmPort() {
		return (EReference)unitOfPortabilityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortableComponent() {
		return portableComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformSpecificComponent() {
		return platformSpecificComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThread_Period() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThread_TimeCapacity() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThread_RelativePriority() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThread_RelativeCoreAffinity() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThread_ThreadType() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRAMMemoryRequirements() {
		return ramMemoryRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRAMMemoryRequirements_HeapStackMin() {
		return (EAttribute)ramMemoryRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRAMMemoryRequirements_HeapStackMax() {
		return (EAttribute)ramMemoryRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRAMMemoryRequirements_HeapStackTypical() {
		return (EAttribute)ramMemoryRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRAMMemoryRequirements_TextMax() {
		return (EAttribute)ramMemoryRequirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRAMMemoryRequirements_RoDataMax() {
		return (EAttribute)ramMemoryRequirementsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRAMMemoryRequirements_DataMax() {
		return (EAttribute)ramMemoryRequirementsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRAMMemoryRequirements_BssMax() {
		return (EAttribute)ramMemoryRequirementsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Realizes() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Period() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_SynchronizationStyle() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClientServerConnection() {
		return clientServerConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClientServerConnection_RequestType() {
		return (EReference)clientServerConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClientServerConnection_ResponseType() {
		return (EReference)clientServerConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClientServerConnection_Role() {
		return (EAttribute)clientServerConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPubSubConnection() {
		return pubSubConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubSubConnection_MessageType() {
		return (EReference)pubSubConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPubSubConnection_MessageExchangeType() {
		return (EAttribute)pubSubConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueuingConnection() {
		return queuingConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueuingConnection_Depth() {
		return (EAttribute)queuingConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleInstanceMessageConnection() {
		return singleInstanceMessageConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifeCycleManagementPort() {
		return lifeCycleManagementPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifeCycleManagementPort_MessageExchangeType() {
		return (EAttribute)lifeCycleManagementPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLifeCycleManagementPort_LcmMessageType() {
		return (EReference)lifeCycleManagementPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeTemplate() {
		return compositeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeTemplate_Composition() {
		return (EReference)compositeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeTemplate_Realizes() {
		return (EReference)compositeTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeTemplate_IsUnion() {
		return (EAttribute)compositeTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateComposition() {
		return templateCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemplateComposition_Rolename() {
		return (EAttribute)templateCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateComposition_Realizes() {
		return (EReference)templateCompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateComposition_Type() {
		return (EReference)templateCompositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemplate_Specification() {
		return (EAttribute)templateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplate_BoundQuery() {
		return (EReference)templateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplate_EffectiveQuery() {
		return (EReference)templateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClientServerRole() {
		return clientServerRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFaceProfile() {
		return faceProfileEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDesignAssuranceLevel() {
		return designAssuranceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDesignAssuranceStandard() {
		return designAssuranceStandardEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageExchangeType() {
		return messageExchangeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPartitionType() {
		return partitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProgrammingLanguage() {
		return programmingLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSynchronizationStyle() {
		return synchronizationStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getThreadType() {
		return threadTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UopFactory getUopFactory() {
		return (UopFactory)getEFactoryInstance();
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
		uoPModelEClass = createEClass(UO_PMODEL);
		createEReference(uoPModelEClass, UO_PMODEL__ELEMENT);
		createEReference(uoPModelEClass, UO_PMODEL__UM);

		elementEClass = createEClass(ELEMENT);

		supportingComponentEClass = createEClass(SUPPORTING_COMPONENT);
		createEAttribute(supportingComponentEClass, SUPPORTING_COMPONENT__VERSION);

		languageRunTimeEClass = createEClass(LANGUAGE_RUN_TIME);

		componentFrameworkEClass = createEClass(COMPONENT_FRAMEWORK);

		abstractUoPEClass = createEClass(ABSTRACT_UO_P);
		createEReference(abstractUoPEClass, ABSTRACT_UO_P__CONNECTION);

		abstractConnectionEClass = createEClass(ABSTRACT_CONNECTION);
		createEReference(abstractConnectionEClass, ABSTRACT_CONNECTION__CONCEPTUAL_VIEW);
		createEReference(abstractConnectionEClass, ABSTRACT_CONNECTION__LOGICAL_VIEW);

		unitOfPortabilityEClass = createEClass(UNIT_OF_PORTABILITY);
		createEReference(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT);
		createEReference(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__THREAD);
		createEReference(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS);
		createEReference(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__REALIZES);
		createEReference(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__CONNECTION);
		createEAttribute(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE);
		createEAttribute(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL);
		createEAttribute(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__PARTITION_TYPE);
		createEAttribute(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD);
		createEAttribute(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__FACE_PROFILE);
		createEReference(unitOfPortabilityEClass, UNIT_OF_PORTABILITY__LCM_PORT);

		portableComponentEClass = createEClass(PORTABLE_COMPONENT);

		platformSpecificComponentEClass = createEClass(PLATFORM_SPECIFIC_COMPONENT);

		threadEClass = createEClass(THREAD);
		createEAttribute(threadEClass, THREAD__PERIOD);
		createEAttribute(threadEClass, THREAD__TIME_CAPACITY);
		createEAttribute(threadEClass, THREAD__RELATIVE_PRIORITY);
		createEAttribute(threadEClass, THREAD__RELATIVE_CORE_AFFINITY);
		createEAttribute(threadEClass, THREAD__THREAD_TYPE);

		ramMemoryRequirementsEClass = createEClass(RAM_MEMORY_REQUIREMENTS);
		createEAttribute(ramMemoryRequirementsEClass, RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MIN);
		createEAttribute(ramMemoryRequirementsEClass, RAM_MEMORY_REQUIREMENTS__HEAP_STACK_MAX);
		createEAttribute(ramMemoryRequirementsEClass, RAM_MEMORY_REQUIREMENTS__HEAP_STACK_TYPICAL);
		createEAttribute(ramMemoryRequirementsEClass, RAM_MEMORY_REQUIREMENTS__TEXT_MAX);
		createEAttribute(ramMemoryRequirementsEClass, RAM_MEMORY_REQUIREMENTS__RO_DATA_MAX);
		createEAttribute(ramMemoryRequirementsEClass, RAM_MEMORY_REQUIREMENTS__DATA_MAX);
		createEAttribute(ramMemoryRequirementsEClass, RAM_MEMORY_REQUIREMENTS__BSS_MAX);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__REALIZES);
		createEAttribute(connectionEClass, CONNECTION__PERIOD);
		createEAttribute(connectionEClass, CONNECTION__SYNCHRONIZATION_STYLE);

		clientServerConnectionEClass = createEClass(CLIENT_SERVER_CONNECTION);
		createEReference(clientServerConnectionEClass, CLIENT_SERVER_CONNECTION__REQUEST_TYPE);
		createEReference(clientServerConnectionEClass, CLIENT_SERVER_CONNECTION__RESPONSE_TYPE);
		createEAttribute(clientServerConnectionEClass, CLIENT_SERVER_CONNECTION__ROLE);

		pubSubConnectionEClass = createEClass(PUB_SUB_CONNECTION);
		createEReference(pubSubConnectionEClass, PUB_SUB_CONNECTION__MESSAGE_TYPE);
		createEAttribute(pubSubConnectionEClass, PUB_SUB_CONNECTION__MESSAGE_EXCHANGE_TYPE);

		queuingConnectionEClass = createEClass(QUEUING_CONNECTION);
		createEAttribute(queuingConnectionEClass, QUEUING_CONNECTION__DEPTH);

		singleInstanceMessageConnectionEClass = createEClass(SINGLE_INSTANCE_MESSAGE_CONNECTION);

		lifeCycleManagementPortEClass = createEClass(LIFE_CYCLE_MANAGEMENT_PORT);
		createEAttribute(lifeCycleManagementPortEClass, LIFE_CYCLE_MANAGEMENT_PORT__MESSAGE_EXCHANGE_TYPE);
		createEReference(lifeCycleManagementPortEClass, LIFE_CYCLE_MANAGEMENT_PORT__LCM_MESSAGE_TYPE);

		messageTypeEClass = createEClass(MESSAGE_TYPE);

		compositeTemplateEClass = createEClass(COMPOSITE_TEMPLATE);
		createEReference(compositeTemplateEClass, COMPOSITE_TEMPLATE__COMPOSITION);
		createEReference(compositeTemplateEClass, COMPOSITE_TEMPLATE__REALIZES);
		createEAttribute(compositeTemplateEClass, COMPOSITE_TEMPLATE__IS_UNION);

		templateCompositionEClass = createEClass(TEMPLATE_COMPOSITION);
		createEAttribute(templateCompositionEClass, TEMPLATE_COMPOSITION__ROLENAME);
		createEReference(templateCompositionEClass, TEMPLATE_COMPOSITION__REALIZES);
		createEReference(templateCompositionEClass, TEMPLATE_COMPOSITION__TYPE);

		templateEClass = createEClass(TEMPLATE);
		createEAttribute(templateEClass, TEMPLATE__SPECIFICATION);
		createEReference(templateEClass, TEMPLATE__BOUND_QUERY);
		createEReference(templateEClass, TEMPLATE__EFFECTIVE_QUERY);

		// Create enums
		clientServerRoleEEnum = createEEnum(CLIENT_SERVER_ROLE);
		faceProfileEEnum = createEEnum(FACE_PROFILE);
		designAssuranceLevelEEnum = createEEnum(DESIGN_ASSURANCE_LEVEL);
		designAssuranceStandardEEnum = createEEnum(DESIGN_ASSURANCE_STANDARD);
		messageExchangeTypeEEnum = createEEnum(MESSAGE_EXCHANGE_TYPE);
		partitionTypeEEnum = createEEnum(PARTITION_TYPE);
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);
		synchronizationStyleEEnum = createEEnum(SYNCHRONIZATION_STYLE);
		threadTypeEEnum = createEEnum(THREAD_TYPE);
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
		TraceabilityPackage theTraceabilityPackage = (TraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI);
		ConceptualPackage theConceptualPackage = (ConceptualPackage)EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI);
		LogicalPackage theLogicalPackage = (LogicalPackage)EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		PlatformPackage thePlatformPackage = (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uoPModelEClass.getESuperTypes().add(theFacePackage.getElement());
		elementEClass.getESuperTypes().add(theFacePackage.getElement());
		supportingComponentEClass.getESuperTypes().add(this.getElement());
		languageRunTimeEClass.getESuperTypes().add(this.getSupportingComponent());
		componentFrameworkEClass.getESuperTypes().add(this.getSupportingComponent());
		abstractUoPEClass.getESuperTypes().add(this.getElement());
		abstractUoPEClass.getESuperTypes().add(theTraceabilityPackage.getTraceableElement());
		abstractConnectionEClass.getESuperTypes().add(theFacePackage.getElement());
		abstractConnectionEClass.getESuperTypes().add(theTraceabilityPackage.getTraceableElement());
		unitOfPortabilityEClass.getESuperTypes().add(this.getElement());
		unitOfPortabilityEClass.getESuperTypes().add(theTraceabilityPackage.getTraceableElement());
		portableComponentEClass.getESuperTypes().add(this.getUnitOfPortability());
		platformSpecificComponentEClass.getESuperTypes().add(this.getUnitOfPortability());
		connectionEClass.getESuperTypes().add(theTraceabilityPackage.getTraceableElement());
		connectionEClass.getESuperTypes().add(theFacePackage.getElement());
		clientServerConnectionEClass.getESuperTypes().add(this.getConnection());
		pubSubConnectionEClass.getESuperTypes().add(this.getConnection());
		queuingConnectionEClass.getESuperTypes().add(this.getPubSubConnection());
		singleInstanceMessageConnectionEClass.getESuperTypes().add(this.getPubSubConnection());
		messageTypeEClass.getESuperTypes().add(this.getElement());
		messageTypeEClass.getESuperTypes().add(theTraceabilityPackage.getTraceableElement());
		compositeTemplateEClass.getESuperTypes().add(this.getElement());
		compositeTemplateEClass.getESuperTypes().add(this.getMessageType());
		templateEClass.getESuperTypes().add(this.getMessageType());

		// Initialize classes, features, and operations; add parameters
		initEClass(uoPModelEClass, UoPModel.class, "UoPModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUoPModel_Element(), this.getElement(), null, "element", null, 0, -1, UoPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUoPModel_Um(), this.getUoPModel(), null, "um", null, 0, -1, UoPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportingComponentEClass, SupportingComponent.class, "SupportingComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportingComponent_Version(), ecorePackage.getEString(), "version", null, 1, 1, SupportingComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageRunTimeEClass, LanguageRunTime.class, "LanguageRunTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentFrameworkEClass, ComponentFramework.class, "ComponentFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractUoPEClass, AbstractUoP.class, "AbstractUoP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractUoP_Connection(), this.getAbstractConnection(), null, "connection", null, 0, -1, AbstractUoP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractConnectionEClass, AbstractConnection.class, "AbstractConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConnection_ConceptualView(), theConceptualPackage.getView(), null, "conceptualView", null, 0, 1, AbstractConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnection_LogicalView(), theLogicalPackage.getView(), null, "logicalView", null, 0, 1, AbstractConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitOfPortabilityEClass, UnitOfPortability.class, "UnitOfPortability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitOfPortability_SupportingComponent(), this.getSupportingComponent(), null, "supportingComponent", null, 0, -1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitOfPortability_Thread(), this.getThread(), null, "thread", null, 1, -1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitOfPortability_MemoryRequirements(), this.getRAMMemoryRequirements(), null, "memoryRequirements", null, 1, 1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitOfPortability_Realizes(), this.getAbstractUoP(), null, "realizes", null, 0, 1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitOfPortability_Connection(), this.getConnection(), null, "connection", null, 1, -1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitOfPortability_TransportAPILanguage(), this.getProgrammingLanguage(), "transportAPILanguage", null, 1, 1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfPortability_DesignAssuranceLevel(), this.getDesignAssuranceLevel(), "designAssuranceLevel", null, 0, 1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfPortability_PartitionType(), this.getPartitionType(), "partitionType", null, 1, 1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfPortability_DesignAssuranceStandard(), this.getDesignAssuranceStandard(), "designAssuranceStandard", null, 0, 1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfPortability_FaceProfile(), this.getFaceProfile(), "faceProfile", null, 1, 1, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitOfPortability_LcmPort(), this.getLifeCycleManagementPort(), null, "lcmPort", null, 0, 2, UnitOfPortability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portableComponentEClass, PortableComponent.class, "PortableComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformSpecificComponentEClass, PlatformSpecificComponent.class, "PlatformSpecificComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadEClass, org.osate.face31.uop.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThread_Period(), ecorePackage.getEFloat(), "period", null, 1, 1, org.osate.face31.uop.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_TimeCapacity(), ecorePackage.getEFloat(), "timeCapacity", null, 1, 1, org.osate.face31.uop.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_RelativePriority(), ecorePackage.getEInt(), "relativePriority", null, 1, 1, org.osate.face31.uop.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_RelativeCoreAffinity(), ecorePackage.getEInt(), "relativeCoreAffinity", null, 1, 1, org.osate.face31.uop.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_ThreadType(), this.getThreadType(), "threadType", null, 1, 1, org.osate.face31.uop.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ramMemoryRequirementsEClass, RAMMemoryRequirements.class, "RAMMemoryRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRAMMemoryRequirements_HeapStackMin(), ecorePackage.getEInt(), "heapStackMin", null, 0, 1, RAMMemoryRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAMMemoryRequirements_HeapStackMax(), ecorePackage.getEInt(), "heapStackMax", null, 0, 1, RAMMemoryRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAMMemoryRequirements_HeapStackTypical(), ecorePackage.getEInt(), "heapStackTypical", null, 0, 1, RAMMemoryRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAMMemoryRequirements_TextMax(), ecorePackage.getEInt(), "textMax", null, 0, 1, RAMMemoryRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAMMemoryRequirements_RoDataMax(), ecorePackage.getEInt(), "roDataMax", null, 0, 1, RAMMemoryRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAMMemoryRequirements_DataMax(), ecorePackage.getEInt(), "dataMax", null, 0, 1, RAMMemoryRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAMMemoryRequirements_BssMax(), ecorePackage.getEInt(), "bssMax", null, 0, 1, RAMMemoryRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Realizes(), this.getAbstractConnection(), null, "realizes", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Period(), ecorePackage.getEFloat(), "period", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_SynchronizationStyle(), this.getSynchronizationStyle(), "synchronizationStyle", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientServerConnectionEClass, ClientServerConnection.class, "ClientServerConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientServerConnection_RequestType(), this.getMessageType(), null, "requestType", null, 1, 1, ClientServerConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClientServerConnection_ResponseType(), this.getMessageType(), null, "responseType", null, 1, 1, ClientServerConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientServerConnection_Role(), this.getClientServerRole(), "role", null, 1, 1, ClientServerConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pubSubConnectionEClass, PubSubConnection.class, "PubSubConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPubSubConnection_MessageType(), this.getMessageType(), null, "messageType", null, 1, 1, PubSubConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPubSubConnection_MessageExchangeType(), this.getMessageExchangeType(), "messageExchangeType", null, 1, 1, PubSubConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queuingConnectionEClass, QueuingConnection.class, "QueuingConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueuingConnection_Depth(), ecorePackage.getEInt(), "depth", null, 1, 1, QueuingConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleInstanceMessageConnectionEClass, SingleInstanceMessageConnection.class, "SingleInstanceMessageConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifeCycleManagementPortEClass, LifeCycleManagementPort.class, "LifeCycleManagementPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLifeCycleManagementPort_MessageExchangeType(), this.getMessageExchangeType(), "messageExchangeType", null, 1, 1, LifeCycleManagementPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifeCycleManagementPort_LcmMessageType(), this.getMessageType(), null, "lcmMessageType", null, 1, 1, LifeCycleManagementPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeTemplateEClass, CompositeTemplate.class, "CompositeTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeTemplate_Composition(), this.getTemplateComposition(), null, "composition", null, 2, -1, CompositeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTemplate_Realizes(), theLogicalPackage.getCompositeQuery(), null, "realizes", null, 0, 1, CompositeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeTemplate_IsUnion(), ecorePackage.getEBoolean(), "isUnion", null, 1, 1, CompositeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateCompositionEClass, TemplateComposition.class, "TemplateComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateComposition_Rolename(), ecorePackage.getEString(), "rolename", "", 1, 1, TemplateComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateComposition_Realizes(), theLogicalPackage.getQueryComposition(), null, "realizes", null, 0, 1, TemplateComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateComposition_Type(), this.getMessageType(), null, "type", null, 1, 1, TemplateComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplate_Specification(), ecorePackage.getEString(), "specification", null, 1, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplate_BoundQuery(), thePlatformPackage.getQuery(), null, "boundQuery", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplate_EffectiveQuery(), thePlatformPackage.getQuery(), null, "effectiveQuery", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(clientServerRoleEEnum, ClientServerRole.class, "ClientServerRole");
		addEEnumLiteral(clientServerRoleEEnum, ClientServerRole.CLIENT);
		addEEnumLiteral(clientServerRoleEEnum, ClientServerRole.SERVER);

		initEEnum(faceProfileEEnum, FaceProfile.class, "FaceProfile");
		addEEnumLiteral(faceProfileEEnum, FaceProfile.GENERAL_PURPOSE);
		addEEnumLiteral(faceProfileEEnum, FaceProfile.SECURITY);
		addEEnumLiteral(faceProfileEEnum, FaceProfile.SAFETY_BASE);
		addEEnumLiteral(faceProfileEEnum, FaceProfile.SAFETY_EXTENDED);

		initEEnum(designAssuranceLevelEEnum, DesignAssuranceLevel.class, "DesignAssuranceLevel");
		addEEnumLiteral(designAssuranceLevelEEnum, DesignAssuranceLevel.A);
		addEEnumLiteral(designAssuranceLevelEEnum, DesignAssuranceLevel.B);
		addEEnumLiteral(designAssuranceLevelEEnum, DesignAssuranceLevel.C);
		addEEnumLiteral(designAssuranceLevelEEnum, DesignAssuranceLevel.D);
		addEEnumLiteral(designAssuranceLevelEEnum, DesignAssuranceLevel.E);

		initEEnum(designAssuranceStandardEEnum, DesignAssuranceStandard.class, "DesignAssuranceStandard");
		addEEnumLiteral(designAssuranceStandardEEnum, DesignAssuranceStandard.DO_178B_ED_12B);
		addEEnumLiteral(designAssuranceStandardEEnum, DesignAssuranceStandard.DO_178C_ED_12C);

		initEEnum(messageExchangeTypeEEnum, MessageExchangeType.class, "MessageExchangeType");
		addEEnumLiteral(messageExchangeTypeEEnum, MessageExchangeType.INBOUND_MESSAGE);
		addEEnumLiteral(messageExchangeTypeEEnum, MessageExchangeType.OUTBOUND_MESSAGE);

		initEEnum(partitionTypeEEnum, PartitionType.class, "PartitionType");
		addEEnumLiteral(partitionTypeEEnum, PartitionType.POSIX);
		addEEnumLiteral(partitionTypeEEnum, PartitionType.ARINC653);

		initEEnum(programmingLanguageEEnum, ProgrammingLanguage.class, "ProgrammingLanguage");
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.CPP);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.JAVA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.ADA);

		initEEnum(synchronizationStyleEEnum, SynchronizationStyle.class, "SynchronizationStyle");
		addEEnumLiteral(synchronizationStyleEEnum, SynchronizationStyle.BLOCKING);
		addEEnumLiteral(synchronizationStyleEEnum, SynchronizationStyle.NON_BLOCKING);

		initEEnum(threadTypeEEnum, ThreadType.class, "ThreadType");
		addEEnumLiteral(threadTypeEEnum, ThreadType.FOREGROUND);
		addEEnumLiteral(threadTypeEEnum, ThreadType.BACKGROUND);
	}

} //UopPackageImpl
