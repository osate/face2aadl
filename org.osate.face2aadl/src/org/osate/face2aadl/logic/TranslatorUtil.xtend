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
package org.osate.face2aadl.logic

import face.Element
import face.datamodel.platform.CompositeTemplate
import face.datamodel.platform.View
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.XMLResource

class TranslatorUtil {
	val static SANITIZE_PATTERN = Pattern.compile("\\W")
	val static AADL_KEYWORDS = #{"aadlboolean", "aadlinteger", "aadlreal", "aadlstring", "abstract",
		"access", "all", "annex", "applies", "binding", "bus", "calls", "classifier", "compute",
		"connections", "constant", "data", "delta", "device", "end", "enumeration", "event", "extends",
		"false", "feature", "features", "flow", "flows", "group", "implementation", "in", "inherit",
		"initial", "internal", "inverse", "is", "list", "memory", "mode", "modes", "none", "of", "out",
		"package", "parameter", "path", "port", "private", "process", "processor", "properties", "property",
		"prototype", "prototypes", "provides", "public", "range", "record", "reference", "refined",
		"renames", "requires", "self", "set", "sink", "source", "subcomponents", "subprogram", "system",
		"thread", "to", "true", "type", "units", "virtual", "with"
	}
	//This is here because character literals don't work well in Xtend.
	val static char UNDERSCORE = '_'
	
	def static String sanitizeID(String id) {
		if (!id.empty) {
			var sanitized = SANITIZE_PATTERN.matcher(id).replaceAll("_")
			if (AADL_KEYWORDS.contains(sanitized.toLowerCase)) {
				sanitized = "K_" + sanitized
			}
			if (sanitized.charAt(0) >= '0' && sanitized.charAt(0) <= '9') {
				sanitized = "N_" + sanitized
			}
			if (sanitized.charAt(0) == UNDERSCORE) {
				sanitized = "U" + sanitized
			}
			if (sanitized.charAt(sanitized.length - 1) == UNDERSCORE) {
				sanitized = sanitized + "U"
			}
			/*
			 * The replacement needs to be performed twice because the replace method continues searching in
			 * the String after the replacement. This is a problem if there are more than two consecutive
			 * underscores. For example, consider the String "a____b". The first call to replace will produce
			 * "a_U__U_b". The second call is required to produce "a_U_U_U_b".
			 */
			sanitized = sanitized.replace("__", "_U_")
			sanitized.replace("__", "_U_")
		} else {
			id
		}
	}
	
	def package static String translateDescription(Element element) {
		'''«IF !element.description.empty»--«element.description»«ENDIF»'''
	}
	
	def package static String translateUUID(EObject object) {
		val id = (object.eResource as XMLResource).getID(object)
		if (id === null) {
			""
		} else {
			'''FACE::UUID => "«id»";'''
		}
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
		'''«dataModelPackageName»::«translateName(view)»«IF view instanceof CompositeTemplate».impl«ENDIF»'''
	}
}