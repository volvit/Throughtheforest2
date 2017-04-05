package com.example.vladimir.forest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnExit,btnStart,btnSettings,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button)findViewById(R.id.buttonStart);
        btnAbout = (Button)findViewById(R.id.buttonAbout);
        btnSettings = (Button)findViewById(R.id.buttonSettings);
        btnExit = (Button)findViewById(R.id.buttonExit);

        startService(new Intent(this, MyServise.class));


        btnExit.setOnClickListener(new View.OnClickListener(){ //Выход из игры

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyServise.class);

                //stopService(new Intent(this, MyServise.class));
                onBackPressed();
                finish();
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() { //К настройкам игры

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener(){ //Как играть

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener(){ // Начать играть

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main_Window.class);
                startActivity(intent);
            }

        });

    }

    public void onBackPressed() {
        stopService(new Intent(this, MyServise.class));

    }

    @Override
    public void onClick(View view) {

    }
}
