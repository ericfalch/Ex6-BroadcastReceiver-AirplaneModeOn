package com.example.evoliris.myapplication;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BroadcastReceiver bdcast = new MyReceiver();
        IntentFilter intfltr = new IntentFilter();
        intfltr.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(bdcast, intfltr);
    }
}
