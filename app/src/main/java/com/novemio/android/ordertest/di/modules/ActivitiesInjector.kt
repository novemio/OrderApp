package com.novemio.android.ordertest.di.modules

import com.novemio.android.ordertest.presentation.screens.RootActivity
import com.novemio.android.core.di.scopes.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesInjector {
	
	@ActivityScope
	@ContributesAndroidInjector(modules = [FragmentProvider::class])
	abstract fun contributeMainActivityInjector(): RootActivity
	
}