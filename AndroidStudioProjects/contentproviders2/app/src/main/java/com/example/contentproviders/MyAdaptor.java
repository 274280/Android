package com.example.contentproviders;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MyAdaptor extends RecyclerView.Adapter<Myviewholder> {
    Context context;
    ArrayList<employeedata> list;

    public MyAdaptor(List<employeedata> employdata,Context context) {
        list = new ArrayList<>();
        this.list = (ArrayList<employeedata>) employdata;
        this.context=context;
        Log.i("MyAdaptor","MyAdaptor comstructor ");
    }





    @NonNull
    @Override
    public Myviewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        Log.i("MyAdapter","36: oncreateviewholder started");
        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.cardview,parent,false);
        Myviewholder viewholder = new Myviewholder(v);
        Log.i("MyAdapter","oncreateviewholder executed");
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        Log.i("MyAdapter","onbindviewholder started");
        holder.name.setText(list.get(position).name);
        holder.id.setText(list.get(position).id);
        holder.salary.setText(list.get(position).salary);
        Log.i("MyAdapter","onbindviewholder executed");

    }

    @Override
    public int getItemCount() {
        return  list.size();
    }
}