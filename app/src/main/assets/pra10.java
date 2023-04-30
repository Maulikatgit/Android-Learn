package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=findViewById(R.id.games);
        ArrayList<String> games=new ArrayList<>();

        games.add("Valorant");
        games.add("Counter Strike");
        games.add("Call of Duty");
        games.add("GTA 5");
        games.add("Assassin's Creed");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,games);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int i, long l) {
                String name = games.get(i);
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
