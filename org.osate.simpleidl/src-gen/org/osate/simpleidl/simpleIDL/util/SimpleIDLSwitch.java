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
package org.osate.simpleidl.simpleIDL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.simpleidl.simpleIDL.ArrayType;
import org.osate.simpleidl.simpleIDL.BooleanType;
import org.osate.simpleidl.simpleIDL.BoundedSequence;
import org.osate.simpleidl.simpleIDL.BoundedString;
import org.osate.simpleidl.simpleIDL.BoundedWideString;
import org.osate.simpleidl.simpleIDL.Case;
import org.osate.simpleidl.simpleIDL.CharType;
import org.osate.simpleidl.simpleIDL.Definition;
import org.osate.simpleidl.simpleIDL.DoubleType;
import org.osate.simpleidl.simpleIDL.FixedPtType;
import org.osate.simpleidl.simpleIDL.FloatType;
import org.osate.simpleidl.simpleIDL.LongDoubleType;
import org.osate.simpleidl.simpleIDL.Member;
import org.osate.simpleidl.simpleIDL.NamedDefinition;
import org.osate.simpleidl.simpleIDL.OctetType;
import org.osate.simpleidl.simpleIDL.ReferencedType;
import org.osate.simpleidl.simpleIDL.SignedLongInt;
import org.osate.simpleidl.simpleIDL.SignedLongLongInt;
import org.osate.simpleidl.simpleIDL.SignedShortInt;
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage;
import org.osate.simpleidl.simpleIDL.Specification;
import org.osate.simpleidl.simpleIDL.Struct;
import org.osate.simpleidl.simpleIDL.StructForward;
import org.osate.simpleidl.simpleIDL.UnboundedSequence;
import org.osate.simpleidl.simpleIDL.UnboundedString;
import org.osate.simpleidl.simpleIDL.UnboundedWideString;
import org.osate.simpleidl.simpleIDL.Union;
import org.osate.simpleidl.simpleIDL.UnsignedLongInt;
import org.osate.simpleidl.simpleIDL.UnsignedLongLongInt;
import org.osate.simpleidl.simpleIDL.UnsignedShortInt;
import org.osate.simpleidl.simpleIDL.WideCharType;

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
 * @see org.osate.simpleidl.simpleIDL.SimpleIDLPackage
 * @generated
 */
