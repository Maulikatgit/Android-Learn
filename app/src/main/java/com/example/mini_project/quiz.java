package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

public class quiz extends AppCompatActivity {

    TextView question, option_a, option_b, option_c, option_d, qcount, timer;

    AnimationDrawable anim;
    int sizeofque = 5;

    private  TimerDialog timerDialog;

    List<Modelclass> list;

    private final Handler handler = new Handler();

    private final Handler handler2 = new Handler();

    CountDownTimer countDownTimer;
    int time = 30;
    int correct = 0;
    int wrong = 0;

    Helper helper;

    int qid = 1;
    Modelclass currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        question = findViewById(R.id.question);
        option_a = findViewById(R.id.option_a);
        option_b = findViewById(R.id.option_b);
        option_c = findViewById(R.id.option_c);
        option_d = findViewById(R.id.option_d);
        qcount = findViewById(R.id.numbercount);
        timer = findViewById(R.id.Timer);

        helper = new Helper(this);

        helper.getReadableDatabase();

        list = helper.getAllQuuestion();

        Collections.shuffle(list);

        currentQuestion = list.get(qid);
        timerDialog = new TimerDialog(this);

        qcount.setText(qid + "/" + sizeofque);

        countDownTimer = new CountDownTimer(32000, 1000) {
            @Override
            public void onTick(long l) {

                timer.setText(String.valueOf(time));
                time -= 1;

                if(time == -1){
                    disable();
                    timerDialog.timerDialog();
                }

            }

            @Override
            public void onFinish() {
                disable();
                timerDialog.timerDialog();
            }
        }.start();

