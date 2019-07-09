package com.novemio.android.ordertest.presentation.screens.order.list

import com.novemio.android.core.di.routes.NavigationController
import com.novemio.android.core.di.routes.Routes
import com.novemio.android.ordertest.R
import javax.inject.Inject

class OrderRoutes @Inject constructor(
	private val navigation: NavigationController
) : Routes(navigation.route) {
	fun toAddOrder() {
		
		navigation.route.navigate(R.id.action_OrderListFragment_to_orderAddFragment)
	}
	
}