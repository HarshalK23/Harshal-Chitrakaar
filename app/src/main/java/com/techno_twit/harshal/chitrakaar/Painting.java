package com.techno_twit.harshal.chitrakaar;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Painting extends AppCompatActivity {

    TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);

        t = (TextView)findViewById(R.id.textView);
        Typeface custom = Typeface.createFromAsset(getAssets(),"fonts/brankovic.ttf");
        t.setTypeface(custom);

    }
}
