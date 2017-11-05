package com.example.sportguide.Sports;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.sportguide.R;

public class Running extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);
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
