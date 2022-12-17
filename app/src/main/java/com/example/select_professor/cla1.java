package com.example.select_professor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class cla1  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cla1);
        TextView a = (TextView) findViewById(R.id.a);
        TextView aa = (TextView) findViewById(R.id.aa);
        TextView ab = (TextView) findViewById(R.id.ab);
        TextView c = (TextView) findViewById(R.id.c);
        TextView cc = (TextView) findViewById(R.id.cc);
        TextView k = (TextView) findViewById(R.id.k);
        TextView kk = (TextView) findViewById(R.id.kk);
        Button end = (Button) findViewById(R.id.end);
        Intent intent =  new Intent(getApplicationContext(), cla_main.class);
        Intent sendintent = getIntent();
        int data = sendintent.getExtras().getInt("sum");


        switch (data){
            case 0:
                a.setVisibility(View.VISIBLE);
                aa.setVisibility(View.VISIBLE);
                break;
            case 1:
                k.setVisibility(View.VISIBLE);
                kk.setVisibility(View.VISIBLE);
                break;
            case 2:
                a.setVisibility(View.VISIBLE);
                ab.setVisibility(View.VISIBLE);
                break;
            case 3:
                c.setVisibility(View.VISIBLE);
                cc.setVisibility(View.VISIBLE);
                break;
        }

        String [] arra = {"생활체육", "창업 길라잡이", "스무살의 인문학"};
        String [] arrb = {"미술치료의 이해", "파이썬프로그래밍"};
        String [] arrc = {"미국 드라마로 배우는\n 영어 표현", "스스로 하는 인테리어"};
        String [] arrk = {"손끝 금융,\n 핀테크 경영", "외국인을 위한\n 다문화 한국 사회의 이해", "인류의 그림자,\n 에너지 바로 알기"};

        Random random = new Random();

        aa.setText(arra[random.nextInt(3)]);
        ab.setText(arrb[random.nextInt(2)]);
        cc.setText(arrc[random.nextInt(2)]);
        kk.setText(arrk[random.nextInt(3)]);

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
