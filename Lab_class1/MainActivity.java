package com.example.hellooworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnH;
    EditText edtH;
    TextView tvN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnH = findViewById(R.id.btnHello);
        tvN =  findViewById(R.id.tvName);
        edtH = findViewById(R.id.edtName);

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= edtH.getText().toString();

                tvN.setText(s);



                Toast.makeText(getApplicationContext(),"Hi! I am a student", Toast.LENGTH_LONG).show();
            }
        });
    }
}