public class SimpleIDLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimpleIDLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleIDLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SimpleIDLPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SimpleIDLPackage.SPECIFICATION:
      {
        Specification specification = (Specification)theEObject;
        T result = caseSpecification(specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.NAMED_DEFINITION:
      {
        NamedDefinition namedDefinition = (NamedDefinition)theEObject;
        T result = caseNamedDefinition(namedDefinition);
        if (result == null) result = caseDefinition(namedDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.STRUCT_FORWARD:
      {
        StructForward structForward = (StructForward)theEObject;
        T result = caseStructForward(structForward);
        if (result == null) result = caseDefinition(structForward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.MODULE:
      {
        org.osate.simpleidl.simpleIDL.Module module = (org.osate.simpleidl.simpleIDL.Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = caseNamedDefinition(module);
        if (result == null) result = caseDefinition(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.STRUCT:
      {
        Struct struct = (Struct)theEObject;
        T result = caseStruct(struct);
        if (result == null) result = caseNamedDefinition(struct);
        if (result == null) result = caseDefinition(struct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.UNION:
      {
        Union union = (Union)theEObject;
        T result = caseUnion(union);
        if (result == null) result = caseNamedDefinition(union);
        if (result == null) result = caseDefinition(union);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.ENUM:
      {
        org.osate.simpleidl.simpleIDL.Enum enum_ = (org.osate.simpleidl.simpleIDL.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = caseNamedDefinition(enum_);
        if (result == null) result = caseDefinition(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.ARRAY_TYPE:
      {
        ArrayType arrayType = (ArrayType)theEObject;
        T result = caseArrayType(arrayType);
        if (result == null) result = caseNamedDefinition(arrayType);
        if (result == null) result = caseDefinition(arrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.SIGNED_SHORT_INT:
      {
        SignedShortInt signedShortInt = (SignedShortInt)theEObject;
        T result = caseSignedShortInt(signedShortInt);
        if (result == null) result = caseNamedDefinition(signedShortInt);
        if (result == null) result = caseDefinition(signedShortInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.SIGNED_LONG_INT:
      {
        SignedLongInt signedLongInt = (SignedLongInt)theEObject;
        T result = caseSignedLongInt(signedLongInt);
        if (result == null) result = caseNamedDefinition(signedLongInt);
        if (result == null) result = caseDefinition(signedLongInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.SIGNED_LONG_LONG_INT:
      {
        SignedLongLongInt signedLongLongInt = (SignedLongLongInt)theEObject;
        T result = caseSignedLongLongInt(signedLongLongInt);
        if (result == null) result = caseNamedDefinition(signedLongLongInt);
        if (result == null) result = caseDefinition(signedLongLongInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.UNSIGNED_SHORT_INT:
      {
        UnsignedShortInt unsignedShortInt = (UnsignedShortInt)theEObject;
        T result = caseUnsignedShortInt(unsignedShortInt);
        if (result == null) result = caseNamedDefinition(unsignedShortInt);
        if (result == null) result = caseDefinition(unsignedShortInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.UNSIGNED_LONG_INT:
      {
        UnsignedLongInt unsignedLongInt = (UnsignedLongInt)theEObject;
        T result = caseUnsignedLongInt(unsignedLongInt);
        if (result == null) result = caseNamedDefinition(unsignedLongInt);
        if (result == null) result = caseDefinition(unsignedLongInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.UNSIGNED_LONG_LONG_INT:
      {
        UnsignedLongLongInt unsignedLongLongInt = (UnsignedLongLongInt)theEObject;
        T result = caseUnsignedLongLongInt(unsignedLongLongInt);
        if (result == null) result = caseNamedDefinition(unsignedLongLongInt);
        if (result == null) result = caseDefinition(unsignedLongLongInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.FLOAT_TYPE:
      {
        FloatType floatType = (FloatType)theEObject;
        T result = caseFloatType(floatType);
        if (result == null) result = caseNamedDefinition(floatType);
        if (result == null) result = caseDefinition(floatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.DOUBLE_TYPE:
      {
        DoubleType doubleType = (DoubleType)theEObject;
        T result = caseDoubleType(doubleType);
        if (result == null) result = caseNamedDefinition(doubleType);
        if (result == null) result = caseDefinition(doubleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.LONG_DOUBLE_TYPE:
      {
        LongDoubleType longDoubleType = (LongDoubleType)theEObject;
        T result = caseLongDoubleType(longDoubleType);
        if (result == null) result = caseNamedDefinition(longDoubleType);
        if (result == null) result = caseDefinition(longDoubleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.CHAR_TYPE:
      {
        CharType charType = (CharType)theEObject;
        T result = caseCharType(charType);
        if (result == null) result = caseNamedDefinition(charType);
        if (result == null) result = caseDefinition(charType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.WIDE_CHAR_TYPE:
      {
        WideCharType wideCharType = (WideCharType)theEObject;
        T result = caseWideCharType(wideCharType);
        if (result == null) result = caseNamedDefinition(wideCharType);
        if (result == null) result = caseDefinition(wideCharType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.BOOLEAN_TYPE:
      {
        BooleanType booleanType = (BooleanType)theEObject;
        T result = caseBooleanType(booleanType);
        if (result == null) result = caseNamedDefinition(booleanType);
        if (result == null) result = caseDefinition(booleanType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.OCTET_TYPE:
      {
        OctetType octetType = (OctetType)theEObject;
        T result = caseOctetType(octetType);
        if (result == null) result = caseNamedDefinition(octetType);
        if (result == null) result = caseDefinition(octetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.REFERENCED_TYPE:
      {
        ReferencedType referencedType = (ReferencedType)theEObject;
        T result = caseReferencedType(referencedType);
        if (result == null) result = caseNamedDefinition(referencedType);
        if (result == null) result = caseDefinition(referencedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.BOUNDED_SEQUENCE:
      {
        BoundedSequence boundedSequence = (BoundedSequence)theEObject;
        T result = caseBoundedSequence(boundedSequence);
        if (result == null) result = caseNamedDefinition(boundedSequence);
        if (result == null) result = caseDefinition(boundedSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.UNBOUNDED_SEQUENCE:
      {
        UnboundedSequence unboundedSequence = (UnboundedSequence)theEObject;
        T result = caseUnboundedSequence(unboundedSequence);
        if (result == null) result = caseNamedDefinition(unboundedSequence);
        if (result == null) result = caseDefinition(unboundedSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.BOUNDED_STRING:
      {
        BoundedString boundedString = (BoundedString)theEObject;
        T result = caseBoundedString(boundedString);
        if (result == null) result = caseNamedDefinition(boundedString);
        if (result == null) result = caseDefinition(boundedString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.UNBOUNDED_STRING:
      {
        UnboundedString unboundedString = (UnboundedString)theEObject;
        T result = caseUnboundedString(unboundedString);
        if (result == null) result = caseNamedDefinition(unboundedString);
        if (result == null) result = caseDefinition(unboundedString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.BOUNDED_WIDE_STRING:
      {
        BoundedWideString boundedWideString = (BoundedWideString)theEObject;
        T result = caseBoundedWideString(boundedWideString);
        if (result == null) result = caseNamedDefinition(boundedWideString);
        if (result == null) result = caseDefinition(boundedWideString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.UNBOUNDED_WIDE_STRING:
      {
        UnboundedWideString unboundedWideString = (UnboundedWideString)theEObject;
        T result = caseUnboundedWideString(unboundedWideString);
        if (result == null) result = caseNamedDefinition(unboundedWideString);
        if (result == null) result = caseDefinition(unboundedWideString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleIDLPackage.FIXED_PT_TYPE:
      {
        FixedPtType fixedPtType = (FixedPtType)theEObject;
        T result = caseFixedPtType(fixedPtType);
        if (result == null) result = caseNamedDefinition(fixedPtType);
        if (result == null) result = caseDefinition(fixedPtType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecification(Specification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedDefinition(NamedDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Forward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Forward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructForward(StructForward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(org.osate.simpleidl.simpleIDL.Module object)
  {
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
  public T caseStruct(Struct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnion(Union object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(org.osate.simpleidl.simpleIDL.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayType(ArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Short Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Short Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignedShortInt(SignedShortInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Long Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Long Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignedLongInt(SignedLongInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Long Long Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Long Long Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignedLongLongInt(SignedLongLongInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unsigned Short Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unsigned Short Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsignedShortInt(UnsignedShortInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unsigned Long Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unsigned Long Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsignedLongInt(UnsignedLongInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unsigned Long Long Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unsigned Long Long Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsignedLongLongInt(UnsignedLongLongInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatType(FloatType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleType(DoubleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Double Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Double Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongDoubleType(LongDoubleType object)
  {
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
  public T caseCharType(CharType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wide Char Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wide Char Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWideCharType(WideCharType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanType(BooleanType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Octet Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Octet Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOctetType(OctetType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedType(ReferencedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bounded Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bounded Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoundedSequence(BoundedSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unbounded Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unbounded Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnboundedSequence(UnboundedSequence object)
  {
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
  public T caseBoundedString(BoundedString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unbounded String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unbounded String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnboundedString(UnboundedString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bounded Wide String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bounded Wide String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoundedWideString(BoundedWideString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unbounded Wide String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unbounded Wide String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnboundedWideString(UnboundedWideString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fixed Pt Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fixed Pt Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixedPtType(FixedPtType object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SimpleIDLSwitch
