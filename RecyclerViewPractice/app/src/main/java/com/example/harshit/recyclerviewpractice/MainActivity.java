package com.example.harshit.recyclerviewpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void menuFunction(View view)
    {
        Log.d("harshit","menu Function Clicked");
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
