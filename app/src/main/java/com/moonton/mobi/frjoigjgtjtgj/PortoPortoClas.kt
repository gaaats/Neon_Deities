package com.moonton.mobi.frjoigjgtjtgj

import android.app.Application
import android.content.Context
import com.moonton.mobi.debbfrvrfrf.ghntngtkhy
import com.moonton.mobi.debbfrvrfrf.gtojijgtjoigt
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class PortoPortoClas:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("0491f1e5-dc3e-436f-9305-6db0ac290c60")
        MyTracker.initTracker("76341058048576020301", this)

        val gtjiotgjiogtjigt = MyTracker.getTrackerConfig()
        gtjiotgjiogtjigt.isTrackingLaunchEnabled = true
        val hkiololol = MyTracker.getInstanceId(this)
        val juikikik = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        juikikik.edit().putString("instId", hkiololol).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@PortoPortoClas)
            modules(
                listOf(
                    ghntngtkhy, gtojijgtjoigt
                )
            )
        }
    }
}