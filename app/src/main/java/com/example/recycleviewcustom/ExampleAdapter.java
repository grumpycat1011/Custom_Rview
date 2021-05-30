package com.example.recycleviewcustom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<Example_item> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public TextView text1;
        public TextView text2;
        public TextView text3;

        public ExampleViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {

            super(itemView);
            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);
            text3 = itemView.findViewById(R.id.text3);


        }
    }

    public ExampleAdapter(ArrayList<Example_item> examplelist){
        mExampleList = examplelist;
    }

    @NonNull
    @NotNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ExampleAdapter.ExampleViewHolder holder, int position) {
        Example_item currentitem = mExampleList.get(position);

        holder.text1.setText(currentitem.getmMagnitude());
        holder.text2.setText(currentitem.getmLocation());
        holder.text3.setText(currentitem.getmDate());

    }

    @Override
    public int getItemCount() {

        return mExampleList.size();
    }
}
