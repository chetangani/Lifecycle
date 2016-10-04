package com.chetsgani.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    MainActivity main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        main = new MainActivity();

        main.LogStatus("onCreate", "2");
    }

    @Override
    protected void onStart() {
        main.LogStatus("onStart", "2");
        super.onStart();
    }

    @Override
    protected void onResume() {
        main.LogStatus("onResume", "2");
        super.onResume();
    }

    @Override
    protected void onPause() {
        main.LogStatus("onPause", "2");
        super.onPause();
    }

    @Override
    protected void onStop() {
        main.LogStatus("onStop", "2");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        main.LogStatus("onDestroy", "2");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        main.LogStatus("onSaveInstanceState", "2");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        main.LogStatus("onRestoreInstanceState", "2");
        super.onRestoreInstanceState(savedInstanceState);
    }
}