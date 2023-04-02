package com.ramadanapps.amplitude_analytics

import android.content.Context
import com.amplitude.android.Amplitude
import com.amplitude.android.Configuration
import com.ramadanapps.panda_logger.core.AnalyticsService

class AmplitudeAnalyticsService(private val context: Context, private val apiKey: String) :
    AnalyticsService {

    private lateinit var amplitudeClient: Amplitude

    init {
        init()
    }

    override fun init() {
        amplitudeClient = Amplitude(
            Configuration(
                apiKey = apiKey,
                context = context
            )
        )
    }

    override fun logEvent(eventName: String, eventProperties: Map<String, Any>?) {
        amplitudeClient.track(eventName, eventProperties)
    }

}