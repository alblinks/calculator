package org.albi.calculador;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button irButton;
    private Activity THIS = this;

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
                Toast.makeText(getApplicationContext(), "Proceding to calculator", Toast.LENGTH_SHORT).show();

                //go to Activity calculate by explicit intent
                Intent calculateIntent = new Intent(THIS, Calculate.class);
                startActivity(calculateIntent);

            }
    });



        Log.d("org.albi.calculador", "end of onCreate");
    }

}
