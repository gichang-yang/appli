package org.androidname.forssu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    public void onClickedButton1(View v){
         try {
             finish();

         } catch(Exception e) {
             Toast.makeText(getApplicationContext(), "ERROR!!", Toast.LENGTH_LONG).show();
         }
    }

}
