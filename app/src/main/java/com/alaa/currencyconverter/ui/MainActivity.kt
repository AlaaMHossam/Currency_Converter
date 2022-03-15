package com.alaa.currencyconverter.ui

import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.alaa.currencyconverter.R
import com.alaa.currencyconverter.core.base.BaseActivity
import com.alaa.currencyconverter.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutResourceId(): Int = R.layout.activity_main
}