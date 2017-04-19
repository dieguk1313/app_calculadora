package com.example.aulasamigas.appcalculadora;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView resultado;
    EditText numberOne;
    EditText numberTwo;

    float result,valorUno,valorTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = (TextView) findViewById(R.id.textView4);

        numberOne = (EditText) findViewById(R.id.editText2);
        numberTwo = (EditText) findViewById(R.id.editText);
        radioGroup = (RadioGroup)findViewById(R.id.grupo);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.radioButton4){
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno+valorTwo;

                    resultado.setText(String.valueOf(result));
                }else if(checkedId == R.id.radioButton2){
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno-valorTwo;

                    resultado.setText(String.valueOf(result));
                }else if(checkedId == R.id.radioButton3){
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno*valorTwo;

                    resultado.setText(String.valueOf(result));
                }else if (checkedId == R.id.radioButton) {
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno / valorTwo;

                    resultado.setText(String.valueOf(result));
                }
            }
        });

    }
}
