package com.education.ztu;

public class Operation {
    public static int addition(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static int subtraction(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static int multiplication(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public static double division(int... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result /= numbers[i];
        }
        return result;
    }

    public static double average(int... numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static int maximum(int... numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            if (number > result) {
                result = number;
            }
        }
        return result;
    }

    public static int minimum(int... numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }
}
