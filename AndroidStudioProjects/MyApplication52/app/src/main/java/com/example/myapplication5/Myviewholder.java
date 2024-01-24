package com.example.myapplication5;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

public class Myviewholder extends RecyclerView.ViewHolder {

    TextView text;
    public Myviewholder(@NonNull View itemView) {

        super(itemView);
        text = itemView.findViewById(R.id.firstcard);
    }
}