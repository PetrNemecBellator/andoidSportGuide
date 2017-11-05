package com.example.sportguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class SuccessfulFootballPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_football_player);
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

    public void onClickMessi(View view) {
        Intent intent = new Intent(this, LionelMessi.class);
        startActivity(intent);
    }
}
