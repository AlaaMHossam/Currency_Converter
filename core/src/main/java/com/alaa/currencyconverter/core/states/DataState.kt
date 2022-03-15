package com.alaa.currencyconverter.core.states

sealed class DataState<T>(val data: T? = null, val exception: Exception? = null) {
    class Success<T>(data: T) : DataState<T>(data)
    class Error<T>(exception: Exception, data: T? = null) : DataState<T>(data, exception)
}