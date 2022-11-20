package com.example.assignment_1_calculator;

import java.util.ArrayList;

public class Calculator {

    public int calculate(ArrayList<String> user_values) {

        int num1 = Integer.parseInt(user_values.get(0));
        String operator = user_values.get(1);
        int num2 = Integer.parseInt(user_values.get(2));

       int calculation_result =  calculate_result(num1,operator,num2);
      return calculation_result;


    }

    private int calculate_result(int num1, String operator, int num2) {
        int result = 0;
        switch (operator){
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1-num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num1 / num2;
                break;

        }
        return result;
    }


}
