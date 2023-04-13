package com.example.mini_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.cv1);
        card2 = (CardView) findViewById(R.id.cv2);
        card3 = (CardView) findViewById(R.id.cv3);
        card4 = (CardView) findViewById(R.id.cv4);
        card5 = (CardView) findViewById(R.id.cv5);
        card6 = (CardView) findViewById(R.id.cv6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.cv1:
            case R.id.cv2:
            case R.id.cv3:
            case R.id.cv4:
                i = new Intent(this, topics.class);
                startActivity(i);
                break;
            case R.id.cv6:
                Uri uri = Uri.parse("https://github.com/Maulikatgit/Android-Learn");
                i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(Intent.createChooser(i, "Share Application"));
                break;
        }
    }
}