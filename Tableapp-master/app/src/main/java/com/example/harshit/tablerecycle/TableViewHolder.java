package com.example.harshit.tablerecycle;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Harshit on 23-01-2017.
 */
public class TableViewHolder extends RecyclerView.ViewHolder{
    View margin;
    TextView multiplier,multiplicant,answer,space;
    public TableViewHolder(View itemView) {
        super(itemView);
        multiplier= (TextView) itemView.findViewById(R.id.multiplier);
        multiplicant= (TextView) itemView.findViewById(R.id.multiplicant);
        answer= (TextView) itemView.findViewById(R.id.answer);
        space= (TextView) itemView.findViewById(R.id.space);
    }
}
