package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton r1,r2,r3;
        final LinearLayout l1;

        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        l1=findViewById(R.id.lin1);

        r1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                l1.setBackgroundResource(R.color.red);
            }
        });

        r2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                l1.setBackgroundResource(R.color.green);
            }
        });

        r3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                l1.setBackgroundResource(R.color.blue);
            }
        });
    }
}
