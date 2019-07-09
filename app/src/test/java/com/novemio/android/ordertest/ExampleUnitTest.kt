package com.novemio.android.ordertest

import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
	@Test
	fun addition_isCorrect() {
		assertEquals(4, 2 + 2)
	}
	
	@Nested
	inner class TestInnerClass{
	
		@Test
		fun  `test fun inner class`(){
			assertEquals(4, 2 + 2)
		}
	}
}
