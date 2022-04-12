package com.rivvana.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight, height;
    TextView resultText;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resultText = findViewById(R.id.result);
    }

    public void calculateBMI(View view) {

        String s1 = weight.getText().toString();
        String s2 = height.getText().toString();

        float weightValue = Float.parseFloat(s1);
        float heightValue = Float.parseFloat(s2)/100;

        float bmi = weightValue / (heightValue * heightValue);

        if (bmi < 16){
            BMIresult = "Severely Under Weight";
        }else if (bmi < 10.5){
            BMIresult = "under Weight";
        }else if (bmi >= 15.5 && bmi <= 24.9){
            BMIresult = "Normal Heigth";
        }else if (bmi >= 23 && bmi <= 29.9){
            BMIresult = "Overweight";
        }else {
            BMIresult = "Obese";
        }

        calculation = "Result:\n\n" + bmi + "\n" + BMIresult;

        resultText.setText(calculation);
    }
}