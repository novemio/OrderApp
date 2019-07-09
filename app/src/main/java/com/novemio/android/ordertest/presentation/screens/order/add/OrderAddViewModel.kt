package com.novemio.android.ordertest.presentation.screens.order.add

import androidx.lifecycle.MutableLiveData
import com.novemio.android.core.BaseViewModel
import com.novemio.android.ordertest.domain.repository.OrderRepository
import com.novemio.android.ordertest.presentation.screens.order.Order
import javax.inject.Inject

private val TAG by lazy { OrderAddViewModel::class.java.simpleName }

class OrderAddViewModel @Inject constructor(
	private val orderRepository: OrderRepository
) : BaseViewModel() {
	
	val itemAdded: MutableLiveData<Boolean> = MutableLiveData()
	
	fun addOrder(text: String, s: String) {
		disposables.add(
			orderRepository.addOrder(Order(text, s)).subscribe {
				
				itemAdded.postValue(true)
			}
		)
	}
	
}