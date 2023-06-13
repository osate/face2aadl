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
package face.datamodel.platform.util;

import face.datamodel.platform.Association;
import face.datamodel.platform.BoundedString;
import face.datamodel.platform.Char;
import face.datamodel.platform.CharArray;
import face.datamodel.platform.CharType;
import face.datamodel.platform.Characteristic;
import face.datamodel.platform.CharacteristicPathNode;
import face.datamodel.platform.ComposableElement;
import face.datamodel.platform.CompositeTemplate;
import face.datamodel.platform.Composition;
import face.datamodel.platform.Element;
import face.datamodel.platform.Entity;
import face.datamodel.platform.Enumeration;
import face.datamodel.platform.Fixed;
import face.datamodel.platform.IDLArray;
import face.datamodel.platform.IDLBoundedString;
import face.datamodel.platform.IDLCharacterArray;
import face.datamodel.platform.IDLComposition;
import face.datamodel.platform.IDLInteger;
import face.datamodel.platform.IDLNumber;
import face.datamodel.platform.IDLPrimitive;
import face.datamodel.platform.IDLReal;
import face.datamodel.platform.IDLSequence;
import face.datamodel.platform.IDLStruct;
import face.datamodel.platform.IDLType;
import face.datamodel.platform.IDLUnboundedString;
import face.datamodel.platform.IDLUnsignedInteger;
import face.datamodel.platform.LongDouble;
import face.datamodel.platform.LongLong;
import face.datamodel.platform.Octet;
import face.datamodel.platform.Participant;
import face.datamodel.platform.ParticipantPathNode;
import face.datamodel.platform.PathNode;
import face.datamodel.platform.PhysicalDataType;
import face.datamodel.platform.PlatformPackage;
import face.datamodel.platform.Query;
import face.datamodel.platform.StringType;
import face.datamodel.platform.Template;
import face.datamodel.platform.TemplateComposition;
import face.datamodel.platform.ULong;
import face.datamodel.platform.ULongLong;
import face.datamodel.platform.UShort;
import face.datamodel.platform.View;

