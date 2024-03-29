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
package org.osate.face31.uop.provider;

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

import org.osate.face31.uop.util.UopAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UopItemProviderAdapterFactory extends UopAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public UopItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.UoPModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoPModelItemProvider uoPModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.UoPModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUoPModelAdapter() {
		if (uoPModelItemProvider == null) {
			uoPModelItemProvider = new UoPModelItemProvider(this);
		}

		return uoPModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.LanguageRunTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageRunTimeItemProvider languageRunTimeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.LanguageRunTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLanguageRunTimeAdapter() {
		if (languageRunTimeItemProvider == null) {
			languageRunTimeItemProvider = new LanguageRunTimeItemProvider(this);
		}

		return languageRunTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.ComponentFramework} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFrameworkItemProvider componentFrameworkItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.ComponentFramework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentFrameworkAdapter() {
		if (componentFrameworkItemProvider == null) {
			componentFrameworkItemProvider = new ComponentFrameworkItemProvider(this);
		}

		return componentFrameworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.AbstractUoP} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractUoPItemProvider abstractUoPItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.AbstractUoP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractUoPAdapter() {
		if (abstractUoPItemProvider == null) {
			abstractUoPItemProvider = new AbstractUoPItemProvider(this);
		}

		return abstractUoPItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.AbstractConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConnectionItemProvider abstractConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.AbstractConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractConnectionAdapter() {
		if (abstractConnectionItemProvider == null) {
			abstractConnectionItemProvider = new AbstractConnectionItemProvider(this);
		}

		return abstractConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.PortableComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortableComponentItemProvider portableComponentItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.PortableComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortableComponentAdapter() {
		if (portableComponentItemProvider == null) {
			portableComponentItemProvider = new PortableComponentItemProvider(this);
		}

		return portableComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.PlatformSpecificComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformSpecificComponentItemProvider platformSpecificComponentItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.PlatformSpecificComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlatformSpecificComponentAdapter() {
		if (platformSpecificComponentItemProvider == null) {
			platformSpecificComponentItemProvider = new PlatformSpecificComponentItemProvider(this);
		}

		return platformSpecificComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.Thread} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadItemProvider threadItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.Thread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreadAdapter() {
		if (threadItemProvider == null) {
			threadItemProvider = new ThreadItemProvider(this);
		}

		return threadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.RAMMemoryRequirements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAMMemoryRequirementsItemProvider ramMemoryRequirementsItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.RAMMemoryRequirements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRAMMemoryRequirementsAdapter() {
		if (ramMemoryRequirementsItemProvider == null) {
			ramMemoryRequirementsItemProvider = new RAMMemoryRequirementsItemProvider(this);
		}

		return ramMemoryRequirementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.ClientServerConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientServerConnectionItemProvider clientServerConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.ClientServerConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClientServerConnectionAdapter() {
		if (clientServerConnectionItemProvider == null) {
			clientServerConnectionItemProvider = new ClientServerConnectionItemProvider(this);
		}

		return clientServerConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.QueuingConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueuingConnectionItemProvider queuingConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.QueuingConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueuingConnectionAdapter() {
		if (queuingConnectionItemProvider == null) {
			queuingConnectionItemProvider = new QueuingConnectionItemProvider(this);
		}

		return queuingConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.SingleInstanceMessageConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleInstanceMessageConnectionItemProvider singleInstanceMessageConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.SingleInstanceMessageConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleInstanceMessageConnectionAdapter() {
		if (singleInstanceMessageConnectionItemProvider == null) {
			singleInstanceMessageConnectionItemProvider = new SingleInstanceMessageConnectionItemProvider(this);
		}

		return singleInstanceMessageConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.LifeCycleManagementPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeCycleManagementPortItemProvider lifeCycleManagementPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.LifeCycleManagementPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLifeCycleManagementPortAdapter() {
		if (lifeCycleManagementPortItemProvider == null) {
			lifeCycleManagementPortItemProvider = new LifeCycleManagementPortItemProvider(this);
		}

		return lifeCycleManagementPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.CompositeTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTemplateItemProvider compositeTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.CompositeTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeTemplateAdapter() {
		if (compositeTemplateItemProvider == null) {
			compositeTemplateItemProvider = new CompositeTemplateItemProvider(this);
		}

		return compositeTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.TemplateComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateCompositionItemProvider templateCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.TemplateComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateCompositionAdapter() {
		if (templateCompositionItemProvider == null) {
			templateCompositionItemProvider = new TemplateCompositionItemProvider(this);
		}

		return templateCompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.face31.uop.Template} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateItemProvider templateItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.face31.uop.Template}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateAdapter() {
		if (templateItemProvider == null) {
			templateItemProvider = new TemplateItemProvider(this);
		}

		return templateItemProvider;
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
		if (uoPModelItemProvider != null) uoPModelItemProvider.dispose();
		if (languageRunTimeItemProvider != null) languageRunTimeItemProvider.dispose();
		if (componentFrameworkItemProvider != null) componentFrameworkItemProvider.dispose();
		if (abstractUoPItemProvider != null) abstractUoPItemProvider.dispose();
		if (abstractConnectionItemProvider != null) abstractConnectionItemProvider.dispose();
		if (portableComponentItemProvider != null) portableComponentItemProvider.dispose();
		if (platformSpecificComponentItemProvider != null) platformSpecificComponentItemProvider.dispose();
		if (threadItemProvider != null) threadItemProvider.dispose();
		if (ramMemoryRequirementsItemProvider != null) ramMemoryRequirementsItemProvider.dispose();
		if (clientServerConnectionItemProvider != null) clientServerConnectionItemProvider.dispose();
		if (queuingConnectionItemProvider != null) queuingConnectionItemProvider.dispose();
		if (singleInstanceMessageConnectionItemProvider != null) singleInstanceMessageConnectionItemProvider.dispose();
		if (lifeCycleManagementPortItemProvider != null) lifeCycleManagementPortItemProvider.dispose();
		if (compositeTemplateItemProvider != null) compositeTemplateItemProvider.dispose();
		if (templateCompositionItemProvider != null) templateCompositionItemProvider.dispose();
		if (templateItemProvider != null) templateItemProvider.dispose();
	}

}
