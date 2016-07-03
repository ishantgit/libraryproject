package com.libraryproject.ishant.libraryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ishant.mylibrary.MyLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLibrary.getOurinstance().showToast(this,"Ishant");
    }
}
