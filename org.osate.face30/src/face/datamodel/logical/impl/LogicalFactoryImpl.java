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
package face.datamodel.logical.impl;

import face.datamodel.logical.AffineConversion;
import face.datamodel.logical.Association;
import face.datamodel.logical.CharacteristicPathNode;
import face.datamodel.logical.CompositeQuery;
import face.datamodel.logical.Composition;
import face.datamodel.logical.Constraint;
import face.datamodel.logical.Conversion;
import face.datamodel.logical.CoordinateSystem;
import face.datamodel.logical.CoordinateSystemAxis;
import face.datamodel.logical.Entity;
import face.datamodel.logical.Enumerated;
import face.datamodel.logical.EnumerationConstraint;
import face.datamodel.logical.EnumerationLabel;
import face.datamodel.logical.FixedLengthStringConstraint;
import face.datamodel.logical.IntegerRangeConstraint;
import face.datamodel.logical.Landmark;
import face.datamodel.logical.LogicalFactory;
import face.datamodel.logical.LogicalPackage;
import face.datamodel.logical.Measurement;
import face.datamodel.logical.MeasurementAttribute;
import face.datamodel.logical.MeasurementAxis;
import face.datamodel.logical.MeasurementConstraint;
import face.datamodel.logical.MeasurementConversion;
import face.datamodel.logical.MeasurementSystem;
import face.datamodel.logical.MeasurementSystemAxis;
import face.datamodel.logical.MeasurementSystemConversion;
import face.datamodel.logical.Natural;
import face.datamodel.logical.NonNegativeReal;
import face.datamodel.logical.Participant;
import face.datamodel.logical.ParticipantPathNode;
import face.datamodel.logical.Query;
import face.datamodel.logical.QueryComposition;
import face.datamodel.logical.Real;
import face.datamodel.logical.RealRangeConstraint;
import face.datamodel.logical.ReferencePoint;
import face.datamodel.logical.ReferencePointPart;
import face.datamodel.logical.RegularExpressionConstraint;
import face.datamodel.logical.StandardMeasurementSystem;
import face.datamodel.logical.Unit;
import face.datamodel.logical.ValueTypeUnit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversion createConversion() {
		ConversionImpl conversion = new ConversionImpl();
		return conversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffineConversion createAffineConversion() {
		AffineConversionImpl affineConversion = new AffineConversionImpl();
		return affineConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.logical.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.logical.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.logical.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public face.datamodel.logical.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Natural createNatural() {
		NaturalImpl natural = new NaturalImpl();
		return natural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeReal createNonNegativeReal() {
		NonNegativeRealImpl nonNegativeReal = new NonNegativeRealImpl();
		return nonNegativeReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerated createEnumerated() {
		EnumeratedImpl enumerated = new EnumeratedImpl();
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLabel createEnumerationLabel() {
		EnumerationLabelImpl enumerationLabel = new EnumerationLabelImpl();
		return enumerationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem createCoordinateSystem() {
		CoordinateSystemImpl coordinateSystem = new CoordinateSystemImpl();
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemAxis createCoordinateSystemAxis() {
		CoordinateSystemAxisImpl coordinateSystemAxis = new CoordinateSystemAxisImpl();
		return coordinateSystemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardMeasurementSystem createStandardMeasurementSystem() {
		StandardMeasurementSystemImpl standardMeasurementSystem = new StandardMeasurementSystemImpl();
		return standardMeasurementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Landmark createLandmark() {
		LandmarkImpl landmark = new LandmarkImpl();
		return landmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystem createMeasurementSystem() {
		MeasurementSystemImpl measurementSystem = new MeasurementSystemImpl();
		return measurementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystemAxis createMeasurementSystemAxis() {
		MeasurementSystemAxisImpl measurementSystemAxis = new MeasurementSystemAxisImpl();
		return measurementSystemAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencePoint createReferencePoint() {
		ReferencePointImpl referencePoint = new ReferencePointImpl();
		return referencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencePointPart createReferencePointPart() {
		ReferencePointPartImpl referencePointPart = new ReferencePointPartImpl();
		return referencePointPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeUnit createValueTypeUnit() {
		ValueTypeUnitImpl valueTypeUnit = new ValueTypeUnitImpl();
		return valueTypeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRangeConstraint createIntegerRangeConstraint() {
		IntegerRangeConstraintImpl integerRangeConstraint = new IntegerRangeConstraintImpl();
		return integerRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealRangeConstraint createRealRangeConstraint() {
		RealRangeConstraintImpl realRangeConstraint = new RealRangeConstraintImpl();
		return realRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularExpressionConstraint createRegularExpressionConstraint() {
		RegularExpressionConstraintImpl regularExpressionConstraint = new RegularExpressionConstraintImpl();
		return regularExpressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedLengthStringConstraint createFixedLengthStringConstraint() {
		FixedLengthStringConstraintImpl fixedLengthStringConstraint = new FixedLengthStringConstraintImpl();
		return fixedLengthStringConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationConstraint createEnumerationConstraint() {
		EnumerationConstraintImpl enumerationConstraint = new EnumerationConstraintImpl();
		return enumerationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementConstraint createMeasurementConstraint() {
		MeasurementConstraintImpl measurementConstraint = new MeasurementConstraintImpl();
		return measurementConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSystemConversion createMeasurementSystemConversion() {
		MeasurementSystemConversionImpl measurementSystemConversion = new MeasurementSystemConversionImpl();
		return measurementSystemConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementAxis createMeasurementAxis() {
		MeasurementAxisImpl measurementAxis = new MeasurementAxisImpl();
		return measurementAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementAttribute createMeasurementAttribute() {
		MeasurementAttributeImpl measurementAttribute = new MeasurementAttributeImpl();
		return measurementAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementConversion createMeasurementConversion() {
		MeasurementConversionImpl measurementConversion = new MeasurementConversionImpl();
		return measurementConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantPathNode createParticipantPathNode() {
		ParticipantPathNodeImpl participantPathNode = new ParticipantPathNodeImpl();
		return participantPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicPathNode createCharacteristicPathNode() {
		CharacteristicPathNodeImpl characteristicPathNode = new CharacteristicPathNodeImpl();
		return characteristicPathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeQuery createCompositeQuery() {
		CompositeQueryImpl compositeQuery = new CompositeQueryImpl();
		return compositeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryComposition createQueryComposition() {
		QueryCompositionImpl queryComposition = new QueryCompositionImpl();
		return queryComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
