package com.example.plugin_code;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import timber.log.Timber;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Log
        Timber.plant(new Timber.DebugTree());
    }
}
