package com.example.sureshtaxcalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private EditText et1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.etsalary);
        btn1 = findViewById(R.id.btncalc);
        tv1 = findViewById(R.id.tvresult);

        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int salary = Integer.parseInt(et1.getText().toString());
        if (salary > 1 & salary < 200000) {
            double tax = (salary * 0.01);
            tv1.setText(Double.toString(tax));

        } else if (salary > 200000 & salary < 350000) {
            double firsttax = 200000 * 0.01;
            int rest = salary - 200000;
            double resttax = rest * 0.15;
            double tax = firsttax + resttax;

            tv1.setText(Double.toString(tax));

        } else if (salary > 350000) {
            double firsttax = 200000 * 0.01;
            int rest = salary - 150000;
            double secondtax = 150000 * 0.15;
            double resttax = rest * 0.25;

            double tax = firsttax + secondtax + resttax;

            tv1.setText(Double.toString(tax));

        }

    }
}
