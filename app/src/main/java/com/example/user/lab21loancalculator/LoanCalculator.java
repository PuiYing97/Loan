package com.example.user.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoanCalculator extends AppCompatActivity {
    public static final String Loan_payment = "payment";
    public static final String Loan_status = "status";

    public EditText editTextvehicleprice, editTextdownpayment, editTextrepayment,editTextInterestRate,editTextSalary;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_calculator);

        editTextvehicleprice  = (EditText)findViewById(R.id.editTextvehicleprice);
        editTextdownpayment = (EditText)findViewById(R.id.editTextdownpayment);
        editTextrepayment=(EditText)findViewById(R.id.editTextrepayment);
        editTextInterestRate=(EditText)findViewById(R.id.editTextInterestRate);
        editTextSalary=(EditText)findViewById(R.id.editTextSalary);
    }


    public void calculateLoan(View view) {
        //To do calculate repayment, amount and determine the status of loan application
        double payment = 450.0;
        String status = "Approve";
        boolean flag = false;

        double vehicleprice, downpayment, repayment, InterestRate, Salary, monthlypayment, Status;

        vehicleprice = Double.parseDouble(editTextvehicleprice,getText())






        //Define an intent object
        //This is an Explicit Intent
        Intent intent = new Intent(this, Result.class);
        //Use the putExtra(TAG,value)
        intent.putExtra(Loan_payment, payment);
        intent.putExtra(Loan_status, payment);

        startActivity(intent);
    }


}


