package com.example.mini_project;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TimerDialog {

    private Context mcontext;
    private Dialog timer;

    private TextView timeup;

    public TimerDialog(Context mcontext){
        this.mcontext = mcontext;
    }

    public void timerDialog(){
        timer = new Dialog(mcontext);
        timer.setContentView(R.layout.timeout);

        final LinearLayout button = (LinearLayout) timer.findViewById(R.id.timeout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.dismiss();
                Intent i = new Intent(mcontext, quiz.class);
                mcontext.startActivity(i);
            }
        });
        timer.show();
        timer.setCancelable(false);
        timer.setCanceledOnTouchOutside(false);
        timer.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

}
