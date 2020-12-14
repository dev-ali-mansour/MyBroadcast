package dev.alimansour.mybroadcast;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import dev.alimansour.mybroadcast.receiver.AirplaneReceiver;
import dev.alimansour.mybroadcast.receiver.MyReceiver;

public class MainActivity extends AppCompatActivity {
    private AirplaneReceiver airplaneReceiver;
    private MyReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        airplaneReceiver = new AirplaneReceiver();
        registerReceiver(airplaneReceiver, filter);

        IntentFilter filter1 = new IntentFilter("dev.alimansour.mybroadcastsender");
        myReceiver = new MyReceiver();
        registerReceiver(myReceiver, filter1);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(airplaneReceiver);
        unregisterReceiver(myReceiver);
    }
}