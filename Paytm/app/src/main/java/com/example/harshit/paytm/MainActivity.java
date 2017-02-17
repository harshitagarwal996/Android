package com.example.harshit.paytm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.email);
    }

    public void afterlogin(View view) {
        String usernameTextView = e1.getText().toString();
        Intent intent = new Intent(this, AfterLogin.class);
        intent.putExtra("username", usernameTextView);
        startActivity(intent);
    }
}