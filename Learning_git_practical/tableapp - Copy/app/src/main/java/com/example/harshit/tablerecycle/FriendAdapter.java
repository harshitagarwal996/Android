package com.example.harshit.tablerecycle;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Harshit on 23-01-2017.
 */
public class FriendAdapter extends RecyclerView.Adapter<FriendViewHolder> {
    @Override
    public FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflate = inflater.inflate(R.layout.table_of_xml, parent, false);

        return new FriendViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(FriendViewHolder holder, int position) {
        holder.tableOf.setText(""+(position+1));
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
