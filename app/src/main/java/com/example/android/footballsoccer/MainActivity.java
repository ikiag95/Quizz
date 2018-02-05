package com.example.android.footballsoccer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public String nameUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button category = (Button) findViewById(R.id.submit_answers);
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textName = (EditText) findViewById(R.id.edit_text_name_view);
                nameUser = textName.getText().toString();

                EditText textSurname = (EditText) findViewById(R.id.edit_text_second_name_view);
                nameUser = nameUser + " " + textSurname.getText().toString();

                Intent categoriesIntent = new Intent(MainActivity.this, CategoriesActivity.class);
                categoriesIntent.putExtra("arg", nameUser);
                startActivity(categoriesIntent);
            }
        });

    }


}
