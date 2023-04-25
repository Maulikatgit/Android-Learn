package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.transition.CircularPropagation;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class Success extends AppCompatActivity {

    CircularProgressBar circularProgressBar;
    TextView rs;
    int correct, wrong;
    LinearLayout btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        correct = getIntent().getIntExtra("correct", 0);
        wrong = getIntent().getIntExtra("wrong", 0);

        circularProgressBar = findViewById(R.id.circularProgressBar);
        rs = findViewById(R.id.rs);
        btn = findViewById(R.id.btn);

        circularProgressBar.setProgress(correct);
        rs.setText(correct + "/4");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Success.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void imgback(View view) {
        Intent i = new Intent(Success.this, quiz.class);
        startActivity(i);
    }

    public void Exit(View view) {
        Intent i = new Intent(Success.this, MainActivity.class);
        startActivity(i);
    }
}