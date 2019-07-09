package com.novemio.android.ordertest.di.modules

import android.app.Activity
import com.novemio.android.core.di.routes.IRoutesFactory
import com.novemio.android.core.di.routes.NavigationController
import com.novemio.android.core.di.routes.RouteKey
import com.novemio.android.core.di.routes.Routes
import com.novemio.android.core.di.routes.RoutesFactory
import com.novemio.android.ordertest.di.route.NavigationControllerImpl
import com.novemio.android.ordertest.presentation.screens.RootActivity
import com.novemio.android.ordertest.presentation.screens.order.add.OrderAddFragment
import com.novemio.android.ordertest.presentation.screens.order.add.OrderAddRoutes
import com.novemio.android.ordertest.presentation.screens.order.list.OrderListFragment
import com.novemio.android.ordertest.presentation.screens.order.list.OrderRoutes
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class RouteModule {
	
	@Binds
	internal abstract fun bindActivity(mainActivity: RootActivity): Activity
	
	@Binds
	internal abstract fun bindNavController(navigationControllerImpl: NavigationControllerImpl): NavigationController
	
	@Binds
	internal abstract fun bindFactory(routesModelFactory: RoutesFactory): IRoutesFactory
	
	@Binds
	@IntoMap
	@RouteKey(OrderListFragment::class)
	internal abstract fun bindListRoutes(orderRoutes: OrderRoutes): Routes
	
	@Binds
	@IntoMap
	@RouteKey(OrderAddFragment::class)
	internal abstract fun bindAddRoutes(orderRoutes: OrderAddRoutes): Routes
	
}
