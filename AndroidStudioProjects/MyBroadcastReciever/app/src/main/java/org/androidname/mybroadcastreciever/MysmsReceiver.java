package org.androidname.mybroadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MysmsReceiver extends BroadcastReceiver {
    public MysmsReceiver() {

    }

    private static final String TAG = "MysmsReciever";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TAG","onRecieve() 호출 ");

        Intent Myintent  = new Intent(context,MainActivity.class);
        Myintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(Myintent);

    }
}
