package id.mobiledevidn.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText value1, value2;
    Button addition, subtraction, multiplication, division;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = (EditText) findViewById(R.id.edNumber1);
        value2 = (EditText) findViewById(R.id.edNumber2);
        addition = (Button) findViewById(R.id.btAddition);
        subtraction = (Button) findViewById(R.id.btSubtraction);
        multiplication = (Button) findViewById(R.id.btMultiplication);
        division = (Button) findViewById(R.id.btDivision);
        result = (TextView) findViewById(R.id.tvResult);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addition();
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtraction();
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplication();
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });


    }

    private void addition() {

        String number1 = value1.getText().toString();
        String number2 = value2.getText().toString();

        int value1 = Integer.parseInt(number1);
        int value2 = Integer.parseInt(number2);

        int out = value1 + value2;

        String r = String.valueOf(out);

        result.setText(r);

    }

    private void subtraction() {

        String number1 = value1.getText().toString();
        String number2 = value2.getText().toString();

        int value1 = Integer.parseInt(number1);
        int value2 = Integer.parseInt(number2);

        int out = value1 - value2;

        String r = String.valueOf(out);

        result.setText(r);
    }

    private void multiplication() {

        String number1 = value1.getText().toString();
        String number2 = value2.getText().toString();

        int value1 = Integer.parseInt(number1);
        int value2 = Integer.parseInt(number2);

        int out = value1 * value2;

        String r = String.valueOf(out);

        result.setText(r);
    }

    private void division() {

        String number1 = value1.getText().toString();
        String number2 = value2.getText().toString();

        double value1 = Double.parseDouble(number1);
        double value2 = Double.parseDouble(number2);

        double out = value1 / value2;

        String r = String.valueOf(out);

        result.setText(r);

    }

}