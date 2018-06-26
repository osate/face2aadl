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
package face.uop.impl;

import face.traceability.TraceabilityPackage;
import face.traceability.TraceabilityPoint;
import face.traceability.TraceableElement;

import face.uop.AbstractUoP;
import face.uop.Connection;
import face.uop.DesignAssuranceLevel;
import face.uop.DesignAssuranceStandard;
import face.uop.FaceProfile;
import face.uop.LifeCycleManagementPort;
import face.uop.PartitionType;
import face.uop.ProgrammingLanguage;
import face.uop.RAMMemoryRequirements;
import face.uop.SupportingComponent;
import face.uop.UnitOfPortability;
import face.uop.UopPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Of Portability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getTraceabilityPoint <em>Traceability Point</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getSupportingComponent <em>Supporting Component</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getMemoryRequirements <em>Memory Requirements</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getTransportAPILanguage <em>Transport API Language</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getDesignAssuranceLevel <em>Design Assurance Level</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getPartitionType <em>Partition Type</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getDesignAssuranceStandard <em>Design Assurance Standard</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getFaceProfile <em>Face Profile</em>}</li>
 *   <li>{@link face.uop.impl.UnitOfPortabilityImpl#getLcmPort <em>Lcm Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnitOfPortabilityImpl extends ElementImpl implements UnitOfPortability {
	/**
	 * The cached value of the '{@link #getTraceabilityPoint() <em>Traceability Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceabilityPoint> traceabilityPoint;

	/**
	 * The cached value of the '{@link #getSupportingComponent() <em>Supporting Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportingComponent> supportingComponent;

	/**
	 * The cached value of the '{@link #getThread() <em>Thread</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected EList<face.uop.Thread> thread;

	/**
	 * The cached value of the '{@link #getMemoryRequirements() <em>Memory Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryRequirements()
	 * @generated
	 * @ordered
	 */
	protected RAMMemoryRequirements memoryRequirements;

	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected AbstractUoP realizes;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The default value of the '{@link #getTransportAPILanguage() <em>Transport API Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportAPILanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammingLanguage TRANSPORT_API_LANGUAGE_EDEFAULT = ProgrammingLanguage.C;

	/**
	 * The cached value of the '{@link #getTransportAPILanguage() <em>Transport API Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportAPILanguage()
	 * @generated
	 * @ordered
	 */
	protected ProgrammingLanguage transportAPILanguage = TRANSPORT_API_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignAssuranceLevel() <em>Design Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignAssuranceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DesignAssuranceLevel DESIGN_ASSURANCE_LEVEL_EDEFAULT = DesignAssuranceLevel.A;

	/**
	 * The cached value of the '{@link #getDesignAssuranceLevel() <em>Design Assurance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignAssuranceLevel()
	 * @generated
	 * @ordered
	 */
	protected DesignAssuranceLevel designAssuranceLevel = DESIGN_ASSURANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionType() <em>Partition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionType()
	 * @generated
	 * @ordered
	 */
	protected static final PartitionType PARTITION_TYPE_EDEFAULT = PartitionType.POSIX;

	/**
	 * The cached value of the '{@link #getPartitionType() <em>Partition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionType()
	 * @generated
	 * @ordered
	 */
	protected PartitionType partitionType = PARTITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignAssuranceStandard() <em>Design Assurance Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignAssuranceStandard()
	 * @generated
	 * @ordered
	 */
	protected static final DesignAssuranceStandard DESIGN_ASSURANCE_STANDARD_EDEFAULT = DesignAssuranceStandard.DO_178B_ED_12B;

	/**
	 * The cached value of the '{@link #getDesignAssuranceStandard() <em>Design Assurance Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignAssuranceStandard()
	 * @generated
	 * @ordered
	 */
	protected DesignAssuranceStandard designAssuranceStandard = DESIGN_ASSURANCE_STANDARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaceProfile() <em>Face Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaceProfile()
	 * @generated
	 * @ordered
	 */
	protected static final FaceProfile FACE_PROFILE_EDEFAULT = FaceProfile.GENERAL_PURPOSE;

	/**
	 * The cached value of the '{@link #getFaceProfile() <em>Face Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaceProfile()
	 * @generated
	 * @ordered
	 */
	protected FaceProfile faceProfile = FACE_PROFILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLcmPort() <em>Lcm Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcmPort()
	 * @generated
	 * @ordered
	 */
	protected EList<LifeCycleManagementPort> lcmPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitOfPortabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UopPackage.Literals.UNIT_OF_PORTABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceabilityPoint> getTraceabilityPoint() {
		if (traceabilityPoint == null) {
			traceabilityPoint = new EObjectContainmentEList<TraceabilityPoint>(TraceabilityPoint.class, this, UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT);
		}
		return traceabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportingComponent> getSupportingComponent() {
		if (supportingComponent == null) {
			supportingComponent = new EObjectResolvingEList<SupportingComponent>(SupportingComponent.class, this, UopPackage.UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT);
		}
		return supportingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<face.uop.Thread> getThread() {
		if (thread == null) {
			thread = new EObjectContainmentEList<face.uop.Thread>(face.uop.Thread.class, this, UopPackage.UNIT_OF_PORTABILITY__THREAD);
		}
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAMMemoryRequirements getMemoryRequirements() {
		return memoryRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryRequirements(RAMMemoryRequirements newMemoryRequirements, NotificationChain msgs) {
		RAMMemoryRequirements oldMemoryRequirements = memoryRequirements;
		memoryRequirements = newMemoryRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS, oldMemoryRequirements, newMemoryRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryRequirements(RAMMemoryRequirements newMemoryRequirements) {
		if (newMemoryRequirements != memoryRequirements) {
			NotificationChain msgs = null;
			if (memoryRequirements != null)
				msgs = ((InternalEObject)memoryRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS, null, msgs);
			if (newMemoryRequirements != null)
				msgs = ((InternalEObject)newMemoryRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS, null, msgs);
			msgs = basicSetMemoryRequirements(newMemoryRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS, newMemoryRequirements, newMemoryRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUoP getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (AbstractUoP)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UopPackage.UNIT_OF_PORTABILITY__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUoP basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizes(AbstractUoP newRealizes) {
		AbstractUoP oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, UopPackage.UNIT_OF_PORTABILITY__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage getTransportAPILanguage() {
		return transportAPILanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportAPILanguage(ProgrammingLanguage newTransportAPILanguage) {
		ProgrammingLanguage oldTransportAPILanguage = transportAPILanguage;
		transportAPILanguage = newTransportAPILanguage == null ? TRANSPORT_API_LANGUAGE_EDEFAULT : newTransportAPILanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE, oldTransportAPILanguage, transportAPILanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAssuranceLevel getDesignAssuranceLevel() {
		return designAssuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignAssuranceLevel(DesignAssuranceLevel newDesignAssuranceLevel) {
		DesignAssuranceLevel oldDesignAssuranceLevel = designAssuranceLevel;
		designAssuranceLevel = newDesignAssuranceLevel == null ? DESIGN_ASSURANCE_LEVEL_EDEFAULT : newDesignAssuranceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL, oldDesignAssuranceLevel, designAssuranceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionType getPartitionType() {
		return partitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionType(PartitionType newPartitionType) {
		PartitionType oldPartitionType = partitionType;
		partitionType = newPartitionType == null ? PARTITION_TYPE_EDEFAULT : newPartitionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__PARTITION_TYPE, oldPartitionType, partitionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAssuranceStandard getDesignAssuranceStandard() {
		return designAssuranceStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignAssuranceStandard(DesignAssuranceStandard newDesignAssuranceStandard) {
		DesignAssuranceStandard oldDesignAssuranceStandard = designAssuranceStandard;
		designAssuranceStandard = newDesignAssuranceStandard == null ? DESIGN_ASSURANCE_STANDARD_EDEFAULT : newDesignAssuranceStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD, oldDesignAssuranceStandard, designAssuranceStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaceProfile getFaceProfile() {
		return faceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaceProfile(FaceProfile newFaceProfile) {
		FaceProfile oldFaceProfile = faceProfile;
		faceProfile = newFaceProfile == null ? FACE_PROFILE_EDEFAULT : newFaceProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UopPackage.UNIT_OF_PORTABILITY__FACE_PROFILE, oldFaceProfile, faceProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifeCycleManagementPort> getLcmPort() {
		if (lcmPort == null) {
			lcmPort = new EObjectContainmentEList<LifeCycleManagementPort>(LifeCycleManagementPort.class, this, UopPackage.UNIT_OF_PORTABILITY__LCM_PORT);
		}
		return lcmPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT:
				return ((InternalEList<?>)getTraceabilityPoint()).basicRemove(otherEnd, msgs);
			case UopPackage.UNIT_OF_PORTABILITY__THREAD:
				return ((InternalEList<?>)getThread()).basicRemove(otherEnd, msgs);
			case UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS:
				return basicSetMemoryRequirements(null, msgs);
			case UopPackage.UNIT_OF_PORTABILITY__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case UopPackage.UNIT_OF_PORTABILITY__LCM_PORT:
				return ((InternalEList<?>)getLcmPort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT:
				return getTraceabilityPoint();
			case UopPackage.UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT:
				return getSupportingComponent();
			case UopPackage.UNIT_OF_PORTABILITY__THREAD:
				return getThread();
			case UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS:
				return getMemoryRequirements();
			case UopPackage.UNIT_OF_PORTABILITY__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case UopPackage.UNIT_OF_PORTABILITY__CONNECTION:
				return getConnection();
			case UopPackage.UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE:
				return getTransportAPILanguage();
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL:
				return getDesignAssuranceLevel();
			case UopPackage.UNIT_OF_PORTABILITY__PARTITION_TYPE:
				return getPartitionType();
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD:
				return getDesignAssuranceStandard();
			case UopPackage.UNIT_OF_PORTABILITY__FACE_PROFILE:
				return getFaceProfile();
			case UopPackage.UNIT_OF_PORTABILITY__LCM_PORT:
				return getLcmPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				getTraceabilityPoint().addAll((Collection<? extends TraceabilityPoint>)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT:
				getSupportingComponent().clear();
				getSupportingComponent().addAll((Collection<? extends SupportingComponent>)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__THREAD:
				getThread().clear();
				getThread().addAll((Collection<? extends face.uop.Thread>)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS:
				setMemoryRequirements((RAMMemoryRequirements)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__REALIZES:
				setRealizes((AbstractUoP)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE:
				setTransportAPILanguage((ProgrammingLanguage)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL:
				setDesignAssuranceLevel((DesignAssuranceLevel)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__PARTITION_TYPE:
				setPartitionType((PartitionType)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD:
				setDesignAssuranceStandard((DesignAssuranceStandard)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__FACE_PROFILE:
				setFaceProfile((FaceProfile)newValue);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__LCM_PORT:
				getLcmPort().clear();
				getLcmPort().addAll((Collection<? extends LifeCycleManagementPort>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT:
				getTraceabilityPoint().clear();
				return;
			case UopPackage.UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT:
				getSupportingComponent().clear();
				return;
			case UopPackage.UNIT_OF_PORTABILITY__THREAD:
				getThread().clear();
				return;
			case UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS:
				setMemoryRequirements((RAMMemoryRequirements)null);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__REALIZES:
				setRealizes((AbstractUoP)null);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__CONNECTION:
				getConnection().clear();
				return;
			case UopPackage.UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE:
				setTransportAPILanguage(TRANSPORT_API_LANGUAGE_EDEFAULT);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL:
				setDesignAssuranceLevel(DESIGN_ASSURANCE_LEVEL_EDEFAULT);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__PARTITION_TYPE:
				setPartitionType(PARTITION_TYPE_EDEFAULT);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD:
				setDesignAssuranceStandard(DESIGN_ASSURANCE_STANDARD_EDEFAULT);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__FACE_PROFILE:
				setFaceProfile(FACE_PROFILE_EDEFAULT);
				return;
			case UopPackage.UNIT_OF_PORTABILITY__LCM_PORT:
				getLcmPort().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT:
				return traceabilityPoint != null && !traceabilityPoint.isEmpty();
			case UopPackage.UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT:
				return supportingComponent != null && !supportingComponent.isEmpty();
			case UopPackage.UNIT_OF_PORTABILITY__THREAD:
				return thread != null && !thread.isEmpty();
			case UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS:
				return memoryRequirements != null;
			case UopPackage.UNIT_OF_PORTABILITY__REALIZES:
				return realizes != null;
			case UopPackage.UNIT_OF_PORTABILITY__CONNECTION:
				return connection != null && !connection.isEmpty();
			case UopPackage.UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE:
				return transportAPILanguage != TRANSPORT_API_LANGUAGE_EDEFAULT;
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL:
				return designAssuranceLevel != DESIGN_ASSURANCE_LEVEL_EDEFAULT;
			case UopPackage.UNIT_OF_PORTABILITY__PARTITION_TYPE:
				return partitionType != PARTITION_TYPE_EDEFAULT;
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD:
				return designAssuranceStandard != DESIGN_ASSURANCE_STANDARD_EDEFAULT;
			case UopPackage.UNIT_OF_PORTABILITY__FACE_PROFILE:
				return faceProfile != FACE_PROFILE_EDEFAULT;
			case UopPackage.UNIT_OF_PORTABILITY__LCM_PORT:
				return lcmPort != null && !lcmPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT: return TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				case TraceabilityPackage.TRACEABLE_ELEMENT__TRACEABILITY_POINT: return UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (transportAPILanguage: ");
		result.append(transportAPILanguage);
		result.append(", designAssuranceLevel: ");
		result.append(designAssuranceLevel);
		result.append(", partitionType: ");
		result.append(partitionType);
		result.append(", designAssuranceStandard: ");
		result.append(designAssuranceStandard);
		result.append(", faceProfile: ");
		result.append(faceProfile);
		result.append(')');
		return result.toString();
	}

} //UnitOfPortabilityImpl
