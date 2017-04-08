package com.example.vladimir.forest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Main_Window extends AppCompatActivity {

    private int FoodProgres,StaminaProgres,WarmthProgres;
    public double Food = 5000;
    public double Warmth = 100;
    public double Stamina = 1000;

    TextView TextAbout;
    Button BtnMenu,BtnInvent,BtnSet;
    ImageView Picture;

    private ProgressBar PbStamina,PbWarmth,PbFood;

    @Override
    protected void onCreate(Bundle savedInstanseState){
        super.onCreate(savedInstanseState);
        setContentView(R.layout.main_window);

        BtnInvent = (Button)findViewById(R.id.btnInvent);
        BtnMenu = (Button)findViewById(R.id.btnMenu);
        BtnSet = (Button)findViewById(R.id.btnSet);
        Picture = (ImageView)findViewById(R.id.picture);
        TextAbout = (TextView)findViewById(R.id.textAbout);

        PbFood = (ProgressBar)findViewById(R.id.progressBarFood);
        PbStamina = (ProgressBar)findViewById(R.id.progressBarStamina);
        PbWarmth = (ProgressBar)findViewById(R.id.progressBarWarmth);



    }

/*
    private void postProgress(int progress) {
        String strProgress = String.valueOf(progress) + " %";
        PbWarmth.setProgress(progress);

        if (progress == 0) {
            pbHorizontal.setSecondaryProgress(0);
        } else {
            pbHorizontal.setSecondaryProgress(progress + 5);
        }
        tvProgressHorizontal.setText(strProgress);
        tvProgressCircle.setText(strProgress);
    }
    */

    private void ffood (){

    }





}

/*
public void onClick(View v) {
    progress = progress + 10;
    postProgress(progress);
}
*/