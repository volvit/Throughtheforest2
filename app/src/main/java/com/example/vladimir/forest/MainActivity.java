package com.example.vladimir.forest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnExit,btnStart,btnSettings,btnAbout;
    public ArrayList<Items> ItemsList = new ArrayList<Items>();
    public ArrayList<Location> LocationList = new ArrayList<Location>(); //список локаций

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

        // TODO:Нужно тут сделать чтение данных из файла и заполнение списков с элементами и локациями
        LoadItems();
        LoadLocations();

    }

    public void onBackPressed() {
        stopService(new Intent(this, MyServise.class));

    }

    @Override
    public void onClick(View view) {

    }

    public void LoadItems(){

        try{
            XmlPullParser parser = getResources().getXml(R.xml.items_list);



            // продолжаем, пока не достигнем конца документа
            while (parser.getEventType()!= XmlPullParser.END_DOCUMENT) {
                if (parser.getEventType() == XmlPullParser.START_TAG
                        && parser.getName().equals("item")) {
                               ItemsList.add(new Items(parser.getAttributeValue(0), parser.getAttributeValue(1),
                                       parser.getAttributeValue(2)));
                }
                parser.next();
            }


        } catch (Throwable e){

        }
    }

    public void LoadLocations(){

        try{
            XmlPullParser parser = getResources().getXml(R.xml.items_list);


            // продолжаем, пока не достигнем конца документа
            while (parser.getEventType()!= XmlPullParser.END_DOCUMENT) {
                if (parser.getEventType() == XmlPullParser.START_TAG
                        && parser.getName().equals("location")) {
                    LocationList.add(new Location(parser.getAttributeValue(0),
                            parser.getAttributeValue(1)/*,parser.getAttributeValue(2)*/));
                }
                parser.next();
            }


        } catch (Throwable e){

        }
    }



}
