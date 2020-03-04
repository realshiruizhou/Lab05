package com.zhoushirui.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    int create, start, resume, pause, stop, restart, destroy;
    TextView onCreate, onStart, onResume, onPause, onStop, onRestart, onDestroy;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCreate = findViewById(R.id.cr);
        onStart = findViewById(R.id.st);
        onResume = findViewById(R.id.rs);
        onPause = findViewById(R.id.ps);
        onStop = findViewById(R.id.sp);
        onRestart = findViewById(R.id.rt);
        onDestroy = findViewById(R.id.dy);
        sharedPreferences = getSharedPreferences("Activity", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        create++;
        int temp = sharedPreferences.getInt("create", 0) + 1;
        editor.putInt("create", temp);
        editor.apply();
        onCreate.setText("onCreate(): " + create + ", since installation: " + temp);
        onPause.setText("onPause(): " + pause + ", since installation: " + sharedPreferences.getInt("pause", 0));
        onStop.setText("onStop(): " + stop + ", since installation: " + sharedPreferences.getInt("stop", 0));
        onRestart.setText("onRestart(): " + restart + ", since installation: " + sharedPreferences.getInt("restart", 0));
        onDestroy.setText("onDestroy(): " + destroy + ", since installation: " + sharedPreferences.getInt("destroy", 0));
    }

    @Override
    protected void onStart(){
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        super.onStart();
        start++;
        int temp = sharedPreferences.getInt("start", 0) + 1;
        editor.putInt("start", temp);
        editor.apply();
        onStart.setText("onStart(): " + start + ", since installation: " + temp);
    }

    @Override
    protected void onResume(){
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        super.onResume();
        resume++;
        int temp = sharedPreferences.getInt("resume", 0) + 1;
        editor.putInt("resume", temp);
        editor.apply();
        onResume.setText("onResume(): " + resume + ", since installation: " + temp);
    }

    @Override
    protected void onPause(){
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        super.onPause();
        pause++;
        int temp = sharedPreferences.getInt("pause", 0) + 1;
        editor.putInt("pause", temp);
        editor.apply();
        onPause.setText("onPause(): " + pause + ", since installation: " + temp);
    }

    @Override
    protected void onStop(){
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        super.onStop();
        stop++;
        int temp = sharedPreferences.getInt("stop", 0) + 1;
        editor.putInt("stop", temp);
        editor.apply();
        onStop.setText("onStop(): " + stop + ", since installation: " + temp);
    }

    @Override
    protected void onRestart(){
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        super.onRestart();
        restart++;
        int temp = sharedPreferences.getInt("restart", 0) + 1;
        editor.putInt("restart", temp);
        editor.apply();
        onRestart.setText("onRestart(): " + restart + ", since installation: " + temp);
    }

    @Override
    protected void onDestroy(){
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        destroy++;
        onDestroy.setText("onDestroy(): " + destroy);
        int temp = sharedPreferences.getInt("destroy", 0) + 1;
        editor.putInt("destroy", temp);
        editor.apply();
        onDestroy.setText("onDestroy(): " + destroy + ", since installation: " + temp);
        super.onDestroy();
    }
}
