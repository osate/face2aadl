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
package org.osate.face2aadl.common;

import java.math.BigDecimal;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.common.math.DoubleMath;

public class TranslatorCommonUtil {
	private static final Pattern SANITIZE_PATTERN = Pattern.compile("\\W");
	private static final Set<String> AADL_KEYWORDS = Set.of("aadlboolean", "aadlinteger", "aadlreal", "aadlstring",
			"abstract", "access", "all", "annex", "applies", "binding", "bus", "calls", "classifier", "compute",
			"connections", "constant", "data", "delta", "device", "end", "enumeration", "event", "extends", "false",
			"feature", "features", "flow", "flows", "group", "implementation", "in", "inherit", "initial", "internal",
			"inverse", "is", "list", "memory", "mode", "modes", "none", "of", "out", "package", "parameter", "path",
			"port", "private", "process", "processor", "properties", "property", "prototype", "prototypes", "provides",
			"public", "range", "record", "reference", "refined", "renames", "requires", "self", "set", "sink", "source",
			"subcomponents", "subprogram", "system", "thread", "to", "true", "type", "units", "virtual", "with");

	public static String sanitizeID(String id) {
		if (!id.isEmpty()) {
			var sanitized = SANITIZE_PATTERN.matcher(id).replaceAll("_");
			if (AADL_KEYWORDS.contains(sanitized.toLowerCase())) {
				sanitized = "K_" + sanitized;
			}
			if (sanitized.charAt(0) >= '0' && sanitized.charAt(0) <= '9') {
				sanitized = "N_" + sanitized;
			}
			if (sanitized.charAt(0) == '_') {
				sanitized = "U" + sanitized;
			}
			if (sanitized.charAt(sanitized.length() - 1) == '_') {
				sanitized = sanitized + "U";
			}
			/*
			 * The replacement needs to be performed twice because the replace method continues searching in
			 * the String after the replacement. This is a problem if there are more than two consecutive
			 * underscores. For example, consider the String "a____b". The first call to replace will produce
			 * "a_U__U_b". The second call is required to produce "a_U_U_U_b".
			 */
			sanitized = sanitized.replace("__", "_U_");
			return sanitized.replace("__", "_U_");
		} else {
			return id;
		}
	}

	public static String translateDescription(String description) {
		if (description.isEmpty()) {
			return "";
		} else {
			// Makes each line a comment. Also converts newlines to System newlines.
			return "--" + description.replace("\r", "").replace("\n", System.lineSeparator() + "--");
		}
	}

	public static String translateUUID(EObject object) {
		var id = ((XMLResource) object.eResource()).getID(object);
		if (id == null) {
			return "";
		} else {
			return "FACE::UUID => \"" + id + "\";";
		}
	}

	public static String removeExtension(String fileName) {
		var lastDot = fileName.lastIndexOf('.');
		if (lastDot == -1) {
			return fileName;
		} else {
			return fileName.substring(0, lastDot);
		}
	}

	public static String translateThreadPeriod(float sec) {
		if (DoubleMath.isMathematicalInteger(sec)) {
			return Float.valueOf(sec).longValue() + " sec";
		} else {
			var ms = BigDecimal.valueOf(sec).movePointRight(3);
			if (ms.scale() == 0) {
				return ms.longValue() + " ms";
			} else {
				var us = ms.movePointRight(3);
				if (us.scale() == 0) {
					return us.longValue() + " us";
				} else {
					var ns = us.movePointRight(3);
					if (ns.scale() == 0) {
						return ns.longValue() + " ns";
					} else {
						var ps = ns.movePointRight(3);
						return ps.longValue() + " ps";
					}
				}
			}
		}
	}
}