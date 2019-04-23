package org.gemoc.execution.feedbackengine

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.gemoc.execution.sequential.javaengine.IK3RunConfiguration

// TODO specific to K3?
class TargetRunConfiguration implements IK3RunConfiguration {

	val URI staticModelURI
	val String melangeQuery
	val String entryPoint
	val String languageName
	val String initMethod

	new(URI staticModelURI, String entryPoint, String languageName, String initMethod) {
		this.staticModelURI = staticModelURI
		this.melangeQuery = "?lang=" + languageName
		this.entryPoint = entryPoint
		this.languageName = languageName
		this.initMethod = initMethod
	}

	override getAnimationDelay() {
		0;
	}

	override getAnimatorURI() {
		null;
	}
	
	override getExecutionEntryPoint() {
		return entryPoint;
	}

	override getEngineAddonExtensions() {
		#[]
	}

	override getExecutedModelAsMelangeURI() {
		null
	}

	override getExecutedModelURI() {
		staticModelURI
	}

	override getLanguageName() {
		languageName
	}

	override getMelangeQuery() {
		melangeQuery
	}

	override getBreakStart() {
		false
	}

	override getDebugModelID() {
		"org.eclipse.gemoc.execution.sequential.javaengine.ui.debugModel"
	}

	override getModelEntryPoint() {
		val ResourceSet resourceSet = new ResourceSetImpl();
		val Resource modelResource = resourceSet.createResource(staticModelURI);
		modelResource.load(null);
		val result = modelResource.getURIFragment(modelResource.contents.head)
		modelResource.unload
		return result
	}

	override getModelInitializationArguments() {
		""
	}

	override getModelInitializationMethod() {
		initMethod
	}

}
