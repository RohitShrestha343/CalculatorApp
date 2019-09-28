package com.shrestha.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.shrestha.calculator.action.MathCal;
import com.shrestha.calculator.model.Numbers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;
    Button but_1, but_2, but_3, but_4, but_5, but_6, but_7, but_8, but_9, but_p, but_s, but_m, but_d, but_e, but_dot, but_0, but_c;
    int count = 0;
    String doa;
    Numbers numbers = new Numbers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        result.setShowSoftInputOnFocus(false);
        but_0 = findViewById(R.id.but0);
        but_0.setOnClickListener(this);
        but_1 = findViewById(R.id.but1);
        but_1.setOnClickListener(this);
        but_2 = findViewById(R.id.but2);
        but_2.setOnClickListener(this);
        but_3 = findViewById(R.id.but3);
        but_3.setOnClickListener(this);
        but_4 = findViewById(R.id.but4);
        but_4.setOnClickListener(this);
        but_5 = findViewById(R.id.but5);
        but_5.setOnClickListener(this);
        but_6 = findViewById(R.id.but6);
        but_6.setOnClickListener(this);
        but_7 = findViewById(R.id.but7);
        but_7.setOnClickListener(this);
        but_8 = findViewById(R.id.but8);
        but_8.setOnClickListener(this);
        but_9 = findViewById(R.id.but9);
        but_9.setOnClickListener(this);
        but_p = findViewById(R.id.butadd);
        but_p.setOnClickListener(this);
        but_s = findViewById(R.id.butsub);
        but_s.setOnClickListener(this);
        but_m = findViewById(R.id.butx);
        but_m.setOnClickListener(this);
        but_d = findViewById(R.id.butdi);
        but_d.setOnClickListener(this);
        but_e = findViewById(R.id.butequal);
        but_e.setOnClickListener(this);
        but_dot = findViewById(R.id.butdot);
        but_dot.setOnClickListener(this);
        but_c = findViewById(R.id.clear);
        but_c.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.but0:
                result.append("0");
                break;
            case R.id.but1:
                result.append("1");
                break;
            case R.id.but2:
                result.append("2");
                break;
            case R.id.but3:
                result.append("3");
                break;
            case R.id.but4:
                result.append("4");
                break;
            case R.id.but5:
                result.append("5");
                break;
            case R.id.but6:
                result.append("6");
                break;
            case R.id.but7:
                result.append("7");
                break;
            case R.id.but8:
                result.append("8");
                break;
            case R.id.but9:
                result.append("9");
                break;
            case R.id.butdot:
                if ((result.getText().toString()).contains(".")) {
                } else {
                    result.append(".");
                }
                break;
            case R.id.clear:
                try {
                    String NumberEntered = result.getText().toString();
                    NumberEntered = NumberEntered.substring(0, NumberEntered.length() - 1);
                    String word= (NumberEntered);
                    result.setText("");
                    result.setText(word);
                    return;

                } catch (Exception e) {
                    count=0;
                    result.setError("please first enter value");
                }
                break;
            case R.id.butadd:
                count++;
                doa = "plus";
                SetData(count);
                break;
            case R.id.butsub:
                count++;
                doa = "sub";
                SetData(count);
                break;
            case R.id.butdi:
                count++;
                doa = "di";
                SetData(count);
                break;
            case R.id.butx:
                count++;
                doa = "mul";
                SetData(count);
                break;
            case R.id.butequal:
                MathCal mathCal = new MathCal();
                count++;
                SetData(count);
                if (doa.equalsIgnoreCase("plus")) {
                    result.setText(mathCal.add(numbers));
                } else if (doa.equalsIgnoreCase("sub")) {
                    result.setText(mathCal.sub(numbers));
                } else if (doa.equalsIgnoreCase("di")) {
                    result.setText(mathCal.divide(numbers));
                } else if (doa.equalsIgnoreCase("mul")) {
                    result.setText(mathCal.mul(numbers));
                }
                break;
        }
    }

    public void SetData(int cou) {

            if(!result.getText().toString().isEmpty()){
            if (cou == 1) {
                numbers.setFirstNumber(Double.parseDouble(result.getText().toString()));
                result.setText("");
            } else if (cou == 2) {
                numbers.setSecondNumber(Double.parseDouble(result.getText().toString()));
                result.setText("");
            } else {
                result.setError("only two time");

            }}else {
                result.setError("please enter the number first");
                count=0;
            }

    }
}
