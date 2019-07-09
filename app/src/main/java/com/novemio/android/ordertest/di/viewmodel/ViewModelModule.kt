package com.novemio.android.ordertest.di.viewmodel

import androidx.lifecycle.ViewModel
import com.novemio.android.core.di.viewModule.IViewModelFactory
import com.novemio.android.core.di.viewModule.ViewModelFactory
import com.novemio.android.core.di.viewModule.ViewModelKey
import com.novemio.android.ordertest.presentation.screens.order.add.OrderAddFragment
import com.novemio.android.ordertest.presentation.screens.order.add.OrderAddViewModel
import com.novemio.android.ordertest.presentation.screens.order.list.OrderListFragment
import com.novemio.android.ordertest.presentation.screens.order.list.OrderListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
	
	@Binds
	internal abstract fun bindViewModelFactory(factory: ViewModelFactory): IViewModelFactory
	
	@Binds
	@IntoMap
	@ViewModelKey(OrderListFragment::class, OrderListViewModel::class)
	internal abstract fun bindOrderViewModel(homeViewModel: OrderListViewModel): ViewModel
	
	@Binds
	@IntoMap
	@ViewModelKey(OrderAddFragment::class, OrderAddViewModel::class)
	internal abstract fun bindAddViewModel(homeViewModel: OrderAddViewModel): ViewModel
	
}