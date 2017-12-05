package com.example.suganraj.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int[] arr = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById((R.id.imageLeft));
        final ImageView rightDice = findViewById(R.id.imageRight);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("buttonmsg","button tapped");
                Random random = new Random();
                int randomNumber = random.nextInt(6);
                Log.i("dicee","random number is: "+randomNumber);
                leftDice.setImageResource(arr[randomNumber]);
                randomNumber = random.nextInt(6);
                rightDice.setImageResource(arr[randomNumber]);
            }
        });
    }
}
