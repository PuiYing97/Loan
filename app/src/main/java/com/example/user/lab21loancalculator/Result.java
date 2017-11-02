package com.example.user.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //To get the intent
        Intent intent =getIntent();//Asking "who called me?"
        double payment = intent.getDoubleExtra(LoanCalculator.Loan_payment, 0);
        String status= intent.getStringExtra(LoanCalculator.Loan_status);

        //to do display outputs
        if(status.equals("approve")){

        }
    }
    public void closeActivity(View view){
        //Terminate an activity
        finish();


    }
}
