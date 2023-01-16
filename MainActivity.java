package com.example.customtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView time;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = findViewById(R.id.time);
        start = findViewById(R.id.start_btn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartTimer();
            }
        });


    }

    private void StartTimer() {
        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                time.setText("00:0");
            } else {
                time.setText("00:" + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}