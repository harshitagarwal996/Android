package com.example.harshit.tablerecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements SearchDialogue.OnFragmentInteractionListener{

    RecyclerView tableOf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableOf=(RecyclerView)this.findViewById(R.id.recycler_table_of);
        tableOf.setLayoutManager(new LinearLayoutManager(this));
        tableOf.setAdapter(new FriendAdapter());

        FragmentManager manager= getSupportFragmentManager();
        if(manager.findFragmentById(R.id.search_fragment)==null)
        {
            SearchDialogue searchDialogue=new SearchDialogue();
            FragmentTransaction transaction=manager.beginTransaction();
            transaction.add(R.id.search_fragment,searchDialogue);
            transaction.commit();
        }


    }
    public void tableFunction(View view)
    {
        Button textview= (Button) view;
        Intent intent=new Intent(this,TableActivity.class);
        intent.putExtra("multiplier",textview.getText().toString());
        startActivity(intent);
    }

    @Override
    public void onFragmentInteraction(View view) {
        Log.d("harshit","Fragment interaction occured");
        int number;
        EditText text= (EditText) findViewById(R.id.search_string);
        Log.d("harshit","Edittext conversion occured");
        String textString=text.getText().toString();
        Log.d("harshit",textString);
            Log.d("harshit","Number not blank");
            try{
                TableAdapter.setNumber(Integer.parseInt(textString));
                Log.d("harshit","Number setted successfully");

                Intent intent=new Intent(this,TableActivity.class);
                Log.d("harshit","Intent Created");
                intent.putExtra("multiplier",textString);
                startActivity(intent);
            }
            catch (Exception e)
            {
                Log.d("harshit","Some Exception occured");
            }

        }
    }
