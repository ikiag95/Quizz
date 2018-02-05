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

public class HistoryActivity extends AppCompatActivity {

    int sum = 0;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        String passedArg = getIntent().getExtras().getString("arg");
        userName = passedArg;

        //strring array for history questins and setText for textviews

        String[] historyQuestions = new String[5];
        historyQuestions[0] = "1. In which country was soccer/football originally found?";
        historyQuestions[1] = "2. When was soccer/football found?";
        historyQuestions[2] = "3. What is the name of the japanese game in which players are standing in a circle and pass the ball?";
        historyQuestions[3] = "4. What was the Greek word for their type of soccer/football in past?";
        historyQuestions[4] = "5. What was the Roman word for their type of soccer/football in past?";


        final TextView questionOneTextView = (TextView) findViewById(R.id.question_one_history);
        questionOneTextView.setText(historyQuestions[0]);

        final TextView questionTwoTextView = (TextView) findViewById(R.id.question_two_history);
        questionTwoTextView.setText(historyQuestions[1]);

        final TextView questionThreeTextView = (TextView) findViewById(R.id.question_three_history);
        questionThreeTextView.setText(historyQuestions[2]);

        final TextView questionFourTextView = (TextView) findViewById(R.id.question_four_history);
        questionFourTextView.setText(historyQuestions[3]);

        final TextView questionFiveTextView = (TextView) findViewById(R.id.question_five_history);
        questionFiveTextView.setText(historyQuestions[4]);


        //string array for answers

        String[] answerQuestions = new String[20];
        answerQuestions[0] = "Spain";
        answerQuestions[1] = "England";
        answerQuestions[2] = "Brazil";
        answerQuestions[3] = "Argentina";
        answerQuestions[4] = "1590";
        answerQuestions[5] = "1776";
        answerQuestions[6] = "2000";
        answerQuestions[7] = "1863";
        answerQuestions[8] = "Kemari";
        answerQuestions[9] = "Yakuro";
        answerQuestions[10] = "Socero";
        answerQuestions[11] = "Zinga";
        answerQuestions[12] = "Ekklais";
        answerQuestions[13] = "Dunamis";
        answerQuestions[14] = "Episkyros";
        answerQuestions[15] = "Pantote";
        answerQuestions[16] = "Horreum";
        answerQuestions[17] = "Hypocaust";
        answerQuestions[18] = "Harpastum";
        answerQuestions[19] = "Bulla";

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
                sum++;
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
                sum++;

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
