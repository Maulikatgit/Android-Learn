package com.example.helloworld;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton img=findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.android1);
            }
        });
        img.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {
                img.setImageResource(R.drawable.android2);
                return false;
            }
        });
    }
}