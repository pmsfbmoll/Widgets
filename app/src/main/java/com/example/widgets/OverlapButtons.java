package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OverlapButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overlap_buttons);
    }
    public void gotoMenu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
