package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class practicals extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10;
    public ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals);

        card1 = (CardView) findViewById(R.id.tp1);
        card2 = (CardView) findViewById(R.id.tp2);
        card3 = (CardView) findViewById(R.id.tp3);
        card4 = (CardView) findViewById(R.id.tp4);
        card5 = (CardView) findViewById(R.id.tp5);
        card6 = (CardView) findViewById(R.id.tp6);
        card7 = (CardView) findViewById(R.id.tp7);
        card8 = (CardView) findViewById(R.id.tp8);
        card9 = (CardView) findViewById(R.id.tp9);
        card10 = (CardView) findViewById(R.id.tp10);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv1.setOnClickListener(this);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.tp1:
                i = new Intent(this, pra1.class);
                startActivity(i);
                break;

            case R.id.tp2:
                i = new Intent(this, pra2.class);
                startActivity(i);
                break;

            case R.id.tp3:
                i = new Intent(this, pra3.class);
                startActivity(i);
                break;

            case R.id.tp4:
                i = new Intent(this, pra4.class);
                startActivity(i);
                break;

            case R.id.tp5:
                i = new Intent(this, pra5.class);
                startActivity(i);
                break;

            case R.id.tp6:
                i = new Intent(this, pra6.class);
                startActivity(i);
                break;

            case R.id.tp7:
                i = new Intent(this, pra7.class);
                startActivity(i);
                break;

            case R.id.tp8:
                i = new Intent(this, pra8.class);
                startActivity(i);
                break;

            case R.id.tp9:
                i = new Intent(this, pra9.class);
                startActivity(i);
                break;

            case R.id.tp10:
                i = new Intent(this, pra10.class);
                startActivity(i);
                break;
        }

        if (view.getId() == R.id.iv1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}