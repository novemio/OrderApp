package com.novemio.android.ordertest.presentation.screens.order.list

import androidx.lifecycle.MutableLiveData
import com.novemio.android.core.BaseViewModel
import com.novemio.android.core.utils.result.SealedResult.OnSuccess
import com.novemio.android.ordertest.domain.repository.OrderRepository
import com.novemio.android.ordertest.presentation.screens.order.Order
import javax.inject.Inject

private val TAG by lazy { OrderListViewModel::class.java.simpleName }

class OrderListViewModel @Inject constructor(
	private val orderRepository: OrderRepository
) : BaseViewModel() {
	fun getOrders() {
		disposables.add(
			orderRepository.getOrders().subscribe { it ->
				when (it) {
					is OnSuccess -> orderList.postValue(it.data)
				}
			}
		)
		
	}
	
	val orderList by lazy { MutableLiveData<List<Order>>() }
	
}