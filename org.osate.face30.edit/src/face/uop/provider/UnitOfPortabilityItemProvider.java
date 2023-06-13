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
package face.uop.provider;


import face.traceability.TraceabilityFactory;
import face.traceability.TraceabilityPackage;

import face.uop.UnitOfPortability;
import face.uop.UopFactory;
import face.uop.UopPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link face.uop.UnitOfPortability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitOfPortabilityItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfPortabilityItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSupportingComponentPropertyDescriptor(object);
			addRealizesPropertyDescriptor(object);
			addTransportAPILanguagePropertyDescriptor(object);
			addDesignAssuranceLevelPropertyDescriptor(object);
			addPartitionTypePropertyDescriptor(object);
			addDesignAssuranceStandardPropertyDescriptor(object);
			addFaceProfilePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Supporting Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportingComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitOfPortability_supportingComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitOfPortability_supportingComponent_feature", "_UI_UnitOfPortability_type"),
				 UopPackage.Literals.UNIT_OF_PORTABILITY__SUPPORTING_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Realizes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitOfPortability_realizes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitOfPortability_realizes_feature", "_UI_UnitOfPortability_type"),
				 UopPackage.Literals.UNIT_OF_PORTABILITY__REALIZES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transport API Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransportAPILanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitOfPortability_transportAPILanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitOfPortability_transportAPILanguage_feature", "_UI_UnitOfPortability_type"),
				 UopPackage.Literals.UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design Assurance Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesignAssuranceLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitOfPortability_designAssuranceLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitOfPortability_designAssuranceLevel_feature", "_UI_UnitOfPortability_type"),
				 UopPackage.Literals.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partition Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitOfPortability_partitionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitOfPortability_partitionType_feature", "_UI_UnitOfPortability_type"),
				 UopPackage.Literals.UNIT_OF_PORTABILITY__PARTITION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design Assurance Standard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesignAssuranceStandardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitOfPortability_designAssuranceStandard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitOfPortability_designAssuranceStandard_feature", "_UI_UnitOfPortability_type"),
				 UopPackage.Literals.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Face Profile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFaceProfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitOfPortability_faceProfile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitOfPortability_faceProfile_feature", "_UI_UnitOfPortability_type"),
				 UopPackage.Literals.UNIT_OF_PORTABILITY__FACE_PROFILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TraceabilityPackage.Literals.TRACEABLE_ELEMENT__TRACEABILITY_POINT);
			childrenFeatures.add(UopPackage.Literals.UNIT_OF_PORTABILITY__THREAD);
			childrenFeatures.add(UopPackage.Literals.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS);
			childrenFeatures.add(UopPackage.Literals.UNIT_OF_PORTABILITY__CONNECTION);
			childrenFeatures.add(UopPackage.Literals.UNIT_OF_PORTABILITY__LCM_PORT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnitOfPortability)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitOfPortability_type") :
			getString("_UI_UnitOfPortability_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UnitOfPortability.class)) {
			case UopPackage.UNIT_OF_PORTABILITY__TRANSPORT_API_LANGUAGE:
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_LEVEL:
			case UopPackage.UNIT_OF_PORTABILITY__PARTITION_TYPE:
			case UopPackage.UNIT_OF_PORTABILITY__DESIGN_ASSURANCE_STANDARD:
			case UopPackage.UNIT_OF_PORTABILITY__FACE_PROFILE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UopPackage.UNIT_OF_PORTABILITY__TRACEABILITY_POINT:
			case UopPackage.UNIT_OF_PORTABILITY__THREAD:
			case UopPackage.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS:
			case UopPackage.UNIT_OF_PORTABILITY__CONNECTION:
			case UopPackage.UNIT_OF_PORTABILITY__LCM_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACEABLE_ELEMENT__TRACEABILITY_POINT,
				 TraceabilityFactory.eINSTANCE.createTraceabilityPoint()));

		newChildDescriptors.add
			(createChildParameter
				(UopPackage.Literals.UNIT_OF_PORTABILITY__THREAD,
				 UopFactory.eINSTANCE.createThread()));

		newChildDescriptors.add
			(createChildParameter
				(UopPackage.Literals.UNIT_OF_PORTABILITY__MEMORY_REQUIREMENTS,
				 UopFactory.eINSTANCE.createRAMMemoryRequirements()));

		newChildDescriptors.add
			(createChildParameter
				(UopPackage.Literals.UNIT_OF_PORTABILITY__CONNECTION,
				 UopFactory.eINSTANCE.createClientServerConnection()));

		newChildDescriptors.add
			(createChildParameter
				(UopPackage.Literals.UNIT_OF_PORTABILITY__CONNECTION,
				 UopFactory.eINSTANCE.createQueuingConnection()));

		newChildDescriptors.add
			(createChildParameter
				(UopPackage.Literals.UNIT_OF_PORTABILITY__CONNECTION,
				 UopFactory.eINSTANCE.createSingleInstanceMessageConnection()));

		newChildDescriptors.add
			(createChildParameter
				(UopPackage.Literals.UNIT_OF_PORTABILITY__LCM_PORT,
				 UopFactory.eINSTANCE.createLifeCycleManagementPort()));
	}

}
