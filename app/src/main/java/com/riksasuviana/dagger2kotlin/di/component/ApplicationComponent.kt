package com.riksasuviana.dagger2kotlin.di.component

import com.riksasuviana.dagger2kotlin.di.module.ApplicationModule
import com.riksasuviana.dagger2kotlin.ui.MainActivity
import com.riksasuviana.dagger2kotlin.util.PreferencesUtil
import dagger.Component
import javax.inject.Singleton

/**
 * Created by riksa on 12/12/2017.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun getPreferencesUtil(): PreferencesUtil

    fun inject(target: MainActivity)

}