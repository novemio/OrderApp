package com.novemio.android.core.di.routes

import com.novemio.android.core.BaseFragment
import dagger.MapKey
import kotlin.reflect.KClass

@Target(
	AnnotationTarget.FUNCTION,
	AnnotationTarget.PROPERTY_GETTER,
	AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class RouteKey(val fragment: KClass<out BaseFragment<*, *>>)