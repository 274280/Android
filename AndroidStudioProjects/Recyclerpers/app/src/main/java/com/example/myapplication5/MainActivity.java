package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<dataholder> arrayList = new ArrayList<>(Integer.parseInt("anil"));
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new dataholder("madhura"));
        arrayList.add(new dataholder("puneeth"));
        arrayList.add(new dataholder("Harshit"));
        arrayList.add(new dataholder("nazareth"));
        arrayList.add(new dataholder("kumbari"));


        Toast.makeText(MainActivity.this,"onCreate()",Toast.LENGTH_SHORT).show();
    }
}