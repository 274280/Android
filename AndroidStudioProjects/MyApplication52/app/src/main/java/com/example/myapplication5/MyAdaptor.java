package com.example.myapplication5;

import android.content.Context;
import android.media.RouteListingPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<Myviewholder> {

    Context context;
    ArrayList<dataholder> arrayList;

    public MyAdaptor(Context context,ArrayList arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main3,parent,false);
        Myviewholder viewholder = new Myviewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        holder.text.setText(arrayList.get(position).text);


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}