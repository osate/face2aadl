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
package org.osate.datamodel10.logical.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.datamodel10.logical.AbstractMeasurement;
import org.osate.datamodel10.logical.AbstractMeasurementSystem;
import org.osate.datamodel10.logical.AffineConversion;
import org.osate.datamodel10.logical.Association;
import org.osate.datamodel10.logical.Characteristic;
import org.osate.datamodel10.logical.CharacteristicPathNode;
import org.osate.datamodel10.logical.ComposableElement;
import org.osate.datamodel10.logical.CompositeQuery;
import org.osate.datamodel10.logical.Composition;
import org.osate.datamodel10.logical.Constraint;
import org.osate.datamodel10.logical.Conversion;
import org.osate.datamodel10.logical.ConvertibleElement;
import org.osate.datamodel10.logical.CoordinateSystem;
import org.osate.datamodel10.logical.CoordinateSystemAxis;
import org.osate.datamodel10.logical.Element;
import org.osate.datamodel10.logical.Entity;
import org.osate.datamodel10.logical.Enumerated;
import org.osate.datamodel10.logical.EnumerationConstraint;
import org.osate.datamodel10.logical.EnumerationLabel;
import org.osate.datamodel10.logical.FixedLengthStringConstraint;
import org.osate.datamodel10.logical.IntegerConstraint;
import org.osate.datamodel10.logical.IntegerRangeConstraint;
import org.osate.datamodel10.logical.Landmark;
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
import org.osate.datamodel10.logical.Numeric;
import org.osate.datamodel10.logical.Participant;
import org.osate.datamodel10.logical.ParticipantPathNode;
import org.osate.datamodel10.logical.PathNode;
import org.osate.datamodel10.logical.Query;
import org.osate.datamodel10.logical.QueryComposition;
import org.osate.datamodel10.logical.Real;
import org.osate.datamodel10.logical.RealConstraint;
import org.osate.datamodel10.logical.RealRangeConstraint;
import org.osate.datamodel10.logical.ReferencePoint;
import org.osate.datamodel10.logical.ReferencePointPart;
import org.osate.datamodel10.logical.RegularExpressionConstraint;
import org.osate.datamodel10.logical.StandardMeasurementSystem;
import org.osate.datamodel10.logical.StringConstraint;
import org.osate.datamodel10.logical.Unit;
import org.osate.datamodel10.logical.ValueType;
import org.osate.datamodel10.logical.ValueTypeUnit;
import org.osate.datamodel10.logical.View;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.datamodel10.logical.LogicalPackage
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
			public Adapter caseString(org.osate.datamodel10.logical.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseCharacter(org.osate.datamodel10.logical.Character object) {
				return createCharacterAdapter();
			}
			@Override
			public Adapter caseBoolean(org.osate.datamodel10.logical.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseNumeric(Numeric object) {
				return createNumericAdapter();
			}
			@Override
			public Adapter caseInteger(org.osate.datamodel10.logical.Integer object) {
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
			public Adapter caseDatamodel_Element(org.osate.datamodel10.Element object) {
				return createDatamodel_ElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.ConvertibleElement <em>Convertible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.ConvertibleElement
	 * @generated
	 */
	public Adapter createConvertibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Conversion
	 * @generated
	 */
	public Adapter createConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.AffineConversion <em>Affine Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.AffineConversion
	 * @generated
	 */
	public Adapter createAffineConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Numeric
	 * @generated
	 */
	public Adapter createNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Natural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Natural
	 * @generated
	 */
	public Adapter createNaturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.NonNegativeReal <em>Non Negative Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.NonNegativeReal
	 * @generated
	 */
	public Adapter createNonNegativeRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Enumerated
	 * @generated
	 */
	public Adapter createEnumeratedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.EnumerationLabel <em>Enumeration Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.EnumerationLabel
	 * @generated
	 */
	public Adapter createEnumerationLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.CoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.CoordinateSystem
	 * @generated
	 */
	public Adapter createCoordinateSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.CoordinateSystemAxis <em>Coordinate System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.CoordinateSystemAxis
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.AbstractMeasurementSystem <em>Abstract Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.AbstractMeasurementSystem
	 * @generated
	 */
	public Adapter createAbstractMeasurementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.StandardMeasurementSystem <em>Standard Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.StandardMeasurementSystem
	 * @generated
	 */
	public Adapter createStandardMeasurementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Landmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Landmark
	 * @generated
	 */
	public Adapter createLandmarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.MeasurementSystem <em>Measurement System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.MeasurementSystem
	 * @generated
	 */
	public Adapter createMeasurementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.MeasurementSystemAxis <em>Measurement System Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.MeasurementSystemAxis
	 * @generated
	 */
	public Adapter createMeasurementSystemAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.ReferencePoint <em>Reference Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.ReferencePoint
	 * @generated
	 */
	public Adapter createReferencePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.ReferencePointPart <em>Reference Point Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.ReferencePointPart
	 * @generated
	 */
	public Adapter createReferencePointPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.ValueTypeUnit <em>Value Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.ValueTypeUnit
	 * @generated
	 */
	public Adapter createValueTypeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.IntegerConstraint <em>Integer Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.IntegerConstraint
	 * @generated
	 */
	public Adapter createIntegerConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.IntegerRangeConstraint <em>Integer Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.IntegerRangeConstraint
	 * @generated
	 */
	public Adapter createIntegerRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.RealConstraint <em>Real Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.RealConstraint
	 * @generated
	 */
	public Adapter createRealConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.RealRangeConstraint <em>Real Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.RealRangeConstraint
	 * @generated
	 */
	public Adapter createRealRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.StringConstraint <em>String Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.StringConstraint
	 * @generated
	 */
	public Adapter createStringConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.RegularExpressionConstraint <em>Regular Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.RegularExpressionConstraint
	 * @generated
	 */
	public Adapter createRegularExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.FixedLengthStringConstraint <em>Fixed Length String Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.FixedLengthStringConstraint
	 * @generated
	 */
	public Adapter createFixedLengthStringConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.EnumerationConstraint
	 * @generated
	 */
	public Adapter createEnumerationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.MeasurementConstraint <em>Measurement Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.MeasurementConstraint
	 * @generated
	 */
	public Adapter createMeasurementConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.MeasurementSystemConversion <em>Measurement System Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.MeasurementSystemConversion
	 * @generated
	 */
	public Adapter createMeasurementSystemConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.AbstractMeasurement <em>Abstract Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.AbstractMeasurement
	 * @generated
	 */
	public Adapter createAbstractMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.MeasurementAxis <em>Measurement Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.MeasurementAxis
	 * @generated
	 */
	public Adapter createMeasurementAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.MeasurementAttribute <em>Measurement Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.MeasurementAttribute
	 * @generated
	 */
	public Adapter createMeasurementAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.MeasurementConversion <em>Measurement Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.MeasurementConversion
	 * @generated
	 */
	public Adapter createMeasurementConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.ComposableElement
	 * @generated
	 */
	public Adapter createComposableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.PathNode
	 * @generated
	 */
	public Adapter createPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.ParticipantPathNode
	 * @generated
	 */
	public Adapter createParticipantPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.CharacteristicPathNode
	 * @generated
	 */
	public Adapter createCharacteristicPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.CompositeQuery <em>Composite Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.CompositeQuery
	 * @generated
	 */
	public Adapter createCompositeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.logical.QueryComposition <em>Query Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.logical.QueryComposition
	 * @generated
	 */
	public Adapter createQueryCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.datamodel10.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.datamodel10.Element
	 * @generated
	 */
	public Adapter createDatamodel_ElementAdapter() {
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
