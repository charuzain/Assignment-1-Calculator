package com.example.assignment_1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

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
    Button advancedButton;
    Button standardButton;

    TextView displayText;
    TextView history;

    Boolean isOperand = true;


    String displayString = "";

    ArrayList<String> user_values;

    Calculator calculator;




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
       advancedButton = findViewById(R.id.advanced_button);
       standardButton = findViewById(R.id.standard);


       displayText = findViewById(R.id.result);
       history = findViewById(R.id.history_text);



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
        advancedButton.setOnClickListener(this);
        standardButton.setOnClickListener(this);
        history.setOnClickListener(this);


        calculator = new Calculator();
        user_values = new ArrayList<>();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button_one:
                addNumToDisplayText("1" , isOperand);

                break;
            case R.id.button_two:
                addNumToDisplayText("2" , isOperand);
                break;
            case R.id.button_three:
                addNumToDisplayText("3" , isOperand);
                break;
            case R.id.button_four:
                addNumToDisplayText("4" , isOperand);
                break;
            case R.id.button_five:
                addNumToDisplayText("5" , isOperand);
                break;
            case R.id.button_six:
                addNumToDisplayText("6" , isOperand);
                break;
            case R.id.button_seven:
                addNumToDisplayText("7" , isOperand);
                break;
            case R.id.button_eight:
                addNumToDisplayText("8" , isOperand);
                break;
            case R.id.button_nine:
                addNumToDisplayText("9" , isOperand);
                break;
            case R.id.button_zero:
                addNumToDisplayText("0" , isOperand);
                break;
            case R.id.button_plus:
                addOperatorToDisplayText("+" , isOperand);
                break;
            case R.id.button_minus:
                addOperatorToDisplayText("-" , isOperand);
                break;
            case R.id.button_multiply:
                addOperatorToDisplayText("*" , isOperand);
                break;
            case R.id.button_divide:
                addOperatorToDisplayText("/" , isOperand);
                break;
            case R.id.button_clear:
                isOperand = true;
                displayString = " ";
                user_values = new ArrayList<>();
                displayText.setText(displayString);

                break;
            case R.id.button_equal:
                int answer = calculator.calculate(user_values);
                displayString = displayString + "=" + answer;
                displayText.setText(displayString);
                if(standardButton.getVisibility() == View.VISIBLE){
                    String show_text = displayText.getText().toString();
//                    Toast.makeText(MainActivity.this, display_text, Toast.LENGTH_SHORT).show();
                    history.setText(history.getText().toString() +"\n" + show_text);
                }
                break;
            case R.id.advanced_button:
                advancedButton.setVisibility(View.GONE);
                standardButton.setVisibility(View.VISIBLE);
                history.setText("");
                break;
            case R.id.standard:
                advancedButton.setVisibility(View.VISIBLE);
                standardButton.setVisibility(View.GONE);
                history.setText("");
                break;


        }

    }



    void addNumToDisplayText(String a , boolean isNumber){
        if(isNumber){
            user_values.add(a);
            displayString = displayString + a;
            displayText.setText(displayString);
            isOperand = false;
        }
        else{
            Toast.makeText(this, "Enter a operator", Toast.LENGTH_SHORT).show();
        }

    }

    void addOperatorToDisplayText(String a , boolean isOperator){
        if(!isOperator){
            user_values.add(a);
            displayString = displayString + a;
            displayText.setText(displayString);
            isOperand = true;
        }
        else{
            Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
        }

    }
}