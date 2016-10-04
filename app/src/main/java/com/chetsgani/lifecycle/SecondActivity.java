package com.chetsgani.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LogStatus("onCreate", "2");
    }

    public void LogStatus(String msg, String src) {
        Log.d("debug", msg+" Activity "+src);
    }

    @Override
    protected void onStart() {
        LogStatus("onStart", "2");
        super.onStart();
    }

    @Override
    protected void onResume() {
        LogStatus("onResume", "2");
        super.onResume();
    }

    @Override
    protected void onPause() {
        LogStatus("onPause", "2");
        super.onPause();
    }

    @Override
    protected void onStop() {
        LogStatus("onStop", "2");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        LogStatus("onDestroy", "2");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        LogStatus("onSaveInstanceState", "2");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        LogStatus("onRestoreInstanceState", "2");
        super.onRestoreInstanceState(savedInstanceState);
    }
}