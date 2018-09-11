package com.dev.dagger2

import android.content.Context
import android.support.test.runner.AndroidJUnit4
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Created by Al Warren on 9/9/2018.
 */

@RunWith(AndroidJUnit4::class)
class MainActivityDefaultsTest {
    @Rule @JvmField val activity =
            ActivityTestRule<MainActivity>(MainActivity::class.java)

    private var packageName = "com.dev.dagger2"
    private lateinit var context: Context
    private lateinit var helloWorld: String
    private lateinit var fab1Label: String
    private lateinit var fab2Label: String
    private lateinit var fab3Label: String

    @Before
    fun setup() {
        context = InstrumentationRegistry.getTargetContext()
        helloWorld = context.getString(R.string.hello_world)
        fab1Label = context.getString(R.string.model)
        fab2Label = context.getString(R.string.hello)
        fab3Label = context.getString(R.string.goodbye)
    }

    @Test
    fun givenMainActivity_whenActivityStarted_thenPackageNameIsCorrect() {
        assertEquals(packageName, context.packageName)
    }

    @Test
    fun givenMainActivity_whenActivityStarted_thenHelloViewIsCorrect() {
        onView(withId(R.id.helloTextView))
                .check(matches(withText(helloWorld)))
    }

    @Test
    fun givenMainActivity_whenActivityStarted_thenDaggerViewIsCorrect() {
        onView(withId(R.id.daggerTextView))
                .check(matches(withText(GREETING_HELLO)))
    }

    @Test
    fun givenMainActivity_whenActivityStarted_thenFab1LabelIsCorrect() {
        onView(withId(R.id.labelFab1))
                .check(matches(withText(fab1Label)))
    }

    @Test
    fun givenMainActivity_whenActivityStarted_thenFab2LabelIsCorrect() {
        onView(withId(R.id.labelFab2))
                .check(matches(withText(fab2Label)))
    }

    @Test
    fun givenMainActivity_whenActivityStarted_thenFab3LabelIsCorrect() {
        onView(withId(R.id.labelFab3))
                .check(matches(withText(fab3Label)))
    }
}