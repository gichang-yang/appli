package org.androidname.mydialogue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("alert");
        builder.setMessage("want to exit??");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"예 버튼",Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialoge = builder.create();
        dialoge.show();

    }
}
