package com.shawnbutton.stringCalculatorKata;


public class Calculator {
    public int add(String numbersToAdd) {
        if (numbersToAdd.length() == 0) return 0;

        String[] values = extractNumbersToAdd(numbersToAdd);

        return addStringNumbers(values);
    }

    private String[] extractNumbersToAdd(String numbersToAdd) {
        String delimiter = "\n|,";
        if (numbersToAdd.startsWith("//")) {
            delimiter = numbersToAdd.substring(2,3);
            numbersToAdd = numbersToAdd.substring(3);
        }

        return numbersToAdd.split(delimiter);
    }

    private int addStringNumbers(String[] values) {
        int sum = 0;
        for (String number : values) {
            int value = Integer.valueOf(number);
            if (value < 0) {
                throw new RuntimeException("cannot use negative:" + number);
            }
            sum += value;
        }
        return sum;
    }
}
