package com.jcristin.loginverification;

public class LoginVerification {
    public boolean verify(String email, String password) {
        return email.equals("test@test.com") && password.equals("123456")
                || (email.equals("admin@test.com") && password.equals("123456"));
    }
}
