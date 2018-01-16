package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

/**
 * Created by fabio.lagoa on 16/01/2018.
 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        // 1. Click the Tell Joke button
        onView(withId(R.id.bt_tell_joke)).perform(click());

        // 2. Wait for AsyncTask result (By default, Espresso waits for UI events in the current
        // message queue to be handled and for default instances of AsyncTask to complete before
        // it moves on to the next test operation)

        // 3. Check if Async Task successfully retrieves a non-empty string
        onView(withId(com.fabiohideki.androidlibrary.R.id.tv_joke))
                .check(matches(not(withText(""))));
    }

}