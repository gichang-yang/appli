package org.androidname.mypractice7_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    String recieve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = new Intent();
        intent= getIntent();
        recieve = (String) intent.getStringExtra("title");
        Toast.makeText(getApplicationContext(),recieve, Toast.LENGTH_LONG).show();
    }

    public void button2(View v){
        LinearLayout ly = (LinearLayout) findViewById(R.id.laysub);
        LayoutInflater LI = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        LI.inflate(R.layout.layout2,ly,true);

        Button button = (Button) ly.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent();
                in.putExtra("title","hard");
                setResult(RESULT_OK,in);
                finish();
            }
        });

    }


}
