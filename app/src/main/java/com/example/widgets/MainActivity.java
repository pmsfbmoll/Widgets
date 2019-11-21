package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    protected Button b;
    protected ImageButton menu;
    protected MediaPlayer click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        menu= (ImageButton) findViewById(R.id.imageButton);

    }

    public void showTime(View view) {
        Date currentTime = Calendar.getInstance().getTime();
        b.setText(currentTime.toString());
    }

    public void gotoMenu(View view) {
        click = MediaPlayer.create(this, R.raw.imp);
        click.start();
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
