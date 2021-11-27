package com.example.multidimensionalarrayexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Random object for generating question numbers
        Random radInt = new Random();

        //a variable to hold the random value generated
        int questionNumber;

        //declare and allocate in separate stages for clarity but we don't have to
        String[][] countryAndCities;

        //Now we have a two dimensional array
        countryAndCities = new String[5][2];

        //5 arrays with 2 elements each
        //Perfect for 5 "What's the capital city" questions

        //Now we load the questions and answers into our arrays
        //You could do this with less questions to save typing
        //But don't do more or you will get an exception

        countryAndCities[0][0] = "United Kingdom";
        countryAndCities[0][1] = "London";

        countryAndCities[1][0] = "USA";
        countryAndCities[1][1] = "Washington";

        countryAndCities[2][0] = "India";
        countryAndCities[2][1] = "New Delhi";

        countryAndCities[3][0] = "Brazil";
        countryAndCities[3][1] = "Brasilia";

        countryAndCities[4][0] = "Kenya";
        countryAndCities[4][1] = "Nairobi";

        /*
        * Now we know that the country is stored at element 0
        * The matching capital at element 1
        * Here are two variables that reflect this
        * */

        int country = 0;
        int capital = 1;

        //A quick for loop to ask 3 questions
        for (int i = 0; i < 3; i++) {
            //get a random question number between 0 and 4
            questionNumber = radInt.nextInt(5);

            //and ask the question and in this case just
            //give the answer for the sake of brevity
            Log.i("info", "The capital of " + countryAndCities[questionNumber][country]);
            Log.i("info", "is " + countryAndCities[questionNumber][capital]);
        }//end of for loop


    }
}