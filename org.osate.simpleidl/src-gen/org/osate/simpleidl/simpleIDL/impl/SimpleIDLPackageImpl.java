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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.simpleidl.simpleIDL.AnyDeclarator;
import org.osate.simpleidl.simpleIDL.BooleanType;
import org.osate.simpleidl.simpleIDL.BoundedSequence;
import org.osate.simpleidl.simpleIDL.BoundedString;
import org.osate.simpleidl.simpleIDL.BoundedWideString;
import org.osate.simpleidl.simpleIDL.Case;
import org.osate.simpleidl.simpleIDL.CharType;
import org.osate.simpleidl.simpleIDL.Definition;
import org.osate.simpleidl.simpleIDL.DoubleType;
import org.osate.simpleidl.simpleIDL.FixedArraySize;
import org.osate.simpleidl.simpleIDL.FixedPtType;
import org.osate.simpleidl.simpleIDL.FloatType;
import org.osate.simpleidl.simpleIDL.LongDoubleType;
import org.osate.simpleidl.simpleIDL.Member;
import org.osate.simpleidl.simpleIDL.OctetType;
import org.osate.simpleidl.simpleIDL.ReferencedType;
import org.osate.simpleidl.simpleIDL.SignedLongInt;
import org.osate.simpleidl.simpleIDL.SignedLongLongInt;
import org.osate.simpleidl.simpleIDL.SignedShortInt;
import org.osate.simpleidl.simpleIDL.SimpleIDLFactory;
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage;
import org.osate.simpleidl.simpleIDL.SimpleTypeSpec;
import org.osate.simpleidl.simpleIDL.Specification;
import org.osate.simpleidl.simpleIDL.Struct;
import org.osate.simpleidl.simpleIDL.StructForward;
import org.osate.simpleidl.simpleIDL.Type;
import org.osate.simpleidl.simpleIDL.Typedef;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleIDLPackageImpl extends EPackageImpl implements SimpleIDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixedArraySizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTypeSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structForwardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boundedSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unboundedSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boundedStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unboundedStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boundedWideStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unboundedWideStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixedPtTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedShortIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedLongIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedLongLongIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsignedShortIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsignedLongIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsignedLongLongIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longDoubleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wideCharTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass octetTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencedTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.osate.simpleidl.simpleIDL.SimpleIDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleIDLPackageImpl()
  {
    super(eNS_URI, SimpleIDLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link SimpleIDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleIDLPackage init()
  {
    if (isInited) return (SimpleIDLPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleIDLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSimpleIDLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SimpleIDLPackageImpl theSimpleIDLPackage = registeredSimpleIDLPackage instanceof SimpleIDLPackageImpl ? (SimpleIDLPackageImpl)registeredSimpleIDLPackage : new SimpleIDLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theSimpleIDLPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleIDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleIDLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimpleIDLPackage.eNS_URI, theSimpleIDLPackage);
    return theSimpleIDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpecification()
  {
    return specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecification_Definitions()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMember()
  {
    return memberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMember_Type()
  {
    return (EReference)memberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMember_Name()
  {
    return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCase_Labels()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCase_Type()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCase_Name()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAnyDeclarator()
  {
    return anyDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAnyDeclarator_Name()
  {
    return (EAttribute)anyDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAnyDeclarator_ArraySize()
  {
    return (EReference)anyDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFixedArraySize()
  {
    return fixedArraySizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFixedArraySize_Size()
  {
    return (EAttribute)fixedArraySizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSimpleTypeSpec()
  {
    return simpleTypeSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModule_Definitions()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStruct()
  {
    return structEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStruct_Name()
  {
    return (EAttribute)structEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStruct_Members()
  {
    return (EReference)structEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStructForward()
  {
    return structForwardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStructForward_Struct()
  {
    return (EReference)structForwardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnion()
  {
    return unionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnion_Name()
  {
    return (EAttribute)unionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnion_Cases()
  {
    return (EReference)unionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnum_Name()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnum_Literals()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypedef()
  {
    return typedefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTypedef_Type()
  {
    return (EReference)typedefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTypedef_Names()
  {
    return (EReference)typedefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBoundedSequence()
  {
    return boundedSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBoundedSequence_Type()
  {
    return (EReference)boundedSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBoundedSequence_Size()
  {
    return (EAttribute)boundedSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnboundedSequence()
  {
    return unboundedSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnboundedSequence_Type()
  {
    return (EReference)unboundedSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBoundedString()
  {
    return boundedStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBoundedString_Size()
  {
    return (EAttribute)boundedStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnboundedString()
  {
    return unboundedStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBoundedWideString()
  {
    return boundedWideStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBoundedWideString_Size()
  {
    return (EAttribute)boundedWideStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnboundedWideString()
  {
    return unboundedWideStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFixedPtType()
  {
    return fixedPtTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFixedPtType_TotalDigits()
  {
    return (EAttribute)fixedPtTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFixedPtType_FractionalDigits()
  {
    return (EAttribute)fixedPtTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSignedShortInt()
  {
    return signedShortIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSignedLongInt()
  {
    return signedLongIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSignedLongLongInt()
  {
    return signedLongLongIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnsignedShortInt()
  {
    return unsignedShortIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnsignedLongInt()
  {
    return unsignedLongIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnsignedLongLongInt()
  {
    return unsignedLongLongIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFloatType()
  {
    return floatTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDoubleType()
  {
    return doubleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLongDoubleType()
  {
    return longDoubleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharType()
  {
    return charTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWideCharType()
  {
    return wideCharTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBooleanType()
  {
    return booleanTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOctetType()
  {
    return octetTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReferencedType()
  {
    return referencedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getReferencedType_Type()
  {
    return (EReference)referencedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleIDLFactory getSimpleIDLFactory()
  {
    return (SimpleIDLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    specificationEClass = createEClass(SPECIFICATION);
    createEReference(specificationEClass, SPECIFICATION__DEFINITIONS);

    definitionEClass = createEClass(DEFINITION);

    memberEClass = createEClass(MEMBER);
    createEReference(memberEClass, MEMBER__TYPE);
    createEAttribute(memberEClass, MEMBER__NAME);

    caseEClass = createEClass(CASE);
    createEAttribute(caseEClass, CASE__LABELS);
    createEReference(caseEClass, CASE__TYPE);
    createEAttribute(caseEClass, CASE__NAME);

    anyDeclaratorEClass = createEClass(ANY_DECLARATOR);
    createEAttribute(anyDeclaratorEClass, ANY_DECLARATOR__NAME);
    createEReference(anyDeclaratorEClass, ANY_DECLARATOR__ARRAY_SIZE);

    fixedArraySizeEClass = createEClass(FIXED_ARRAY_SIZE);
    createEAttribute(fixedArraySizeEClass, FIXED_ARRAY_SIZE__SIZE);

    typeEClass = createEClass(TYPE);

    simpleTypeSpecEClass = createEClass(SIMPLE_TYPE_SPEC);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__DEFINITIONS);

    structEClass = createEClass(STRUCT);
    createEAttribute(structEClass, STRUCT__NAME);
    createEReference(structEClass, STRUCT__MEMBERS);

    structForwardEClass = createEClass(STRUCT_FORWARD);
    createEReference(structForwardEClass, STRUCT_FORWARD__STRUCT);

    unionEClass = createEClass(UNION);
    createEAttribute(unionEClass, UNION__NAME);
    createEReference(unionEClass, UNION__CASES);

    enumEClass = createEClass(ENUM);
    createEAttribute(enumEClass, ENUM__NAME);
    createEAttribute(enumEClass, ENUM__LITERALS);

    typedefEClass = createEClass(TYPEDEF);
    createEReference(typedefEClass, TYPEDEF__TYPE);
    createEReference(typedefEClass, TYPEDEF__NAMES);

    boundedSequenceEClass = createEClass(BOUNDED_SEQUENCE);
    createEReference(boundedSequenceEClass, BOUNDED_SEQUENCE__TYPE);
    createEAttribute(boundedSequenceEClass, BOUNDED_SEQUENCE__SIZE);

    unboundedSequenceEClass = createEClass(UNBOUNDED_SEQUENCE);
    createEReference(unboundedSequenceEClass, UNBOUNDED_SEQUENCE__TYPE);

    boundedStringEClass = createEClass(BOUNDED_STRING);
    createEAttribute(boundedStringEClass, BOUNDED_STRING__SIZE);

    unboundedStringEClass = createEClass(UNBOUNDED_STRING);

    boundedWideStringEClass = createEClass(BOUNDED_WIDE_STRING);
    createEAttribute(boundedWideStringEClass, BOUNDED_WIDE_STRING__SIZE);

    unboundedWideStringEClass = createEClass(UNBOUNDED_WIDE_STRING);

    fixedPtTypeEClass = createEClass(FIXED_PT_TYPE);
    createEAttribute(fixedPtTypeEClass, FIXED_PT_TYPE__TOTAL_DIGITS);
    createEAttribute(fixedPtTypeEClass, FIXED_PT_TYPE__FRACTIONAL_DIGITS);

    signedShortIntEClass = createEClass(SIGNED_SHORT_INT);

    signedLongIntEClass = createEClass(SIGNED_LONG_INT);

    signedLongLongIntEClass = createEClass(SIGNED_LONG_LONG_INT);

    unsignedShortIntEClass = createEClass(UNSIGNED_SHORT_INT);

    unsignedLongIntEClass = createEClass(UNSIGNED_LONG_INT);

    unsignedLongLongIntEClass = createEClass(UNSIGNED_LONG_LONG_INT);

    floatTypeEClass = createEClass(FLOAT_TYPE);

    doubleTypeEClass = createEClass(DOUBLE_TYPE);

    longDoubleTypeEClass = createEClass(LONG_DOUBLE_TYPE);

    charTypeEClass = createEClass(CHAR_TYPE);

    wideCharTypeEClass = createEClass(WIDE_CHAR_TYPE);

    booleanTypeEClass = createEClass(BOOLEAN_TYPE);

    octetTypeEClass = createEClass(OCTET_TYPE);

    referencedTypeEClass = createEClass(REFERENCED_TYPE);
    createEReference(referencedTypeEClass, REFERENCED_TYPE__TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    simpleTypeSpecEClass.getESuperTypes().add(this.getType());
    moduleEClass.getESuperTypes().add(this.getDefinition());
    structEClass.getESuperTypes().add(this.getDefinition());
    structForwardEClass.getESuperTypes().add(this.getDefinition());
    unionEClass.getESuperTypes().add(this.getDefinition());
    enumEClass.getESuperTypes().add(this.getDefinition());
    typedefEClass.getESuperTypes().add(this.getDefinition());
    boundedSequenceEClass.getESuperTypes().add(this.getType());
    unboundedSequenceEClass.getESuperTypes().add(this.getType());
    boundedStringEClass.getESuperTypes().add(this.getType());
    unboundedStringEClass.getESuperTypes().add(this.getType());
    boundedWideStringEClass.getESuperTypes().add(this.getType());
    unboundedWideStringEClass.getESuperTypes().add(this.getType());
    fixedPtTypeEClass.getESuperTypes().add(this.getType());
    signedShortIntEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    signedLongIntEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    signedLongLongIntEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    unsignedShortIntEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    unsignedLongIntEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    unsignedLongLongIntEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    floatTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    doubleTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    longDoubleTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    charTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    wideCharTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    booleanTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    octetTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());
    referencedTypeEClass.getESuperTypes().add(this.getSimpleTypeSpec());

    // Initialize classes and features; add operations and parameters
    initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpecification_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMember_Type(), this.getSimpleTypeSpec(), null, "type", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCase_Labels(), ecorePackage.getEInt(), "labels", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_Type(), this.getSimpleTypeSpec(), null, "type", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyDeclaratorEClass, AnyDeclarator.class, "AnyDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnyDeclarator_Name(), ecorePackage.getEString(), "name", null, 0, 1, AnyDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnyDeclarator_ArraySize(), this.getFixedArraySize(), null, "arraySize", null, 0, 1, AnyDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixedArraySizeEClass, FixedArraySize.class, "FixedArraySize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFixedArraySize_Size(), ecorePackage.getEInt(), "size", null, 0, 1, FixedArraySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleTypeSpecEClass, SimpleTypeSpec.class, "SimpleTypeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moduleEClass, org.osate.simpleidl.simpleIDL.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.osate.simpleidl.simpleIDL.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, org.osate.simpleidl.simpleIDL.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStruct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Members(), this.getMember(), null, "members", null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structForwardEClass, StructForward.class, "StructForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructForward_Struct(), this.getStruct(), null, "struct", null, 0, 1, StructForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnion_Cases(), this.getCase(), null, "cases", null, 0, -1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, org.osate.simpleidl.simpleIDL.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.osate.simpleidl.simpleIDL.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnum_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, org.osate.simpleidl.simpleIDL.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedefEClass, Typedef.class, "Typedef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedef_Type(), this.getType(), null, "type", null, 0, 1, Typedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypedef_Names(), this.getAnyDeclarator(), null, "names", null, 0, -1, Typedef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boundedSequenceEClass, BoundedSequence.class, "BoundedSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoundedSequence_Type(), this.getSimpleTypeSpec(), null, "type", null, 0, 1, BoundedSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoundedSequence_Size(), ecorePackage.getEInt(), "size", null, 0, 1, BoundedSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unboundedSequenceEClass, UnboundedSequence.class, "UnboundedSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnboundedSequence_Type(), this.getSimpleTypeSpec(), null, "type", null, 0, 1, UnboundedSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boundedStringEClass, BoundedString.class, "BoundedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoundedString_Size(), ecorePackage.getEInt(), "size", null, 0, 1, BoundedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unboundedStringEClass, UnboundedString.class, "UnboundedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boundedWideStringEClass, BoundedWideString.class, "BoundedWideString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoundedWideString_Size(), ecorePackage.getEInt(), "size", null, 0, 1, BoundedWideString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unboundedWideStringEClass, UnboundedWideString.class, "UnboundedWideString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fixedPtTypeEClass, FixedPtType.class, "FixedPtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFixedPtType_TotalDigits(), ecorePackage.getEInt(), "totalDigits", null, 0, 1, FixedPtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFixedPtType_FractionalDigits(), ecorePackage.getEInt(), "fractionalDigits", null, 0, 1, FixedPtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signedShortIntEClass, SignedShortInt.class, "SignedShortInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signedLongIntEClass, SignedLongInt.class, "SignedLongInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signedLongLongIntEClass, SignedLongLongInt.class, "SignedLongLongInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unsignedShortIntEClass, UnsignedShortInt.class, "UnsignedShortInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unsignedLongIntEClass, UnsignedLongInt.class, "UnsignedLongInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unsignedLongLongIntEClass, UnsignedLongLongInt.class, "UnsignedLongLongInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longDoubleTypeEClass, LongDoubleType.class, "LongDoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(charTypeEClass, CharType.class, "CharType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wideCharTypeEClass, WideCharType.class, "WideCharType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(octetTypeEClass, OctetType.class, "OctetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referencedTypeEClass, ReferencedType.class, "ReferencedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferencedType_Type(), this.getDefinition(), null, "type", null, 0, 1, ReferencedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimpleIDLPackageImpl
