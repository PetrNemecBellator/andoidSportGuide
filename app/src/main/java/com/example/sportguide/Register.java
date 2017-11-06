package com.example.sportguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.sportguide.Categories;

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
    * onOptionsItemSelected(), this method is there to set where the backward button should transfer,
    * in this case it transfer to the home page (main activity)
    * */
    public boolean onOptionsItemSelected(MenuItem menu){
        switch(menu.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menu);
    }
    /*
    * This is there just to set true after menu is creating the backward button.
    * to set visible.
    * */
    public boolean onCreateOptionsMenu(Menu menu){
        return true;
    }
    /*
    * onLoginClick is called after the login button is clicked
    * starting categories activity
    * */
    public void onRegisterClick(View view){
        Intent categories = new Intent(this, Categories.class);
        startActivity(categories);
    }
}
