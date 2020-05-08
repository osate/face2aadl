package org.osate.simpleidl.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.osate.simpleidl.simpleIDL.AnyDeclarator;
import org.osate.simpleidl.simpleIDL.Typedef;

public class SimpleIDLResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Typedef) {
			QualifiedName parentName = getQualifiedNameProvider().getFullyQualifiedName(eObject.eContainer());
			for (AnyDeclarator declarator : ((Typedef) eObject).getNames()) {
				acceptor.accept(EObjectDescription.create(parentName.append(declarator.getName()), eObject));
			}
			return false;
		} else {
			return super.createEObjectDescriptions(eObject, acceptor);
		}
	}
}