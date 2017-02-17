package com.example.admin.customdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
    private Button buttonClick;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick = (Button) findViewById(R.id.buttonClick);

        // add listener to button
        buttonClick.setOnClickListener(new OnClickListener() {


            @Override

            public void onClick(View arg0) {

                Dialog dialog = new Dialog(MainActivity.this);

            //    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

                dialog.setContentView(R.layout.dialog);

                dialog.setTitle("----This is just a Waste----");


                dialog.show();


            }
        });
    }
}
