package com.novemio.android.core

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {

	protected val disposables by lazy {
		CompositeDisposable()
	}

	override fun onCleared() {
		super.onCleared()
		disposables.clear()
	}
}