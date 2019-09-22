package com.example.navigationgraphexample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.navigationgraphexample.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
