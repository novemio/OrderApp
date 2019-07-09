package com.novemio.android.ordertest.di.component

import com.novemio.android.ordertest.OrderApplication
import com.novemio.android.ordertest.di.modules.ActivitiesInjector
import com.novemio.android.ordertest.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
	modules = [
		AppModule::class,
		AndroidSupportInjectionModule::class,
		ActivitiesInjector::class
	]
)
interface AppComponent : AndroidInjector<OrderApplication> {
	
	@Component.Factory
	abstract class Factory : AndroidInjector.Factory<OrderApplication>
	
}