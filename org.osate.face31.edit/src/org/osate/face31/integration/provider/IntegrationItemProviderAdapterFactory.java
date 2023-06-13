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
package org.osate.face31.integration.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.osate.face31.integration.util.IntegrationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationItemProviderAdapterFactory extends IntegrationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.IntegrationModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationModelItemProvider integrationModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.IntegrationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegrationModelAdapter() {
		if (integrationModelItemProvider == null) {
			integrationModelItemProvider = new IntegrationModelItemProvider(this);
		}

		return integrationModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.IntegrationContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationContextItemProvider integrationContextItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.IntegrationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegrationContextAdapter() {
		if (integrationContextItemProvider == null) {
			integrationContextItemProvider = new IntegrationContextItemProvider(this);
		}

		return integrationContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.TSNodeConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSNodeConnectionItemProvider tsNodeConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.TSNodeConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTSNodeConnectionAdapter() {
		if (tsNodeConnectionItemProvider == null) {
			tsNodeConnectionItemProvider = new TSNodeConnectionItemProvider(this);
		}

		return tsNodeConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.UoPInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoPInstanceItemProvider uoPInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.UoPInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUoPInstanceAdapter() {
		if (uoPInstanceItemProvider == null) {
			uoPInstanceItemProvider = new UoPInstanceItemProvider(this);
		}

		return uoPInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.UoPInputEndPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoPInputEndPointItemProvider uoPInputEndPointItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.UoPInputEndPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUoPInputEndPointAdapter() {
		if (uoPInputEndPointItemProvider == null) {
			uoPInputEndPointItemProvider = new UoPInputEndPointItemProvider(this);
		}

		return uoPInputEndPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.UoPOutputEndPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoPOutputEndPointItemProvider uoPOutputEndPointItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.UoPOutputEndPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUoPOutputEndPointAdapter() {
		if (uoPOutputEndPointItemProvider == null) {
			uoPOutputEndPointItemProvider = new UoPOutputEndPointItemProvider(this);
		}

		return uoPOutputEndPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.TSNodeInputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSNodeInputPortItemProvider tsNodeInputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.TSNodeInputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTSNodeInputPortAdapter() {
		if (tsNodeInputPortItemProvider == null) {
			tsNodeInputPortItemProvider = new TSNodeInputPortItemProvider(this);
		}

		return tsNodeInputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.TSNodeOutputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSNodeOutputPortItemProvider tsNodeOutputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.TSNodeOutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTSNodeOutputPortAdapter() {
		if (tsNodeOutputPortItemProvider == null) {
			tsNodeOutputPortItemProvider = new TSNodeOutputPortItemProvider(this);
		}

		return tsNodeOutputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.ViewAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewAggregationItemProvider viewAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.ViewAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewAggregationAdapter() {
		if (viewAggregationItemProvider == null) {
			viewAggregationItemProvider = new ViewAggregationItemProvider(this);
		}

		return viewAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.ViewFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewFilterItemProvider viewFilterItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.ViewFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewFilterAdapter() {
		if (viewFilterItemProvider == null) {
			viewFilterItemProvider = new ViewFilterItemProvider(this);
		}

		return viewFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.ViewSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewSourceItemProvider viewSourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.ViewSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewSourceAdapter() {
		if (viewSourceItemProvider == null) {
			viewSourceItemProvider = new ViewSourceItemProvider(this);
		}

		return viewSourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.ViewSink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewSinkItemProvider viewSinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.ViewSink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewSinkAdapter() {
		if (viewSinkItemProvider == null) {
			viewSinkItemProvider = new ViewSinkItemProvider(this);
		}

		return viewSinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.ViewTransformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewTransformationItemProvider viewTransformationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.ViewTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewTransformationAdapter() {
		if (viewTransformationItemProvider == null) {
			viewTransformationItemProvider = new ViewTransformationItemProvider(this);
		}

		return viewTransformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.ViewTransporter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewTransporterItemProvider viewTransporterItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.ViewTransporter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewTransporterAdapter() {
		if (viewTransporterItemProvider == null) {
			viewTransporterItemProvider = new ViewTransporterItemProvider(this);
		}

		return viewTransporterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.integration.TransportChannel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportChannelItemProvider transportChannelItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.integration.TransportChannel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransportChannelAdapter() {
		if (transportChannelItemProvider == null) {
			transportChannelItemProvider = new TransportChannelItemProvider(this);
		}

		return transportChannelItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (integrationModelItemProvider != null) integrationModelItemProvider.dispose();
		if (integrationContextItemProvider != null) integrationContextItemProvider.dispose();
		if (tsNodeConnectionItemProvider != null) tsNodeConnectionItemProvider.dispose();
		if (uoPInstanceItemProvider != null) uoPInstanceItemProvider.dispose();
		if (uoPInputEndPointItemProvider != null) uoPInputEndPointItemProvider.dispose();
		if (uoPOutputEndPointItemProvider != null) uoPOutputEndPointItemProvider.dispose();
		if (tsNodeInputPortItemProvider != null) tsNodeInputPortItemProvider.dispose();
		if (tsNodeOutputPortItemProvider != null) tsNodeOutputPortItemProvider.dispose();
		if (viewAggregationItemProvider != null) viewAggregationItemProvider.dispose();
		if (viewFilterItemProvider != null) viewFilterItemProvider.dispose();
		if (viewSourceItemProvider != null) viewSourceItemProvider.dispose();
		if (viewSinkItemProvider != null) viewSinkItemProvider.dispose();
		if (viewTransformationItemProvider != null) viewTransformationItemProvider.dispose();
		if (viewTransporterItemProvider != null) viewTransporterItemProvider.dispose();
		if (transportChannelItemProvider != null) transportChannelItemProvider.dispose();
	}

}
