package com.example.mini_project;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.mini_project.quizContract.*;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Helper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "quiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public Helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;
        final String SQL_CREATE_QUESTION_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUNM_QUESTION + " TEXT, " +
                QuestionTable.COLUNM_OPTION1 + " TEXT, " +
                QuestionTable.COLUNM_OPTION2 + " TEXT, " +
                QuestionTable.COLUNM_OPTION3 + " TEXT, " +
                QuestionTable.COLUNM_OPTION4 + " TEXT, " +
                QuestionTable.COLUNM_ANS_NR + " TEXT " +
                ")";

        db.execSQL(SQL_CREATE_QUESTION_TABLE);

        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);

    }

    private void addOuestions(Modelclass question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUNM_QUESTION, question.getQuetion());
        cv.put(QuestionTable.COLUNM_OPTION1, question.getOa());
        cv.put(QuestionTable.COLUNM_OPTION2, question.getOb());
        cv.put(QuestionTable.COLUNM_OPTION3, question.getOc());
        cv.put(QuestionTable.COLUNM_OPTION4, question.getOd());
        cv.put(QuestionTable.COLUNM_ANS_NR, question.getAns());
        db.insert(QuestionTable.TABLE_NAME,null,cv);
    }

    private void fillQuestionsTable(){

        Modelclass q1 = new Modelclass("What is Android","Mobile Operation System","Database","Programming Language","Android Version","Programming Language");
        addOuestions(q1);

        Modelclass q2 = new Modelclass("What is Android","Mobile Operation System","Database","Programming Language","Android Version","Programming Language");
        addOuestions(q2);

        Modelclass q3 = new Modelclass("What is Android","Mobile Operation System","Database","Programming Language","Android Version","Programming Language");
        addOuestions(q3);

        Modelclass q4 = new Modelclass("What is Android","Mobile Operation System","Database","Programming Language","Android Version","Programming Language");
        addOuestions(q4);

        Modelclass q5 = new Modelclass("What is Android","Mobile Operation System","Database","Programming Language","Android Version","Programming Language");
        addOuestions(q5);


    }

    @SuppressLint("Range")
    public ArrayList<Modelclass> getAllQuuestion(){

        ArrayList<Modelclass> questionlist = new ArrayList<>();
        db = getReadableDatabase();

        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUNM_QUESTION,
                QuestionTable.COLUNM_OPTION1,
                QuestionTable.COLUNM_OPTION2,
                QuestionTable.COLUNM_OPTION3,
                QuestionTable.COLUNM_OPTION4,
                QuestionTable.COLUNM_ANS_NR
        };

        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                null,
                null,
                null,
                null,
                null,
                null
        );

        if (c.moveToFirst()){
            do{

                Modelclass question = new Modelclass();
                question.setQuetion(c.getString(c.getColumnIndex(QuestionTable.COLUNM_QUESTION)));
                question.setOa(c.getString(c.getColumnIndex(QuestionTable.COLUNM_OPTION1)));
                question.setOb(c.getString(c.getColumnIndex(QuestionTable.COLUNM_OPTION2)));
                question.setOc(c.getString(c.getColumnIndex(QuestionTable.COLUNM_OPTION3)));
                question.setOd(c.getString(c.getColumnIndex(QuestionTable.COLUNM_OPTION4)));
                question.setAns(c.getString(c.getColumnIndex(QuestionTable.COLUNM_ANS_NR)));

                questionlist.add(question);


            }while (c.moveToNext());
        }

        c.close();
        return questionlist;
    }
}
