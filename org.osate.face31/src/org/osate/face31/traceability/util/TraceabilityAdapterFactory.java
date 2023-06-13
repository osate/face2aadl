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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.face31.traceability.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.face31.traceability.TraceabilityPackage
 * @generated
 */
public class TraceabilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TraceabilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TraceabilityPackage.eINSTANCE;
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
	protected TraceabilitySwitch<Adapter> modelSwitch =
		new TraceabilitySwitch<Adapter>() {
			@Override
			public Adapter caseTraceabilityModel(TraceabilityModel object) {
				return createTraceabilityModelAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseTraceableElement(TraceableElement object) {
				return createTraceableElementAdapter();
			}
			@Override
			public Adapter caseTraceabilityPoint(TraceabilityPoint object) {
				return createTraceabilityPointAdapter();
			}
			@Override
			public Adapter caseUoPTraceabilitySet(UoPTraceabilitySet object) {
				return createUoPTraceabilitySetAdapter();
			}
			@Override
			public Adapter caseConnectionTraceabilitySet(ConnectionTraceabilitySet object) {
				return createConnectionTraceabilitySetAdapter();
			}
			@Override
			public Adapter caseConceptualEntityTrace(ConceptualEntityTrace object) {
				return createConceptualEntityTraceAdapter();
			}
			@Override
			public Adapter caseConceptualViewTrace(ConceptualViewTrace object) {
				return createConceptualViewTraceAdapter();
			}
			@Override
			public Adapter caseLogicalEntityTrace(LogicalEntityTrace object) {
				return createLogicalEntityTraceAdapter();
			}
			@Override
			public Adapter caseLogicalViewTrace(LogicalViewTrace object) {
				return createLogicalViewTraceAdapter();
			}
			@Override
			public Adapter casePlatformEntityTrace(PlatformEntityTrace object) {
				return createPlatformEntityTraceAdapter();
			}
			@Override
			public Adapter casePlatformViewTrace(PlatformViewTrace object) {
				return createPlatformViewTraceAdapter();
			}
			@Override
			public Adapter caseFace_Element(org.osate.face31.Element object) {
				return createFace_ElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.TraceabilityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.TraceabilityModel
	 * @generated
	 */
	public Adapter createTraceabilityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.TraceabilityPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.TraceabilityPoint
	 * @generated
	 */
	public Adapter createTraceabilityPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.UoPTraceabilitySet <em>Uo PTraceability Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.UoPTraceabilitySet
	 * @generated
	 */
	public Adapter createUoPTraceabilitySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.ConnectionTraceabilitySet <em>Connection Traceability Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.ConnectionTraceabilitySet
	 * @generated
	 */
	public Adapter createConnectionTraceabilitySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.ConceptualEntityTrace <em>Conceptual Entity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.ConceptualEntityTrace
	 * @generated
	 */
	public Adapter createConceptualEntityTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.ConceptualViewTrace <em>Conceptual View Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.ConceptualViewTrace
	 * @generated
	 */
	public Adapter createConceptualViewTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.LogicalEntityTrace <em>Logical Entity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.LogicalEntityTrace
	 * @generated
	 */
	public Adapter createLogicalEntityTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.LogicalViewTrace <em>Logical View Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.LogicalViewTrace
	 * @generated
	 */
	public Adapter createLogicalViewTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.PlatformEntityTrace <em>Platform Entity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.PlatformEntityTrace
	 * @generated
	 */
	public Adapter createPlatformEntityTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.traceability.PlatformViewTrace <em>Platform View Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.traceability.PlatformViewTrace
	 * @generated
	 */
	public Adapter createPlatformViewTraceAdapter() {
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

} //TraceabilityAdapterFactory
