package com.example.lab2_ph35761;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bai1 = (Button) findViewById(R.id.btnbai1);
        Button bai2 = (Button) findViewById(R.id.btnbai2);


        bai1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, bai1.class);
                startActivity(intent);
            }
        });

        bai2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, bai2.class);
                startActivity(intent);
            }
        });


    }
}