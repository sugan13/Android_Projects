package com.example.suganraj.snakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] arr = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six};

    public void buttonTapped(View view){
        Log.i("button","ButtonTapped");
        Random ran = new Random();
        int randomNumber = ran.nextInt(6);
        Log.i("Random","randomNumber is: "+randomNumber);
        ImageView dice = findViewById(R.id.dice);
        dice.setImageResource(arr[randomNumber]);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
