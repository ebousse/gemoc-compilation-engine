package org.gemoc.execution.feedbackengine

import org.eclipse.gemoc.trace.commons.model.trace.Step
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon

class FeedbackAddon implements IEngineAddon {

	val FeedbackManager feedbackInterpreter

	new(FeedbackManager feedbackInterpreter) {
		this.feedbackInterpreter = feedbackInterpreter
	}
	
	override aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> step) {
		feedbackInterpreter.processTargetStepStart(step)
	}

	override stepExecuted(IExecutionEngine<?> engine, Step<?> step) {
		feedbackInterpreter.processTargetStepEnd(step)
	}

}
