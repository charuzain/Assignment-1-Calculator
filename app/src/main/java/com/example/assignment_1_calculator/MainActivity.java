package com.example.assignment_1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button numOneButton ;
    Button numTwoButton ;
    Button numThreeButton ;
    Button numFourButton ;
    Button numFiveButton;
    Button numSixButton ;
    Button numSevenButton;
    Button numEightButton ;
    Button numNineButton ;
    Button numZeroButton;

    Button plusButton;
    Button minusButton;
    Button multiplyButton;
    Button divideButton ;

    Button equalToButton ;
    Button clearButton ;

    TextView displayText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       numOneButton =  findViewById(R.id.button_one);
       numTwoButton =  findViewById(R.id.button_two);
       numThreeButton = (Button) findViewById(R.id.button_three);
       numFourButton = (Button) findViewById(R.id.button_four);
       numFiveButton = (Button) findViewById(R.id.button_five);
       numSixButton = (Button) findViewById(R.id.button_six);
       numSevenButton = (Button) findViewById(R.id.button_seven);
       numEightButton = (Button) findViewById(R.id.button_eight);
       numNineButton = (Button) findViewById(R.id.button_nine);
       numZeroButton = (Button) findViewById(R.id.button_zero);

       plusButton = (Button) findViewById(R.id.button_plus);
       minusButton = (Button) findViewById(R.id.button_minus);
       multiplyButton = (Button) findViewById(R.id.button_multiply);
       divideButton = (Button) findViewById(R.id.button_divide);

       equalToButton = (Button) findViewById(R.id.button_equal);
       clearButton = (Button) findViewById(R.id.button_clear);

       displayText = (TextView) findViewById(R.id.result);


        numOneButton.setOnClickListener(this);
        numTwoButton.setOnClickListener(this);
        numThreeButton.setOnClickListener(this);
        numFourButton.setOnClickListener(this);
        numFiveButton.setOnClickListener(this);
        numSixButton.setOnClickListener(this);
        numSevenButton.setOnClickListener(this);
        numEightButton.setOnClickListener(this);
        numNineButton.setOnClickListener(this);
        numZeroButton.setOnClickListener(this);

         plusButton.setOnClickListener(this);
         minusButton.setOnClickListener(this);
         multiplyButton.setOnClickListener(this);
         divideButton.setOnClickListener(this);

         equalToButton.setOnClickListener(this);
         clearButton.setOnClickListener(this);








    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_one:
                displayText.setText("1");
                break;
            case R.id.button_two:
                displayText.setText("2");
                break;
            case R.id.button_three:
                displayText.setText("3");
                break;
            case R.id.button_four:
                displayText.setText("4");
                break;
            case R.id.button_five:
                displayText.setText("5");
                break;
            case R.id.button_six:
                displayText.setText("6");
                break;
            case R.id.button_seven:
                displayText.setText("7");
                break;
            case R.id.button_eight:
                displayText.setText("8");
                break;
            case R.id.button_nine:
                displayText.setText("9");
                break;
            case R.id.button_zero:
                displayText.setText("0");
                break;
            case R.id.button_plus:
                displayText.setText("+");
                break;
            case R.id.button_minus:
                displayText.setText("-");
                break;
            case R.id.button_multiply:
                displayText.setText("*");
                break;
            case R.id.button_divide:
                displayText.setText("/");
                break;


        }

    }
}