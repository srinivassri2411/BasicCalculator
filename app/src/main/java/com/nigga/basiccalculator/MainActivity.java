package com.nigga.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public  class MainActivity extends AppCompatActivity {
public EditText operand1;
public EditText operand2;
public EditText operator;
public Object finalValue;
public Button submitButton;
public TextView resultText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton=findViewById(R.id.calSubmitbutton);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=findViewById(R.id.Oparand1);
                operand2=findViewById(R.id.Oparand2);
                operator=findViewById(R.id.operator1);
                String opera = operator.getText().toString();
                Double op1 = Double.parseDouble(operand1.getText().toString());
                Double op2 = Double.parseDouble(operand2.getText().toString());
                switch (opera) {
                    case "+":
                        finalValue = op1 + op2;
                        break;
                    case "-":
                        finalValue = op1 - op2;
                        break;
                    case "*":
                        finalValue = op1 * op2;
                        break;
                    case "/":
                        finalValue = op1 / op2;
                        break;
                    default:
                        finalValue = "Invalid Data";
                        break;
                }
                Intent intent=new Intent(MainActivity.this, ResultActivity.class);
                resultText = findViewById(R.id.finalValue);
                resultText.setText(finalValue+"");
            }
        });

    }
}