package com.example.sportguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Register extends AppCompatActivity{

    /**
     * onCreate - its called after the register button in main activity
     * is clicked, creating the new activity
     * getSupportActionBar() - setting the backward button on left top enabled
     */

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /*
    * onLoginClick is called after the login button is clicked
    * starting categories activity
    * */
    public void onRegisterClick(View view){
        Intent categories = new Intent(this, MainActivity.class);
        startActivity(categories);
    }
}
