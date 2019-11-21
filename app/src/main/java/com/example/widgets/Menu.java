package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    protected Button b1;
    protected Button b2;
    protected Button b3;
    protected Button b4;
    protected Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void gotoRadio(View view) {
        Intent intent = new Intent(this, Radio.class);
        startActivity(intent);
    }

    public void gotoButtons(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void gotoURL(View view) {
        Intent intent = new Intent(this, URL.class);
        startActivity(intent);
    }

    public void gotoOverlap(View view) {
        Intent intent = new Intent(this, OverlapButtons.class);
        startActivity(intent);
    }

    public void gotoScroll(View view) {
        Intent intent = new Intent(this, ScrollView.class);
        startActivity(intent);
    }
}
