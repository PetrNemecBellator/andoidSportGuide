package com.example.sportguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    /*
    * onCreate method, starting activity categories layout
    * again adding the backward button in title bar
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(com.example.sportguide.R.layout.activity_main);
    }

    /*
    * Same method like in register activity, calls when creates backward button
    * */
    @Override
    public boolean onOptionsItemSelected(MenuItem menu){
        switch(menu.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){return true;}

    public void onInspirationClick(View view){
        Intent intent = new Intent(getApplicationContext(), Inspirationpage.class);
        startActivity(intent);
    }

    public void onRulesClick(View view) {
        Intent intent = new Intent(this, Rules.class);
        intent.putExtra("flag", "categories");
        startActivity(intent);
    }
    // These activities have to be made

    public void onPedometerClick(View view) {
        Intent intent = new Intent(this, de.j4velin.pedometer.ui.Activity_Main.class);
        startActivity(intent);
    }

    public void onBMIClick(View view) {
        Intent intent = new Intent(this, BMI.class);
        startActivity(intent);
    }
}
