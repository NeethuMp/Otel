package com.oteltechnologies.databasesample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qvertz on 1/6/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CustomViewHolder> {
    private final Context context;
    List<UserData> data=new ArrayList<>();
    public MyAdapter(List<UserData> data, Context context) {
        this.data=data;
        this.context=context;
    }

    @Override
    public MyAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        CustomViewHolder vh = new CustomViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(MyAdapter.CustomViewHolder holder, int position) {
        holder.tv.setText(data.get(position).getName());
        Log.d("data",""+holder.tv);
        holder.tv2.setText(data.get(position).getDate());
        Log.d("data",""+holder.tv2);



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv,tv2;
        public CustomViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.text);
            tv2= (TextView) itemView.findViewById(R.id.date);

        }
    }
}
