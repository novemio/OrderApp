package com.novemio.android.ordertest

import com.novemio.android.ordertest.di.component.DaggerAppComponent
import dagger.android.DaggerApplication

class OrderApplication : DaggerApplication() {
	
	
	init {
		app = this
	}
	
	companion object {
		lateinit var app: OrderApplication
		fun instance(): OrderApplication {
			return app
		}
	}
	
	override fun onCreate() {
		super.onCreate()
	}
	
	override fun applicationInjector() = DaggerAppComponent.factory().create(this)!!
	
}