package org.androidname.mylifesycle;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate 호출 ",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(),"onStop 호출 ",Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"onDestroy 호출 ",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(),"onStart 호출 ",Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(),"onPause 호출 ",Toast.LENGTH_LONG).show();

        saveScore();
        super.onPause();
    }
    private void saveScore(){
        SharedPreferences pref = getSharedPreferences("gostop", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("score",10000);
        editor.commit();
    }
    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(),"onResume 호출 ",Toast.LENGTH_LONG).show();

        loadScore();

        super.onResume();
    }

    private void loadScore(){
        SharedPreferences pref = getSharedPreferences("gostop", Activity.MODE_PRIVATE);
       int score =  pref.getInt("score",0);
        Toast.makeText(getApplicationContext(),"얻어온 점수:"+score,Toast.LENGTH_LONG).show();
    }
}
