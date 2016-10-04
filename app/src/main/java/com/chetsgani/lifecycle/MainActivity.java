package com.chetsgani.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogStatus("onCreate", "1");

        Button nextbtn = (Button) findViewById(R.id.button);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void LogStatus(String msg, String src) {
        Log.d("debug", msg+" Activity "+src);
    }

    @Override
    protected void onStart() {
        LogStatus("onStart", "1");
        super.onStart();
    }

    @Override
    protected void onResume() {
        LogStatus("onResume", "1");
        super.onResume();
    }

    @Override
    protected void onPause() {
        LogStatus("onPause", "1");
        super.onPause();
    }

    @Override
    protected void onStop() {
        LogStatus("onStop", "1");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        LogStatus("onDestroy", "1");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        LogStatus("onSaveInstanceState", "1");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        LogStatus("onRestoreInstanceState", "1");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
