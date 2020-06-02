/**
 * ******************************************************************************
 * FACE Data Model to AADL Translator
 * 
 * Copyright 2018 Carnegie Mellon University. All Rights Reserved.
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
 * DM18-0762
 *  ******************************************************************************
 */
package org.osate.simpleidl.simpleIDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.osate.simpleidl.simpleIDL.SimpleIDLFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleIDLFactoryImpl extends EFactoryImpl implements SimpleIDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimpleIDLFactory init()
  {
    try
    {
      SimpleIDLFactory theSimpleIDLFactory = (SimpleIDLFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleIDLPackage.eNS_URI);
      if (theSimpleIDLFactory != null)
      {
        return theSimpleIDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimpleIDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleIDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimpleIDLPackage.SPECIFICATION: return createSpecification();
      case SimpleIDLPackage.DEFINITION: return createDefinition();
      case SimpleIDLPackage.NAMED_DEFINITION: return createNamedDefinition();
      case SimpleIDLPackage.MEMBER: return createMember();
      case SimpleIDLPackage.CASE: return createCase();
      case SimpleIDLPackage.STRUCT_FORWARD: return createStructForward();
      case SimpleIDLPackage.MODULE: return createModule();
      case SimpleIDLPackage.STRUCT: return createStruct();
      case SimpleIDLPackage.UNION: return createUnion();
      case SimpleIDLPackage.ENUM: return createEnum();
      case SimpleIDLPackage.ARRAY_TYPE: return createArrayType();
      case SimpleIDLPackage.SIGNED_SHORT_INT: return createSignedShortInt();
      case SimpleIDLPackage.SIGNED_LONG_INT: return createSignedLongInt();
      case SimpleIDLPackage.SIGNED_LONG_LONG_INT: return createSignedLongLongInt();
      case SimpleIDLPackage.UNSIGNED_SHORT_INT: return createUnsignedShortInt();
      case SimpleIDLPackage.UNSIGNED_LONG_INT: return createUnsignedLongInt();
      case SimpleIDLPackage.UNSIGNED_LONG_LONG_INT: return createUnsignedLongLongInt();
      case SimpleIDLPackage.FLOAT_TYPE: return createFloatType();
      case SimpleIDLPackage.DOUBLE_TYPE: return createDoubleType();
      case SimpleIDLPackage.LONG_DOUBLE_TYPE: return createLongDoubleType();
      case SimpleIDLPackage.CHAR_TYPE: return createCharType();
      case SimpleIDLPackage.WIDE_CHAR_TYPE: return createWideCharType();
      case SimpleIDLPackage.BOOLEAN_TYPE: return createBooleanType();
      case SimpleIDLPackage.OCTET_TYPE: return createOctetType();
      case SimpleIDLPackage.REFERENCED_TYPE: return createReferencedType();
      case SimpleIDLPackage.BOUNDED_SEQUENCE: return createBoundedSequence();
      case SimpleIDLPackage.UNBOUNDED_SEQUENCE: return createUnboundedSequence();
      case SimpleIDLPackage.BOUNDED_STRING: return createBoundedString();
      case SimpleIDLPackage.UNBOUNDED_STRING: return createUnboundedString();
      case SimpleIDLPackage.BOUNDED_WIDE_STRING: return createBoundedWideString();
      case SimpleIDLPackage.UNBOUNDED_WIDE_STRING: return createUnboundedWideString();
      case SimpleIDLPackage.FIXED_PT_TYPE: return createFixedPtType();
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
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedDefinition createNamedDefinition()
  {
    NamedDefinitionImpl namedDefinition = new NamedDefinitionImpl();
    return namedDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StructForward createStructForward()
  {
    StructForwardImpl structForward = new StructForwardImpl();
    return structForward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.osate.simpleidl.simpleIDL.Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Struct createStruct()
  {
    StructImpl struct = new StructImpl();
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Union createUnion()
  {
    UnionImpl union = new UnionImpl();
    return union;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.osate.simpleidl.simpleIDL.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SignedShortInt createSignedShortInt()
  {
    SignedShortIntImpl signedShortInt = new SignedShortIntImpl();
    return signedShortInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SignedLongInt createSignedLongInt()
  {
    SignedLongIntImpl signedLongInt = new SignedLongIntImpl();
    return signedLongInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SignedLongLongInt createSignedLongLongInt()
  {
    SignedLongLongIntImpl signedLongLongInt = new SignedLongLongIntImpl();
    return signedLongLongInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsignedShortInt createUnsignedShortInt()
  {
    UnsignedShortIntImpl unsignedShortInt = new UnsignedShortIntImpl();
    return unsignedShortInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsignedLongInt createUnsignedLongInt()
  {
    UnsignedLongIntImpl unsignedLongInt = new UnsignedLongIntImpl();
    return unsignedLongInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsignedLongLongInt createUnsignedLongLongInt()
  {
    UnsignedLongLongIntImpl unsignedLongLongInt = new UnsignedLongLongIntImpl();
    return unsignedLongLongInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FloatType createFloatType()
  {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleType createDoubleType()
  {
    DoubleTypeImpl doubleType = new DoubleTypeImpl();
    return doubleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LongDoubleType createLongDoubleType()
  {
    LongDoubleTypeImpl longDoubleType = new LongDoubleTypeImpl();
    return longDoubleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharType createCharType()
  {
    CharTypeImpl charType = new CharTypeImpl();
    return charType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WideCharType createWideCharType()
  {
    WideCharTypeImpl wideCharType = new WideCharTypeImpl();
    return wideCharType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OctetType createOctetType()
  {
    OctetTypeImpl octetType = new OctetTypeImpl();
    return octetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReferencedType createReferencedType()
  {
    ReferencedTypeImpl referencedType = new ReferencedTypeImpl();
    return referencedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoundedSequence createBoundedSequence()
  {
    BoundedSequenceImpl boundedSequence = new BoundedSequenceImpl();
    return boundedSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnboundedSequence createUnboundedSequence()
  {
    UnboundedSequenceImpl unboundedSequence = new UnboundedSequenceImpl();
    return unboundedSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoundedString createBoundedString()
  {
    BoundedStringImpl boundedString = new BoundedStringImpl();
    return boundedString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnboundedString createUnboundedString()
  {
    UnboundedStringImpl unboundedString = new UnboundedStringImpl();
    return unboundedString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoundedWideString createBoundedWideString()
  {
    BoundedWideStringImpl boundedWideString = new BoundedWideStringImpl();
    return boundedWideString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnboundedWideString createUnboundedWideString()
  {
    UnboundedWideStringImpl unboundedWideString = new UnboundedWideStringImpl();
    return unboundedWideString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FixedPtType createFixedPtType()
  {
    FixedPtTypeImpl fixedPtType = new FixedPtTypeImpl();
    return fixedPtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleIDLPackage getSimpleIDLPackage()
  {
    return (SimpleIDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimpleIDLPackage getPackage()
  {
    return SimpleIDLPackage.eINSTANCE;
  }

} //SimpleIDLFactoryImpl
