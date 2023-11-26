package com.fahimshariar.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button add, sub, reset;

    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        add = findViewById(R.id.add);

        sub = findViewById(R.id.sub);

        reset = findViewById(R.id.reset);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count= count + 1;

                display.setText(""+count);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count - 1;

                display.setText(""+count);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count =0;

                display.setText(""+count);
            }
        });













    }
}