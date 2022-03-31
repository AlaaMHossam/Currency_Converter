package com.alaa.currencyconverter.conversions_details.ui

import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionData
import com.alaa.currencyconverter.common_ui.R.*
import com.alaa.currencyconverter.conversions_details.R
import com.alaa.currencyconverter.conversions_details.databinding.ConversionsDetailsFragmentBinding
import com.alaa.currencyconverter.core.base.BaseFragment
import com.alaa.currencyconverter.core.states.DataState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class ConversionsDetailsFragment : BaseFragment<ConversionsDetailsFragmentBinding>() {

    override fun getLayoutResourceId(): Int = R.layout.conversions_details_fragment

    private val viewModel by viewModels<ConversionsViewModel>()

    private lateinit var binding: ConversionsDetailsFragmentBinding

    private val adapter = ConversionsAdapter()

    override fun onBindData(binding: ConversionsDetailsFragmentBinding) {
        super.onBindData(binding)
        binding.viewModel = viewModel
        this.binding = binding
    }

    override fun initView() {
        super.initView()
        observeConversions()
    }

    private fun observeConversions() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.conversionsData.collectLatest { updateUI(it) }
        }
    }

    private fun updateUI(dataState: DataState<List<HistoryConversionData.HistoryConversionItem>>) {
        if (dataState is DataState.Success) updateSuccessUI(dataState.data)
        else updateErrorUI(dataState.exception)
    }

    private fun updateSuccessUI(data: List<HistoryConversionData.HistoryConversionItem>?) {
        binding.rvConversionsDetails.adapter = adapter
        adapter.submitList(data)
    }

    private fun updateErrorUI(exception: Exception?) {
        Toast.makeText(requireContext(), getString(string.error_message), LENGTH_LONG).show()
    }
}