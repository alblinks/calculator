package org.albi.calculador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Calculate extends AppCompatActivity {
    //variables for text input
    private EditText number1;
    private EditText number2;
    //strings for reading out text
    private String string1;
    private String string2;
    //variables for calculation
    private double num1;
    private double num2;
    private double solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("org.albi.calculate", "Start of Calculate Activitys onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
    }

    //Method for calculation

    public void addition(View view) {
        Log.d("org.albi.calculate", "Calculate method");
        //Get objects associated to text fields
        number1=(EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        //Parse content of textfield to string
        string1=number1.getText().toString();
        string2=number2.getText().toString();
        //Log string
        Log.d("org.albi.calculate", "string1: " + string1);
        Log.d("org.albi.calculate", "string2: " + string2);

        //Convert string to double
        num1 =  Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());

        //calculation
        solution=num1+num2;

        //convert the solution to string again
        String solutionString = String.valueOf(solution);
        //Print string to log
        Log.d("org.albi.calculate", "Calculated solution: " + solutionString);

        //Intent for passing the result to main activity
        Intent solutionIntent = new Intent();
        //Add solution string to intent
        solutionIntent.putExtra("solution" ,solutionString);
        //set the request code to ok
        setResult(RESULT_OK, solutionIntent);
        //end the activity
        finish();


    }
}

