package com.riksasuviana.dagger2kotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.riksasuviana.dagger2kotlin.MyApp
import com.riksasuviana.dagger2kotlin.R
import com.riksasuviana.dagger2kotlin.util.PreferencesUtil
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mPreferencesUtil:PreferencesUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        injectDagger()

        setContentView(R.layout.activity_main)

        mPreferencesUtil.putString("hi", "HELLO WORLD")

        val hi:String = mPreferencesUtil.getString("hi", "hi")

        Toast.makeText(this, hi, Toast.LENGTH_LONG).show()
    }

    private fun injectDagger(){
        MyApp.mInstance.mApplicationComponent.inject(this)
    }
}
