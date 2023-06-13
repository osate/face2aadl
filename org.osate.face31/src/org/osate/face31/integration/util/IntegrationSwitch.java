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
package org.osate.face31.integration.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.face31.integration.*;

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
 * @see org.osate.face31.integration.IntegrationPackage
 * @generated
 */
public class IntegrationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntegrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationSwitch() {
		if (modelPackage == null) {
			modelPackage = IntegrationPackage.eINSTANCE;
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
			case IntegrationPackage.INTEGRATION_MODEL: {
				IntegrationModel integrationModel = (IntegrationModel)theEObject;
				T result = caseIntegrationModel(integrationModel);
				if (result == null) result = caseFace_Element(integrationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseFace_Element(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.INTEGRATION_CONTEXT: {
				IntegrationContext integrationContext = (IntegrationContext)theEObject;
				T result = caseIntegrationContext(integrationContext);
				if (result == null) result = caseElement(integrationContext);
				if (result == null) result = caseFace_Element(integrationContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.TS_NODE_CONNECTION: {
				TSNodeConnection tsNodeConnection = (TSNodeConnection)theEObject;
				T result = caseTSNodeConnection(tsNodeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.TS_NODE_PORT_BASE: {
				TSNodePortBase tsNodePortBase = (TSNodePortBase)theEObject;
				T result = caseTSNodePortBase(tsNodePortBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.UO_PINSTANCE: {
				UoPInstance uoPInstance = (UoPInstance)theEObject;
				T result = caseUoPInstance(uoPInstance);
				if (result == null) result = caseElement(uoPInstance);
				if (result == null) result = caseFace_Element(uoPInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.UO_PEND_POINT: {
				UoPEndPoint uoPEndPoint = (UoPEndPoint)theEObject;
				T result = caseUoPEndPoint(uoPEndPoint);
				if (result == null) result = caseTSNodePortBase(uoPEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.UO_PINPUT_END_POINT: {
				UoPInputEndPoint uoPInputEndPoint = (UoPInputEndPoint)theEObject;
				T result = caseUoPInputEndPoint(uoPInputEndPoint);
				if (result == null) result = caseUoPEndPoint(uoPInputEndPoint);
				if (result == null) result = caseTSNodePortBase(uoPInputEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.UO_POUTPUT_END_POINT: {
				UoPOutputEndPoint uoPOutputEndPoint = (UoPOutputEndPoint)theEObject;
				T result = caseUoPOutputEndPoint(uoPOutputEndPoint);
				if (result == null) result = caseUoPEndPoint(uoPOutputEndPoint);
				if (result == null) result = caseTSNodePortBase(uoPOutputEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.TRANSPORT_NODE: {
				TransportNode transportNode = (TransportNode)theEObject;
				T result = caseTransportNode(transportNode);
				if (result == null) result = caseFace_Element(transportNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.TS_NODE_PORT: {
				TSNodePort tsNodePort = (TSNodePort)theEObject;
				T result = caseTSNodePort(tsNodePort);
				if (result == null) result = caseTSNodePortBase(tsNodePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.TS_NODE_INPUT_PORT: {
				TSNodeInputPort tsNodeInputPort = (TSNodeInputPort)theEObject;
				T result = caseTSNodeInputPort(tsNodeInputPort);
				if (result == null) result = caseTSNodePort(tsNodeInputPort);
				if (result == null) result = caseTSNodePortBase(tsNodeInputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.TS_NODE_OUTPUT_PORT: {
				TSNodeOutputPort tsNodeOutputPort = (TSNodeOutputPort)theEObject;
				T result = caseTSNodeOutputPort(tsNodeOutputPort);
				if (result == null) result = caseTSNodePort(tsNodeOutputPort);
				if (result == null) result = caseTSNodePortBase(tsNodeOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.VIEW_AGGREGATION: {
				ViewAggregation viewAggregation = (ViewAggregation)theEObject;
				T result = caseViewAggregation(viewAggregation);
				if (result == null) result = caseTransportNode(viewAggregation);
				if (result == null) result = caseFace_Element(viewAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.VIEW_FILTER: {
				ViewFilter viewFilter = (ViewFilter)theEObject;
				T result = caseViewFilter(viewFilter);
				if (result == null) result = caseTransportNode(viewFilter);
				if (result == null) result = caseFace_Element(viewFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.VIEW_SOURCE: {
				ViewSource viewSource = (ViewSource)theEObject;
				T result = caseViewSource(viewSource);
				if (result == null) result = caseTransportNode(viewSource);
				if (result == null) result = caseFace_Element(viewSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.VIEW_SINK: {
				ViewSink viewSink = (ViewSink)theEObject;
				T result = caseViewSink(viewSink);
				if (result == null) result = caseTransportNode(viewSink);
				if (result == null) result = caseFace_Element(viewSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.VIEW_TRANSFORMATION: {
				ViewTransformation viewTransformation = (ViewTransformation)theEObject;
				T result = caseViewTransformation(viewTransformation);
				if (result == null) result = caseTransportNode(viewTransformation);
				if (result == null) result = caseFace_Element(viewTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.VIEW_TRANSPORTER: {
				ViewTransporter viewTransporter = (ViewTransporter)theEObject;
				T result = caseViewTransporter(viewTransporter);
				if (result == null) result = caseTransportNode(viewTransporter);
				if (result == null) result = caseFace_Element(viewTransporter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegrationPackage.TRANSPORT_CHANNEL: {
				TransportChannel transportChannel = (TransportChannel)theEObject;
				T result = caseTransportChannel(transportChannel);
				if (result == null) result = caseElement(transportChannel);
				if (result == null) result = caseFace_Element(transportChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationModel(IntegrationModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationContext(IntegrationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS Node Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSNodeConnection(TSNodeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS Node Port Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS Node Port Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSNodePortBase(TSNodePortBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uo PInstance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uo PInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUoPInstance(UoPInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uo PEnd Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uo PEnd Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUoPEndPoint(UoPEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uo PInput End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uo PInput End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUoPInputEndPoint(UoPInputEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uo POutput End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uo POutput End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUoPOutputEndPoint(UoPOutputEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportNode(TransportNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS Node Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS Node Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSNodePort(TSNodePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS Node Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS Node Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSNodeInputPort(TSNodeInputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS Node Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS Node Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSNodeOutputPort(TSNodeOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewAggregation(ViewAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewFilter(ViewFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewSource(ViewSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewSink(ViewSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewTransformation(ViewTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Transporter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Transporter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewTransporter(ViewTransporter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportChannel(TransportChannel object) {
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

} //IntegrationSwitch
