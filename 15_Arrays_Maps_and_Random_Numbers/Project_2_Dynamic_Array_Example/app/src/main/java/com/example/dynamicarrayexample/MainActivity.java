package com.example.dynamicarrayexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaring and allocating in one step
        int[] ourArray = new int[1000];

        //Let's initialize ourArray using a for loop
        //Because more than a few variables is a lot of typing!

        for (int i = 0; i < 1000; i++) {

            //Put the value of our value into ourArray
            //At the position decided by i

            ourArray[i] = i * 5;

            //Output what is going on
            Log.i("info", "i = " + i);
            Log.i("info", "ourArray[i] = " + ourArray[i]);
        }
    }
}