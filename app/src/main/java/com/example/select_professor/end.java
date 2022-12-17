package com.example.select_professor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class end extends AppCompatActivity {
    Button end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);
        TextView quiz = (TextView)findViewById(R.id.quiz1);
        end = (Button) findViewById(R.id.end);

        Intent sendintent = getIntent();
        int data = sendintent.getExtras().getInt("sum");

        switch (data){
            case 0:
                quiz.setText("오답입니다!");
                break;
            case 1:
                quiz.setText("정답입니다!");
                break;
        }
        

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), realmain.class);
                startActivity(intent);
            }
        });
    }
}