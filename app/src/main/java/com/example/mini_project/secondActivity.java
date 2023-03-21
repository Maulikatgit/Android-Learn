package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        card1 = (CardView) findViewById(R.id.cv1);
        card2 = (CardView) findViewById(R.id.cv2);
        card3 = (CardView) findViewById(R.id.cv3);
        card4 = (CardView) findViewById(R.id.cv4);
        card5 = (CardView) findViewById(R.id.cv5);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.cv1:
                i = new Intent(this, ch1.class);
                startActivity(i);
                break;

            case R.id.cv2:
                i = new Intent(this, ch2.class);
                startActivity(i);
                break;

            case R.id.cv3:
                i = new Intent(this, ch3.class);
                startActivity(i);
                break;

            case R.id.cv4:
                i = new Intent(this, ch4.class);
                startActivity(i);
                break;

            case R.id.cv5:
                i = new Intent(this, ch5.class);
                startActivity(i);
                break;
        }
    }
}