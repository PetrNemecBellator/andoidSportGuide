package com.example.sportguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class LionelMessi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lionel_messi);
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
}
