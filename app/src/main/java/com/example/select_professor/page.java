package com.example.select_professor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page extends AppCompatActivity {
Button q1a1, q1a2, q1a3, q1a4;
TextView q1;
int arr[] = {0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page);
        q1 = (TextView) findViewById(R.id.q1);
        q1a1 = (Button) findViewById(R.id.q1a1);
        q1a2 = (Button) findViewById(R.id.q1a2);
        q1a3 = (Button) findViewById(R.id.q1a3);
        q1a4 = (Button) findViewById(R.id.q1a4);

       q1a1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(), end.class);
               intent.putExtra("sum", 0);
               startActivity(intent);
           }
       });
        q1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), end.class);
                intent.putExtra("sum", 1);
                startActivity(intent);
            }
        });
        q1a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), end.class);
                intent.putExtra("sum", 0);
                startActivity(intent);
            }
        });
        q1a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), end.class);
                intent.putExtra("sum", 0);
                startActivity(intent);
            }
        });
    }
}