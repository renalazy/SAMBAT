package com.example.sambat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent landingAct = new Intent(MainActivity.this, LandingActivity.class);
                    startActivity(landingAct);
                }
            }
        };
        timer.start();
    }
}
