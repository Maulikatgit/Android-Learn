package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonExample extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_example);
        radioGroup = (RadioGroup) findViewById(R.id.rgroup);
        radioButton1 = (RadioButton) findViewById(R.id.rbutton1);
        radioButton2 = (RadioButton) findViewById(R.id.rbutton2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbutton1:

                        Toast.makeText(getApplicationContext(), "Pizza", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbutton2:

                        Toast.makeText(getApplicationContext(), "Berger", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}