import face.traceability.TraceableElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see face.datamodel.platform.PlatformPackage
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
				if (result == null) result = caseFace_Element(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPOSABLE_ELEMENT: {
				ComposableElement composableElement = (ComposableElement)theEObject;
				T result = caseComposableElement(composableElement);
				if (result == null) result = caseElement(composableElement);
				if (result == null) result = caseDatamodel_Element(composableElement);
				if (result == null) result = caseFace_Element(composableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PHYSICAL_DATA_TYPE: {
				PhysicalDataType physicalDataType = (PhysicalDataType)theEObject;
				T result = casePhysicalDataType(physicalDataType);
				if (result == null) result = caseComposableElement(physicalDataType);
				if (result == null) result = caseElement(physicalDataType);
				if (result == null) result = caseDatamodel_Element(physicalDataType);
				if (result == null) result = caseFace_Element(physicalDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_TYPE: {
				IDLType idlType = (IDLType)theEObject;
				T result = caseIDLType(idlType);
				if (result == null) result = casePhysicalDataType(idlType);
				if (result == null) result = caseComposableElement(idlType);
				if (result == null) result = caseElement(idlType);
				if (result == null) result = caseDatamodel_Element(idlType);
				if (result == null) result = caseFace_Element(idlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_PRIMITIVE: {
				IDLPrimitive idlPrimitive = (IDLPrimitive)theEObject;
				T result = caseIDLPrimitive(idlPrimitive);
				if (result == null) result = caseIDLType(idlPrimitive);
				if (result == null) result = casePhysicalDataType(idlPrimitive);
				if (result == null) result = caseComposableElement(idlPrimitive);
				if (result == null) result = caseElement(idlPrimitive);
				if (result == null) result = caseDatamodel_Element(idlPrimitive);
				if (result == null) result = caseFace_Element(idlPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BOOLEAN: {
				face.datamodel.platform.Boolean boolean_ = (face.datamodel.platform.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseIDLPrimitive(boolean_);
				if (result == null) result = caseIDLType(boolean_);
				if (result == null) result = casePhysicalDataType(boolean_);
				if (result == null) result = caseComposableElement(boolean_);
				if (result == null) result = caseElement(boolean_);
				if (result == null) result = caseDatamodel_Element(boolean_);
				if (result == null) result = caseFace_Element(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.OCTET: {
				Octet octet = (Octet)theEObject;
				T result = caseOctet(octet);
				if (result == null) result = caseIDLPrimitive(octet);
				if (result == null) result = caseIDLType(octet);
				if (result == null) result = casePhysicalDataType(octet);
				if (result == null) result = caseComposableElement(octet);
				if (result == null) result = caseElement(octet);
				if (result == null) result = caseDatamodel_Element(octet);
				if (result == null) result = caseFace_Element(octet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHAR_TYPE: {
				CharType charType = (CharType)theEObject;
				T result = caseCharType(charType);
				if (result == null) result = caseIDLPrimitive(charType);
				if (result == null) result = caseIDLType(charType);
				if (result == null) result = casePhysicalDataType(charType);
				if (result == null) result = caseComposableElement(charType);
				if (result == null) result = caseElement(charType);
				if (result == null) result = caseDatamodel_Element(charType);
				if (result == null) result = caseFace_Element(charType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = caseCharType(char_);
				if (result == null) result = caseIDLPrimitive(char_);
				if (result == null) result = caseIDLType(char_);
				if (result == null) result = casePhysicalDataType(char_);
				if (result == null) result = caseComposableElement(char_);
				if (result == null) result = caseElement(char_);
				if (result == null) result = caseDatamodel_Element(char_);
				if (result == null) result = caseFace_Element(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = caseIDLPrimitive(stringType);
				if (result == null) result = caseIDLType(stringType);
				if (result == null) result = casePhysicalDataType(stringType);
				if (result == null) result = caseComposableElement(stringType);
				if (result == null) result = caseElement(stringType);
				if (result == null) result = caseDatamodel_Element(stringType);
				if (result == null) result = caseFace_Element(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_UNBOUNDED_STRING: {
				IDLUnboundedString idlUnboundedString = (IDLUnboundedString)theEObject;
				T result = caseIDLUnboundedString(idlUnboundedString);
				if (result == null) result = caseStringType(idlUnboundedString);
				if (result == null) result = caseIDLPrimitive(idlUnboundedString);
				if (result == null) result = caseIDLType(idlUnboundedString);
				if (result == null) result = casePhysicalDataType(idlUnboundedString);
				if (result == null) result = caseComposableElement(idlUnboundedString);
				if (result == null) result = caseElement(idlUnboundedString);
				if (result == null) result = caseDatamodel_Element(idlUnboundedString);
				if (result == null) result = caseFace_Element(idlUnboundedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRING: {
				face.datamodel.platform.String string = (face.datamodel.platform.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseIDLUnboundedString(string);
				if (result == null) result = caseStringType(string);
				if (result == null) result = caseIDLPrimitive(string);
				if (result == null) result = caseIDLType(string);
				if (result == null) result = casePhysicalDataType(string);
				if (result == null) result = caseComposableElement(string);
				if (result == null) result = caseElement(string);
				if (result == null) result = caseDatamodel_Element(string);
				if (result == null) result = caseFace_Element(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_BOUNDED_STRING: {
				IDLBoundedString idlBoundedString = (IDLBoundedString)theEObject;
				T result = caseIDLBoundedString(idlBoundedString);
				if (result == null) result = caseStringType(idlBoundedString);
				if (result == null) result = caseIDLPrimitive(idlBoundedString);
				if (result == null) result = caseIDLType(idlBoundedString);
				if (result == null) result = casePhysicalDataType(idlBoundedString);
				if (result == null) result = caseComposableElement(idlBoundedString);
				if (result == null) result = caseElement(idlBoundedString);
				if (result == null) result = caseDatamodel_Element(idlBoundedString);
				if (result == null) result = caseFace_Element(idlBoundedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BOUNDED_STRING: {
				BoundedString boundedString = (BoundedString)theEObject;
				T result = caseBoundedString(boundedString);
				if (result == null) result = caseIDLBoundedString(boundedString);
				if (result == null) result = caseStringType(boundedString);
				if (result == null) result = caseIDLPrimitive(boundedString);
				if (result == null) result = caseIDLType(boundedString);
				if (result == null) result = casePhysicalDataType(boundedString);
				if (result == null) result = caseComposableElement(boundedString);
				if (result == null) result = caseElement(boundedString);
				if (result == null) result = caseDatamodel_Element(boundedString);
				if (result == null) result = caseFace_Element(boundedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_CHARACTER_ARRAY: {
				IDLCharacterArray idlCharacterArray = (IDLCharacterArray)theEObject;
				T result = caseIDLCharacterArray(idlCharacterArray);
				if (result == null) result = caseStringType(idlCharacterArray);
				if (result == null) result = caseIDLPrimitive(idlCharacterArray);
				if (result == null) result = caseIDLType(idlCharacterArray);
				if (result == null) result = casePhysicalDataType(idlCharacterArray);
				if (result == null) result = caseComposableElement(idlCharacterArray);
				if (result == null) result = caseElement(idlCharacterArray);
				if (result == null) result = caseDatamodel_Element(idlCharacterArray);
				if (result == null) result = caseFace_Element(idlCharacterArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CHAR_ARRAY: {
				CharArray charArray = (CharArray)theEObject;
				T result = caseCharArray(charArray);
				if (result == null) result = caseIDLCharacterArray(charArray);
				if (result == null) result = caseStringType(charArray);
				if (result == null) result = caseIDLPrimitive(charArray);
				if (result == null) result = caseIDLType(charArray);
				if (result == null) result = casePhysicalDataType(charArray);
				if (result == null) result = caseComposableElement(charArray);
				if (result == null) result = caseElement(charArray);
				if (result == null) result = caseDatamodel_Element(charArray);
				if (result == null) result = caseFace_Element(charArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseIDLPrimitive(enumeration);
				if (result == null) result = caseIDLType(enumeration);
				if (result == null) result = casePhysicalDataType(enumeration);
				if (result == null) result = caseComposableElement(enumeration);
				if (result == null) result = caseElement(enumeration);
				if (result == null) result = caseDatamodel_Element(enumeration);
				if (result == null) result = caseFace_Element(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_NUMBER: {
				IDLNumber idlNumber = (IDLNumber)theEObject;
				T result = caseIDLNumber(idlNumber);
				if (result == null) result = caseIDLPrimitive(idlNumber);
				if (result == null) result = caseIDLType(idlNumber);
				if (result == null) result = casePhysicalDataType(idlNumber);
				if (result == null) result = caseComposableElement(idlNumber);
				if (result == null) result = caseElement(idlNumber);
				if (result == null) result = caseDatamodel_Element(idlNumber);
				if (result == null) result = caseFace_Element(idlNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_INTEGER: {
				IDLInteger idlInteger = (IDLInteger)theEObject;
				T result = caseIDLInteger(idlInteger);
				if (result == null) result = caseIDLNumber(idlInteger);
				if (result == null) result = caseIDLPrimitive(idlInteger);
				if (result == null) result = caseIDLType(idlInteger);
				if (result == null) result = casePhysicalDataType(idlInteger);
				if (result == null) result = caseComposableElement(idlInteger);
				if (result == null) result = caseElement(idlInteger);
				if (result == null) result = caseDatamodel_Element(idlInteger);
				if (result == null) result = caseFace_Element(idlInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SHORT: {
				face.datamodel.platform.Short short_ = (face.datamodel.platform.Short)theEObject;
				T result = caseShort(short_);
				if (result == null) result = caseIDLInteger(short_);
				if (result == null) result = caseIDLNumber(short_);
				if (result == null) result = caseIDLPrimitive(short_);
				if (result == null) result = caseIDLType(short_);
				if (result == null) result = casePhysicalDataType(short_);
				if (result == null) result = caseComposableElement(short_);
				if (result == null) result = caseElement(short_);
				if (result == null) result = caseDatamodel_Element(short_);
				if (result == null) result = caseFace_Element(short_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LONG: {
				face.datamodel.platform.Long long_ = (face.datamodel.platform.Long)theEObject;
				T result = caseLong(long_);
				if (result == null) result = caseIDLInteger(long_);
				if (result == null) result = caseIDLNumber(long_);
				if (result == null) result = caseIDLPrimitive(long_);
				if (result == null) result = caseIDLType(long_);
				if (result == null) result = casePhysicalDataType(long_);
				if (result == null) result = caseComposableElement(long_);
				if (result == null) result = caseElement(long_);
				if (result == null) result = caseDatamodel_Element(long_);
				if (result == null) result = caseFace_Element(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LONG_LONG: {
				LongLong longLong = (LongLong)theEObject;
				T result = caseLongLong(longLong);
				if (result == null) result = caseIDLInteger(longLong);
				if (result == null) result = caseIDLNumber(longLong);
				if (result == null) result = caseIDLPrimitive(longLong);
				if (result == null) result = caseIDLType(longLong);
				if (result == null) result = casePhysicalDataType(longLong);
				if (result == null) result = caseComposableElement(longLong);
				if (result == null) result = caseElement(longLong);
				if (result == null) result = caseDatamodel_Element(longLong);
				if (result == null) result = caseFace_Element(longLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_REAL: {
				IDLReal idlReal = (IDLReal)theEObject;
				T result = caseIDLReal(idlReal);
				if (result == null) result = caseIDLNumber(idlReal);
				if (result == null) result = caseIDLPrimitive(idlReal);
				if (result == null) result = caseIDLType(idlReal);
				if (result == null) result = casePhysicalDataType(idlReal);
				if (result == null) result = caseComposableElement(idlReal);
				if (result == null) result = caseElement(idlReal);
				if (result == null) result = caseDatamodel_Element(idlReal);
				if (result == null) result = caseFace_Element(idlReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DOUBLE: {
				face.datamodel.platform.Double double_ = (face.datamodel.platform.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = caseIDLReal(double_);
				if (result == null) result = caseIDLNumber(double_);
				if (result == null) result = caseIDLPrimitive(double_);
				if (result == null) result = caseIDLType(double_);
				if (result == null) result = casePhysicalDataType(double_);
				if (result == null) result = caseComposableElement(double_);
				if (result == null) result = caseElement(double_);
				if (result == null) result = caseDatamodel_Element(double_);
				if (result == null) result = caseFace_Element(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LONG_DOUBLE: {
				LongDouble longDouble = (LongDouble)theEObject;
				T result = caseLongDouble(longDouble);
				if (result == null) result = caseIDLReal(longDouble);
				if (result == null) result = caseIDLNumber(longDouble);
				if (result == null) result = caseIDLPrimitive(longDouble);
				if (result == null) result = caseIDLType(longDouble);
				if (result == null) result = casePhysicalDataType(longDouble);
				if (result == null) result = caseComposableElement(longDouble);
				if (result == null) result = caseElement(longDouble);
				if (result == null) result = caseDatamodel_Element(longDouble);
				if (result == null) result = caseFace_Element(longDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FLOAT: {
				face.datamodel.platform.Float float_ = (face.datamodel.platform.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = caseIDLReal(float_);
				if (result == null) result = caseIDLNumber(float_);
				if (result == null) result = caseIDLPrimitive(float_);
				if (result == null) result = caseIDLType(float_);
				if (result == null) result = casePhysicalDataType(float_);
				if (result == null) result = caseComposableElement(float_);
				if (result == null) result = caseElement(float_);
				if (result == null) result = caseDatamodel_Element(float_);
				if (result == null) result = caseFace_Element(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FIXED: {
				Fixed fixed = (Fixed)theEObject;
				T result = caseFixed(fixed);
				if (result == null) result = caseIDLReal(fixed);
				if (result == null) result = caseIDLNumber(fixed);
				if (result == null) result = caseIDLPrimitive(fixed);
				if (result == null) result = caseIDLType(fixed);
				if (result == null) result = casePhysicalDataType(fixed);
				if (result == null) result = caseComposableElement(fixed);
				if (result == null) result = caseElement(fixed);
				if (result == null) result = caseDatamodel_Element(fixed);
				if (result == null) result = caseFace_Element(fixed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_UNSIGNED_INTEGER: {
				IDLUnsignedInteger idlUnsignedInteger = (IDLUnsignedInteger)theEObject;
				T result = caseIDLUnsignedInteger(idlUnsignedInteger);
				if (result == null) result = caseIDLInteger(idlUnsignedInteger);
				if (result == null) result = caseIDLNumber(idlUnsignedInteger);
				if (result == null) result = caseIDLPrimitive(idlUnsignedInteger);
				if (result == null) result = caseIDLType(idlUnsignedInteger);
				if (result == null) result = casePhysicalDataType(idlUnsignedInteger);
				if (result == null) result = caseComposableElement(idlUnsignedInteger);
				if (result == null) result = caseElement(idlUnsignedInteger);
				if (result == null) result = caseDatamodel_Element(idlUnsignedInteger);
				if (result == null) result = caseFace_Element(idlUnsignedInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.USHORT: {
				UShort uShort = (UShort)theEObject;
				T result = caseUShort(uShort);
				if (result == null) result = caseIDLUnsignedInteger(uShort);
				if (result == null) result = caseIDLInteger(uShort);
				if (result == null) result = caseIDLNumber(uShort);
				if (result == null) result = caseIDLPrimitive(uShort);
				if (result == null) result = caseIDLType(uShort);
				if (result == null) result = casePhysicalDataType(uShort);
				if (result == null) result = caseComposableElement(uShort);
				if (result == null) result = caseElement(uShort);
				if (result == null) result = caseDatamodel_Element(uShort);
				if (result == null) result = caseFace_Element(uShort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ULONG: {
				ULong uLong = (ULong)theEObject;
				T result = caseULong(uLong);
				if (result == null) result = caseIDLUnsignedInteger(uLong);
				if (result == null) result = caseIDLInteger(uLong);
				if (result == null) result = caseIDLNumber(uLong);
				if (result == null) result = caseIDLPrimitive(uLong);
				if (result == null) result = caseIDLType(uLong);
				if (result == null) result = casePhysicalDataType(uLong);
				if (result == null) result = caseComposableElement(uLong);
				if (result == null) result = caseElement(uLong);
				if (result == null) result = caseDatamodel_Element(uLong);
				if (result == null) result = caseFace_Element(uLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ULONG_LONG: {
				ULongLong uLongLong = (ULongLong)theEObject;
				T result = caseULongLong(uLongLong);
				if (result == null) result = caseIDLUnsignedInteger(uLongLong);
				if (result == null) result = caseIDLInteger(uLongLong);
				if (result == null) result = caseIDLNumber(uLongLong);
				if (result == null) result = caseIDLPrimitive(uLongLong);
				if (result == null) result = caseIDLType(uLongLong);
				if (result == null) result = casePhysicalDataType(uLongLong);
				if (result == null) result = caseComposableElement(uLongLong);
				if (result == null) result = caseElement(uLongLong);
				if (result == null) result = caseDatamodel_Element(uLongLong);
				if (result == null) result = caseFace_Element(uLongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_SEQUENCE: {
				IDLSequence idlSequence = (IDLSequence)theEObject;
				T result = caseIDLSequence(idlSequence);
				if (result == null) result = caseIDLPrimitive(idlSequence);
				if (result == null) result = caseIDLType(idlSequence);
				if (result == null) result = casePhysicalDataType(idlSequence);
				if (result == null) result = caseComposableElement(idlSequence);
				if (result == null) result = caseElement(idlSequence);
				if (result == null) result = caseDatamodel_Element(idlSequence);
				if (result == null) result = caseFace_Element(idlSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_ARRAY: {
				IDLArray idlArray = (IDLArray)theEObject;
				T result = caseIDLArray(idlArray);
				if (result == null) result = caseIDLPrimitive(idlArray);
				if (result == null) result = caseIDLType(idlArray);
				if (result == null) result = casePhysicalDataType(idlArray);
				if (result == null) result = caseComposableElement(idlArray);
				if (result == null) result = caseElement(idlArray);
				if (result == null) result = caseDatamodel_Element(idlArray);
				if (result == null) result = caseFace_Element(idlArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_STRUCT: {
				IDLStruct idlStruct = (IDLStruct)theEObject;
				T result = caseIDLStruct(idlStruct);
				if (result == null) result = caseIDLType(idlStruct);
				if (result == null) result = casePhysicalDataType(idlStruct);
				if (result == null) result = caseComposableElement(idlStruct);
				if (result == null) result = caseElement(idlStruct);
				if (result == null) result = caseDatamodel_Element(idlStruct);
				if (result == null) result = caseFace_Element(idlStruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDL_COMPOSITION: {
				IDLComposition idlComposition = (IDLComposition)theEObject;
				T result = caseIDLComposition(idlComposition);
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
				if (result == null) result = caseTraceableElement(entity);
				if (result == null) result = caseElement(entity);
				if (result == null) result = caseDatamodel_Element(entity);
				if (result == null) result = caseFace_Element(entity);
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
				if (result == null) result = caseTraceableElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = caseDatamodel_Element(association);
				if (result == null) result = caseFace_Element(association);
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
				if (result == null) result = caseTraceableElement(view);
				if (result == null) result = caseDatamodel_Element(view);
				if (result == null) result = caseFace_Element(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseElement(query);
				if (result == null) result = caseTraceableElement(query);
				if (result == null) result = caseDatamodel_Element(query);
				if (result == null) result = caseFace_Element(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPOSITE_TEMPLATE: {
				CompositeTemplate compositeTemplate = (CompositeTemplate)theEObject;
				T result = caseCompositeTemplate(compositeTemplate);
				if (result == null) result = caseView(compositeTemplate);
				if (result == null) result = caseElement(compositeTemplate);
				if (result == null) result = caseDatamodel_Element(compositeTemplate);
				if (result == null) result = caseTraceableElement(compositeTemplate);
				if (result == null) result = caseFace_Element(compositeTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.TEMPLATE_COMPOSITION: {
				TemplateComposition templateComposition = (TemplateComposition)theEObject;
				T result = caseTemplateComposition(templateComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = caseView(template);
				if (result == null) result = caseElement(template);
				if (result == null) result = caseTraceableElement(template);
				if (result == null) result = caseDatamodel_Element(template);
				if (result == null) result = caseFace_Element(template);
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
	 * Returns the result of interpreting the object as an instance of '<em>Physical Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalDataType(PhysicalDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLType(IDLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLPrimitive(IDLPrimitive object) {
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
	public T caseBoolean(face.datamodel.platform.Boolean object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IDL Unbounded String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Unbounded String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLUnboundedString(IDLUnboundedString object) {
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
	public T caseString(face.datamodel.platform.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Bounded String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Bounded String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLBoundedString(IDLBoundedString object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IDL Character Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Character Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLCharacterArray(IDLCharacterArray object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IDL Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLNumber(IDLNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLInteger(IDLInteger object) {
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
	public T caseShort(face.datamodel.platform.Short object) {
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
	public T caseLong(face.datamodel.platform.Long object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IDL Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLReal(IDLReal object) {
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
	public T caseDouble(face.datamodel.platform.Double object) {
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
	public T caseFloat(face.datamodel.platform.Float object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IDL Unsigned Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Unsigned Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLUnsignedInteger(IDLUnsignedInteger object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IDL Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLSequence(IDLSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLArray(IDLArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLStruct(IDLStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLComposition(IDLComposition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Composite Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTemplate(CompositeTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateComposition(TemplateComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
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
	public T caseFace_Element(face.Element object) {
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
	public T caseDatamodel_Element(face.datamodel.Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
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
