package com.doomcat.twilioapp;

import android.os.Build;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;


import android.os.Build;
import android.widget.EditText;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)


public class FormValidatorTest {

    private MainActivity activity;
    private EditText mUserNameEditText;
    private EditText mPasswordEditText;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
        mUserNameEditText = (EditText) activity.findViewById(R.id.userNameEditText);
        mPasswordEditText = (EditText) activity.findViewById(R.id.passwordEditText);
    }


    @Test
    public void testIfFormValidatorInstantiates(){
        FormValidator fv1 = new FormValidator();
        System.out.println(fv1.spitText());
    }
    @Test
    public void TestIsEmpty(){
        FormValidator fv1 = new FormValidator();
        System.out.println(mUserNameEditText.getText().toString());
        System.out.println(fv1.isEmpty(mUserNameEditText,mPasswordEditText));
        assertTrue(fv1.isEmpty(mUserNameEditText, mPasswordEditText));

    }

}