package com.techno_twit.harshal.chitrakaar;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WhyDraw extends AppCompatActivity implements View.OnClickListener {

    TextView t ;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_draw);

        t = (TextView)findViewById(R.id.textView);
        Typeface custom = Typeface.createFromAsset(getAssets(),"fonts/blackjack.otf");
        t.setTypeface(custom);

        b =(Button)findViewById(R.id.button);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(WhyDraw.this , Choose.class);
        startActivity(i);

    }
}
