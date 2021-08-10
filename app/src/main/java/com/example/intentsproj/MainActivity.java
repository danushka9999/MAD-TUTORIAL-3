package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_num1;
    EditText et_num2;
    Button bt_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_num1 = findViewById(R.id.et_num1);
        et_num2 = findViewById(R.id.et_num2);
        bt_ok = findViewById(R.id.bt_ok);

    }
    public void onClick(View view){
        Intent intent = new Intent( this, SecondActivity.class);
        intent.putExtra("n1",et_num1.getText().toString());
        intent.putExtra("n2",et_num2.getText().toString());
        startActivity(intent);
    }
}