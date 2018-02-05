package com.example.android.footballsoccer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ikiag on 2.2.2018..
 */

public class RulesActivity extends AppCompatActivity {

    int sum = 0;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        String passedArg = getIntent().getExtras().getString("arg");
        userName = passedArg;

        //strring array for questins and setText for textviews

        String[] rulesQuestions = new String[5];
        rulesQuestions[0] = "1. Playing time of soccer/football is:";
        rulesQuestions[1] = "2. Which type of the ball must be there?";
        rulesQuestions[2] = "3. Soccer/football is played by:";
        rulesQuestions[3] = "4. In soccer/football we have:";
        rulesQuestions[4] = "5. How much does halftime pause take?";


        final TextView questionOneTextView = (TextView) findViewById(R.id.question_one_rules);
        questionOneTextView.setText(rulesQuestions[0]);

        final TextView questionTwoTextView = (TextView) findViewById(R.id.question_two_rules);
        questionTwoTextView.setText(rulesQuestions[1]);

        final TextView questionThreeTextView = (TextView) findViewById(R.id.question_three_rules);
        questionThreeTextView.setText(rulesQuestions[2]);

        final TextView questionFourTextView = (TextView) findViewById(R.id.question_four_rules);
        questionFourTextView.setText(rulesQuestions[3]);

        final TextView questionFiveTextView = (TextView) findViewById(R.id.question_five_rules);
        questionFiveTextView.setText(rulesQuestions[4]);


        //string array for answers

        String[] answerQuestions = new String[20];
        answerQuestions[0] = "45 min";
        answerQuestions[1] = "60 min";
        answerQuestions[2] = "90 min";
        answerQuestions[3] = "120 min";
        answerQuestions[4] = "3";
        answerQuestions[5] = "4";
        answerQuestions[6] = "5";
        answerQuestions[7] = "6";
        answerQuestions[8] = "5 players";
        answerQuestions[9] = "9 players";
        answerQuestions[10] = "11 players";
        answerQuestions[11] = "22 players";
        answerQuestions[12] = "quatters";
        answerQuestions[13] = "thirds";
        answerQuestions[14] = "halftimes";
        answerQuestions[15] = "fifths";
        answerQuestions[16] = "5 min";
        answerQuestions[17] = "10 min";
        answerQuestions[18] = "15 min";
        answerQuestions[19] = "20 min";

        //qeustion one aswers
        Button answerOneQ1 = (Button) findViewById(R.id.answer_one_q_1);
        answerOneQ1.setText(answerQuestions[0]);
        Button answerTwoQ1 = (Button) findViewById(R.id.answer_two_q_1);
        answerTwoQ1.setText(answerQuestions[1]);
        Button answerThreeQ1 = (Button) findViewById(R.id.answer_three_q_1);
        answerThreeQ1.setText(answerQuestions[2]);
        Button answerFourQ1 = (Button) findViewById(R.id.answer_four_q_1);
        answerFourQ1.setText(answerQuestions[3]);

        //qeustion two aswers
        final Button answerOneQ2 = (Button) findViewById(R.id.answer_one_q_2);
        answerOneQ2.setText(answerQuestions[4]);
        final Button answerTwoQ2 = (Button) findViewById(R.id.answer_two_q_2);
        answerTwoQ2.setText(answerQuestions[5]);
        Button answerThreeQ2 = (Button) findViewById(R.id.answer_three_q_2);
        answerThreeQ2.setText(answerQuestions[6]);
        Button answerFourQ2 = (Button) findViewById(R.id.answer_four_q_2);
        answerFourQ2.setText(answerQuestions[7]);

        //qeustion three aswers
        Button answerOneQ3 = (Button) findViewById(R.id.answer_one_q_3);
        answerOneQ3.setText(answerQuestions[8]);
        Button answerTwoQ3 = (Button) findViewById(R.id.answer_two_q_3);
        answerTwoQ3.setText(answerQuestions[9]);
        Button answerThreeQ3 = (Button) findViewById(R.id.answer_three_q_3);
        answerThreeQ3.setText(answerQuestions[10]);
        Button answerFourQ3 = (Button) findViewById(R.id.answer_four_q_3);
        answerFourQ3.setText(answerQuestions[11]);

