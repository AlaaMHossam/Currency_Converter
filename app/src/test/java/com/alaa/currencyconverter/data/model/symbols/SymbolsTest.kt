package com.alaa.currencyconverter.data.model.symbols

import org.junit.Test

class SymbolsTest{

    @Test
    fun `properties converted to list`(){
        // Given
        val symbolsList = symbolsList()

        // When

        // Then
        assert(symbolsList.contains(Symbol("AED", "")))
    }
}