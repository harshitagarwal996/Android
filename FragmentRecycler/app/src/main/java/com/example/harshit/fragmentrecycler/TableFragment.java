package com.example.harshit.fragmentrecycler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by Harshit on 09-02-2017.
 */

public class TableFragment extends Fragment {
    private static int tableNumber=1;
    public TableFragment() {}

    public static TableFragment getInstance(int tablenumber){
        TableFragment fragment=new TableFragment();
        Bundle bundle=new Bundle();
        tableNumber=tablenumber;
        bundle.putInt("TABLE_NUMBER",tablenumber);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b=getArguments();
        tableNumber=b.getInt("TABLE_NUMBER");
    }
}
