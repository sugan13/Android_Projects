package com.example.suganraj.bulb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void blueTapped(View view) {
        ImageView b= findViewById(R.id.bluebulb);
        ImageView g=findViewById(R.id.greenbulb);
        b.animate().alpha(1).setDuration(1000);
        g.animate().alpha(0).setDuration(1000);

    }
    public void greenTapped(View view)
    {
        ImageView c= findViewById(R.id.greenbulb);
        ImageView b=findViewById(R.id.bluebulb);
        c.animate().alpha(1).setDuration(1000);
        b.animate().alpha(0).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}