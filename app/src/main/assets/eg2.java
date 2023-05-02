package com.example.widgets;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Edittext extends AppCompatActivity {

    EditText etEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        etEditText = (EditText) findViewById(R.id.edittext);
        etEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String name = etEditText.getText().toString().trim();
                Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}