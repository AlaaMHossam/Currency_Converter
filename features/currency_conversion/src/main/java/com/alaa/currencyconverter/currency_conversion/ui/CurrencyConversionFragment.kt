package com.alaa.currencyconverter.currency_conversion.ui

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
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class CurrencyConversionFragment : BaseFragment<FragmentCurrencyConversionBinding>() {

    private val viewModel by viewModels<CurrencyConverterViewModel>()
    private val conversionViewModel by viewModels<ConversionViewModel>()

    private lateinit var binding: FragmentCurrencyConversionBinding

    override fun getLayoutResourceId(): Int = R.layout.fragment_currency_conversion

    override fun onBindData(binding: FragmentCurrencyConversionBinding) {
        super.onBindData(binding)
        binding.viewModel = viewModel
        binding.conversionViewModel = conversionViewModel
        this.binding = binding
    }

    override fun initView() {
        super.initView()
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.currencyData.collectLatest { updateUI(it)}
        }
    }

    private fun updateUI(dataState: DataState<CurrencyData>) {
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
        val currenciesAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, currenciesList)
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
}