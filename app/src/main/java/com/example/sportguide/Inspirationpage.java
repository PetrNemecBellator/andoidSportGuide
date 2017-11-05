package com.example.sportguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Inspirationpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspirationpage);
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

    public void onMusicClick(View view) {
        String id = "https://www.youtube.com/watch?v=c_maWh3ONfI";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + id));
        startActivity(intent);
    }


    public void onStoriesClick(View view) {
        Intent intent = new Intent(this, Rules.class);
        intent.putExtra("flag", "Inspiration");
        startActivity(intent);
    }
}
