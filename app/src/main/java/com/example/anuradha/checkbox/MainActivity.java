package com.example.anuradha.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    Button b1;
    String op1,op2,op3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1= (CheckBox) findViewById(R.id.cb1);
        c2= (CheckBox) findViewById(R.id.cb2);
        c3= (CheckBox) findViewById(R.id.cb3);
        b1= (Button) findViewById(R.id.bg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked())
                {
                    op1=c1.getText().toString();
                }
                else
                {
                   op1="";
                }
                if(c2.isChecked())
                {
                    op2=c1.getText().toString();
                }
                else
                {
                    op2="";
                }
                if(c3.isChecked())
                {
                    op3=c1.getText().toString();
                }
                else
                {
                    op3="";
                }
                Toast.makeText(MainActivity.this, ""+(op1+op2+op3), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
