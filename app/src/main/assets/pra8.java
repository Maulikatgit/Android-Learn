package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Add(View v)
    {
        EditText n1=(EditText) findViewById(R.id.num1);
        EditText n2=(EditText) findViewById(R.id.num2);

        int sum=Integer.parseInt(n1.getText().toString()) +
                Integer.parseInt(n2.getText().toString());
        Toast t=Toast.makeText(this,String.valueOf(sum),Toast.LENGTH_SHORT);
        t.show();

    }

    public void Sub(View v) {
        EditText n1=(EditText) findViewById(R.id.num1);
        EditText n2=(EditText) findViewById(R.id.num2);

        int sum=Integer.parseInt(n1.getText().toString()) -
                Integer.parseInt(n2.getText().toString());
        Toast t=Toast.makeText(this,String.valueOf(sum),Toast.LENGTH_SHORT);
        t.show();

    }

    public void Multiply(View v) {
        EditText n1=(EditText) findViewById(R.id.num1);
        EditText n2=(EditText) findViewById(R.id.num2);

        int sum=Integer.parseInt(n1.getText().toString()) *
                Integer.parseInt(n2.getText().toString());
        Toast t=Toast.makeText(this,String.valueOf(sum),Toast.LENGTH_SHORT);
        t.show();

    }

    public void Divide(View v){
        EditText n1=(EditText) findViewById(R.id.num1);
        EditText n2=(EditText) findViewById(R.id.num2);

        double sum=Double.parseDouble(n1.getText().toString())
                / Double.parseDouble(n2.getText().toString());
        Toast t=Toast.makeText(this,String.valueOf(sum),Toast.LENGTH_SHORT);
        t.show();

    }

    public void Max(View v){
        EditText n1=(EditText) findViewById(R.id.num1);
        EditText n2=(EditText) findViewById(R.id.num2);

        int num1=Integer.parseInt(n1.getText().toString());
        int num2=Integer.parseInt(n2.getText().toString());

        if(num1>num2){
            Toast t=Toast.makeText(this,String.valueOf(num1),Toast.LENGTH_SHORT);
            t.show();
        }

        else{
            Toast t=Toast.makeText(this,String.valueOf(num2),Toast.LENGTH_SHORT);
            t.show();
        }
    }
}
