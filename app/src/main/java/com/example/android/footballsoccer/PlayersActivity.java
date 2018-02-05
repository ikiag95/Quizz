package com.example.android.footballsoccer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by ikiag on 2.2.2018..
 */

public class PlayersActivity extends AppCompatActivity {

    int sum = 0;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        String passedArg = getIntent().getExtras().getString("arg");
        userName = passedArg;


        final ImageView imageOne = (ImageView) findViewById(R.id.first_image);
        imageOne.setImageResource(R.drawable.ronaldinho);
        final ImageView imageTwo = (ImageView) findViewById(R.id.second_image);
        imageTwo.setImageResource(R.drawable.ronaldo);
        final ImageView imageThree = (ImageView) findViewById(R.id.third_image);
        imageThree.setImageResource(R.drawable.messi);
        final ImageView imageFour = (ImageView) findViewById(R.id.fourth_image);
        imageFour.setImageResource(R.drawable.neymar);
        final ImageView imageFive = (ImageView) findViewById(R.id.fifth_image);
        imageFive.setImageResource(R.drawable.buffon);


        //string array for answers

        String[] answerQuestions = new String[20];
        answerQuestions[0] = "Ronaldo";
        answerQuestions[1] = "Ronaldinho";
        answerQuestions[2] = "R.Carlos";
        answerQuestions[3] = "Kaka";
        answerQuestions[4] = "Cafu";
        answerQuestions[5] = "Ronaldo";
        answerQuestions[6] = "Pogba";
        answerQuestions[7] = "C.Ronaldo";
        answerQuestions[8] = "De Rossi";
        answerQuestions[9] = "Zidane";
        answerQuestions[10] = "Messi";
        answerQuestions[11] = "Nesta";
        answerQuestions[12] = "Messi";
        answerQuestions[13] = "Ronaldo";
        answerQuestions[14] = "Neymar";
        answerQuestions[15] = "Del Piero";
        answerQuestions[16] = "Barthez";
        answerQuestions[17] = "Navas";
        answerQuestions[18] = "Buffon";
        answerQuestions[19] = "Bravo";


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
                sum++;
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
