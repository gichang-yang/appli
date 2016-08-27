package org.androidname.myactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        if(intent != null){
            String title = intent.getStringExtra("title");
            Toast.makeText(getApplicationContext(),"전달받은 값:"+ title,Toast.LENGTH_LONG).show();
        }
    }

    public void click1(View v){

        Intent in = new Intent();
        in.putExtra("name","하;");
        setResult(RESULT_OK,in);
        finish();
    }
}
