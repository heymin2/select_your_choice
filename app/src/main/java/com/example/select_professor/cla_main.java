package com.example.select_professor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cla_main extends AppCompatActivity {
    SeekBar sb1;
    TextView tv;
    Button start, back;
    int check = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cla_main);
        sb1 = (SeekBar) findViewById(R.id.seekBar);
        tv = (TextView) findViewById(R.id.tv);
        start = (Button) findViewById(R.id.start);
        back = (Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (check){
                    case 1:
                        Intent intent = new Intent(getApplicationContext(), select1.class);
                        intent.putExtra("문제수", check);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), select2.class);
                        intent2.putExtra("문제수", check);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), select3.class);
                        intent3.putExtra("문제수", check);
                        startActivity(intent3);
                        break;
                }

            }
        });

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv.setText((String.format("문제 수: %d", sb1.getProgress())));
                check = sb1.getProgress();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                tv.setText((String.format("문제 수: %d", sb1.getProgress())));
                check = sb1.getProgress();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tv.setText((String.format("문제 수: %d", sb1.getProgress())));
                check = sb1.getProgress();
            }
        });


    }
}
