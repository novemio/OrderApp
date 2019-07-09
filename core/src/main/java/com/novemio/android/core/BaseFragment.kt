package com.novemio.android.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.ui.NavigationUI
import com.novemio.android.core.di.routes.IRoutesFactory
import com.novemio.android.core.di.routes.Routes
import com.novemio.android.core.di.viewModule.IViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM : ViewModel, R : Routes> : DaggerFragment() {
	
	protected open var TAG: String = "BaseFragment"
	
	@Inject lateinit var viewModelFactory: IViewModelFactory
	@Inject lateinit var routesFactory: IRoutesFactory
	
	val navigation: R by lazy {
		@Suppress("UNCHECKED_CAST")
		routesFactory.get(this::class.java) as R
	}
	
	protected var actionBar: ActionBar? = null
	
	protected lateinit var viewModel: VM
	
	internal fun getViewModel(): VM {
		val viewModelClassType = viewModelFactory.getViewModelClassByFragment(this::class)!!
		
		return if (getActivityAsVMOwner())
			ViewModelProviders.of(activity!!, viewModelFactory).get(viewModelClassType) as VM
		else ViewModelProviders.of(this, viewModelFactory).get(viewModelClassType) as VM
		
	}
	
	protected fun getActivityAsVMOwner(): Boolean {
		return false
	}
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		viewModel = getViewModel()
		setObservers()
	}
	
	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		val inflated = inflater.inflate(getLayoutId(), container, false)
		setHasOptionsMenu(true)
		return inflated
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		
		initView()
		
	}
	
	abstract fun setObservers()
	
	abstract fun initView()
	
	@LayoutRes
	abstract fun getLayoutId(): Int
	
	protected fun setToolbar(toolbar: Toolbar, up: Boolean = false) {
		(activity as AppCompatActivity).setSupportActionBar(toolbar)
		val supportActionBar = (activity as AppCompatActivity).supportActionBar
		actionBar = supportActionBar
		navigation.run {
			NavigationUI.setupActionBarWithNavController(activity!! as AppCompatActivity, this.navController)
		}
		actionBar?.setDisplayHomeAsUpEnabled(up)
		
	}
	//	protected fun setActionBar(toolbar: Toolbar, up: Boolean = false) {
	//		(activity as AppCompatActivity).setSupportActionBar(toolbar)
	//		val supportActionBar = (activity as AppCompatActivity).supportActionBar
	//		actionBar = supportActionBar
	//		Navigation.findNavController(activity!!, com.example.bookingagent.R.id.nav_host_fragment).run {
	//			NavigationUI.setupActionBarWithNavController(activity!! as AppCompatActivity, this)
	//		}
	//		actionBar?.setDisplayHomeAsUpEnabled(up)
	//	}
	
	protected fun setActionBarTitle(title: String) {
		actionBar?.title = title
	}
	
	protected fun showToast(message: String) =
		Toast.makeText(activity!!, message, Toast.LENGTH_SHORT).show()
	
}