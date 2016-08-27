package org.androidname.mypractice7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent  intent = getIntent();

        if(intent != null){
           String recieve = intent.getStringExtra("title");
            Toast.makeText(getApplicationContext(),recieve,Toast.LENGTH_LONG).show();
        }
    }


    public void click1(View v){
        Intent intent = new Intent();
        intent.putExtra("title","다시 메인페이지");
        setResult(RESULT_OK,intent);
        finish();
    }





}
