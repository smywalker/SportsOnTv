package com.smashedcontrollers.sportsontv;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class tubeTest {

    @Rule
    public ActivityTestRule<Splash> mActivityTestRule = new ActivityTestRule<>(Splash.class);

    @Test
    public void tubeTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.not_sign_in), withText("Don't Sign In"),
                        withParent(allOf(withId(R.id.activity_main),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.tubeButton), isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction button = onView(
                allOf(withId(R.id.playButton), withText("Play Video"),
                        withParent(allOf(withId(R.id.activity_tube),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        button.perform(click());

        pressBack();

    }

}
