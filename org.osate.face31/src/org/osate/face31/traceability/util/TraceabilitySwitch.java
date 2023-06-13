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
package org.osate.face31.traceability.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.face31.traceability.*;

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
 * @see org.osate.face31.traceability.TraceabilityPackage
 * @generated
 */
public class TraceabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TraceabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = TraceabilityPackage.eINSTANCE;
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
			case TraceabilityPackage.TRACEABILITY_MODEL: {
				TraceabilityModel traceabilityModel = (TraceabilityModel)theEObject;
				T result = caseTraceabilityModel(traceabilityModel);
				if (result == null) result = caseFace_Element(traceabilityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseFace_Element(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.TRACEABLE_ELEMENT: {
				TraceableElement traceableElement = (TraceableElement)theEObject;
				T result = caseTraceableElement(traceableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.TRACEABILITY_POINT: {
				TraceabilityPoint traceabilityPoint = (TraceabilityPoint)theEObject;
				T result = caseTraceabilityPoint(traceabilityPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.UO_PTRACEABILITY_SET: {
				UoPTraceabilitySet uoPTraceabilitySet = (UoPTraceabilitySet)theEObject;
				T result = caseUoPTraceabilitySet(uoPTraceabilitySet);
				if (result == null) result = caseElement(uoPTraceabilitySet);
				if (result == null) result = caseTraceableElement(uoPTraceabilitySet);
				if (result == null) result = caseFace_Element(uoPTraceabilitySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.CONNECTION_TRACEABILITY_SET: {
				ConnectionTraceabilitySet connectionTraceabilitySet = (ConnectionTraceabilitySet)theEObject;
				T result = caseConnectionTraceabilitySet(connectionTraceabilitySet);
				if (result == null) result = caseElement(connectionTraceabilitySet);
				if (result == null) result = caseTraceableElement(connectionTraceabilitySet);
				if (result == null) result = caseFace_Element(connectionTraceabilitySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.CONCEPTUAL_ENTITY_TRACE: {
				ConceptualEntityTrace conceptualEntityTrace = (ConceptualEntityTrace)theEObject;
				T result = caseConceptualEntityTrace(conceptualEntityTrace);
				if (result == null) result = caseElement(conceptualEntityTrace);
				if (result == null) result = caseTraceableElement(conceptualEntityTrace);
				if (result == null) result = caseFace_Element(conceptualEntityTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.CONCEPTUAL_VIEW_TRACE: {
				ConceptualViewTrace conceptualViewTrace = (ConceptualViewTrace)theEObject;
				T result = caseConceptualViewTrace(conceptualViewTrace);
				if (result == null) result = caseElement(conceptualViewTrace);
				if (result == null) result = caseTraceableElement(conceptualViewTrace);
				if (result == null) result = caseFace_Element(conceptualViewTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.LOGICAL_ENTITY_TRACE: {
				LogicalEntityTrace logicalEntityTrace = (LogicalEntityTrace)theEObject;
				T result = caseLogicalEntityTrace(logicalEntityTrace);
				if (result == null) result = caseElement(logicalEntityTrace);
				if (result == null) result = caseTraceableElement(logicalEntityTrace);
				if (result == null) result = caseFace_Element(logicalEntityTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.LOGICAL_VIEW_TRACE: {
				LogicalViewTrace logicalViewTrace = (LogicalViewTrace)theEObject;
				T result = caseLogicalViewTrace(logicalViewTrace);
				if (result == null) result = caseElement(logicalViewTrace);
				if (result == null) result = caseTraceableElement(logicalViewTrace);
				if (result == null) result = caseFace_Element(logicalViewTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.PLATFORM_ENTITY_TRACE: {
				PlatformEntityTrace platformEntityTrace = (PlatformEntityTrace)theEObject;
				T result = casePlatformEntityTrace(platformEntityTrace);
				if (result == null) result = caseElement(platformEntityTrace);
				if (result == null) result = caseTraceableElement(platformEntityTrace);
				if (result == null) result = caseFace_Element(platformEntityTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TraceabilityPackage.PLATFORM_VIEW_TRACE: {
				PlatformViewTrace platformViewTrace = (PlatformViewTrace)theEObject;
				T result = casePlatformViewTrace(platformViewTrace);
				if (result == null) result = caseElement(platformViewTrace);
				if (result == null) result = caseTraceableElement(platformViewTrace);
				if (result == null) result = caseFace_Element(platformViewTrace);
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
	public T caseTraceabilityModel(TraceabilityModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceabilityPoint(TraceabilityPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uo PTraceability Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uo PTraceability Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUoPTraceabilitySet(UoPTraceabilitySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Traceability Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Traceability Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionTraceabilitySet(ConnectionTraceabilitySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual Entity Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual Entity Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualEntityTrace(ConceptualEntityTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual View Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual View Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualViewTrace(ConceptualViewTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Entity Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Entity Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalEntityTrace(LogicalEntityTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical View Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical View Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalViewTrace(LogicalViewTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Entity Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Entity Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformEntityTrace(PlatformEntityTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform View Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform View Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformViewTrace(PlatformViewTrace object) {
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

} //TraceabilitySwitch
