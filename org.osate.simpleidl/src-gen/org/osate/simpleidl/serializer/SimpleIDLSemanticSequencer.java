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
package org.osate.simpleidl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.simpleidl.services.SimpleIDLGrammarAccess;
import org.osate.simpleidl.simpleIDL.ArrayType;
import org.osate.simpleidl.simpleIDL.BooleanType;
import org.osate.simpleidl.simpleIDL.BoundedSequence;
import org.osate.simpleidl.simpleIDL.BoundedString;
import org.osate.simpleidl.simpleIDL.BoundedWideString;
import org.osate.simpleidl.simpleIDL.Case;
import org.osate.simpleidl.simpleIDL.CharType;
import org.osate.simpleidl.simpleIDL.DoubleType;
import org.osate.simpleidl.simpleIDL.FixedPtType;
import org.osate.simpleidl.simpleIDL.FloatType;
import org.osate.simpleidl.simpleIDL.LongDoubleType;
import org.osate.simpleidl.simpleIDL.Member;
import org.osate.simpleidl.simpleIDL.OctetType;
import org.osate.simpleidl.simpleIDL.ReferencedType;
import org.osate.simpleidl.simpleIDL.SignedLongInt;
import org.osate.simpleidl.simpleIDL.SignedLongLongInt;
import org.osate.simpleidl.simpleIDL.SignedShortInt;
import org.osate.simpleidl.simpleIDL.SimpleIDLPackage;
import org.osate.simpleidl.simpleIDL.Specification;
import org.osate.simpleidl.simpleIDL.Struct;
import org.osate.simpleidl.simpleIDL.StructForward;
import org.osate.simpleidl.simpleIDL.UnboundedSequence;
import org.osate.simpleidl.simpleIDL.UnboundedString;
import org.osate.simpleidl.simpleIDL.UnboundedWideString;
import org.osate.simpleidl.simpleIDL.Union;
import org.osate.simpleidl.simpleIDL.UnsignedLongInt;
import org.osate.simpleidl.simpleIDL.UnsignedLongLongInt;
import org.osate.simpleidl.simpleIDL.UnsignedShortInt;
import org.osate.simpleidl.simpleIDL.WideCharType;

