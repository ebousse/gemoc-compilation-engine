package org.gemoc.execution.feedbackengine

import fr.inria.diverse.melange.resource.MelangeResourceImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.gemoc.executionframework.engine.commons.MelangeHelper
import org.eclipse.gemoc.executionframework.engine.core.ExecutionWorkspace
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionPlatform
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionWorkspace
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.osgi.framework.Bundle
import org.eclipse.gemoc.execution.sequential.javaxdsml.api.extensions.languages.SequentialLanguageDefinitionExtension
import org.eclipse.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext
import org.eclipse.gemoc.execution.sequential.javaengine.IK3RunConfiguration
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException

/**
 * Simpler context relying on some existing ResourceSet, which
 * is the one of the considered source FeedbackEngine.
 * TODO specific to K3?
 */
class TargetExecutionContext extends SequentialModelExecutionContext<IK3RunConfiguration> {// implements IExecutionContext<IRunConfiguration, IExecutionPlatform,SequentialLanguageDefinitionExtension> {
	
	new(IK3RunConfiguration runConfiguration, ExecutionMode executionMode) throws EngineContextException {
		super(runConfiguration, executionMode)
	}
	

//	val IExecutionPlatform executionPlatform
//	val IRunConfiguration runConfiguration
//	val Bundle bundle
//	val Resource targetStaticModel
//	val Resource targetDynamicModel
//	val IExecutionWorkspace executionWorkspace;
//
	new(Resource targetStaticModel, FeedbackConfiguration conf) throws EngineContextException {
		super(new TargetRunConfiguration(targetStaticModel.URI,
			conf.getTargetEntryPoint(), conf.getTargetLanguageName(), conf.getTargetInitializationMethod()), ExecutionMode::Run)
		val executionPlatform = new TargetExecutionPlatform()
		//val runConfiguration = 
		//val targetStaticModel = targetStaticModel
		val bundle = MelangeHelper.getMelangeBundle(conf.getTargetLanguageName()) // TODO probably to change
		val executionWorkspace = new ExecutionWorkspace(runConfiguration.getExecutedModelURI());
		val String melangeURIString = targetStaticModel.URI.toString().replace("platform:/", "melange:/") + runConfiguration.melangeQuery;
		val melangeURI = URI::createURI(melangeURIString);
		val targetDynamicModel = new MelangeResourceImpl(targetStaticModel.resourceSet, melangeURI) 
		_resourceModel = targetDynamicModel
	}
//
//	override getExecutionMode() {
//		return ExecutionMode::Run
//	}
//
//	override getExecutionPlatform() {
//		return executionPlatform
//	}
//	
//	override getDslBundle() {
//		return bundle
//	}
//
//	override getResourceModel() {
//		targetDynamicModel
//	}
//
//	override getRunConfiguration() {
//		return runConfiguration
//	}
//
//	override getWorkspace() {
//		return workspace
//	}
//
//	override initializeResourceModel() {
//		// nothing to do
//	}
//
//	override dispose() {
//		// nothing to do
//	}
//
//	override getLanguageDefinitionExtension() {
//		throw new UnsupportedOperationException()
//	}
//
//	override getMSEModel() {
//		throw new UnsupportedOperationException()
//	}

}
	
