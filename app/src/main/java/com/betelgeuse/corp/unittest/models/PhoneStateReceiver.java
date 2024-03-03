package com.betelgeuse.corp.unittest.models;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class PhoneStateReceiver extends BroadcastReceiver {
    public PhoneStateReceiver() {
        Log.d("PhoneCallReceiver", "КОНСТРУКТОР ");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
//        String State = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
//        if(State != null && State.equals(TelephonyManager.EXTRA_STATE_RINGING)){
//            Toast.makeText(context, "ZVONOK", Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(context, "ZVONOK VELSE", Toast.LENGTH_SHORT).show();
//        }
        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        String incomingNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);

        Log.d("PhoneCallReceiver", "Incoming call from: " + incomingNumber);

        Toast.makeText(context, "НЕ ИФ", Toast.LENGTH_SHORT).show();
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(state)) {
            // Здесь обрабатывается входящий звонок
            Log.d("PhoneCallReceiver", "Incoming call from: " + incomingNumber);
            Toast.makeText(context, "ZVONOK", Toast.LENGTH_SHORT).show();
        } else if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(state)) {
            // Здесь обрабатывается состояние "соединено" (телефон в режиме звонка)
            Toast.makeText(context, "ZVONOK VELSE", Toast.LENGTH_SHORT).show();
        } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(state)) {
            Toast.makeText(context, "ZVONOK VELSE", Toast.LENGTH_SHORT).show();
            // Здесь обрабатывается состояние "в ожидании" (звонок завершен)
        }
    }
}
