package com.hassan.sadaparceltest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.hassan.sadaparceltest.utilities.viewholders.ItemsViewHolderHome
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class HomeInstrumentedTest {
    @Rule
    @JvmField
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun navigationToCart_isCorrect(){
        onView(withId(R.id.navigation_cart)).check(matches(isClickable()))
    }

    @Test
    fun navigationToOrders_isCorrect(){
        onView(withId(R.id.navigation_orders)).check(matches(isClickable()))
    }

    @Test
    fun navigationToCart_fragmentChange_isCorrect(){
        onView(withId(R.id.navigation_cart)).perform(click())
        onView(withText("This is cart Fragment")).check(matches(isDisplayed()))
    }

    @Test
    fun navigationToOrders_fragmentChange_isCorrect(){
        onView(withId(R.id.navigation_orders)).perform(click())
        onView(withText("This is orders Fragment")).check(matches(isDisplayed()))
    }

    @Test
    fun products_displayed_isCorrect(){
        val length = 6

        onView(withId(R.id.recycler_home_products))
            .perform(actionOnItemAtPosition<ItemsViewHolderHome>(length, click()));

        ;//            .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(9, scrollTo()))
//            .check(matches(hasDescendant(withText("With square"))))
//        onView(withId(R.id.recycler_home_products)).perform(RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
//            hasDescendant(withText("With square")), click()))
//        onView(withId(R.id.recycler_home_products)).check(matches(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(is)))
    }
//
//    @Test
//    fun scrollToItemBelowFold_checkItsText() {
//        // First scroll to the position that needs to be matched and click on it.
//        onView(withId(R.id.recyclerView))
//            .perform(RecyclerViewActions.actionOnItemAtPosition(ITEM_BELOW_THE_FOLD, click()))
//        // Match the text in an item below the fold and check that it's displayed.
//        val itemElementText = getApplicationContext<Context>().resources.getString(
//            R.string.item_element_text
//        ) + String.valueOf(ITEM_BELOW_THE_FOLD)
//        onView(withText(itemElementText)).check(matches(isDisplayed()))
//    }
}