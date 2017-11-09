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
    float height = 1.0f;
    float weight = 0.0f;

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
                    height = Float.parseFloat(txtV.getText().toString());
                }
                catch (Exception e){
                }
                txtV = findViewById(R.id.weightInput);
                try {
                    weight = Float.parseFloat(txtV.getText().toString());
                }
                catch (Exception e){
                }
                if (height < 10) {
                    result.setText(Float.toString(weight/(height*height)));
                }
                else {
                    result.setText(Float.toString(weight/((height/100)*(height/100))));
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
