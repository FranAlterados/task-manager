package com.fduranortega.taskmanager.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fduranortega.taskmanager.R;

public class LoginActivity extends AppCompatActivity implements LoginInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void setUserError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void successLogin() {

    }

    @Override
    public void failedLoggin() {

    }
}
