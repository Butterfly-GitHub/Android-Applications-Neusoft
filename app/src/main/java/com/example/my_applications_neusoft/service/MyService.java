package com.example.my_applications_neusoft.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.TextView;

public class MyService extends Service {
    private TextView textView4;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        Log.i("LOG", "Here is the IBinder in MyService");
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("LOG", "Here is the onCreate in MyService");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("LOG", "Here is the onStartCommand in MyService");

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("LOG", "Here is the onDestroy in MyService");

    }
}
