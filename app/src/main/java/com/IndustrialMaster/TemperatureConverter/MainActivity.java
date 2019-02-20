package com.IndustrialMaster.TemperatureConverter;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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
        if(!text.isEmpty()){
            double celcius = Double.parseDouble(text);
            double farenheit = ((celcius*(9.0/5.0))+32.0);
            et2.setText(String.valueOf(farenheit));
            et2.setTextColor(this.getResources().getColor(R.color.colorgreen));
            et1.setTextColor(this.getResources().getColor(R.color.colorPrimary));
            et2.setTypeface(et2.getTypeface(), Typeface.BOLD);
            et1.setTypeface(null, Typeface.NORMAL);
        }


    }

    public void convert2(View v){
        EditText et1 = findViewById(R.id.editText);
        EditText et2 = findViewById(R.id.editText2);
        String text = et2.getText().toString();
        if(!text.isEmpty()){
            double farenheit = Double.parseDouble(text);
            double celcius  = (farenheit-32)*(5.0/9.0);
            et1.setText(String.valueOf(celcius));
            et1.setTextColor(this.getResources().getColor(R.color.colorgreen));
            et2.setTextColor(this.getResources().getColor(R.color.colorPrimary));
            et1.setTypeface(et1.getTypeface(), Typeface.BOLD);
            et2.setTypeface(null, Typeface.NORMAL);

        }

    }
}
