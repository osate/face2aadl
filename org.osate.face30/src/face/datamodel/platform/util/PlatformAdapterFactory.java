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
package face.datamodel.platform.util;

import face.datamodel.platform.Association;
import face.datamodel.platform.BoundedString;
import face.datamodel.platform.Char;
import face.datamodel.platform.CharArray;
import face.datamodel.platform.CharType;
import face.datamodel.platform.Characteristic;
import face.datamodel.platform.CharacteristicPathNode;
import face.datamodel.platform.ComposableElement;
import face.datamodel.platform.CompositeTemplate;
import face.datamodel.platform.Composition;
import face.datamodel.platform.Element;
import face.datamodel.platform.Entity;
import face.datamodel.platform.Enumeration;
import face.datamodel.platform.Fixed;
import face.datamodel.platform.IDLArray;
import face.datamodel.platform.IDLBoundedString;
import face.datamodel.platform.IDLCharacterArray;
import face.datamodel.platform.IDLComposition;
import face.datamodel.platform.IDLInteger;
import face.datamodel.platform.IDLNumber;
import face.datamodel.platform.IDLPrimitive;
import face.datamodel.platform.IDLReal;
import face.datamodel.platform.IDLSequence;
import face.datamodel.platform.IDLStruct;
import face.datamodel.platform.IDLType;
import face.datamodel.platform.IDLUnboundedString;
import face.datamodel.platform.IDLUnsignedInteger;
import face.datamodel.platform.LongDouble;
import face.datamodel.platform.LongLong;
import face.datamodel.platform.Octet;
import face.datamodel.platform.Participant;
import face.datamodel.platform.ParticipantPathNode;
import face.datamodel.platform.PathNode;
import face.datamodel.platform.PhysicalDataType;
import face.datamodel.platform.PlatformPackage;
import face.datamodel.platform.Query;
import face.datamodel.platform.StringType;
import face.datamodel.platform.Template;
import face.datamodel.platform.TemplateComposition;
import face.datamodel.platform.ULong;
import face.datamodel.platform.ULongLong;
import face.datamodel.platform.UShort;
import face.datamodel.platform.View;

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
 * @see face.datamodel.platform.PlatformPackage
 * @generated
 */
