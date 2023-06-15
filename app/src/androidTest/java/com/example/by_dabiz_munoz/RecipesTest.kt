package com.example.by_dabiz_munoz

import android.content.Intent

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.by_dabiz_munoz.Recipes
import com.example.by_dabiz_munoz.Video_repr
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecipesTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(Recipes::class.java)

    @Test
    fun testVideoPlayback() {
        // Delay for RecyclerView to load
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        // Scroll to the desired position in the RecyclerView
        activityScenarioRule.scenario.onActivity { activity ->
            val recyclerView = activity.findViewById<RecyclerView>(R.id.recyclerView_dishes)
            val position = 0 // Change to the desired position of the video
            recyclerView.scrollToPosition(position)

            // Click on the video item
            Espresso.onView(ViewMatchers.withId(R.id.recyclerView_dishes))
                .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(position, ViewActions.click()))
        }

        // Delay for video player to load
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        // Go to Video_repr activity
        activityScenarioRule.scenario.onActivity { activity ->
            activity.startActivity(Intent(activity, Video_repr::class.java))
        }

        // Delay for video playback
        try {
            Thread.sleep(5000) // Adjust the duration for video playback
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        // Tap on the screen to pause the video
        Espresso.onView(ViewMatchers.withId(R.id.video))
            .perform(ViewActions.click())

        // Go back to previous screen (Video_repr to Recipes)
        Espresso.pressBack()
    }
}
