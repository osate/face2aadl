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
package face.datamodel.provider;


import face.datamodel.DatamodelFactory;
import face.datamodel.DatamodelPackage;
import face.datamodel.LogicalDataModel;

import face.datamodel.logical.LogicalFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link face.datamodel.LogicalDataModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalDataModelItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDataModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT);
			childrenFeatures.add(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__LDM);
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
	 * This returns LogicalDataModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalDataModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LogicalDataModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LogicalDataModel_type") :
			getString("_UI_LogicalDataModel_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalDataModel.class)) {
			case DatamodelPackage.LOGICAL_DATA_MODEL__ELEMENT:
			case DatamodelPackage.LOGICAL_DATA_MODEL__LDM:
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
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createUnit()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createConversion()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createAffineConversion()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createCharacter()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createInteger()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createNatural()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createReal()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createNonNegativeReal()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createEnumerated()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createCoordinateSystem()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createCoordinateSystemAxis()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createStandardMeasurementSystem()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createLandmark()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createMeasurementSystem()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createMeasurementSystemAxis()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createValueTypeUnit()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createMeasurementSystemConversion()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createMeasurementAxis()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createMeasurementConversion()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createQuery()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__ELEMENT,
				 LogicalFactory.eINSTANCE.createCompositeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(DatamodelPackage.Literals.LOGICAL_DATA_MODEL__LDM,
				 DatamodelFactory.eINSTANCE.createLogicalDataModel()));
	}

}
