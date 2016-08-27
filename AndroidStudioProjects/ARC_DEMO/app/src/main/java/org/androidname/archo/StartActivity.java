package org.androidname.archo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


    }

    public void nextpage(View V){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
       // Toast.makeText(getBaseContext(),"activity kill",Toast.LENGTH_LONG).show();
        finish();

    }
}
