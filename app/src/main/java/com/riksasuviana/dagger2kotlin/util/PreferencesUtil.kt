package com.riksasuviana.dagger2kotlin.util

import android.content.SharedPreferences
import javax.inject.Inject

/**
 * Created by riksa on 12/12/2017.
 */
class PreferencesUtil @Inject constructor(private val sharedPreferences: SharedPreferences) {

    fun putInt(key:String, value:Int):Boolean{
        val editor: SharedPreferences.Editor = sharedPreferences.edit()

        editor.putInt(key, value)

        return editor.commit()
    }

    fun putBoolean(key:String, value:Boolean):Boolean {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()

        editor.putBoolean(key, value)

        return editor.commit()
    }


    fun putString(key:String, value:String):Boolean{
        val editor: SharedPreferences.Editor = sharedPreferences.edit()

        editor.putString(key, value)

        return editor.commit()
    }

    fun getInt(key:String, defaultValue: Int):Int = sharedPreferences.getInt(key, defaultValue)

    fun getBoolean(key:String, defaultValue: Boolean):Boolean = sharedPreferences.getBoolean(key, defaultValue)

    fun getString(key:String, defaultValue: String):String = sharedPreferences.getString(key, defaultValue)

}