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
package face.integration.impl;

import face.integration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationFactoryImpl extends EFactoryImpl implements IntegrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntegrationFactory init() {
		try {
			IntegrationFactory theIntegrationFactory = (IntegrationFactory)EPackage.Registry.INSTANCE.getEFactory(IntegrationPackage.eNS_URI);
			if (theIntegrationFactory != null) {
				return theIntegrationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationFactoryImpl() {
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
			case IntegrationPackage.INTEGRATION_MODEL: return createIntegrationModel();
			case IntegrationPackage.INTEGRATION_CONTEXT: return createIntegrationContext();
			case IntegrationPackage.TS_NODE_CONNECTION: return createTSNodeConnection();
			case IntegrationPackage.UO_PINSTANCE: return createUoPInstance();
			case IntegrationPackage.UO_PINPUT_END_POINT: return createUoPInputEndPoint();
			case IntegrationPackage.UO_POUTPUT_END_POINT: return createUoPOutputEndPoint();
			case IntegrationPackage.TS_NODE_INPUT_PORT: return createTSNodeInputPort();
			case IntegrationPackage.TS_NODE_OUTPUT_PORT: return createTSNodeOutputPort();
			case IntegrationPackage.VIEW_AGGREGATION: return createViewAggregation();
			case IntegrationPackage.VIEW_FILTER: return createViewFilter();
			case IntegrationPackage.VIEW_SOURCE: return createViewSource();
			case IntegrationPackage.VIEW_SINK: return createViewSink();
			case IntegrationPackage.VIEW_TRANSFORMATION: return createViewTransformation();
			case IntegrationPackage.VIEW_TRANSPORTER: return createViewTransporter();
			case IntegrationPackage.TRANSPORT_CHANNEL: return createTransportChannel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationModel createIntegrationModel() {
		IntegrationModelImpl integrationModel = new IntegrationModelImpl();
		return integrationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationContext createIntegrationContext() {
		IntegrationContextImpl integrationContext = new IntegrationContextImpl();
		return integrationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSNodeConnection createTSNodeConnection() {
		TSNodeConnectionImpl tsNodeConnection = new TSNodeConnectionImpl();
		return tsNodeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UoPInstance createUoPInstance() {
		UoPInstanceImpl uoPInstance = new UoPInstanceImpl();
		return uoPInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UoPInputEndPoint createUoPInputEndPoint() {
		UoPInputEndPointImpl uoPInputEndPoint = new UoPInputEndPointImpl();
		return uoPInputEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UoPOutputEndPoint createUoPOutputEndPoint() {
		UoPOutputEndPointImpl uoPOutputEndPoint = new UoPOutputEndPointImpl();
		return uoPOutputEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSNodeInputPort createTSNodeInputPort() {
		TSNodeInputPortImpl tsNodeInputPort = new TSNodeInputPortImpl();
		return tsNodeInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSNodeOutputPort createTSNodeOutputPort() {
		TSNodeOutputPortImpl tsNodeOutputPort = new TSNodeOutputPortImpl();
		return tsNodeOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAggregation createViewAggregation() {
		ViewAggregationImpl viewAggregation = new ViewAggregationImpl();
		return viewAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewFilter createViewFilter() {
		ViewFilterImpl viewFilter = new ViewFilterImpl();
		return viewFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewSource createViewSource() {
		ViewSourceImpl viewSource = new ViewSourceImpl();
		return viewSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewSink createViewSink() {
		ViewSinkImpl viewSink = new ViewSinkImpl();
		return viewSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewTransformation createViewTransformation() {
		ViewTransformationImpl viewTransformation = new ViewTransformationImpl();
		return viewTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewTransporter createViewTransporter() {
		ViewTransporterImpl viewTransporter = new ViewTransporterImpl();
		return viewTransporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportChannel createTransportChannel() {
		TransportChannelImpl transportChannel = new TransportChannelImpl();
		return transportChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationPackage getIntegrationPackage() {
		return (IntegrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntegrationPackage getPackage() {
		return IntegrationPackage.eINSTANCE;
	}

} //IntegrationFactoryImpl
