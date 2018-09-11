package com.dev.dagger2

import android.support.test.runner.AndroidJUnit4
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Created by Al Warren on 9/10/2018.
 */

@RunWith(AndroidJUnit4::class)
class MainActivityFunctionalTest {
    @Rule @JvmField val activity =
            ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun givenMainActivity_whenFab1IsClicked_thenShouldDisplayModelHello() {
        onView(withId(R.id.fab1))
                .perform(ViewActions.click())

        onView(withId(R.id.daggerTextView))
                .check(matches(withText(GREETING_HELLO)))
    }

    @Test
    fun givenMainActivity_whenFab2IsClicked_thenShouldDisplayDaggerHello() {
        onView(withId(R.id.fab2))
                .perform(ViewActions.click())

        onView(withId(R.id.daggerTextView))
                .check(matches(withText(DAGGER_HELLO)))
    }

    @Test
    fun givenMainActivity_whenFab3IsClicked_thenShouldDisplayDaggerGoodbye() {
        onView(withId(R.id.fab3))
                .perform(ViewActions.click())

        onView(withId(R.id.daggerTextView))
                .check(matches(withText(DAGGER_GOODBYE)))
    }

}