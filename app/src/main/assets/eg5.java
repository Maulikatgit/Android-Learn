package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarExample extends AppCompatActivity {

    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_example);
        ratingBar = (RatingBar) findViewById(R.id.rating);
        button = (Button) findViewById(R.id.ratingbar_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Rating Value: " + ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}