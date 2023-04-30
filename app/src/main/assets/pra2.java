package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TextViewobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextViewobj = findViewById(R.id.text_view);
        TextViewobj.append("This is onCreate() Method" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextViewobj.append("This is onStart() Method" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextViewobj.append("This is onResume() Method" + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextViewobj.append("This is onPause() Method" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextViewobj.append("This is onStop() Method" + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextViewobj.append("This is onDestroy() Method" +
                "\n");
    }
}