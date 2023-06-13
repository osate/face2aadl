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
package face.integration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see face.integration.IntegrationPackage
 * @generated
 */
public interface IntegrationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegrationFactory eINSTANCE = face.integration.impl.IntegrationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	IntegrationModel createIntegrationModel();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	IntegrationContext createIntegrationContext();

	/**
	 * Returns a new object of class '<em>TS Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TS Node Connection</em>'.
	 * @generated
	 */
	TSNodeConnection createTSNodeConnection();

	/**
	 * Returns a new object of class '<em>Uo PInstance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uo PInstance</em>'.
	 * @generated
	 */
	UoPInstance createUoPInstance();

	/**
	 * Returns a new object of class '<em>Uo PInput End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uo PInput End Point</em>'.
	 * @generated
	 */
	UoPInputEndPoint createUoPInputEndPoint();

	/**
	 * Returns a new object of class '<em>Uo POutput End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uo POutput End Point</em>'.
	 * @generated
	 */
	UoPOutputEndPoint createUoPOutputEndPoint();

	/**
	 * Returns a new object of class '<em>TS Node Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TS Node Input Port</em>'.
	 * @generated
	 */
	TSNodeInputPort createTSNodeInputPort();

	/**
	 * Returns a new object of class '<em>TS Node Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TS Node Output Port</em>'.
	 * @generated
	 */
	TSNodeOutputPort createTSNodeOutputPort();

	/**
	 * Returns a new object of class '<em>View Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Aggregation</em>'.
	 * @generated
	 */
	ViewAggregation createViewAggregation();

	/**
	 * Returns a new object of class '<em>View Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Filter</em>'.
	 * @generated
	 */
	ViewFilter createViewFilter();

	/**
	 * Returns a new object of class '<em>View Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Source</em>'.
	 * @generated
	 */
	ViewSource createViewSource();

	/**
	 * Returns a new object of class '<em>View Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Sink</em>'.
	 * @generated
	 */
	ViewSink createViewSink();

	/**
	 * Returns a new object of class '<em>View Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Transformation</em>'.
	 * @generated
	 */
	ViewTransformation createViewTransformation();

	/**
	 * Returns a new object of class '<em>View Transporter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Transporter</em>'.
	 * @generated
	 */
	ViewTransporter createViewTransporter();

	/**
	 * Returns a new object of class '<em>Transport Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Channel</em>'.
	 * @generated
	 */
	TransportChannel createTransportChannel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntegrationPackage getIntegrationPackage();

} //IntegrationFactory
