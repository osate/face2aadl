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
package face.uop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Face Profile</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see face.uop.UopPackage#getFaceProfile()
 * @model
 * @generated
 */
public enum FaceProfile implements Enumerator {
	/**
	 * The '<em><b>General Purpose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PURPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_PURPOSE(0, "GeneralPurpose", "GeneralPurpose"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(1, "Security", "Security"),

	/**
	 * The '<em><b>Safety Base</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_BASE_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY_BASE(2, "SafetyBase", "SafetyBase"),

	/**
	 * The '<em><b>Safety Extended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_EXTENDED_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY_EXTENDED(3, "SafetyExtended", "SafetyExtended");

	/**
	 * The '<em><b>General Purpose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General Purpose</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PURPOSE
	 * @model name="GeneralPurpose"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PURPOSE_VALUE = 0;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="Security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 1;

	/**
	 * The '<em><b>Safety Base</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safety Base</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFETY_BASE
	 * @model name="SafetyBase"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_BASE_VALUE = 2;

	/**
	 * The '<em><b>Safety Extended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safety Extended</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFETY_EXTENDED
	 * @model name="SafetyExtended"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_EXTENDED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Face Profile</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FaceProfile[] VALUES_ARRAY =
		new FaceProfile[] {
			GENERAL_PURPOSE,
			SECURITY,
			SAFETY_BASE,
			SAFETY_EXTENDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Face Profile</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FaceProfile> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Face Profile</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FaceProfile get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FaceProfile result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Face Profile</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FaceProfile getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FaceProfile result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Face Profile</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FaceProfile get(int value) {
		switch (value) {
			case GENERAL_PURPOSE_VALUE: return GENERAL_PURPOSE;
			case SECURITY_VALUE: return SECURITY;
			case SAFETY_BASE_VALUE: return SAFETY_BASE;
			case SAFETY_EXTENDED_VALUE: return SAFETY_EXTENDED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FaceProfile(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FaceProfile
