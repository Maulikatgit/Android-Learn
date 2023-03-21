package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.cv1);
        card1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        i = new Intent(this, secondActivity.class);
        startActivity(i);
    }
}