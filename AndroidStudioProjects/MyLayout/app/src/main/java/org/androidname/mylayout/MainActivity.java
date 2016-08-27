package org.androidname.mylayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Toast.makeText(getApplicationContext(),"중지버튼 눌림",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void click1(View V){
        Toast.makeText(getApplicationContext(),"시작버튼 눌림",Toast.LENGTH_SHORT).show();

    }
}
