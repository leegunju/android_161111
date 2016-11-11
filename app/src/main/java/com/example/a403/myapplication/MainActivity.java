package com.example.a403.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.zip.CheckedOutputStream;

public class MainActivity extends AppCompatActivity {
    Button b1;
    CheckBox c1;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "안녕???", Toast.LENGTH_SHORT).show();
            }
        });

        l1 = (LinearLayout)findViewById(R.id.activity_main);
        c1 = (CheckBox)findViewById(R.id.checkBox2);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    l1.setBackgroundColor(Color.BLUE);
                }
                else{
                    l1.setBackgroundColor(Color.WHITE);
                }
            }
        });

    }
}
