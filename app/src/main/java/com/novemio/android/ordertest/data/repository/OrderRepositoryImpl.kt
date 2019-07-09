package com.novemio.android.ordertest.data.repository

import com.novemio.android.core.utils.result.SingleResult
import com.novemio.android.core.utils.validate
import com.novemio.android.ordertest.domain.repository.OrderRepository
import com.novemio.android.ordertest.presentation.screens.order.Order
import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OrderRepositoryImpl @Inject constructor(
) : OrderRepository {
	
	private val orderList: MutableList<Order> = mutableListOf()
	
	override fun getOrders(): SingleResult<MutableList<Order>> =
		
		Single.just(orderList).subscribeOn(Schedulers.computation()).validate()
	
	override fun addOrder(order: Order): Completable =
		Completable.fromAction {
			orderList.add(order)
		}.subscribeOn(Schedulers.computation())
	
}
