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
import org.osate.simpleidl.simpleIDL.Typedef;
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
				sequence_Definition(context, (ArrayType) semanticObject); 
				return; 
			case SimpleIDLPackage.BOOLEAN_TYPE:
				sequence_Type(context, (BooleanType) semanticObject); 
				return; 
			case SimpleIDLPackage.BOUNDED_SEQUENCE:
				sequence_Type(context, (BoundedSequence) semanticObject); 
				return; 
			case SimpleIDLPackage.BOUNDED_STRING:
				sequence_Type(context, (BoundedString) semanticObject); 
				return; 
			case SimpleIDLPackage.BOUNDED_WIDE_STRING:
				sequence_Type(context, (BoundedWideString) semanticObject); 
				return; 
			case SimpleIDLPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case SimpleIDLPackage.CHAR_TYPE:
				sequence_Type(context, (CharType) semanticObject); 
				return; 
			case SimpleIDLPackage.DOUBLE_TYPE:
				sequence_Type(context, (DoubleType) semanticObject); 
				return; 
			case SimpleIDLPackage.ENUM:
				sequence_Definition(context, (org.osate.simpleidl.simpleIDL.Enum) semanticObject); 
				return; 
			case SimpleIDLPackage.FIXED_PT_TYPE:
				sequence_Type(context, (FixedPtType) semanticObject); 
				return; 
			case SimpleIDLPackage.FLOAT_TYPE:
				sequence_Type(context, (FloatType) semanticObject); 
				return; 
			case SimpleIDLPackage.LONG_DOUBLE_TYPE:
				sequence_Type(context, (LongDoubleType) semanticObject); 
				return; 
			case SimpleIDLPackage.MEMBER:
				sequence_Member(context, (Member) semanticObject); 
				return; 
			case SimpleIDLPackage.MODULE:
				sequence_Definition(context, (org.osate.simpleidl.simpleIDL.Module) semanticObject); 
				return; 
			case SimpleIDLPackage.OCTET_TYPE:
				sequence_Type(context, (OctetType) semanticObject); 
				return; 
			case SimpleIDLPackage.REFERENCED_TYPE:
				sequence_Type(context, (ReferencedType) semanticObject); 
				return; 
			case SimpleIDLPackage.SIGNED_LONG_INT:
				sequence_Type(context, (SignedLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.SIGNED_LONG_LONG_INT:
				sequence_Type(context, (SignedLongLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.SIGNED_SHORT_INT:
				sequence_Type(context, (SignedShortInt) semanticObject); 
				return; 
			case SimpleIDLPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case SimpleIDLPackage.STRUCT:
				sequence_Definition(context, (Struct) semanticObject); 
				return; 
			case SimpleIDLPackage.STRUCT_FORWARD:
				sequence_Definition(context, (StructForward) semanticObject); 
				return; 
			case SimpleIDLPackage.TYPEDEF:
				sequence_Definition(context, (Typedef) semanticObject); 
				return; 
			case SimpleIDLPackage.UNBOUNDED_SEQUENCE:
				sequence_Type(context, (UnboundedSequence) semanticObject); 
				return; 
			case SimpleIDLPackage.UNBOUNDED_STRING:
				sequence_Type(context, (UnboundedString) semanticObject); 
				return; 
			case SimpleIDLPackage.UNBOUNDED_WIDE_STRING:
				sequence_Type(context, (UnboundedWideString) semanticObject); 
				return; 
			case SimpleIDLPackage.UNION:
				sequence_Definition(context, (Union) semanticObject); 
				return; 
			case SimpleIDLPackage.UNSIGNED_LONG_INT:
				sequence_Type(context, (UnsignedLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.UNSIGNED_LONG_LONG_INT:
				sequence_Type(context, (UnsignedLongLongInt) semanticObject); 
				return; 
			case SimpleIDLPackage.UNSIGNED_SHORT_INT:
				sequence_Type(context, (UnsignedShortInt) semanticObject); 
				return; 
			case SimpleIDLPackage.WIDE_CHAR_TYPE:
				sequence_Type(context, (WideCharType) semanticObject); 
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
	 *     (labels+=INT+ type=[Definition|ScopedName] name=ID)
	 */
	protected void sequence_Case(ISerializationContext context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns ArrayType
	 *
	 * Constraint:
	 *     (type=[Definition|ScopedName] name=ID size=INT)
	 */
	protected void sequence_Definition(ISerializationContext context, ArrayType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.ARRAY_TYPE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getTypeDefinitionScopedNameParserRuleCall_6_2_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.ARRAY_TYPE__TYPE, false));
		feeder.accept(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_6_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDefinitionAccess().getSizeINTTerminalRuleCall_6_5_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Enum
	 *
	 * Constraint:
	 *     (name=ID literals+=ID literals+=ID*)
	 */
	protected void sequence_Definition(ISerializationContext context, org.osate.simpleidl.simpleIDL.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Module
	 *
	 * Constraint:
	 *     (name=ID definitions+=Definition+)
	 */
	protected void sequence_Definition(ISerializationContext context, org.osate.simpleidl.simpleIDL.Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Struct
	 *
	 * Constraint:
	 *     (name=ID members+=Member+)
	 */
	protected void sequence_Definition(ISerializationContext context, Struct semanticObject) {
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
		feeder.accept(grammarAccess.getDefinitionAccess().getStructStructIDTerminalRuleCall_2_2_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.STRUCT_FORWARD__STRUCT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Typedef
	 *
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_Definition(ISerializationContext context, Typedef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.TYPEDEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.TYPEDEF__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.TYPEDEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.TYPEDEF__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_5_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_5_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Union
	 *
	 * Constraint:
	 *     (name=ID cases+=Case+)
	 */
	protected void sequence_Definition(ISerializationContext context, Union semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Member
	 *
	 * Constraint:
	 *     (type=[Definition|ScopedName] name=ID)
	 */
	protected void sequence_Member(ISerializationContext context, Member semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.MEMBER__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.MEMBER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberAccess().getTypeDefinitionScopedNameParserRuleCall_0_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.MEMBER__TYPE, false));
		feeder.accept(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
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
	
	
	/**
	 * Contexts:
	 *     Type returns BooleanType
	 *
	 * Constraint:
	 *     {BooleanType}
	 */
	protected void sequence_Type(ISerializationContext context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns BoundedSequence
	 *
	 * Constraint:
	 *     (type=[Definition|ScopedName] size=INT)
	 */
	protected void sequence_Type(ISerializationContext context, BoundedSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__TYPE));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_14_3_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.BOUNDED_SEQUENCE__TYPE, false));
		feeder.accept(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_14_5_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns BoundedString
	 *
	 * Constraint:
	 *     size=INT
	 */
	protected void sequence_Type(ISerializationContext context, BoundedString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_STRING__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_STRING__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_16_3_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns BoundedWideString
	 *
	 * Constraint:
	 *     size=INT
	 */
	protected void sequence_Type(ISerializationContext context, BoundedWideString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.BOUNDED_WIDE_STRING__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.BOUNDED_WIDE_STRING__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getSizeINTTerminalRuleCall_18_3_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns CharType
	 *
	 * Constraint:
	 *     {CharType}
	 */
	protected void sequence_Type(ISerializationContext context, CharType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns DoubleType
	 *
	 * Constraint:
	 *     {DoubleType}
	 */
	protected void sequence_Type(ISerializationContext context, DoubleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns FixedPtType
	 *
	 * Constraint:
	 *     (totalDigits=INT fractionalDigits=INT)
	 */
	protected void sequence_Type(ISerializationContext context, FixedPtType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__TOTAL_DIGITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__TOTAL_DIGITS));
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__FRACTIONAL_DIGITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.FIXED_PT_TYPE__FRACTIONAL_DIGITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTotalDigitsINTTerminalRuleCall_20_3_0(), semanticObject.getTotalDigits());
		feeder.accept(grammarAccess.getTypeAccess().getFractionalDigitsINTTerminalRuleCall_20_5_0(), semanticObject.getFractionalDigits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns FloatType
	 *
	 * Constraint:
	 *     {FloatType}
	 */
	protected void sequence_Type(ISerializationContext context, FloatType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns LongDoubleType
	 *
	 * Constraint:
	 *     {LongDoubleType}
	 */
	protected void sequence_Type(ISerializationContext context, LongDoubleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns OctetType
	 *
	 * Constraint:
	 *     {OctetType}
	 */
	protected void sequence_Type(ISerializationContext context, OctetType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns ReferencedType
	 *
	 * Constraint:
	 *     type=[Definition|ScopedName]
	 */
	protected void sequence_Type(ISerializationContext context, ReferencedType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.REFERENCED_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.REFERENCED_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_13_1_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.REFERENCED_TYPE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SignedLongInt
	 *
	 * Constraint:
	 *     {SignedLongInt}
	 */
	protected void sequence_Type(ISerializationContext context, SignedLongInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SignedLongLongInt
	 *
	 * Constraint:
	 *     {SignedLongLongInt}
	 */
	protected void sequence_Type(ISerializationContext context, SignedLongLongInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SignedShortInt
	 *
	 * Constraint:
	 *     {SignedShortInt}
	 */
	protected void sequence_Type(ISerializationContext context, SignedShortInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnboundedSequence
	 *
	 * Constraint:
	 *     type=[Definition|ScopedName]
	 */
	protected void sequence_Type(ISerializationContext context, UnboundedSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleIDLPackage.Literals.UNBOUNDED_SEQUENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleIDLPackage.Literals.UNBOUNDED_SEQUENCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTypeDefinitionScopedNameParserRuleCall_15_3_0_1(), semanticObject.eGet(SimpleIDLPackage.Literals.UNBOUNDED_SEQUENCE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnboundedString
	 *
	 * Constraint:
	 *     {UnboundedString}
	 */
	protected void sequence_Type(ISerializationContext context, UnboundedString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnboundedWideString
	 *
	 * Constraint:
	 *     {UnboundedWideString}
	 */
	protected void sequence_Type(ISerializationContext context, UnboundedWideString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnsignedLongInt
	 *
	 * Constraint:
	 *     {UnsignedLongInt}
	 */
	protected void sequence_Type(ISerializationContext context, UnsignedLongInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnsignedLongLongInt
	 *
	 * Constraint:
	 *     {UnsignedLongLongInt}
	 */
	protected void sequence_Type(ISerializationContext context, UnsignedLongLongInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnsignedShortInt
	 *
	 * Constraint:
	 *     {UnsignedShortInt}
	 */
	protected void sequence_Type(ISerializationContext context, UnsignedShortInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns WideCharType
	 *
	 * Constraint:
	 *     {WideCharType}
	 */
	protected void sequence_Type(ISerializationContext context, WideCharType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
