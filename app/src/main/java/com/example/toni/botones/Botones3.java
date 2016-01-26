package com.example.toni.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Botones3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones3);
        Log.v("Estoy", "Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Estoy", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Estoy", "Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Estoy", "Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Estoy", "Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Estoy", "Pause");
    }
}
