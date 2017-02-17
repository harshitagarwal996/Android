package com.example.harshit.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Harshit on 23-01-2017.
 */

public class FriendViewHolder extends RecyclerView.ViewHolder {
    TextView name,homeTown;
    public FriendViewHolder(View itemView) {
        super(itemView);
        name= (TextView) itemView.findViewById(R.id.name_text_view);
        homeTown= (TextView) itemView.findViewById(R.id.hometown_text_view);
    }
}
