package com.novemio.android.ordertest.data.repository

import com.novemio.android.ordertest.domain.repository.OrderRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RepoModule {
	
	@Singleton
	@Binds
	abstract fun provideepo(orderRepository: OrderRepositoryImpl): OrderRepository
	
}