package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class topics extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18;
    public ImageView iv1;
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
        card9 = (CardView) findViewById(R.id.tp9);
        card10 = (CardView) findViewById(R.id.tp10);
        card11 = (CardView) findViewById(R.id.tp11);
        card12 = (CardView) findViewById(R.id.tp12);
        card13 = (CardView) findViewById(R.id.tp13);
        card14 = (CardView) findViewById(R.id.tp14);
        card15 = (CardView) findViewById(R.id.tp15);
        card16 = (CardView) findViewById(R.id.tp16);
        card17 = (CardView) findViewById(R.id.tp17);
        card18 = (CardView) findViewById(R.id.tp18);

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
        card11.setOnClickListener(this);
        card12.setOnClickListener(this);
        card13.setOnClickListener(this);
        card14.setOnClickListener(this);
        card15.setOnClickListener(this);
        card16.setOnClickListener(this);
        card17.setOnClickListener(this);
        card18.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.tp1:
            case R.id.tp12:


            case R.id.tp18:
                i = new Intent(this, introduction.class);
                startActivity(i);
                break;

            case R.id.tp2:
                i = new Intent(this, architecture.class);
                startActivity(i);
                break;

            case R.id.tp3:
                i = new Intent(this, android_IDE.class);
                startActivity(i);
                break;

            case R.id.tp4:
                i = new Intent(this, component.class);
                startActivity(i);
                break;

            case R.id.tp5:
                i = new Intent(this, manifestFile.class);
                startActivity(i);
                break;

            case R.id.tp6:
                i = new Intent(this, Activity.class);
                startActivity(i);
                break;

            case R.id.tp7:
                i = new Intent(this, fragment.class);
                startActivity(i);
                break;

            case R.id.tp8:
                i = new Intent(this, intent.class);
                startActivity(i);
                break;

            case R.id.tp9:
                i = new Intent(this, services.class);
                startActivity(i);
                break;

            case R.id.tp11:
                i = new Intent(this, UIlayout.class);
                startActivity(i);
                break;

            case R.id.tp13:
                i = new Intent(this, AndroidMenu.class);
                startActivity(i);
                break;

            case R.id.tp14:
                i = new Intent(this, Broadcast_receivers.class);
                startActivity(i);
                break;

            case R.id.tp15:
                i = new Intent(this, content_provider.class);
                startActivity(i);
                break;

            case R.id.tp16:
                i = new Intent(this, containers.class);
                startActivity(i);
                break;

            case R.id.tp17:
                i = new Intent(this, storage.class);
                startActivity(i);

            case R.id.tp10:
                i = new Intent(this, pra1.class);
                startActivity(i);

        }

        if (view.getId() == R.id.iv1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}