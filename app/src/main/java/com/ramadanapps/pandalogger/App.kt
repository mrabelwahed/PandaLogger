package com.ramadanapps.pandalogger

import android.app.Application
import com.ramadanapps.amplitude_analytics.AmplitudeAnalyticsService
import com.ramadanapps.panda_logger.core.AnalyticsService
import com.ramadanapps.panda_logger.core.PandaAnalyticsLogger


class App: Application() {
    override fun onCreate() {
        super.onCreate()

        val amplitudeService = AmplitudeAnalyticsService(applicationContext, apiKey = "your api key")

        val services = listOf<AnalyticsService>(amplitudeService)
        PandaAnalyticsLogger.init(services)
    }
}