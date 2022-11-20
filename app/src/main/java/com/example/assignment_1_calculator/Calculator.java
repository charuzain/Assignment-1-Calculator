package com.example.assignment_1_calculator;

import java.util.ArrayList;

public class Calculator {

    public int calculate(ArrayList<String> user_values) {

        if (user_values.size() > 2) {

        int num1 = Integer.parseInt(user_values.get(0));
        String operator = user_values.get(1);
        int num2 = Integer.parseInt(user_values.get(2));

        int calculation_result = calculate_result(num1, operator, num2);

        if (user_values.size() > 3) {
        ArrayList<String> new_array = new ArrayList<>();
        new_array.add(String.valueOf(calculation_result));

        for (int i = 3; i < user_values.size(); i++) {
            new_array.add(user_values.get(i));

        }
        return calculate(new_array);
        } else{
            return calculation_result;
        }
    }
        else{
           return Integer.parseInt(user_values.get(0));

        }



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
