package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void convert(View v) {

        EditText c=(EditText) findViewById(R.id.tmp);

        double cent=Double.parseDouble(c.getText().toString());
        double faren=(cent*9/5)+32;

        Toast t= Toast.makeText(this,"Farenheit:
                "+String.valueOf(faren),Toast.LENGTH_LONG);
                t.show();

    }
}