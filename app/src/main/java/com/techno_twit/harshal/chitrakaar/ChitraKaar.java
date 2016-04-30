package com.techno_twit.harshal.chitrakaar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ChitraKaar extends AppCompatActivity {

    Thread t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitra_kaar);

            t = new Thread(){
                public void run(){
                    try{
                        Thread.sleep(3000);
                        Intent i = new Intent(ChitraKaar.this,Login.class);
                        startActivity(i);
                    }catch(Exception ee){}

                }
            };
            t.start();
        }
}