        //qeustion four aswers
        Button answerOneQ4 = (Button) findViewById(R.id.answer_one_q_4);
        answerOneQ4.setText(answerQuestions[12]);
        Button answerTwoQ4 = (Button) findViewById(R.id.answer_two_q_4);
        answerTwoQ4.setText(answerQuestions[13]);
        Button answerThreeQ4 = (Button) findViewById(R.id.answer_three_q_4);
        answerThreeQ4.setText(answerQuestions[14]);
        Button answerFourQ4 = (Button) findViewById(R.id.answer_four_q_4);
        answerFourQ4.setText(answerQuestions[15]);

        //qeustion five aswers
        Button answerOneQ5 = (Button) findViewById(R.id.answer_one_q_5);
        answerOneQ5.setText(answerQuestions[16]);
        Button answerTwoQ5 = (Button) findViewById(R.id.answer_two_q_5);
        answerTwoQ5.setText(answerQuestions[17]);
        Button answerThreeQ5 = (Button) findViewById(R.id.answer_three_q_5);
        answerThreeQ5.setText(answerQuestions[18]);
        Button answerFourQ5 = (Button) findViewById(R.id.answer_four_q_5);
        answerFourQ5.setText(answerQuestions[19]);


        answerOneQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button answerOneQ1 = (Button) findViewById(R.id.answer_one_q_1);
                Button answerTwoQ1 = (Button) findViewById(R.id.answer_two_q_1);
                Button answerThreeQ1 = (Button) findViewById(R.id.answer_three_q_1);
                Button answerFourQ1 = (Button) findViewById(R.id.answer_four_q_1);


