package com.riksasuviana.dagger2kotlin

import android.app.Application
import com.riksasuviana.dagger2kotlin.di.component.ApplicationComponent
import com.riksasuviana.dagger2kotlin.di.component.DaggerApplicationComponent
import com.riksasuviana.dagger2kotlin.di.module.ApplicationModule

/**
 * Created by riksa on 12/12/2017.
 */
class MyApp : Application() {
    companion object {
        lateinit var mInstance:MyApp
    }

    lateinit var mApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        mInstance = this
        mApplicationComponent = initApplicationContext()
    }

    private fun initApplicationContext(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}