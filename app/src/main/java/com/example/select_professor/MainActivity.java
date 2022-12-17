package com.example.select_professor;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {
    Button pro, cla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.realmain);
        pro = (Button) findViewById(R.id.pro);
        cla = (Button) findViewById(R.id.cla);
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), realmain.class);
                startActivity(intent);
            }
        });
        cla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), cla_main.class);
                startActivity(intent);
            }
        });
    }
}

