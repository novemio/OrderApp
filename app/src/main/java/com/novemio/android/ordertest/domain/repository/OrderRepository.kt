package com.novemio.android.ordertest.domain.repository

import com.novemio.android.ordertest.presentation.screens.order.Order
import com.novemio.android.core.utils.result.SingleResult
import io.reactivex.Completable

interface OrderRepository {
	
	fun getOrders(): SingleResult<MutableList<Order>>
	fun addOrder(order: Order): Completable
	
}