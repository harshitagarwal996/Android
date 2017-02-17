package com.example.harshit.fragmentrecycler;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int tableNumber=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager=getSupportFragmentManager();
        CountFragment countFragment=new CountFragment();
        FragmentTransaction countTransaction=manager.beginTransaction();
        countTransaction.add(R.id.count_fragment,countFragment);
        countTransaction.commit();

        if(manager.findFragmentById(R.id.table_fragment)==null)
        {
            TableFragment fragment=TableFragment.getInstance(tableNumber);
            FragmentTransaction transaction=manager.beginTransaction();
            transaction.add(R.id.table_fragment,fragment);
            transaction.commit();
        }
    }

}
