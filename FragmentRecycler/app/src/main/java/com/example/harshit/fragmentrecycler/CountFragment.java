package com.example.harshit.fragmentrecycler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by Harshit on 09-02-2017.
 */

public class CountFragment extends Fragment {
    public CountFragment() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public static interface onClickCountFragment()
    {
    }
}
