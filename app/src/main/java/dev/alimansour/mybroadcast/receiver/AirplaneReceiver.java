package dev.alimansour.mybroadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class AirplaneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            boolean air = bundle.getBoolean("state");
            if (air) {
                Toast.makeText(context, "Airplane mode is active", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(context, "Airplane mode is Inactive", Toast.LENGTH_LONG).show();
            }
        }
    }
}