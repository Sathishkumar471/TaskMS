package com.example.taskms.base;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import com.example.taskms.Task;


public class Globals {

    public static boolean checkNetworkConnection() {
        ConnectivityManager ConnectionManager = (ConnectivityManager) Task.getApplicationInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = ConnectionManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        } else {
            return false;
        }
    }

}
