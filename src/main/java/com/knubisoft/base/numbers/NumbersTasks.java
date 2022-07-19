package com.knubisoft.base.numbers;

import java.math.BigInteger;

public interface NumbersTasks {

    /**
     * Given two numbers, firstNumber, and secondNumber, swap two numbers without using a third variable.
     *
     * Example:
     *
     *     input: firstNumber - 45, secondNumber - 67
     *     expected result: firstNumber - 67, secondNumber - 45
     *
     * @param firstNumber number to swap.
     * @param secondNumber number to swap.
     */
    void swapTwoNumbersWithoutUsingTemporaryVariable(int firstNumber, int secondNumber);

    /**
     * Given an integer, the task is to find out whether the given number is an Ugly number or not .
     *
     * In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. First 10 ugly
     * numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
     *
     * Example:
     *
     *     input: 235
     *     output: false
     * @param number to check.
     * @return true if ugly, false if not.
     */
    boolean isUglyInt(int number);

    /**
     * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
     *
     * Example 1:
     *
     *     input: num = 38
     *     output: 2
     *     explanation: The process is
     *     38 --> 3 + 8 --> 11
     *     11 --> 1 + 1 --> 2
     *     Since 2 has only one digit, return it.
     *
     * Example 2:
     *
     *     input: num = 0
     *     output: 0
     *
     * @param number to process.
     * @return Processing result.
     */
    int addDigits(int number);

    /**
     * Check if a number is a Harshad Number or not.
     *
     * A number is called a harshad number (or niven number) is an integer that is divisible by the sum of its digits.
     * i.e. A number MN is divisible by (M+N).
     * Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2.
     * Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
     *
     * Example:
     *
     *     input: 353
     *     output: false
     * @param number to check.
     * @return true if Harshad Number, false if not.
     */
    boolean isHarshadNumber(int number);

    /**
     * Check if number is prime.
     *
     * A prime number is a natural number greater than 1, which is only divisible by 1 and itself.
     *
     * @param number to check.
     * @return true if prime, false if not.
     */
    boolean isPrime(int number);

    /**
     * Check if a number is an Armstrong Number or not.
     *
     * A positive number is called Armstrong number if it is equal to the sum of cubes of its digits.
     *
     * Explanation:
     *
     *     Let's try to understand why 153 is an Armstrong number.
     *     153 = (1*1*1)+(5*5*5)+(3*3*3)
     *     where:
     *     (1*1*1)=1
     *     (5*5*5)=125
     *     (3*3*3)=27
     *     So:
     *     1+125+27=153
     *
     * @param number to check.
     * @return true if Armstrong Number, false if not.
     */
    boolean isArmstrongNumber(int number);

    /**
     * Calculate factorial.
     * Factorial is the product of all positive integers less than or equal to n.
     *
     * Example:
     *
     *     input: 5
     *     output: 120
     *     explanation: 5! =  1 * 2 * 3 * 4 * 5  = 120
     *
     * @param number to process.
     * @return factorial of number.
     */
    BigInteger factorial(int number);

    /**
     * Check if number is а palindrome.
     *
     * A palindrome number is a number that is same after reverse.
     * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
     *
     * @param number to check.
     * @return true if palindrome, false if not.
     */
    boolean palindrome(int number);

    /**
     * Check if number is an Automorphic number or not.
     *
     * In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself.
     *
     * Explanation:
     *
     *     For example, 5² = 25, 6² = 36, 76² = 5776, and 890625² = 793212890625, so 5, 6, 76 and 890625
     *     are all automorphic numbers.
     *
     * @param number to check.
     * @return true if automorphic, false if not.
     */
    boolean isAutomorphic(int number);


}
