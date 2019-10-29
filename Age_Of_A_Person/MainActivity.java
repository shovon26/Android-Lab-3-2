package com.example.birth_date;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonclr,buttondash;
    int month,year,date;

    final static int date_today=29;
    final static int month_today=10;
    final static  int year_today = 2019;

    boolean dash=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.bithdate);
        button = findViewById(R.id.btn1);
        button0= findViewById(R.id.btnZero);
        button1= findViewById(R.id.btnOne);
        button2= findViewById(R.id.btntwo);
        button3= findViewById(R.id.btnThree);
        button4= findViewById(R.id.btnfour);
        button5= findViewById(R.id.btnFive);
        button6= findViewById(R.id.btnSix);
        button7= findViewById(R.id.btnSeven);
        button8= findViewById(R.id.btnEight);
        button9= findViewById(R.id.btnNine);
        buttonclr = findViewById(R.id.btnClear);
        buttondash = findViewById(R.id.btnDash);



        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"2");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });

        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

        buttondash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"-");
                dash=true;
            }
        });

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               month = Integer.parseInt(textView.getText()+"");
               year = Integer.parseInt(textView.getText()+"");
               date = Integer.parseInt(textView.getText()+"");

               
           }
       });
    }
}
