package com.novemio.android.ordertest.di.modules

import android.app.Application
import com.novemio.android.ordertest.OrderApplication
import com.novemio.android.ordertest.data.repository.RepoModule
import com.novemio.android.ordertest.di.viewmodel.ViewModelModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
	includes = [
		ViewModelModule::class,
		RepoModule::class
	]
)
class AppModule {
	@Singleton
	@Provides
	fun provideApplication(application: OrderApplication): Application {
		return application
	}
}