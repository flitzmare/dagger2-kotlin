package com.riksasuviana.dagger2kotlin.di.module

import android.content.Context
import android.content.SharedPreferences
import com.riksasuviana.dagger2kotlin.MyApp
import com.riksasuviana.dagger2kotlin.util.PreferencesUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by riksa on 12/12/2017.
 */
@Module
class ApplicationModule(private val myApp: MyApp) {

    @Provides
    @Singleton
    fun provideContext() : Context = myApp.applicationContext

    @Provides
    @Singleton
    fun providePreferencesUtil(sharedPreferences: SharedPreferences) : PreferencesUtil = PreferencesUtil(sharedPreferences)

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = provideContext().getSharedPreferences("", Context.MODE_PRIVATE)

}