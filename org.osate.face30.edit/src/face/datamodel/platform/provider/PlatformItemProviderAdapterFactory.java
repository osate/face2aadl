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
package face.datamodel.platform.provider;

import face.datamodel.platform.util.PlatformAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformItemProviderAdapterFactory extends PlatformAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public PlatformItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Boolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanItemProvider booleanItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAdapter() {
		if (booleanItemProvider == null) {
			booleanItemProvider = new BooleanItemProvider(this);
		}

		return booleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Octet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OctetItemProvider octetItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Octet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOctetAdapter() {
		if (octetItemProvider == null) {
			octetItemProvider = new OctetItemProvider(this);
		}

		return octetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Char} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharItemProvider charItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Char}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharAdapter() {
		if (charItemProvider == null) {
			charItemProvider = new CharItemProvider(this);
		}

		return charItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.String} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringItemProvider stringItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringAdapter() {
		if (stringItemProvider == null) {
			stringItemProvider = new StringItemProvider(this);
		}

		return stringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.BoundedString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedStringItemProvider boundedStringItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.BoundedString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundedStringAdapter() {
		if (boundedStringItemProvider == null) {
			boundedStringItemProvider = new BoundedStringItemProvider(this);
		}

		return boundedStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.CharArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharArrayItemProvider charArrayItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.CharArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharArrayAdapter() {
		if (charArrayItemProvider == null) {
			charArrayItemProvider = new CharArrayItemProvider(this);
		}

		return charArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Short} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortItemProvider shortItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Short}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShortAdapter() {
		if (shortItemProvider == null) {
			shortItemProvider = new ShortItemProvider(this);
		}

		return shortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Long} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongItemProvider longItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLongAdapter() {
		if (longItemProvider == null) {
			longItemProvider = new LongItemProvider(this);
		}

		return longItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.LongLong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongLongItemProvider longLongItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.LongLong}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLongLongAdapter() {
		if (longLongItemProvider == null) {
			longLongItemProvider = new LongLongItemProvider(this);
		}

		return longLongItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Double} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleItemProvider doubleItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleAdapter() {
		if (doubleItemProvider == null) {
			doubleItemProvider = new DoubleItemProvider(this);
		}

		return doubleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.LongDouble} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongDoubleItemProvider longDoubleItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.LongDouble}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLongDoubleAdapter() {
		if (longDoubleItemProvider == null) {
			longDoubleItemProvider = new LongDoubleItemProvider(this);
		}

		return longDoubleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Float} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatItemProvider floatItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatAdapter() {
		if (floatItemProvider == null) {
			floatItemProvider = new FloatItemProvider(this);
		}

		return floatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Fixed} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedItemProvider fixedItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Fixed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedAdapter() {
		if (fixedItemProvider == null) {
			fixedItemProvider = new FixedItemProvider(this);
		}

		return fixedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.UShort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UShortItemProvider uShortItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.UShort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUShortAdapter() {
		if (uShortItemProvider == null) {
			uShortItemProvider = new UShortItemProvider(this);
		}

		return uShortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.ULong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ULongItemProvider uLongItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.ULong}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createULongAdapter() {
		if (uLongItemProvider == null) {
			uLongItemProvider = new ULongItemProvider(this);
		}

		return uLongItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.ULongLong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ULongLongItemProvider uLongLongItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.ULongLong}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createULongLongAdapter() {
		if (uLongLongItemProvider == null) {
			uLongLongItemProvider = new ULongLongItemProvider(this);
		}

		return uLongLongItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.IDLSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDLSequenceItemProvider idlSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.IDLSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIDLSequenceAdapter() {
		if (idlSequenceItemProvider == null) {
			idlSequenceItemProvider = new IDLSequenceItemProvider(this);
		}

		return idlSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.IDLArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDLArrayItemProvider idlArrayItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.IDLArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIDLArrayAdapter() {
		if (idlArrayItemProvider == null) {
			idlArrayItemProvider = new IDLArrayItemProvider(this);
		}

		return idlArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.IDLStruct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDLStructItemProvider idlStructItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.IDLStruct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIDLStructAdapter() {
		if (idlStructItemProvider == null) {
			idlStructItemProvider = new IDLStructItemProvider(this);
		}

		return idlStructItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.IDLComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDLCompositionItemProvider idlCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.IDLComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIDLCompositionAdapter() {
		if (idlCompositionItemProvider == null) {
			idlCompositionItemProvider = new IDLCompositionItemProvider(this);
		}

		return idlCompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Composition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionItemProvider compositionItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Composition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositionAdapter() {
		if (compositionItemProvider == null) {
			compositionItemProvider = new CompositionItemProvider(this);
		}

		return compositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.ParticipantPathNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantPathNodeItemProvider participantPathNodeItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.ParticipantPathNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantPathNodeAdapter() {
		if (participantPathNodeItemProvider == null) {
			participantPathNodeItemProvider = new ParticipantPathNodeItemProvider(this);
		}

		return participantPathNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.CharacteristicPathNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicPathNodeItemProvider characteristicPathNodeItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.CharacteristicPathNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicPathNodeAdapter() {
		if (characteristicPathNodeItemProvider == null) {
			characteristicPathNodeItemProvider = new CharacteristicPathNodeItemProvider(this);
		}

		return characteristicPathNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Query} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryItemProvider queryItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryAdapter() {
		if (queryItemProvider == null) {
			queryItemProvider = new QueryItemProvider(this);
		}

		return queryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.CompositeTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTemplateItemProvider compositeTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.CompositeTemplate}.
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
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.TemplateComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateCompositionItemProvider templateCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.TemplateComposition}.
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
	 * This keeps track of the one adapter used for all {@link face.datamodel.platform.Template} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateItemProvider templateItemProvider;

	/**
	 * This creates an adapter for a {@link face.datamodel.platform.Template}.
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
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (booleanItemProvider != null) booleanItemProvider.dispose();
		if (octetItemProvider != null) octetItemProvider.dispose();
		if (charItemProvider != null) charItemProvider.dispose();
		if (stringItemProvider != null) stringItemProvider.dispose();
		if (boundedStringItemProvider != null) boundedStringItemProvider.dispose();
		if (charArrayItemProvider != null) charArrayItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (shortItemProvider != null) shortItemProvider.dispose();
		if (longItemProvider != null) longItemProvider.dispose();
		if (longLongItemProvider != null) longLongItemProvider.dispose();
		if (doubleItemProvider != null) doubleItemProvider.dispose();
		if (longDoubleItemProvider != null) longDoubleItemProvider.dispose();
		if (floatItemProvider != null) floatItemProvider.dispose();
		if (fixedItemProvider != null) fixedItemProvider.dispose();
		if (uShortItemProvider != null) uShortItemProvider.dispose();
		if (uLongItemProvider != null) uLongItemProvider.dispose();
		if (uLongLongItemProvider != null) uLongLongItemProvider.dispose();
		if (idlSequenceItemProvider != null) idlSequenceItemProvider.dispose();
		if (idlArrayItemProvider != null) idlArrayItemProvider.dispose();
		if (idlStructItemProvider != null) idlStructItemProvider.dispose();
		if (idlCompositionItemProvider != null) idlCompositionItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (compositionItemProvider != null) compositionItemProvider.dispose();
		if (associationItemProvider != null) associationItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (participantPathNodeItemProvider != null) participantPathNodeItemProvider.dispose();
		if (characteristicPathNodeItemProvider != null) characteristicPathNodeItemProvider.dispose();
		if (queryItemProvider != null) queryItemProvider.dispose();
		if (compositeTemplateItemProvider != null) compositeTemplateItemProvider.dispose();
		if (templateCompositionItemProvider != null) templateCompositionItemProvider.dispose();
		if (templateItemProvider != null) templateItemProvider.dispose();
	}

}
