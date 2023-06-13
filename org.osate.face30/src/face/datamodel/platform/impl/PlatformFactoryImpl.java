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
package face.datamodel.platform.impl;

import face.datamodel.platform.Association;
import face.datamodel.platform.BoundedString;
import face.datamodel.platform.Char;
import face.datamodel.platform.CharArray;
import face.datamodel.platform.CharacteristicPathNode;
import face.datamodel.platform.CompositeTemplate;
import face.datamodel.platform.Composition;
import face.datamodel.platform.Entity;
import face.datamodel.platform.Enumeration;
import face.datamodel.platform.Fixed;
import face.datamodel.platform.IDLArray;
import face.datamodel.platform.IDLComposition;
import face.datamodel.platform.IDLSequence;
import face.datamodel.platform.IDLStruct;
import face.datamodel.platform.LongDouble;
import face.datamodel.platform.LongLong;
import face.datamodel.platform.Octet;
import face.datamodel.platform.Participant;
import face.datamodel.platform.ParticipantPathNode;
import face.datamodel.platform.PlatformFactory;
import face.datamodel.platform.PlatformPackage;
import face.datamodel.platform.Query;
import face.datamodel.platform.Template;
import face.datamodel.platform.TemplateComposition;
import face.datamodel.platform.ULong;
import face.datamodel.platform.ULongLong;
import face.datamodel.platform.UShort;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case PlatformPackage.IDL_SEQUENCE: return createIDLSequence();
			case PlatformPackage.IDL_ARRAY: return createIDLArray();
			case PlatformPackage.IDL_STRUCT: return createIDLStruct();
			case PlatformPackage.IDL_COMPOSITION: return createIDLComposition();
			case PlatformPackage.ENTITY: return createEntity();
			case PlatformPackage.COMPOSITION: return createComposition();
			case PlatformPackage.ASSOCIATION: return createAssociation();
			case PlatformPackage.PARTICIPANT: return createParticipant();
			case PlatformPackage.PARTICIPANT_PATH_NODE: return createParticipantPathNode();
			case PlatformPackage.CHARACTERISTIC_PATH_NODE: return createCharacteristicPathNode();
			case PlatformPackage.QUERY: return createQuery();
			case PlatformPackage.COMPOSITE_TEMPLATE: return createCompositeTemplate();
			case PlatformPackage.TEMPLATE_COMPOSITION: return createTemplateComposition();
			case PlatformPackage.TEMPLATE: return createTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.platform.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Octet createOctet() {
		OctetImpl octet = new OctetImpl();
		return octet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.platform.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedString createBoundedString() {
		BoundedStringImpl boundedString = new BoundedStringImpl();
		return boundedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharArray createCharArray() {
		CharArrayImpl charArray = new CharArrayImpl();
		return charArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.platform.Short createShort() {
		ShortImpl short_ = new ShortImpl();
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.platform.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongLong createLongLong() {
		LongLongImpl longLong = new LongLongImpl();
		return longLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.platform.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongDouble createLongDouble() {
		LongDoubleImpl longDouble = new LongDoubleImpl();
		return longDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.platform.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixed createFixed() {
		FixedImpl fixed = new FixedImpl();
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UShort createUShort() {
		UShortImpl uShort = new UShortImpl();
		return uShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ULong createULong() {
		ULongImpl uLong = new ULongImpl();
		return uLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ULongLong createULongLong() {
		ULongLongImpl uLongLong = new ULongLongImpl();
		return uLongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDLSequence createIDLSequence() {
		IDLSequenceImpl idlSequence = new IDLSequenceImpl();
		return idlSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDLArray createIDLArray() {
		IDLArrayImpl idlArray = new IDLArrayImpl();
		return idlArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDLStruct createIDLStruct() {
		IDLStructImpl idlStruct = new IDLStructImpl();
		return idlStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDLComposition createIDLComposition() {
		IDLCompositionImpl idlComposition = new IDLCompositionImpl();
		return idlComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantPathNode createParticipantPathNode() {
		ParticipantPathNodeImpl participantPathNode = new ParticipantPathNodeImpl();
		return participantPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicPathNode createCharacteristicPathNode() {
		CharacteristicPathNodeImpl characteristicPathNode = new CharacteristicPathNodeImpl();
		return characteristicPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTemplate createCompositeTemplate() {
		CompositeTemplateImpl compositeTemplate = new CompositeTemplateImpl();
		return compositeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateComposition createTemplateComposition() {
		TemplateCompositionImpl templateComposition = new TemplateCompositionImpl();
		return templateComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
