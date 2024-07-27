package com.example.basicapplication

import android.app.Application
import com.farimarwat.grizzly.GrizzlyMonitorBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        GrizzlyMonitorBuilder(this)
            .build()
            .start()
    }

}
