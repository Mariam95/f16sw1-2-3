package com.lab.pdoffice.intentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText et1,et2;
   // Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        et1=findViewById(R.id.name);
        et2=findViewById(R.id.num);
       // b1=findViewById(R.id.button);
        //b2=findViewById(R.id.button2);


    }

    public void dialbtnclick(View v){

        String number=et2.getText().toString();
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+number));
        startActivity(i);
    }


    public void showbtnclick(View v){

        String name=et1.getText().toString();
        String number=et2.getText().toString();
        Intent i=new Intent(FirstActivity.this,SecondActivity.class);
        i.putExtra("n",name);
        i.putExtra("num",number);
        startActivity(i);
    }

}
