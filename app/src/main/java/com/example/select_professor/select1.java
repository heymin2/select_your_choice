package com.example.select_professor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class select1 extends AppCompatActivity {
    Button q1a1, q1a2;
    TextView q1;
    int[] arr = {0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select1);
        q1 = (TextView) findViewById(R.id.q1);
        q1a1 = (Button) findViewById(R.id.q1a1);
        q1a2 = (Button) findViewById(R.id.q1a2);


        q1a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), cla1.class);
                arr[0]++;
                arr[2]++;
                intent.putExtra("sum", sum(arr));
                startActivity(intent);
            }
        });
        q1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr[1]++;
                arr[3]++;
                Log.d("데이ㅓ터ㅓㅓㅓㅓㅓㅓㅓㅓ0", Integer.toString(arr[0]));
                Log.d("데이ㅓ터ㅓㅓㅓㅓㅓㅓㅓㅓ1", Integer.toString(arr[1]));
                Log.d("데이ㅓ터ㅓㅓㅓㅓㅓㅓㅓㅓ2", Integer.toString(arr[2]));
                Log.d("데이ㅓ터ㅓㅓㅓㅓㅓㅓㅓㅓ3", Integer.toString(arr[3]));
                Intent intent = new Intent(getApplicationContext(), cla1.class);
                intent.putExtra("sum", sum(arr));
                startActivity(intent);
            }
        });
    }

    int sum(int[] arr){
        int sum = 0;
        int check = 0;
        for(int i = 0; i < arr.length; i++){
            if(sum < arr[i]){
                sum = arr[i];
                check = i;
            }
        }
        return check;
    }
}
