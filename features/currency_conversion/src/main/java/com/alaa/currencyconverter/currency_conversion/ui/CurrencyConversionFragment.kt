package com.alaa.currencyconverter.currency_conversion.ui

import android.R.layout.simple_list_item_1
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.alaa.currencyconverter.core.base.BaseFragment
import com.alaa.currencyconverter.core.states.DataState
import com.alaa.currencyconverter.core.states.DataState.Success
import com.alaa.currencyconverter.currency_conversion.R
import com.alaa.currencyconverter.currency_conversion.databinding.FragmentCurrencyConversionBinding
import com.alaa.currencyconverter.currency_conversion.domain.model.CurrencyData
import com.alaa.currencyconverter.currency_conversion.domain.model.Symbols
import com.alaa.currencyconverter.navigation.MainNavigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@AndroidEntryPoint
class CurrencyConversionFragment : BaseFragment<FragmentCurrencyConversionBinding>(),
    CurrencyConversionCallback {

    @Inject
    lateinit var mainNavigator: MainNavigator

    private val viewModel by viewModels<CurrencyConverterViewModel>()
    private val conversionViewModel by viewModels<ConversionViewModel>()

    private lateinit var binding: FragmentCurrencyConversionBinding

    private lateinit var currenciesAdapter: ArrayAdapter<String>

    override fun getLayoutResourceId(): Int = R.layout.fragment_currency_conversion

    override fun onBindData(binding: FragmentCurrencyConversionBinding) {
        super.onBindData(binding)
        binding.viewModel = viewModel
        binding.conversionViewModel = conversionViewModel
        binding.fragment = this
        this.binding = binding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        conversionViewModel.currencyConversionCallback = this
    }

    override fun initView() {
        super.initView()
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.currencyData.collectLatest { updateUI(it) }
            viewModel.saveConversionData.collectLatest { updateSaveConversionUI(it) }
        }
    }

    fun updateUI(dataState: DataState<CurrencyData>) {
        if (dataState is Success) updateSuccessUI(dataState.data)
        else updateErrorUI(dataState.exception)
    }

    private fun updateSuccessUI(currencyData: CurrencyData?) {
        conversionViewModel.currencyData = currencyData
        setupCurrenciesAdapter(currencyData?.currenciesList as List<String>)
        setupCurrenciesListeners(currencyData.currenciesList)
    }

    private fun updateErrorUI(exception: Exception?) {
        Toast.makeText(requireContext(), getString(R.string.error_message), LENGTH_LONG).show()
    }

    private fun setupCurrenciesAdapter(currenciesList: List<String>) {
        currenciesAdapter = ArrayAdapter(requireContext(), simple_list_item_1, currenciesList)
        binding.actvFromCurrency.setAdapter(currenciesAdapter)
        binding.actvToCurrency.setAdapter(currenciesAdapter)
    }

    private fun setupCurrenciesListeners(currenciesList: List<String>) {
        binding.actvFromCurrency.setOnItemClickListener { _, _, i, _ ->
            conversionViewModel.setFromRate(currenciesList[i])
            conversionViewModel.calculateCurrency()
        }
        binding.actvToCurrency.setOnItemClickListener { _, _, i, _ ->
            conversionViewModel.setToRate(currenciesList[i])
            conversionViewModel.calculateCurrency()
        }
    }

    fun invertCurrencies() {
        val fromCurrencyText = binding.actvFromCurrency.text
        val toCurrencyText = binding.actvToCurrency.text

        binding.actvFromCurrency.setText(toCurrencyText, false)
        binding.actvToCurrency.setText(fromCurrencyText, false)

        conversionViewModel.setFromRate(toCurrencyText.toString())
        conversionViewModel.setToRate(fromCurrencyText.toString())

        conversionViewModel.calculateCurrency()
    }

    override fun onConversionSuccess(fromAmount: Double, toAmount: Double) {
        viewModel.saveConversion(
            binding.actvFromCurrency.text.toString(), fromAmount,
            binding.actvToCurrency.text.toString(), toAmount
        )
    }

    override fun onConversionFail(exception: Exception) {
        Toast.makeText(requireContext(), getString(R.string.error_message), LENGTH_LONG).show()
    }

    private fun updateSaveConversionUI(dataState: DataState<Unit>) {
        if (dataState is DataState.Error) updateErrorUI(dataState.exception)
    }

    fun startDetails() = mainNavigator.detailsFlow()
}