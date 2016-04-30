package com.techno_twit.harshal.chitrakaar;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Choose extends ListActivity{

    String occ[]={"Drawing","Painting","Sketching"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        System.out.println("2");

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, occ);
        System.out.println("3");

        setListAdapter(ad);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);

        Toast.makeText(this, occ[position], Toast.LENGTH_SHORT).show();
        try
        {    		System.out.println("4");

            String str = "com.techno_twit.harshal.chitrakaar."+occ[position];

            Class<?> c = Class.forName(str);
            Intent i =new Intent(Choose.this,c);
            startActivity(i);
            System.out.println("5");

        } catch(Exception ee) { System.out.println("error"+ ee.getMessage());
            // Toast.makeText(this,"ERROR"+ee.getMessage() ,Toast.LENGTH_SHORT ).show();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_chitra_kaar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getTitle().equals("AboutMe"))
        {   Intent in = new Intent(Choose.this,AboutMe.class);
            startActivity(in);
            return true;}
        else if(item.getTitle().equals("Practice"))
        {   Intent in = new Intent(Choose.this, MainActivity.class);
            startActivity(in);
            return true;}

        else if(item.getTitle().equals("RateApp"))
        {   Intent in = new Intent(Choose.this, RateApp.class);
            startActivity(in);
            return true;}
        return super.onOptionsItemSelected(item);
    }


}
