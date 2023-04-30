package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Call(View v) {

        EditText num=(EditText) findViewById(R.id.call);
        String number="tel: "+num.getText().toString();
        Intent i=new Intent(Intent.ACTION_CALL);

        i.setData(Uri.parse(number));
        startActivity(i);

    }
}