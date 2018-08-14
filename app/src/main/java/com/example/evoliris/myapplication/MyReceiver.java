package com.example.evoliris.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED) {

            Toast.makeText(context, "Airplace Mode changed!", Toast.LENGTH_SHORT).show();
        }
    }

}
