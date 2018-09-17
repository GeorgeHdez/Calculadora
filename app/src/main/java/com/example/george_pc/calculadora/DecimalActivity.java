package com.example.george_pc.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.CharBuffer;

public class DecimalActivity extends AppCompatActivity {

    Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_c,b_p,b_pls,b_less,b_mul,b_div,b_bin;
    String cuenta = "";
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);

        b_0 = (Button)findViewById(R.id.button_0);
        b_1 = (Button)findViewById(R.id.button_1);
        b_2 = (Button)findViewById(R.id.button_2);
        b_3 = (Button)findViewById(R.id.button_3);
        b_4 = (Button)findViewById(R.id.button_4);
        b_5 = (Button)findViewById(R.id.button_5);
        b_6 = (Button)findViewById(R.id.button_6);
        b_7 = (Button)findViewById(R.id.button_7);
        b_8 = (Button)findViewById(R.id.button_8);
        b_9 = (Button)findViewById(R.id.button_9);
        b_c = (Button)findViewById(R.id.button_c);
        b_p = (Button)findViewById(R.id.button_p);
        b_pls = (Button)findViewById(R.id.button_pls);
        b_less = (Button)findViewById(R.id.button_less);
        b_div = (Button)findViewById(R.id.button_div);
        b_mul = (Button)findViewById(R.id.button_mul);

        b_bin = (Button)findViewById(R.id.button_BIN);

        display = (TextView)findViewById(R.id.textView);

        b_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "0";
                display.setText(cuenta);
            }
        });
        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "1";
                display.setText(cuenta);
            }
        });
        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "2";
                display.setText(cuenta);
            }
        });
        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "3";
                display.setText(cuenta);
            }
        });
        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "4";
                display.setText(cuenta);
            }
        });
        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "5";
                display.setText(cuenta);
            }
        });
        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "6";
                display.setText(cuenta);
            }
        });
        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "7";
                display.setText(cuenta);
            }
        });
        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "8";
                display.setText(cuenta);
            }
        });
        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "9";
                display.setText(cuenta);
            }
        });
        b_pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "+";
                display.setText(cuenta);
            }
        });
        b_less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "-";
                display.setText(cuenta);
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "*";
                display.setText(cuenta);
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuenta = cuenta + "/";
                display.setText(cuenta);
            }
        });

    }
}
