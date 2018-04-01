package com.example.kyky.rizkiananda_1202150379_modul6;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by KYKY on 4/1/2018.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if(FirebaseApp.getApps(this).isEmpty())
        {

            FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        }

    }
}