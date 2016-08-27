package org.androidname.myinent;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final int REQ_MENU =1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){
        //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-4604-5754"));
        //startActivity(intent);

       // Intent intent = new Intent(getBaseContext(),MenuActivity.class);
       // startActivityForResult(intent,REQ_MENU);

        Intent intent = new Intent();
        ComponentName name = new ComponentName("org.androidname.myinent","org.androidname.myinent.MenuActivity");

        intent.setComponent(name);
        intent.putExtra("title","snsd");

        Person p1 = new Person("걸스데이",21);
        intent.putExtra("Person",p1);

        startActivityForResult(intent,REQ_MENU);
    }
}
