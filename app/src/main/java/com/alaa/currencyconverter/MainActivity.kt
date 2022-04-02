package com.alaa.currencyconverter

import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import com.alaa.currencyconverter.R
import com.alaa.currencyconverter.core.base.BaseActivity
import com.alaa.currencyconverter.databinding.ActivityMainBinding
import com.alaa.currencyconverter.navigation.MainNavigation
import com.alaa.currencyconverter.navigation.MainNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(), MainNavigation{

    @Inject
    lateinit var mainNavigator: MainNavigator

    override fun getLayoutResourceId(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        mainNavigator.mainNavigation = this
    }

    override fun detailsFlow() {
        findNavController(R.id.fcv_main).navigate(R.id.action_global_conversionsDetailsFragment)
    }
}