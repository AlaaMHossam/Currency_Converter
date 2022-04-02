package com.alaa.currencyconverter.conversions_details.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionHeader
import com.alaa.currencyconverter.common_data.data.model.HistoryConversionItem
import com.alaa.currencyconverter.common_data.data.model.HistoryData
import com.alaa.currencyconverter.conversions_details.databinding.ConversionsDetailsHeaderItemBinding
import com.alaa.currencyconverter.conversions_details.databinding.ConversionsDetailsItemBinding

class ConversionsAdapter(private val dataList : List<HistoryData>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        const val ITEM_VIEW_TYPE_HEADER = 0
        const val ITEM_VIEW_TYPE_ITEM = 1
    }

    override fun getItemCount(): Int = dataList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ITEM_VIEW_TYPE_HEADER -> {
                HeaderViewHolder(ConversionsDetailsHeaderItemBinding.inflate(inflater, parent, false))
            }
            else -> {
                ItemViewHolder(ConversionsDetailsItemBinding.inflate(inflater, parent, false))
            }
        }
    }

    override fun getItemViewType(position: Int): Int = when (dataList[position]) {
        is HistoryConversionHeader -> ITEM_VIEW_TYPE_HEADER
        is HistoryConversionItem -> ITEM_VIEW_TYPE_ITEM
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder) {
            is HeaderViewHolder -> {
                val headerItem = dataList[position] as HistoryConversionHeader
                holder.bind(headerItem)
            }
            is ItemViewHolder -> {
                val item = dataList[position] as HistoryConversionItem
                holder.bind(item)
            }
            else -> {}
        }

    inner class HeaderViewHolder(private val headerBinding: ConversionsDetailsHeaderItemBinding) :
        RecyclerView.ViewHolder(headerBinding.root) {
        fun bind(conversionHeader: HistoryConversionHeader) {
            headerBinding.data = conversionHeader.date
            headerBinding.executePendingBindings()
        }
    }

    inner class ItemViewHolder(private val ItemBinding: ConversionsDetailsItemBinding) :
        RecyclerView.ViewHolder(ItemBinding.root) {
        fun bind(historyConversionItem: HistoryConversionItem) {
            ItemBinding.data = historyConversionItem
            ItemBinding.executePendingBindings()
        }
    }
}