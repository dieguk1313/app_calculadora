package com.example.aulasamigas.appcalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView vista1;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vista1 = (TextView) findViewById(R.id.textView);
        boton1 = (Button) findViewById(R.id.button);
        boton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        vista1.setText("cambio el texto oprimiendo el boton");
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
