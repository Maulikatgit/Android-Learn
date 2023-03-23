package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class topics extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3, card4, card5, card6, card7, card8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);

        card1 = (CardView) findViewById(R.id.tp1);
        card2 = (CardView) findViewById(R.id.tp2);
        card3 = (CardView) findViewById(R.id.tp3);
        card4 = (CardView) findViewById(R.id.tp4);
        card5 = (CardView) findViewById(R.id.tp5);
        card6 = (CardView) findViewById(R.id.tp6);
        card7 = (CardView) findViewById(R.id.tp7);
        card8 = (CardView) findViewById(R.id.tp8);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.tp1:
            case R.id.tp2:
            case R.id.tp3:
            case R.id.tp4:
            case R.id.tp5:
            case R.id.tp6:
            case R.id.tp7:
            case R.id.tp8:

                i = new Intent(this, introduction.class);
                startActivity(i);
                break;
        }

    }
}