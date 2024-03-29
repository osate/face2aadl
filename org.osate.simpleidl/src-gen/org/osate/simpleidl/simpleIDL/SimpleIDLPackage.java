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
package org.osate.simpleidl.simpleIDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.simpleidl.simpleIDL.SimpleIDLFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleIDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simpleIDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/simpleidl/SimpleIDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simpleIDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleIDLPackage eINSTANCE = org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.SpecificationImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSpecification()
   * @generated
   */
  int SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.DefinitionImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.NamedDefinitionImpl <em>Named Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.NamedDefinitionImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getNamedDefinition()
   * @generated
   */
  int NAMED_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_DEFINITION__NAME = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.MemberImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.CaseImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getCase()
   * @generated
   */
  int CASE = 4;

  /**
   * The feature id for the '<em><b>Labels</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__LABELS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__NAME = 2;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.StructForwardImpl <em>Struct Forward</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.StructForwardImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getStructForward()
   * @generated
   */
  int STRUCT_FORWARD = 5;

  /**
   * The feature id for the '<em><b>Struct</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FORWARD__STRUCT = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct Forward</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FORWARD_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.ModuleImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getModule()
   * @generated
   */
  int MODULE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__DEFINITIONS = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.StructImpl <em>Struct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.StructImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getStruct()
   * @generated
   */
  int STRUCT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__MEMBERS = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.UnionImpl <em>Union</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.UnionImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnion()
   * @generated
   */
  int UNION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__CASES = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Union</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.EnumImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Literals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__LITERALS = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.ArrayTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__TYPE = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__SIZE = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.SignedShortIntImpl <em>Signed Short Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.SignedShortIntImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSignedShortInt()
   * @generated
   */
  int SIGNED_SHORT_INT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_SHORT_INT__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Signed Short Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_SHORT_INT_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.SignedLongIntImpl <em>Signed Long Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.SignedLongIntImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSignedLongInt()
   * @generated
   */
  int SIGNED_LONG_INT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_LONG_INT__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Signed Long Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_LONG_INT_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.SignedLongLongIntImpl <em>Signed Long Long Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.SignedLongLongIntImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSignedLongLongInt()
   * @generated
   */
  int SIGNED_LONG_LONG_INT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_LONG_LONG_INT__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Signed Long Long Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_LONG_LONG_INT_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.UnsignedShortIntImpl <em>Unsigned Short Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.UnsignedShortIntImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnsignedShortInt()
   * @generated
   */
  int UNSIGNED_SHORT_INT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_SHORT_INT__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Unsigned Short Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_SHORT_INT_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.UnsignedLongIntImpl <em>Unsigned Long Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.UnsignedLongIntImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnsignedLongInt()
   * @generated
   */
  int UNSIGNED_LONG_INT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_LONG_INT__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Unsigned Long Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_LONG_INT_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.UnsignedLongLongIntImpl <em>Unsigned Long Long Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.UnsignedLongLongIntImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnsignedLongLongInt()
   * @generated
   */
  int UNSIGNED_LONG_LONG_INT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_LONG_LONG_INT__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Unsigned Long Long Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_LONG_LONG_INT_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.FloatTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.DoubleTypeImpl <em>Double Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.DoubleTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getDoubleType()
   * @generated
   */
  int DOUBLE_TYPE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Double Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.LongDoubleTypeImpl <em>Long Double Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.LongDoubleTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getLongDoubleType()
   * @generated
   */
  int LONG_DOUBLE_TYPE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_DOUBLE_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Long Double Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_DOUBLE_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.CharTypeImpl <em>Char Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.CharTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getCharType()
   * @generated
   */
  int CHAR_TYPE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Char Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.WideCharTypeImpl <em>Wide Char Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.WideCharTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getWideCharType()
   * @generated
   */
  int WIDE_CHAR_TYPE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDE_CHAR_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Wide Char Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDE_CHAR_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.BooleanTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.OctetTypeImpl <em>Octet Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.OctetTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getOctetType()
   * @generated
   */
  int OCTET_TYPE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTET_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Octet Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTET_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.ReferencedTypeImpl <em>Referenced Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.ReferencedTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getReferencedType()
   * @generated
   */
  int REFERENCED_TYPE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_TYPE__TYPE = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Referenced Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.BoundedSequenceImpl <em>Bounded Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.BoundedSequenceImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBoundedSequence()
   * @generated
   */
  int BOUNDED_SEQUENCE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_SEQUENCE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_SEQUENCE__TYPE = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_SEQUENCE__SIZE = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bounded Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_SEQUENCE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.UnboundedSequenceImpl <em>Unbounded Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.UnboundedSequenceImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnboundedSequence()
   * @generated
   */
  int UNBOUNDED_SEQUENCE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_SEQUENCE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_SEQUENCE__TYPE = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unbounded Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_SEQUENCE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.BoundedStringImpl <em>Bounded String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.BoundedStringImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBoundedString()
   * @generated
   */
  int BOUNDED_STRING = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_STRING__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_STRING__SIZE = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bounded String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_STRING_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.UnboundedStringImpl <em>Unbounded String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.UnboundedStringImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnboundedString()
   * @generated
   */
  int UNBOUNDED_STRING = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_STRING__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Unbounded String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_STRING_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.BoundedWideStringImpl <em>Bounded Wide String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.BoundedWideStringImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBoundedWideString()
   * @generated
   */
  int BOUNDED_WIDE_STRING = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_WIDE_STRING__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_WIDE_STRING__SIZE = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bounded Wide String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_WIDE_STRING_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.UnboundedWideStringImpl <em>Unbounded Wide String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.UnboundedWideStringImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnboundedWideString()
   * @generated
   */
  int UNBOUNDED_WIDE_STRING = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_WIDE_STRING__NAME = NAMED_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Unbounded Wide String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_WIDE_STRING_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.simpleidl.simpleIDL.impl.FixedPtTypeImpl <em>Fixed Pt Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.simpleidl.simpleIDL.impl.FixedPtTypeImpl
   * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getFixedPtType()
   * @generated
   */
  int FIXED_PT_TYPE = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PT_TYPE__NAME = NAMED_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Total Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PT_TYPE__TOTAL_DIGITS = NAMED_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fractional Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PT_TYPE__FRACTIONAL_DIGITS = NAMED_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fixed Pt Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_PT_TYPE_FEATURE_COUNT = NAMED_DEFINITION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see org.osate.simpleidl.simpleIDL.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.simpleidl.simpleIDL.Specification#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.osate.simpleidl.simpleIDL.Specification#getDefinitions()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Definitions();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.osate.simpleidl.simpleIDL.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.NamedDefinition <em>Named Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Definition</em>'.
   * @see org.osate.simpleidl.simpleIDL.NamedDefinition
   * @generated
   */
  EClass getNamedDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.NamedDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.simpleidl.simpleIDL.NamedDefinition#getName()
   * @see #getNamedDefinition()
   * @generated
   */
  EAttribute getNamedDefinition_Name();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see org.osate.simpleidl.simpleIDL.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the reference '{@link org.osate.simpleidl.simpleIDL.Member#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.Member#getType()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.simpleidl.simpleIDL.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see org.osate.simpleidl.simpleIDL.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.simpleidl.simpleIDL.Case#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Labels</em>'.
   * @see org.osate.simpleidl.simpleIDL.Case#getLabels()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_Labels();

  /**
   * Returns the meta object for the reference '{@link org.osate.simpleidl.simpleIDL.Case#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.Case#getType()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.Case#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.simpleidl.simpleIDL.Case#getName()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_Name();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.StructForward <em>Struct Forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Forward</em>'.
   * @see org.osate.simpleidl.simpleIDL.StructForward
   * @generated
   */
  EClass getStructForward();

  /**
   * Returns the meta object for the reference '{@link org.osate.simpleidl.simpleIDL.StructForward#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Struct</em>'.
   * @see org.osate.simpleidl.simpleIDL.StructForward#getStruct()
   * @see #getStructForward()
   * @generated
   */
  EReference getStructForward_Struct();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.osate.simpleidl.simpleIDL.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.simpleidl.simpleIDL.Module#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.osate.simpleidl.simpleIDL.Module#getDefinitions()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Definitions();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Struct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct</em>'.
   * @see org.osate.simpleidl.simpleIDL.Struct
   * @generated
   */
  EClass getStruct();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.simpleidl.simpleIDL.Struct#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.osate.simpleidl.simpleIDL.Struct#getMembers()
   * @see #getStruct()
   * @generated
   */
  EReference getStruct_Members();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Union <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union</em>'.
   * @see org.osate.simpleidl.simpleIDL.Union
   * @generated
   */
  EClass getUnion();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.simpleidl.simpleIDL.Union#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.osate.simpleidl.simpleIDL.Union#getCases()
   * @see #getUnion()
   * @generated
   */
  EReference getUnion_Cases();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see org.osate.simpleidl.simpleIDL.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.simpleidl.simpleIDL.Enum#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Literals</em>'.
   * @see org.osate.simpleidl.simpleIDL.Enum#getLiterals()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Literals();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the reference '{@link org.osate.simpleidl.simpleIDL.ArrayType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.ArrayType#getType()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_Type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.ArrayType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.osate.simpleidl.simpleIDL.ArrayType#getSize()
   * @see #getArrayType()
   * @generated
   */
  EAttribute getArrayType_Size();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.SignedShortInt <em>Signed Short Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Short Int</em>'.
   * @see org.osate.simpleidl.simpleIDL.SignedShortInt
   * @generated
   */
  EClass getSignedShortInt();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.SignedLongInt <em>Signed Long Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Long Int</em>'.
   * @see org.osate.simpleidl.simpleIDL.SignedLongInt
   * @generated
   */
  EClass getSignedLongInt();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.SignedLongLongInt <em>Signed Long Long Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Long Long Int</em>'.
   * @see org.osate.simpleidl.simpleIDL.SignedLongLongInt
   * @generated
   */
  EClass getSignedLongLongInt();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.UnsignedShortInt <em>Unsigned Short Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsigned Short Int</em>'.
   * @see org.osate.simpleidl.simpleIDL.UnsignedShortInt
   * @generated
   */
  EClass getUnsignedShortInt();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.UnsignedLongInt <em>Unsigned Long Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsigned Long Int</em>'.
   * @see org.osate.simpleidl.simpleIDL.UnsignedLongInt
   * @generated
   */
  EClass getUnsignedLongInt();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.UnsignedLongLongInt <em>Unsigned Long Long Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsigned Long Long Int</em>'.
   * @see org.osate.simpleidl.simpleIDL.UnsignedLongLongInt
   * @generated
   */
  EClass getUnsignedLongLongInt();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.DoubleType <em>Double Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.DoubleType
   * @generated
   */
  EClass getDoubleType();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.LongDoubleType <em>Long Double Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Double Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.LongDoubleType
   * @generated
   */
  EClass getLongDoubleType();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.CharType <em>Char Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.CharType
   * @generated
   */
  EClass getCharType();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.WideCharType <em>Wide Char Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wide Char Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.WideCharType
   * @generated
   */
  EClass getWideCharType();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.OctetType <em>Octet Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Octet Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.OctetType
   * @generated
   */
  EClass getOctetType();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.ReferencedType <em>Referenced Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.ReferencedType
   * @generated
   */
  EClass getReferencedType();

  /**
   * Returns the meta object for the reference '{@link org.osate.simpleidl.simpleIDL.ReferencedType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.ReferencedType#getType()
   * @see #getReferencedType()
   * @generated
   */
  EReference getReferencedType_Type();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.BoundedSequence <em>Bounded Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bounded Sequence</em>'.
   * @see org.osate.simpleidl.simpleIDL.BoundedSequence
   * @generated
   */
  EClass getBoundedSequence();

  /**
   * Returns the meta object for the reference '{@link org.osate.simpleidl.simpleIDL.BoundedSequence#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.BoundedSequence#getType()
   * @see #getBoundedSequence()
   * @generated
   */
  EReference getBoundedSequence_Type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.BoundedSequence#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.osate.simpleidl.simpleIDL.BoundedSequence#getSize()
   * @see #getBoundedSequence()
   * @generated
   */
  EAttribute getBoundedSequence_Size();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.UnboundedSequence <em>Unbounded Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unbounded Sequence</em>'.
   * @see org.osate.simpleidl.simpleIDL.UnboundedSequence
   * @generated
   */
  EClass getUnboundedSequence();

  /**
   * Returns the meta object for the reference '{@link org.osate.simpleidl.simpleIDL.UnboundedSequence#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.UnboundedSequence#getType()
   * @see #getUnboundedSequence()
   * @generated
   */
  EReference getUnboundedSequence_Type();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.BoundedString <em>Bounded String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bounded String</em>'.
   * @see org.osate.simpleidl.simpleIDL.BoundedString
   * @generated
   */
  EClass getBoundedString();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.BoundedString#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.osate.simpleidl.simpleIDL.BoundedString#getSize()
   * @see #getBoundedString()
   * @generated
   */
  EAttribute getBoundedString_Size();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.UnboundedString <em>Unbounded String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unbounded String</em>'.
   * @see org.osate.simpleidl.simpleIDL.UnboundedString
   * @generated
   */
  EClass getUnboundedString();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.BoundedWideString <em>Bounded Wide String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bounded Wide String</em>'.
   * @see org.osate.simpleidl.simpleIDL.BoundedWideString
   * @generated
   */
  EClass getBoundedWideString();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.BoundedWideString#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.osate.simpleidl.simpleIDL.BoundedWideString#getSize()
   * @see #getBoundedWideString()
   * @generated
   */
  EAttribute getBoundedWideString_Size();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.UnboundedWideString <em>Unbounded Wide String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unbounded Wide String</em>'.
   * @see org.osate.simpleidl.simpleIDL.UnboundedWideString
   * @generated
   */
  EClass getUnboundedWideString();

  /**
   * Returns the meta object for class '{@link org.osate.simpleidl.simpleIDL.FixedPtType <em>Fixed Pt Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Pt Type</em>'.
   * @see org.osate.simpleidl.simpleIDL.FixedPtType
   * @generated
   */
  EClass getFixedPtType();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.FixedPtType#getTotalDigits <em>Total Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Total Digits</em>'.
   * @see org.osate.simpleidl.simpleIDL.FixedPtType#getTotalDigits()
   * @see #getFixedPtType()
   * @generated
   */
  EAttribute getFixedPtType_TotalDigits();

  /**
   * Returns the meta object for the attribute '{@link org.osate.simpleidl.simpleIDL.FixedPtType#getFractionalDigits <em>Fractional Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fractional Digits</em>'.
   * @see org.osate.simpleidl.simpleIDL.FixedPtType#getFractionalDigits()
   * @see #getFixedPtType()
   * @generated
   */
  EAttribute getFixedPtType_FractionalDigits();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimpleIDLFactory getSimpleIDLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.SpecificationImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSpecification()
     * @generated
     */
    EClass SPECIFICATION = eINSTANCE.getSpecification();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__DEFINITIONS = eINSTANCE.getSpecification_Definitions();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.DefinitionImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.NamedDefinitionImpl <em>Named Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.NamedDefinitionImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getNamedDefinition()
     * @generated
     */
    EClass NAMED_DEFINITION = eINSTANCE.getNamedDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_DEFINITION__NAME = eINSTANCE.getNamedDefinition_Name();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.MemberImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.CaseImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__LABELS = eINSTANCE.getCase_Labels();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__TYPE = eINSTANCE.getCase_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__NAME = eINSTANCE.getCase_Name();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.StructForwardImpl <em>Struct Forward</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.StructForwardImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getStructForward()
     * @generated
     */
    EClass STRUCT_FORWARD = eINSTANCE.getStructForward();

    /**
     * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_FORWARD__STRUCT = eINSTANCE.getStructForward_Struct();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.ModuleImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__DEFINITIONS = eINSTANCE.getModule_Definitions();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.StructImpl <em>Struct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.StructImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getStruct()
     * @generated
     */
    EClass STRUCT = eINSTANCE.getStruct();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT__MEMBERS = eINSTANCE.getStruct_Members();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.UnionImpl <em>Union</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.UnionImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnion()
     * @generated
     */
    EClass UNION = eINSTANCE.getUnion();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION__CASES = eINSTANCE.getUnion_Cases();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.EnumImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__LITERALS = eINSTANCE.getEnum_Literals();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.ArrayTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__TYPE = eINSTANCE.getArrayType_Type();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_TYPE__SIZE = eINSTANCE.getArrayType_Size();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.SignedShortIntImpl <em>Signed Short Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.SignedShortIntImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSignedShortInt()
     * @generated
     */
    EClass SIGNED_SHORT_INT = eINSTANCE.getSignedShortInt();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.SignedLongIntImpl <em>Signed Long Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.SignedLongIntImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSignedLongInt()
     * @generated
     */
    EClass SIGNED_LONG_INT = eINSTANCE.getSignedLongInt();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.SignedLongLongIntImpl <em>Signed Long Long Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.SignedLongLongIntImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getSignedLongLongInt()
     * @generated
     */
    EClass SIGNED_LONG_LONG_INT = eINSTANCE.getSignedLongLongInt();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.UnsignedShortIntImpl <em>Unsigned Short Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.UnsignedShortIntImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnsignedShortInt()
     * @generated
     */
    EClass UNSIGNED_SHORT_INT = eINSTANCE.getUnsignedShortInt();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.UnsignedLongIntImpl <em>Unsigned Long Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.UnsignedLongIntImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnsignedLongInt()
     * @generated
     */
    EClass UNSIGNED_LONG_INT = eINSTANCE.getUnsignedLongInt();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.UnsignedLongLongIntImpl <em>Unsigned Long Long Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.UnsignedLongLongIntImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnsignedLongLongInt()
     * @generated
     */
    EClass UNSIGNED_LONG_LONG_INT = eINSTANCE.getUnsignedLongLongInt();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.FloatTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.DoubleTypeImpl <em>Double Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.DoubleTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getDoubleType()
     * @generated
     */
    EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.LongDoubleTypeImpl <em>Long Double Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.LongDoubleTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getLongDoubleType()
     * @generated
     */
    EClass LONG_DOUBLE_TYPE = eINSTANCE.getLongDoubleType();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.CharTypeImpl <em>Char Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.CharTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getCharType()
     * @generated
     */
    EClass CHAR_TYPE = eINSTANCE.getCharType();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.WideCharTypeImpl <em>Wide Char Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.WideCharTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getWideCharType()
     * @generated
     */
    EClass WIDE_CHAR_TYPE = eINSTANCE.getWideCharType();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.BooleanTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.OctetTypeImpl <em>Octet Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.OctetTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getOctetType()
     * @generated
     */
    EClass OCTET_TYPE = eINSTANCE.getOctetType();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.ReferencedTypeImpl <em>Referenced Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.ReferencedTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getReferencedType()
     * @generated
     */
    EClass REFERENCED_TYPE = eINSTANCE.getReferencedType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_TYPE__TYPE = eINSTANCE.getReferencedType_Type();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.BoundedSequenceImpl <em>Bounded Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.BoundedSequenceImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBoundedSequence()
     * @generated
     */
    EClass BOUNDED_SEQUENCE = eINSTANCE.getBoundedSequence();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOUNDED_SEQUENCE__TYPE = eINSTANCE.getBoundedSequence_Type();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUNDED_SEQUENCE__SIZE = eINSTANCE.getBoundedSequence_Size();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.UnboundedSequenceImpl <em>Unbounded Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.UnboundedSequenceImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnboundedSequence()
     * @generated
     */
    EClass UNBOUNDED_SEQUENCE = eINSTANCE.getUnboundedSequence();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNBOUNDED_SEQUENCE__TYPE = eINSTANCE.getUnboundedSequence_Type();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.BoundedStringImpl <em>Bounded String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.BoundedStringImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBoundedString()
     * @generated
     */
    EClass BOUNDED_STRING = eINSTANCE.getBoundedString();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUNDED_STRING__SIZE = eINSTANCE.getBoundedString_Size();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.UnboundedStringImpl <em>Unbounded String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.UnboundedStringImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnboundedString()
     * @generated
     */
    EClass UNBOUNDED_STRING = eINSTANCE.getUnboundedString();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.BoundedWideStringImpl <em>Bounded Wide String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.BoundedWideStringImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getBoundedWideString()
     * @generated
     */
    EClass BOUNDED_WIDE_STRING = eINSTANCE.getBoundedWideString();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUNDED_WIDE_STRING__SIZE = eINSTANCE.getBoundedWideString_Size();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.UnboundedWideStringImpl <em>Unbounded Wide String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.UnboundedWideStringImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getUnboundedWideString()
     * @generated
     */
    EClass UNBOUNDED_WIDE_STRING = eINSTANCE.getUnboundedWideString();

    /**
     * The meta object literal for the '{@link org.osate.simpleidl.simpleIDL.impl.FixedPtTypeImpl <em>Fixed Pt Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.simpleidl.simpleIDL.impl.FixedPtTypeImpl
     * @see org.osate.simpleidl.simpleIDL.impl.SimpleIDLPackageImpl#getFixedPtType()
     * @generated
     */
    EClass FIXED_PT_TYPE = eINSTANCE.getFixedPtType();

    /**
     * The meta object literal for the '<em><b>Total Digits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXED_PT_TYPE__TOTAL_DIGITS = eINSTANCE.getFixedPtType_TotalDigits();

    /**
     * The meta object literal for the '<em><b>Fractional Digits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXED_PT_TYPE__FRACTIONAL_DIGITS = eINSTANCE.getFixedPtType_FractionalDigits();

  }

} //SimpleIDLPackage
