package com.novemio.android.core

import android.os.Bundle
import androidx.annotation.LayoutRes
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(getViewLayout())
		initView()
	}

	@LayoutRes
	abstract fun getViewLayout(): Int

	abstract fun initView()
}