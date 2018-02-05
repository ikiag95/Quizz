package com.example.android.footballsoccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);


        final String passedArg = getIntent().getExtras().getString("arg");


        TextView history = (TextView) findViewById(R.id.history_text_view);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(CategoriesActivity.this, HistoryActivity.class);
                historyIntent.putExtra("arg", passedArg);
                startActivity(historyIntent);
            }
        });

        TextView players = (TextView) findViewById(R.id.players_text_view);
        players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playersIntent = new Intent(CategoriesActivity.this, PlayersActivity.class);
                playersIntent.putExtra("arg", passedArg);
                startActivity(playersIntent);
            }
        });

        final TextView rules = (TextView) findViewById(R.id.rules_text_view);
        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rulesIntent = new Intent(CategoriesActivity.this, RulesActivity.class);
                rulesIntent.putExtra("arg", passedArg);
                startActivity(rulesIntent);
            }
        });

        TextView world = (TextView) findViewById(R.id.world_text_view);
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent worldIntent = new Intent(CategoriesActivity.this, WorldActivity.class);
                worldIntent.putExtra("arg", passedArg);
                startActivity(worldIntent);
            }
        });


    }

}
