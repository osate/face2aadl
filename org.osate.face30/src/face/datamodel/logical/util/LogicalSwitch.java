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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see face.datamodel.logical.LogicalPackage
 * @generated
 */
public class LogicalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogicalPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseDatamodel_Element(element);
				if (result == null) result = caseFace_Element(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.CONVERTIBLE_ELEMENT: {
				ConvertibleElement convertibleElement = (ConvertibleElement)theEObject;
				T result = caseConvertibleElement(convertibleElement);
				if (result == null) result = caseElement(convertibleElement);
				if (result == null) result = caseDatamodel_Element(convertibleElement);
				if (result == null) result = caseFace_Element(convertibleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseConvertibleElement(unit);
				if (result == null) result = caseElement(unit);
				if (result == null) result = caseDatamodel_Element(unit);
				if (result == null) result = caseFace_Element(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.CONVERSION: {
				Conversion conversion = (Conversion)theEObject;
				T result = caseConversion(conversion);
				if (result == null) result = caseElement(conversion);
				if (result == null) result = caseDatamodel_Element(conversion);
				if (result == null) result = caseFace_Element(conversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.AFFINE_CONVERSION: {
				AffineConversion affineConversion = (AffineConversion)theEObject;
				T result = caseAffineConversion(affineConversion);
				if (result == null) result = caseConversion(affineConversion);
				if (result == null) result = caseElement(affineConversion);
				if (result == null) result = caseDatamodel_Element(affineConversion);
				if (result == null) result = caseFace_Element(affineConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = caseElement(valueType);
				if (result == null) result = caseDatamodel_Element(valueType);
				if (result == null) result = caseFace_Element(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.STRING: {
				face.datamodel.logical.String string = (face.datamodel.logical.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseValueType(string);
				if (result == null) result = caseElement(string);
				if (result == null) result = caseDatamodel_Element(string);
				if (result == null) result = caseFace_Element(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.CHARACTER: {
				face.datamodel.logical.Character character = (face.datamodel.logical.Character)theEObject;
				T result = caseCharacter(character);
				if (result == null) result = caseValueType(character);
				if (result == null) result = caseElement(character);
				if (result == null) result = caseDatamodel_Element(character);
				if (result == null) result = caseFace_Element(character);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.BOOLEAN: {
				face.datamodel.logical.Boolean boolean_ = (face.datamodel.logical.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseValueType(boolean_);
				if (result == null) result = caseElement(boolean_);
				if (result == null) result = caseDatamodel_Element(boolean_);
				if (result == null) result = caseFace_Element(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.NUMERIC: {
				Numeric numeric = (Numeric)theEObject;
				T result = caseNumeric(numeric);
				if (result == null) result = caseValueType(numeric);
				if (result == null) result = caseElement(numeric);
				if (result == null) result = caseDatamodel_Element(numeric);
				if (result == null) result = caseFace_Element(numeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.INTEGER: {
				face.datamodel.logical.Integer integer = (face.datamodel.logical.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseNumeric(integer);
				if (result == null) result = caseValueType(integer);
				if (result == null) result = caseElement(integer);
				if (result == null) result = caseDatamodel_Element(integer);
				if (result == null) result = caseFace_Element(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.NATURAL: {
				Natural natural = (Natural)theEObject;
				T result = caseNatural(natural);
				if (result == null) result = caseNumeric(natural);
				if (result == null) result = caseValueType(natural);
				if (result == null) result = caseElement(natural);
				if (result == null) result = caseDatamodel_Element(natural);
				if (result == null) result = caseFace_Element(natural);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseNumeric(real);
				if (result == null) result = caseValueType(real);
				if (result == null) result = caseElement(real);
				if (result == null) result = caseDatamodel_Element(real);
				if (result == null) result = caseFace_Element(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.NON_NEGATIVE_REAL: {
				NonNegativeReal nonNegativeReal = (NonNegativeReal)theEObject;
				T result = caseNonNegativeReal(nonNegativeReal);
				if (result == null) result = caseNumeric(nonNegativeReal);
				if (result == null) result = caseValueType(nonNegativeReal);
				if (result == null) result = caseElement(nonNegativeReal);
				if (result == null) result = caseDatamodel_Element(nonNegativeReal);
				if (result == null) result = caseFace_Element(nonNegativeReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ENUMERATED: {
				Enumerated enumerated = (Enumerated)theEObject;
				T result = caseEnumerated(enumerated);
				if (result == null) result = caseValueType(enumerated);
				if (result == null) result = caseElement(enumerated);
				if (result == null) result = caseDatamodel_Element(enumerated);
				if (result == null) result = caseFace_Element(enumerated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ENUMERATION_LABEL: {
				EnumerationLabel enumerationLabel = (EnumerationLabel)theEObject;
				T result = caseEnumerationLabel(enumerationLabel);
				if (result == null) result = caseFace_Element(enumerationLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.COORDINATE_SYSTEM: {
				CoordinateSystem coordinateSystem = (CoordinateSystem)theEObject;
				T result = caseCoordinateSystem(coordinateSystem);
				if (result == null) result = caseElement(coordinateSystem);
				if (result == null) result = caseDatamodel_Element(coordinateSystem);
				if (result == null) result = caseFace_Element(coordinateSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.COORDINATE_SYSTEM_AXIS: {
				CoordinateSystemAxis coordinateSystemAxis = (CoordinateSystemAxis)theEObject;
				T result = caseCoordinateSystemAxis(coordinateSystemAxis);
				if (result == null) result = caseElement(coordinateSystemAxis);
				if (result == null) result = caseDatamodel_Element(coordinateSystemAxis);
				if (result == null) result = caseFace_Element(coordinateSystemAxis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ABSTRACT_MEASUREMENT_SYSTEM: {
				AbstractMeasurementSystem abstractMeasurementSystem = (AbstractMeasurementSystem)theEObject;
				T result = caseAbstractMeasurementSystem(abstractMeasurementSystem);
				if (result == null) result = caseElement(abstractMeasurementSystem);
				if (result == null) result = caseDatamodel_Element(abstractMeasurementSystem);
				if (result == null) result = caseFace_Element(abstractMeasurementSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.STANDARD_MEASUREMENT_SYSTEM: {
				StandardMeasurementSystem standardMeasurementSystem = (StandardMeasurementSystem)theEObject;
				T result = caseStandardMeasurementSystem(standardMeasurementSystem);
				if (result == null) result = caseAbstractMeasurementSystem(standardMeasurementSystem);
				if (result == null) result = caseElement(standardMeasurementSystem);
				if (result == null) result = caseDatamodel_Element(standardMeasurementSystem);
				if (result == null) result = caseFace_Element(standardMeasurementSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.LANDMARK: {
				Landmark landmark = (Landmark)theEObject;
				T result = caseLandmark(landmark);
				if (result == null) result = caseElement(landmark);
				if (result == null) result = caseDatamodel_Element(landmark);
				if (result == null) result = caseFace_Element(landmark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT_SYSTEM: {
				MeasurementSystem measurementSystem = (MeasurementSystem)theEObject;
				T result = caseMeasurementSystem(measurementSystem);
				if (result == null) result = caseAbstractMeasurementSystem(measurementSystem);
				if (result == null) result = caseElement(measurementSystem);
				if (result == null) result = caseDatamodel_Element(measurementSystem);
				if (result == null) result = caseFace_Element(measurementSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT_SYSTEM_AXIS: {
				MeasurementSystemAxis measurementSystemAxis = (MeasurementSystemAxis)theEObject;
				T result = caseMeasurementSystemAxis(measurementSystemAxis);
				if (result == null) result = caseElement(measurementSystemAxis);
				if (result == null) result = caseDatamodel_Element(measurementSystemAxis);
				if (result == null) result = caseFace_Element(measurementSystemAxis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.REFERENCE_POINT: {
				ReferencePoint referencePoint = (ReferencePoint)theEObject;
				T result = caseReferencePoint(referencePoint);
				if (result == null) result = caseFace_Element(referencePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.REFERENCE_POINT_PART: {
				ReferencePointPart referencePointPart = (ReferencePointPart)theEObject;
				T result = caseReferencePointPart(referencePointPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.VALUE_TYPE_UNIT: {
				ValueTypeUnit valueTypeUnit = (ValueTypeUnit)theEObject;
				T result = caseValueTypeUnit(valueTypeUnit);
				if (result == null) result = caseElement(valueTypeUnit);
				if (result == null) result = caseAbstractMeasurement(valueTypeUnit);
				if (result == null) result = caseDatamodel_Element(valueTypeUnit);
				if (result == null) result = caseFace_Element(valueTypeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseFace_Element(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.INTEGER_CONSTRAINT: {
				IntegerConstraint integerConstraint = (IntegerConstraint)theEObject;
				T result = caseIntegerConstraint(integerConstraint);
				if (result == null) result = caseConstraint(integerConstraint);
				if (result == null) result = caseFace_Element(integerConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.INTEGER_RANGE_CONSTRAINT: {
				IntegerRangeConstraint integerRangeConstraint = (IntegerRangeConstraint)theEObject;
				T result = caseIntegerRangeConstraint(integerRangeConstraint);
				if (result == null) result = caseIntegerConstraint(integerRangeConstraint);
				if (result == null) result = caseConstraint(integerRangeConstraint);
				if (result == null) result = caseFace_Element(integerRangeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.REAL_CONSTRAINT: {
				RealConstraint realConstraint = (RealConstraint)theEObject;
				T result = caseRealConstraint(realConstraint);
				if (result == null) result = caseConstraint(realConstraint);
				if (result == null) result = caseFace_Element(realConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.REAL_RANGE_CONSTRAINT: {
				RealRangeConstraint realRangeConstraint = (RealRangeConstraint)theEObject;
				T result = caseRealRangeConstraint(realRangeConstraint);
				if (result == null) result = caseRealConstraint(realRangeConstraint);
				if (result == null) result = caseConstraint(realRangeConstraint);
				if (result == null) result = caseFace_Element(realRangeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.STRING_CONSTRAINT: {
				StringConstraint stringConstraint = (StringConstraint)theEObject;
				T result = caseStringConstraint(stringConstraint);
				if (result == null) result = caseConstraint(stringConstraint);
				if (result == null) result = caseFace_Element(stringConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.REGULAR_EXPRESSION_CONSTRAINT: {
				RegularExpressionConstraint regularExpressionConstraint = (RegularExpressionConstraint)theEObject;
				T result = caseRegularExpressionConstraint(regularExpressionConstraint);
				if (result == null) result = caseStringConstraint(regularExpressionConstraint);
				if (result == null) result = caseConstraint(regularExpressionConstraint);
				if (result == null) result = caseFace_Element(regularExpressionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.FIXED_LENGTH_STRING_CONSTRAINT: {
				FixedLengthStringConstraint fixedLengthStringConstraint = (FixedLengthStringConstraint)theEObject;
				T result = caseFixedLengthStringConstraint(fixedLengthStringConstraint);
				if (result == null) result = caseStringConstraint(fixedLengthStringConstraint);
				if (result == null) result = caseConstraint(fixedLengthStringConstraint);
				if (result == null) result = caseFace_Element(fixedLengthStringConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ENUMERATION_CONSTRAINT: {
				EnumerationConstraint enumerationConstraint = (EnumerationConstraint)theEObject;
				T result = caseEnumerationConstraint(enumerationConstraint);
				if (result == null) result = caseConstraint(enumerationConstraint);
				if (result == null) result = caseFace_Element(enumerationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT_CONSTRAINT: {
				MeasurementConstraint measurementConstraint = (MeasurementConstraint)theEObject;
				T result = caseMeasurementConstraint(measurementConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT_SYSTEM_CONVERSION: {
				MeasurementSystemConversion measurementSystemConversion = (MeasurementSystemConversion)theEObject;
				T result = caseMeasurementSystemConversion(measurementSystemConversion);
				if (result == null) result = caseElement(measurementSystemConversion);
				if (result == null) result = caseDatamodel_Element(measurementSystemConversion);
				if (result == null) result = caseFace_Element(measurementSystemConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ABSTRACT_MEASUREMENT: {
				AbstractMeasurement abstractMeasurement = (AbstractMeasurement)theEObject;
				T result = caseAbstractMeasurement(abstractMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = caseComposableElement(measurement);
				if (result == null) result = caseAbstractMeasurement(measurement);
				if (result == null) result = caseElement(measurement);
				if (result == null) result = caseDatamodel_Element(measurement);
				if (result == null) result = caseFace_Element(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT_AXIS: {
				MeasurementAxis measurementAxis = (MeasurementAxis)theEObject;
				T result = caseMeasurementAxis(measurementAxis);
				if (result == null) result = caseElement(measurementAxis);
				if (result == null) result = caseAbstractMeasurement(measurementAxis);
				if (result == null) result = caseDatamodel_Element(measurementAxis);
				if (result == null) result = caseFace_Element(measurementAxis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT_ATTRIBUTE: {
				MeasurementAttribute measurementAttribute = (MeasurementAttribute)theEObject;
				T result = caseMeasurementAttribute(measurementAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEASUREMENT_CONVERSION: {
				MeasurementConversion measurementConversion = (MeasurementConversion)theEObject;
				T result = caseMeasurementConversion(measurementConversion);
				if (result == null) result = caseElement(measurementConversion);
				if (result == null) result = caseDatamodel_Element(measurementConversion);
				if (result == null) result = caseFace_Element(measurementConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.COMPOSABLE_ELEMENT: {
				ComposableElement composableElement = (ComposableElement)theEObject;
				T result = caseComposableElement(composableElement);
				if (result == null) result = caseElement(composableElement);
				if (result == null) result = caseDatamodel_Element(composableElement);
				if (result == null) result = caseFace_Element(composableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.CHARACTERISTIC: {
				Characteristic characteristic = (Characteristic)theEObject;
				T result = caseCharacteristic(characteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseComposableElement(entity);
				if (result == null) result = caseTraceableElement(entity);
				if (result == null) result = caseElement(entity);
				if (result == null) result = caseDatamodel_Element(entity);
				if (result == null) result = caseFace_Element(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseCharacteristic(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseEntity(association);
				if (result == null) result = caseComposableElement(association);
				if (result == null) result = caseTraceableElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = caseDatamodel_Element(association);
				if (result == null) result = caseFace_Element(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseCharacteristic(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.PATH_NODE: {
				PathNode pathNode = (PathNode)theEObject;
				T result = casePathNode(pathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.PARTICIPANT_PATH_NODE: {
				ParticipantPathNode participantPathNode = (ParticipantPathNode)theEObject;
				T result = caseParticipantPathNode(participantPathNode);
				if (result == null) result = casePathNode(participantPathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.CHARACTERISTIC_PATH_NODE: {
				CharacteristicPathNode characteristicPathNode = (CharacteristicPathNode)theEObject;
				T result = caseCharacteristicPathNode(characteristicPathNode);
				if (result == null) result = casePathNode(characteristicPathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseElement(view);
				if (result == null) result = caseTraceableElement(view);
				if (result == null) result = caseDatamodel_Element(view);
				if (result == null) result = caseFace_Element(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseView(query);
				if (result == null) result = caseElement(query);
				if (result == null) result = caseTraceableElement(query);
				if (result == null) result = caseDatamodel_Element(query);
				if (result == null) result = caseFace_Element(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.COMPOSITE_QUERY: {
				CompositeQuery compositeQuery = (CompositeQuery)theEObject;
				T result = caseCompositeQuery(compositeQuery);
				if (result == null) result = caseView(compositeQuery);
				if (result == null) result = caseElement(compositeQuery);
				if (result == null) result = caseDatamodel_Element(compositeQuery);
				if (result == null) result = caseTraceableElement(compositeQuery);
				if (result == null) result = caseFace_Element(compositeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.QUERY_COMPOSITION: {
				QueryComposition queryComposition = (QueryComposition)theEObject;
				T result = caseQueryComposition(queryComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convertible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convertible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvertibleElement(ConvertibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversion(Conversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affine Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affine Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffineConversion(AffineConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(face.datamodel.logical.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(face.datamodel.logical.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(face.datamodel.logical.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeric(Numeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(face.datamodel.logical.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatural(Natural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeReal(NonNegativeReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerated(Enumerated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLabel(EnumerationLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateSystem(CoordinateSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate System Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate System Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateSystemAxis(CoordinateSystemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Measurement System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Measurement System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMeasurementSystem(AbstractMeasurementSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Measurement System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Measurement System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardMeasurementSystem(StandardMeasurementSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landmark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landmark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandmark(Landmark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementSystem(MeasurementSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement System Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement System Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementSystemAxis(MeasurementSystemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencePoint(ReferencePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Point Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Point Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencePointPart(ReferencePointPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTypeUnit(ValueTypeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstraint(IntegerConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerRangeConstraint(IntegerRangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealConstraint(RealConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealRangeConstraint(RealRangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstraint(StringConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Expression Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Expression Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularExpressionConstraint(RegularExpressionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Length String Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Length String Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedLengthStringConstraint(FixedLengthStringConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationConstraint(EnumerationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementConstraint(MeasurementConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement System Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement System Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementSystemConversion(MeasurementSystemConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMeasurement(AbstractMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementAxis(MeasurementAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementAttribute(MeasurementAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementConversion(MeasurementConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposableElement(ComposableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristic(Characteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathNode(PathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantPathNode(ParticipantPathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicPathNode(CharacteristicPathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeQuery(CompositeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryComposition(QueryComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFace_Element(face.Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatamodel_Element(face.datamodel.Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogicalSwitch
