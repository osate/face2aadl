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
package org.osate.face31.uop.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.face31.traceability.TraceableElement;

import org.osate.face31.uop.AbstractConnection;
import org.osate.face31.uop.AbstractUoP;
import org.osate.face31.uop.ClientServerConnection;
import org.osate.face31.uop.ComponentFramework;
import org.osate.face31.uop.CompositeTemplate;
import org.osate.face31.uop.Connection;
import org.osate.face31.uop.Element;
import org.osate.face31.uop.LanguageRunTime;
import org.osate.face31.uop.LifeCycleManagementPort;
import org.osate.face31.uop.MessageType;
import org.osate.face31.uop.PlatformSpecificComponent;
import org.osate.face31.uop.PortableComponent;
import org.osate.face31.uop.PubSubConnection;
import org.osate.face31.uop.QueuingConnection;
import org.osate.face31.uop.RAMMemoryRequirements;
import org.osate.face31.uop.SingleInstanceMessageConnection;
import org.osate.face31.uop.SupportingComponent;
import org.osate.face31.uop.Template;
import org.osate.face31.uop.TemplateComposition;
import org.osate.face31.uop.UnitOfPortability;
import org.osate.face31.uop.UoPModel;
import org.osate.face31.uop.UopPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.face31.uop.UopPackage
 * @generated
 */
public class UopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UopPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UopSwitch<Adapter> modelSwitch =
		new UopSwitch<Adapter>() {
			@Override
			public Adapter caseUoPModel(UoPModel object) {
				return createUoPModelAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseSupportingComponent(SupportingComponent object) {
				return createSupportingComponentAdapter();
			}
			@Override
			public Adapter caseLanguageRunTime(LanguageRunTime object) {
				return createLanguageRunTimeAdapter();
			}
			@Override
			public Adapter caseComponentFramework(ComponentFramework object) {
				return createComponentFrameworkAdapter();
			}
			@Override
			public Adapter caseAbstractUoP(AbstractUoP object) {
				return createAbstractUoPAdapter();
			}
			@Override
			public Adapter caseAbstractConnection(AbstractConnection object) {
				return createAbstractConnectionAdapter();
			}
			@Override
			public Adapter caseUnitOfPortability(UnitOfPortability object) {
				return createUnitOfPortabilityAdapter();
			}
			@Override
			public Adapter casePortableComponent(PortableComponent object) {
				return createPortableComponentAdapter();
			}
			@Override
			public Adapter casePlatformSpecificComponent(PlatformSpecificComponent object) {
				return createPlatformSpecificComponentAdapter();
			}
			@Override
			public Adapter caseThread(org.osate.face31.uop.Thread object) {
				return createThreadAdapter();
			}
			@Override
			public Adapter caseRAMMemoryRequirements(RAMMemoryRequirements object) {
				return createRAMMemoryRequirementsAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseClientServerConnection(ClientServerConnection object) {
				return createClientServerConnectionAdapter();
			}
			@Override
			public Adapter casePubSubConnection(PubSubConnection object) {
				return createPubSubConnectionAdapter();
			}
			@Override
			public Adapter caseQueuingConnection(QueuingConnection object) {
				return createQueuingConnectionAdapter();
			}
			@Override
			public Adapter caseSingleInstanceMessageConnection(SingleInstanceMessageConnection object) {
				return createSingleInstanceMessageConnectionAdapter();
			}
			@Override
			public Adapter caseLifeCycleManagementPort(LifeCycleManagementPort object) {
				return createLifeCycleManagementPortAdapter();
			}
			@Override
			public Adapter caseMessageType(MessageType object) {
				return createMessageTypeAdapter();
			}
			@Override
			public Adapter caseCompositeTemplate(CompositeTemplate object) {
				return createCompositeTemplateAdapter();
			}
			@Override
			public Adapter caseTemplateComposition(TemplateComposition object) {
				return createTemplateCompositionAdapter();
			}
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseFace_Element(org.osate.face31.Element object) {
				return createFace_ElementAdapter();
			}
			@Override
			public Adapter caseTraceableElement(TraceableElement object) {
				return createTraceableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.UoPModel <em>Uo PModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.UoPModel
	 * @generated
	 */
	public Adapter createUoPModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.SupportingComponent <em>Supporting Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.SupportingComponent
	 * @generated
	 */
	public Adapter createSupportingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.LanguageRunTime <em>Language Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.LanguageRunTime
	 * @generated
	 */
	public Adapter createLanguageRunTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.ComponentFramework <em>Component Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.ComponentFramework
	 * @generated
	 */
	public Adapter createComponentFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.AbstractUoP <em>Abstract Uo P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.AbstractUoP
	 * @generated
	 */
	public Adapter createAbstractUoPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.AbstractConnection <em>Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.AbstractConnection
	 * @generated
	 */
	public Adapter createAbstractConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.UnitOfPortability <em>Unit Of Portability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.UnitOfPortability
	 * @generated
	 */
	public Adapter createUnitOfPortabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.PortableComponent <em>Portable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.PortableComponent
	 * @generated
	 */
	public Adapter createPortableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.PlatformSpecificComponent <em>Platform Specific Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.PlatformSpecificComponent
	 * @generated
	 */
	public Adapter createPlatformSpecificComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.RAMMemoryRequirements <em>RAM Memory Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.RAMMemoryRequirements
	 * @generated
	 */
	public Adapter createRAMMemoryRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.ClientServerConnection <em>Client Server Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.ClientServerConnection
	 * @generated
	 */
	public Adapter createClientServerConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.PubSubConnection <em>Pub Sub Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.PubSubConnection
	 * @generated
	 */
	public Adapter createPubSubConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.QueuingConnection <em>Queuing Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.QueuingConnection
	 * @generated
	 */
	public Adapter createQueuingConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.SingleInstanceMessageConnection <em>Single Instance Message Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.SingleInstanceMessageConnection
	 * @generated
	 */
	public Adapter createSingleInstanceMessageConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.LifeCycleManagementPort <em>Life Cycle Management Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.LifeCycleManagementPort
	 * @generated
	 */
	public Adapter createLifeCycleManagementPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.CompositeTemplate <em>Composite Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.CompositeTemplate
	 * @generated
	 */
	public Adapter createCompositeTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.TemplateComposition <em>Template Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.TemplateComposition
	 * @generated
	 */
	public Adapter createTemplateCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.uop.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.uop.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.Element
	 * @generated
	 */
	public Adapter createFace_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UopAdapterFactory