public class PlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
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
	protected PlatformSwitch<Adapter> modelSwitch =
		new PlatformSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseComposableElement(ComposableElement object) {
				return createComposableElementAdapter();
			}
			@Override
			public Adapter casePhysicalDataType(PhysicalDataType object) {
				return createPhysicalDataTypeAdapter();
			}
			@Override
			public Adapter caseIDLType(IDLType object) {
				return createIDLTypeAdapter();
			}
			@Override
			public Adapter caseIDLPrimitive(IDLPrimitive object) {
				return createIDLPrimitiveAdapter();
			}
			@Override
			public Adapter caseBoolean(face.datamodel.platform.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseOctet(Octet object) {
				return createOctetAdapter();
			}
			@Override
			public Adapter caseCharType(CharType object) {
				return createCharTypeAdapter();
			}
			@Override
			public Adapter caseChar(Char object) {
				return createCharAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseIDLUnboundedString(IDLUnboundedString object) {
				return createIDLUnboundedStringAdapter();
			}
			@Override
			public Adapter caseString(face.datamodel.platform.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseIDLBoundedString(IDLBoundedString object) {
				return createIDLBoundedStringAdapter();
			}
			@Override
			public Adapter caseBoundedString(BoundedString object) {
				return createBoundedStringAdapter();
			}
			@Override
			public Adapter caseIDLCharacterArray(IDLCharacterArray object) {
				return createIDLCharacterArrayAdapter();
			}
			@Override
			public Adapter caseCharArray(CharArray object) {
				return createCharArrayAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseIDLNumber(IDLNumber object) {
				return createIDLNumberAdapter();
			}
			@Override
			public Adapter caseIDLInteger(IDLInteger object) {
				return createIDLIntegerAdapter();
			}
			@Override
			public Adapter caseShort(face.datamodel.platform.Short object) {
				return createShortAdapter();
			}
			@Override
			public Adapter caseLong(face.datamodel.platform.Long object) {
				return createLongAdapter();
			}
			@Override
			public Adapter caseLongLong(LongLong object) {
				return createLongLongAdapter();
			}
			@Override
			public Adapter caseIDLReal(IDLReal object) {
				return createIDLRealAdapter();
			}
			@Override
			public Adapter caseDouble(face.datamodel.platform.Double object) {
				return createDoubleAdapter();
			}
			@Override
			public Adapter caseLongDouble(LongDouble object) {
				return createLongDoubleAdapter();
			}
			@Override
			public Adapter caseFloat(face.datamodel.platform.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseFixed(Fixed object) {
				return createFixedAdapter();
			}
			@Override
			public Adapter caseIDLUnsignedInteger(IDLUnsignedInteger object) {
				return createIDLUnsignedIntegerAdapter();
			}
			@Override
			public Adapter caseUShort(UShort object) {
				return createUShortAdapter();
			}
			@Override
			public Adapter caseULong(ULong object) {
				return createULongAdapter();
			}
			@Override
			public Adapter caseULongLong(ULongLong object) {
				return createULongLongAdapter();
			}
			@Override
			public Adapter caseIDLSequence(IDLSequence object) {
				return createIDLSequenceAdapter();
			}
			@Override
			public Adapter caseIDLArray(IDLArray object) {
				return createIDLArrayAdapter();
			}
			@Override
			public Adapter caseIDLStruct(IDLStruct object) {
				return createIDLStructAdapter();
			}
			@Override
			public Adapter caseIDLComposition(IDLComposition object) {
				return createIDLCompositionAdapter();
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
			public Adapter caseCompositeTemplate(CompositeTemplate object) {
				return createCompositeTemplateAdapter();
			}
			@Override
			public Adapter caseTemplateComposition(TemplateComposition object) {
				return createTemplateCompositionAdapter();
			}
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
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
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.ComposableElement <em>Composable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.ComposableElement
	 * @generated
	 */
	public Adapter createComposableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.PhysicalDataType <em>Physical Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.PhysicalDataType
	 * @generated
	 */
	public Adapter createPhysicalDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLType
	 * @generated
	 */
	public Adapter createIDLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLPrimitive <em>IDL Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLPrimitive
	 * @generated
	 */
	public Adapter createIDLPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Octet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Octet
	 * @generated
	 */
	public Adapter createOctetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.CharType
	 * @generated
	 */
	public Adapter createCharTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Char
	 * @generated
	 */
	public Adapter createCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLUnboundedString <em>IDL Unbounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLUnboundedString
	 * @generated
	 */
	public Adapter createIDLUnboundedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLBoundedString <em>IDL Bounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLBoundedString
	 * @generated
	 */
	public Adapter createIDLBoundedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.BoundedString <em>Bounded String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.BoundedString
	 * @generated
	 */
	public Adapter createBoundedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLCharacterArray <em>IDL Character Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLCharacterArray
	 * @generated
	 */
	public Adapter createIDLCharacterArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.CharArray <em>Char Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.CharArray
	 * @generated
	 */
	public Adapter createCharArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLNumber <em>IDL Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLNumber
	 * @generated
	 */
	public Adapter createIDLNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLInteger <em>IDL Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLInteger
	 * @generated
	 */
	public Adapter createIDLIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Short
	 * @generated
	 */
	public Adapter createShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Long
	 * @generated
	 */
	public Adapter createLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.LongLong <em>Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.LongLong
	 * @generated
	 */
	public Adapter createLongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLReal <em>IDL Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLReal
	 * @generated
	 */
	public Adapter createIDLRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.LongDouble
	 * @generated
	 */
	public Adapter createLongDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Fixed
	 * @generated
	 */
	public Adapter createFixedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLUnsignedInteger <em>IDL Unsigned Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLUnsignedInteger
	 * @generated
	 */
	public Adapter createIDLUnsignedIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.UShort <em>UShort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.UShort
	 * @generated
	 */
	public Adapter createUShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.ULong <em>ULong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.ULong
	 * @generated
	 */
	public Adapter createULongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.ULongLong <em>ULong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.ULongLong
	 * @generated
	 */
	public Adapter createULongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLSequence <em>IDL Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLSequence
	 * @generated
	 */
	public Adapter createIDLSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLArray <em>IDL Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLArray
	 * @generated
	 */
	public Adapter createIDLArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLStruct <em>IDL Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLStruct
	 * @generated
	 */
	public Adapter createIDLStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.IDLComposition <em>IDL Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.IDLComposition
	 * @generated
	 */
	public Adapter createIDLCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.PathNode
	 * @generated
	 */
	public Adapter createPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.ParticipantPathNode <em>Participant Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.ParticipantPathNode
	 * @generated
	 */
	public Adapter createParticipantPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.CharacteristicPathNode <em>Characteristic Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.CharacteristicPathNode
	 * @generated
	 */
	public Adapter createCharacteristicPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.CompositeTemplate <em>Composite Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.CompositeTemplate
	 * @generated
	 */
	public Adapter createCompositeTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.TemplateComposition <em>Template Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.TemplateComposition
	 * @generated
	 */
	public Adapter createTemplateCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link face.datamodel.platform.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see face.datamodel.platform.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
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

} //PlatformAdapterFactory
