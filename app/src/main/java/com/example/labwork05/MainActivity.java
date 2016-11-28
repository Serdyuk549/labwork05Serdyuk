package com.example.labwork05;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Maksym;
    Button HoldMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        Maksym = (TextView) findViewById(R.id.textView1);
        HoldMe = (Button) findViewById(R.id.button1);
        View.OnClickListener obrabotka = new View.OnClickListener() {
            public void onClick(View v) {
                Maksym.setText("Кнопка была нажата!");
            }
        };
        HoldMe.setOnClickListener(obrabotka);
        super.onCreate(savedInstanceState);
    }
}
