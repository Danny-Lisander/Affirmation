package com.dany.affirmation

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.assertion.ViewAssertions.matches


@RunWith(AndroidJUnit4::class)
class AffirmationsListTest {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun view_intaraction(){
    onView(withId(R.id.recycler_view))
    .perform(
        RecyclerViewActions
    .scrollTo<RecyclerView.ViewHolder>(withText(R.string.affirmation10)))

     onView(withText(R.string.affirmation10)).check(matches(isDisplayed())
    )
    }
}