package com.novemio.android.ordertest.presentation.screens

import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.novemio.android.ordertest.R
import com.novemio.android.core.BaseActivity

class RootActivity : BaseActivity() {
	private val navCtrl: NavController by lazy {
		Navigation.findNavController(this, R.id.rootNavFragment)
	}
	override fun getViewLayout() = R.layout.root_activity
	
	override fun initView() {
	
	}
	
	override fun onSupportNavigateUp(): Boolean =
		navCtrl.navigateUp()
	
	
}
