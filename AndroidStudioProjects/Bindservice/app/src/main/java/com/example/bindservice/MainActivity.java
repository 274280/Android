package com.example.bindservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyService myservice;
    boolean Isbound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        bindservice();
    }
    protected void onStop() {
        super.onStop();
        unbindService(serviceConnection);
    }

    private void bindservice()  {
        Intent servicebind = new Intent(MainActivity.this,MyService.class);
        bindService(servicebind,serviceConnection, Context.BIND_AUTO_CREATE);
    }
    private ServiceConnection serviceConnection =  new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
        MyService.Mybinder binder = (MyService.Mybinder) service;
        myservice = binder.getservice();
        Isbound = true;
        sum();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d("Service","service got disconnected");
            Isbound=false;

        }
    };
    private void sum() {
       // Log.d("Myserviceexample", "sum of two numbers" + myservice.sumofno(3, 5));
        int a = myservice.sumofno(3, 5);
        Toast.makeText(MainActivity.this,a,Toast.LENGTH_LONG).show();
    }

}