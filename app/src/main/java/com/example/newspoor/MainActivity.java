package com.example.newspoor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Thread welcomeThread = new Thread() {

                @Override
                public void run() {
                    try {
                        super.run();
                        sleep(5000); //Delay of 10 seconds
                    } catch (Exception e) {

                    } finally {

                        Intent i = new Intent(MainActivity.this,
                                login.class);
                        startActivity(i);
                        finish();

                    }
                }
            };
            welcomeThread.start();


        }
    }
