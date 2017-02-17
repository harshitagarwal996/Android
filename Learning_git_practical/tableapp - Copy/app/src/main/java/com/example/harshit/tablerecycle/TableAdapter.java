package com.example.harshit.tablerecycle;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Harshit on 23-01-2017.
 */
public class TableAdapter extends RecyclerView.Adapter<TableViewHolder> {
    String multiplier;
    int number;
    public void forIntent(Intent intent)
    {
        multiplier=intent.getStringExtra("multiplier");
        int length=multiplier.length();
        try{
           number=Integer.parseInt(multiplier.substring(length-2,length));
        }catch (Exception e)
        {
            number=Integer.parseInt(multiplier.substring(length-1,length));
        }
        //Log.d("Harshit",""+number);
    }
    @Override
    public TableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflate = inflater.inflate(R.layout.table_friend, parent, false);
        return new TableViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(TableViewHolder holder, int position) {
        holder.multiplier.setText(String.format("%02d", number));
        holder.multiplicant.setText(String.format("%02d", (position+1)));
        holder.answer.setText(number*(position+1)+"");
        if (position%10==0&&position!=0)
        {
            holder.space.setText("\n\n\n\n\n");
        }
        else
            holder.space.setText("");

    }
    @Override
    public int getItemCount() {
        return 100;
    }
}
