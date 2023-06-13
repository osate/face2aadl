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
package org.osate.face31.uop;

import org.eclipse.emf.common.util.EList;

import org.osate.face31.traceability.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Of Portability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getSupportingComponent <em>Supporting Component</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getThread <em>Thread</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getMemoryRequirements <em>Memory Requirements</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getTransportAPILanguage <em>Transport API Language</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getDesignAssuranceLevel <em>Design Assurance Level</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getPartitionType <em>Partition Type</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getDesignAssuranceStandard <em>Design Assurance Standard</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getFaceProfile <em>Face Profile</em>}</li>
 *   <li>{@link org.osate.face31.uop.UnitOfPortability#getLcmPort <em>Lcm Port</em>}</li>
 * </ul>
 *
 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability()
 * @model abstract="true"
 * @generated
 */
public interface UnitOfPortability extends Element, TraceableElement {
	/**
	 * Returns the value of the '<em><b>Supporting Component</b></em>' reference list.
	 * The list contents are of type {@link org.osate.face31.uop.SupportingComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Component</em>' reference list.
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_SupportingComponent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SupportingComponent> getSupportingComponent();

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.face31.uop.Thread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' containment reference list.
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_Thread()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<org.osate.face31.uop.Thread> getThread();

	/**
	 * Returns the value of the '<em><b>Memory Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Requirements</em>' containment reference.
	 * @see #setMemoryRequirements(RAMMemoryRequirements)
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_MemoryRequirements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RAMMemoryRequirements getMemoryRequirements();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.UnitOfPortability#getMemoryRequirements <em>Memory Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Requirements</em>' containment reference.
	 * @see #getMemoryRequirements()
	 * @generated
	 */
	void setMemoryRequirements(RAMMemoryRequirements value);

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(AbstractUoP)
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_Realizes()
	 * @model
	 * @generated
	 */
	AbstractUoP getRealizes();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.UnitOfPortability#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(AbstractUoP value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.face31.uop.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_Connection()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Transport API Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.face31.uop.ProgrammingLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport API Language</em>' attribute.
	 * @see org.osate.face31.uop.ProgrammingLanguage
	 * @see #setTransportAPILanguage(ProgrammingLanguage)
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_TransportAPILanguage()
	 * @model required="true"
	 * @generated
	 */
	ProgrammingLanguage getTransportAPILanguage();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.UnitOfPortability#getTransportAPILanguage <em>Transport API Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport API Language</em>' attribute.
	 * @see org.osate.face31.uop.ProgrammingLanguage
	 * @see #getTransportAPILanguage()
	 * @generated
	 */
	void setTransportAPILanguage(ProgrammingLanguage value);

	/**
	 * Returns the value of the '<em><b>Design Assurance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.face31.uop.DesignAssuranceLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Assurance Level</em>' attribute.
	 * @see org.osate.face31.uop.DesignAssuranceLevel
	 * @see #setDesignAssuranceLevel(DesignAssuranceLevel)
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_DesignAssuranceLevel()
	 * @model
	 * @generated
	 */
	DesignAssuranceLevel getDesignAssuranceLevel();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.UnitOfPortability#getDesignAssuranceLevel <em>Design Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Assurance Level</em>' attribute.
	 * @see org.osate.face31.uop.DesignAssuranceLevel
	 * @see #getDesignAssuranceLevel()
	 * @generated
	 */
	void setDesignAssuranceLevel(DesignAssuranceLevel value);

	/**
	 * Returns the value of the '<em><b>Partition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.face31.uop.PartitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Type</em>' attribute.
	 * @see org.osate.face31.uop.PartitionType
	 * @see #setPartitionType(PartitionType)
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_PartitionType()
	 * @model required="true"
	 * @generated
	 */
	PartitionType getPartitionType();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.UnitOfPortability#getPartitionType <em>Partition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Type</em>' attribute.
	 * @see org.osate.face31.uop.PartitionType
	 * @see #getPartitionType()
	 * @generated
	 */
	void setPartitionType(PartitionType value);

	/**
	 * Returns the value of the '<em><b>Design Assurance Standard</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.face31.uop.DesignAssuranceStandard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Assurance Standard</em>' attribute.
	 * @see org.osate.face31.uop.DesignAssuranceStandard
	 * @see #setDesignAssuranceStandard(DesignAssuranceStandard)
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_DesignAssuranceStandard()
	 * @model
	 * @generated
	 */
	DesignAssuranceStandard getDesignAssuranceStandard();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.UnitOfPortability#getDesignAssuranceStandard <em>Design Assurance Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Assurance Standard</em>' attribute.
	 * @see org.osate.face31.uop.DesignAssuranceStandard
	 * @see #getDesignAssuranceStandard()
	 * @generated
	 */
	void setDesignAssuranceStandard(DesignAssuranceStandard value);

	/**
	 * Returns the value of the '<em><b>Face Profile</b></em>' attribute.
	 * The literals are from the enumeration {@link org.osate.face31.uop.FaceProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Profile</em>' attribute.
	 * @see org.osate.face31.uop.FaceProfile
	 * @see #setFaceProfile(FaceProfile)
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_FaceProfile()
	 * @model required="true"
	 * @generated
	 */
	FaceProfile getFaceProfile();

	/**
	 * Sets the value of the '{@link org.osate.face31.uop.UnitOfPortability#getFaceProfile <em>Face Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face Profile</em>' attribute.
	 * @see org.osate.face31.uop.FaceProfile
	 * @see #getFaceProfile()
	 * @generated
	 */
	void setFaceProfile(FaceProfile value);

	/**
	 * Returns the value of the '<em><b>Lcm Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.osate.face31.uop.LifeCycleManagementPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lcm Port</em>' containment reference list.
	 * @see org.osate.face31.uop.UopPackage#getUnitOfPortability_LcmPort()
	 * @model containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<LifeCycleManagementPort> getLcmPort();

} // UnitOfPortability
