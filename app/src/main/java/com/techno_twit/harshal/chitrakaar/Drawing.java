package com.techno_twit.harshal.chitrakaar;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Drawing extends AppCompatActivity{


    TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

            t = (TextView)findViewById(R.id.textView);
            Typeface custom = Typeface.createFromAsset(getAssets(),"fonts/brankovic.ttf");
            t.setTypeface(custom);

        }

    }

