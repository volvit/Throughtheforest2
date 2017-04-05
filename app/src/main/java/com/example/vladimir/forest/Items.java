package com.example.vladimir.forest;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Items  {

    private String mFileName = "Items";
    //String ItemName = " ";
     int Weight = 0;






}



/*

public class MainActivity extends ActionBarActivity {

    private static final String LOG_TAG = "my_tag";
    private String mFileName = "myfile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void readFile(View v) {

        Log.d(LOG_TAG, "readFile");

        FileInputStream stream = null;
        StringBuilder sb = new StringBuilder();
        String line;

        try {
            stream = openFileInput(mFileName);

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
            } finally {
                stream.close();
            }

            Log.d(LOG_TAG, "Data from file: " + sb.toString());

        } catch (Exception e) {
            Log.d(LOG_TAG, "Файла нет или произошла ошибка при чтении");
        }
    }

    public void writeToFile(View v) {

        Log.d(LOG_TAG, "writeToFile");

        String string = "My test string";

        try {
            FileOutputStream outputStream = openFileOutput(mFileName, MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();

        } catch (Exception e) {
            Log.d(LOG_TAG, "Произошла ошибка при записи");
        }
    }
}
 */