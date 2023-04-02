package com.ramadanapps.panda_logger.core

object PandaAnalyticsLogger {
    private val serviceManager = ServiceManager()

    fun init(services: List<AnalyticsService>) {
        services.forEach { registerService(it) }
    }

    fun registerService(service: AnalyticsService) {
        serviceManager.registerService(service)
    }

    fun unregisterService(service: AnalyticsService) {
        serviceManager.unregisterService(service)
    }

    fun logEvent(eventName: String, eventProperties: Map<String, Any>?) {
        serviceManager.trackEvent(eventName, eventProperties)
    }

}