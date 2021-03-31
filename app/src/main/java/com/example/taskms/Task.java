package com.example.taskms;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class Task extends Application {

    
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public static Context getApplicationInstance() {
        return context;
    }
}
