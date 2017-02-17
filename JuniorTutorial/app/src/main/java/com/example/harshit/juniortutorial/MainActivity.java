package com.example.harshit.juniortutorial;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.harshit.juniortutorial.dummy.DummyContentNumber;
import com.example.harshit.juniortutorial.dummy.DummyContentTable;

public class MainActivity extends AppCompatActivity implements NumberFragment.OnNumberFragmentInteractionListener ,TableFragment.OnTableFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager=getSupportFragmentManager();

        if (manager.findFragmentById(R.id.number_container) == null) {
            NumberFragment fragment = NumberFragment.newInstance(1);
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.number_container, fragment);
            transaction.commit();
        }
        if (manager.findFragmentById(R.id.table_container) == null) {
            NumberFragment fragment = NumberFragment.newInstance(1);
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.table_container, fragment);
            transaction.commit();
        }

    }

    @Override
    public void onNumberFragmentInteraction(DummyContentNumber.DummyItem item) {

    }
    @Override
    public void onTableFragmentInteraction(DummyContentTable.DummyItem item) {

    }
}
