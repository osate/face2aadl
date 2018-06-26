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
package face.uop.util;

import face.traceability.TraceableElement;

import face.uop.AbstractConnection;
import face.uop.AbstractUoP;
import face.uop.ClientServerConnection;
import face.uop.ComponentFramework;
import face.uop.Connection;
import face.uop.Element;
import face.uop.LanguageRunTime;
import face.uop.LifeCycleManagementPort;
import face.uop.PlatformSpecificComponent;
import face.uop.PortableComponent;
import face.uop.PubSubConnection;
import face.uop.QueuingConnection;
import face.uop.RAMMemoryRequirements;
import face.uop.SingleInstanceMessageConnection;
import face.uop.SupportingComponent;
import face.uop.UnitOfPortability;
import face.uop.UoPModel;
import face.uop.UopPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see face.uop.UopPackage
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
			public Adapter caseThread(face.uop.Thread object) {
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
			public Adapter caseFace_Element(face.Element object) {
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
	 * Creates a new adapter for an object of class '{@link face.uop.UoPModel <em>Uo PModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.UoPModel
	 * @generated
	 */
	public Adapter createUoPModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.SupportingComponent <em>Supporting Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.SupportingComponent
	 * @generated
	 */
	public Adapter createSupportingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.LanguageRunTime <em>Language Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.LanguageRunTime
	 * @generated
	 */
	public Adapter createLanguageRunTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.ComponentFramework <em>Component Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.ComponentFramework
	 * @generated
	 */
	public Adapter createComponentFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.AbstractUoP <em>Abstract Uo P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.AbstractUoP
	 * @generated
	 */
	public Adapter createAbstractUoPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.AbstractConnection <em>Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.AbstractConnection
	 * @generated
	 */
	public Adapter createAbstractConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.UnitOfPortability <em>Unit Of Portability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.UnitOfPortability
	 * @generated
	 */
	public Adapter createUnitOfPortabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.PortableComponent <em>Portable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.PortableComponent
	 * @generated
	 */
	public Adapter createPortableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.PlatformSpecificComponent <em>Platform Specific Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.PlatformSpecificComponent
	 * @generated
	 */
	public Adapter createPlatformSpecificComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.RAMMemoryRequirements <em>RAM Memory Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.RAMMemoryRequirements
	 * @generated
	 */
	public Adapter createRAMMemoryRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.ClientServerConnection <em>Client Server Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.ClientServerConnection
	 * @generated
	 */
	public Adapter createClientServerConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.PubSubConnection <em>Pub Sub Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.PubSubConnection
	 * @generated
	 */
	public Adapter createPubSubConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.QueuingConnection <em>Queuing Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.QueuingConnection
	 * @generated
	 */
	public Adapter createQueuingConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.SingleInstanceMessageConnection <em>Single Instance Message Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.SingleInstanceMessageConnection
	 * @generated
	 */
	public Adapter createSingleInstanceMessageConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.uop.LifeCycleManagementPort <em>Life Cycle Management Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.uop.LifeCycleManagementPort
	 * @generated
	 */
	public Adapter createLifeCycleManagementPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.Element
	 * @generated
	 */
	public Adapter createFace_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.traceability.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.traceability.TraceableElement
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
