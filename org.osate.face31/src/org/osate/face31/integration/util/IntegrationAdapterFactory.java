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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.face31.integration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.face31.integration.IntegrationPackage
 * @generated
 */
public class IntegrationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntegrationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntegrationPackage.eINSTANCE;
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
	protected IntegrationSwitch<Adapter> modelSwitch =
		new IntegrationSwitch<Adapter>() {
			@Override
			public Adapter caseIntegrationModel(IntegrationModel object) {
				return createIntegrationModelAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIntegrationContext(IntegrationContext object) {
				return createIntegrationContextAdapter();
			}
			@Override
			public Adapter caseTSNodeConnection(TSNodeConnection object) {
				return createTSNodeConnectionAdapter();
			}
			@Override
			public Adapter caseTSNodePortBase(TSNodePortBase object) {
				return createTSNodePortBaseAdapter();
			}
			@Override
			public Adapter caseUoPInstance(UoPInstance object) {
				return createUoPInstanceAdapter();
			}
			@Override
			public Adapter caseUoPEndPoint(UoPEndPoint object) {
				return createUoPEndPointAdapter();
			}
			@Override
			public Adapter caseUoPInputEndPoint(UoPInputEndPoint object) {
				return createUoPInputEndPointAdapter();
			}
			@Override
			public Adapter caseUoPOutputEndPoint(UoPOutputEndPoint object) {
				return createUoPOutputEndPointAdapter();
			}
			@Override
			public Adapter caseTransportNode(TransportNode object) {
				return createTransportNodeAdapter();
			}
			@Override
			public Adapter caseTSNodePort(TSNodePort object) {
				return createTSNodePortAdapter();
			}
			@Override
			public Adapter caseTSNodeInputPort(TSNodeInputPort object) {
				return createTSNodeInputPortAdapter();
			}
			@Override
			public Adapter caseTSNodeOutputPort(TSNodeOutputPort object) {
				return createTSNodeOutputPortAdapter();
			}
			@Override
			public Adapter caseViewAggregation(ViewAggregation object) {
				return createViewAggregationAdapter();
			}
			@Override
			public Adapter caseViewFilter(ViewFilter object) {
				return createViewFilterAdapter();
			}
			@Override
			public Adapter caseViewSource(ViewSource object) {
				return createViewSourceAdapter();
			}
			@Override
			public Adapter caseViewSink(ViewSink object) {
				return createViewSinkAdapter();
			}
			@Override
			public Adapter caseViewTransformation(ViewTransformation object) {
				return createViewTransformationAdapter();
			}
			@Override
			public Adapter caseViewTransporter(ViewTransporter object) {
				return createViewTransporterAdapter();
			}
			@Override
			public Adapter caseTransportChannel(TransportChannel object) {
				return createTransportChannelAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.IntegrationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.IntegrationModel
	 * @generated
	 */
	public Adapter createIntegrationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.IntegrationContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.IntegrationContext
	 * @generated
	 */
	public Adapter createIntegrationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.TSNodeConnection <em>TS Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.TSNodeConnection
	 * @generated
	 */
	public Adapter createTSNodeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.TSNodePortBase <em>TS Node Port Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.TSNodePortBase
	 * @generated
	 */
	public Adapter createTSNodePortBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.UoPInstance <em>Uo PInstance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.UoPInstance
	 * @generated
	 */
	public Adapter createUoPInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.UoPEndPoint <em>Uo PEnd Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.UoPEndPoint
	 * @generated
	 */
	public Adapter createUoPEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.UoPInputEndPoint <em>Uo PInput End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.UoPInputEndPoint
	 * @generated
	 */
	public Adapter createUoPInputEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.UoPOutputEndPoint <em>Uo POutput End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.UoPOutputEndPoint
	 * @generated
	 */
	public Adapter createUoPOutputEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.TransportNode <em>Transport Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.TransportNode
	 * @generated
	 */
	public Adapter createTransportNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.TSNodePort <em>TS Node Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.TSNodePort
	 * @generated
	 */
	public Adapter createTSNodePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.TSNodeInputPort <em>TS Node Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.TSNodeInputPort
	 * @generated
	 */
	public Adapter createTSNodeInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.TSNodeOutputPort <em>TS Node Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.TSNodeOutputPort
	 * @generated
	 */
	public Adapter createTSNodeOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.ViewAggregation <em>View Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.ViewAggregation
	 * @generated
	 */
	public Adapter createViewAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.ViewFilter <em>View Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.ViewFilter
	 * @generated
	 */
	public Adapter createViewFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.ViewSource <em>View Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.ViewSource
	 * @generated
	 */
	public Adapter createViewSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.ViewSink <em>View Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.ViewSink
	 * @generated
	 */
	public Adapter createViewSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.ViewTransformation <em>View Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.ViewTransformation
	 * @generated
	 */
	public Adapter createViewTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.ViewTransporter <em>View Transporter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.ViewTransporter
	 * @generated
	 */
	public Adapter createViewTransporterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.face31.integration.TransportChannel <em>Transport Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.face31.integration.TransportChannel
	 * @generated
	 */
	public Adapter createTransportChannelAdapter() {
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

} //IntegrationAdapterFactory
