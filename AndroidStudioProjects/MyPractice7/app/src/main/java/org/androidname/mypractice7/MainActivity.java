package org.androidname.mypractice7;

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
        if(data!=null) {
            String recieve = data.getStringExtra("title");
            Toast.makeText(getApplicationContext(), recieve, Toast.LENGTH_LONG).show();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    Button clik2;
    public void click1(View V){
        LinearLayout lay=(LinearLayout) findViewById(R.id.lay);
        LayoutInflater inf = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        inf.inflate(R.layout.layout_linear,lay,true);


        clik2 = (Button) lay.findViewById(R.id.button2);

        clik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(getApplicationContext(),SubActivity.class);
                inten.putExtra("title","subpage");
                startActivityForResult(inten,1003);
            }
        });

    }


}
