package com.novemio.android.ordertest.presentation.screens.order.list

import android.view.View
import com.novemio.android.core.BaseViewHolder
import com.novemio.android.ordertest.presentation.screens.order.Order
import kotlinx.android.synthetic.main.row_order.view.tvOrderName
import kotlinx.android.synthetic.main.row_order.view.tvOrderUnit

class OrderViewHolder(itemView: View) : BaseViewHolder<Order>(itemView) {
	
	override fun bind(dataItem: Order) {
		itemView.apply {
			tvOrderName.text = dataItem.orderName
			tvOrderUnit.text = dataItem.units
		}
	}
	
}