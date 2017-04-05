package com.example.vladimir.forest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class About extends AppCompatActivity {

    //TextView text_about = (TextView)findViewById(R.id.textView_About);

    @Override
    protected void onCreate(Bundle savedInstanseState) {
        super.onCreate(savedInstanseState);
        setContentView(R.layout.about_window);

        //text_about.setText("@string/About");
    }

    
}
