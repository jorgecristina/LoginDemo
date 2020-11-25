package com.jcristin.loginverification;

public class LoginVerification {
    public boolean verifyEmailAndPassword(String email, String password) {
        return email.equals("test@test.com") && password.equals("1234");
    }
}
