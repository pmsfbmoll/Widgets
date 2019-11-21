package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Radio extends AppCompatActivity {
    protected Button menu;
    protected TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        menu=(Button) findViewById(R.id.button9);
        text=(TextView) findViewById(R.id.textView);
    }

    public void gotoMenu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void setGreen(View view){
        text.setBackgroundColor(Color.GREEN);
    }
    public void setRed(View view){
        text.setBackgroundColor(Color.RED);
    }
    public void setBlue(View view){
        text.setBackgroundColor(Color.BLUE);
    }
}
