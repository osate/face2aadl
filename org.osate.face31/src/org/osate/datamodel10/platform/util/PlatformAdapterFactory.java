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
package org.osate.datamodel10.platform.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.datamodel10.platform.Array;
import org.osate.datamodel10.platform.Association;
import org.osate.datamodel10.platform.BoundedString;
import org.osate.datamodel10.platform.Char;
import org.osate.datamodel10.platform.CharArray;
import org.osate.datamodel10.platform.CharType;
import org.osate.datamodel10.platform.Characteristic;
import org.osate.datamodel10.platform.CharacteristicPathNode;
import org.osate.datamodel10.platform.ComposableElement;
import org.osate.datamodel10.platform.CompositeQuery;
import org.osate.datamodel10.platform.Composition;
import org.osate.datamodel10.platform.Element;
import org.osate.datamodel10.platform.Entity;
import org.osate.datamodel10.platform.Enumeration;
import org.osate.datamodel10.platform.Fixed;
import org.osate.datamodel10.platform.LongDouble;
import org.osate.datamodel10.platform.LongLong;
import org.osate.datamodel10.platform.Octet;
import org.osate.datamodel10.platform.Participant;
import org.osate.datamodel10.platform.ParticipantPathNode;
import org.osate.datamodel10.platform.PathNode;
import org.osate.datamodel10.platform.PlatformDataType;
import org.osate.datamodel10.platform.PlatformPackage;
import org.osate.datamodel10.platform.Primitive;
import org.osate.datamodel10.platform.Query;
import org.osate.datamodel10.platform.QueryComposition;
import org.osate.datamodel10.platform.Real;
import org.osate.datamodel10.platform.Sequence;
import org.osate.datamodel10.platform.StringType;
import org.osate.datamodel10.platform.Struct;
import org.osate.datamodel10.platform.StructMember;
import org.osate.datamodel10.platform.ULong;
import org.osate.datamodel10.platform.ULongLong;
import org.osate.datamodel10.platform.UShort;
import org.osate.datamodel10.platform.UnsignedInteger;
import org.osate.datamodel10.platform.View;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.datamodel10.platform.PlatformPackage
 * @generated
 */
public class PlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformSwitch<Adapter> modelSwitch =
		new PlatformSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseComposableElement(ComposableElement object) {
				return createComposableElementAdapter();
			}
			@Override
			public Adapter casePlatformDataType(PlatformDataType object) {
				return createPlatformDataTypeAdapter();
			}
			@Override
			public Adapter casePrimitive(Primitive object) {
				return createPrimitiveAdapter();
			}
			@Override
			public Adapter caseBoolean(org.osate.datamodel10.platform.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseOctet(Octet object) {
				return createOctetAdapter();
			}
			@Override
			public Adapter caseCharType(CharType object) {
				return createCharTypeAdapter();
			}
			@Override
			public Adapter caseChar(Char object) {
				return createCharAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseString(org.osate.datamodel10.platform.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseBoundedString(BoundedString object) {
				return createBoundedStringAdapter();
			}
			@Override
			public Adapter caseCharArray(CharArray object) {
				return createCharArrayAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseNumber(org.osate.datamodel10.platform.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseInteger(org.osate.datamodel10.platform.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseShort(org.osate.datamodel10.platform.Short object) {
				return createShortAdapter();
			}
			@Override
			public Adapter caseLong(org.osate.datamodel10.platform.Long object) {
				return createLongAdapter();
			}
			@Override
			public Adapter caseLongLong(LongLong object) {
				return createLongLongAdapter();
			}
			@Override
			public Adapter caseReal(Real object) {
				return createRealAdapter();
			}
			@Override
			public Adapter caseDouble(org.osate.datamodel10.platform.Double object) {
				return createDoubleAdapter();
			}
			@Override
			public Adapter caseLongDouble(LongDouble object) {
				return createLongDoubleAdapter();
			}
			@Override
			public Adapter caseFloat(org.osate.datamodel10.platform.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseFixed(Fixed object) {
				return createFixedAdapter();
			}
			@Override
			public Adapter caseUnsignedInteger(UnsignedInteger object) {
				return createUnsignedIntegerAdapter();
			}
			@Override
			public Adapter caseUShort(UShort object) {
				return createUShortAdapter();
			}
			@Override
			public Adapter caseULong(ULong object) {
				return createULongAdapter();
			}
			@Override
			public Adapter caseULongLong(ULongLong object) {
				return createULongLongAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseStruct(Struct object) {
				return createStructAdapter();
			}
			@Override
			public Adapter caseStructMember(StructMember object) {
				return createStructMemberAdapter();
			}
			@Override
			public Adapter caseCharacteristic(Characteristic object) {
				return createCharacteristicAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter casePathNode(PathNode object) {
				return createPathNodeAdapter();
			}
			@Override
			public Adapter caseParticipantPathNode(ParticipantPathNode object) {
				return createParticipantPathNodeAdapter();
			}
			@Override
			public Adapter caseCharacteristicPathNode(CharacteristicPathNode object) {
				return createCharacteristicPathNodeAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseCompositeQuery(CompositeQuery object) {
				return createCompositeQueryAdapter();
			}
			@Override
			public Adapter caseQueryComposition(QueryComposition object) {
				return createQueryCompositionAdapter();
			}
			@Override
			public Adapter caseDatamodel_Element(org.osate.datamodel10.Element object) {
				return createDatamodel_ElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.ComposableElement
	 * @generated
	 */
	public Adapter createComposableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.PlatformDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.PlatformDataType
	 * @generated
	 */
	public Adapter createPlatformDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Primitive
	 * @generated
	 */
	public Adapter createPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Octet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Octet
	 * @generated
	 */
	public Adapter createOctetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.CharType
	 * @generated
	 */
	public Adapter createCharTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Char
	 * @generated
	 */
	public Adapter createCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.BoundedString <em>Bounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.BoundedString
	 * @generated
	 */
	public Adapter createBoundedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.CharArray <em>Char Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.CharArray
	 * @generated
	 */
	public Adapter createCharArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Short
	 * @generated
	 */
	public Adapter createShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Long
	 * @generated
	 */
	public Adapter createLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.LongLong <em>Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.LongLong
	 * @generated
	 */
	public Adapter createLongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.LongDouble
	 * @generated
	 */
	public Adapter createLongDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Fixed
	 * @generated
	 */
	public Adapter createFixedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.UnsignedInteger <em>Unsigned Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.UnsignedInteger
	 * @generated
	 */
	public Adapter createUnsignedIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.UShort <em>UShort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.UShort
	 * @generated
	 */
	public Adapter createUShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.ULong <em>ULong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.ULong
	 * @generated
	 */
	public Adapter createULongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.ULongLong <em>ULong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.ULongLong
	 * @generated
	 */
	public Adapter createULongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Struct
	 * @generated
	 */
	public Adapter createStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.StructMember <em>Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.StructMember
	 * @generated
	 */
	public Adapter createStructMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.PathNode
	 * @generated
	 */
	public Adapter createPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.ParticipantPathNode
	 * @generated
	 */
	public Adapter createParticipantPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.CharacteristicPathNode
	 * @generated
	 */
	public Adapter createCharacteristicPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.CompositeQuery <em>Composite Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.CompositeQuery
	 * @generated
	 */
	public Adapter createCompositeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.platform.QueryComposition <em>Query Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.platform.QueryComposition
	 * @generated
	 */
	public Adapter createQueryCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.Element
	 * @generated
	 */
	public Adapter createDatamodel_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlatformAdapterFactory
