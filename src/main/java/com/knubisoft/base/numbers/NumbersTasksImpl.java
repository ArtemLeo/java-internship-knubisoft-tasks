package com.knubisoft.base.numbers;

import java.math.BigInteger;
import java.util.Arrays;

public class NumbersTasksImpl implements NumbersTasks {

    @Override
    public void swapTwoNumbersWithoutUsingTemporaryVariable(int firstNumber, int secondNumber) {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println(firstNumber + " " + secondNumber);
    }

    @Override
    public boolean isUglyInt(int number) {
        if (number < 1) {
            return false;
        }
        int temp;
        do {
            temp = number;
            if (number % 2 == 0) {
                number /= 2;
            }
            if (number % 3 == 0) {
                number /= 3;
            }
            if (number % 5 == 0) {
                number /= 5;
            }
        } while (temp != number);
        return number == 1;
    }

    @Override
    public int addDigits(int number) {
        do {
            number = Arrays.stream(String.valueOf(number).split(""))
                    .map(Integer::valueOf)
                    .reduce(Integer::sum).orElseThrow();
        } while (String.valueOf(number).length() != 1);
        return number;
    }

    @Override
    public boolean isHarshadNumber(int number) {
        if (number == 0) {
            return false;
        }
        String num = String.valueOf(number);
        char[] c = num.toCharArray();
        int n = 0;
        for (char value : c) {
            n += Character.getNumericValue(value);
        }
        return number % n == 0;
    }

    @Override
    public boolean isPrime(int number) {
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isArmstrongNumber(int number) {
        String[] array = String.valueOf(number).split("");
        Double sum = Arrays.stream(array)
                .map(Integer::valueOf)
                .map(e -> Math.pow(e, array.length))
                .reduce(Double::sum)
                .orElseThrow();
        return sum == number;
    }

    @Override
    public BigInteger factorial(int number) {
        if (number == 0)
            return BigInteger.valueOf(1);
        else
            return factorial(number - 1).multiply(BigInteger.valueOf(number));
    }

    @Override
    public boolean palindrome(int number) {
        int original = number;
        int remainder;
        int temp = 0;
        while (number != 0) {
            remainder = number % 10;
            temp = temp * 10 + remainder;
            number /= 10;
        }
        return original == temp;
    }

    @Override
    public boolean isAutomorphic(int number) {
        String numberString = String.valueOf(number);
        String result = String.valueOf((long) Math.pow(number, 2));
        return numberString.compareTo(result
                .substring(result.length() - numberString.length())) == 0;
    }
}
