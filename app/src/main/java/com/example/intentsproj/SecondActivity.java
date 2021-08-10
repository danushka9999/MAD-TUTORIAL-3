package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText et_num4;
    EditText et_num5;
    TextView tv_value1;
    Button bt_minus;
    Button bt_plus;
    Button bt_divi;
    Button bt_mult;
    String number1;
    String number2;
    Float number_1;
    Float number_2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_num4 = findViewById(R.id.et_num4);
        et_num5 = findViewById(R.id.et_num5);
        tv_value1 = findViewById(R.id.tv_value1);
        bt_plus = findViewById(R.id.bt_plus);
        bt_minus = findViewById(R.id.bt_minus);
        bt_divi = findViewById(R.id.bt_mult);
        bt_mult = findViewById(R.id.bt_mult);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        et_num4.setText(number1);
        et_num5.setText(number2);

        number_1 = Float.parseFloat(number1);
        number_2 = Float.parseFloat(number2);



    }
    public void Add(View view){
        Float add = number_1 +number_2;
        String addString = new Float(add).toString();
        tv_value1.setText(number1 + " + " + number2 + " = " + addString);
    }
    public void onClickSubtract(View view){
        Float sub = number_1 - number_2;
        String subString = new Float(sub).toString();
        tv_value1.setText(number1 + " - " + number2 + " = " + subString);
    }
    public void onClickMultiply(View view){
        Float multi = number_1 * number_2;
        String multiString = new Float(multi).toString();
        tv_value1.setText(number1 + " + " + number2 + " = " + multiString);
    }
    public void onClickDivide(View view){
        Float divide = number_1 / number_2;
        String divideString = new Float(divide).toString();
        tv_value1.setText(number1 + " + " + number2 + " = " + divideString);
    }


}