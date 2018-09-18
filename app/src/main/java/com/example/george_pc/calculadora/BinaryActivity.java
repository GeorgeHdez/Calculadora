package com.example.george_pc.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BinaryActivity extends AppCompatActivity {
    Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_c,b_p,b_pls,b_less,b_mul,b_div,b_dec;
    String cuenta = "";
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);

        b_0 = (Button)findViewById(R.id.button_0);
        b_1 = (Button)findViewById(R.id.button_1);

        b_c = (Button)findViewById(R.id.button_c);
        b_p = (Button)findViewById(R.id.button_p);
        b_pls = (Button)findViewById(R.id.button_pls);
        b_less = (Button)findViewById(R.id.button_less);
        b_div = (Button)findViewById(R.id.button_div);
        b_mul = (Button)findViewById(R.id.button_mul);

        b_dec = (Button)findViewById(R.id.button_DEC);

        display = (TextView)findViewById(R.id.textView);


        b_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(BinaryActivity.this,DecimalActivity.class);
                //startActivity(intent);
                finish();

            }
        });

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
