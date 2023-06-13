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
package org.osate.datamodel10.logical.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.datamodel10.logical.AffineConversion;
import org.osate.datamodel10.logical.Association;
import org.osate.datamodel10.logical.CharacteristicPathNode;
import org.osate.datamodel10.logical.CompositeQuery;
import org.osate.datamodel10.logical.Composition;
import org.osate.datamodel10.logical.Constraint;
import org.osate.datamodel10.logical.Conversion;
import org.osate.datamodel10.logical.CoordinateSystem;
import org.osate.datamodel10.logical.CoordinateSystemAxis;
import org.osate.datamodel10.logical.Entity;
import org.osate.datamodel10.logical.Enumerated;
import org.osate.datamodel10.logical.EnumerationConstraint;
import org.osate.datamodel10.logical.EnumerationLabel;
import org.osate.datamodel10.logical.FixedLengthStringConstraint;
import org.osate.datamodel10.logical.IntegerRangeConstraint;
import org.osate.datamodel10.logical.Landmark;
import org.osate.datamodel10.logical.LogicalFactory;
import org.osate.datamodel10.logical.LogicalPackage;
import org.osate.datamodel10.logical.Measurement;
import org.osate.datamodel10.logical.MeasurementAttribute;
import org.osate.datamodel10.logical.MeasurementAxis;
import org.osate.datamodel10.logical.MeasurementConstraint;
import org.osate.datamodel10.logical.MeasurementConversion;
import org.osate.datamodel10.logical.MeasurementSystem;
import org.osate.datamodel10.logical.MeasurementSystemAxis;
import org.osate.datamodel10.logical.MeasurementSystemConversion;
import org.osate.datamodel10.logical.Natural;
import org.osate.datamodel10.logical.NonNegativeReal;
import org.osate.datamodel10.logical.Participant;
import org.osate.datamodel10.logical.ParticipantPathNode;
import org.osate.datamodel10.logical.Query;
import org.osate.datamodel10.logical.QueryComposition;
import org.osate.datamodel10.logical.Real;
import org.osate.datamodel10.logical.RealRangeConstraint;
import org.osate.datamodel10.logical.ReferencePoint;
import org.osate.datamodel10.logical.ReferencePointPart;
import org.osate.datamodel10.logical.RegularExpressionConstraint;
import org.osate.datamodel10.logical.StandardMeasurementSystem;
import org.osate.datamodel10.logical.Unit;
import org.osate.datamodel10.logical.ValueTypeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalFactoryImpl extends EFactoryImpl implements LogicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicalFactory init() {
		try {
			LogicalFactory theLogicalFactory = (LogicalFactory)EPackage.Registry.INSTANCE.getEFactory(LogicalPackage.eNS_URI);
			if (theLogicalFactory != null) {
				return theLogicalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogicalPackage.UNIT: return createUnit();
			case LogicalPackage.CONVERSION: return createConversion();
			case LogicalPackage.AFFINE_CONVERSION: return createAffineConversion();
			case LogicalPackage.STRING: return createString();
			case LogicalPackage.CHARACTER: return createCharacter();
			case LogicalPackage.BOOLEAN: return createBoolean();
			case LogicalPackage.INTEGER: return createInteger();
			case LogicalPackage.NATURAL: return createNatural();
			case LogicalPackage.REAL: return createReal();
			case LogicalPackage.NON_NEGATIVE_REAL: return createNonNegativeReal();
			case LogicalPackage.ENUMERATED: return createEnumerated();
			case LogicalPackage.ENUMERATION_LABEL: return createEnumerationLabel();
			case LogicalPackage.COORDINATE_SYSTEM: return createCoordinateSystem();
			case LogicalPackage.COORDINATE_SYSTEM_AXIS: return createCoordinateSystemAxis();
			case LogicalPackage.STANDARD_MEASUREMENT_SYSTEM: return createStandardMeasurementSystem();
			case LogicalPackage.LANDMARK: return createLandmark();
			case LogicalPackage.MEASUREMENT_SYSTEM: return createMeasurementSystem();
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS: return createMeasurementSystemAxis();
			case LogicalPackage.REFERENCE_POINT: return createReferencePoint();
			case LogicalPackage.REFERENCE_POINT_PART: return createReferencePointPart();
			case LogicalPackage.VALUE_TYPE_UNIT: return createValueTypeUnit();
			case LogicalPackage.CONSTRAINT: return createConstraint();
			case LogicalPackage.INTEGER_RANGE_CONSTRAINT: return createIntegerRangeConstraint();
			case LogicalPackage.REAL_RANGE_CONSTRAINT: return createRealRangeConstraint();
			case LogicalPackage.REGULAR_EXPRESSION_CONSTRAINT: return createRegularExpressionConstraint();
			case LogicalPackage.FIXED_LENGTH_STRING_CONSTRAINT: return createFixedLengthStringConstraint();
			case LogicalPackage.ENUMERATION_CONSTRAINT: return createEnumerationConstraint();
			case LogicalPackage.MEASUREMENT_CONSTRAINT: return createMeasurementConstraint();
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION: return createMeasurementSystemConversion();
			case LogicalPackage.MEASUREMENT: return createMeasurement();
			case LogicalPackage.MEASUREMENT_AXIS: return createMeasurementAxis();
			case LogicalPackage.MEASUREMENT_ATTRIBUTE: return createMeasurementAttribute();
			case LogicalPackage.MEASUREMENT_CONVERSION: return createMeasurementConversion();
			case LogicalPackage.ENTITY: return createEntity();
			case LogicalPackage.COMPOSITION: return createComposition();
			case LogicalPackage.ASSOCIATION: return createAssociation();
			case LogicalPackage.PARTICIPANT: return createParticipant();
			case LogicalPackage.PARTICIPANT_PATH_NODE: return createParticipantPathNode();
			case LogicalPackage.CHARACTERISTIC_PATH_NODE: return createCharacteristicPathNode();
			case LogicalPackage.QUERY: return createQuery();
			case LogicalPackage.COMPOSITE_QUERY: return createCompositeQuery();
			case LogicalPackage.QUERY_COMPOSITION: return createQueryComposition();
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
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conversion createConversion() {
		ConversionImpl conversion = new ConversionImpl();
		return conversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineConversion createAffineConversion() {
		AffineConversionImpl affineConversion = new AffineConversionImpl();
		return affineConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.logical.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.logical.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.logical.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.osate.datamodel10.logical.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Natural createNatural() {
		NaturalImpl natural = new NaturalImpl();
		return natural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonNegativeReal createNonNegativeReal() {
		NonNegativeRealImpl nonNegativeReal = new NonNegativeRealImpl();
		return nonNegativeReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumerated createEnumerated() {
		EnumeratedImpl enumerated = new EnumeratedImpl();
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLabel createEnumerationLabel() {
		EnumerationLabelImpl enumerationLabel = new EnumerationLabelImpl();
		return enumerationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystem createCoordinateSystem() {
		CoordinateSystemImpl coordinateSystem = new CoordinateSystemImpl();
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemAxis createCoordinateSystemAxis() {
		CoordinateSystemAxisImpl coordinateSystemAxis = new CoordinateSystemAxisImpl();
		return coordinateSystemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardMeasurementSystem createStandardMeasurementSystem() {
		StandardMeasurementSystemImpl standardMeasurementSystem = new StandardMeasurementSystemImpl();
		return standardMeasurementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Landmark createLandmark() {
		LandmarkImpl landmark = new LandmarkImpl();
		return landmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementSystem createMeasurementSystem() {
		MeasurementSystemImpl measurementSystem = new MeasurementSystemImpl();
		return measurementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementSystemAxis createMeasurementSystemAxis() {
		MeasurementSystemAxisImpl measurementSystemAxis = new MeasurementSystemAxisImpl();
		return measurementSystemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencePoint createReferencePoint() {
		ReferencePointImpl referencePoint = new ReferencePointImpl();
		return referencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencePointPart createReferencePointPart() {
		ReferencePointPartImpl referencePointPart = new ReferencePointPartImpl();
		return referencePointPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueTypeUnit createValueTypeUnit() {
		ValueTypeUnitImpl valueTypeUnit = new ValueTypeUnitImpl();
		return valueTypeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerRangeConstraint createIntegerRangeConstraint() {
		IntegerRangeConstraintImpl integerRangeConstraint = new IntegerRangeConstraintImpl();
		return integerRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealRangeConstraint createRealRangeConstraint() {
		RealRangeConstraintImpl realRangeConstraint = new RealRangeConstraintImpl();
		return realRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularExpressionConstraint createRegularExpressionConstraint() {
		RegularExpressionConstraintImpl regularExpressionConstraint = new RegularExpressionConstraintImpl();
		return regularExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedLengthStringConstraint createFixedLengthStringConstraint() {
		FixedLengthStringConstraintImpl fixedLengthStringConstraint = new FixedLengthStringConstraintImpl();
		return fixedLengthStringConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationConstraint createEnumerationConstraint() {
		EnumerationConstraintImpl enumerationConstraint = new EnumerationConstraintImpl();
		return enumerationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConstraint createMeasurementConstraint() {
		MeasurementConstraintImpl measurementConstraint = new MeasurementConstraintImpl();
		return measurementConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementSystemConversion createMeasurementSystemConversion() {
		MeasurementSystemConversionImpl measurementSystemConversion = new MeasurementSystemConversionImpl();
		return measurementSystemConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementAxis createMeasurementAxis() {
		MeasurementAxisImpl measurementAxis = new MeasurementAxisImpl();
		return measurementAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementAttribute createMeasurementAttribute() {
		MeasurementAttributeImpl measurementAttribute = new MeasurementAttributeImpl();
		return measurementAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConversion createMeasurementConversion() {
		MeasurementConversionImpl measurementConversion = new MeasurementConversionImpl();
		return measurementConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipantPathNode createParticipantPathNode() {
		ParticipantPathNodeImpl participantPathNode = new ParticipantPathNodeImpl();
		return participantPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacteristicPathNode createCharacteristicPathNode() {
		CharacteristicPathNodeImpl characteristicPathNode = new CharacteristicPathNodeImpl();
		return characteristicPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeQuery createCompositeQuery() {
		CompositeQueryImpl compositeQuery = new CompositeQueryImpl();
		return compositeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryComposition createQueryComposition() {
		QueryCompositionImpl queryComposition = new QueryCompositionImpl();
		return queryComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalPackage getLogicalPackage() {
		return (LogicalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicalPackage getPackage() {
		return LogicalPackage.eINSTANCE;
	}

} //LogicalFactoryImpl
