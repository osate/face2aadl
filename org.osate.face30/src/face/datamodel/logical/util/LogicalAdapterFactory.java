/*******************************************************************************
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
 *******************************************************************************/
package face.datamodel.logical.util;

import face.datamodel.logical.AbstractMeasurement;
import face.datamodel.logical.AbstractMeasurementSystem;
import face.datamodel.logical.AffineConversion;
import face.datamodel.logical.Association;
import face.datamodel.logical.Characteristic;
import face.datamodel.logical.CharacteristicPathNode;
import face.datamodel.logical.ComposableElement;
import face.datamodel.logical.CompositeQuery;
import face.datamodel.logical.Composition;
import face.datamodel.logical.Constraint;
import face.datamodel.logical.Conversion;
import face.datamodel.logical.ConvertibleElement;
import face.datamodel.logical.CoordinateSystem;
import face.datamodel.logical.CoordinateSystemAxis;
import face.datamodel.logical.Element;
import face.datamodel.logical.Entity;
import face.datamodel.logical.Enumerated;
import face.datamodel.logical.EnumerationConstraint;
import face.datamodel.logical.EnumerationLabel;
import face.datamodel.logical.FixedLengthStringConstraint;
import face.datamodel.logical.IntegerConstraint;
import face.datamodel.logical.IntegerRangeConstraint;
import face.datamodel.logical.Landmark;
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
import face.datamodel.logical.Numeric;
import face.datamodel.logical.Participant;
import face.datamodel.logical.ParticipantPathNode;
import face.datamodel.logical.PathNode;
import face.datamodel.logical.Query;
import face.datamodel.logical.QueryComposition;
import face.datamodel.logical.Real;
import face.datamodel.logical.RealConstraint;
import face.datamodel.logical.RealRangeConstraint;
import face.datamodel.logical.ReferencePoint;
import face.datamodel.logical.ReferencePointPart;
import face.datamodel.logical.RegularExpressionConstraint;
import face.datamodel.logical.StandardMeasurementSystem;
import face.datamodel.logical.StringConstraint;
import face.datamodel.logical.Unit;
import face.datamodel.logical.ValueType;
import face.datamodel.logical.ValueTypeUnit;
import face.datamodel.logical.View;

import face.traceability.TraceableElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see face.datamodel.logical.LogicalPackage
 * @generated
 */
