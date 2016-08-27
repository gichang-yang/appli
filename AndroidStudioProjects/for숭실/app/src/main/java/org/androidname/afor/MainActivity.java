package org.androidname.afor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void onClickedButton1(View v){
       // try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://saint.ssu.ac.kr"));
            startActivity(intent);
       // } catch(Exception e){
       //     Toast.makeText(getApplicationContext(),"ERROR!!",Toast.LENGTH_LONG).show();
        }



    public void onClickedButton2(View v){
        //try{
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-4604-5754"));
            startActivity(intent);
       // } catch(Exception e){
        //    Toast.makeText(getApplicationContext(),"ERROR!!",Toast.LENGTH_LONG).show();
       // }
    }
}