                answerOneQ1.setEnabled(false);
                answerTwoQ1.setEnabled(false);
                answerThreeQ1.setEnabled(false);
                answerFourQ1.setEnabled(false);

            }
        });


        answerTwoQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ1 = (Button) findViewById(R.id.answer_one_q_1);
                Button answerTwoQ1 = (Button) findViewById(R.id.answer_two_q_1);
                Button answerThreeQ1 = (Button) findViewById(R.id.answer_three_q_1);
                Button answerFourQ1 = (Button) findViewById(R.id.answer_four_q_1);

                answerOneQ1.setEnabled(false);
                answerTwoQ1.setEnabled(false);
                answerThreeQ1.setEnabled(false);
                answerFourQ1.setEnabled(false);
                sum++;
            }
        });


        answerThreeQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button answerOneQ1 = (Button) findViewById(R.id.answer_one_q_1);
                Button answerTwoQ1 = (Button) findViewById(R.id.answer_two_q_1);
                Button answerThreeQ1 = (Button) findViewById(R.id.answer_three_q_1);
                Button answerFourQ1 = (Button) findViewById(R.id.answer_four_q_1);
                answerOneQ1.setEnabled(false);
                answerTwoQ1.setEnabled(false);
                answerThreeQ1.setEnabled(false);
                answerFourQ1.setEnabled(false);

            }
        });

        answerFourQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button answerOneQ1 = (Button) findViewById(R.id.answer_one_q_1);
                Button answerTwoQ1 = (Button) findViewById(R.id.answer_two_q_1);
                Button answerThreeQ1 = (Button) findViewById(R.id.answer_three_q_1);
                Button answerFourQ1 = (Button) findViewById(R.id.answer_four_q_1);
                answerOneQ1.setEnabled(false);
                answerTwoQ1.setEnabled(false);
                answerThreeQ1.setEnabled(false);
                answerFourQ1.setEnabled(false);

            }
        });


        answerOneQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ2 = (Button) findViewById(R.id.answer_one_q_2);
                Button answerTwoQ2 = (Button) findViewById(R.id.answer_two_q_2);
                Button answerThreeQ2 = (Button) findViewById(R.id.answer_three_q_2);
                Button answerFourQ2 = (Button) findViewById(R.id.answer_four_q_2);

                answerOneQ2.setEnabled(false);
                answerTwoQ2.setEnabled(false);
                answerThreeQ2.setEnabled(false);
                answerFourQ2.setEnabled(false);

            }
        });


        answerTwoQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button answerOneQ2 = (Button) findViewById(R.id.answer_one_q_2);
                Button answerTwoQ2 = (Button) findViewById(R.id.answer_two_q_2);
                Button answerThreeQ2 = (Button) findViewById(R.id.answer_three_q_2);
                Button answerFourQ2 = (Button) findViewById(R.id.answer_four_q_2);
                answerOneQ2.setEnabled(false);
                answerTwoQ2.setEnabled(false);
                answerThreeQ2.setEnabled(false);
                answerFourQ2.setEnabled(false);

            }
        });


        answerThreeQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button answerOneQ2 = (Button) findViewById(R.id.answer_one_q_2);
                Button answerTwoQ2 = (Button) findViewById(R.id.answer_two_q_2);
                Button answerThreeQ2 = (Button) findViewById(R.id.answer_three_q_2);
                Button answerFourQ2 = (Button) findViewById(R.id.answer_four_q_2);
                answerOneQ2.setEnabled(false);
                answerTwoQ2.setEnabled(false);
                answerThreeQ2.setEnabled(false);
                answerFourQ2.setEnabled(false);
                sum++;
            }
        });


        answerFourQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ2 = (Button) findViewById(R.id.answer_one_q_2);
                Button answerTwoQ2 = (Button) findViewById(R.id.answer_two_q_2);
                Button answerThreeQ2 = (Button) findViewById(R.id.answer_three_q_2);
                Button answerFourQ2 = (Button) findViewById(R.id.answer_four_q_2);

                answerOneQ2.setEnabled(false);
                answerTwoQ2.setEnabled(false);
                answerThreeQ2.setEnabled(false);
                answerFourQ2.setEnabled(false);

            }
        });


        answerOneQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ3 = (Button) findViewById(R.id.answer_one_q_3);
                Button answerTwoQ3 = (Button) findViewById(R.id.answer_two_q_3);
                Button answerThreeQ3 = (Button) findViewById(R.id.answer_three_q_3);
                Button answerFourQ3 = (Button) findViewById(R.id.answer_four_q_3);

                answerOneQ3.setEnabled(false);
                answerTwoQ3.setEnabled(false);
                answerThreeQ3.setEnabled(false);
                answerFourQ3.setEnabled(false);

            }
        });


        answerTwoQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ3 = (Button) findViewById(R.id.answer_one_q_3);
                Button answerTwoQ3 = (Button) findViewById(R.id.answer_two_q_3);
                Button answerThreeQ3 = (Button) findViewById(R.id.answer_three_q_3);
                Button answerFourQ3 = (Button) findViewById(R.id.answer_four_q_3);
                answerOneQ3.setEnabled(false);
                answerTwoQ3.setEnabled(false);
                answerThreeQ3.setEnabled(false);
                answerFourQ3.setEnabled(false);

            }
        });


        answerThreeQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ3 = (Button) findViewById(R.id.answer_one_q_3);
                Button answerTwoQ3 = (Button) findViewById(R.id.answer_two_q_3);
                Button answerThreeQ3 = (Button) findViewById(R.id.answer_three_q_3);
                Button answerFourQ3 = (Button) findViewById(R.id.answer_four_q_3);
                answerOneQ3.setEnabled(false);
                answerTwoQ3.setEnabled(false);
                answerThreeQ3.setEnabled(false);
                answerFourQ3.setEnabled(false);

            }
        });


        answerFourQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ3 = (Button) findViewById(R.id.answer_one_q_3);
                Button answerTwoQ3 = (Button) findViewById(R.id.answer_two_q_3);
                Button answerThreeQ3 = (Button) findViewById(R.id.answer_three_q_3);
                Button answerFourQ3 = (Button) findViewById(R.id.answer_four_q_3);
                answerOneQ3.setEnabled(false);
                answerTwoQ3.setEnabled(false);
                answerThreeQ3.setEnabled(false);
                answerFourQ3.setEnabled(false);
                sum++;
            }
        });


        answerOneQ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ4 = (Button) findViewById(R.id.answer_one_q_4);
                Button answerTwoQ4 = (Button) findViewById(R.id.answer_two_q_4);
                Button answerThreeQ4 = (Button) findViewById(R.id.answer_three_q_4);
                Button answerFourQ4 = (Button) findViewById(R.id.answer_four_q_4);

                answerOneQ4.setEnabled(false);
                answerTwoQ4.setEnabled(false);
                answerThreeQ4.setEnabled(false);
                answerFourQ4.setEnabled(false);

            }
        });


        answerTwoQ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ4 = (Button) findViewById(R.id.answer_one_q_4);
                Button answerTwoQ4 = (Button) findViewById(R.id.answer_two_q_4);
                Button answerThreeQ4 = (Button) findViewById(R.id.answer_three_q_4);
                Button answerFourQ4 = (Button) findViewById(R.id.answer_four_q_4);
                answerOneQ4.setEnabled(false);
                answerTwoQ4.setEnabled(false);
                answerThreeQ4.setEnabled(false);
                answerFourQ4.setEnabled(false);

            }
        });


        answerThreeQ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ4 = (Button) findViewById(R.id.answer_one_q_4);
                Button answerTwoQ4 = (Button) findViewById(R.id.answer_two_q_4);
                Button answerThreeQ4 = (Button) findViewById(R.id.answer_three_q_4);
                Button answerFourQ4 = (Button) findViewById(R.id.answer_four_q_4);
                answerOneQ4.setEnabled(false);
                answerTwoQ4.setEnabled(false);
                answerThreeQ4.setEnabled(false);
                answerFourQ4.setEnabled(false);
                sum++;
            }
        });


        answerFourQ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ4 = (Button) findViewById(R.id.answer_one_q_4);
                Button answerTwoQ4 = (Button) findViewById(R.id.answer_two_q_4);
                Button answerThreeQ4 = (Button) findViewById(R.id.answer_three_q_4);
                Button answerFourQ4 = (Button) findViewById(R.id.answer_four_q_4);
                answerOneQ4.setEnabled(false);
                answerTwoQ4.setEnabled(false);
                answerThreeQ4.setEnabled(false);
                answerFourQ4.setEnabled(false);

            }
        });


        answerOneQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ5 = (Button) findViewById(R.id.answer_one_q_5);
                Button answerTwoQ5 = (Button) findViewById(R.id.answer_two_q_5);
                Button answerThreeQ5 = (Button) findViewById(R.id.answer_three_q_5);
                Button answerFourQ5 = (Button) findViewById(R.id.answer_four_q_5);

                answerOneQ5.setEnabled(false);
                answerTwoQ5.setEnabled(false);
                answerThreeQ5.setEnabled(false);
                answerFourQ5.setEnabled(false);

            }
        });


        answerTwoQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ5 = (Button) findViewById(R.id.answer_one_q_5);
                Button answerTwoQ5 = (Button) findViewById(R.id.answer_two_q_5);
                Button answerThreeQ5 = (Button) findViewById(R.id.answer_three_q_5);
                Button answerFourQ5 = (Button) findViewById(R.id.answer_four_q_5);
                answerOneQ5.setEnabled(false);
                answerTwoQ5.setEnabled(false);
                answerThreeQ5.setEnabled(false);
                answerFourQ5.setEnabled(false);

            }
        });

        ;
        answerThreeQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ5 = (Button) findViewById(R.id.answer_one_q_5);
                Button answerTwoQ5 = (Button) findViewById(R.id.answer_two_q_5);
                Button answerThreeQ5 = (Button) findViewById(R.id.answer_three_q_5);
                Button answerFourQ5 = (Button) findViewById(R.id.answer_four_q_5);
                answerOneQ5.setEnabled(false);
                answerTwoQ5.setEnabled(false);
                answerThreeQ5.setEnabled(false);
                answerFourQ5.setEnabled(false);
                sum++;
            }
        });


        answerFourQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button answerOneQ5 = (Button) findViewById(R.id.answer_one_q_5);
                Button answerTwoQ5 = (Button) findViewById(R.id.answer_two_q_5);
                Button answerThreeQ5 = (Button) findViewById(R.id.answer_three_q_5);
                Button answerFourQ5 = (Button) findViewById(R.id.answer_four_q_5);
                answerOneQ5.setEnabled(false);
                answerTwoQ5.setEnabled(false);
                answerThreeQ5.setEnabled(false);
                answerFourQ5.setEnabled(false);

            }
        });


    }

    public void submitAnswer(View view) {

        String msg = "Dear, " + userName + "\nYou got " + sum + " out of 5 right!";

        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

    }
}
