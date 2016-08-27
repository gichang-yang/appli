package org.androidname.archo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void py_study(View V){
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/folderview?id=0BwYSOi7twqKIVEUzRlQwMFc3T2s&usp=sharing"));
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("address",0);
        Toast.makeText(getApplicationContext(),"자료로 이동합니다.",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void j_study(View V){
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("address",1);
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/folderview?id=0BwYSOi7twqKIZjEtUU41LXd4RGs&usp=sharing"));
        Toast.makeText(getApplicationContext(),"자료로 이동합니다.",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void al_study(View V){
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("address",2);
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/folderview?id=0BwYSOi7twqKISW9kNEtheWZOcVE&usp=sharing"));
        Toast.makeText(getApplicationContext(),"자료로 이동합니다.",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void usaint(View V){
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("address",3);
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://saint.ssu.ac.kr"));
        Toast.makeText(getApplicationContext(),"사이트로 이동합니다.",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void ssu_main(View V){
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("address",4);
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ssu.ac.kr"));
        Toast.makeText(getApplicationContext(),"사이트로 이동합니다.",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void ssu_sw(View V){
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("address",5);
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.ssu.ac.kr/"));
        Toast.makeText(getApplicationContext(),"사이트로 이동합니다.",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
