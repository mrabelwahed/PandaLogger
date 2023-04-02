package com.ramadanapps.pandalogger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ramadanapps.amplitude_analytics.AmplitudeAnalyticsService
import com.ramadanapps.panda_logger.core.AnalyticsService
import com.ramadanapps.panda_logger.core.PandaAnalyticsLogger

class MainActivity : AppCompatActivity() {
    private val button: Button by lazy { findViewById(R.id.btn) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // PandaAnalyticsLogger.logEvent(EventsHelper.HOME_SCREEN_OPENED, null)

        button.setOnClickListener{
            PandaAnalyticsLogger.logEvent("home_button_clicked",null)
        }
    }
}