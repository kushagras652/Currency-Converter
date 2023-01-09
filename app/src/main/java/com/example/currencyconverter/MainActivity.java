package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    public void currency(View view){
        Log.i("info","button is clicked");
        EditText editText=(EditText) findViewById(R.id.editTextNumber);
        String z=editText.getText().toString();
        int n=Integer.valueOf(z);
        double m=n*82.34;
        Log.i("info",editText.getText().toString());
        Toast.makeText(this, editText.getText().toString()+" dollar is "+m, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}