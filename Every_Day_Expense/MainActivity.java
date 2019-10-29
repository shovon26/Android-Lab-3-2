package com.example.every_day_expense;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
    Button button;
    EditText editText;
    int Total_expense=0;
   boolean food=false,transport=false,entertainment=false,bill=false,other=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =  findViewById(R.id.txtview);
        checkBox1 = findViewById(R.id.chk1);
        checkBox2 = findViewById(R.id.chk2);
        checkBox3 = findViewById(R.id.chk3);
        checkBox4 = findViewById(R.id.chk4);
        checkBox5 = findViewById(R.id.chk5);
        button = findViewById(R.id.expense);
        editText = findViewById(R.id.edttxt);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                food=true;
                Total_expense+=100;
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                food=true;
                Total_expense+=100;
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                food=true;
                Total_expense+=100;
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                food=true;
                Total_expense+=100;
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                food=true;
                Total_expense+=100;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(food==true)
                {
                    Total_expense+=
                }
            }
        });
    }
}
