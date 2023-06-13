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
package face.datamodel.platform;

import face.datamodel.DatamodelPackage;

import java.lang.String;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see face.datamodel.platform.PlatformFactory
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
	String eNS_URI = "http://www.opengroup.us/face/datamodel/platform/3.0";

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
	PlatformPackage eINSTANCE = face.datamodel.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ElementImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getElement()
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
	 * The meta object id for the '{@link face.datamodel.platform.impl.ComposableElementImpl <em>Composable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ComposableElementImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getComposableElement()
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
	 * The meta object id for the '{@link face.datamodel.platform.impl.PhysicalDataTypeImpl <em>Physical Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.PhysicalDataTypeImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getPhysicalDataType()
	 * @generated
	 */
	int PHYSICAL_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_TYPE__NAME = COMPOSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_TYPE__DESCRIPTION = COMPOSABLE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Physical Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_TYPE_FEATURE_COUNT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_TYPE_OPERATION_COUNT = COMPOSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLTypeImpl <em>IDL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLTypeImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLType()
	 * @generated
	 */
	int IDL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__NAME = PHYSICAL_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__DESCRIPTION = PHYSICAL_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__REALIZES = PHYSICAL_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_FEATURE_COUNT = PHYSICAL_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_OPERATION_COUNT = PHYSICAL_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLPrimitiveImpl <em>IDL Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLPrimitiveImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLPrimitive()
	 * @generated
	 */
	int IDL_PRIMITIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_PRIMITIVE__NAME = IDL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_PRIMITIVE__DESCRIPTION = IDL_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_PRIMITIVE__REALIZES = IDL_TYPE__REALIZES;

	/**
	 * The number of structural features of the '<em>IDL Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_PRIMITIVE_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDL Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_PRIMITIVE_OPERATION_COUNT = IDL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.BooleanImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.OctetImpl <em>Octet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.OctetImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getOctet()
	 * @generated
	 */
	int OCTET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Octet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Octet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.CharTypeImpl <em>Char Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.CharTypeImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharType()
	 * @generated
	 */
	int CHAR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_TYPE_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.CharImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 8;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.StringTypeImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLUnboundedStringImpl <em>IDL Unbounded String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLUnboundedStringImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLUnboundedString()
	 * @generated
	 */
	int IDL_UNBOUNDED_STRING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNBOUNDED_STRING__NAME = STRING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNBOUNDED_STRING__DESCRIPTION = STRING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNBOUNDED_STRING__REALIZES = STRING_TYPE__REALIZES;

	/**
	 * The number of structural features of the '<em>IDL Unbounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNBOUNDED_STRING_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDL Unbounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNBOUNDED_STRING_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.StringImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getString()
	 * @generated
	 */
	int STRING = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = IDL_UNBOUNDED_STRING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__DESCRIPTION = IDL_UNBOUNDED_STRING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__REALIZES = IDL_UNBOUNDED_STRING__REALIZES;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = IDL_UNBOUNDED_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = IDL_UNBOUNDED_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLBoundedStringImpl <em>IDL Bounded String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLBoundedStringImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLBoundedString()
	 * @generated
	 */
	int IDL_BOUNDED_STRING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_BOUNDED_STRING__NAME = STRING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_BOUNDED_STRING__DESCRIPTION = STRING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_BOUNDED_STRING__REALIZES = STRING_TYPE__REALIZES;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_BOUNDED_STRING__MAX_LENGTH = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDL Bounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_BOUNDED_STRING_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDL Bounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_BOUNDED_STRING_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.BoundedStringImpl <em>Bounded String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.BoundedStringImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getBoundedString()
	 * @generated
	 */
	int BOUNDED_STRING = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__NAME = IDL_BOUNDED_STRING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__DESCRIPTION = IDL_BOUNDED_STRING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__REALIZES = IDL_BOUNDED_STRING__REALIZES;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING__MAX_LENGTH = IDL_BOUNDED_STRING__MAX_LENGTH;

	/**
	 * The number of structural features of the '<em>Bounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING_FEATURE_COUNT = IDL_BOUNDED_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bounded String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_STRING_OPERATION_COUNT = IDL_BOUNDED_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLCharacterArrayImpl <em>IDL Character Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLCharacterArrayImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLCharacterArray()
	 * @generated
	 */
	int IDL_CHARACTER_ARRAY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHARACTER_ARRAY__NAME = STRING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHARACTER_ARRAY__DESCRIPTION = STRING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHARACTER_ARRAY__REALIZES = STRING_TYPE__REALIZES;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHARACTER_ARRAY__LENGTH = STRING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDL Character Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHARACTER_ARRAY_FEATURE_COUNT = STRING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDL Character Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHARACTER_ARRAY_OPERATION_COUNT = STRING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.CharArrayImpl <em>Char Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.CharArrayImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharArray()
	 * @generated
	 */
	int CHAR_ARRAY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__NAME = IDL_CHARACTER_ARRAY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__DESCRIPTION = IDL_CHARACTER_ARRAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__REALIZES = IDL_CHARACTER_ARRAY__REALIZES;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY__LENGTH = IDL_CHARACTER_ARRAY__LENGTH;

	/**
	 * The number of structural features of the '<em>Char Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY_FEATURE_COUNT = IDL_CHARACTER_ARRAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ARRAY_OPERATION_COUNT = IDL_CHARACTER_ARRAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.EnumerationImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLNumberImpl <em>IDL Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLNumberImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLNumber()
	 * @generated
	 */
	int IDL_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_NUMBER__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_NUMBER__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_NUMBER__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The number of structural features of the '<em>IDL Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_NUMBER_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDL Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_NUMBER_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLIntegerImpl <em>IDL Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLIntegerImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLInteger()
	 * @generated
	 */
	int IDL_INTEGER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTEGER__NAME = IDL_NUMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTEGER__DESCRIPTION = IDL_NUMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTEGER__REALIZES = IDL_NUMBER__REALIZES;

	/**
	 * The number of structural features of the '<em>IDL Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTEGER_FEATURE_COUNT = IDL_NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDL Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTEGER_OPERATION_COUNT = IDL_NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.ShortImpl <em>Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ShortImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__NAME = IDL_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__DESCRIPTION = IDL_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__REALIZES = IDL_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_FEATURE_COUNT = IDL_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_OPERATION_COUNT = IDL_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.LongImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__NAME = IDL_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__DESCRIPTION = IDL_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__REALIZES = IDL_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = IDL_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OPERATION_COUNT = IDL_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.LongLongImpl <em>Long Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.LongLongImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getLongLong()
	 * @generated
	 */
	int LONG_LONG = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__NAME = IDL_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__DESCRIPTION = IDL_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__REALIZES = IDL_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG_FEATURE_COUNT = IDL_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG_OPERATION_COUNT = IDL_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLRealImpl <em>IDL Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLRealImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLReal()
	 * @generated
	 */
	int IDL_REAL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REAL__NAME = IDL_NUMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REAL__DESCRIPTION = IDL_NUMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REAL__REALIZES = IDL_NUMBER__REALIZES;

	/**
	 * The number of structural features of the '<em>IDL Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REAL_FEATURE_COUNT = IDL_NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDL Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REAL_OPERATION_COUNT = IDL_NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.DoubleImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__NAME = IDL_REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__DESCRIPTION = IDL_REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__REALIZES = IDL_REAL__REALIZES;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = IDL_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = IDL_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.LongDoubleImpl <em>Long Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.LongDoubleImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getLongDouble()
	 * @generated
	 */
	int LONG_DOUBLE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__NAME = IDL_REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__DESCRIPTION = IDL_REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__REALIZES = IDL_REAL__REALIZES;

	/**
	 * The number of structural features of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_FEATURE_COUNT = IDL_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_OPERATION_COUNT = IDL_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.FloatImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NAME = IDL_REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__DESCRIPTION = IDL_REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__REALIZES = IDL_REAL__REALIZES;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = IDL_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = IDL_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.FixedImpl <em>Fixed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.FixedImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getFixed()
	 * @generated
	 */
	int FIXED = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__NAME = IDL_REAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__DESCRIPTION = IDL_REAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__REALIZES = IDL_REAL__REALIZES;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__DIGITS = IDL_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__SCALE = IDL_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FEATURE_COUNT = IDL_REAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OPERATION_COUNT = IDL_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLUnsignedIntegerImpl <em>IDL Unsigned Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLUnsignedIntegerImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLUnsignedInteger()
	 * @generated
	 */
	int IDL_UNSIGNED_INTEGER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNSIGNED_INTEGER__NAME = IDL_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNSIGNED_INTEGER__DESCRIPTION = IDL_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNSIGNED_INTEGER__REALIZES = IDL_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>IDL Unsigned Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNSIGNED_INTEGER_FEATURE_COUNT = IDL_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDL Unsigned Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_UNSIGNED_INTEGER_OPERATION_COUNT = IDL_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.UShortImpl <em>UShort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.UShortImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getUShort()
	 * @generated
	 */
	int USHORT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__NAME = IDL_UNSIGNED_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__DESCRIPTION = IDL_UNSIGNED_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__REALIZES = IDL_UNSIGNED_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>UShort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT_FEATURE_COUNT = IDL_UNSIGNED_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UShort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT_OPERATION_COUNT = IDL_UNSIGNED_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.ULongImpl <em>ULong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ULongImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getULong()
	 * @generated
	 */
	int ULONG = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__NAME = IDL_UNSIGNED_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__DESCRIPTION = IDL_UNSIGNED_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__REALIZES = IDL_UNSIGNED_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>ULong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_FEATURE_COUNT = IDL_UNSIGNED_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ULong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_OPERATION_COUNT = IDL_UNSIGNED_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.ULongLongImpl <em>ULong Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ULongLongImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getULongLong()
	 * @generated
	 */
	int ULONG_LONG = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__NAME = IDL_UNSIGNED_INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__DESCRIPTION = IDL_UNSIGNED_INTEGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__REALIZES = IDL_UNSIGNED_INTEGER__REALIZES;

	/**
	 * The number of structural features of the '<em>ULong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG_FEATURE_COUNT = IDL_UNSIGNED_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ULong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG_OPERATION_COUNT = IDL_UNSIGNED_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLSequenceImpl <em>IDL Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLSequenceImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLSequence()
	 * @generated
	 */
	int IDL_SEQUENCE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_SEQUENCE__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_SEQUENCE__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_SEQUENCE__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_SEQUENCE__MAX_SIZE = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDL Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_SEQUENCE_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDL Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_SEQUENCE_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLArrayImpl <em>IDL Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLArrayImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLArray()
	 * @generated
	 */
	int IDL_ARRAY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_ARRAY__NAME = IDL_PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_ARRAY__DESCRIPTION = IDL_PRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_ARRAY__REALIZES = IDL_PRIMITIVE__REALIZES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_ARRAY__SIZE = IDL_PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDL Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_ARRAY_FEATURE_COUNT = IDL_PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDL Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_ARRAY_OPERATION_COUNT = IDL_PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLStructImpl <em>IDL Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLStructImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLStruct()
	 * @generated
	 */
	int IDL_STRUCT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRUCT__NAME = IDL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRUCT__DESCRIPTION = IDL_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRUCT__REALIZES = IDL_TYPE__REALIZES;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRUCT__COMPOSITION = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDL Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRUCT_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDL Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRUCT_OPERATION_COUNT = IDL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.IDLCompositionImpl <em>IDL Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.IDLCompositionImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLComposition()
	 * @generated
	 */
	int IDL_COMPOSITION = 34;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_COMPOSITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_COMPOSITION__ROLENAME = 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_COMPOSITION__PRECISION = 2;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_COMPOSITION__REALIZES = 3;

	/**
	 * The number of structural features of the '<em>IDL Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_COMPOSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IDL Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.CharacteristicImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 35;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.EntityImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 36;

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
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TRACEABILITY_POINT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMPOSITION = COMPOSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REALIZES = COMPOSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = COMPOSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = COMPOSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.CompositionImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 37;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.AssociationImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 38;

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
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TRACEABILITY_POINT = ENTITY__TRACEABILITY_POINT;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ParticipantImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 39;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.PathNodeImpl <em>Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.PathNodeImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getPathNode()
	 * @generated
	 */
	int PATH_NODE = 40;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ParticipantPathNodeImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getParticipantPathNode()
	 * @generated
	 */
	int PARTICIPANT_PATH_NODE = 41;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.CharacteristicPathNodeImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharacteristicPathNode()
	 * @generated
	 */
	int CHARACTERISTIC_PATH_NODE = 42;

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
	 * The meta object id for the '{@link face.datamodel.platform.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.ViewImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 43;

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
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.QueryImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 44;

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
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__REALIZES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SPECIFICATION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.CompositeTemplateImpl <em>Composite Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.CompositeTemplateImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCompositeTemplate()
	 * @generated
	 */
	int COMPOSITE_TEMPLATE = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__TRACEABILITY_POINT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__COMPOSITION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__REALIZES = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE__IS_UNION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composite Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Composite Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEMPLATE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.TemplateCompositionImpl <em>Template Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.TemplateCompositionImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getTemplateComposition()
	 * @generated
	 */
	int TEMPLATE_COMPOSITION = 46;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION__ROLENAME = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION__REALIZES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Template Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Template Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link face.datamodel.platform.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see face.datamodel.platform.impl.TemplateImpl
	 * @see face.datamodel.platform.impl.PlatformPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DESCRIPTION = VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Traceability Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__TRACEABILITY_POINT = VIEW__TRACEABILITY_POINT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__SPECIFICATION = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__BOUND_QUERY = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effective Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__EFFECTIVE_QUERY = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see face.datamodel.platform.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composable Element</em>'.
	 * @see face.datamodel.platform.ComposableElement
	 * @generated
	 */
	EClass getComposableElement();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.PhysicalDataType <em>Physical Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Data Type</em>'.
	 * @see face.datamodel.platform.PhysicalDataType
	 * @generated
	 */
	EClass getPhysicalDataType();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Type</em>'.
	 * @see face.datamodel.platform.IDLType
	 * @generated
	 */
	EClass getIDLType();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.IDLType#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.IDLType#getRealizes()
	 * @see #getIDLType()
	 * @generated
	 */
	EReference getIDLType_Realizes();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLPrimitive <em>IDL Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Primitive</em>'.
	 * @see face.datamodel.platform.IDLPrimitive
	 * @generated
	 */
	EClass getIDLPrimitive();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see face.datamodel.platform.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Octet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet</em>'.
	 * @see face.datamodel.platform.Octet
	 * @generated
	 */
	EClass getOctet();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Type</em>'.
	 * @see face.datamodel.platform.CharType
	 * @generated
	 */
	EClass getCharType();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see face.datamodel.platform.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see face.datamodel.platform.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLUnboundedString <em>IDL Unbounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Unbounded String</em>'.
	 * @see face.datamodel.platform.IDLUnboundedString
	 * @generated
	 */
	EClass getIDLUnboundedString();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see face.datamodel.platform.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLBoundedString <em>IDL Bounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Bounded String</em>'.
	 * @see face.datamodel.platform.IDLBoundedString
	 * @generated
	 */
	EClass getIDLBoundedString();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.IDLBoundedString#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see face.datamodel.platform.IDLBoundedString#getMaxLength()
	 * @see #getIDLBoundedString()
	 * @generated
	 */
	EAttribute getIDLBoundedString_MaxLength();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.BoundedString <em>Bounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded String</em>'.
	 * @see face.datamodel.platform.BoundedString
	 * @generated
	 */
	EClass getBoundedString();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLCharacterArray <em>IDL Character Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Character Array</em>'.
	 * @see face.datamodel.platform.IDLCharacterArray
	 * @generated
	 */
	EClass getIDLCharacterArray();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.IDLCharacterArray#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see face.datamodel.platform.IDLCharacterArray#getLength()
	 * @see #getIDLCharacterArray()
	 * @generated
	 */
	EAttribute getIDLCharacterArray_Length();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.CharArray <em>Char Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Array</em>'.
	 * @see face.datamodel.platform.CharArray
	 * @generated
	 */
	EClass getCharArray();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see face.datamodel.platform.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLNumber <em>IDL Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Number</em>'.
	 * @see face.datamodel.platform.IDLNumber
	 * @generated
	 */
	EClass getIDLNumber();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLInteger <em>IDL Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Integer</em>'.
	 * @see face.datamodel.platform.IDLInteger
	 * @generated
	 */
	EClass getIDLInteger();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short</em>'.
	 * @see face.datamodel.platform.Short
	 * @generated
	 */
	EClass getShort();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see face.datamodel.platform.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.LongLong <em>Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Long</em>'.
	 * @see face.datamodel.platform.LongLong
	 * @generated
	 */
	EClass getLongLong();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLReal <em>IDL Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Real</em>'.
	 * @see face.datamodel.platform.IDLReal
	 * @generated
	 */
	EClass getIDLReal();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see face.datamodel.platform.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Double</em>'.
	 * @see face.datamodel.platform.LongDouble
	 * @generated
	 */
	EClass getLongDouble();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see face.datamodel.platform.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed</em>'.
	 * @see face.datamodel.platform.Fixed
	 * @generated
	 */
	EClass getFixed();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Fixed#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digits</em>'.
	 * @see face.datamodel.platform.Fixed#getDigits()
	 * @see #getFixed()
	 * @generated
	 */
	EAttribute getFixed_Digits();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Fixed#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see face.datamodel.platform.Fixed#getScale()
	 * @see #getFixed()
	 * @generated
	 */
	EAttribute getFixed_Scale();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLUnsignedInteger <em>IDL Unsigned Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Unsigned Integer</em>'.
	 * @see face.datamodel.platform.IDLUnsignedInteger
	 * @generated
	 */
	EClass getIDLUnsignedInteger();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.UShort <em>UShort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UShort</em>'.
	 * @see face.datamodel.platform.UShort
	 * @generated
	 */
	EClass getUShort();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.ULong <em>ULong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULong</em>'.
	 * @see face.datamodel.platform.ULong
	 * @generated
	 */
	EClass getULong();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.ULongLong <em>ULong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULong Long</em>'.
	 * @see face.datamodel.platform.ULongLong
	 * @generated
	 */
	EClass getULongLong();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLSequence <em>IDL Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Sequence</em>'.
	 * @see face.datamodel.platform.IDLSequence
	 * @generated
	 */
	EClass getIDLSequence();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.IDLSequence#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see face.datamodel.platform.IDLSequence#getMaxSize()
	 * @see #getIDLSequence()
	 * @generated
	 */
	EAttribute getIDLSequence_MaxSize();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLArray <em>IDL Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Array</em>'.
	 * @see face.datamodel.platform.IDLArray
	 * @generated
	 */
	EClass getIDLArray();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.IDLArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see face.datamodel.platform.IDLArray#getSize()
	 * @see #getIDLArray()
	 * @generated
	 */
	EAttribute getIDLArray_Size();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLStruct <em>IDL Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Struct</em>'.
	 * @see face.datamodel.platform.IDLStruct
	 * @generated
	 */
	EClass getIDLStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.platform.IDLStruct#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see face.datamodel.platform.IDLStruct#getComposition()
	 * @see #getIDLStruct()
	 * @generated
	 */
	EReference getIDLStruct_Composition();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.IDLComposition <em>IDL Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Composition</em>'.
	 * @see face.datamodel.platform.IDLComposition
	 * @generated
	 */
	EClass getIDLComposition();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.IDLComposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see face.datamodel.platform.IDLComposition#getType()
	 * @see #getIDLComposition()
	 * @generated
	 */
	EReference getIDLComposition_Type();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.IDLComposition#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see face.datamodel.platform.IDLComposition#getRolename()
	 * @see #getIDLComposition()
	 * @generated
	 */
	EAttribute getIDLComposition_Rolename();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.IDLComposition#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see face.datamodel.platform.IDLComposition#getPrecision()
	 * @see #getIDLComposition()
	 * @generated
	 */
	EAttribute getIDLComposition_Precision();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.IDLComposition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.IDLComposition#getRealizes()
	 * @see #getIDLComposition()
	 * @generated
	 */
	EReference getIDLComposition_Realizes();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see face.datamodel.platform.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Characteristic#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see face.datamodel.platform.Characteristic#getRolename()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Rolename();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Characteristic#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see face.datamodel.platform.Characteristic#getUpperBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Characteristic#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see face.datamodel.platform.Characteristic#getLowerBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_LowerBound();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Characteristic#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see face.datamodel.platform.Characteristic#getSpecializes()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Specializes();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Characteristic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see face.datamodel.platform.Characteristic#getDescription()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Description();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see face.datamodel.platform.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.platform.Entity#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see face.datamodel.platform.Entity#getComposition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Composition();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Entity#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.Entity#getRealizes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Realizes();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Entity#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see face.datamodel.platform.Entity#getSpecializes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Specializes();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see face.datamodel.platform.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Composition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see face.datamodel.platform.Composition#getType()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Type();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Composition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.Composition#getRealizes()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Composition#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see face.datamodel.platform.Composition#getPrecision()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Precision();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see face.datamodel.platform.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.platform.Association#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see face.datamodel.platform.Association#getParticipant()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Participant();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see face.datamodel.platform.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Participant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see face.datamodel.platform.Participant#getType()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Type();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Participant#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.Participant#getRealizes()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Participant#getSourceLowerBound <em>Source Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Lower Bound</em>'.
	 * @see face.datamodel.platform.Participant#getSourceLowerBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Participant#getSourceUpperBound <em>Source Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Upper Bound</em>'.
	 * @see face.datamodel.platform.Participant#getSourceUpperBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceUpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link face.datamodel.platform.Participant#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see face.datamodel.platform.Participant#getPath()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Path();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Node</em>'.
	 * @see face.datamodel.platform.PathNode
	 * @generated
	 */
	EClass getPathNode();

	/**
	 * Returns the meta object for the containment reference '{@link face.datamodel.platform.PathNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see face.datamodel.platform.PathNode#getNode()
	 * @see #getPathNode()
	 * @generated
	 */
	EReference getPathNode_Node();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Path Node</em>'.
	 * @see face.datamodel.platform.ParticipantPathNode
	 * @generated
	 */
	EClass getParticipantPathNode();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.ParticipantPathNode#getProjectedParticipant <em>Projected Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Participant</em>'.
	 * @see face.datamodel.platform.ParticipantPathNode#getProjectedParticipant()
	 * @see #getParticipantPathNode()
	 * @generated
	 */
	EReference getParticipantPathNode_ProjectedParticipant();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Path Node</em>'.
	 * @see face.datamodel.platform.CharacteristicPathNode
	 * @generated
	 */
	EClass getCharacteristicPathNode();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.CharacteristicPathNode#getProjectedCharacteristic <em>Projected Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Characteristic</em>'.
	 * @see face.datamodel.platform.CharacteristicPathNode#getProjectedCharacteristic()
	 * @see #getCharacteristicPathNode()
	 * @generated
	 */
	EReference getCharacteristicPathNode_ProjectedCharacteristic();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see face.datamodel.platform.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see face.datamodel.platform.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Query#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.Query#getRealizes()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Query#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see face.datamodel.platform.Query#getSpecification()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Specification();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.CompositeTemplate <em>Composite Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Template</em>'.
	 * @see face.datamodel.platform.CompositeTemplate
	 * @generated
	 */
	EClass getCompositeTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link face.datamodel.platform.CompositeTemplate#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see face.datamodel.platform.CompositeTemplate#getComposition()
	 * @see #getCompositeTemplate()
	 * @generated
	 */
	EReference getCompositeTemplate_Composition();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.CompositeTemplate#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.CompositeTemplate#getRealizes()
	 * @see #getCompositeTemplate()
	 * @generated
	 */
	EReference getCompositeTemplate_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.CompositeTemplate#isIsUnion <em>Is Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Union</em>'.
	 * @see face.datamodel.platform.CompositeTemplate#isIsUnion()
	 * @see #getCompositeTemplate()
	 * @generated
	 */
	EAttribute getCompositeTemplate_IsUnion();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.TemplateComposition <em>Template Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Composition</em>'.
	 * @see face.datamodel.platform.TemplateComposition
	 * @generated
	 */
	EClass getTemplateComposition();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.TemplateComposition#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see face.datamodel.platform.TemplateComposition#getRolename()
	 * @see #getTemplateComposition()
	 * @generated
	 */
	EAttribute getTemplateComposition_Rolename();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.TemplateComposition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see face.datamodel.platform.TemplateComposition#getRealizes()
	 * @see #getTemplateComposition()
	 * @generated
	 */
	EReference getTemplateComposition_Realizes();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.TemplateComposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see face.datamodel.platform.TemplateComposition#getType()
	 * @see #getTemplateComposition()
	 * @generated
	 */
	EReference getTemplateComposition_Type();

	/**
	 * Returns the meta object for class '{@link face.datamodel.platform.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see face.datamodel.platform.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the attribute '{@link face.datamodel.platform.Template#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see face.datamodel.platform.Template#getSpecification()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Specification();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Template#getBoundQuery <em>Bound Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Query</em>'.
	 * @see face.datamodel.platform.Template#getBoundQuery()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_BoundQuery();

	/**
	 * Returns the meta object for the reference '{@link face.datamodel.platform.Template#getEffectiveQuery <em>Effective Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Query</em>'.
	 * @see face.datamodel.platform.Template#getEffectiveQuery()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_EffectiveQuery();

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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ElementImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ComposableElementImpl <em>Composable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ComposableElementImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getComposableElement()
		 * @generated
		 */
		EClass COMPOSABLE_ELEMENT = eINSTANCE.getComposableElement();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.PhysicalDataTypeImpl <em>Physical Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.PhysicalDataTypeImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getPhysicalDataType()
		 * @generated
		 */
		EClass PHYSICAL_DATA_TYPE = eINSTANCE.getPhysicalDataType();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLTypeImpl <em>IDL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLTypeImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLType()
		 * @generated
		 */
		EClass IDL_TYPE = eINSTANCE.getIDLType();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_TYPE__REALIZES = eINSTANCE.getIDLType_Realizes();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLPrimitiveImpl <em>IDL Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLPrimitiveImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLPrimitive()
		 * @generated
		 */
		EClass IDL_PRIMITIVE = eINSTANCE.getIDLPrimitive();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.BooleanImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.OctetImpl <em>Octet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.OctetImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getOctet()
		 * @generated
		 */
		EClass OCTET = eINSTANCE.getOctet();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.CharTypeImpl <em>Char Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.CharTypeImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharType()
		 * @generated
		 */
		EClass CHAR_TYPE = eINSTANCE.getCharType();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.CharImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.StringTypeImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLUnboundedStringImpl <em>IDL Unbounded String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLUnboundedStringImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLUnboundedString()
		 * @generated
		 */
		EClass IDL_UNBOUNDED_STRING = eINSTANCE.getIDLUnboundedString();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.StringImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLBoundedStringImpl <em>IDL Bounded String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLBoundedStringImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLBoundedString()
		 * @generated
		 */
		EClass IDL_BOUNDED_STRING = eINSTANCE.getIDLBoundedString();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_BOUNDED_STRING__MAX_LENGTH = eINSTANCE.getIDLBoundedString_MaxLength();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.BoundedStringImpl <em>Bounded String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.BoundedStringImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getBoundedString()
		 * @generated
		 */
		EClass BOUNDED_STRING = eINSTANCE.getBoundedString();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLCharacterArrayImpl <em>IDL Character Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLCharacterArrayImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLCharacterArray()
		 * @generated
		 */
		EClass IDL_CHARACTER_ARRAY = eINSTANCE.getIDLCharacterArray();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_CHARACTER_ARRAY__LENGTH = eINSTANCE.getIDLCharacterArray_Length();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.CharArrayImpl <em>Char Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.CharArrayImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharArray()
		 * @generated
		 */
		EClass CHAR_ARRAY = eINSTANCE.getCharArray();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.EnumerationImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLNumberImpl <em>IDL Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLNumberImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLNumber()
		 * @generated
		 */
		EClass IDL_NUMBER = eINSTANCE.getIDLNumber();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLIntegerImpl <em>IDL Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLIntegerImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLInteger()
		 * @generated
		 */
		EClass IDL_INTEGER = eINSTANCE.getIDLInteger();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ShortImpl <em>Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ShortImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getShort()
		 * @generated
		 */
		EClass SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.LongImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.LongLongImpl <em>Long Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.LongLongImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getLongLong()
		 * @generated
		 */
		EClass LONG_LONG = eINSTANCE.getLongLong();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLRealImpl <em>IDL Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLRealImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLReal()
		 * @generated
		 */
		EClass IDL_REAL = eINSTANCE.getIDLReal();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.DoubleImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.LongDoubleImpl <em>Long Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.LongDoubleImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getLongDouble()
		 * @generated
		 */
		EClass LONG_DOUBLE = eINSTANCE.getLongDouble();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.FloatImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.FixedImpl <em>Fixed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.FixedImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getFixed()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLUnsignedIntegerImpl <em>IDL Unsigned Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLUnsignedIntegerImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLUnsignedInteger()
		 * @generated
		 */
		EClass IDL_UNSIGNED_INTEGER = eINSTANCE.getIDLUnsignedInteger();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.UShortImpl <em>UShort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.UShortImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getUShort()
		 * @generated
		 */
		EClass USHORT = eINSTANCE.getUShort();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ULongImpl <em>ULong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ULongImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getULong()
		 * @generated
		 */
		EClass ULONG = eINSTANCE.getULong();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ULongLongImpl <em>ULong Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ULongLongImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getULongLong()
		 * @generated
		 */
		EClass ULONG_LONG = eINSTANCE.getULongLong();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLSequenceImpl <em>IDL Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLSequenceImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLSequence()
		 * @generated
		 */
		EClass IDL_SEQUENCE = eINSTANCE.getIDLSequence();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_SEQUENCE__MAX_SIZE = eINSTANCE.getIDLSequence_MaxSize();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLArrayImpl <em>IDL Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLArrayImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLArray()
		 * @generated
		 */
		EClass IDL_ARRAY = eINSTANCE.getIDLArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_ARRAY__SIZE = eINSTANCE.getIDLArray_Size();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLStructImpl <em>IDL Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLStructImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLStruct()
		 * @generated
		 */
		EClass IDL_STRUCT = eINSTANCE.getIDLStruct();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_STRUCT__COMPOSITION = eINSTANCE.getIDLStruct_Composition();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.IDLCompositionImpl <em>IDL Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.IDLCompositionImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getIDLComposition()
		 * @generated
		 */
		EClass IDL_COMPOSITION = eINSTANCE.getIDLComposition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_COMPOSITION__TYPE = eINSTANCE.getIDLComposition_Type();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_COMPOSITION__ROLENAME = eINSTANCE.getIDLComposition_Rolename();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_COMPOSITION__PRECISION = eINSTANCE.getIDLComposition_Precision();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_COMPOSITION__REALIZES = eINSTANCE.getIDLComposition_Realizes();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.CharacteristicImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharacteristic()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.EntityImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getEntity()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.CompositionImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getComposition()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.AssociationImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getAssociation()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ParticipantImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getParticipant()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.PathNodeImpl <em>Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.PathNodeImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getPathNode()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ParticipantPathNodeImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getParticipantPathNode()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.CharacteristicPathNodeImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCharacteristicPathNode()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.ViewImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.QueryImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getQuery()
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
		 * The meta object literal for the '{@link face.datamodel.platform.impl.CompositeTemplateImpl <em>Composite Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.CompositeTemplateImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getCompositeTemplate()
		 * @generated
		 */
		EClass COMPOSITE_TEMPLATE = eINSTANCE.getCompositeTemplate();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TEMPLATE__COMPOSITION = eINSTANCE.getCompositeTemplate_Composition();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TEMPLATE__REALIZES = eINSTANCE.getCompositeTemplate_Realizes();

		/**
		 * The meta object literal for the '<em><b>Is Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TEMPLATE__IS_UNION = eINSTANCE.getCompositeTemplate_IsUnion();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.TemplateCompositionImpl <em>Template Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.TemplateCompositionImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getTemplateComposition()
		 * @generated
		 */
		EClass TEMPLATE_COMPOSITION = eINSTANCE.getTemplateComposition();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_COMPOSITION__ROLENAME = eINSTANCE.getTemplateComposition_Rolename();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITION__REALIZES = eINSTANCE.getTemplateComposition_Realizes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITION__TYPE = eINSTANCE.getTemplateComposition_Type();

		/**
		 * The meta object literal for the '{@link face.datamodel.platform.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see face.datamodel.platform.impl.TemplateImpl
		 * @see face.datamodel.platform.impl.PlatformPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__SPECIFICATION = eINSTANCE.getTemplate_Specification();

		/**
		 * The meta object literal for the '<em><b>Bound Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__BOUND_QUERY = eINSTANCE.getTemplate_BoundQuery();

		/**
		 * The meta object literal for the '<em><b>Effective Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__EFFECTIVE_QUERY = eINSTANCE.getTemplate_EffectiveQuery();

	}

} //PlatformPackage
