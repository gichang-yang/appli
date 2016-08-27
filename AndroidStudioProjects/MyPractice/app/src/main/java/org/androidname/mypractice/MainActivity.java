package org.androidname.mypractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    TextView text2;
    boolean buto=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView) findViewById(R.id.textView);
        text2=(TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                       if(buto){
                           text1.setVisibility(View.GONE);
                           text2.setVisibility(View.VISIBLE);

                       }

                        else{
                           text1.setVisibility(View.VISIBLE);
                           text2.setVisibility(View.GONE);
                       }
                        buto=!buto;
            }
        });
    }
}
