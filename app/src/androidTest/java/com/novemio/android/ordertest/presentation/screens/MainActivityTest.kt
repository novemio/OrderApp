package com.novemio.android.ordertest.presentation.screens
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.novemio.android.ordertest.R
import de.mannodermaus.junit5.ActivityScenarioExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class MainActivityTest {
	// region constants -------------------------------------------------------------------------------
	
	// endregion constants ----------------------------------------------------------------------------
	
	// region helper fields ---------------------------------------------------------------------------
	
	// endregion helper fileds ------------------------------------------------------------------------
	@JvmField
	@RegisterExtension
	val scenarioExtension = ActivityScenarioExtension.launch<RootActivity>()
	
	
	@Test
	fun testExample(scenario: ActivityScenario<RootActivity>) {
		onView(withId(R.id.test)).check(matches(withText("test")))

	}
//
	
	// region helper methods --------------------------------------------------------------------------
	
	// endregion helper methods -----------------------------------------------------------------------
	
	// region helper classes --------------------------------------------------------------------------
	
	// endregion helper classes -----------------------------------------------------------------------
}