package com.novemio.android.ordertest.presentation.screens.order.list

import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.novemio.android.core.BaseFragment
import com.novemio.android.ordertest.R
import com.novemio.android.ordertest.presentation.screens.order.Order
import kotlinx.android.synthetic.main.content_empty_list.btnAddItems
import kotlinx.android.synthetic.main.fragment_order_list.btnAddItem
import kotlinx.android.synthetic.main.fragment_order_list.rvOrderList
import kotlinx.android.synthetic.main.fragment_order_list.vError
import kotlinx.android.synthetic.main.toolbar_default_white.toolbarWhite

class OrderListFragment : BaseFragment<OrderListViewModel, OrderRoutes>() {
	
	override fun getLayoutId(): Int = R.layout.fragment_order_list
	
	private val adapter by lazy {
		OrderListAdapter().apply {
			onItemClickListener = this@OrderListFragment::itemSelected
		}
	}
	
	override fun initView() {
		setToolbar(toolbarWhite)
		actionBar?.subtitle = "Fruit Planet"
		setupRecyclerView()
		viewModel.getOrders()
		btnAddItems.setOnClickListener {
			addOrder()
		}
		btnAddItem.setOnClickListener {
			addOrder()
		}
		
	}
	
	private fun setupRecyclerView() =
		rvOrderList.apply {
			layoutManager = LinearLayoutManager(context)
			adapter = this@OrderListFragment.adapter
		}
	
	private fun addOrder() {
		navigation.toAddOrder()
		
	}
	
	override fun setObservers() {
		viewModel.orderList.observe(this, Observer {
			if (it.isEmpty()) {
				rvOrderList.visibility = GONE
				vError.visibility = VISIBLE
				btnAddItem.visibility = GONE
			} else {
				rvOrderList.visibility = VISIBLE
				vError.visibility = GONE
				btnAddItem.visibility = VISIBLE
				adapter.setData(it)
				
			}
		})
		
	}
	
	private fun itemSelected(order: Order) {
		Toast.makeText(activity!!, order.toString(), Toast.LENGTH_SHORT).show()
	}
}