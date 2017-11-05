package com.example.sportguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.sportguide.Sports.Basketball;
import com.example.sportguide.Sports.Cricket;
import com.example.sportguide.Sports.Football;
import com.example.sportguide.Sports.Running;
import com.example.sportguide.Sports.VolleyBall;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // creates backward arrow button
    }

    /* Backward arrow button is working with this*/
    @Override
    public boolean onOptionsItemSelected(MenuItem menu){
        switch(menu.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menu);
    }

    public void onFootballClick(View view) {
        Intent gettingIntent = getIntent();
        String checkFlag = gettingIntent.getStringExtra("flag");
        if (checkFlag.equals("categories")) {
            Intent intent = new Intent(this, Football.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, SuccessfulFootballPlayer.class);
            startActivity(intent);
        }
    }

    public void onBasketballClick(View view) {
        Intent gettingIntent = getIntent();
        String checkFlag = gettingIntent.getStringExtra("flag");
        if (checkFlag.equals("categories")) {
            Intent intent = new Intent(this, Basketball.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, SuccessfulBasketballPlayer.class);
            startActivity(intent);
        }
    }

    public void onVolleyballClick(View view) {
        Intent gettingIntent = getIntent();
        String checkFlag = gettingIntent.getStringExtra("flag");
        if (checkFlag.equals("categories")) {
            Intent intent = new Intent(this, VolleyBall.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, SuccessfulVolleyballPlayer.class);
            startActivity(intent);
        }
    }

    public void onCricketClick(View view) {
        Intent gettingIntent = getIntent();
        String checkFlag = gettingIntent.getStringExtra("flag");
        if (checkFlag.equals("categories")) {
            Intent intent = new Intent(this, Cricket.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, SuccessfulCricketPlayer.class);
            startActivity(intent);
        }
    }

    public void onRunningClick(View view) {
        Intent gettingIntent = getIntent();
        String checkFlag = gettingIntent.getStringExtra("flag");
        if (checkFlag.equals("categories")) {
            Intent intent = new Intent(this, Running.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, SuccessfulRunningPlayer.class);
            startActivity(intent);
        }
    }

}
