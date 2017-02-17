package com.example.harshit.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harshit on 23-01-2017.
 */
public class FriendAdapter extends RecyclerView.Adapter<FriendViewHolder> {
    ArrayList name=new ArrayList();
    ArrayList homeTown=new ArrayList();
    public void createList()
    {
        name.add("Harshit Agarwal");
        name.add("Digvijay Singh");
        name.add("Ram");
        name.add("Shyam");
        name.add("ghanshyam");
        name.add("Radheshyam");
        name.add("aalu");
        name.add("began");
        name.add("bhata");
        name.add("Turai");
        name.add("Gobi");
        name.add("Tamatar");

        homeTown.add("Jhansi");
        homeTown.add("Agra");
        homeTown.add("Meerut");
        homeTown.add("Chandigarh");
        homeTown.add("Punjab");
        homeTown.add("Haryana");
        homeTown.add("Ghaziabad");
        homeTown.add("Noida");
        homeTown.add("Delhi");
        homeTown.add("Kanpur");
        homeTown.add("Allahabad");
        homeTown.add("Lucknow");
    }
    @Override
    public FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.friend_row,parent,false);
        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendViewHolder holder, int position) {
        holder.name.setText((String)name.get(position));
        holder.homeTown.setText((String)homeTown.get(position));
        //Log.d("Harshit","onBindViewHolder"+ position);
    }

    @Override
    public int getItemCount() {
        return name.size();
    }
}
