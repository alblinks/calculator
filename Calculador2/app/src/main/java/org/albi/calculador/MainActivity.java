package org.albi.calculador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button irButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("org.albi.calculador", "start of onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find Button ir1
        this.irButton = (Button) findViewById(R.id.ir1);
        irButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //event executed on click
            public void onClick(View view) {
                Log.d("org.albi.calculador", "push ir1"); //Log message

        }
    });



        Log.d("org.albi.calculador", "end of onCreate");
    }

}