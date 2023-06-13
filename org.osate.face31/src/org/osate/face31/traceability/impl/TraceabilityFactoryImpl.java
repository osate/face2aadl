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
package org.osate.face31.traceability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.face31.traceability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityFactoryImpl extends EFactoryImpl implements TraceabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceabilityFactory init() {
		try {
			TraceabilityFactory theTraceabilityFactory = (TraceabilityFactory)EPackage.Registry.INSTANCE.getEFactory(TraceabilityPackage.eNS_URI);
			if (theTraceabilityFactory != null) {
				return theTraceabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityFactoryImpl() {
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
			case TraceabilityPackage.TRACEABILITY_MODEL: return createTraceabilityModel();
			case TraceabilityPackage.TRACEABILITY_POINT: return createTraceabilityPoint();
			case TraceabilityPackage.UO_PTRACEABILITY_SET: return createUoPTraceabilitySet();
			case TraceabilityPackage.CONNECTION_TRACEABILITY_SET: return createConnectionTraceabilitySet();
			case TraceabilityPackage.CONCEPTUAL_ENTITY_TRACE: return createConceptualEntityTrace();
			case TraceabilityPackage.CONCEPTUAL_VIEW_TRACE: return createConceptualViewTrace();
			case TraceabilityPackage.LOGICAL_ENTITY_TRACE: return createLogicalEntityTrace();
			case TraceabilityPackage.LOGICAL_VIEW_TRACE: return createLogicalViewTrace();
			case TraceabilityPackage.PLATFORM_ENTITY_TRACE: return createPlatformEntityTrace();
			case TraceabilityPackage.PLATFORM_VIEW_TRACE: return createPlatformViewTrace();
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
	public TraceabilityModel createTraceabilityModel() {
		TraceabilityModelImpl traceabilityModel = new TraceabilityModelImpl();
		return traceabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraceabilityPoint createTraceabilityPoint() {
		TraceabilityPointImpl traceabilityPoint = new TraceabilityPointImpl();
		return traceabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UoPTraceabilitySet createUoPTraceabilitySet() {
		UoPTraceabilitySetImpl uoPTraceabilitySet = new UoPTraceabilitySetImpl();
		return uoPTraceabilitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionTraceabilitySet createConnectionTraceabilitySet() {
		ConnectionTraceabilitySetImpl connectionTraceabilitySet = new ConnectionTraceabilitySetImpl();
		return connectionTraceabilitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptualEntityTrace createConceptualEntityTrace() {
		ConceptualEntityTraceImpl conceptualEntityTrace = new ConceptualEntityTraceImpl();
		return conceptualEntityTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptualViewTrace createConceptualViewTrace() {
		ConceptualViewTraceImpl conceptualViewTrace = new ConceptualViewTraceImpl();
		return conceptualViewTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalEntityTrace createLogicalEntityTrace() {
		LogicalEntityTraceImpl logicalEntityTrace = new LogicalEntityTraceImpl();
		return logicalEntityTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalViewTrace createLogicalViewTrace() {
		LogicalViewTraceImpl logicalViewTrace = new LogicalViewTraceImpl();
		return logicalViewTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformEntityTrace createPlatformEntityTrace() {
		PlatformEntityTraceImpl platformEntityTrace = new PlatformEntityTraceImpl();
		return platformEntityTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformViewTrace createPlatformViewTrace() {
		PlatformViewTraceImpl platformViewTrace = new PlatformViewTraceImpl();
		return platformViewTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraceabilityPackage getTraceabilityPackage() {
		return (TraceabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraceabilityPackage getPackage() {
		return TraceabilityPackage.eINSTANCE;
	}

} //TraceabilityFactoryImpl