@SuppressWarnings("all")
public class SimpleIDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimpleIDLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SimpleIDLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimpleIDLPackage.ARRAY_TYPE:
				sequence_NamedDefinition(context, (ArrayType) semanticObject); 
				return; 
			case SimpleIDLPackage.BOOLEAN_TYPE:
				sequence_NamedDefinition(context, (BooleanType) semanticObject); 
				return; 
			case SimpleIDLPackage.BOUNDED_SEQUENCE:
				sequence_NamedDefinition(context, (BoundedSequence) semanticObject); 
				return; 
			case SimpleIDLPackage.BOUNDED_STRING:
				sequence_NamedDefinition(context, (BoundedString) semanticObject); 
				return; 
			case SimpleIDLPackage.BOUNDED_WIDE_STRING:
				sequence_NamedDefinition(context, (BoundedWideString) semanticObject); 
				return; 
			case SimpleIDLPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case SimpleIDLPackage.CHAR_TYPE:
				sequence_NamedDefinition(context, (CharType) semanticObject); 
				return; 
			case SimpleIDLPackage.DOUBLE_TYPE:
				sequence_NamedDefinition(context, (DoubleType) semanticObject); 
				return; 
			case SimpleIDLPackage.ENUM:
				sequence_NamedDefinition(context, (org.osate.simpleidl.simpleIDL.Enum) semanticObject); 
				return; 
			case SimpleIDLPackage.FIXED_PT_TYPE:
				sequence_NamedDefinition(context, (FixedPtType) semanticObject); 
				return; 
			case SimpleIDLPackage.FLOAT_TYPE:
				sequence_NamedDefinition(context, (FloatType) semanticObject); 
				return; 
			case SimpleIDLPackage.LONG_DOUBLE_TYPE:
				sequence_NamedDefinition(context, (LongDoubleType) semanticObject); 
				return; 
			case SimpleIDLPackage.MEMBER:
				sequence_Member(context, (Member) semanticObject); 
				return; 
			case SimpleIDLPackage.MODULE:
				sequence_NamedDefinition(context, (org.osate.simpleidl.simpleIDL.Module) semanticObject); 
				return; 
			case SimpleIDLPackage.OCTET_TYPE:
				sequence_NamedDefinition(context, (OctetType) semanticObject); 
				return; 
			case SimpleIDLPackage.REFERENCED_TYPE:
				sequence_NamedDefinition(context, (ReferencedType) semanticObject); 
				return; 
			case SimpleIDLPackage.SIGNED_LONG_INT:
				sequence_NamedDefinition(context, (SignedLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.SIGNED_LONG_LONG_INT:
				sequence_NamedDefinition(context, (SignedLongLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.SIGNED_SHORT_INT:
				sequence_NamedDefinition(context, (SignedShortInt) semanticObject); 
				return; 
			case SimpleIDLPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case SimpleIDLPackage.STRUCT:
				sequence_NamedDefinition(context, (Struct) semanticObject); 
				return; 
			case SimpleIDLPackage.STRUCT_FORWARD:
				sequence_Definition(context, (StructForward) semanticObject); 
				return; 
			case SimpleIDLPackage.UNBOUNDED_SEQUENCE:
				sequence_NamedDefinition(context, (UnboundedSequence) semanticObject); 
				return; 
			case SimpleIDLPackage.UNBOUNDED_STRING:
				sequence_NamedDefinition(context, (UnboundedString) semanticObject); 
				return; 
			case SimpleIDLPackage.UNBOUNDED_WIDE_STRING:
				sequence_NamedDefinition(context, (UnboundedWideString) semanticObject); 
				return; 
			case SimpleIDLPackage.UNION:
				sequence_NamedDefinition(context, (Union) semanticObject); 
				return; 
			case SimpleIDLPackage.UNSIGNED_LONG_INT:
				sequence_NamedDefinition(context, (UnsignedLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.UNSIGNED_LONG_LONG_INT:
				sequence_NamedDefinition(context, (UnsignedLongLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.UNSIGNED_SHORT_INT:
				sequence_NamedDefinition(context, (UnsignedShortInt) semanticObject); 
				return; 
			case SimpleIDLPackage.WIDE_CHAR_TYPE:
				sequence_NamedDefinition(context, (WideCharType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Case returns Case
	 *
	 * Constraint:
	 *     (labels+=INT+ type=[NamedDefinition|ScopedName] name=ID)
	 */
	protected void sequence_Case(ISerializationContext context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns StructForward
	 *
	 * Constraint:
	 *     struct=[Struct|ID]
	 */
	protected void sequence_Definition(ISerializationContext context, StructForward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.STRUCT_FORWARD__STRUCT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.STRUCT_FORWARD__STRUCT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_1_2_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.STRUCT_FORWARD__STRUCT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Member
	 *
	 * Constraint:
	 *     (type=[NamedDefinition|ScopedName] name=ID)
	 */
	protected void sequence_Member(ISerializationContext context, Member semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.MEMBER__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.MEMBER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberAccess().getTypeNamedDefinitionScopedNameParserRuleCall_0_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.MEMBER__TYPE, false));
		feeder.accept(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns ArrayType
	 *     NamedDefinition returns ArrayType
	 *
	 * Constraint:
	 *     (type=[NamedDefinition|ScopedName] name=ID size=INT)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, ArrayType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_4_2_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.ARRAY_TYPE__TYPE, false));
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_4_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_4_5_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns BooleanType
	 *     NamedDefinition returns BooleanType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, BooleanType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_16_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns BoundedSequence
	 *     NamedDefinition returns BoundedSequence
	 *
	 * Constraint:
	 *     (type=[NamedDefinition|ScopedName] size=INT name=ID)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, BoundedSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__SIZE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_19_4_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__TYPE, false));
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_19_6_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_19_8_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns BoundedString
	 *     NamedDefinition returns BoundedString
	 *
	 * Constraint:
	 *     (size=INT name=ID)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, BoundedString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_STRING__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_STRING__SIZE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_21_4_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_21_6_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns BoundedWideString
	 *     NamedDefinition returns BoundedWideString
	 *
	 * Constraint:
	 *     (size=INT name=ID)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, BoundedWideString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_WIDE_STRING__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_WIDE_STRING__SIZE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getSizeINTTerminalRuleCall_23_4_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_23_6_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns CharType
	 *     NamedDefinition returns CharType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, CharType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_14_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns DoubleType
	 *     NamedDefinition returns DoubleType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, DoubleType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_12_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Enum
	 *     NamedDefinition returns Enum
	 *
	 * Constraint:
	 *     (name=ID literals+=ID literals+=ID*)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, org.osate.simpleidl.simpleIDL.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns FixedPtType
	 *     NamedDefinition returns FixedPtType
	 *
	 * Constraint:
	 *     (totalDigits=INT fractionalDigits=INT name=ID)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, FixedPtType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__TOTAL_DIGITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__TOTAL_DIGITS));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__FRACTIONAL_DIGITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__FRACTIONAL_DIGITS));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getTotalDigitsINTTerminalRuleCall_25_4_0(), semanticObject.getTotalDigits());
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getFractionalDigitsINTTerminalRuleCall_25_6_0(), semanticObject.getFractionalDigits());
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_25_8_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns FloatType
	 *     NamedDefinition returns FloatType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, FloatType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_11_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns LongDoubleType
	 *     NamedDefinition returns LongDoubleType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, LongDoubleType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_13_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Module
	 *     NamedDefinition returns Module
	 *
	 * Constraint:
	 *     (name=ID definitions+=Definition+)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, org.osate.simpleidl.simpleIDL.Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns OctetType
	 *     NamedDefinition returns OctetType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, OctetType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_17_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns ReferencedType
	 *     NamedDefinition returns ReferencedType
	 *
	 * Constraint:
	 *     (type=[NamedDefinition|ScopedName] name=ID)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, ReferencedType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.REFERENCED_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.REFERENCED_TYPE__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_18_2_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.REFERENCED_TYPE__TYPE, false));
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_18_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns SignedLongInt
	 *     NamedDefinition returns SignedLongInt
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, SignedLongInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_6_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns SignedLongLongInt
	 *     NamedDefinition returns SignedLongLongInt
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, SignedLongLongInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_7_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns SignedShortInt
	 *     NamedDefinition returns SignedShortInt
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, SignedShortInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_5_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Struct
	 *     NamedDefinition returns Struct
	 *
	 * Constraint:
	 *     (name=ID members+=Member+)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, Struct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns UnboundedSequence
	 *     NamedDefinition returns UnboundedSequence
	 *
	 * Constraint:
	 *     (type=[NamedDefinition|ScopedName] name=ID)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, UnboundedSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.UNBOUNDED_SEQUENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.UNBOUNDED_SEQUENCE__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getTypeNamedDefinitionScopedNameParserRuleCall_20_4_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.UNBOUNDED_SEQUENCE__TYPE, false));
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_20_6_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns UnboundedString
	 *     NamedDefinition returns UnboundedString
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, UnboundedString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_22_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns UnboundedWideString
	 *     NamedDefinition returns UnboundedWideString
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, UnboundedWideString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_24_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Union
	 *     NamedDefinition returns Union
	 *
	 * Constraint:
	 *     (name=ID cases+=Case+)
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, Union semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns UnsignedLongInt
	 *     NamedDefinition returns UnsignedLongInt
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, UnsignedLongInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_9_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns UnsignedLongLongInt
	 *     NamedDefinition returns UnsignedLongLongInt
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, UnsignedLongLongInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_10_5_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns UnsignedShortInt
	 *     NamedDefinition returns UnsignedShortInt
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, UnsignedShortInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_8_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns WideCharType
	 *     NamedDefinition returns WideCharType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedDefinition(ISerializationContext context, WideCharType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.NAMED_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedDefinitionAccess().getNameIDTerminalRuleCall_15_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     definitions+=Definition+
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
