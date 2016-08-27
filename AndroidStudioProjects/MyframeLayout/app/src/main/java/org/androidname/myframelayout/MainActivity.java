package org.androidname.myframelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppActivity {
    ImageView iv, iv2;

    boolean selected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView) findViewById(R.id.imageView);
        iv2=(ImageView) findViewById(R.id.imageView2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    iv.setVisibility(View.GONE);
                    iv2.setVisibility(View.VISIBLE);
                }

                else{
                    iv2.setVisibility(View.GONE);
                    iv.setVisibility(View.VISIBLE);
                }

                selected = !selected;
            }
        });
    }
}
