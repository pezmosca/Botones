package com.example.toni.botones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Botones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);
        Intent intent = new Intent(getApplicationContext(), Botones2.class);
        startActivity(intent);
    }
}
