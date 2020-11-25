package com.jcristin.myapplication;

import com.jcristin.loginverification.LoginVerification;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    LoginVerification lv = new LoginVerification();

    @Test
    public void wrongPassword() {
        assertFalse(lv.verify("test@test.com", "blabla"));
    }

    @Test
    public void wrongEmail() {
        assertFalse(lv.verify("test@test.xxx", "1234"));
    }


    @Test
    public void allOK() {
        assertTrue(lv.verify("test@test.com", "1234"));
    }
}