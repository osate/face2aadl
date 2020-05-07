/**
 * ******************************************************************************
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
 *  ******************************************************************************
 */
package org.osate.simpleidl.simpleIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Pt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.simpleidl.simpleIDL.FixedPtType#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link org.osate.simpleidl.simpleIDL.FixedPtType#getFractionalDigits <em>Fractional Digits</em>}</li>
 * </ul>
 *
 * @see org.osate.simpleidl.simpleIDL.SimpleIDLPackage#getFixedPtType()
 * @model
 * @generated
 */
public interface FixedPtType extends Type
{
  /**
   * Returns the value of the '<em><b>Total Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Total Digits</em>' attribute.
   * @see #setTotalDigits(int)
   * @see org.osate.simpleidl.simpleIDL.SimpleIDLPackage#getFixedPtType_TotalDigits()
   * @model
   * @generated
   */
  int getTotalDigits();

  /**
   * Sets the value of the '{@link org.osate.simpleidl.simpleIDL.FixedPtType#getTotalDigits <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Total Digits</em>' attribute.
   * @see #getTotalDigits()
   * @generated
   */
  void setTotalDigits(int value);

  /**
   * Returns the value of the '<em><b>Fractional Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fractional Digits</em>' attribute.
   * @see #setFractionalDigits(int)
   * @see org.osate.simpleidl.simpleIDL.SimpleIDLPackage#getFixedPtType_FractionalDigits()
   * @model
   * @generated
   */
  int getFractionalDigits();

  /**
   * Sets the value of the '{@link org.osate.simpleidl.simpleIDL.FixedPtType#getFractionalDigits <em>Fractional Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fractional Digits</em>' attribute.
   * @see #getFractionalDigits()
   * @generated
   */
  void setFractionalDigits(int value);

} // FixedPtType
