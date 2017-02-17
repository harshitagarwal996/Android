package com.example.harshit.tablerecycle;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Harshit on 23-01-2017.
 */
public class FriendViewHolder extends RecyclerView.ViewHolder {
    TextView tableOf;
    public FriendViewHolder(View itemView) {
        super(itemView);
        tableOf= (TextView) itemView.findViewById(R.id.table_of_text_view);

    }
}
