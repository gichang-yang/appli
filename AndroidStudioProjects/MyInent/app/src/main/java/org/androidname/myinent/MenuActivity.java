package org.androidname.myinent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = (Intent) getIntent();
        if(intent!=null){
            String title = intent.getStringExtra("title");
            Person p1 = (Person) intent.getParcelableExtra("Person");
            Toast.makeText(getBaseContext(),p1.getName()+p1.getAge(),Toast.LENGTH_LONG).show();
        }
    }
}
