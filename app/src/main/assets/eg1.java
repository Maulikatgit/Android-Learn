import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    TextView first, second, third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (TextView) findViewById(R.id.firstText);
        second = (TextView) findViewById(R.id.secondText);
        third = (TextView) findViewById(R.id.thirdText);
        first.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "You are clicked on First Text", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.colorBlue));
                snackbar.show();
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "You are clicked on Second Text", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.colorGreen));
                snackbar.show();
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "You are clicked on Third Text", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.colorOrange));
                snackbar.show();
            }
        });

    }
}
