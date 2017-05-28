package com.doomcat.twilioapp;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

public class AdminActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<AdminActivity> activityTestRule =
            new ActivityTestRule<>(AdminActivity.class);

}