package com.jcristin.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jcristin.loginverification.LoginVerification;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText email;
    private EditText password;
    private Button login;

    private LoginVerification loginVerification = new LoginVerification();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        login = findViewById(R.id.buttonLogin);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (loginVerification.verifyLogin(email.getText().toString(), password.getText().toString()))
            Toast.makeText(this, "Login Sucessful", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
    }
}
