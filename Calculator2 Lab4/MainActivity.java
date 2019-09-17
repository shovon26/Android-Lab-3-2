package com.example.calculator_class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
            button11,button12,button13,button14,button15,button16,button17;

    double operand1,operand2;

    boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edttext);
        button1 = findViewById(R.id.btnOne);
        button2 = findViewById(R.id.btntwo);
        button3 = findViewById(R.id.btnThree);
        button4 = findViewById(R.id.btnFour);
        button5 = findViewById(R.id.btnFive);
        button6 = findViewById(R.id.btnSix);
        button7 = findViewById(R.id.btnSeven);
        button8 = findViewById(R.id.btnEight);
        button9 = findViewById(R.id.btnNine);
        button10 = findViewById(R.id.btnZero);
        button11 = findViewById(R.id.btnadd);
        button12 = findViewById(R.id.btnSub);
        button13 = findViewById(R.id.btnMul);
        button14 = findViewById(R.id.btnDiv);
        button15 = findViewById(R.id.btnDot);
        button16 = findViewById(R.id.btnClear);
        button17 = findViewById(R.id.btnEqual);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {   ///Addition Button
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    operand1 = Double.parseDouble(editText.getText() + "");
                    add = true;
                    editText.setText(null);
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {   ///Subtraction Button
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    operand1 = Double.parseDouble(editText.getText() + "");
                    sub = true;
                    editText.setText(null);
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {   ///Multiplication Button
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    operand1 = Double.parseDouble(editText.getText() + "");
                    mul = true;
                    editText.setText(null);
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {   ///Division Button
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    operand1 = Double.parseDouble(editText.getText() + "");
                    div = true;
                    editText.setText(null);
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {   ///Dot Button
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText()+".");
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {   ///Clear Button
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {   ///Clear Button
            @Override
            public void onClick(View v) {
                operand2 = Double.parseDouble(editText.getText()+"");

                if(add==true)
                {
                    editText.setText(Calculation.addition(operand1,operand2) + "");
                    add=false;
                }

                if(sub==true)
                {
                    editText.setText(Calculation.subtraction(operand1,operand2) + "");
                    sub=false;
                }

                if(mul==true)
                {
                    editText.setText(Calculation.multiplication(operand1,operand2) + "");
                    mul=false;
                }

                if(div==true)
                {
                    double res=Calculation.division(operand1,operand2);
                    if(res==0){
                        editText.setText("Math Error");
                    }
                    else {
                        editText.setText(res + "");
                    }
                    div=false;
                }

            }
        });
    }
}
