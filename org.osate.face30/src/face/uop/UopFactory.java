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
package face.uop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see face.uop.UopPackage
 * @generated
 */
public interface UopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UopFactory eINSTANCE = face.uop.impl.UopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uo PModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uo PModel</em>'.
	 * @generated
	 */
	UoPModel createUoPModel();

	/**
	 * Returns a new object of class '<em>Language Run Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Run Time</em>'.
	 * @generated
	 */
	LanguageRunTime createLanguageRunTime();

	/**
	 * Returns a new object of class '<em>Component Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Framework</em>'.
	 * @generated
	 */
	ComponentFramework createComponentFramework();

	/**
	 * Returns a new object of class '<em>Abstract Uo P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Uo P</em>'.
	 * @generated
	 */
	AbstractUoP createAbstractUoP();

	/**
	 * Returns a new object of class '<em>Abstract Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Connection</em>'.
	 * @generated
	 */
	AbstractConnection createAbstractConnection();

	/**
	 * Returns a new object of class '<em>Portable Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portable Component</em>'.
	 * @generated
	 */
	PortableComponent createPortableComponent();

	/**
	 * Returns a new object of class '<em>Platform Specific Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Specific Component</em>'.
	 * @generated
	 */
	PlatformSpecificComponent createPlatformSpecificComponent();

	/**
	 * Returns a new object of class '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread</em>'.
	 * @generated
	 */
	Thread createThread();

	/**
	 * Returns a new object of class '<em>RAM Memory Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Memory Requirements</em>'.
	 * @generated
	 */
	RAMMemoryRequirements createRAMMemoryRequirements();

	/**
	 * Returns a new object of class '<em>Client Server Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Server Connection</em>'.
	 * @generated
	 */
	ClientServerConnection createClientServerConnection();

	/**
	 * Returns a new object of class '<em>Queuing Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queuing Connection</em>'.
	 * @generated
	 */
	QueuingConnection createQueuingConnection();

	/**
	 * Returns a new object of class '<em>Single Instance Message Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Instance Message Connection</em>'.
	 * @generated
	 */
	SingleInstanceMessageConnection createSingleInstanceMessageConnection();

	/**
	 * Returns a new object of class '<em>Life Cycle Management Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Life Cycle Management Port</em>'.
	 * @generated
	 */
	LifeCycleManagementPort createLifeCycleManagementPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UopPackage getUopPackage();

} //UopFactory