public class LogicalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogicalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalSwitch<Adapter> modelSwitch =
		new LogicalSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseConvertibleElement(ConvertibleElement object) {
				return createConvertibleElementAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseConversion(Conversion object) {
				return createConversionAdapter();
			}
			@Override
			public Adapter caseAffineConversion(AffineConversion object) {
				return createAffineConversionAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseString(face.datamodel.logical.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseCharacter(face.datamodel.logical.Character object) {
				return createCharacterAdapter();
			}
			@Override
			public Adapter caseBoolean(face.datamodel.logical.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseNumeric(Numeric object) {
				return createNumericAdapter();
			}
			@Override
			public Adapter caseInteger(face.datamodel.logical.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseNatural(Natural object) {
				return createNaturalAdapter();
			}
			@Override
			public Adapter caseReal(Real object) {
				return createRealAdapter();
			}
			@Override
			public Adapter caseNonNegativeReal(NonNegativeReal object) {
				return createNonNegativeRealAdapter();
			}
			@Override
			public Adapter caseEnumerated(Enumerated object) {
				return createEnumeratedAdapter();
			}
			@Override
			public Adapter caseEnumerationLabel(EnumerationLabel object) {
				return createEnumerationLabelAdapter();
			}
			@Override
			public Adapter caseCoordinateSystem(CoordinateSystem object) {
				return createCoordinateSystemAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxis(CoordinateSystemAxis object) {
				return createCoordinateSystemAxisAdapter();
			}
			@Override
			public Adapter caseAbstractMeasurementSystem(AbstractMeasurementSystem object) {
				return createAbstractMeasurementSystemAdapter();
			}
			@Override
			public Adapter caseStandardMeasurementSystem(StandardMeasurementSystem object) {
				return createStandardMeasurementSystemAdapter();
			}
			@Override
			public Adapter caseLandmark(Landmark object) {
				return createLandmarkAdapter();
			}
			@Override
			public Adapter caseMeasurementSystem(MeasurementSystem object) {
				return createMeasurementSystemAdapter();
			}
			@Override
			public Adapter caseMeasurementSystemAxis(MeasurementSystemAxis object) {
				return createMeasurementSystemAxisAdapter();
			}
			@Override
			public Adapter caseReferencePoint(ReferencePoint object) {
				return createReferencePointAdapter();
			}
			@Override
			public Adapter caseReferencePointPart(ReferencePointPart object) {
				return createReferencePointPartAdapter();
			}
			@Override
			public Adapter caseValueTypeUnit(ValueTypeUnit object) {
				return createValueTypeUnitAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseIntegerConstraint(IntegerConstraint object) {
				return createIntegerConstraintAdapter();
			}
			@Override
			public Adapter caseIntegerRangeConstraint(IntegerRangeConstraint object) {
				return createIntegerRangeConstraintAdapter();
			}
			@Override
			public Adapter caseRealConstraint(RealConstraint object) {
				return createRealConstraintAdapter();
			}
			@Override
			public Adapter caseRealRangeConstraint(RealRangeConstraint object) {
				return createRealRangeConstraintAdapter();
			}
			@Override
			public Adapter caseStringConstraint(StringConstraint object) {
				return createStringConstraintAdapter();
			}
			@Override
			public Adapter caseRegularExpressionConstraint(RegularExpressionConstraint object) {
				return createRegularExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseFixedLengthStringConstraint(FixedLengthStringConstraint object) {
				return createFixedLengthStringConstraintAdapter();
			}
			@Override
			public Adapter caseEnumerationConstraint(EnumerationConstraint object) {
				return createEnumerationConstraintAdapter();
			}
			@Override
			public Adapter caseMeasurementConstraint(MeasurementConstraint object) {
				return createMeasurementConstraintAdapter();
			}
			@Override
			public Adapter caseMeasurementSystemConversion(MeasurementSystemConversion object) {
				return createMeasurementSystemConversionAdapter();
			}
			@Override
			public Adapter caseAbstractMeasurement(AbstractMeasurement object) {
				return createAbstractMeasurementAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseMeasurementAxis(MeasurementAxis object) {
				return createMeasurementAxisAdapter();
			}
			@Override
			public Adapter caseMeasurementAttribute(MeasurementAttribute object) {
				return createMeasurementAttributeAdapter();
			}
			@Override
			public Adapter caseMeasurementConversion(MeasurementConversion object) {
				return createMeasurementConversionAdapter();
			}
			@Override
			public Adapter caseComposableElement(ComposableElement object) {
				return createComposableElementAdapter();
			}
			@Override
			public Adapter caseCharacteristic(Characteristic object) {
				return createCharacteristicAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter casePathNode(PathNode object) {
				return createPathNodeAdapter();
			}
			@Override
			public Adapter caseParticipantPathNode(ParticipantPathNode object) {
				return createParticipantPathNodeAdapter();
			}
			@Override
			public Adapter caseCharacteristicPathNode(CharacteristicPathNode object) {
				return createCharacteristicPathNodeAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseCompositeQuery(CompositeQuery object) {
				return createCompositeQueryAdapter();
			}
			@Override
			public Adapter caseQueryComposition(QueryComposition object) {
				return createQueryCompositionAdapter();
			}
			@Override
			public Adapter caseFace_Element(face.Element object) {
				return createFace_ElementAdapter();
			}
			@Override
			public Adapter caseDatamodel_Element(face.datamodel.Element object) {
				return createDatamodel_ElementAdapter();
			}
			@Override
			public Adapter caseTraceableElement(TraceableElement object) {
				return createTraceableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.ConvertibleElement <em>Convertible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.ConvertibleElement
	 * @generated
	 */
	public Adapter createConvertibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Conversion
	 * @generated
	 */
	public Adapter createConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.AffineConversion <em>Affine Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.AffineConversion
	 * @generated
	 */
	public Adapter createAffineConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Numeric
	 * @generated
	 */
	public Adapter createNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Natural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Natural
	 * @generated
	 */
	public Adapter createNaturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.NonNegativeReal <em>Non Negative Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.NonNegativeReal
	 * @generated
	 */
	public Adapter createNonNegativeRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Enumerated
	 * @generated
	 */
	public Adapter createEnumeratedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.EnumerationLabel <em>Enumeration Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.EnumerationLabel
	 * @generated
	 */
	public Adapter createEnumerationLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.CoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.CoordinateSystem
	 * @generated
	 */
	public Adapter createCoordinateSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.CoordinateSystemAxis <em>Coordinate System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.CoordinateSystemAxis
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.AbstractMeasurementSystem <em>Abstract Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.AbstractMeasurementSystem
	 * @generated
	 */
	public Adapter createAbstractMeasurementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.StandardMeasurementSystem <em>Standard Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.StandardMeasurementSystem
	 * @generated
	 */
	public Adapter createStandardMeasurementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Landmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Landmark
	 * @generated
	 */
	public Adapter createLandmarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.MeasurementSystem <em>Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.MeasurementSystem
	 * @generated
	 */
	public Adapter createMeasurementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.MeasurementSystemAxis <em>Measurement System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.MeasurementSystemAxis
	 * @generated
	 */
	public Adapter createMeasurementSystemAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.ReferencePoint <em>Reference Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.ReferencePoint
	 * @generated
	 */
	public Adapter createReferencePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.ReferencePointPart <em>Reference Point Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.ReferencePointPart
	 * @generated
	 */
	public Adapter createReferencePointPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.ValueTypeUnit <em>Value Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.ValueTypeUnit
	 * @generated
	 */
	public Adapter createValueTypeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.IntegerConstraint <em>Integer Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.IntegerConstraint
	 * @generated
	 */
	public Adapter createIntegerConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.IntegerRangeConstraint <em>Integer Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.IntegerRangeConstraint
	 * @generated
	 */
	public Adapter createIntegerRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.RealConstraint <em>Real Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.RealConstraint
	 * @generated
	 */
	public Adapter createRealConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.RealRangeConstraint <em>Real Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.RealRangeConstraint
	 * @generated
	 */
	public Adapter createRealRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.StringConstraint <em>String Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.StringConstraint
	 * @generated
	 */
	public Adapter createStringConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.RegularExpressionConstraint <em>Regular Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.RegularExpressionConstraint
	 * @generated
	 */
	public Adapter createRegularExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.FixedLengthStringConstraint <em>Fixed Length String Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.FixedLengthStringConstraint
	 * @generated
	 */
	public Adapter createFixedLengthStringConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.EnumerationConstraint
	 * @generated
	 */
	public Adapter createEnumerationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.MeasurementConstraint <em>Measurement Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.MeasurementConstraint
	 * @generated
	 */
	public Adapter createMeasurementConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.MeasurementSystemConversion <em>Measurement System Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.MeasurementSystemConversion
	 * @generated
	 */
	public Adapter createMeasurementSystemConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.AbstractMeasurement <em>Abstract Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.AbstractMeasurement
	 * @generated
	 */
	public Adapter createAbstractMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.MeasurementAxis <em>Measurement Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.MeasurementAxis
	 * @generated
	 */
	public Adapter createMeasurementAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.MeasurementAttribute <em>Measurement Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.MeasurementAttribute
	 * @generated
	 */
	public Adapter createMeasurementAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.MeasurementConversion <em>Measurement Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.MeasurementConversion
	 * @generated
	 */
	public Adapter createMeasurementConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.ComposableElement
	 * @generated
	 */
	public Adapter createComposableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.PathNode
	 * @generated
	 */
	public Adapter createPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.ParticipantPathNode
	 * @generated
	 */
	public Adapter createParticipantPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.CharacteristicPathNode
	 * @generated
	 */
	public Adapter createCharacteristicPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.CompositeQuery <em>Composite Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.CompositeQuery
	 * @generated
	 */
	public Adapter createCompositeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.logical.QueryComposition <em>Query Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.logical.QueryComposition
	 * @generated
	 */
	public Adapter createQueryCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.Element
	 * @generated
	 */
	public Adapter createFace_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.Element
	 * @generated
	 */
	public Adapter createDatamodel_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.traceability.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.traceability.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogicalAdapterFactory
