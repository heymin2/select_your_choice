package com.example.select_professor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class select3  extends AppCompatActivity {
    Button q1a1, q1a2, q2a1, q2a2, q3a1, q3a2;
    TextView q1, q2, q3;
    int[] arr = {0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select3);
        q1 = (TextView) findViewById(R.id.q1);
        q1a1 = (Button) findViewById(R.id.q1a1);
        q1a2 = (Button) findViewById(R.id.q1a2);
        q2 = (TextView) findViewById(R.id.q2);
        q2a1 = (Button) findViewById(R.id.q2a1);
        q2a2 = (Button) findViewById(R.id.q2a2);
        q3 = (TextView) findViewById(R.id.q3);
        q3a1 = (Button) findViewById(R.id.q3a1);
        q3a2 = (Button) findViewById(R.id.q3a2);

        q1a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q1a1.setVisibility(View.GONE);
                q1a2.setVisibility(View.GONE);
                q2.setVisibility(View.VISIBLE);
                q2a1.setVisibility(View.VISIBLE);
                q2a2.setVisibility(View.VISIBLE);
                arr[0]++;
                arr[2]++;
            }
        });
        q1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q1a1.setVisibility(View.GONE);
                q1a2.setVisibility(View.GONE);
                q2.setVisibility(View.VISIBLE);
                q2a1.setVisibility(View.VISIBLE);
                q2a2.setVisibility(View.VISIBLE);
                arr[1]++;
                arr[3]++;
            }
        });

        q2a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q1a1.setVisibility(View.GONE);
                q1a2.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q2a1.setVisibility(View.GONE);
                q2a2.setVisibility(View.GONE);
                q3.setVisibility(View.VISIBLE);
                q3a1.setVisibility(View.VISIBLE);
                q3a2.setVisibility(View.VISIBLE);
                arr[0]++;
                arr[1]++;
            }
        });
        q2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q1a1.setVisibility(View.GONE);
                q1a2.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q2a1.setVisibility(View.GONE);
                q2a2.setVisibility(View.GONE);
                q3.setVisibility(View.VISIBLE);
                q3a1.setVisibility(View.VISIBLE);
                q3a2.setVisibility(View.VISIBLE);
                arr[2]++;
                arr[3]++;
            }
        });

        Log.d("데이ㅓ터ㅓㅓㅓㅓㅓㅓㅓㅓ", Integer.toString(arr[0]));
        q3a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr[2]++;
                Intent intent = new Intent(getApplicationContext(), cla1.class);
                intent.putExtra("sum", sum(arr));
                startActivity(intent);
            }
        });
        q3a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr[0]++;
                arr[1]++;
                arr[3]++;
                Intent intent = new Intent(getApplicationContext(), cla1.class);
                intent.putExtra("sum", sum(arr));
                startActivity(intent);
            }
        });
    }

    int sum(int[] arr) {
        int sum = 0;
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum < arr[i]) {
                sum = arr[i];
                check = i;
            }
        }
        return check;
    }
}