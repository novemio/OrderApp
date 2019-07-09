package com.novemio.android.core.di.routes


import com.novemio.android.core.BaseFragment
import com.novemio.android.core.di.scopes.ActivityScope
import javax.inject.Inject
import javax.inject.Provider

@ActivityScope
class RoutesFactory
@Inject
constructor(private val routes: Map<Class<out BaseFragment<*, *>>, @JvmSuppressWildcards Provider<Routes>>)
	: IRoutesFactory {

	override fun get(fragmentClass: Class<out BaseFragment<*, *>>): Routes? =
		routes[fragmentClass]?.get()
}