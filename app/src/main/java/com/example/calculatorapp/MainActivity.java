package com.example.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText en1,en2;
    Button add,minus,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        en1= findViewById(R.id.eNumber1);
        en2= findViewById(R.id.eNumber2);
        tv= findViewById(R.id.eNumber3);
        add= findViewById(R.id.add);
        minus= findViewById(R.id.minus);
        mul= findViewById(R.id.mul);
        div= findViewById(R.id.divide);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv,sv,ans;
                fv = Integer.parseInt(en1.getText().toString());
                sv = Integer.parseInt(en2.getText().toString());

                ans=fv+sv;

                tv.setText("Ans is: "+ans);
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv,sv,ans;
                fv = Integer.parseInt(en1.getText().toString());
                sv = Integer.parseInt(en2.getText().toString());

                ans=fv-sv;

                tv.setText("Ans is: "+ans);
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv,sv,ans;
                fv = Integer.parseInt(en1.getText().toString());
                sv = Integer.parseInt(en2.getText().toString());

                ans=fv*sv;

                tv.setText("Ans is: "+ans);
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv,sv,ans;
                fv = Integer.parseInt(en1.getText().toString());
                sv = Integer.parseInt(en2.getText().toString());

                ans=fv/sv;

                tv.setText("Ans is: "+ans);
            }
        });


        //this is java backend file
    }
}