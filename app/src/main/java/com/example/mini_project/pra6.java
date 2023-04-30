package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class pra6 extends AppCompatActivity implements View.OnClickListener {

    public ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra1);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv1.setOnClickListener(this);

        String codeSnippet = readFileFromAssets("pra6.xml");
        TextView codeSnippetTextView = findViewById(R.id.code_snippet);
        codeSnippetTextView.setText(codeSnippet);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setBackgroundColor(getResources().getColor(R.color.lavender));

        // Set the selected item listener for the bottom navigation view
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        String codeSnippet = readFileFromAssets("pra6.xml");
                        TextView codeSnippetTextView = findViewById(R.id.code_snippet);
                        codeSnippetTextView.setText(codeSnippet);
                        return true;
                    case R.id.menu_search:
                        String codeSnippet1 = readFileFromAssets("pra6.java");
                        TextView codeSnippetTextView1 = findViewById(R.id.code_snippet);
                        codeSnippetTextView1.setText(codeSnippet1);
                        return true;
                    case R.id.menu_profile:
                        // Handle the Notifications menu item
                        return true;
                }
                return false;
            }
        });
    }

    private String readFileFromAssets(String fileName) {
        String codeSnippet = "";
        try {
            InputStream inputStream = getAssets().open(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = reader.readLine()) != null) {
                codeSnippet += line + "\n";
            }
            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return codeSnippet;

    }

    @Override
    public void onClick(View view) {
        Intent i;

        i = new Intent(this, practicals.class);
        startActivity(i);

    }
}
