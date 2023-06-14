package com.example.by_dabiz_munoz

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.hamcrest.TypeSafeMatcher
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Matcher

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

///Holiiii
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.by_dabiz_munoz", appContext.packageName)
    }

    private val dummyPlateList: List<Plate> = listOf(
        Plate(
            "Crabs (Blue and Royal)",
            R.drawable.carrilleras,
            "Crabs (Blue and Royal) with home-fermented kimchis, sheep's yoghurt, wild strawberries and coffee",
            R.drawable.diverxo_png
        ),
        Plate(
            "Sandwich Club",
            R.drawable.huevo,
            "Steamed ricotta and fried quail egg club sandwich with shichimi tōgarashi.",
            R.drawable.logo_goxo_removebg_preview
        ),
        Plate(
            "Nigiri croqueta",
            R.drawable.nigiri,
            "sheep's milk nigiri croqueta, mille-feuille of salmon matured in jabugo fat, tomato jam and smoked tea",
            R.drawable._92_2923622_streetxo_hd_png_download_png_removebg_preview
        )
    )

    @Before
    fun launchActivity() {
        val activityScenario = ActivityScenario.launch(Dishes::class.java)
        activityScenario.onActivity { activity ->
            activity.runOnUiThread {
                activity.plateList.clear()
                activity.plateList.addAll(dummyPlateList)
                activity.binding.recyclerView.adapter?.notifyDataSetChanged()
            }
        }
    }


    @Test
    fun checkRecyclerViewItemVisible() {
        // Check if the first item of RecyclerView is visible
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
//        Espresso.onView(ViewMatchers.withId(R.id.recyclerView))
//            .check(ViewAssertions.matches(hasItemAtPosition(0)))
    }

    @Test
    fun checkRecyclerViewItemClick() {
        // Perform click on the first item of RecyclerView
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView))
            .perform(RecyclerViewActions.actionOnItemAtPosition<CardViewHolder>(0, click()))
    }

//    private fun hasItemAtPosition(position: Int): Matcher<View> {
//        return object : TypeSafeMatcher<View>() {
//            override fun describeTo(description: Description) {
//                description.appendText("has item at position $position")
//            }
//
//            override fun matchesSafely(view: View): Boolean {
//                val recyclerView = view as RecyclerView
//                val adapter = recyclerView.adapter
//                return adapter?.itemCount ?: 0 > position
//            }
//        }
//    }

}