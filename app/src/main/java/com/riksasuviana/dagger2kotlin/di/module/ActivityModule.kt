package com.riksasuviana.dagger2kotlin.di.module

import android.support.v7.app.AppCompatActivity
import com.riksasuviana.dagger2kotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by riksa on 12/12/2017.
 */
@Module
class ActivityModule (private val activity:AppCompatActivity){

    @Provides
    @ActivityScope
    fun provideActivity() = activity

    @Provides
    @ActivityScope
    fun provideActivityContext() = activity.baseContext
}