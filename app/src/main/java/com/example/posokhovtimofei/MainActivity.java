package com.example.posokhovtimofei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("KKK", "START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("KEY", "RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("KEY", "PAUSE");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("KEY", "RESTART");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("KEY", "STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("KKK", "DESTROY");
    }
}

