package org.androidname.mypractice7_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       if(data != null){
           String massage = (String) data.getStringExtra("title");
           Toast.makeText(getBaseContext(),massage,Toast.LENGTH_LONG).show();
       }

        super.onActivityResult(requestCode, resultCode, data);
    }

    public void button1(View v){
        LinearLayout LY = (LinearLayout) findViewById(R.id.lay1);
        LayoutInflater inf = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        inf.inflate(R.layout.layout,LY,true);

        Button but = (Button) LY.findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),SubActivity.class);
                intent.putExtra("title","메인으로부터");
                startActivityForResult(intent,1002);


            }
        });
    }
}
