package com.example.mini_project;

import android.provider.BaseColumns;

public class quizContract {

    public static class QuestionTable implements BaseColumns{

        public  static final String TABLE_NAME = "quiz_question";
        public  static final String COLUNM_QUESTION = "question";
        public  static final String COLUNM_OPTION1 = "option1";
        public  static final String COLUNM_OPTION2 = "option2";
        public  static final String COLUNM_OPTION3 = "option3";
        public  static final String COLUNM_OPTION4 = "option4";
        public static final String COLUNM_ANS_NR = "ans_nr";
    }
}
