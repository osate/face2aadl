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
package org.osate.datamodel10.platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.datamodel10.platform.Array;
import org.osate.datamodel10.platform.Association;
import org.osate.datamodel10.platform.BoundedString;
import org.osate.datamodel10.platform.Char;
import org.osate.datamodel10.platform.CharArray;
import org.osate.datamodel10.platform.CharacteristicPathNode;
import org.osate.datamodel10.platform.CompositeQuery;
import org.osate.datamodel10.platform.Composition;
import org.osate.datamodel10.platform.Entity;
import org.osate.datamodel10.platform.Enumeration;
import org.osate.datamodel10.platform.Fixed;
import org.osate.datamodel10.platform.LongDouble;
import org.osate.datamodel10.platform.LongLong;
import org.osate.datamodel10.platform.Octet;
import org.osate.datamodel10.platform.Participant;
import org.osate.datamodel10.platform.ParticipantPathNode;
import org.osate.datamodel10.platform.PlatformFactory;
import org.osate.datamodel10.platform.PlatformPackage;
import org.osate.datamodel10.platform.Query;
import org.osate.datamodel10.platform.QueryComposition;
import org.osate.datamodel10.platform.Sequence;
import org.osate.datamodel10.platform.Struct;
import org.osate.datamodel10.platform.StructMember;
import org.osate.datamodel10.platform.ULong;
import org.osate.datamodel10.platform.ULongLong;
import org.osate.datamodel10.platform.UShort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory(PlatformPackage.eNS_URI);
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatformPackage.BOOLEAN: return createBoolean();
			case PlatformPackage.OCTET: return createOctet();
			case PlatformPackage.CHAR: return createChar();
			case PlatformPackage.STRING: return createString();
			case PlatformPackage.BOUNDED_STRING: return createBoundedString();
			case PlatformPackage.CHAR_ARRAY: return createCharArray();
			case PlatformPackage.ENUMERATION: return createEnumeration();
			case PlatformPackage.SHORT: return createShort();
			case PlatformPackage.LONG: return createLong();
			case PlatformPackage.LONG_LONG: return createLongLong();
			case PlatformPackage.DOUBLE: return createDouble();
			case PlatformPackage.LONG_DOUBLE: return createLongDouble();
			case PlatformPackage.FLOAT: return createFloat();
			case PlatformPackage.FIXED: return createFixed();
			case PlatformPackage.USHORT: return createUShort();
			case PlatformPackage.ULONG: return createULong();
			case PlatformPackage.ULONG_LONG: return createULongLong();
			case PlatformPackage.SEQUENCE: return createSequence();
			case PlatformPackage.ARRAY: return createArray();
			case PlatformPackage.STRUCT: return createStruct();
			case PlatformPackage.STRUCT_MEMBER: return createStructMember();
			case PlatformPackage.ENTITY: return createEntity();
			case PlatformPackage.COMPOSITION: return createComposition();
			case PlatformPackage.ASSOCIATION: return createAssociation();
			case PlatformPackage.PARTICIPANT: return createParticipant();
			case PlatformPackage.PARTICIPANT_PATH_NODE: return createParticipantPathNode();
			case PlatformPackage.CHARACTERISTIC_PATH_NODE: return createCharacteristicPathNode();
			case PlatformPackage.QUERY: return createQuery();
			case PlatformPackage.COMPOSITE_QUERY: return createCompositeQuery();
			case PlatformPackage.QUERY_COMPOSITION: return createQueryComposition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.platform.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Octet createOctet() {
		OctetImpl octet = new OctetImpl();
		return octet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.platform.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedString createBoundedString() {
		BoundedStringImpl boundedString = new BoundedStringImpl();
		return boundedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharArray createCharArray() {
		CharArrayImpl charArray = new CharArrayImpl();
		return charArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.platform.Short createShort() {
		ShortImpl short_ = new ShortImpl();
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.platform.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongLong createLongLong() {
		LongLongImpl longLong = new LongLongImpl();
		return longLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.platform.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongDouble createLongDouble() {
		LongDoubleImpl longDouble = new LongDoubleImpl();
		return longDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.platform.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fixed createFixed() {
		FixedImpl fixed = new FixedImpl();
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UShort createUShort() {
		UShortImpl uShort = new UShortImpl();
		return uShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ULong createULong() {
		ULongImpl uLong = new ULongImpl();
		return uLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ULongLong createULongLong() {
		ULongLongImpl uLongLong = new ULongLongImpl();
		return uLongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructMember createStructMember() {
		StructMemberImpl structMember = new StructMemberImpl();
		return structMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipantPathNode createParticipantPathNode() {
		ParticipantPathNodeImpl participantPathNode = new ParticipantPathNodeImpl();
		return participantPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacteristicPathNode createCharacteristicPathNode() {
		CharacteristicPathNodeImpl characteristicPathNode = new CharacteristicPathNodeImpl();
		return characteristicPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeQuery createCompositeQuery() {
		CompositeQueryImpl compositeQuery = new CompositeQueryImpl();
		return compositeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryComposition createQueryComposition() {
		QueryCompositionImpl queryComposition = new QueryCompositionImpl();
		return queryComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
