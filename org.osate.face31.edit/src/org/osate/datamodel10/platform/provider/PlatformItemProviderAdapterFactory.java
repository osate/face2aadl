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
package org.osate.datamodel10.platform.provider;

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

import org.osate.datamodel10.platform.util.PlatformAdapterFactory;

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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Boolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanItemProvider booleanItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Boolean}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Octet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OctetItemProvider octetItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Octet}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Char} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharItemProvider charItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Char}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.String} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringItemProvider stringItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.String}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.BoundedString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedStringItemProvider boundedStringItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.BoundedString}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.CharArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharArrayItemProvider charArrayItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.CharArray}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Enumeration}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Short} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortItemProvider shortItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Short}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Long} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongItemProvider longItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Long}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.LongLong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongLongItemProvider longLongItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.LongLong}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Double} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleItemProvider doubleItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Double}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.LongDouble} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongDoubleItemProvider longDoubleItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.LongDouble}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Float} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatItemProvider floatItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Float}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Fixed} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedItemProvider fixedItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Fixed}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.UShort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UShortItemProvider uShortItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.UShort}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.ULong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ULongItemProvider uLongItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.ULong}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.ULongLong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ULongLongItemProvider uLongLongItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.ULongLong}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Sequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceItemProvider sequenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceAdapter() {
		if (sequenceItemProvider == null) {
			sequenceItemProvider = new SequenceItemProvider(this);
		}

		return sequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Array} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayItemProvider arrayItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Array}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayAdapter() {
		if (arrayItemProvider == null) {
			arrayItemProvider = new ArrayItemProvider(this);
		}

		return arrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Struct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructItemProvider structItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Struct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructAdapter() {
		if (structItemProvider == null) {
			structItemProvider = new StructItemProvider(this);
		}

		return structItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.StructMember} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructMemberItemProvider structMemberItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.StructMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructMemberAdapter() {
		if (structMemberItemProvider == null) {
			structMemberItemProvider = new StructMemberItemProvider(this);
		}

		return structMemberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Entity}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Composition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionItemProvider compositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Composition}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Association}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Participant}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.ParticipantPathNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantPathNodeItemProvider participantPathNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.ParticipantPathNode}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.CharacteristicPathNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicPathNodeItemProvider characteristicPathNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.CharacteristicPathNode}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.Query} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryItemProvider queryItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.Query}.
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
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.CompositeQuery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeQueryItemProvider compositeQueryItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.CompositeQuery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeQueryAdapter() {
		if (compositeQueryItemProvider == null) {
			compositeQueryItemProvider = new CompositeQueryItemProvider(this);
		}

		return compositeQueryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.platform.QueryComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCompositionItemProvider queryCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.platform.QueryComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryCompositionAdapter() {
		if (queryCompositionItemProvider == null) {
			queryCompositionItemProvider = new QueryCompositionItemProvider(this);
		}

		return queryCompositionItemProvider;
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
		if (sequenceItemProvider != null) sequenceItemProvider.dispose();
		if (arrayItemProvider != null) arrayItemProvider.dispose();
		if (structItemProvider != null) structItemProvider.dispose();
		if (structMemberItemProvider != null) structMemberItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (compositionItemProvider != null) compositionItemProvider.dispose();
		if (associationItemProvider != null) associationItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (participantPathNodeItemProvider != null) participantPathNodeItemProvider.dispose();
		if (characteristicPathNodeItemProvider != null) characteristicPathNodeItemProvider.dispose();
		if (queryItemProvider != null) queryItemProvider.dispose();
		if (compositeQueryItemProvider != null) compositeQueryItemProvider.dispose();
		if (queryCompositionItemProvider != null) queryCompositionItemProvider.dispose();
	}

}