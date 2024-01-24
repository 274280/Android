package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button b1;
    EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1 =   findViewById(R.id.editText1);
        editText2 =   findViewById(R.id.editText2);
        b1 =   findViewById(R.id.button);
        b1.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = editText1.getText().toString();
                String val2 = editText2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a + b;
                Toast.makeText(SecondActivity.this,String.valueOf(sum),Toast.LENGTH_LONG).show();
            }
        });
    }
}