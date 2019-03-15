package com.mrenesinau.tabhost;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView satu, dua, tiga, empat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        satu = (TextView) findViewById(R.id.Tv1);
        dua = (TextView) findViewById(R.id.Tv2);
        tiga = (TextView) findViewById(R.id.Tv3);
        empat = (TextView) findViewById(R.id.Tv4);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.yelow:
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                satu.setTextColor(Color.BLACK);
                dua.setTextColor(Color.BLACK);
                tiga.setTextColor(Color.BLACK);
                empat.setTextColor(Color.BLACK);
                return true;

            case R.id.blue:
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                satu.setTextColor(Color.WHITE);
                dua.setTextColor(Color.WHITE);
                tiga.setTextColor(Color.WHITE);
                empat.setTextColor(Color.WHITE);
                return true;

            case R.id.white:
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                satu.setTextColor(Color.BLACK);
                dua.setTextColor(Color.BLACK);
                tiga.setTextColor(Color.BLACK);
                empat.setTextColor(Color.BLACK);
                return true;

            case R.id.btn :
                findViewById(R.id.btn).setVisibility(ImageButton.INVISIBLE);
                return true;

            case R.id.btnOk:
                findViewById(R.id.btnOk).setVisibility(ImageButton.VISIBLE);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
