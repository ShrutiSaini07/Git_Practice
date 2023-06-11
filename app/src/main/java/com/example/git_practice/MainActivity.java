package com.example.git_practice;

import static java.sql.DriverManager.println;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        println("Hiii!!");
        println("Shruti");
        println("change");
    }
}