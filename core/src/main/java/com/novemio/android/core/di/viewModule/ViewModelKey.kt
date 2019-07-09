package com.novemio.android.core.di.viewModule

import androidx.lifecycle.ViewModel
import com.novemio.android.core.BaseFragment
import dagger.MapKey
import kotlin.reflect.KClass

@Target(
	AnnotationTarget.FUNCTION,
	AnnotationTarget.PROPERTY_GETTER,
	AnnotationTarget.PROPERTY_SETTER
)

@Retention(AnnotationRetention.RUNTIME)
@MapKey(unwrapValue = false)
annotation class ViewModelKey(val fragment: KClass<out BaseFragment<*, *>>, val viewModel: KClass<out ViewModel>)