package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnclick(View view){
    EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
    String dollars = dollarAmount.getText().toString();
    Double doubledollar = Double.parseDouble(dollars);
    Double dollarINR = 80.12 * doubledollar;
        String toastText = "  " + dollarINR.toString() + " $ ";
        Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}