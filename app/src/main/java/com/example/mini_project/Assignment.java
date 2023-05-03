package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Assignment extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5;
    public ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);

        card1 = (CardView) findViewById(R.id.tp1);
        card2 = (CardView) findViewById(R.id.tp2);
        card3 = (CardView) findViewById(R.id.tp3);
        card4 = (CardView) findViewById(R.id.tp4);
        card5 = (CardView) findViewById(R.id.tp5);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv1.setOnClickListener(this);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.tp1:
                i = new Intent(this, PDF_Viewer.class);
                startActivity(i);
                break;

            case R.id.tp2:
                i = new Intent(this, PDF_Viewer1.class);
                startActivity(i);
                break;

            case R.id.tp3:
                i = new Intent(this, PDF_Viewer2.class);
                startActivity(i);
                break;

            case R.id.tp4:
                i = new Intent(this, PDF_Viewer3.class);
                startActivity(i);
                break;

            case R.id.tp5:
                i = new Intent(this, PDF_Viewer4.class);
                startActivity(i);
                break;
        }

        if (view.getId() == R.id.iv1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }

}