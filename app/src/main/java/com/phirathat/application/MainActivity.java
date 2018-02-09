package com.phirathat.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tvans;
    private EditText edt1;
    private EditText edt2;
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        tvans = findViewById(R.id.tvans);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

    }

    public void cTof (View view) {
        // tvans.setText(edt1.getText());
        double c2f = ((Integer.parseInt(edt1.getText().toString()) *1.8)+32);
        tvans.setText(""+c2f);
    }

    public void fToc (View view) {
        // tvans.setText(edt2.getText());
        double f2c = ((9/5)*(Integer.parseInt(edt2.getText().toString()))+32);
        tvans.setText(""+f2c);
    }

}




