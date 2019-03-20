package com.example.myapplication02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Integer[] blue;
    private Integer[] green;
    private Integer[] red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blue = new Integer[]{R.color.color3,R.color.color31,R.color.color32};
        green = new Integer[]{R.color.color1,R.color.color11,R.color.color12};
        red = new Integer[]{R.color.color2,R.color.color21,R.color.color22};

        findViewById(R.id.color1).setOnClickListener(v->{
            int ram = (int)(Math.random()*2);
            v.setBackgroundColor(green[ram]);
        });
        findViewById(R.id.color2).setOnClickListener(v->{
            int ram = (int)(Math.random()*2);
            v.setBackgroundColor(red[ram]);
        });
        findViewById(R.id.color3).setOnClickListener(v->{
            int ram = (int)(Math.random()*2);
            v.setBackgroundColor(blue[ram]);
        });

    }
}
