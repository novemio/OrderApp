package com.novemio.android.ordertest.di.route

import android.app.Activity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.novemio.android.ordertest.R
import com.novemio.android.core.di.routes.NavigationController
import javax.inject.Inject

class NavigationControllerImpl @Inject constructor(activity: Activity) :
	NavigationController {
	
	override var route: NavController = Navigation.findNavController(activity, R.id.rootNavFragment)
	
}