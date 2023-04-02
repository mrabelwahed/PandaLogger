package com.ramadanapps.panda_logger.core

interface AnalyticsService {
    fun init()
    fun logEvent(eventName: String, eventProperties: Map<String, Any>?)
}