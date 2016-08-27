package org.androidname.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    public void onCreate() {
        Log.d(TAG,"oncreate 호출");

        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"destroy 호출");
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"onstartcommend 호출");
        if(intent !=null){
            String command =intent.getStringExtra("command");
            if(command != null){
                if(command.equals("start")){
                    printThread thread = new printThread();
                    try {
                        Thread.sleep(500);
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                    thread.start();
                }
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    class printThread extends Thread{
        public void run(){
            for(int i=0;i<100;i++){
                Log.d(TAG,"#"+i+"서비스에서 반복");
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
