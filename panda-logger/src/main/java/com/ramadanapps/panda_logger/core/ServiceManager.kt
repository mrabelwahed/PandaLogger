package com.ramadanapps.panda_logger.core

class ServiceManager {
    private val services = mutableListOf<AnalyticsService>()

    fun registerService(service: AnalyticsService) {
        services.add(service)
    }

    fun unregisterService(service: AnalyticsService) {
        services.remove(service)
    }

    fun trackEvent(eventName: String, eventProperties: Map<String, Any>?) {
        for (service in services) {
            service.logEvent(eventName, eventProperties)
        }
    }
}