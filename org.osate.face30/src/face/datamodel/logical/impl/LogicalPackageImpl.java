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

import face.FacePackage;

import face.datamodel.DatamodelPackage;

import face.datamodel.conceptual.ConceptualPackage;

import face.datamodel.conceptual.impl.ConceptualPackageImpl;

import face.datamodel.impl.DatamodelPackageImpl;

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

import face.datamodel.platform.PlatformPackage;

import face.datamodel.platform.impl.PlatformPackageImpl;

import face.impl.FacePackageImpl;

import face.integration.IntegrationPackage;

import face.integration.impl.IntegrationPackageImpl;

import face.traceability.TraceabilityPackage;

import face.traceability.impl.TraceabilityPackageImpl;

import face.uop.UopPackage;

import face.uop.impl.UopPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalPackageImpl extends EPackageImpl implements LogicalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertibleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affineConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateSystemAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMeasurementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardMeasurementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landmarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementSystemAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencePointPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerRangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realRangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularExpressionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedLengthStringConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementSystemConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantPathNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicPathNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryCompositionEClass = null;

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
	 * @see face.datamodel.logical.LogicalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicalPackageImpl() {
		super(eNS_URI, LogicalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogicalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicalPackage init() {
		if (isInited) return (LogicalPackage)EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);

		// Obtain or create and register package
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogicalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogicalPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FacePackageImpl theFacePackage = (FacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacePackage.eNS_URI) instanceof FacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacePackage.eNS_URI) : FacePackage.eINSTANCE);
		DatamodelPackageImpl theDatamodelPackage = (DatamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI) instanceof DatamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI) : DatamodelPackage.eINSTANCE);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) instanceof ConceptualPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) : ConceptualPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		UopPackageImpl theUopPackage = (UopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UopPackage.eNS_URI) instanceof UopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UopPackage.eNS_URI) : UopPackage.eINSTANCE);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) instanceof IntegrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) : IntegrationPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theLogicalPackage.createPackageContents();
		theFacePackage.createPackageContents();
		theDatamodelPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theUopPackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theLogicalPackage.initializePackageContents();
		theFacePackage.initializePackageContents();
		theDatamodelPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theUopPackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogicalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogicalPackage.eNS_URI, theLogicalPackage);
		return theLogicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvertibleElement() {
		return convertibleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversion() {
		return conversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversion_Destination() {
		return (EReference)conversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversion_Source() {
		return (EReference)conversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffineConversion() {
		return affineConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineConversion_ConversionFactor() {
		return (EAttribute)affineConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineConversion_Offset() {
		return (EAttribute)affineConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeric() {
		return numericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNatural() {
		return naturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReal() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeReal() {
		return nonNegativeRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerated() {
		return enumeratedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerated_Label() {
		return (EReference)enumeratedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerated_StandardReference() {
		return (EAttribute)enumeratedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLabel() {
		return enumerationLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateSystem() {
		return coordinateSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateSystem_Axis() {
		return (EReference)coordinateSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystem_AxisRelationshipDescription() {
		return (EAttribute)coordinateSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystem_AngleEquation() {
		return (EAttribute)coordinateSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystem_DistanceEquation() {
		return (EAttribute)coordinateSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateSystemAxis() {
		return coordinateSystemAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMeasurementSystem() {
		return abstractMeasurementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardMeasurementSystem() {
		return standardMeasurementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardMeasurementSystem_ReferenceStandard() {
		return (EAttribute)standardMeasurementSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLandmark() {
		return landmarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementSystem() {
		return measurementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystem_MeasurementSystemAxis() {
		return (EReference)measurementSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystem_CoordinateSystem() {
		return (EReference)measurementSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystem_ReferencePoint() {
		return (EReference)measurementSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementSystem_ExternalStandardReference() {
		return (EAttribute)measurementSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementSystem_Orientation() {
		return (EAttribute)measurementSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystem_Constraint() {
		return (EReference)measurementSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementSystemAxis() {
		return measurementSystemAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystemAxis_Axis() {
		return (EReference)measurementSystemAxisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystemAxis_DefaultValueTypeUnit() {
		return (EReference)measurementSystemAxisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystemAxis_Constraint() {
		return (EReference)measurementSystemAxisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencePoint() {
		return referencePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencePoint_ReferencePointPart() {
		return (EReference)referencePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencePoint_Landmark() {
		return (EReference)referencePointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencePointPart() {
		return referencePointPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencePointPart_Axis() {
		return (EReference)referencePointPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencePointPart_Value() {
		return (EAttribute)referencePointPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencePointPart_ValueTypeUnit() {
		return (EReference)referencePointPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTypeUnit() {
		return valueTypeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeUnit_Unit() {
		return (EReference)valueTypeUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeUnit_ValueType() {
		return (EReference)valueTypeUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeUnit_Constraint() {
		return (EReference)valueTypeUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConstraint() {
		return integerConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerRangeConstraint() {
		return integerRangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRangeConstraint_LowerBound() {
		return (EAttribute)integerRangeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRangeConstraint_UpperBound() {
		return (EAttribute)integerRangeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealConstraint() {
		return realConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealRangeConstraint() {
		return realRangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealRangeConstraint_LowerBound() {
		return (EAttribute)realRangeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealRangeConstraint_UpperBound() {
		return (EAttribute)realRangeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealRangeConstraint_LowerBoundInclusive() {
		return (EAttribute)realRangeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealRangeConstraint_UpperBoundInclusive() {
		return (EAttribute)realRangeConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConstraint() {
		return stringConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularExpressionConstraint() {
		return regularExpressionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularExpressionConstraint_Expression() {
		return (EAttribute)regularExpressionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedLengthStringConstraint() {
		return fixedLengthStringConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedLengthStringConstraint_Length() {
		return (EAttribute)fixedLengthStringConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationConstraint() {
		return enumerationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationConstraint_AllowedValue() {
		return (EReference)enumerationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementConstraint() {
		return measurementConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementConstraint_ConstraintText() {
		return (EAttribute)measurementConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementSystemConversion() {
		return measurementSystemConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystemConversion_Source() {
		return (EReference)measurementSystemConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementSystemConversion_Target() {
		return (EReference)measurementSystemConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementSystemConversion_Equation() {
		return (EAttribute)measurementSystemConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementSystemConversion_ConversionLossDescription() {
		return (EAttribute)measurementSystemConversionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMeasurement() {
		return abstractMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Constraint() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_MeasurementAxis() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_MeasurementSystem() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Realizes() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Attribute() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementAxis() {
		return measurementAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementAxis_ValueTypeUnit() {
		return (EReference)measurementAxisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementAxis_MeasurementSystemAxis() {
		return (EReference)measurementAxisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementAxis_Constraint() {
		return (EReference)measurementAxisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementAxis_Realizes() {
		return (EReference)measurementAxisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementAttribute() {
		return measurementAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementAttribute_Type() {
		return (EReference)measurementAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementAttribute_Rolename() {
		return (EAttribute)measurementAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementConversion() {
		return measurementConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementConversion_Equation() {
		return (EAttribute)measurementConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementConversion_ConversionLossDescription() {
		return (EAttribute)measurementConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementConversion_Source() {
		return (EReference)measurementConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementConversion_Target() {
		return (EReference)measurementConversionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposableElement() {
		return composableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristic() {
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristic_Rolename() {
		return (EAttribute)characteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristic_LowerBound() {
		return (EAttribute)characteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristic_UpperBound() {
		return (EAttribute)characteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristic_Specializes() {
		return (EReference)characteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristic_Description() {
		return (EAttribute)characteristicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Composition() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Realizes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Specializes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Type() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Realizes() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Participant() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Type() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Realizes() {
		return (EReference)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_SourceLowerBound() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_SourceUpperBound() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Path() {
		return (EReference)participantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNode() {
		return pathNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathNode_Node() {
		return (EReference)pathNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantPathNode() {
		return participantPathNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantPathNode_ProjectedParticipant() {
		return (EReference)participantPathNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicPathNode() {
		return characteristicPathNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicPathNode_ProjectedCharacteristic() {
		return (EReference)characteristicPathNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Realizes() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Specification() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeQuery() {
		return compositeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeQuery_Composition() {
		return (EReference)compositeQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeQuery_Realizes() {
		return (EReference)compositeQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeQuery_IsUnion() {
		return (EAttribute)compositeQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryComposition() {
		return queryCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryComposition_Realizes() {
		return (EReference)queryCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryComposition_Rolename() {
		return (EAttribute)queryCompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryComposition_Type() {
		return (EReference)queryCompositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFactory getLogicalFactory() {
		return (LogicalFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);

		convertibleElementEClass = createEClass(CONVERTIBLE_ELEMENT);

		unitEClass = createEClass(UNIT);

		conversionEClass = createEClass(CONVERSION);
		createEReference(conversionEClass, CONVERSION__DESTINATION);
		createEReference(conversionEClass, CONVERSION__SOURCE);

		affineConversionEClass = createEClass(AFFINE_CONVERSION);
		createEAttribute(affineConversionEClass, AFFINE_CONVERSION__CONVERSION_FACTOR);
		createEAttribute(affineConversionEClass, AFFINE_CONVERSION__OFFSET);

		valueTypeEClass = createEClass(VALUE_TYPE);

		stringEClass = createEClass(STRING);

		characterEClass = createEClass(CHARACTER);

		booleanEClass = createEClass(BOOLEAN);

		numericEClass = createEClass(NUMERIC);

		integerEClass = createEClass(INTEGER);

		naturalEClass = createEClass(NATURAL);

		realEClass = createEClass(REAL);

		nonNegativeRealEClass = createEClass(NON_NEGATIVE_REAL);

		enumeratedEClass = createEClass(ENUMERATED);
		createEReference(enumeratedEClass, ENUMERATED__LABEL);
		createEAttribute(enumeratedEClass, ENUMERATED__STANDARD_REFERENCE);

		enumerationLabelEClass = createEClass(ENUMERATION_LABEL);

		coordinateSystemEClass = createEClass(COORDINATE_SYSTEM);
		createEReference(coordinateSystemEClass, COORDINATE_SYSTEM__AXIS);
		createEAttribute(coordinateSystemEClass, COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION);
		createEAttribute(coordinateSystemEClass, COORDINATE_SYSTEM__ANGLE_EQUATION);
		createEAttribute(coordinateSystemEClass, COORDINATE_SYSTEM__DISTANCE_EQUATION);

		coordinateSystemAxisEClass = createEClass(COORDINATE_SYSTEM_AXIS);

		abstractMeasurementSystemEClass = createEClass(ABSTRACT_MEASUREMENT_SYSTEM);

		standardMeasurementSystemEClass = createEClass(STANDARD_MEASUREMENT_SYSTEM);
		createEAttribute(standardMeasurementSystemEClass, STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD);

		landmarkEClass = createEClass(LANDMARK);

		measurementSystemEClass = createEClass(MEASUREMENT_SYSTEM);
		createEReference(measurementSystemEClass, MEASUREMENT_SYSTEM__MEASUREMENT_SYSTEM_AXIS);
		createEReference(measurementSystemEClass, MEASUREMENT_SYSTEM__COORDINATE_SYSTEM);
		createEReference(measurementSystemEClass, MEASUREMENT_SYSTEM__REFERENCE_POINT);
		createEAttribute(measurementSystemEClass, MEASUREMENT_SYSTEM__EXTERNAL_STANDARD_REFERENCE);
		createEAttribute(measurementSystemEClass, MEASUREMENT_SYSTEM__ORIENTATION);
		createEReference(measurementSystemEClass, MEASUREMENT_SYSTEM__CONSTRAINT);

		measurementSystemAxisEClass = createEClass(MEASUREMENT_SYSTEM_AXIS);
		createEReference(measurementSystemAxisEClass, MEASUREMENT_SYSTEM_AXIS__AXIS);
		createEReference(measurementSystemAxisEClass, MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT);
		createEReference(measurementSystemAxisEClass, MEASUREMENT_SYSTEM_AXIS__CONSTRAINT);

		referencePointEClass = createEClass(REFERENCE_POINT);
		createEReference(referencePointEClass, REFERENCE_POINT__REFERENCE_POINT_PART);
		createEReference(referencePointEClass, REFERENCE_POINT__LANDMARK);

		referencePointPartEClass = createEClass(REFERENCE_POINT_PART);
		createEReference(referencePointPartEClass, REFERENCE_POINT_PART__AXIS);
		createEAttribute(referencePointPartEClass, REFERENCE_POINT_PART__VALUE);
		createEReference(referencePointPartEClass, REFERENCE_POINT_PART__VALUE_TYPE_UNIT);

		valueTypeUnitEClass = createEClass(VALUE_TYPE_UNIT);
		createEReference(valueTypeUnitEClass, VALUE_TYPE_UNIT__UNIT);
		createEReference(valueTypeUnitEClass, VALUE_TYPE_UNIT__VALUE_TYPE);
		createEReference(valueTypeUnitEClass, VALUE_TYPE_UNIT__CONSTRAINT);

		constraintEClass = createEClass(CONSTRAINT);

		integerConstraintEClass = createEClass(INTEGER_CONSTRAINT);

		integerRangeConstraintEClass = createEClass(INTEGER_RANGE_CONSTRAINT);
		createEAttribute(integerRangeConstraintEClass, INTEGER_RANGE_CONSTRAINT__LOWER_BOUND);
		createEAttribute(integerRangeConstraintEClass, INTEGER_RANGE_CONSTRAINT__UPPER_BOUND);

		realConstraintEClass = createEClass(REAL_CONSTRAINT);

		realRangeConstraintEClass = createEClass(REAL_RANGE_CONSTRAINT);
		createEAttribute(realRangeConstraintEClass, REAL_RANGE_CONSTRAINT__LOWER_BOUND);
		createEAttribute(realRangeConstraintEClass, REAL_RANGE_CONSTRAINT__UPPER_BOUND);
		createEAttribute(realRangeConstraintEClass, REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE);
		createEAttribute(realRangeConstraintEClass, REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE);

		stringConstraintEClass = createEClass(STRING_CONSTRAINT);

		regularExpressionConstraintEClass = createEClass(REGULAR_EXPRESSION_CONSTRAINT);
		createEAttribute(regularExpressionConstraintEClass, REGULAR_EXPRESSION_CONSTRAINT__EXPRESSION);

		fixedLengthStringConstraintEClass = createEClass(FIXED_LENGTH_STRING_CONSTRAINT);
		createEAttribute(fixedLengthStringConstraintEClass, FIXED_LENGTH_STRING_CONSTRAINT__LENGTH);

		enumerationConstraintEClass = createEClass(ENUMERATION_CONSTRAINT);
		createEReference(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__ALLOWED_VALUE);

		measurementConstraintEClass = createEClass(MEASUREMENT_CONSTRAINT);
		createEAttribute(measurementConstraintEClass, MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT);

		measurementSystemConversionEClass = createEClass(MEASUREMENT_SYSTEM_CONVERSION);
		createEReference(measurementSystemConversionEClass, MEASUREMENT_SYSTEM_CONVERSION__SOURCE);
		createEReference(measurementSystemConversionEClass, MEASUREMENT_SYSTEM_CONVERSION__TARGET);
		createEAttribute(measurementSystemConversionEClass, MEASUREMENT_SYSTEM_CONVERSION__EQUATION);
		createEAttribute(measurementSystemConversionEClass, MEASUREMENT_SYSTEM_CONVERSION__CONVERSION_LOSS_DESCRIPTION);

		abstractMeasurementEClass = createEClass(ABSTRACT_MEASUREMENT);

		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__CONSTRAINT);
		createEReference(measurementEClass, MEASUREMENT__MEASUREMENT_AXIS);
		createEReference(measurementEClass, MEASUREMENT__MEASUREMENT_SYSTEM);
		createEReference(measurementEClass, MEASUREMENT__REALIZES);
		createEReference(measurementEClass, MEASUREMENT__ATTRIBUTE);

		measurementAxisEClass = createEClass(MEASUREMENT_AXIS);
		createEReference(measurementAxisEClass, MEASUREMENT_AXIS__VALUE_TYPE_UNIT);
		createEReference(measurementAxisEClass, MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS);
		createEReference(measurementAxisEClass, MEASUREMENT_AXIS__CONSTRAINT);
		createEReference(measurementAxisEClass, MEASUREMENT_AXIS__REALIZES);

		measurementAttributeEClass = createEClass(MEASUREMENT_ATTRIBUTE);
		createEReference(measurementAttributeEClass, MEASUREMENT_ATTRIBUTE__TYPE);
		createEAttribute(measurementAttributeEClass, MEASUREMENT_ATTRIBUTE__ROLENAME);

		measurementConversionEClass = createEClass(MEASUREMENT_CONVERSION);
		createEAttribute(measurementConversionEClass, MEASUREMENT_CONVERSION__EQUATION);
		createEAttribute(measurementConversionEClass, MEASUREMENT_CONVERSION__CONVERSION_LOSS_DESCRIPTION);
		createEReference(measurementConversionEClass, MEASUREMENT_CONVERSION__SOURCE);
		createEReference(measurementConversionEClass, MEASUREMENT_CONVERSION__TARGET);

		composableElementEClass = createEClass(COMPOSABLE_ELEMENT);

		characteristicEClass = createEClass(CHARACTERISTIC);
		createEAttribute(characteristicEClass, CHARACTERISTIC__ROLENAME);
		createEAttribute(characteristicEClass, CHARACTERISTIC__LOWER_BOUND);
		createEAttribute(characteristicEClass, CHARACTERISTIC__UPPER_BOUND);
		createEReference(characteristicEClass, CHARACTERISTIC__SPECIALIZES);
		createEAttribute(characteristicEClass, CHARACTERISTIC__DESCRIPTION);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__COMPOSITION);
		createEReference(entityEClass, ENTITY__REALIZES);
		createEReference(entityEClass, ENTITY__SPECIALIZES);

		compositionEClass = createEClass(COMPOSITION);
		createEReference(compositionEClass, COMPOSITION__TYPE);
		createEReference(compositionEClass, COMPOSITION__REALIZES);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__PARTICIPANT);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__TYPE);
		createEReference(participantEClass, PARTICIPANT__REALIZES);
		createEAttribute(participantEClass, PARTICIPANT__SOURCE_LOWER_BOUND);
		createEAttribute(participantEClass, PARTICIPANT__SOURCE_UPPER_BOUND);
		createEReference(participantEClass, PARTICIPANT__PATH);

		pathNodeEClass = createEClass(PATH_NODE);
		createEReference(pathNodeEClass, PATH_NODE__NODE);

		participantPathNodeEClass = createEClass(PARTICIPANT_PATH_NODE);
		createEReference(participantPathNodeEClass, PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT);

		characteristicPathNodeEClass = createEClass(CHARACTERISTIC_PATH_NODE);
		createEReference(characteristicPathNodeEClass, CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC);

		viewEClass = createEClass(VIEW);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__REALIZES);
		createEAttribute(queryEClass, QUERY__SPECIFICATION);

		compositeQueryEClass = createEClass(COMPOSITE_QUERY);
		createEReference(compositeQueryEClass, COMPOSITE_QUERY__COMPOSITION);
		createEReference(compositeQueryEClass, COMPOSITE_QUERY__REALIZES);
		createEAttribute(compositeQueryEClass, COMPOSITE_QUERY__IS_UNION);

		queryCompositionEClass = createEClass(QUERY_COMPOSITION);
		createEReference(queryCompositionEClass, QUERY_COMPOSITION__REALIZES);
		createEAttribute(queryCompositionEClass, QUERY_COMPOSITION__ROLENAME);
		createEReference(queryCompositionEClass, QUERY_COMPOSITION__TYPE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatamodelPackage theDatamodelPackage = (DatamodelPackage)EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI);
		FacePackage theFacePackage = (FacePackage)EPackage.Registry.INSTANCE.getEPackage(FacePackage.eNS_URI);
		ConceptualPackage theConceptualPackage = (ConceptualPackage)EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI);
		TraceabilityPackage theTraceabilityPackage = (TraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(theDatamodelPackage.getElement());
		convertibleElementEClass.getESuperTypes().add(this.getElement());
		unitEClass.getESuperTypes().add(this.getConvertibleElement());
		conversionEClass.getESuperTypes().add(this.getElement());
		affineConversionEClass.getESuperTypes().add(this.getConversion());
		valueTypeEClass.getESuperTypes().add(this.getElement());
		stringEClass.getESuperTypes().add(this.getValueType());
		characterEClass.getESuperTypes().add(this.getValueType());
		booleanEClass.getESuperTypes().add(this.getValueType());
		numericEClass.getESuperTypes().add(this.getValueType());
		integerEClass.getESuperTypes().add(this.getNumeric());
		naturalEClass.getESuperTypes().add(this.getNumeric());
		realEClass.getESuperTypes().add(this.getNumeric());
		nonNegativeRealEClass.getESuperTypes().add(this.getNumeric());
		enumeratedEClass.getESuperTypes().add(this.getValueType());
		enumerationLabelEClass.getESuperTypes().add(theFacePackage.getElement());
		coordinateSystemEClass.getESuperTypes().add(this.getElement());
		coordinateSystemAxisEClass.getESuperTypes().add(this.getElement());
		abstractMeasurementSystemEClass.getESuperTypes().add(this.getElement());
		standardMeasurementSystemEClass.getESuperTypes().add(this.getAbstractMeasurementSystem());
		landmarkEClass.getESuperTypes().add(this.getElement());
		measurementSystemEClass.getESuperTypes().add(this.getAbstractMeasurementSystem());
		measurementSystemAxisEClass.getESuperTypes().add(this.getElement());
		referencePointEClass.getESuperTypes().add(theFacePackage.getElement());
		valueTypeUnitEClass.getESuperTypes().add(this.getElement());
		valueTypeUnitEClass.getESuperTypes().add(this.getAbstractMeasurement());
		constraintEClass.getESuperTypes().add(theFacePackage.getElement());
		integerConstraintEClass.getESuperTypes().add(this.getConstraint());
		integerRangeConstraintEClass.getESuperTypes().add(this.getIntegerConstraint());
		realConstraintEClass.getESuperTypes().add(this.getConstraint());
		realRangeConstraintEClass.getESuperTypes().add(this.getRealConstraint());
		stringConstraintEClass.getESuperTypes().add(this.getConstraint());
		regularExpressionConstraintEClass.getESuperTypes().add(this.getStringConstraint());
		fixedLengthStringConstraintEClass.getESuperTypes().add(this.getStringConstraint());
		enumerationConstraintEClass.getESuperTypes().add(this.getConstraint());
		measurementSystemConversionEClass.getESuperTypes().add(this.getElement());
		measurementEClass.getESuperTypes().add(this.getComposableElement());
		measurementEClass.getESuperTypes().add(this.getAbstractMeasurement());
		measurementAxisEClass.getESuperTypes().add(this.getElement());
		measurementAxisEClass.getESuperTypes().add(this.getAbstractMeasurement());
		measurementConversionEClass.getESuperTypes().add(this.getElement());
		composableElementEClass.getESuperTypes().add(this.getElement());
		entityEClass.getESuperTypes().add(this.getComposableElement());
		entityEClass.getESuperTypes().add(theTraceabilityPackage.getTraceableElement());
		compositionEClass.getESuperTypes().add(this.getCharacteristic());
		associationEClass.getESuperTypes().add(this.getEntity());
		participantEClass.getESuperTypes().add(this.getCharacteristic());
		participantPathNodeEClass.getESuperTypes().add(this.getPathNode());
		characteristicPathNodeEClass.getESuperTypes().add(this.getPathNode());
		viewEClass.getESuperTypes().add(this.getElement());
		viewEClass.getESuperTypes().add(theTraceabilityPackage.getTraceableElement());
		queryEClass.getESuperTypes().add(this.getView());
		compositeQueryEClass.getESuperTypes().add(this.getElement());
		compositeQueryEClass.getESuperTypes().add(this.getView());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convertibleElementEClass, ConvertibleElement.class, "ConvertibleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conversionEClass, Conversion.class, "Conversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConversion_Destination(), this.getConvertibleElement(), null, "destination", null, 1, 1, Conversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversion_Source(), this.getConvertibleElement(), null, "source", null, 1, 1, Conversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affineConversionEClass, AffineConversion.class, "AffineConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffineConversion_ConversionFactor(), ecorePackage.getEFloat(), "conversionFactor", null, 1, 1, AffineConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffineConversion_Offset(), ecorePackage.getEFloat(), "offset", null, 1, 1, AffineConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, face.datamodel.logical.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterEClass, face.datamodel.logical.Character.class, "Character", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanEClass, face.datamodel.logical.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericEClass, Numeric.class, "Numeric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, face.datamodel.logical.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(naturalEClass, Natural.class, "Natural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonNegativeRealEClass, NonNegativeReal.class, "NonNegativeReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumeratedEClass, Enumerated.class, "Enumerated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerated_Label(), this.getEnumerationLabel(), null, "label", null, 1, -1, Enumerated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerated_StandardReference(), ecorePackage.getEString(), "standardReference", null, 0, 1, Enumerated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLabelEClass, EnumerationLabel.class, "EnumerationLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinateSystemEClass, CoordinateSystem.class, "CoordinateSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinateSystem_Axis(), this.getCoordinateSystemAxis(), null, "axis", null, 1, -1, CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoordinateSystem_AxisRelationshipDescription(), ecorePackage.getEString(), "axisRelationshipDescription", null, 0, 1, CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinateSystem_AngleEquation(), ecorePackage.getEString(), "angleEquation", null, 0, 1, CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinateSystem_DistanceEquation(), ecorePackage.getEString(), "distanceEquation", null, 0, 1, CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinateSystemAxisEClass, CoordinateSystemAxis.class, "CoordinateSystemAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractMeasurementSystemEClass, AbstractMeasurementSystem.class, "AbstractMeasurementSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardMeasurementSystemEClass, StandardMeasurementSystem.class, "StandardMeasurementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardMeasurementSystem_ReferenceStandard(), ecorePackage.getEString(), "referenceStandard", null, 0, 1, StandardMeasurementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landmarkEClass, Landmark.class, "Landmark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurementSystemEClass, MeasurementSystem.class, "MeasurementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementSystem_MeasurementSystemAxis(), this.getMeasurementSystemAxis(), null, "measurementSystemAxis", null, 1, -1, MeasurementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementSystem_CoordinateSystem(), this.getCoordinateSystem(), null, "coordinateSystem", null, 1, 1, MeasurementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementSystem_ReferencePoint(), this.getReferencePoint(), null, "referencePoint", null, 0, -1, MeasurementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementSystem_ExternalStandardReference(), ecorePackage.getEString(), "externalStandardReference", null, 0, 1, MeasurementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementSystem_Orientation(), ecorePackage.getEString(), "orientation", null, 0, 1, MeasurementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementSystem_Constraint(), this.getMeasurementConstraint(), null, "constraint", null, 0, -1, MeasurementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementSystemAxisEClass, MeasurementSystemAxis.class, "MeasurementSystemAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementSystemAxis_Axis(), this.getCoordinateSystemAxis(), null, "axis", null, 1, 1, MeasurementSystemAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementSystemAxis_DefaultValueTypeUnit(), this.getValueTypeUnit(), null, "defaultValueTypeUnit", null, 1, -1, MeasurementSystemAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementSystemAxis_Constraint(), this.getMeasurementConstraint(), null, "constraint", null, 0, -1, MeasurementSystemAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencePointEClass, ReferencePoint.class, "ReferencePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencePoint_ReferencePointPart(), this.getReferencePointPart(), null, "referencePointPart", null, 1, -1, ReferencePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferencePoint_Landmark(), this.getLandmark(), null, "landmark", null, 1, 1, ReferencePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencePointPartEClass, ReferencePointPart.class, "ReferencePointPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencePointPart_Axis(), this.getMeasurementSystemAxis(), null, "axis", null, 0, 1, ReferencePointPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferencePointPart_Value(), ecorePackage.getEString(), "value", null, 1, 1, ReferencePointPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencePointPart_ValueTypeUnit(), this.getValueTypeUnit(), null, "valueTypeUnit", null, 0, 1, ReferencePointPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeUnitEClass, ValueTypeUnit.class, "ValueTypeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueTypeUnit_Unit(), this.getUnit(), null, "unit", null, 1, 1, ValueTypeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueTypeUnit_ValueType(), this.getValueType(), null, "valueType", null, 1, 1, ValueTypeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueTypeUnit_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, ValueTypeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerConstraintEClass, IntegerConstraint.class, "IntegerConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerRangeConstraintEClass, IntegerRangeConstraint.class, "IntegerRangeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerRangeConstraint_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 1, 1, IntegerRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerRangeConstraint_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, IntegerRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realConstraintEClass, RealConstraint.class, "RealConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realRangeConstraintEClass, RealRangeConstraint.class, "RealRangeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealRangeConstraint_LowerBound(), ecorePackage.getEFloat(), "lowerBound", null, 1, 1, RealRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealRangeConstraint_UpperBound(), ecorePackage.getEFloat(), "upperBound", null, 1, 1, RealRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealRangeConstraint_LowerBoundInclusive(), ecorePackage.getEBoolean(), "lowerBoundInclusive", "true", 1, 1, RealRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealRangeConstraint_UpperBoundInclusive(), ecorePackage.getEBoolean(), "upperBoundInclusive", "true", 1, 1, RealRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstraintEClass, StringConstraint.class, "StringConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularExpressionConstraintEClass, RegularExpressionConstraint.class, "RegularExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularExpressionConstraint_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, RegularExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedLengthStringConstraintEClass, FixedLengthStringConstraint.class, "FixedLengthStringConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedLengthStringConstraint_Length(), ecorePackage.getEInt(), "length", null, 1, 1, FixedLengthStringConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationConstraintEClass, EnumerationConstraint.class, "EnumerationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationConstraint_AllowedValue(), this.getEnumerationLabel(), null, "allowedValue", null, 0, -1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(measurementConstraintEClass, MeasurementConstraint.class, "MeasurementConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementConstraint_ConstraintText(), ecorePackage.getEString(), "constraintText", null, 1, 1, MeasurementConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementSystemConversionEClass, MeasurementSystemConversion.class, "MeasurementSystemConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementSystemConversion_Source(), this.getMeasurementSystem(), null, "source", null, 1, 1, MeasurementSystemConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementSystemConversion_Target(), this.getMeasurementSystem(), null, "target", null, 1, 1, MeasurementSystemConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementSystemConversion_Equation(), ecorePackage.getEString(), "equation", null, 1, -1, MeasurementSystemConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementSystemConversion_ConversionLossDescription(), ecorePackage.getEString(), "conversionLossDescription", null, 0, 1, MeasurementSystemConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMeasurementEClass, AbstractMeasurement.class, "AbstractMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_Constraint(), this.getMeasurementConstraint(), null, "constraint", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_MeasurementAxis(), this.getMeasurementAxis(), null, "measurementAxis", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurement_MeasurementSystem(), this.getAbstractMeasurementSystem(), null, "measurementSystem", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Realizes(), theConceptualPackage.getObservable(), null, "realizes", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Attribute(), this.getMeasurementAttribute(), null, "attribute", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(measurementAxisEClass, MeasurementAxis.class, "MeasurementAxis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementAxis_ValueTypeUnit(), this.getValueTypeUnit(), null, "valueTypeUnit", null, 0, -1, MeasurementAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementAxis_MeasurementSystemAxis(), this.getMeasurementSystemAxis(), null, "measurementSystemAxis", null, 1, 1, MeasurementAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementAxis_Constraint(), this.getMeasurementConstraint(), null, "constraint", null, 0, -1, MeasurementAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementAxis_Realizes(), theConceptualPackage.getObservable(), null, "realizes", null, 0, 1, MeasurementAxis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementAttributeEClass, MeasurementAttribute.class, "MeasurementAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementAttribute_Type(), this.getMeasurement(), null, "type", null, 1, 1, MeasurementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementAttribute_Rolename(), ecorePackage.getEString(), "rolename", null, 1, 1, MeasurementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementConversionEClass, MeasurementConversion.class, "MeasurementConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementConversion_Equation(), ecorePackage.getEString(), "equation", null, 1, -1, MeasurementConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementConversion_ConversionLossDescription(), ecorePackage.getEString(), "conversionLossDescription", null, 0, 1, MeasurementConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementConversion_Source(), this.getMeasurement(), null, "source", null, 1, 1, MeasurementConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurementConversion_Target(), this.getMeasurement(), null, "target", null, 1, 1, MeasurementConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composableElementEClass, ComposableElement.class, "ComposableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacteristic_Rolename(), ecorePackage.getEString(), "rolename", "", 1, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristic_LowerBound(), ecorePackage.getEInt(), "lowerBound", "1", 1, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristic_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 1, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristic_Specializes(), this.getCharacteristic(), null, "specializes", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristic_Description(), ecorePackage.getEString(), "description", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Composition(), this.getComposition(), null, "composition", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntity_Realizes(), theConceptualPackage.getEntity(), null, "realizes", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Specializes(), this.getEntity(), null, "specializes", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposition_Type(), this.getComposableElement(), null, "type", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Realizes(), theConceptualPackage.getComposition(), null, "realizes", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Participant(), this.getParticipant(), null, "participant", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Type(), this.getEntity(), null, "type", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Realizes(), theConceptualPackage.getParticipant(), null, "realizes", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_SourceLowerBound(), ecorePackage.getEInt(), "sourceLowerBound", "0", 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_SourceUpperBound(), ecorePackage.getEInt(), "sourceUpperBound", "-1", 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Path(), this.getPathNode(), null, "path", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathNodeEClass, PathNode.class, "PathNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathNode_Node(), this.getPathNode(), null, "node", null, 0, 1, PathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantPathNodeEClass, ParticipantPathNode.class, "ParticipantPathNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipantPathNode_ProjectedParticipant(), this.getParticipant(), null, "projectedParticipant", null, 1, 1, ParticipantPathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicPathNodeEClass, CharacteristicPathNode.class, "CharacteristicPathNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicPathNode_ProjectedCharacteristic(), this.getCharacteristic(), null, "projectedCharacteristic", null, 1, 1, CharacteristicPathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Realizes(), theConceptualPackage.getQuery(), null, "realizes", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Specification(), ecorePackage.getEString(), "specification", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeQueryEClass, CompositeQuery.class, "CompositeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeQuery_Composition(), this.getQueryComposition(), null, "composition", null, 2, -1, CompositeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompositeQuery_Realizes(), theConceptualPackage.getCompositeQuery(), null, "realizes", null, 0, 1, CompositeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeQuery_IsUnion(), ecorePackage.getEBoolean(), "isUnion", null, 1, 1, CompositeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryCompositionEClass, QueryComposition.class, "QueryComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryComposition_Realizes(), theConceptualPackage.getQueryComposition(), null, "realizes", null, 0, 1, QueryComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryComposition_Rolename(), ecorePackage.getEString(), "rolename", "", 1, 1, QueryComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryComposition_Type(), this.getView(), null, "type", null, 1, 1, QueryComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //LogicalPackageImpl
