package com.example.vladimir.forest;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Settings extends AppCompatActivity implements View.OnClickListener, OnCheckedChangeListener {

    final String SAVED_TEXT = "saved_text";

     Button btnSaveName;
     TextView tVSound,tVMusic; //Звук Музыка
     ToggleButton tgButtSound,tgButtMusic; // Вкл/выкл Звук Музыка
     EditText editName; // имя игрока


        @Override
        protected void onCreate(Bundle savedInstanseState){
            super.onCreate(savedInstanseState);
            setContentView(R.layout.settings);

            tVSound = (TextView)findViewById(R.id.tVsound);
            tVMusic = (TextView)findViewById(R.id.tVMusic);
            tgButtSound = (ToggleButton)findViewById(R.id.tgButtSound);
            tgButtMusic = (ToggleButton)findViewById(R.id.tgButtMusic);
            editName = (EditText)findViewById(R.id.editName);
            btnSaveName = (Button)findViewById(R.id.btnSaveName);
            btnSaveName.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Сохранено", Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {




    }

}
