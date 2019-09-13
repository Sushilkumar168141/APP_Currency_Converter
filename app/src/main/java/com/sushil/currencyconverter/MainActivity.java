package com.sushil.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText currency;
    TextView currency_rupees;
    double currency_dollar;
    double rupees;
    //double currency_dollar = Double.parseDouble(currency.getText().toString());;
    //double rupees;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currency = (EditText)(findViewById(R.id.currencyDollar));;
        currency_rupees= (TextView) (findViewById(R.id.currencyRupee));;

        currency.addTextChangedListener(watch);
    }


    TextWatcher watch = new TextWatcher(){

        @Override
        public void afterTextChanged(Editable arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onTextChanged(CharSequence s, int a, int b, int c) {
            // TODO Auto-generated method stub
            if (currency.length() == 0)
            {
                currency_dollar=0;
                //currency_rupees.setText(0);
                //return;
            }
            else {
                currency_dollar = Double.parseDouble(currency.getText().toString());
            }
            rupees = currency_dollar * 71.51;
            String ans=String.valueOf(rupees);
            currency_rupees.setText(ans);
            //int x = (String.valueOf(currency_dollar)).length();

            /*if(a == 0){
                Toast.makeText(getApplicationContext(), "Maximum Limit Reached", Toast.LENGTH_SHORT).show();
                currency_dollar=0;
            }*/
        }};

/*
    public void convert(View view)
    {


        //rupees = currency_dollar * 71.51;
        Toast.makeText(MainActivity.this, "$" + String.format("%.2f",rupees), Toast.LENGTH_LONG).show();
        //currency_rupees= (TextView) (findViewById(R.id.currencyRupee));
        //currency_rupees.setText(String.valueOf(rupees));
        Log.i("info" , "currency converted");
    }*/
     public void inRupees(View view)
     {
         Log.i("info","currency converted");
         //currency = (EditText)(findViewById(R.id.currencyDollar));
         //currency_dollar = Double.parseDouble(currency.getText().toString());
         rupees = currency_dollar * 71.51;

         //EditText currency_in_rupees = rupees;
         //currency_rupees.setText((String.valueOf(rupees)));
         currency_rupees.setText(String.valueOf(rupees));
     }




}
