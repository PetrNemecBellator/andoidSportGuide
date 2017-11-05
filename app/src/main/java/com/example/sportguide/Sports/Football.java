package com.example.sportguide.Sports;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.sportguide.R;

public class Football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
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
