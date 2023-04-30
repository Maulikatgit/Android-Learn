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

    public void Submit(View v) {

        EditText txt=(EditText) findViewById(R.id.name);
        String msg=txt.getText().toString();

        Toast t=Toast.makeText(this,msg,Toast.LENGTH_LONG);
        t.show();
    }
}