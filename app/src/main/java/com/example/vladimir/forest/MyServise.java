package com.example.vladimir.forest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyServise extends Service {

        private static final String TAG = "MyService";
        public MediaPlayer player;

        @Override
        public IBinder onBind(Intent intent) {
                return null;
        }

        @Override
        public void onCreate() {
                Toast.makeText(this, "My Service Created", Toast.LENGTH_SHORT).show();

                player = MediaPlayer.create(this, R.raw.fearless_first);
                player.setLooping(true); // зацикливаем
        }


        public void onPause(){
                player.pause();
        }

        public void onGo(){
                player.start();
        }

        @Override
        public void onDestroy() {
                Toast.makeText(this, "My Service Stopped", Toast.LENGTH_SHORT).show();
                player.stop();
        }

        @Override
        public void onStart(Intent intent, int startid) {
                Toast.makeText(this, "My Service Started", Toast.LENGTH_SHORT).show();
                player.start();
        }


}
