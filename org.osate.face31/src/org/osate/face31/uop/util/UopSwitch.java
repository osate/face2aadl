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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.face31.uop.UopPackage
 * @generated
 */
public class UopSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UopPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UopSwitch() {
		if (modelPackage == null) {
			modelPackage = UopPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UopPackage.UO_PMODEL: {
				UoPModel uoPModel = (UoPModel)theEObject;
				T result = caseUoPModel(uoPModel);
				if (result == null) result = caseFace_Element(uoPModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseFace_Element(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.SUPPORTING_COMPONENT: {
				SupportingComponent supportingComponent = (SupportingComponent)theEObject;
				T result = caseSupportingComponent(supportingComponent);
				if (result == null) result = caseElement(supportingComponent);
				if (result == null) result = caseFace_Element(supportingComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.LANGUAGE_RUN_TIME: {
				LanguageRunTime languageRunTime = (LanguageRunTime)theEObject;
				T result = caseLanguageRunTime(languageRunTime);
				if (result == null) result = caseSupportingComponent(languageRunTime);
				if (result == null) result = caseElement(languageRunTime);
				if (result == null) result = caseFace_Element(languageRunTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.COMPONENT_FRAMEWORK: {
				ComponentFramework componentFramework = (ComponentFramework)theEObject;
				T result = caseComponentFramework(componentFramework);
				if (result == null) result = caseSupportingComponent(componentFramework);
				if (result == null) result = caseElement(componentFramework);
				if (result == null) result = caseFace_Element(componentFramework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.ABSTRACT_UO_P: {
				AbstractUoP abstractUoP = (AbstractUoP)theEObject;
				T result = caseAbstractUoP(abstractUoP);
				if (result == null) result = caseElement(abstractUoP);
				if (result == null) result = caseTraceableElement(abstractUoP);
				if (result == null) result = caseFace_Element(abstractUoP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.ABSTRACT_CONNECTION: {
				AbstractConnection abstractConnection = (AbstractConnection)theEObject;
				T result = caseAbstractConnection(abstractConnection);
				if (result == null) result = caseFace_Element(abstractConnection);
				if (result == null) result = caseTraceableElement(abstractConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.UNIT_OF_PORTABILITY: {
				UnitOfPortability unitOfPortability = (UnitOfPortability)theEObject;
				T result = caseUnitOfPortability(unitOfPortability);
				if (result == null) result = caseElement(unitOfPortability);
				if (result == null) result = caseTraceableElement(unitOfPortability);
				if (result == null) result = caseFace_Element(unitOfPortability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.PORTABLE_COMPONENT: {
				PortableComponent portableComponent = (PortableComponent)theEObject;
				T result = casePortableComponent(portableComponent);
				if (result == null) result = caseUnitOfPortability(portableComponent);
				if (result == null) result = caseElement(portableComponent);
				if (result == null) result = caseTraceableElement(portableComponent);
				if (result == null) result = caseFace_Element(portableComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.PLATFORM_SPECIFIC_COMPONENT: {
				PlatformSpecificComponent platformSpecificComponent = (PlatformSpecificComponent)theEObject;
				T result = casePlatformSpecificComponent(platformSpecificComponent);
				if (result == null) result = caseUnitOfPortability(platformSpecificComponent);
				if (result == null) result = caseElement(platformSpecificComponent);
				if (result == null) result = caseTraceableElement(platformSpecificComponent);
				if (result == null) result = caseFace_Element(platformSpecificComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.THREAD: {
				org.osate.face31.uop.Thread thread = (org.osate.face31.uop.Thread)theEObject;
				T result = caseThread(thread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.RAM_MEMORY_REQUIREMENTS: {
				RAMMemoryRequirements ramMemoryRequirements = (RAMMemoryRequirements)theEObject;
				T result = caseRAMMemoryRequirements(ramMemoryRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseTraceableElement(connection);
				if (result == null) result = caseFace_Element(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.CLIENT_SERVER_CONNECTION: {
				ClientServerConnection clientServerConnection = (ClientServerConnection)theEObject;
				T result = caseClientServerConnection(clientServerConnection);
				if (result == null) result = caseConnection(clientServerConnection);
				if (result == null) result = caseTraceableElement(clientServerConnection);
				if (result == null) result = caseFace_Element(clientServerConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.PUB_SUB_CONNECTION: {
				PubSubConnection pubSubConnection = (PubSubConnection)theEObject;
				T result = casePubSubConnection(pubSubConnection);
				if (result == null) result = caseConnection(pubSubConnection);
				if (result == null) result = caseTraceableElement(pubSubConnection);
				if (result == null) result = caseFace_Element(pubSubConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.QUEUING_CONNECTION: {
				QueuingConnection queuingConnection = (QueuingConnection)theEObject;
				T result = caseQueuingConnection(queuingConnection);
				if (result == null) result = casePubSubConnection(queuingConnection);
				if (result == null) result = caseConnection(queuingConnection);
				if (result == null) result = caseTraceableElement(queuingConnection);
				if (result == null) result = caseFace_Element(queuingConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.SINGLE_INSTANCE_MESSAGE_CONNECTION: {
				SingleInstanceMessageConnection singleInstanceMessageConnection = (SingleInstanceMessageConnection)theEObject;
				T result = caseSingleInstanceMessageConnection(singleInstanceMessageConnection);
				if (result == null) result = casePubSubConnection(singleInstanceMessageConnection);
				if (result == null) result = caseConnection(singleInstanceMessageConnection);
				if (result == null) result = caseTraceableElement(singleInstanceMessageConnection);
				if (result == null) result = caseFace_Element(singleInstanceMessageConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.LIFE_CYCLE_MANAGEMENT_PORT: {
				LifeCycleManagementPort lifeCycleManagementPort = (LifeCycleManagementPort)theEObject;
				T result = caseLifeCycleManagementPort(lifeCycleManagementPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.MESSAGE_TYPE: {
				MessageType messageType = (MessageType)theEObject;
				T result = caseMessageType(messageType);
				if (result == null) result = caseElement(messageType);
				if (result == null) result = caseTraceableElement(messageType);
				if (result == null) result = caseFace_Element(messageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.COMPOSITE_TEMPLATE: {
				CompositeTemplate compositeTemplate = (CompositeTemplate)theEObject;
				T result = caseCompositeTemplate(compositeTemplate);
				if (result == null) result = caseMessageType(compositeTemplate);
				if (result == null) result = caseElement(compositeTemplate);
				if (result == null) result = caseFace_Element(compositeTemplate);
				if (result == null) result = caseTraceableElement(compositeTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.TEMPLATE_COMPOSITION: {
				TemplateComposition templateComposition = (TemplateComposition)theEObject;
				T result = caseTemplateComposition(templateComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UopPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = caseMessageType(template);
				if (result == null) result = caseElement(template);
				if (result == null) result = caseTraceableElement(template);
				if (result == null) result = caseFace_Element(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uo PModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uo PModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUoPModel(UoPModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporting Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporting Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportingComponent(SupportingComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Run Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Run Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageRunTime(LanguageRunTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentFramework(ComponentFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Uo P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Uo P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractUoP(AbstractUoP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConnection(AbstractConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Of Portability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Of Portability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitOfPortability(UnitOfPortability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portable Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portable Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortableComponent(PortableComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Specific Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Specific Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformSpecificComponent(PlatformSpecificComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThread(org.osate.face31.uop.Thread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAM Memory Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAM Memory Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAMMemoryRequirements(RAMMemoryRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Server Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Server Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientServerConnection(ClientServerConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Sub Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Sub Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubSubConnection(PubSubConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queuing Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queuing Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuingConnection(QueuingConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Instance Message Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Instance Message Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleInstanceMessageConnection(SingleInstanceMessageConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Life Cycle Management Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Life Cycle Management Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeCycleManagementPort(LifeCycleManagementPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTemplate(CompositeTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateComposition(TemplateComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFace_Element(org.osate.face31.Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UopSwitch
