package com.IndustrialMaster.TemperatureConverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View v){
        EditText et1 = findViewById(R.id.editText);
        EditText et2 = findViewById(R.id.editText2);
        String text = et1.getText().toString();
        double celcius = Double.parseDouble(text);
        double farenheit = ((celcius*(9.0/5.0))+32.0);
        et2.setText(String.valueOf(farenheit));

    }
}
