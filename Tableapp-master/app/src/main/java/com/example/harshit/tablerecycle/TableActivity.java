package com.example.harshit.tablerecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class TableActivity extends AppCompatActivity {
    RecyclerView tableRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        tableRecyclerView= (RecyclerView) this.findViewById(R.id.table_recycler_view);
        tableRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        TableAdapter tableAdapter = new TableAdapter();
        tableAdapter.forIntent(getIntent());
        tableRecyclerView.setAdapter(tableAdapter);
    }
}
