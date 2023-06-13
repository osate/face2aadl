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
package org.osate.datamodel10.platform;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.datamodel10.DatamodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.datamodel10.platform.PlatformFactory
 * @model kind="package"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengroup.us/datamodel/platform/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = org.osate.datamodel10.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ElementImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = DatamodelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = DatamodelPackage.ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = DatamodelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = DatamodelPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ComposableElementImpl <em>Composable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ComposableElementImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getComposableElement()
	 * @generated
	 */
	int COMPOSABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Composable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.PlatformDataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.PlatformDataTypeImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getPlatformDataType()
	 * @generated
	 */
	int PLATFORM_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_TYPE__NAME = COMPOSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_TYPE__DESCRIPTION = COMPOSABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_TYPE__REALIZES = COMPOSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_TYPE_FEATURE_COUNT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_DATA_TYPE_OPERATION_COUNT = COMPOSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.PrimitiveImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = PLATFORM_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__DESCRIPTION = PLATFORM_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__REALIZES = PLATFORM_DATA_TYPE__REALIZES;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = PLATFORM_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = PLATFORM_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.BooleanImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.OctetImpl <em>Octet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.OctetImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getOctet()
	 * @generated
	 */
	int OCTET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Octet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Octet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.CharTypeImpl <em>Char Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.CharTypeImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharType()
	 * @generated
	 */
	int CHAR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.CharImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__NAME = CHAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__DESCRIPTION = CHAR_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__REALIZES = CHAR_TYPE__REALIZES;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = CHAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_OPERATION_COUNT = CHAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.StringTypeImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.StringImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getString()
	 * @generated
	 */
	int STRING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = STRING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__DESCRIPTION = STRING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__REALIZES = STRING_TYPE__REALIZES;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.BoundedStringImpl <em>Bounded String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.BoundedStringImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getBoundedString()
	 * @generated
	 */
	int BOUNDED_STRING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__NAME = STRING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__DESCRIPTION = STRING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__REALIZES = STRING_TYPE__REALIZES;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__MAX_LENGTH = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.CharArrayImpl <em>Char Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.CharArrayImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharArray()
	 * @generated
	 */
	int CHAR_ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__NAME = STRING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__DESCRIPTION = STRING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__REALIZES = STRING_TYPE__REALIZES;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__LENGTH = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Char Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.EnumerationImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.NumberImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.IntegerImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = NUMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__DESCRIPTION = NUMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__REALIZES = NUMBER__REALIZES;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ShortImpl <em>Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ShortImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__NAME = INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__DESCRIPTION = INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__REALIZES = INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.LongImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__NAME = INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__DESCRIPTION = INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__REALIZES = INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.LongLongImpl <em>Long Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.LongLongImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getLongLong()
	 * @generated
	 */
	int LONG_LONG = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__NAME = INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__DESCRIPTION = INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__REALIZES = INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.RealImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__NAME = NUMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__DESCRIPTION = NUMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__REALIZES = NUMBER__REALIZES;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.DoubleImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__NAME = REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__DESCRIPTION = REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__REALIZES = REAL__REALIZES;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.LongDoubleImpl <em>Long Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.LongDoubleImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getLongDouble()
	 * @generated
	 */
	int LONG_DOUBLE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__NAME = REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__DESCRIPTION = REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__REALIZES = REAL__REALIZES;

	/**
	 * The number of structural features of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_FEATURE_COUNT = REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_OPERATION_COUNT = REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.FloatImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NAME = REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__DESCRIPTION = REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__REALIZES = REAL__REALIZES;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.FixedImpl <em>Fixed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.FixedImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getFixed()
	 * @generated
	 */
	int FIXED = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__NAME = REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__DESCRIPTION = REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__REALIZES = REAL__REALIZES;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__DIGITS = REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__SCALE = REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FEATURE_COUNT = REAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OPERATION_COUNT = REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.UnsignedIntegerImpl <em>Unsigned Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.UnsignedIntegerImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getUnsignedInteger()
	 * @generated
	 */
	int UNSIGNED_INTEGER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER__NAME = INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER__DESCRIPTION = INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER__REALIZES = INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>Unsigned Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsigned Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.UShortImpl <em>UShort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.UShortImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getUShort()
	 * @generated
	 */
	int USHORT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__NAME = UNSIGNED_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__DESCRIPTION = UNSIGNED_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__REALIZES = UNSIGNED_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>UShort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT_FEATURE_COUNT = UNSIGNED_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UShort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT_OPERATION_COUNT = UNSIGNED_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ULongImpl <em>ULong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ULongImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getULong()
	 * @generated
	 */
	int ULONG = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__NAME = UNSIGNED_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__DESCRIPTION = UNSIGNED_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__REALIZES = UNSIGNED_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>ULong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_FEATURE_COUNT = UNSIGNED_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ULong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_OPERATION_COUNT = UNSIGNED_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ULongLongImpl <em>ULong Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ULongLongImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getULongLong()
	 * @generated
	 */
	int ULONG_LONG = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__NAME = UNSIGNED_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__DESCRIPTION = UNSIGNED_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__REALIZES = UNSIGNED_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>ULong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG_FEATURE_COUNT = UNSIGNED_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ULong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG_OPERATION_COUNT = UNSIGNED_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.SequenceImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__MAX_SIZE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ArrayImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DESCRIPTION = PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__REALIZES = PRIMITIVE__REALIZES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SIZE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.StructImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = PLATFORM_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__DESCRIPTION = PLATFORM_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__REALIZES = PLATFORM_DATA_TYPE__REALIZES;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__MEMBER = PLATFORM_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = PLATFORM_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = PLATFORM_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.StructMemberImpl <em>Struct Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.StructMemberImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getStructMember()
	 * @generated
	 */
	int STRUCT_MEMBER = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__ROLENAME = 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__PRECISION = 2;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__REALIZES = 3;

	/**
	 * The number of structural features of the '<em>Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.CharacteristicImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 31;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ROLENAME = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__LOWER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__SPECIALIZES = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.EntityImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = COMPOSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = COMPOSABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMPOSITION = COMPOSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REALIZES = COMPOSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = COMPOSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = COMPOSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.CompositionImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 33;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__ROLENAME = CHARACTERISTIC__ROLENAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__UPPER_BOUND = CHARACTERISTIC__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__LOWER_BOUND = CHARACTERISTIC__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SPECIALIZES = CHARACTERISTIC__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__DESCRIPTION = CHARACTERISTIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TYPE = CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__REALIZES = CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__PRECISION = CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = CHARACTERISTIC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.AssociationImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMPOSITION = ENTITY__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REALIZES = ENTITY__REALIZES;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SPECIALIZES = ENTITY__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PARTICIPANT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ParticipantImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 35;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ROLENAME = CHARACTERISTIC__ROLENAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__UPPER_BOUND = CHARACTERISTIC__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__LOWER_BOUND = CHARACTERISTIC__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SPECIALIZES = CHARACTERISTIC__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DESCRIPTION = CHARACTERISTIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__TYPE = CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__REALIZES = CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SOURCE_LOWER_BOUND = CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SOURCE_UPPER_BOUND = CHARACTERISTIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PATH = CHARACTERISTIC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = CHARACTERISTIC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.PathNodeImpl <em>Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.PathNodeImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getPathNode()
	 * @generated
	 */
	int PATH_NODE = 36;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__NODE = 0;

	/**
	 * The number of structural features of the '<em>Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ParticipantPathNodeImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getParticipantPathNode()
	 * @generated
	 */
	int PARTICIPANT_PATH_NODE = 37;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE__NODE = PATH_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Projected Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Participant Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Participant Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PATH_NODE_OPERATION_COUNT = PATH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.CharacteristicPathNodeImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharacteristicPathNode()
	 * @generated
	 */
	int CHARACTERISTIC_PATH_NODE = 38;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE__NODE = PATH_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Projected Characteristic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristic Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Characteristic Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_PATH_NODE_OPERATION_COUNT = PATH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.ViewImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.QueryImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__REALIZES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SPECIFICATION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.CompositeQueryImpl <em>Composite Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.CompositeQueryImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCompositeQuery()
	 * @generated
	 */
	int COMPOSITE_QUERY = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__COMPOSITION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__REALIZES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY__IS_UNION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUERY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.platform.impl.QueryCompositionImpl <em>Query Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.platform.impl.QueryCompositionImpl
	 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getQueryComposition()
	 * @generated
	 */
	int QUERY_COMPOSITION = 42;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION__ROLENAME = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION__REALIZES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Query Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.osate.datamodel10.platform.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composable Element</em>'.
	 * @see org.osate.datamodel10.platform.ComposableElement
	 * @generated
	 */
	EClass getComposableElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.PlatformDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.osate.datamodel10.platform.PlatformDataType
	 * @generated
	 */
	EClass getPlatformDataType();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.PlatformDataType#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.PlatformDataType#getRealizes()
	 * @see #getPlatformDataType()
	 * @generated
	 */
	EReference getPlatformDataType_Realizes();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see org.osate.datamodel10.platform.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.osate.datamodel10.platform.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Octet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet</em>'.
	 * @see org.osate.datamodel10.platform.Octet
	 * @generated
	 */
	EClass getOctet();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Type</em>'.
	 * @see org.osate.datamodel10.platform.CharType
	 * @generated
	 */
	EClass getCharType();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see org.osate.datamodel10.platform.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.osate.datamodel10.platform.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.osate.datamodel10.platform.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.BoundedString <em>Bounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded String</em>'.
	 * @see org.osate.datamodel10.platform.BoundedString
	 * @generated
	 */
	EClass getBoundedString();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.BoundedString#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.osate.datamodel10.platform.BoundedString#getMaxLength()
	 * @see #getBoundedString()
	 * @generated
	 */
	EAttribute getBoundedString_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.CharArray <em>Char Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Array</em>'.
	 * @see org.osate.datamodel10.platform.CharArray
	 * @generated
	 */
	EClass getCharArray();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.CharArray#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.osate.datamodel10.platform.CharArray#getLength()
	 * @see #getCharArray()
	 * @generated
	 */
	EAttribute getCharArray_Length();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.osate.datamodel10.platform.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see org.osate.datamodel10.platform.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.osate.datamodel10.platform.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short</em>'.
	 * @see org.osate.datamodel10.platform.Short
	 * @generated
	 */
	EClass getShort();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see org.osate.datamodel10.platform.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.LongLong <em>Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Long</em>'.
	 * @see org.osate.datamodel10.platform.LongLong
	 * @generated
	 */
	EClass getLongLong();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see org.osate.datamodel10.platform.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see org.osate.datamodel10.platform.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Double</em>'.
	 * @see org.osate.datamodel10.platform.LongDouble
	 * @generated
	 */
	EClass getLongDouble();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see org.osate.datamodel10.platform.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed</em>'.
	 * @see org.osate.datamodel10.platform.Fixed
	 * @generated
	 */
	EClass getFixed();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Fixed#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digits</em>'.
	 * @see org.osate.datamodel10.platform.Fixed#getDigits()
	 * @see #getFixed()
	 * @generated
	 */
	EAttribute getFixed_Digits();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Fixed#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.osate.datamodel10.platform.Fixed#getScale()
	 * @see #getFixed()
	 * @generated
	 */
	EAttribute getFixed_Scale();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.UnsignedInteger <em>Unsigned Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Integer</em>'.
	 * @see org.osate.datamodel10.platform.UnsignedInteger
	 * @generated
	 */
	EClass getUnsignedInteger();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.UShort <em>UShort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UShort</em>'.
	 * @see org.osate.datamodel10.platform.UShort
	 * @generated
	 */
	EClass getUShort();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.ULong <em>ULong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULong</em>'.
	 * @see org.osate.datamodel10.platform.ULong
	 * @generated
	 */
	EClass getULong();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.ULongLong <em>ULong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULong Long</em>'.
	 * @see org.osate.datamodel10.platform.ULongLong
	 * @generated
	 */
	EClass getULongLong();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.osate.datamodel10.platform.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Sequence#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see org.osate.datamodel10.platform.Sequence#getMaxSize()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_MaxSize();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.osate.datamodel10.platform.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Array#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.osate.datamodel10.platform.Array#getSize()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Size();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see org.osate.datamodel10.platform.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.platform.Struct#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.osate.datamodel10.platform.Struct#getMember()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Member();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.StructMember <em>Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Member</em>'.
	 * @see org.osate.datamodel10.platform.StructMember
	 * @generated
	 */
	EClass getStructMember();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.StructMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.platform.StructMember#getType()
	 * @see #getStructMember()
	 * @generated
	 */
	EReference getStructMember_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.StructMember#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.platform.StructMember#getRolename()
	 * @see #getStructMember()
	 * @generated
	 */
	EAttribute getStructMember_Rolename();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.StructMember#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.osate.datamodel10.platform.StructMember#getPrecision()
	 * @see #getStructMember()
	 * @generated
	 */
	EAttribute getStructMember_Precision();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.StructMember#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.StructMember#getRealizes()
	 * @see #getStructMember()
	 * @generated
	 */
	EReference getStructMember_Realizes();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see org.osate.datamodel10.platform.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Characteristic#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.platform.Characteristic#getRolename()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Rolename();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Characteristic#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.osate.datamodel10.platform.Characteristic#getUpperBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Characteristic#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.osate.datamodel10.platform.Characteristic#getLowerBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_LowerBound();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Characteristic#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see org.osate.datamodel10.platform.Characteristic#getSpecializes()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Specializes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Characteristic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.osate.datamodel10.platform.Characteristic#getDescription()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Description();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.osate.datamodel10.platform.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.platform.Entity#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.osate.datamodel10.platform.Entity#getComposition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Composition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Entity#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.Entity#getRealizes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Realizes();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Entity#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see org.osate.datamodel10.platform.Entity#getSpecializes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Specializes();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see org.osate.datamodel10.platform.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Composition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.platform.Composition#getType()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Type();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Composition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.Composition#getRealizes()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Composition#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.osate.datamodel10.platform.Composition#getPrecision()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Precision();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.osate.datamodel10.platform.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.platform.Association#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.osate.datamodel10.platform.Association#getParticipant()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Participant();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.osate.datamodel10.platform.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Participant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.platform.Participant#getType()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Type();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Participant#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.Participant#getRealizes()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Participant#getSourceLowerBound <em>Source Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Lower Bound</em>'.
	 * @see org.osate.datamodel10.platform.Participant#getSourceLowerBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Participant#getSourceUpperBound <em>Source Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Upper Bound</em>'.
	 * @see org.osate.datamodel10.platform.Participant#getSourceUpperBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceUpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.datamodel10.platform.Participant#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.osate.datamodel10.platform.Participant#getPath()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Path();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Node</em>'.
	 * @see org.osate.datamodel10.platform.PathNode
	 * @generated
	 */
	EClass getPathNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.datamodel10.platform.PathNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.osate.datamodel10.platform.PathNode#getNode()
	 * @see #getPathNode()
	 * @generated
	 */
	EReference getPathNode_Node();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Path Node</em>'.
	 * @see org.osate.datamodel10.platform.ParticipantPathNode
	 * @generated
	 */
	EClass getParticipantPathNode();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.ParticipantPathNode#getProjectedParticipant <em>Projected Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Participant</em>'.
	 * @see org.osate.datamodel10.platform.ParticipantPathNode#getProjectedParticipant()
	 * @see #getParticipantPathNode()
	 * @generated
	 */
	EReference getParticipantPathNode_ProjectedParticipant();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Path Node</em>'.
	 * @see org.osate.datamodel10.platform.CharacteristicPathNode
	 * @generated
	 */
	EClass getCharacteristicPathNode();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.CharacteristicPathNode#getProjectedCharacteristic <em>Projected Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Characteristic</em>'.
	 * @see org.osate.datamodel10.platform.CharacteristicPathNode#getProjectedCharacteristic()
	 * @see #getCharacteristicPathNode()
	 * @generated
	 */
	EReference getCharacteristicPathNode_ProjectedCharacteristic();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.osate.datamodel10.platform.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.osate.datamodel10.platform.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.Query#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.Query#getRealizes()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.Query#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.osate.datamodel10.platform.Query#getSpecification()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Specification();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.CompositeQuery <em>Composite Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Query</em>'.
	 * @see org.osate.datamodel10.platform.CompositeQuery
	 * @generated
	 */
	EClass getCompositeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.platform.CompositeQuery#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.osate.datamodel10.platform.CompositeQuery#getComposition()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EReference getCompositeQuery_Composition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.CompositeQuery#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.CompositeQuery#getRealizes()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EReference getCompositeQuery_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.CompositeQuery#isIsUnion <em>Is Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Union</em>'.
	 * @see org.osate.datamodel10.platform.CompositeQuery#isIsUnion()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EAttribute getCompositeQuery_IsUnion();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.platform.QueryComposition <em>Query Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Composition</em>'.
	 * @see org.osate.datamodel10.platform.QueryComposition
	 * @generated
	 */
	EClass getQueryComposition();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.platform.QueryComposition#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.platform.QueryComposition#getRolename()
	 * @see #getQueryComposition()
	 * @generated
	 */
	EAttribute getQueryComposition_Rolename();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.QueryComposition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.platform.QueryComposition#getRealizes()
	 * @see #getQueryComposition()
	 * @generated
	 */
	EReference getQueryComposition_Realizes();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.platform.QueryComposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.platform.QueryComposition#getType()
	 * @see #getQueryComposition()
	 * @generated
	 */
	EReference getQueryComposition_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ElementImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ComposableElementImpl <em>Composable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ComposableElementImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getComposableElement()
		 * @generated
		 */
		EClass COMPOSABLE_ELEMENT = eINSTANCE.getComposableElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.PlatformDataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.PlatformDataTypeImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getPlatformDataType()
		 * @generated
		 */
		EClass PLATFORM_DATA_TYPE = eINSTANCE.getPlatformDataType();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_DATA_TYPE__REALIZES = eINSTANCE.getPlatformDataType_Realizes();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.PrimitiveImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.BooleanImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.OctetImpl <em>Octet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.OctetImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getOctet()
		 * @generated
		 */
		EClass OCTET = eINSTANCE.getOctet();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.CharTypeImpl <em>Char Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.CharTypeImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharType()
		 * @generated
		 */
		EClass CHAR_TYPE = eINSTANCE.getCharType();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.CharImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.StringTypeImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.StringImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.BoundedStringImpl <em>Bounded String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.BoundedStringImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getBoundedString()
		 * @generated
		 */
		EClass BOUNDED_STRING = eINSTANCE.getBoundedString();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_STRING__MAX_LENGTH = eINSTANCE.getBoundedString_MaxLength();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.CharArrayImpl <em>Char Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.CharArrayImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharArray()
		 * @generated
		 */
		EClass CHAR_ARRAY = eINSTANCE.getCharArray();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_ARRAY__LENGTH = eINSTANCE.getCharArray_Length();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.EnumerationImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.NumberImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.IntegerImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ShortImpl <em>Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ShortImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getShort()
		 * @generated
		 */
		EClass SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.LongImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.LongLongImpl <em>Long Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.LongLongImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getLongLong()
		 * @generated
		 */
		EClass LONG_LONG = eINSTANCE.getLongLong();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.RealImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.DoubleImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.LongDoubleImpl <em>Long Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.LongDoubleImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getLongDouble()
		 * @generated
		 */
		EClass LONG_DOUBLE = eINSTANCE.getLongDouble();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.FloatImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.FixedImpl <em>Fixed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.FixedImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getFixed()
		 * @generated
		 */
		EClass FIXED = eINSTANCE.getFixed();

		/**
		 * The meta object literal for the '<em><b>Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED__DIGITS = eINSTANCE.getFixed_Digits();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED__SCALE = eINSTANCE.getFixed_Scale();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.UnsignedIntegerImpl <em>Unsigned Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.UnsignedIntegerImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getUnsignedInteger()
		 * @generated
		 */
		EClass UNSIGNED_INTEGER = eINSTANCE.getUnsignedInteger();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.UShortImpl <em>UShort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.UShortImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getUShort()
		 * @generated
		 */
		EClass USHORT = eINSTANCE.getUShort();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ULongImpl <em>ULong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ULongImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getULong()
		 * @generated
		 */
		EClass ULONG = eINSTANCE.getULong();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ULongLongImpl <em>ULong Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ULongLongImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getULongLong()
		 * @generated
		 */
		EClass ULONG_LONG = eINSTANCE.getULongLong();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.SequenceImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__MAX_SIZE = eINSTANCE.getSequence_MaxSize();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ArrayImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__SIZE = eINSTANCE.getArray_Size();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.StructImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__MEMBER = eINSTANCE.getStruct_Member();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.StructMemberImpl <em>Struct Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.StructMemberImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getStructMember()
		 * @generated
		 */
		EClass STRUCT_MEMBER = eINSTANCE.getStructMember();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_MEMBER__TYPE = eINSTANCE.getStructMember_Type();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT_MEMBER__ROLENAME = eINSTANCE.getStructMember_Rolename();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT_MEMBER__PRECISION = eINSTANCE.getStructMember_Precision();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_MEMBER__REALIZES = eINSTANCE.getStructMember_Realizes();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.CharacteristicImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__ROLENAME = eINSTANCE.getCharacteristic_Rolename();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__UPPER_BOUND = eINSTANCE.getCharacteristic_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__LOWER_BOUND = eINSTANCE.getCharacteristic_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__SPECIALIZES = eINSTANCE.getCharacteristic_Specializes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__DESCRIPTION = eINSTANCE.getCharacteristic_Description();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.EntityImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__COMPOSITION = eINSTANCE.getEntity_Composition();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REALIZES = eINSTANCE.getEntity_Realizes();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SPECIALIZES = eINSTANCE.getEntity_Specializes();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.CompositionImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__TYPE = eINSTANCE.getComposition_Type();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__REALIZES = eINSTANCE.getComposition_Realizes();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__PRECISION = eINSTANCE.getComposition_Precision();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.AssociationImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__PARTICIPANT = eINSTANCE.getAssociation_Participant();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ParticipantImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__TYPE = eINSTANCE.getParticipant_Type();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__REALIZES = eINSTANCE.getParticipant_Realizes();

		/**
		 * The meta object literal for the '<em><b>Source Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__SOURCE_LOWER_BOUND = eINSTANCE.getParticipant_SourceLowerBound();

		/**
		 * The meta object literal for the '<em><b>Source Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__SOURCE_UPPER_BOUND = eINSTANCE.getParticipant_SourceUpperBound();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PATH = eINSTANCE.getParticipant_Path();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.PathNodeImpl <em>Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.PathNodeImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getPathNode()
		 * @generated
		 */
		EClass PATH_NODE = eINSTANCE.getPathNode();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_NODE__NODE = eINSTANCE.getPathNode_Node();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ParticipantPathNodeImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getParticipantPathNode()
		 * @generated
		 */
		EClass PARTICIPANT_PATH_NODE = eINSTANCE.getParticipantPathNode();

		/**
		 * The meta object literal for the '<em><b>Projected Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT = eINSTANCE.getParticipantPathNode_ProjectedParticipant();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.CharacteristicPathNodeImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCharacteristicPathNode()
		 * @generated
		 */
		EClass CHARACTERISTIC_PATH_NODE = eINSTANCE.getCharacteristicPathNode();

		/**
		 * The meta object literal for the '<em><b>Projected Characteristic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC = eINSTANCE.getCharacteristicPathNode_ProjectedCharacteristic();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.ViewImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.QueryImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__REALIZES = eINSTANCE.getQuery_Realizes();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__SPECIFICATION = eINSTANCE.getQuery_Specification();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.CompositeQueryImpl <em>Composite Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.CompositeQueryImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getCompositeQuery()
		 * @generated
		 */
		EClass COMPOSITE_QUERY = eINSTANCE.getCompositeQuery();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_QUERY__COMPOSITION = eINSTANCE.getCompositeQuery_Composition();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_QUERY__REALIZES = eINSTANCE.getCompositeQuery_Realizes();

		/**
		 * The meta object literal for the '<em><b>Is Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_QUERY__IS_UNION = eINSTANCE.getCompositeQuery_IsUnion();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.platform.impl.QueryCompositionImpl <em>Query Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.platform.impl.QueryCompositionImpl
		 * @see org.osate.datamodel10.platform.impl.PlatformPackageImpl#getQueryComposition()
		 * @generated
		 */
		EClass QUERY_COMPOSITION = eINSTANCE.getQueryComposition();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_COMPOSITION__ROLENAME = eINSTANCE.getQueryComposition_Rolename();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_COMPOSITION__REALIZES = eINSTANCE.getQueryComposition_Realizes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_COMPOSITION__TYPE = eINSTANCE.getQueryComposition_Type();

	}

} //PlatformPackage
