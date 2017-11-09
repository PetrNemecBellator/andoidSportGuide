package com.example.sportguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    Button calculateButton;
    TextView result;
    float height = 1;
    float weight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                result = findViewById(R.id.textViewBMI);
                TextView txtV = findViewById(R.id.heightInput);
                try {
                    height = Float.valueOf(txtV.getText().toString());
                }
                catch (Exception e){
                }
                txtV = findViewById(R.id.weightInput);
                try {
                    weight = Float.valueOf(txtV.getText().toString());
                }
                catch (Exception e){
                }
                if (height < 10) {
                    result.setText(Float.toString((float) weight/height));
                }
                else {
                    result.setText(Float.toString((float) weight*100/height));
                }
            }
        });
    }

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

}
