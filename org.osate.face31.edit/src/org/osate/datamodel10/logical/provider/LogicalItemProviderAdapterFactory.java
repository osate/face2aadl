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
package org.osate.datamodel10.logical.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.osate.datamodel10.logical.util.LogicalAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalItemProviderAdapterFactory extends LogicalAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Unit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitItemProvider unitItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitAdapter() {
		if (unitItemProvider == null) {
			unitItemProvider = new UnitItemProvider(this);
		}

		return unitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Conversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionItemProvider conversionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Conversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConversionAdapter() {
		if (conversionItemProvider == null) {
			conversionItemProvider = new ConversionItemProvider(this);
		}

		return conversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.AffineConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffineConversionItemProvider affineConversionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.AffineConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAffineConversionAdapter() {
		if (affineConversionItemProvider == null) {
			affineConversionItemProvider = new AffineConversionItemProvider(this);
		}

		return affineConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.String} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringItemProvider stringItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringAdapter() {
		if (stringItemProvider == null) {
			stringItemProvider = new StringItemProvider(this);
		}

		return stringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Character} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterItemProvider characterItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Character}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacterAdapter() {
		if (characterItemProvider == null) {
			characterItemProvider = new CharacterItemProvider(this);
		}

		return characterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Boolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanItemProvider booleanItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAdapter() {
		if (booleanItemProvider == null) {
			booleanItemProvider = new BooleanItemProvider(this);
		}

		return booleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Integer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerItemProvider integerItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerAdapter() {
		if (integerItemProvider == null) {
			integerItemProvider = new IntegerItemProvider(this);
		}

		return integerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Natural} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalItemProvider naturalItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Natural}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNaturalAdapter() {
		if (naturalItemProvider == null) {
			naturalItemProvider = new NaturalItemProvider(this);
		}

		return naturalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Real} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealItemProvider realItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Real}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealAdapter() {
		if (realItemProvider == null) {
			realItemProvider = new RealItemProvider(this);
		}

		return realItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.NonNegativeReal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonNegativeRealItemProvider nonNegativeRealItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.NonNegativeReal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNonNegativeRealAdapter() {
		if (nonNegativeRealItemProvider == null) {
			nonNegativeRealItemProvider = new NonNegativeRealItemProvider(this);
		}

		return nonNegativeRealItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Enumerated} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedItemProvider enumeratedItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Enumerated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumeratedAdapter() {
		if (enumeratedItemProvider == null) {
			enumeratedItemProvider = new EnumeratedItemProvider(this);
		}

		return enumeratedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.EnumerationLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLabelItemProvider enumerationLabelItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.EnumerationLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationLabelAdapter() {
		if (enumerationLabelItemProvider == null) {
			enumerationLabelItemProvider = new EnumerationLabelItemProvider(this);
		}

		return enumerationLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.CoordinateSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystemItemProvider coordinateSystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.CoordinateSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinateSystemAdapter() {
		if (coordinateSystemItemProvider == null) {
			coordinateSystemItemProvider = new CoordinateSystemItemProvider(this);
		}

		return coordinateSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.CoordinateSystemAxis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystemAxisItemProvider coordinateSystemAxisItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.CoordinateSystemAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinateSystemAxisAdapter() {
		if (coordinateSystemAxisItemProvider == null) {
			coordinateSystemAxisItemProvider = new CoordinateSystemAxisItemProvider(this);
		}

		return coordinateSystemAxisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.StandardMeasurementSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardMeasurementSystemItemProvider standardMeasurementSystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.StandardMeasurementSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStandardMeasurementSystemAdapter() {
		if (standardMeasurementSystemItemProvider == null) {
			standardMeasurementSystemItemProvider = new StandardMeasurementSystemItemProvider(this);
		}

		return standardMeasurementSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Landmark} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandmarkItemProvider landmarkItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Landmark}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLandmarkAdapter() {
		if (landmarkItemProvider == null) {
			landmarkItemProvider = new LandmarkItemProvider(this);
		}

		return landmarkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.MeasurementSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementSystemItemProvider measurementSystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.MeasurementSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementSystemAdapter() {
		if (measurementSystemItemProvider == null) {
			measurementSystemItemProvider = new MeasurementSystemItemProvider(this);
		}

		return measurementSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.MeasurementSystemAxis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementSystemAxisItemProvider measurementSystemAxisItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.MeasurementSystemAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementSystemAxisAdapter() {
		if (measurementSystemAxisItemProvider == null) {
			measurementSystemAxisItemProvider = new MeasurementSystemAxisItemProvider(this);
		}

		return measurementSystemAxisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.ReferencePoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencePointItemProvider referencePointItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.ReferencePoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferencePointAdapter() {
		if (referencePointItemProvider == null) {
			referencePointItemProvider = new ReferencePointItemProvider(this);
		}

		return referencePointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.ReferencePointPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencePointPartItemProvider referencePointPartItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.ReferencePointPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferencePointPartAdapter() {
		if (referencePointPartItemProvider == null) {
			referencePointPartItemProvider = new ReferencePointPartItemProvider(this);
		}

		return referencePointPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.ValueTypeUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeUnitItemProvider valueTypeUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.ValueTypeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueTypeUnitAdapter() {
		if (valueTypeUnitItemProvider == null) {
			valueTypeUnitItemProvider = new ValueTypeUnitItemProvider(this);
		}

		return valueTypeUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.IntegerRangeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerRangeConstraintItemProvider integerRangeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.IntegerRangeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerRangeConstraintAdapter() {
		if (integerRangeConstraintItemProvider == null) {
			integerRangeConstraintItemProvider = new IntegerRangeConstraintItemProvider(this);
		}

		return integerRangeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.RealRangeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealRangeConstraintItemProvider realRangeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.RealRangeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealRangeConstraintAdapter() {
		if (realRangeConstraintItemProvider == null) {
			realRangeConstraintItemProvider = new RealRangeConstraintItemProvider(this);
		}

		return realRangeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.RegularExpressionConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularExpressionConstraintItemProvider regularExpressionConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.RegularExpressionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegularExpressionConstraintAdapter() {
		if (regularExpressionConstraintItemProvider == null) {
			regularExpressionConstraintItemProvider = new RegularExpressionConstraintItemProvider(this);
		}

		return regularExpressionConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.FixedLengthStringConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedLengthStringConstraintItemProvider fixedLengthStringConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.FixedLengthStringConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedLengthStringConstraintAdapter() {
		if (fixedLengthStringConstraintItemProvider == null) {
			fixedLengthStringConstraintItemProvider = new FixedLengthStringConstraintItemProvider(this);
		}

		return fixedLengthStringConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.EnumerationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationConstraintItemProvider enumerationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.EnumerationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationConstraintAdapter() {
		if (enumerationConstraintItemProvider == null) {
			enumerationConstraintItemProvider = new EnumerationConstraintItemProvider(this);
		}

		return enumerationConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.MeasurementConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementConstraintItemProvider measurementConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.MeasurementConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementConstraintAdapter() {
		if (measurementConstraintItemProvider == null) {
			measurementConstraintItemProvider = new MeasurementConstraintItemProvider(this);
		}

		return measurementConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.MeasurementSystemConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementSystemConversionItemProvider measurementSystemConversionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.MeasurementSystemConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementSystemConversionAdapter() {
		if (measurementSystemConversionItemProvider == null) {
			measurementSystemConversionItemProvider = new MeasurementSystemConversionItemProvider(this);
		}

		return measurementSystemConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Measurement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementItemProvider measurementItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Measurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementAdapter() {
		if (measurementItemProvider == null) {
			measurementItemProvider = new MeasurementItemProvider(this);
		}

		return measurementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.MeasurementAxis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementAxisItemProvider measurementAxisItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.MeasurementAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementAxisAdapter() {
		if (measurementAxisItemProvider == null) {
			measurementAxisItemProvider = new MeasurementAxisItemProvider(this);
		}

		return measurementAxisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.MeasurementAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementAttributeItemProvider measurementAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.MeasurementAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementAttributeAdapter() {
		if (measurementAttributeItemProvider == null) {
			measurementAttributeItemProvider = new MeasurementAttributeItemProvider(this);
		}

		return measurementAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.MeasurementConversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementConversionItemProvider measurementConversionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.MeasurementConversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementConversionAdapter() {
		if (measurementConversionItemProvider == null) {
			measurementConversionItemProvider = new MeasurementConversionItemProvider(this);
		}

		return measurementConversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Composition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionItemProvider compositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Composition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositionAdapter() {
		if (compositionItemProvider == null) {
			compositionItemProvider = new CompositionItemProvider(this);
		}

		return compositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.ParticipantPathNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantPathNodeItemProvider participantPathNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.ParticipantPathNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantPathNodeAdapter() {
		if (participantPathNodeItemProvider == null) {
			participantPathNodeItemProvider = new ParticipantPathNodeItemProvider(this);
		}

		return participantPathNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.CharacteristicPathNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicPathNodeItemProvider characteristicPathNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.CharacteristicPathNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicPathNodeAdapter() {
		if (characteristicPathNodeItemProvider == null) {
			characteristicPathNodeItemProvider = new CharacteristicPathNodeItemProvider(this);
		}

		return characteristicPathNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.Query} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryItemProvider queryItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryAdapter() {
		if (queryItemProvider == null) {
			queryItemProvider = new QueryItemProvider(this);
		}

		return queryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.CompositeQuery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeQueryItemProvider compositeQueryItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.CompositeQuery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeQueryAdapter() {
		if (compositeQueryItemProvider == null) {
			compositeQueryItemProvider = new CompositeQueryItemProvider(this);
		}

		return compositeQueryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.osate.datamodel10.logical.QueryComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCompositionItemProvider queryCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.osate.datamodel10.logical.QueryComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryCompositionAdapter() {
		if (queryCompositionItemProvider == null) {
			queryCompositionItemProvider = new QueryCompositionItemProvider(this);
		}

		return queryCompositionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (unitItemProvider != null) unitItemProvider.dispose();
		if (conversionItemProvider != null) conversionItemProvider.dispose();
		if (affineConversionItemProvider != null) affineConversionItemProvider.dispose();
		if (stringItemProvider != null) stringItemProvider.dispose();
		if (characterItemProvider != null) characterItemProvider.dispose();
		if (booleanItemProvider != null) booleanItemProvider.dispose();
		if (integerItemProvider != null) integerItemProvider.dispose();
		if (naturalItemProvider != null) naturalItemProvider.dispose();
		if (realItemProvider != null) realItemProvider.dispose();
		if (nonNegativeRealItemProvider != null) nonNegativeRealItemProvider.dispose();
		if (enumeratedItemProvider != null) enumeratedItemProvider.dispose();
		if (enumerationLabelItemProvider != null) enumerationLabelItemProvider.dispose();
		if (coordinateSystemItemProvider != null) coordinateSystemItemProvider.dispose();
		if (coordinateSystemAxisItemProvider != null) coordinateSystemAxisItemProvider.dispose();
		if (standardMeasurementSystemItemProvider != null) standardMeasurementSystemItemProvider.dispose();
		if (landmarkItemProvider != null) landmarkItemProvider.dispose();
		if (measurementSystemItemProvider != null) measurementSystemItemProvider.dispose();
		if (measurementSystemAxisItemProvider != null) measurementSystemAxisItemProvider.dispose();
		if (referencePointItemProvider != null) referencePointItemProvider.dispose();
		if (referencePointPartItemProvider != null) referencePointPartItemProvider.dispose();
		if (valueTypeUnitItemProvider != null) valueTypeUnitItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (integerRangeConstraintItemProvider != null) integerRangeConstraintItemProvider.dispose();
		if (realRangeConstraintItemProvider != null) realRangeConstraintItemProvider.dispose();
		if (regularExpressionConstraintItemProvider != null) regularExpressionConstraintItemProvider.dispose();
		if (fixedLengthStringConstraintItemProvider != null) fixedLengthStringConstraintItemProvider.dispose();
		if (enumerationConstraintItemProvider != null) enumerationConstraintItemProvider.dispose();
		if (measurementConstraintItemProvider != null) measurementConstraintItemProvider.dispose();
		if (measurementSystemConversionItemProvider != null) measurementSystemConversionItemProvider.dispose();
		if (measurementItemProvider != null) measurementItemProvider.dispose();
		if (measurementAxisItemProvider != null) measurementAxisItemProvider.dispose();
		if (measurementAttributeItemProvider != null) measurementAttributeItemProvider.dispose();
		if (measurementConversionItemProvider != null) measurementConversionItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (compositionItemProvider != null) compositionItemProvider.dispose();
		if (associationItemProvider != null) associationItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (participantPathNodeItemProvider != null) participantPathNodeItemProvider.dispose();
		if (characteristicPathNodeItemProvider != null) characteristicPathNodeItemProvider.dispose();
		if (queryItemProvider != null) queryItemProvider.dispose();
		if (compositeQueryItemProvider != null) compositeQueryItemProvider.dispose();
		if (queryCompositionItemProvider != null) queryCompositionItemProvider.dispose();
	}

}