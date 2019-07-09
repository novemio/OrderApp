package com.novemio.android.ordertest

import androidx.annotation.CallSuper
import io.mockk.MockKAnnotations

abstract class BaseRxTest {
	
	@CallSuper
	open fun setUp() {
		MockKAnnotations.init(this)
	}
	
}