package com.alaa.currencyconverter.navigation

class MainNavigator {

    lateinit var mainNavigation: MainNavigation

    fun detailsFlow() = mainNavigation.detailsFlow()
}

interface MainNavigation {
    fun detailsFlow()
}