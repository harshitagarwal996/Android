package com.example.harshit.tablerecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView tableOf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableOf=(RecyclerView)this.findViewById(R.id.recycler_table_of);
        tableOf.setLayoutManager(new LinearLayoutManager(this));
        tableOf.setAdapter(new FriendAdapter());
    }
    public void tableFunction(View view)
    {
        Button textview= (Button) view;
        Intent intent=new Intent(this,TableActivity.class);
        intent.putExtra("multiplier",textview.getText().toString());
        startActivity(intent);
    }
}
