package com.example.contentproviders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class employeedata {
    String name,id;
    String salary;
    employeedata(String name,String id, String salary) {
        this.name = name;
        this.id = id;
        this.salary=salary;
    }
}