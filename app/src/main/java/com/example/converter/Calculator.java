package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button btnConvert,btnExit;
        EditText edMillimetres;
        TextView txtView;
        btnConvert=findViewById(R.id.btnConvert);
        btnExit=findViewById(R.id.btnExit);
        edMillimetres=findViewById(R.id.edMillimeters);
        txtView=findViewById(R.id.txtInches);



        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strMillimeters=edMillimetres.getText().toString();
                if (strMillimeters.equals("")){
                    edMillimetres.setError("Please Enter Millimeters");
                    edMillimetres.requestFocus();
                    return;
                }

                float millimetre=Float.parseFloat(strMillimeters);

                float inches= (float) (millimetre*0.0394);
                txtView.setText(inches +"inches");
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Calculator.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}