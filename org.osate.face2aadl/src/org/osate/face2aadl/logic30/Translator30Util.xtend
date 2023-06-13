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
package org.osate.face2aadl.logic30

import face.Element
import face.datamodel.platform.View
import org.osate.face2aadl.common.TranslatorCommonUtil

import static org.osate.face2aadl.common.TranslatorCommonUtil.sanitizeID

package class Translator30Util {
	def package static String translateDescription(Element element) {
		TranslatorCommonUtil.translateDescription(element.description)
	}
	
	def package static String translateName(face.datamodel.conceptual.Element element) {
		sanitizeID(element.name) + "_Conceptual"
	}
	
	def package static String translateName(face.datamodel.logical.Element element) {
		sanitizeID(element.name) + "_Logical"
	}
	
	def package static String translateName(face.datamodel.platform.Element element) {
		sanitizeID(element.name) + "_Platform"
	}
	
	def package static String translateViewReference(String dataModelPackageName, View view) {
		'''«dataModelPackageName»::«translateName(view)».impl'''
	}
}