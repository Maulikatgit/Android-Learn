package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Broadcast_receivers extends AppCompatActivity implements View.OnClickListener{

    public ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receivers);

        iv1 = (ImageView) findViewById(R.id.iv1);

        iv1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        i = new Intent(this, topics.class);
        startActivity(i);

    }
}