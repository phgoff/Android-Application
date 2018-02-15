package com.phirathat.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tvans;
    private EditText edt1;
    private EditText edt2;
    private Button btn1;
    private Button btn2;
    private double c_cal,f_cal;
    private String errC,errF;
    private static DecimalFormat dec2 = new DecimalFormat(".##");

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
        errC = edt1.getText().toString ();
        if (TextUtils.isEmpty (errC)) {
            edt1.setError ("Please Enter Number");
        }
        else {
            c_cal = Double.parseDouble(String.valueOf(edt1.getText()));
            c_cal = (c_cal*1.8)+32;
            tvans.setText (dec2.format(c_cal)+"°F");

    }
    }

    public void fToc (View view) {

        errF = edt2.getText().toString ();
        if (TextUtils.isEmpty (errF)) {
            edt2.setError ("Please Enter Number");
        }
        else {
            f_cal = Double.parseDouble(String.valueOf(edt2.getText()));
            f_cal = (f_cal-32)/1.8;
            tvans.setText(dec2.format(f_cal) + °C");
        }
    }


}




