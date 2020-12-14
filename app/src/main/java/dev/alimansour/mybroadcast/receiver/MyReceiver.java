package dev.alimansour.mybroadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String fullName = bundle.getString("FullName");
            int myData = bundle.getInt("MyData");
            Toast.makeText(context, "My Broadcast => Full name: " + fullName + ", Data: " + myData, Toast.LENGTH_LONG).show();
        }
    }
}