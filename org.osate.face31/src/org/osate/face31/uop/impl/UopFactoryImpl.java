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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.face31.uop.AbstractConnection;
import org.osate.face31.uop.AbstractUoP;
import org.osate.face31.uop.ClientServerConnection;
import org.osate.face31.uop.ClientServerRole;
import org.osate.face31.uop.ComponentFramework;
import org.osate.face31.uop.CompositeTemplate;
import org.osate.face31.uop.DesignAssuranceLevel;
import org.osate.face31.uop.DesignAssuranceStandard;
import org.osate.face31.uop.FaceProfile;
import org.osate.face31.uop.LanguageRunTime;
import org.osate.face31.uop.LifeCycleManagementPort;
import org.osate.face31.uop.MessageExchangeType;
import org.osate.face31.uop.PartitionType;
import org.osate.face31.uop.PlatformSpecificComponent;
import org.osate.face31.uop.PortableComponent;
import org.osate.face31.uop.ProgrammingLanguage;
import org.osate.face31.uop.QueuingConnection;
import org.osate.face31.uop.RAMMemoryRequirements;
import org.osate.face31.uop.SingleInstanceMessageConnection;
import org.osate.face31.uop.SynchronizationStyle;
import org.osate.face31.uop.Template;
import org.osate.face31.uop.TemplateComposition;
import org.osate.face31.uop.ThreadType;
import org.osate.face31.uop.UoPModel;
import org.osate.face31.uop.UopFactory;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UopFactoryImpl extends EFactoryImpl implements UopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UopFactory init() {
		try {
			UopFactory theUopFactory = (UopFactory)EPackage.Registry.INSTANCE.getEFactory(UopPackage.eNS_URI);
			if (theUopFactory != null) {
				return theUopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UopFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UopPackage.UO_PMODEL: return createUoPModel();
			case UopPackage.LANGUAGE_RUN_TIME: return createLanguageRunTime();
			case UopPackage.COMPONENT_FRAMEWORK: return createComponentFramework();
			case UopPackage.ABSTRACT_UO_P: return createAbstractUoP();
			case UopPackage.ABSTRACT_CONNECTION: return createAbstractConnection();
			case UopPackage.PORTABLE_COMPONENT: return createPortableComponent();
			case UopPackage.PLATFORM_SPECIFIC_COMPONENT: return createPlatformSpecificComponent();
			case UopPackage.THREAD: return createThread();
			case UopPackage.RAM_MEMORY_REQUIREMENTS: return createRAMMemoryRequirements();
			case UopPackage.CLIENT_SERVER_CONNECTION: return createClientServerConnection();
			case UopPackage.QUEUING_CONNECTION: return createQueuingConnection();
			case UopPackage.SINGLE_INSTANCE_MESSAGE_CONNECTION: return createSingleInstanceMessageConnection();
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT: return createLifeCycleManagementPort();
			case UopPackage.COMPOSITE_TEMPLATE: return createCompositeTemplate();
			case UopPackage.TEMPLATE_COMPOSITION: return createTemplateComposition();
			case UopPackage.TEMPLATE: return createTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UopPackage.CLIENT_SERVER_ROLE:
				return createClientServerRoleFromString(eDataType, initialValue);
			case UopPackage.FACE_PROFILE:
				return createFaceProfileFromString(eDataType, initialValue);
			case UopPackage.DESIGN_ASSURANCE_LEVEL:
				return createDesignAssuranceLevelFromString(eDataType, initialValue);
			case UopPackage.DESIGN_ASSURANCE_STANDARD:
				return createDesignAssuranceStandardFromString(eDataType, initialValue);
			case UopPackage.MESSAGE_EXCHANGE_TYPE:
				return createMessageExchangeTypeFromString(eDataType, initialValue);
			case UopPackage.PARTITION_TYPE:
				return createPartitionTypeFromString(eDataType, initialValue);
			case UopPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case UopPackage.SYNCHRONIZATION_STYLE:
				return createSynchronizationStyleFromString(eDataType, initialValue);
			case UopPackage.THREAD_TYPE:
				return createThreadTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UopPackage.CLIENT_SERVER_ROLE:
				return convertClientServerRoleToString(eDataType, instanceValue);
			case UopPackage.FACE_PROFILE:
				return convertFaceProfileToString(eDataType, instanceValue);
			case UopPackage.DESIGN_ASSURANCE_LEVEL:
				return convertDesignAssuranceLevelToString(eDataType, instanceValue);
			case UopPackage.DESIGN_ASSURANCE_STANDARD:
				return convertDesignAssuranceStandardToString(eDataType, instanceValue);
			case UopPackage.MESSAGE_EXCHANGE_TYPE:
				return convertMessageExchangeTypeToString(eDataType, instanceValue);
			case UopPackage.PARTITION_TYPE:
				return convertPartitionTypeToString(eDataType, instanceValue);
			case UopPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case UopPackage.SYNCHRONIZATION_STYLE:
				return convertSynchronizationStyleToString(eDataType, instanceValue);
			case UopPackage.THREAD_TYPE:
				return convertThreadTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UoPModel createUoPModel() {
		UoPModelImpl uoPModel = new UoPModelImpl();
		return uoPModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageRunTime createLanguageRunTime() {
		LanguageRunTimeImpl languageRunTime = new LanguageRunTimeImpl();
		return languageRunTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFramework createComponentFramework() {
		ComponentFrameworkImpl componentFramework = new ComponentFrameworkImpl();
		return componentFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractUoP createAbstractUoP() {
		AbstractUoPImpl abstractUoP = new AbstractUoPImpl();
		return abstractUoP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractConnection createAbstractConnection() {
		AbstractConnectionImpl abstractConnection = new AbstractConnectionImpl();
		return abstractConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortableComponent createPortableComponent() {
		PortableComponentImpl portableComponent = new PortableComponentImpl();
		return portableComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformSpecificComponent createPlatformSpecificComponent() {
		PlatformSpecificComponentImpl platformSpecificComponent = new PlatformSpecificComponentImpl();
		return platformSpecificComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.face31.uop.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMMemoryRequirements createRAMMemoryRequirements() {
		RAMMemoryRequirementsImpl ramMemoryRequirements = new RAMMemoryRequirementsImpl();
		return ramMemoryRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClientServerConnection createClientServerConnection() {
		ClientServerConnectionImpl clientServerConnection = new ClientServerConnectionImpl();
		return clientServerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueuingConnection createQueuingConnection() {
		QueuingConnectionImpl queuingConnection = new QueuingConnectionImpl();
		return queuingConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleInstanceMessageConnection createSingleInstanceMessageConnection() {
		SingleInstanceMessageConnectionImpl singleInstanceMessageConnection = new SingleInstanceMessageConnectionImpl();
		return singleInstanceMessageConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifeCycleManagementPort createLifeCycleManagementPort() {
		LifeCycleManagementPortImpl lifeCycleManagementPort = new LifeCycleManagementPortImpl();
		return lifeCycleManagementPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeTemplate createCompositeTemplate() {
		CompositeTemplateImpl compositeTemplate = new CompositeTemplateImpl();
		return compositeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateComposition createTemplateComposition() {
		TemplateCompositionImpl templateComposition = new TemplateCompositionImpl();
		return templateComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerRole createClientServerRoleFromString(EDataType eDataType, String initialValue) {
		ClientServerRole result = ClientServerRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientServerRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaceProfile createFaceProfileFromString(EDataType eDataType, String initialValue) {
		FaceProfile result = FaceProfile.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaceProfileToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAssuranceLevel createDesignAssuranceLevelFromString(EDataType eDataType, String initialValue) {
		DesignAssuranceLevel result = DesignAssuranceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignAssuranceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAssuranceStandard createDesignAssuranceStandardFromString(EDataType eDataType, String initialValue) {
		DesignAssuranceStandard result = DesignAssuranceStandard.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignAssuranceStandardToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchangeType createMessageExchangeTypeFromString(EDataType eDataType, String initialValue) {
		MessageExchangeType result = MessageExchangeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageExchangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionType createPartitionTypeFromString(EDataType eDataType, String initialValue) {
		PartitionType result = PartitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageFromString(EDataType eDataType, String initialValue) {
		ProgrammingLanguage result = ProgrammingLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationStyle createSynchronizationStyleFromString(EDataType eDataType, String initialValue) {
		SynchronizationStyle result = SynchronizationStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronizationStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadType createThreadTypeFromString(EDataType eDataType, String initialValue) {
		ThreadType result = ThreadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UopPackage getUopPackage() {
		return (UopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UopPackage getPackage() {
		return UopPackage.eINSTANCE;
	}

} //UopFactoryImpl
