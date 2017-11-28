package com.example.suganraj.soundkit;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    public void playMusic(View view){

        int id = view.getId();
        //Log.i("ID","ID is "+id);
        String nameID;
        nameID = view.getResources().getResourceEntryName(id);
        //Log.i("nameID","nameID is "+nameID); nameID->identifier
        int myMusic = getResources().getIdentifier(nameID,"raw","com.example.suganraj.soundkit");
        mediaPlayer = MediaPlayer.create(this,myMusic);
        mediaPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
