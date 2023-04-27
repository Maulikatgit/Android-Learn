package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class practicals extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2;
    public ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals);

        card1 = (CardView) findViewById(R.id.tp1);
        card2 = (CardView) findViewById(R.id.tp2);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv1.setOnClickListener(this);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);

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
        }

        if (view.getId() == R.id.iv1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}