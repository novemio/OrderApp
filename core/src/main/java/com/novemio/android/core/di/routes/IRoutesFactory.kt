package com.novemio.android.core.di.routes

import com.novemio.android.core.BaseFragment

interface IRoutesFactory {

	fun get(fragmentClass: Class<out BaseFragment<*, *>>): Routes?
}