package com.beagle.pulkit.eventify;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import org.apache.http.client.HttpClient;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.ProgressDialog;

import org.apache.http.client.HttpClient;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button login, sign_up;
    EditText inputEmail, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup);
        initiate();

        login.setOnClickListener(this);
        sign_up.setOnClickListener(this);
    }

    private void initiate() {
        login = (Button) findViewById(R.id.login);
        sign_up = (Button) findViewById(R.id.sign_up);
        inputEmail = (EditText) findViewById(R.id.user_id);
        //inputPassword = (EditText) findViewById(R.id.password);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:

                break;

            case R.id.sign_up:
                Intent register = new Intent(MainActivity.this, Register.class);
                startActivity(register);
                break;
        }
    }


}