package com.lab.pdoffice.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.tv);
        tv1=findViewById(R.id.tv2);

        Intent i=getIntent();
        String s=i.getStringExtra("n");
        String s2=i.getStringExtra("num");
        tv.setText(s);
        tv1.setText(s2);

    }
}
