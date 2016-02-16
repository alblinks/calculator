package org.albi.calculador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class Calculate extends AppCompatActivity {
    //variables for text input
    private EditText number1;
    private EditText number2;
    //variables for calculation
    double num1;
    double num2;
    double solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("org.albi.calculate", "Start of Calculate Activitys onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);


        //number1=(EditText) findViewById(R.id.number1);
        //number2=(EditText) findViewById(R.id.number2);
        //num1 =  Double.parseDouble(number1.getText().toString());
        //num2 = Double.parseDouble(number2.getText().toString());
    }



    public int addition(int num1, int num2) {
        return num1 + num2;
    }
}
