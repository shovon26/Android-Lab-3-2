package com.example.calculator;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15,button16,button17,button18,button19;

    double mValueone,mValuetwo;

    boolean sub,add,mul,div,mod,pow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edttext);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button10 = findViewById(R.id.btn10);
        button11 = findViewById(R.id.btn11);
        button12 = findViewById(R.id.btn12);
        button13 = findViewById(R.id.btn13);
        button14 = findViewById(R.id.btn14);
        button15 = findViewById(R.id.btn15);
        button16 = findViewById(R.id.btn16);
        button17 = findViewById(R.id.btn17);
        button18 = findViewById(R.id.btn18);
        button19 = findViewById(R.id.btn19);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {   ///Addition button
            @Override
            public void onClick(View v) {

                if(editText == null){
                    editText.setText("");
                }
                else{
                    mValueone = Double.parseDouble(editText.getText() + "");
                    add=true;
                    editText.setText(null);
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {    ///Subtraction Button
            @Override
            public void onClick(View v) {
                mValueone = Double.parseDouble(editText.getText() + "");
                sub=true;
                editText.setText(null);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {    ////Multiplication Button
            @Override
            public void onClick(View v) {
                mValueone = Double.parseDouble(editText.getText() + "");
                mul=true;
                editText.setText(null);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {      ////Division Button
            @Override
            public void onClick(View v) {
                mValueone = Double.parseDouble(editText.getText() + "");
                div = true;
                editText.setText(null);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {     ////Modular Button
            @Override
            public void onClick(View v) {
                mValueone = Double.parseDouble(editText.getText()+"");
                mod=true;
                editText.setText(null);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {     ////Power function Button
            @Override
            public void onClick(View v) {
                mValueone = Double.parseDouble(editText.getText()+"");
                pow=true;
                editText.setText(null);
            }
        });


        button18.setOnClickListener(new View.OnClickListener() {       ////Equal Button
            @Override
            public void onClick(View v) {
                mValuetwo = Double.parseDouble(editText.getText() + "");

                if(add==true){
                    editText.setText(Calculation.addition(mValueone,mValuetwo) + "" );
                    add=false;
                }
                if(sub==true){
                    editText.setText(Calculation.subtraction(mValueone,mValuetwo) + "");
                    sub=false;
                }
                if(mul==true){
                    editText.setText(Calculation.multiplication(mValueone,mValuetwo) + "");
                    mul=false;
                }
                if(div==true){
                    double res=Calculation.division(mValueone,mValuetwo);
                    if(res==0){
                        editText.setText("Math Error");
                    }
                    else {
                        editText.setText(Calculation.division(mValueone, mValuetwo) + "");
                    }
                    div=false;
                }
                if(mod==true)
                {
                    editText.setText(Calculation.modular(mValueone,mValuetwo) + "");
                    mod=false;
                }

                if(pow==true){
                    editText.setText(Calculation.power(mValueone,mValuetwo)+ "");
                    pow=false;
                }
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {     ////Clear Button
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
}
