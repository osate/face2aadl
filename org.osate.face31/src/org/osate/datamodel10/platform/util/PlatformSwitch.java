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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.datamodel10.platform.PlatformPackage
 * @generated
 */
public class PlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PlatformPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseDatamodel_Element(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPOSABLE_ELEMENT: {
				ComposableElement composableElement = (ComposableElement)theEObject;
				T result = caseComposableElement(composableElement);
				if (result == null) result = caseElement(composableElement);
				if (result == null) result = caseDatamodel_Element(composableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM_DATA_TYPE: {
				PlatformDataType platformDataType = (PlatformDataType)theEObject;
				T result = casePlatformDataType(platformDataType);
				if (result == null) result = caseComposableElement(platformDataType);
				if (result == null) result = caseElement(platformDataType);
				if (result == null) result = caseDatamodel_Element(platformDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PRIMITIVE: {
				Primitive primitive = (Primitive)theEObject;
				T result = casePrimitive(primitive);
				if (result == null) result = casePlatformDataType(primitive);
				if (result == null) result = caseComposableElement(primitive);
				if (result == null) result = caseElement(primitive);
				if (result == null) result = caseDatamodel_Element(primitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BOOLEAN: {
				org.osate.datamodel10.platform.Boolean boolean_ = (org.osate.datamodel10.platform.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = casePrimitive(boolean_);
				if (result == null) result = casePlatformDataType(boolean_);
				if (result == null) result = caseComposableElement(boolean_);
				if (result == null) result = caseElement(boolean_);
				if (result == null) result = caseDatamodel_Element(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.OCTET: {
				Octet octet = (Octet)theEObject;
				T result = caseOctet(octet);
				if (result == null) result = casePrimitive(octet);
				if (result == null) result = casePlatformDataType(octet);
				if (result == null) result = caseComposableElement(octet);
				if (result == null) result = caseElement(octet);
				if (result == null) result = caseDatamodel_Element(octet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHAR_TYPE: {
				CharType charType = (CharType)theEObject;
				T result = caseCharType(charType);
				if (result == null) result = casePrimitive(charType);
				if (result == null) result = casePlatformDataType(charType);
				if (result == null) result = caseComposableElement(charType);
				if (result == null) result = caseElement(charType);
				if (result == null) result = caseDatamodel_Element(charType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = caseCharType(char_);
				if (result == null) result = casePrimitive(char_);
				if (result == null) result = casePlatformDataType(char_);
				if (result == null) result = caseComposableElement(char_);
				if (result == null) result = caseElement(char_);
				if (result == null) result = caseDatamodel_Element(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = casePrimitive(stringType);
				if (result == null) result = casePlatformDataType(stringType);
				if (result == null) result = caseComposableElement(stringType);
				if (result == null) result = caseElement(stringType);
				if (result == null) result = caseDatamodel_Element(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRING: {
				org.osate.datamodel10.platform.String string = (org.osate.datamodel10.platform.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseStringType(string);
				if (result == null) result = casePrimitive(string);
				if (result == null) result = casePlatformDataType(string);
				if (result == null) result = caseComposableElement(string);
				if (result == null) result = caseElement(string);
				if (result == null) result = caseDatamodel_Element(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BOUNDED_STRING: {
				BoundedString boundedString = (BoundedString)theEObject;
				T result = caseBoundedString(boundedString);
				if (result == null) result = caseStringType(boundedString);
				if (result == null) result = casePrimitive(boundedString);
				if (result == null) result = casePlatformDataType(boundedString);
				if (result == null) result = caseComposableElement(boundedString);
				if (result == null) result = caseElement(boundedString);
				if (result == null) result = caseDatamodel_Element(boundedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHAR_ARRAY: {
				CharArray charArray = (CharArray)theEObject;
				T result = caseCharArray(charArray);
				if (result == null) result = caseStringType(charArray);
				if (result == null) result = casePrimitive(charArray);
				if (result == null) result = casePlatformDataType(charArray);
				if (result == null) result = caseComposableElement(charArray);
				if (result == null) result = caseElement(charArray);
				if (result == null) result = caseDatamodel_Element(charArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = casePrimitive(enumeration);
				if (result == null) result = casePlatformDataType(enumeration);
				if (result == null) result = caseComposableElement(enumeration);
				if (result == null) result = caseElement(enumeration);
				if (result == null) result = caseDatamodel_Element(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.NUMBER: {
				org.osate.datamodel10.platform.Number number = (org.osate.datamodel10.platform.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = casePrimitive(number);
				if (result == null) result = casePlatformDataType(number);
				if (result == null) result = caseComposableElement(number);
				if (result == null) result = caseElement(number);
				if (result == null) result = caseDatamodel_Element(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INTEGER: {
				org.osate.datamodel10.platform.Integer integer = (org.osate.datamodel10.platform.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseNumber(integer);
				if (result == null) result = casePrimitive(integer);
				if (result == null) result = casePlatformDataType(integer);
				if (result == null) result = caseComposableElement(integer);
				if (result == null) result = caseElement(integer);
				if (result == null) result = caseDatamodel_Element(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SHORT: {
				org.osate.datamodel10.platform.Short short_ = (org.osate.datamodel10.platform.Short)theEObject;
				T result = caseShort(short_);
				if (result == null) result = caseInteger(short_);
				if (result == null) result = caseNumber(short_);
				if (result == null) result = casePrimitive(short_);
				if (result == null) result = casePlatformDataType(short_);
				if (result == null) result = caseComposableElement(short_);
				if (result == null) result = caseElement(short_);
				if (result == null) result = caseDatamodel_Element(short_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LONG: {
				org.osate.datamodel10.platform.Long long_ = (org.osate.datamodel10.platform.Long)theEObject;
				T result = caseLong(long_);
				if (result == null) result = caseInteger(long_);
				if (result == null) result = caseNumber(long_);
				if (result == null) result = casePrimitive(long_);
				if (result == null) result = casePlatformDataType(long_);
				if (result == null) result = caseComposableElement(long_);
				if (result == null) result = caseElement(long_);
				if (result == null) result = caseDatamodel_Element(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LONG_LONG: {
				LongLong longLong = (LongLong)theEObject;
				T result = caseLongLong(longLong);
				if (result == null) result = caseInteger(longLong);
				if (result == null) result = caseNumber(longLong);
				if (result == null) result = casePrimitive(longLong);
				if (result == null) result = casePlatformDataType(longLong);
				if (result == null) result = caseComposableElement(longLong);
				if (result == null) result = caseElement(longLong);
				if (result == null) result = caseDatamodel_Element(longLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseNumber(real);
				if (result == null) result = casePrimitive(real);
				if (result == null) result = casePlatformDataType(real);
				if (result == null) result = caseComposableElement(real);
				if (result == null) result = caseElement(real);
				if (result == null) result = caseDatamodel_Element(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DOUBLE: {
				org.osate.datamodel10.platform.Double double_ = (org.osate.datamodel10.platform.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = caseReal(double_);
				if (result == null) result = caseNumber(double_);
				if (result == null) result = casePrimitive(double_);
				if (result == null) result = casePlatformDataType(double_);
				if (result == null) result = caseComposableElement(double_);
				if (result == null) result = caseElement(double_);
				if (result == null) result = caseDatamodel_Element(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LONG_DOUBLE: {
				LongDouble longDouble = (LongDouble)theEObject;
				T result = caseLongDouble(longDouble);
				if (result == null) result = caseReal(longDouble);
				if (result == null) result = caseNumber(longDouble);
				if (result == null) result = casePrimitive(longDouble);
				if (result == null) result = casePlatformDataType(longDouble);
				if (result == null) result = caseComposableElement(longDouble);
				if (result == null) result = caseElement(longDouble);
				if (result == null) result = caseDatamodel_Element(longDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FLOAT: {
				org.osate.datamodel10.platform.Float float_ = (org.osate.datamodel10.platform.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = caseReal(float_);
				if (result == null) result = caseNumber(float_);
				if (result == null) result = casePrimitive(float_);
				if (result == null) result = casePlatformDataType(float_);
				if (result == null) result = caseComposableElement(float_);
				if (result == null) result = caseElement(float_);
				if (result == null) result = caseDatamodel_Element(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FIXED: {
				Fixed fixed = (Fixed)theEObject;
				T result = caseFixed(fixed);
				if (result == null) result = caseReal(fixed);
				if (result == null) result = caseNumber(fixed);
				if (result == null) result = casePrimitive(fixed);
				if (result == null) result = casePlatformDataType(fixed);
				if (result == null) result = caseComposableElement(fixed);
				if (result == null) result = caseElement(fixed);
				if (result == null) result = caseDatamodel_Element(fixed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.UNSIGNED_INTEGER: {
				UnsignedInteger unsignedInteger = (UnsignedInteger)theEObject;
				T result = caseUnsignedInteger(unsignedInteger);
				if (result == null) result = caseInteger(unsignedInteger);
				if (result == null) result = caseNumber(unsignedInteger);
				if (result == null) result = casePrimitive(unsignedInteger);
				if (result == null) result = casePlatformDataType(unsignedInteger);
				if (result == null) result = caseComposableElement(unsignedInteger);
				if (result == null) result = caseElement(unsignedInteger);
				if (result == null) result = caseDatamodel_Element(unsignedInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.USHORT: {
				UShort uShort = (UShort)theEObject;
				T result = caseUShort(uShort);
				if (result == null) result = caseUnsignedInteger(uShort);
				if (result == null) result = caseInteger(uShort);
				if (result == null) result = caseNumber(uShort);
				if (result == null) result = casePrimitive(uShort);
				if (result == null) result = casePlatformDataType(uShort);
				if (result == null) result = caseComposableElement(uShort);
				if (result == null) result = caseElement(uShort);
				if (result == null) result = caseDatamodel_Element(uShort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ULONG: {
				ULong uLong = (ULong)theEObject;
				T result = caseULong(uLong);
				if (result == null) result = caseUnsignedInteger(uLong);
				if (result == null) result = caseInteger(uLong);
				if (result == null) result = caseNumber(uLong);
				if (result == null) result = casePrimitive(uLong);
				if (result == null) result = casePlatformDataType(uLong);
				if (result == null) result = caseComposableElement(uLong);
				if (result == null) result = caseElement(uLong);
				if (result == null) result = caseDatamodel_Element(uLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ULONG_LONG: {
				ULongLong uLongLong = (ULongLong)theEObject;
				T result = caseULongLong(uLongLong);
				if (result == null) result = caseUnsignedInteger(uLongLong);
				if (result == null) result = caseInteger(uLongLong);
				if (result == null) result = caseNumber(uLongLong);
				if (result == null) result = casePrimitive(uLongLong);
				if (result == null) result = casePlatformDataType(uLongLong);
				if (result == null) result = caseComposableElement(uLongLong);
				if (result == null) result = caseElement(uLongLong);
				if (result == null) result = caseDatamodel_Element(uLongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = casePrimitive(sequence);
				if (result == null) result = casePlatformDataType(sequence);
				if (result == null) result = caseComposableElement(sequence);
				if (result == null) result = caseElement(sequence);
				if (result == null) result = caseDatamodel_Element(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = casePrimitive(array);
				if (result == null) result = casePlatformDataType(array);
				if (result == null) result = caseComposableElement(array);
				if (result == null) result = caseElement(array);
				if (result == null) result = caseDatamodel_Element(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRUCT: {
				Struct struct = (Struct)theEObject;
				T result = caseStruct(struct);
				if (result == null) result = casePlatformDataType(struct);
				if (result == null) result = caseComposableElement(struct);
				if (result == null) result = caseElement(struct);
				if (result == null) result = caseDatamodel_Element(struct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRUCT_MEMBER: {
				StructMember structMember = (StructMember)theEObject;
				T result = caseStructMember(structMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHARACTERISTIC: {
				Characteristic characteristic = (Characteristic)theEObject;
				T result = caseCharacteristic(characteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseComposableElement(entity);
				if (result == null) result = caseElement(entity);
				if (result == null) result = caseDatamodel_Element(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseCharacteristic(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseEntity(association);
				if (result == null) result = caseComposableElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = caseDatamodel_Element(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseCharacteristic(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PATH_NODE: {
				PathNode pathNode = (PathNode)theEObject;
				T result = casePathNode(pathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PARTICIPANT_PATH_NODE: {
				ParticipantPathNode participantPathNode = (ParticipantPathNode)theEObject;
				T result = caseParticipantPathNode(participantPathNode);
				if (result == null) result = casePathNode(participantPathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHARACTERISTIC_PATH_NODE: {
				CharacteristicPathNode characteristicPathNode = (CharacteristicPathNode)theEObject;
				T result = caseCharacteristicPathNode(characteristicPathNode);
				if (result == null) result = casePathNode(characteristicPathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseElement(view);
				if (result == null) result = caseDatamodel_Element(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseView(query);
				if (result == null) result = caseElement(query);
				if (result == null) result = caseDatamodel_Element(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPOSITE_QUERY: {
				CompositeQuery compositeQuery = (CompositeQuery)theEObject;
				T result = caseCompositeQuery(compositeQuery);
				if (result == null) result = caseView(compositeQuery);
				if (result == null) result = caseElement(compositeQuery);
				if (result == null) result = caseDatamodel_Element(compositeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.QUERY_COMPOSITION: {
				QueryComposition queryComposition = (QueryComposition)theEObject;
				T result = caseQueryComposition(queryComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposableElement(ComposableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformDataType(PlatformDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitive(Primitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.osate.datamodel10.platform.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctet(Octet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharType(CharType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChar(Char object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.osate.datamodel10.platform.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedString(BoundedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharArray(CharArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(org.osate.datamodel10.platform.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.osate.datamodel10.platform.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShort(org.osate.datamodel10.platform.Short object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong(org.osate.datamodel10.platform.Long object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongLong(LongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(org.osate.datamodel10.platform.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongDouble(LongDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(org.osate.datamodel10.platform.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixed(Fixed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedInteger(UnsignedInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UShort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UShort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUShort(UShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ULong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ULong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseULong(ULong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ULong Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ULong Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseULongLong(ULongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStruct(Struct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructMember(StructMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristic(Characteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathNode(PathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantPathNode(ParticipantPathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicPathNode(CharacteristicPathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeQuery(CompositeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryComposition(QueryComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatamodel_Element(org.osate.datamodel10.Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PlatformSwitch
