package com.novemio.android.ordertest.di.modules

import com.novemio.android.core.di.scopes.FragmentScope
import com.novemio.android.ordertest.presentation.screens.order.add.OrderAddFragment
import com.novemio.android.ordertest.presentation.screens.order.list.OrderListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [RouteModule::class])
abstract class FragmentProvider {
	
	@FragmentScope
	@ContributesAndroidInjector
	abstract fun contributeOrderFragmentInjector(): OrderListFragment
	
	@FragmentScope
	@ContributesAndroidInjector
	abstract fun contributeAddFragmentInjector(): OrderAddFragment
	
}