        updateQueAnsOptions();

    }

    private void updateQueAnsOptions() {

        option_a.setBackgroundColor(getResources().getColor(R.color.white));
        option_b.setBackgroundColor(getResources().getColor(R.color.white));
        option_c.setBackgroundColor(getResources().getColor(R.color.white));
        option_d.setBackgroundColor(getResources().getColor(R.color.white));


        question.setText(currentQuestion.getQuetion());
        option_a.setText(currentQuestion.getOa());
        option_b.setText(currentQuestion.getOb());
        option_c.setText(currentQuestion.getOc());
        option_d.setText(currentQuestion.getOd());

        countDownTimer.cancel();
        countDownTimer.start();

    }

    private  void SetNewQue(){
        qid++;
        qcount.setText(qid + "/" + sizeofque);
        currentQuestion = list.get(qid);
        enable();
        updateQueAnsOptions();
    }

    public void aclick(View view) {

        countDownTimer.cancel();

        disable();

        option_a.setBackgroundResource(R.drawable.animation);
        anim = (AnimationDrawable) option_a.getBackground();
        anim.start();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(currentQuestion.getOa().equalsIgnoreCase(currentQuestion.getAns())){
                    option_a.setBackgroundColor(getResources().getColor(R.color.green));

                    correct++;

                    Log.i("info", "Correct");

                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (qid != sizeofque){
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 1000);
                }else {

                    option_a.setBackgroundColor(getResources().getColor(R.color.red));

                    wrong++;

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if(currentQuestion.getOb().equalsIgnoreCase(currentQuestion.getAns())){
                                option_b.setBackgroundColor(getResources().getColor(R.color.green));
                            } else if (currentQuestion.getOc().equalsIgnoreCase(currentQuestion.getAns())){
                                option_c.setBackgroundColor(getResources().getColor(R.color.green));
                            }else{
                                option_d.setBackgroundColor(getResources().getColor(R.color.green));
                            }

                        }
                    }, 2000);

                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (qid != sizeofque) {
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 3000);
                }

            }
        },5000);
    }


    public void bclick(View view) {

        countDownTimer.cancel();

        disable();

        option_b.setBackgroundResource(R.drawable.animation);
        anim = (AnimationDrawable) option_b.getBackground();
        anim.start();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(currentQuestion.getOb().equalsIgnoreCase(currentQuestion.getAns())){
                    option_b.setBackgroundColor(getResources().getColor(R.color.green));

                    correct++;

                    Log.i("info", "Correct");

                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (qid != sizeofque){
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 2000);
                }else {

                    option_b.setBackgroundColor(getResources().getColor(R.color.red));

                    wrong++;

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if(currentQuestion.getOa().equalsIgnoreCase(currentQuestion.getAns())){
                                option_a.setBackgroundColor(getResources().getColor(R.color.green));
                            } else if (currentQuestion.getOc().equalsIgnoreCase(currentQuestion.getAns())){
                                option_c.setBackgroundColor(getResources().getColor(R.color.green));
                            }else{
                                option_d.setBackgroundColor(getResources().getColor(R.color.green));
                            }

                        }
                    }, 2000);

                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (qid != sizeofque) {
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 3000);
                }

            }
        },5000);
    }

    public void cclick(View view) {

        countDownTimer.cancel();

        disable();

        option_c.setBackgroundResource(R.drawable.animation);
        anim = (AnimationDrawable) option_c.getBackground();
        anim.start();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(currentQuestion.getOc().equalsIgnoreCase(currentQuestion.getAns())){
                    option_c.setBackgroundColor(getResources().getColor(R.color.green));

                    correct++;

                    Log.i("info", "Correct");

                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (qid != sizeofque){
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 2000);
                }else {

                    option_c.setBackgroundColor(getResources().getColor(R.color.red));

                    wrong++;

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if(currentQuestion.getOb().equalsIgnoreCase(currentQuestion.getAns())){
                                option_b.setBackgroundColor(getResources().getColor(R.color.green));
                            } else if (currentQuestion.getOa().equalsIgnoreCase(currentQuestion.getAns())){
                                option_a.setBackgroundColor(getResources().getColor(R.color.green));
                            }else{
                                option_d.setBackgroundColor(getResources().getColor(R.color.green));
                            }

                        }
                    }, 2000);

                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (qid != sizeofque) {
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 3000);
                }

            }
        },5000);

    }
    public void dclick(View view) {

        countDownTimer.cancel();

        disable();

        option_d.setBackgroundResource(R.drawable.animation);
        anim = (AnimationDrawable) option_d.getBackground();
        anim.start();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(currentQuestion.getOd().equalsIgnoreCase(currentQuestion.getAns())){
                    option_d.setBackgroundColor(getResources().getColor(R.color.green));

                    correct++;

                    Log.i("info", "Correct");

                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (qid != sizeofque){
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 2000);
                }else {

                    option_d.setBackgroundColor(getResources().getColor(R.color.red));

                    wrong++;

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if(currentQuestion.getOb().equalsIgnoreCase(currentQuestion.getAns())){
                                option_b.setBackgroundColor(getResources().getColor(R.color.green));
                            } else if (currentQuestion.getOc().equalsIgnoreCase(currentQuestion.getAns())){
                                option_c.setBackgroundColor(getResources().getColor(R.color.green));
                            }else{
                                option_a.setBackgroundColor(getResources().getColor(R.color.green));
                            }

                        }
                    }, 2000);

                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            if (qid != sizeofque) {
                                SetNewQue();
                            }else {
                                Intent i = new Intent(quiz.this, Success.class);
                                i.putExtra("correct", correct);
                                i.putExtra("wrong", wrong);
                                i.putExtra("sizeofque", sizeofque);
                                startActivity(i);
                            }

                        }
                    }, 3000);
                }

            }
        },2000);

    }

    public void Exit(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void imgback(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    private void disable(){
        option_a.setEnabled(false);
        option_b.setEnabled(false);
        option_c.setEnabled(false);
        option_d.setEnabled(false);

    }

    private void enable(){
        option_a.setEnabled(true);
        option_b.setEnabled(true);
        option_c.setEnabled(true);
        option_d.setEnabled(true);
    }

}
