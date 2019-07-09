package com.novemio.android.ordertest.presentation.screens.order.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.novemio.android.core.BaseAdapter
import com.novemio.android.ordertest.R
import com.novemio.android.ordertest.presentation.screens.order.Order

class OrderListAdapter : BaseAdapter<Order>() {

	lateinit var onItemClickListener: (Order) -> Unit

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
		OrderViewHolder(
			LayoutInflater.from(parent.context).inflate(
				R.layout.row_order, parent, false
			)
		)

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		super.onBindViewHolder(holder, position)
		
		holder.itemView.setOnClickListener {
			onItemClickListener.invoke(getItemOnPosition(holder.adapterPosition))
		}
	}
}