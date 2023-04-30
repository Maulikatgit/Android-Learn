package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, phone;
    CheckBox cb1, cb2, cb3, cb4;
    RadioGroup rgp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.contact);
        rgp = findViewById(R.id.gendergrp);
        cb1 = findViewById(R.id.read);
        cb2 = findViewById(R.id.dance);
        cb3 = findViewById(R.id.sing);
        cb4 = findViewById(R.id.cycle);
        findViewById(R.id.submitForm).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String n = name.getText().toString(), e = email.getText().toString(), hobbies = "";

                int p = Integer.parseInt(phone.getText().toString());

                Toast.makeText(MainActivity.this, "Your name is:"+n, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Your email is : "+e, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Your phone no is : "+p, Toast.LENGTH_SHORT).show();
                RadioButton r = findViewById(rgp.getCheckedRadioButtonId());
                Toast.makeText(MainActivity.this, "Your gender is : "+r.getText(), Toast.LENGTH_SHORT).show();
                if (cb1.isChecked()) hobbies = "Your hobbies are : "+cb1.getText().toString();
                if (cb2.isChecked()) hobbies += ", " + cb2.getText().toString();
                if (cb3.isChecked()) hobbies += ", " + cb2.getText().toString();
                if (cb4.isChecked()) hobbies += ", " + cb2.getText().toString();
                Toast.makeText(MainActivity.this, "Your hobbies are : "+hobbies, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
