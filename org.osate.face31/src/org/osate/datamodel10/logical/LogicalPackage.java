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
package org.osate.datamodel10.logical;

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
 * @see org.osate.datamodel10.logical.LogicalFactory
 * @model kind="package"
 * @generated
 */
public interface LogicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengroup.us/datamodel/logical/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logical";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicalPackage eINSTANCE = org.osate.datamodel10.logical.impl.LogicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ElementImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getElement()
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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ConvertibleElementImpl <em>Convertible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ConvertibleElementImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getConvertibleElement()
	 * @generated
	 */
	int CONVERTIBLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTIBLE_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTIBLE_ELEMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Convertible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTIBLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Convertible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTIBLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.UnitImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = CONVERTIBLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DESCRIPTION = CONVERTIBLE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = CONVERTIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = CONVERTIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ConversionImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getConversion()
	 * @generated
	 */
	int CONVERSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__DESTINATION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__SOURCE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.AffineConversionImpl <em>Affine Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.AffineConversionImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAffineConversion()
	 * @generated
	 */
	int AFFINE_CONVERSION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION__NAME = CONVERSION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION__DESCRIPTION = CONVERSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION__DESTINATION = CONVERSION__DESTINATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION__SOURCE = CONVERSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION__CONVERSION_FACTOR = CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION__OFFSET = CONVERSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Affine Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION_FEATURE_COUNT = CONVERSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Affine Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINE_CONVERSION_OPERATION_COUNT = CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ValueTypeImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.StringImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getString()
	 * @generated
	 */
	int STRING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__DESCRIPTION = VALUE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.CharacterImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__DESCRIPTION = VALUE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.BooleanImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DESCRIPTION = VALUE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.NumericImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__DESCRIPTION = VALUE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.IntegerImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = NUMERIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__DESCRIPTION = NUMERIC__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = NUMERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.NaturalImpl <em>Natural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.NaturalImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getNatural()
	 * @generated
	 */
	int NATURAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__NAME = NUMERIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL__DESCRIPTION = NUMERIC__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_OPERATION_COUNT = NUMERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.RealImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__NAME = NUMERIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__DESCRIPTION = NUMERIC__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = NUMERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.NonNegativeRealImpl <em>Non Negative Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.NonNegativeRealImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getNonNegativeReal()
	 * @generated
	 */
	int NON_NEGATIVE_REAL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL__NAME = NUMERIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL__DESCRIPTION = NUMERIC__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Non Negative Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Negative Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL_OPERATION_COUNT = NUMERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.EnumeratedImpl <em>Enumerated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.EnumeratedImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__DESCRIPTION = VALUE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__LABEL = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__STANDARD_REFERENCE = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.EnumerationLabelImpl <em>Enumeration Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.EnumerationLabelImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEnumerationLabel()
	 * @generated
	 */
	int ENUMERATION_LABEL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LABEL__NAME = DatamodelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LABEL__DESCRIPTION = DatamodelPackage.ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Enumeration Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LABEL_FEATURE_COUNT = DatamodelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LABEL_OPERATION_COUNT = DatamodelPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.CoordinateSystemImpl <em>Coordinate System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.CoordinateSystemImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCoordinateSystem()
	 * @generated
	 */
	int COORDINATE_SYSTEM = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__AXIS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Relationship Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angle Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__ANGLE_EQUATION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distance Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__DISTANCE_EQUATION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.CoordinateSystemAxisImpl <em>Coordinate System Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.CoordinateSystemAxisImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCoordinateSystemAxis()
	 * @generated
	 */
	int COORDINATE_SYSTEM_AXIS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_AXIS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_AXIS__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Coordinate System Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_AXIS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coordinate System Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_AXIS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.AbstractMeasurementSystemImpl <em>Abstract Measurement System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.AbstractMeasurementSystemImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAbstractMeasurementSystem()
	 * @generated
	 */
	int ABSTRACT_MEASUREMENT_SYSTEM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_SYSTEM__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_SYSTEM__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Abstract Measurement System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Measurement System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_SYSTEM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.StandardMeasurementSystemImpl <em>Standard Measurement System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.StandardMeasurementSystemImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getStandardMeasurementSystem()
	 * @generated
	 */
	int STANDARD_MEASUREMENT_SYSTEM = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_MEASUREMENT_SYSTEM__NAME = ABSTRACT_MEASUREMENT_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_MEASUREMENT_SYSTEM__DESCRIPTION = ABSTRACT_MEASUREMENT_SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Measurement System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_MEASUREMENT_SYSTEM_FEATURE_COUNT = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard Measurement System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_MEASUREMENT_SYSTEM_OPERATION_COUNT = ABSTRACT_MEASUREMENT_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.LandmarkImpl <em>Landmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.LandmarkImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getLandmark()
	 * @generated
	 */
	int LANDMARK = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Landmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Landmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementSystemImpl <em>Measurement System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementSystemImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementSystem()
	 * @generated
	 */
	int MEASUREMENT_SYSTEM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__NAME = ABSTRACT_MEASUREMENT_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__DESCRIPTION = ABSTRACT_MEASUREMENT_SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurement System Axis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__COORDINATE_SYSTEM = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__REFERENCE_POINT = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Standard Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__ORIENTATION = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM__CONSTRAINT = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Measurement System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_FEATURE_COUNT = ABSTRACT_MEASUREMENT_SYSTEM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Measurement System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_OPERATION_COUNT = ABSTRACT_MEASUREMENT_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementSystemAxisImpl <em>Measurement System Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementSystemAxisImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementSystemAxis()
	 * @generated
	 */
	int MEASUREMENT_SYSTEM_AXIS = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_AXIS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_AXIS__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_AXIS__AXIS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value Type Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_AXIS__CONSTRAINT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measurement System Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_AXIS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Measurement System Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_AXIS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ReferencePointImpl <em>Reference Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ReferencePointImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getReferencePoint()
	 * @generated
	 */
	int REFERENCE_POINT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT__NAME = DatamodelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT__DESCRIPTION = DatamodelPackage.ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference Point Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT__REFERENCE_POINT_PART = DatamodelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Landmark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT__LANDMARK = DatamodelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT_FEATURE_COUNT = DatamodelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT_OPERATION_COUNT = DatamodelPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ReferencePointPartImpl <em>Reference Point Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ReferencePointPartImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getReferencePointPart()
	 * @generated
	 */
	int REFERENCE_POINT_PART = 24;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT_PART__AXIS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT_PART__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Type Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT_PART__VALUE_TYPE_UNIT = 2;

	/**
	 * The number of structural features of the '<em>Reference Point Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT_PART_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference Point Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_POINT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ValueTypeUnitImpl <em>Value Type Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ValueTypeUnitImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getValueTypeUnit()
	 * @generated
	 */
	int VALUE_TYPE_UNIT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_UNIT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_UNIT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_UNIT__UNIT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_UNIT__VALUE_TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_UNIT__CONSTRAINT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Type Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_UNIT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Value Type Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_UNIT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = DatamodelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = DatamodelPackage.ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = DatamodelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = DatamodelPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.IntegerConstraintImpl <em>Integer Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.IntegerConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getIntegerConstraint()
	 * @generated
	 */
	int INTEGER_CONSTRAINT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Integer Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.IntegerRangeConstraintImpl <em>Integer Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.IntegerRangeConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getIntegerRangeConstraint()
	 * @generated
	 */
	int INTEGER_RANGE_CONSTRAINT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_CONSTRAINT__NAME = INTEGER_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_CONSTRAINT__DESCRIPTION = INTEGER_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_CONSTRAINT__LOWER_BOUND = INTEGER_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_CONSTRAINT__UPPER_BOUND = INTEGER_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_CONSTRAINT_FEATURE_COUNT = INTEGER_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_CONSTRAINT_OPERATION_COUNT = INTEGER_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.RealConstraintImpl <em>Real Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.RealConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getRealConstraint()
	 * @generated
	 */
	int REAL_CONSTRAINT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Real Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.RealRangeConstraintImpl <em>Real Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.RealRangeConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getRealRangeConstraint()
	 * @generated
	 */
	int REAL_RANGE_CONSTRAINT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT__NAME = REAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT__DESCRIPTION = REAL_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT__LOWER_BOUND = REAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT__UPPER_BOUND = REAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE = REAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE = REAL_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Real Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT_FEATURE_COUNT = REAL_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Real Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_RANGE_CONSTRAINT_OPERATION_COUNT = REAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.StringConstraintImpl <em>String Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.StringConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getStringConstraint()
	 * @generated
	 */
	int STRING_CONSTRAINT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>String Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.RegularExpressionConstraintImpl <em>Regular Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.RegularExpressionConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getRegularExpressionConstraint()
	 * @generated
	 */
	int REGULAR_EXPRESSION_CONSTRAINT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION_CONSTRAINT__NAME = STRING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION_CONSTRAINT__DESCRIPTION = STRING_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION_CONSTRAINT__EXPRESSION = STRING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regular Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION_CONSTRAINT_FEATURE_COUNT = STRING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regular Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EXPRESSION_CONSTRAINT_OPERATION_COUNT = STRING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.FixedLengthStringConstraintImpl <em>Fixed Length String Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.FixedLengthStringConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getFixedLengthStringConstraint()
	 * @generated
	 */
	int FIXED_LENGTH_STRING_CONSTRAINT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LENGTH_STRING_CONSTRAINT__NAME = STRING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LENGTH_STRING_CONSTRAINT__DESCRIPTION = STRING_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LENGTH_STRING_CONSTRAINT__LENGTH = STRING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Length String Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LENGTH_STRING_CONSTRAINT_FEATURE_COUNT = STRING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed Length String Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LENGTH_STRING_CONSTRAINT_OPERATION_COUNT = STRING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.EnumerationConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEnumerationConstraint()
	 * @generated
	 */
	int ENUMERATION_CONSTRAINT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allowed Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__ALLOWED_VALUE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementConstraintImpl <em>Measurement Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementConstraintImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementConstraint()
	 * @generated
	 */
	int MEASUREMENT_CONSTRAINT = 35;

	/**
	 * The feature id for the '<em><b>Constraint Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Measurement Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Measurement Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementSystemConversionImpl <em>Measurement System Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementSystemConversionImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementSystemConversion()
	 * @generated
	 */
	int MEASUREMENT_SYSTEM_CONVERSION = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION__SOURCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION__EQUATION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conversion Loss Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measurement System Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measurement System Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SYSTEM_CONVERSION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.AbstractMeasurementImpl <em>Abstract Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.AbstractMeasurementImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAbstractMeasurement()
	 * @generated
	 */
	int ABSTRACT_MEASUREMENT = 37;

	/**
	 * The number of structural features of the '<em>Abstract Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ComposableElementImpl <em>Composable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ComposableElementImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getComposableElement()
	 * @generated
	 */
	int COMPOSABLE_ELEMENT = 42;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = COMPOSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DESCRIPTION = COMPOSABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__CONSTRAINT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Axis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_AXIS = COMPOSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurement System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_SYSTEM = COMPOSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__REALIZES = COMPOSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ATTRIBUTE = COMPOSABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = COMPOSABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = COMPOSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementAxisImpl <em>Measurement Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementAxisImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementAxis()
	 * @generated
	 */
	int MEASUREMENT_AXIS = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS__VALUE_TYPE_UNIT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement System Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS__CONSTRAINT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS__REALIZES = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measurement Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measurement Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_AXIS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementAttributeImpl <em>Measurement Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementAttributeImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementAttribute()
	 * @generated
	 */
	int MEASUREMENT_ATTRIBUTE = 40;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_ATTRIBUTE__ROLENAME = 1;

	/**
	 * The number of structural features of the '<em>Measurement Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measurement Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.MeasurementConversionImpl <em>Measurement Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.MeasurementConversionImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementConversion()
	 * @generated
	 */
	int MEASUREMENT_CONVERSION = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION__EQUATION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conversion Loss Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION__SOURCE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION__TARGET = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measurement Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measurement Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_CONVERSION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.CharacteristicImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 43;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ROLENAME = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__UPPER_BOUND = 2;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.EntityImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 44;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.CompositionImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 45;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__ROLENAME = CHARACTERISTIC__ROLENAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__LOWER_BOUND = CHARACTERISTIC__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__UPPER_BOUND = CHARACTERISTIC__UPPER_BOUND;

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
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.AssociationImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 46;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ParticipantImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 47;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ROLENAME = CHARACTERISTIC__ROLENAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__LOWER_BOUND = CHARACTERISTIC__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__UPPER_BOUND = CHARACTERISTIC__UPPER_BOUND;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.PathNodeImpl <em>Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.PathNodeImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getPathNode()
	 * @generated
	 */
	int PATH_NODE = 48;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ParticipantPathNodeImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getParticipantPathNode()
	 * @generated
	 */
	int PARTICIPANT_PATH_NODE = 49;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.CharacteristicPathNodeImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCharacteristicPathNode()
	 * @generated
	 */
	int CHARACTERISTIC_PATH_NODE = 50;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.ViewImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 51;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.QueryImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DESCRIPTION = VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__REALIZES = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SPECIFICATION = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.CompositeQueryImpl <em>Composite Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.CompositeQueryImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCompositeQuery()
	 * @generated
	 */
	int COMPOSITE_QUERY = 53;

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
	 * The meta object id for the '{@link org.osate.datamodel10.logical.impl.QueryCompositionImpl <em>Query Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osate.datamodel10.logical.impl.QueryCompositionImpl
	 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getQueryComposition()
	 * @generated
	 */
	int QUERY_COMPOSITION = 54;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION__REALIZES = 0;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COMPOSITION__ROLENAME = 1;

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
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.osate.datamodel10.logical.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.ConvertibleElement <em>Convertible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convertible Element</em>'.
	 * @see org.osate.datamodel10.logical.ConvertibleElement
	 * @generated
	 */
	EClass getConvertibleElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.osate.datamodel10.logical.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see org.osate.datamodel10.logical.Conversion
	 * @generated
	 */
	EClass getConversion();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Conversion#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.osate.datamodel10.logical.Conversion#getDestination()
	 * @see #getConversion()
	 * @generated
	 */
	EReference getConversion_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Conversion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.osate.datamodel10.logical.Conversion#getSource()
	 * @see #getConversion()
	 * @generated
	 */
	EReference getConversion_Source();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.AffineConversion <em>Affine Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affine Conversion</em>'.
	 * @see org.osate.datamodel10.logical.AffineConversion
	 * @generated
	 */
	EClass getAffineConversion();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.AffineConversion#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see org.osate.datamodel10.logical.AffineConversion#getConversionFactor()
	 * @see #getAffineConversion()
	 * @generated
	 */
	EAttribute getAffineConversion_ConversionFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.AffineConversion#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.osate.datamodel10.logical.AffineConversion#getOffset()
	 * @see #getAffineConversion()
	 * @generated
	 */
	EAttribute getAffineConversion_Offset();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.osate.datamodel10.logical.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.osate.datamodel10.logical.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see org.osate.datamodel10.logical.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.osate.datamodel10.logical.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see org.osate.datamodel10.logical.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.osate.datamodel10.logical.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Natural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural</em>'.
	 * @see org.osate.datamodel10.logical.Natural
	 * @generated
	 */
	EClass getNatural();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see org.osate.datamodel10.logical.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.NonNegativeReal <em>Non Negative Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Negative Real</em>'.
	 * @see org.osate.datamodel10.logical.NonNegativeReal
	 * @generated
	 */
	EClass getNonNegativeReal();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated</em>'.
	 * @see org.osate.datamodel10.logical.Enumerated
	 * @generated
	 */
	EClass getEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.Enumerated#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.osate.datamodel10.logical.Enumerated#getLabel()
	 * @see #getEnumerated()
	 * @generated
	 */
	EReference getEnumerated_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Enumerated#getStandardReference <em>Standard Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Reference</em>'.
	 * @see org.osate.datamodel10.logical.Enumerated#getStandardReference()
	 * @see #getEnumerated()
	 * @generated
	 */
	EAttribute getEnumerated_StandardReference();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.EnumerationLabel <em>Enumeration Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Label</em>'.
	 * @see org.osate.datamodel10.logical.EnumerationLabel
	 * @generated
	 */
	EClass getEnumerationLabel();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.CoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate System</em>'.
	 * @see org.osate.datamodel10.logical.CoordinateSystem
	 * @generated
	 */
	EClass getCoordinateSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.logical.CoordinateSystem#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Axis</em>'.
	 * @see org.osate.datamodel10.logical.CoordinateSystem#getAxis()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EReference getCoordinateSystem_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.CoordinateSystem#getAxisRelationshipDescription <em>Axis Relationship Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Relationship Description</em>'.
	 * @see org.osate.datamodel10.logical.CoordinateSystem#getAxisRelationshipDescription()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EAttribute getCoordinateSystem_AxisRelationshipDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.CoordinateSystem#getAngleEquation <em>Angle Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle Equation</em>'.
	 * @see org.osate.datamodel10.logical.CoordinateSystem#getAngleEquation()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EAttribute getCoordinateSystem_AngleEquation();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.CoordinateSystem#getDistanceEquation <em>Distance Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Equation</em>'.
	 * @see org.osate.datamodel10.logical.CoordinateSystem#getDistanceEquation()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EAttribute getCoordinateSystem_DistanceEquation();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.CoordinateSystemAxis <em>Coordinate System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate System Axis</em>'.
	 * @see org.osate.datamodel10.logical.CoordinateSystemAxis
	 * @generated
	 */
	EClass getCoordinateSystemAxis();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.AbstractMeasurementSystem <em>Abstract Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Measurement System</em>'.
	 * @see org.osate.datamodel10.logical.AbstractMeasurementSystem
	 * @generated
	 */
	EClass getAbstractMeasurementSystem();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.StandardMeasurementSystem <em>Standard Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Measurement System</em>'.
	 * @see org.osate.datamodel10.logical.StandardMeasurementSystem
	 * @generated
	 */
	EClass getStandardMeasurementSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.StandardMeasurementSystem#getReferenceStandard <em>Reference Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Standard</em>'.
	 * @see org.osate.datamodel10.logical.StandardMeasurementSystem#getReferenceStandard()
	 * @see #getStandardMeasurementSystem()
	 * @generated
	 */
	EAttribute getStandardMeasurementSystem_ReferenceStandard();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Landmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landmark</em>'.
	 * @see org.osate.datamodel10.logical.Landmark
	 * @generated
	 */
	EClass getLandmark();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.MeasurementSystem <em>Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement System</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystem
	 * @generated
	 */
	EClass getMeasurementSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.logical.MeasurementSystem#getMeasurementSystemAxis <em>Measurement System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement System Axis</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystem#getMeasurementSystemAxis()
	 * @see #getMeasurementSystem()
	 * @generated
	 */
	EReference getMeasurementSystem_MeasurementSystemAxis();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementSystem#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinate System</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystem#getCoordinateSystem()
	 * @see #getMeasurementSystem()
	 * @generated
	 */
	EReference getMeasurementSystem_CoordinateSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.MeasurementSystem#getReferencePoint <em>Reference Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Point</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystem#getReferencePoint()
	 * @see #getMeasurementSystem()
	 * @generated
	 */
	EReference getMeasurementSystem_ReferencePoint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.MeasurementSystem#getExternalStandardReference <em>External Standard Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Standard Reference</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystem#getExternalStandardReference()
	 * @see #getMeasurementSystem()
	 * @generated
	 */
	EAttribute getMeasurementSystem_ExternalStandardReference();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.MeasurementSystem#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystem#getOrientation()
	 * @see #getMeasurementSystem()
	 * @generated
	 */
	EAttribute getMeasurementSystem_Orientation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.MeasurementSystem#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystem#getConstraint()
	 * @see #getMeasurementSystem()
	 * @generated
	 */
	EReference getMeasurementSystem_Constraint();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.MeasurementSystemAxis <em>Measurement System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement System Axis</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemAxis
	 * @generated
	 */
	EClass getMeasurementSystemAxis();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementSystemAxis#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Axis</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemAxis#getAxis()
	 * @see #getMeasurementSystemAxis()
	 * @generated
	 */
	EReference getMeasurementSystemAxis_Axis();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.logical.MeasurementSystemAxis#getDefaultValueTypeUnit <em>Default Value Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Value Type Unit</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemAxis#getDefaultValueTypeUnit()
	 * @see #getMeasurementSystemAxis()
	 * @generated
	 */
	EReference getMeasurementSystemAxis_DefaultValueTypeUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.MeasurementSystemAxis#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemAxis#getConstraint()
	 * @see #getMeasurementSystemAxis()
	 * @generated
	 */
	EReference getMeasurementSystemAxis_Constraint();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.ReferencePoint <em>Reference Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Point</em>'.
	 * @see org.osate.datamodel10.logical.ReferencePoint
	 * @generated
	 */
	EClass getReferencePoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.ReferencePoint#getReferencePointPart <em>Reference Point Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Point Part</em>'.
	 * @see org.osate.datamodel10.logical.ReferencePoint#getReferencePointPart()
	 * @see #getReferencePoint()
	 * @generated
	 */
	EReference getReferencePoint_ReferencePointPart();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.ReferencePoint#getLandmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Landmark</em>'.
	 * @see org.osate.datamodel10.logical.ReferencePoint#getLandmark()
	 * @see #getReferencePoint()
	 * @generated
	 */
	EReference getReferencePoint_Landmark();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.ReferencePointPart <em>Reference Point Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Point Part</em>'.
	 * @see org.osate.datamodel10.logical.ReferencePointPart
	 * @generated
	 */
	EClass getReferencePointPart();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.ReferencePointPart#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Axis</em>'.
	 * @see org.osate.datamodel10.logical.ReferencePointPart#getAxis()
	 * @see #getReferencePointPart()
	 * @generated
	 */
	EReference getReferencePointPart_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.ReferencePointPart#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.osate.datamodel10.logical.ReferencePointPart#getValue()
	 * @see #getReferencePointPart()
	 * @generated
	 */
	EAttribute getReferencePointPart_Value();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.ReferencePointPart#getValueTypeUnit <em>Value Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type Unit</em>'.
	 * @see org.osate.datamodel10.logical.ReferencePointPart#getValueTypeUnit()
	 * @see #getReferencePointPart()
	 * @generated
	 */
	EReference getReferencePointPart_ValueTypeUnit();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.ValueTypeUnit <em>Value Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type Unit</em>'.
	 * @see org.osate.datamodel10.logical.ValueTypeUnit
	 * @generated
	 */
	EClass getValueTypeUnit();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.ValueTypeUnit#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.osate.datamodel10.logical.ValueTypeUnit#getUnit()
	 * @see #getValueTypeUnit()
	 * @generated
	 */
	EReference getValueTypeUnit_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.ValueTypeUnit#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see org.osate.datamodel10.logical.ValueTypeUnit#getValueType()
	 * @see #getValueTypeUnit()
	 * @generated
	 */
	EReference getValueTypeUnit_ValueType();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.datamodel10.logical.ValueTypeUnit#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.osate.datamodel10.logical.ValueTypeUnit#getConstraint()
	 * @see #getValueTypeUnit()
	 * @generated
	 */
	EReference getValueTypeUnit_Constraint();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.osate.datamodel10.logical.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.IntegerConstraint <em>Integer Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constraint</em>'.
	 * @see org.osate.datamodel10.logical.IntegerConstraint
	 * @generated
	 */
	EClass getIntegerConstraint();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.IntegerRangeConstraint <em>Integer Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Range Constraint</em>'.
	 * @see org.osate.datamodel10.logical.IntegerRangeConstraint
	 * @generated
	 */
	EClass getIntegerRangeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.IntegerRangeConstraint#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.osate.datamodel10.logical.IntegerRangeConstraint#getLowerBound()
	 * @see #getIntegerRangeConstraint()
	 * @generated
	 */
	EAttribute getIntegerRangeConstraint_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.IntegerRangeConstraint#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.osate.datamodel10.logical.IntegerRangeConstraint#getUpperBound()
	 * @see #getIntegerRangeConstraint()
	 * @generated
	 */
	EAttribute getIntegerRangeConstraint_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.RealConstraint <em>Real Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Constraint</em>'.
	 * @see org.osate.datamodel10.logical.RealConstraint
	 * @generated
	 */
	EClass getRealConstraint();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.RealRangeConstraint <em>Real Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Range Constraint</em>'.
	 * @see org.osate.datamodel10.logical.RealRangeConstraint
	 * @generated
	 */
	EClass getRealRangeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.RealRangeConstraint#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.osate.datamodel10.logical.RealRangeConstraint#getLowerBound()
	 * @see #getRealRangeConstraint()
	 * @generated
	 */
	EAttribute getRealRangeConstraint_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.RealRangeConstraint#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.osate.datamodel10.logical.RealRangeConstraint#getUpperBound()
	 * @see #getRealRangeConstraint()
	 * @generated
	 */
	EAttribute getRealRangeConstraint_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.RealRangeConstraint#isLowerBoundInclusive <em>Lower Bound Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound Inclusive</em>'.
	 * @see org.osate.datamodel10.logical.RealRangeConstraint#isLowerBoundInclusive()
	 * @see #getRealRangeConstraint()
	 * @generated
	 */
	EAttribute getRealRangeConstraint_LowerBoundInclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.RealRangeConstraint#isUpperBoundInclusive <em>Upper Bound Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound Inclusive</em>'.
	 * @see org.osate.datamodel10.logical.RealRangeConstraint#isUpperBoundInclusive()
	 * @see #getRealRangeConstraint()
	 * @generated
	 */
	EAttribute getRealRangeConstraint_UpperBoundInclusive();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.StringConstraint <em>String Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constraint</em>'.
	 * @see org.osate.datamodel10.logical.StringConstraint
	 * @generated
	 */
	EClass getStringConstraint();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.RegularExpressionConstraint <em>Regular Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Expression Constraint</em>'.
	 * @see org.osate.datamodel10.logical.RegularExpressionConstraint
	 * @generated
	 */
	EClass getRegularExpressionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.RegularExpressionConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.osate.datamodel10.logical.RegularExpressionConstraint#getExpression()
	 * @see #getRegularExpressionConstraint()
	 * @generated
	 */
	EAttribute getRegularExpressionConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.FixedLengthStringConstraint <em>Fixed Length String Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Length String Constraint</em>'.
	 * @see org.osate.datamodel10.logical.FixedLengthStringConstraint
	 * @generated
	 */
	EClass getFixedLengthStringConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.FixedLengthStringConstraint#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.osate.datamodel10.logical.FixedLengthStringConstraint#getLength()
	 * @see #getFixedLengthStringConstraint()
	 * @generated
	 */
	EAttribute getFixedLengthStringConstraint_Length();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Constraint</em>'.
	 * @see org.osate.datamodel10.logical.EnumerationConstraint
	 * @generated
	 */
	EClass getEnumerationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.logical.EnumerationConstraint#getAllowedValue <em>Allowed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Value</em>'.
	 * @see org.osate.datamodel10.logical.EnumerationConstraint#getAllowedValue()
	 * @see #getEnumerationConstraint()
	 * @generated
	 */
	EReference getEnumerationConstraint_AllowedValue();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.MeasurementConstraint <em>Measurement Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Constraint</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementConstraint
	 * @generated
	 */
	EClass getMeasurementConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.MeasurementConstraint#getConstraintText <em>Constraint Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Text</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementConstraint#getConstraintText()
	 * @see #getMeasurementConstraint()
	 * @generated
	 */
	EAttribute getMeasurementConstraint_ConstraintText();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.MeasurementSystemConversion <em>Measurement System Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement System Conversion</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemConversion
	 * @generated
	 */
	EClass getMeasurementSystemConversion();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementSystemConversion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemConversion#getSource()
	 * @see #getMeasurementSystemConversion()
	 * @generated
	 */
	EReference getMeasurementSystemConversion_Source();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementSystemConversion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemConversion#getTarget()
	 * @see #getMeasurementSystemConversion()
	 * @generated
	 */
	EReference getMeasurementSystemConversion_Target();

	/**
	 * Returns the meta object for the attribute list '{@link org.osate.datamodel10.logical.MeasurementSystemConversion#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Equation</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemConversion#getEquation()
	 * @see #getMeasurementSystemConversion()
	 * @generated
	 */
	EAttribute getMeasurementSystemConversion_Equation();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.MeasurementSystemConversion#getConversionLossDescription <em>Conversion Loss Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Loss Description</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementSystemConversion#getConversionLossDescription()
	 * @see #getMeasurementSystemConversion()
	 * @generated
	 */
	EAttribute getMeasurementSystemConversion_ConversionLossDescription();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.AbstractMeasurement <em>Abstract Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Measurement</em>'.
	 * @see org.osate.datamodel10.logical.AbstractMeasurement
	 * @generated
	 */
	EClass getAbstractMeasurement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see org.osate.datamodel10.logical.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.Measurement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.osate.datamodel10.logical.Measurement#getConstraint()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.logical.Measurement#getMeasurementAxis <em>Measurement Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Axis</em>'.
	 * @see org.osate.datamodel10.logical.Measurement#getMeasurementAxis()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MeasurementAxis();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Measurement#getMeasurementSystem <em>Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement System</em>'.
	 * @see org.osate.datamodel10.logical.Measurement#getMeasurementSystem()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MeasurementSystem();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Measurement#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.Measurement#getRealizes()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Realizes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.Measurement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.osate.datamodel10.logical.Measurement#getAttribute()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Attribute();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.MeasurementAxis <em>Measurement Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Axis</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAxis
	 * @generated
	 */
	EClass getMeasurementAxis();

	/**
	 * Returns the meta object for the reference list '{@link org.osate.datamodel10.logical.MeasurementAxis#getValueTypeUnit <em>Value Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Type Unit</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAxis#getValueTypeUnit()
	 * @see #getMeasurementAxis()
	 * @generated
	 */
	EReference getMeasurementAxis_ValueTypeUnit();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementAxis#getMeasurementSystemAxis <em>Measurement System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement System Axis</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAxis#getMeasurementSystemAxis()
	 * @see #getMeasurementAxis()
	 * @generated
	 */
	EReference getMeasurementAxis_MeasurementSystemAxis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.MeasurementAxis#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAxis#getConstraint()
	 * @see #getMeasurementAxis()
	 * @generated
	 */
	EReference getMeasurementAxis_Constraint();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementAxis#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAxis#getRealizes()
	 * @see #getMeasurementAxis()
	 * @generated
	 */
	EReference getMeasurementAxis_Realizes();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.MeasurementAttribute <em>Measurement Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Attribute</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAttribute
	 * @generated
	 */
	EClass getMeasurementAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAttribute#getType()
	 * @see #getMeasurementAttribute()
	 * @generated
	 */
	EReference getMeasurementAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.MeasurementAttribute#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementAttribute#getRolename()
	 * @see #getMeasurementAttribute()
	 * @generated
	 */
	EAttribute getMeasurementAttribute_Rolename();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.MeasurementConversion <em>Measurement Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Conversion</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementConversion
	 * @generated
	 */
	EClass getMeasurementConversion();

	/**
	 * Returns the meta object for the attribute list '{@link org.osate.datamodel10.logical.MeasurementConversion#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Equation</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementConversion#getEquation()
	 * @see #getMeasurementConversion()
	 * @generated
	 */
	EAttribute getMeasurementConversion_Equation();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.MeasurementConversion#getConversionLossDescription <em>Conversion Loss Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Loss Description</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementConversion#getConversionLossDescription()
	 * @see #getMeasurementConversion()
	 * @generated
	 */
	EAttribute getMeasurementConversion_ConversionLossDescription();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementConversion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementConversion#getSource()
	 * @see #getMeasurementConversion()
	 * @generated
	 */
	EReference getMeasurementConversion_Source();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.MeasurementConversion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.osate.datamodel10.logical.MeasurementConversion#getTarget()
	 * @see #getMeasurementConversion()
	 * @generated
	 */
	EReference getMeasurementConversion_Target();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composable Element</em>'.
	 * @see org.osate.datamodel10.logical.ComposableElement
	 * @generated
	 */
	EClass getComposableElement();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see org.osate.datamodel10.logical.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Characteristic#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.logical.Characteristic#getRolename()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Rolename();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Characteristic#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.osate.datamodel10.logical.Characteristic#getLowerBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Characteristic#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.osate.datamodel10.logical.Characteristic#getUpperBound()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Characteristic#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see org.osate.datamodel10.logical.Characteristic#getSpecializes()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Specializes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Characteristic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.osate.datamodel10.logical.Characteristic#getDescription()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Description();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.osate.datamodel10.logical.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.Entity#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.osate.datamodel10.logical.Entity#getComposition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Composition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Entity#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.Entity#getRealizes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Realizes();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Entity#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see org.osate.datamodel10.logical.Entity#getSpecializes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Specializes();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see org.osate.datamodel10.logical.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Composition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.logical.Composition#getType()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Type();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Composition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.Composition#getRealizes()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Realizes();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.osate.datamodel10.logical.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.Association#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.osate.datamodel10.logical.Association#getParticipant()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Participant();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.osate.datamodel10.logical.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Participant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.logical.Participant#getType()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Type();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Participant#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.Participant#getRealizes()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Participant#getSourceLowerBound <em>Source Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Lower Bound</em>'.
	 * @see org.osate.datamodel10.logical.Participant#getSourceLowerBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Participant#getSourceUpperBound <em>Source Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Upper Bound</em>'.
	 * @see org.osate.datamodel10.logical.Participant#getSourceUpperBound()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_SourceUpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.datamodel10.logical.Participant#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.osate.datamodel10.logical.Participant#getPath()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Path();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Node</em>'.
	 * @see org.osate.datamodel10.logical.PathNode
	 * @generated
	 */
	EClass getPathNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.osate.datamodel10.logical.PathNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.osate.datamodel10.logical.PathNode#getNode()
	 * @see #getPathNode()
	 * @generated
	 */
	EReference getPathNode_Node();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Path Node</em>'.
	 * @see org.osate.datamodel10.logical.ParticipantPathNode
	 * @generated
	 */
	EClass getParticipantPathNode();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.ParticipantPathNode#getProjectedParticipant <em>Projected Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Participant</em>'.
	 * @see org.osate.datamodel10.logical.ParticipantPathNode#getProjectedParticipant()
	 * @see #getParticipantPathNode()
	 * @generated
	 */
	EReference getParticipantPathNode_ProjectedParticipant();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Path Node</em>'.
	 * @see org.osate.datamodel10.logical.CharacteristicPathNode
	 * @generated
	 */
	EClass getCharacteristicPathNode();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.CharacteristicPathNode#getProjectedCharacteristic <em>Projected Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Characteristic</em>'.
	 * @see org.osate.datamodel10.logical.CharacteristicPathNode#getProjectedCharacteristic()
	 * @see #getCharacteristicPathNode()
	 * @generated
	 */
	EReference getCharacteristicPathNode_ProjectedCharacteristic();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.osate.datamodel10.logical.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.osate.datamodel10.logical.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.Query#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.Query#getRealizes()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.Query#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.osate.datamodel10.logical.Query#getSpecification()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Specification();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.CompositeQuery <em>Composite Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Query</em>'.
	 * @see org.osate.datamodel10.logical.CompositeQuery
	 * @generated
	 */
	EClass getCompositeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.osate.datamodel10.logical.CompositeQuery#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see org.osate.datamodel10.logical.CompositeQuery#getComposition()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EReference getCompositeQuery_Composition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.CompositeQuery#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.CompositeQuery#getRealizes()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EReference getCompositeQuery_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.CompositeQuery#isIsUnion <em>Is Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Union</em>'.
	 * @see org.osate.datamodel10.logical.CompositeQuery#isIsUnion()
	 * @see #getCompositeQuery()
	 * @generated
	 */
	EAttribute getCompositeQuery_IsUnion();

	/**
	 * Returns the meta object for class '{@link org.osate.datamodel10.logical.QueryComposition <em>Query Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Composition</em>'.
	 * @see org.osate.datamodel10.logical.QueryComposition
	 * @generated
	 */
	EClass getQueryComposition();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.QueryComposition#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see org.osate.datamodel10.logical.QueryComposition#getRealizes()
	 * @see #getQueryComposition()
	 * @generated
	 */
	EReference getQueryComposition_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link org.osate.datamodel10.logical.QueryComposition#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see org.osate.datamodel10.logical.QueryComposition#getRolename()
	 * @see #getQueryComposition()
	 * @generated
	 */
	EAttribute getQueryComposition_Rolename();

	/**
	 * Returns the meta object for the reference '{@link org.osate.datamodel10.logical.QueryComposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.osate.datamodel10.logical.QueryComposition#getType()
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
	LogicalFactory getLogicalFactory();

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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ElementImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ConvertibleElementImpl <em>Convertible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ConvertibleElementImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getConvertibleElement()
		 * @generated
		 */
		EClass CONVERTIBLE_ELEMENT = eINSTANCE.getConvertibleElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.UnitImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ConversionImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getConversion()
		 * @generated
		 */
		EClass CONVERSION = eINSTANCE.getConversion();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION__DESTINATION = eINSTANCE.getConversion_Destination();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION__SOURCE = eINSTANCE.getConversion_Source();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.AffineConversionImpl <em>Affine Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.AffineConversionImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAffineConversion()
		 * @generated
		 */
		EClass AFFINE_CONVERSION = eINSTANCE.getAffineConversion();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFINE_CONVERSION__CONVERSION_FACTOR = eINSTANCE.getAffineConversion_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFINE_CONVERSION__OFFSET = eINSTANCE.getAffineConversion_Offset();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ValueTypeImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.StringImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.CharacterImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.BooleanImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.NumericImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.IntegerImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.NaturalImpl <em>Natural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.NaturalImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getNatural()
		 * @generated
		 */
		EClass NATURAL = eINSTANCE.getNatural();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.RealImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.NonNegativeRealImpl <em>Non Negative Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.NonNegativeRealImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getNonNegativeReal()
		 * @generated
		 */
		EClass NON_NEGATIVE_REAL = eINSTANCE.getNonNegativeReal();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.EnumeratedImpl <em>Enumerated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.EnumeratedImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEnumerated()
		 * @generated
		 */
		EClass ENUMERATED = eINSTANCE.getEnumerated();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED__LABEL = eINSTANCE.getEnumerated_Label();

		/**
		 * The meta object literal for the '<em><b>Standard Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATED__STANDARD_REFERENCE = eINSTANCE.getEnumerated_StandardReference();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.EnumerationLabelImpl <em>Enumeration Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.EnumerationLabelImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEnumerationLabel()
		 * @generated
		 */
		EClass ENUMERATION_LABEL = eINSTANCE.getEnumerationLabel();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.CoordinateSystemImpl <em>Coordinate System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.CoordinateSystemImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCoordinateSystem()
		 * @generated
		 */
		EClass COORDINATE_SYSTEM = eINSTANCE.getCoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_SYSTEM__AXIS = eINSTANCE.getCoordinateSystem_Axis();

		/**
		 * The meta object literal for the '<em><b>Axis Relationship Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION = eINSTANCE.getCoordinateSystem_AxisRelationshipDescription();

		/**
		 * The meta object literal for the '<em><b>Angle Equation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_SYSTEM__ANGLE_EQUATION = eINSTANCE.getCoordinateSystem_AngleEquation();

		/**
		 * The meta object literal for the '<em><b>Distance Equation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_SYSTEM__DISTANCE_EQUATION = eINSTANCE.getCoordinateSystem_DistanceEquation();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.CoordinateSystemAxisImpl <em>Coordinate System Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.CoordinateSystemAxisImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCoordinateSystemAxis()
		 * @generated
		 */
		EClass COORDINATE_SYSTEM_AXIS = eINSTANCE.getCoordinateSystemAxis();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.AbstractMeasurementSystemImpl <em>Abstract Measurement System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.AbstractMeasurementSystemImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAbstractMeasurementSystem()
		 * @generated
		 */
		EClass ABSTRACT_MEASUREMENT_SYSTEM = eINSTANCE.getAbstractMeasurementSystem();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.StandardMeasurementSystemImpl <em>Standard Measurement System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.StandardMeasurementSystemImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getStandardMeasurementSystem()
		 * @generated
		 */
		EClass STANDARD_MEASUREMENT_SYSTEM = eINSTANCE.getStandardMeasurementSystem();

		/**
		 * The meta object literal for the '<em><b>Reference Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD = eINSTANCE.getStandardMeasurementSystem_ReferenceStandard();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.LandmarkImpl <em>Landmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.LandmarkImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getLandmark()
		 * @generated
		 */
		EClass LANDMARK = eINSTANCE.getLandmark();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementSystemImpl <em>Measurement System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementSystemImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementSystem()
		 * @generated
		 */
		EClass MEASUREMENT_SYSTEM = eINSTANCE.getMeasurementSystem();

		/**
		 * The meta object literal for the '<em><b>Measurement System Axis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS = eINSTANCE.getMeasurementSystem_MeasurementSystemAxis();

		/**
		 * The meta object literal for the '<em><b>Coordinate System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM__COORDINATE_SYSTEM = eINSTANCE.getMeasurementSystem_CoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Reference Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM__REFERENCE_POINT = eINSTANCE.getMeasurementSystem_ReferencePoint();

		/**
		 * The meta object literal for the '<em><b>External Standard Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE = eINSTANCE.getMeasurementSystem_ExternalStandardReference();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SYSTEM__ORIENTATION = eINSTANCE.getMeasurementSystem_Orientation();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM__CONSTRAINT = eINSTANCE.getMeasurementSystem_Constraint();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementSystemAxisImpl <em>Measurement System Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementSystemAxisImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementSystemAxis()
		 * @generated
		 */
		EClass MEASUREMENT_SYSTEM_AXIS = eINSTANCE.getMeasurementSystemAxis();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM_AXIS__AXIS = eINSTANCE.getMeasurementSystemAxis_Axis();

		/**
		 * The meta object literal for the '<em><b>Default Value Type Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT = eINSTANCE.getMeasurementSystemAxis_DefaultValueTypeUnit();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM_AXIS__CONSTRAINT = eINSTANCE.getMeasurementSystemAxis_Constraint();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ReferencePointImpl <em>Reference Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ReferencePointImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getReferencePoint()
		 * @generated
		 */
		EClass REFERENCE_POINT = eINSTANCE.getReferencePoint();

		/**
		 * The meta object literal for the '<em><b>Reference Point Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_POINT__REFERENCE_POINT_PART = eINSTANCE.getReferencePoint_ReferencePointPart();

		/**
		 * The meta object literal for the '<em><b>Landmark</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_POINT__LANDMARK = eINSTANCE.getReferencePoint_Landmark();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ReferencePointPartImpl <em>Reference Point Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ReferencePointPartImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getReferencePointPart()
		 * @generated
		 */
		EClass REFERENCE_POINT_PART = eINSTANCE.getReferencePointPart();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_POINT_PART__AXIS = eINSTANCE.getReferencePointPart_Axis();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_POINT_PART__VALUE = eINSTANCE.getReferencePointPart_Value();

		/**
		 * The meta object literal for the '<em><b>Value Type Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_POINT_PART__VALUE_TYPE_UNIT = eINSTANCE.getReferencePointPart_ValueTypeUnit();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ValueTypeUnitImpl <em>Value Type Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ValueTypeUnitImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getValueTypeUnit()
		 * @generated
		 */
		EClass VALUE_TYPE_UNIT = eINSTANCE.getValueTypeUnit();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE_UNIT__UNIT = eINSTANCE.getValueTypeUnit_Unit();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE_UNIT__VALUE_TYPE = eINSTANCE.getValueTypeUnit_ValueType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE_UNIT__CONSTRAINT = eINSTANCE.getValueTypeUnit_Constraint();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.IntegerConstraintImpl <em>Integer Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.IntegerConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getIntegerConstraint()
		 * @generated
		 */
		EClass INTEGER_CONSTRAINT = eINSTANCE.getIntegerConstraint();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.IntegerRangeConstraintImpl <em>Integer Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.IntegerRangeConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getIntegerRangeConstraint()
		 * @generated
		 */
		EClass INTEGER_RANGE_CONSTRAINT = eINSTANCE.getIntegerRangeConstraint();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGE_CONSTRAINT__LOWER_BOUND = eINSTANCE.getIntegerRangeConstraint_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGE_CONSTRAINT__UPPER_BOUND = eINSTANCE.getIntegerRangeConstraint_UpperBound();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.RealConstraintImpl <em>Real Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.RealConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getRealConstraint()
		 * @generated
		 */
		EClass REAL_CONSTRAINT = eINSTANCE.getRealConstraint();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.RealRangeConstraintImpl <em>Real Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.RealRangeConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getRealRangeConstraint()
		 * @generated
		 */
		EClass REAL_RANGE_CONSTRAINT = eINSTANCE.getRealRangeConstraint();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_RANGE_CONSTRAINT__LOWER_BOUND = eINSTANCE.getRealRangeConstraint_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_RANGE_CONSTRAINT__UPPER_BOUND = eINSTANCE.getRealRangeConstraint_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE = eINSTANCE.getRealRangeConstraint_LowerBoundInclusive();

		/**
		 * The meta object literal for the '<em><b>Upper Bound Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE = eINSTANCE.getRealRangeConstraint_UpperBoundInclusive();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.StringConstraintImpl <em>String Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.StringConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getStringConstraint()
		 * @generated
		 */
		EClass STRING_CONSTRAINT = eINSTANCE.getStringConstraint();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.RegularExpressionConstraintImpl <em>Regular Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.RegularExpressionConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getRegularExpressionConstraint()
		 * @generated
		 */
		EClass REGULAR_EXPRESSION_CONSTRAINT = eINSTANCE.getRegularExpressionConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_EXPRESSION_CONSTRAINT__EXPRESSION = eINSTANCE.getRegularExpressionConstraint_Expression();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.FixedLengthStringConstraintImpl <em>Fixed Length String Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.FixedLengthStringConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getFixedLengthStringConstraint()
		 * @generated
		 */
		EClass FIXED_LENGTH_STRING_CONSTRAINT = eINSTANCE.getFixedLengthStringConstraint();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_LENGTH_STRING_CONSTRAINT__LENGTH = eINSTANCE.getFixedLengthStringConstraint_Length();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.EnumerationConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEnumerationConstraint()
		 * @generated
		 */
		EClass ENUMERATION_CONSTRAINT = eINSTANCE.getEnumerationConstraint();

		/**
		 * The meta object literal for the '<em><b>Allowed Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_CONSTRAINT__ALLOWED_VALUE = eINSTANCE.getEnumerationConstraint_AllowedValue();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementConstraintImpl <em>Measurement Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementConstraintImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementConstraint()
		 * @generated
		 */
		EClass MEASUREMENT_CONSTRAINT = eINSTANCE.getMeasurementConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT = eINSTANCE.getMeasurementConstraint_ConstraintText();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementSystemConversionImpl <em>Measurement System Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementSystemConversionImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementSystemConversion()
		 * @generated
		 */
		EClass MEASUREMENT_SYSTEM_CONVERSION = eINSTANCE.getMeasurementSystemConversion();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM_CONVERSION__SOURCE = eINSTANCE.getMeasurementSystemConversion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SYSTEM_CONVERSION__TARGET = eINSTANCE.getMeasurementSystemConversion_Target();

		/**
		 * The meta object literal for the '<em><b>Equation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SYSTEM_CONVERSION__EQUATION = eINSTANCE.getMeasurementSystemConversion_Equation();

		/**
		 * The meta object literal for the '<em><b>Conversion Loss Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION = eINSTANCE.getMeasurementSystemConversion_ConversionLossDescription();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.AbstractMeasurementImpl <em>Abstract Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.AbstractMeasurementImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAbstractMeasurement()
		 * @generated
		 */
		EClass ABSTRACT_MEASUREMENT = eINSTANCE.getAbstractMeasurement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__CONSTRAINT = eINSTANCE.getMeasurement_Constraint();

		/**
		 * The meta object literal for the '<em><b>Measurement Axis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASUREMENT_AXIS = eINSTANCE.getMeasurement_MeasurementAxis();

		/**
		 * The meta object literal for the '<em><b>Measurement System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASUREMENT_SYSTEM = eINSTANCE.getMeasurement_MeasurementSystem();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__REALIZES = eINSTANCE.getMeasurement_Realizes();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__ATTRIBUTE = eINSTANCE.getMeasurement_Attribute();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementAxisImpl <em>Measurement Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementAxisImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementAxis()
		 * @generated
		 */
		EClass MEASUREMENT_AXIS = eINSTANCE.getMeasurementAxis();

		/**
		 * The meta object literal for the '<em><b>Value Type Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_AXIS__VALUE_TYPE_UNIT = eINSTANCE.getMeasurementAxis_ValueTypeUnit();

		/**
		 * The meta object literal for the '<em><b>Measurement System Axis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS = eINSTANCE.getMeasurementAxis_MeasurementSystemAxis();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_AXIS__CONSTRAINT = eINSTANCE.getMeasurementAxis_Constraint();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_AXIS__REALIZES = eINSTANCE.getMeasurementAxis_Realizes();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementAttributeImpl <em>Measurement Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementAttributeImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementAttribute()
		 * @generated
		 */
		EClass MEASUREMENT_ATTRIBUTE = eINSTANCE.getMeasurementAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_ATTRIBUTE__TYPE = eINSTANCE.getMeasurementAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_ATTRIBUTE__ROLENAME = eINSTANCE.getMeasurementAttribute_Rolename();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.MeasurementConversionImpl <em>Measurement Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.MeasurementConversionImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getMeasurementConversion()
		 * @generated
		 */
		EClass MEASUREMENT_CONVERSION = eINSTANCE.getMeasurementConversion();

		/**
		 * The meta object literal for the '<em><b>Equation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONVERSION__EQUATION = eINSTANCE.getMeasurementConversion_Equation();

		/**
		 * The meta object literal for the '<em><b>Conversion Loss Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION = eINSTANCE.getMeasurementConversion_ConversionLossDescription();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_CONVERSION__SOURCE = eINSTANCE.getMeasurementConversion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_CONVERSION__TARGET = eINSTANCE.getMeasurementConversion_Target();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ComposableElementImpl <em>Composable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ComposableElementImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getComposableElement()
		 * @generated
		 */
		EClass COMPOSABLE_ELEMENT = eINSTANCE.getComposableElement();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.CharacteristicImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCharacteristic()
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
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__LOWER_BOUND = eINSTANCE.getCharacteristic_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__UPPER_BOUND = eINSTANCE.getCharacteristic_UpperBound();

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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.EntityImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getEntity()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.CompositionImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getComposition()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.AssociationImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getAssociation()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ParticipantImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getParticipant()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.PathNodeImpl <em>Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.PathNodeImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getPathNode()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ParticipantPathNodeImpl <em>Participant Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ParticipantPathNodeImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getParticipantPathNode()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.CharacteristicPathNodeImpl <em>Characteristic Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.CharacteristicPathNodeImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCharacteristicPathNode()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.ViewImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.QueryImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getQuery()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.CompositeQueryImpl <em>Composite Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.CompositeQueryImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getCompositeQuery()
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
		 * The meta object literal for the '{@link org.osate.datamodel10.logical.impl.QueryCompositionImpl <em>Query Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osate.datamodel10.logical.impl.QueryCompositionImpl
		 * @see org.osate.datamodel10.logical.impl.LogicalPackageImpl#getQueryComposition()
		 * @generated
		 */
		EClass QUERY_COMPOSITION = eINSTANCE.getQueryComposition();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_COMPOSITION__REALIZES = eINSTANCE.getQueryComposition_Realizes();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_COMPOSITION__ROLENAME = eINSTANCE.getQueryComposition_Rolename();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_COMPOSITION__TYPE = eINSTANCE.getQueryComposition_Type();

	}

} //LogicalPackage
