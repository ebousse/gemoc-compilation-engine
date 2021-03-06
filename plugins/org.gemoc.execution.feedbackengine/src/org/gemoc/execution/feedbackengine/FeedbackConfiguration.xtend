package org.gemoc.execution.feedbackengine

import gemoctraceability.TraceabilityModel
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine

interface FeedbackConfiguration {
	def FeedbackManager createFeedbackManager(TraceabilityModel traceability, FeedbackEngine feedbackEngine)
	
	def IExecutionEngine createTargetEngine()
	
	def String getTargetEntryPoint()

	def String getTargetLanguageName()

	def String getTargetInitializationMethod()
}