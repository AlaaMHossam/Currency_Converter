package com.alaa.currencyconverter.conversions_details.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionData
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionDataDiffUtil
import com.alaa.currencyconverter.conversions_details.databinding.ConversionsDetailsHeaderItemBinding
import com.alaa.currencyconverter.conversions_details.databinding.ConversionsDetailsItemBinding

class ConversionsAdapter :
    ListAdapter<HistoryConversionData, RecyclerView.ViewHolder>(HistoryConversionDataDiffUtil()) {

    private val ITEM_VIEW_TYPE_HEADER = 0
    private val ITEM_VIEW_TYPE_ITEM = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == ITEM_VIEW_TYPE_HEADER) {
            HeaderViewHolder(ConversionsDetailsHeaderItemBinding.inflate(inflater, parent, false))
        } else {
            ItemViewHolder(ConversionsDetailsItemBinding.inflate(inflater, parent, false))
        }
    }

    override fun getItemViewType(position: Int): Int = when (getItem(position)) {
        is HistoryConversionData.HistoryConversionHeader -> ITEM_VIEW_TYPE_HEADER
        is HistoryConversionData.HistoryConversionItem -> ITEM_VIEW_TYPE_ITEM
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder) {
            is HeaderViewHolder -> {
                val headerItem = getItem(position) as String
                holder.bind(headerItem)
            }
            is ItemViewHolder -> {
                val item = getItem(position) as HistoryConversionData.HistoryConversionItem
                holder.bind(item)
            }
            else -> {}
        }

    inner class HeaderViewHolder(private val headerBinding: ConversionsDetailsHeaderItemBinding) :
        RecyclerView.ViewHolder(headerBinding.root) {
        fun bind(date: String) {
            headerBinding.data = date
            headerBinding.executePendingBindings()
        }
    }

    inner class ItemViewHolder(private val binding: ConversionsDetailsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(historyConversionItem: HistoryConversionData.HistoryConversionItem) {
            binding.data = historyConversionItem
            binding.executePendingBindings()
        }
    }
}