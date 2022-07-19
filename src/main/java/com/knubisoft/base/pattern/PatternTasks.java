package com.knubisoft.base.pattern;

public interface PatternTasks {
    /**
     * Write a Java program to check whether a string contains
     * only a certain set of characters (in this case a-z, A-Z and 0-9).
     * Example 1:
     *      input: {'ABCDEFabcdef123450'}
     *      output: {true}
     * Example 2:
     *      input: {'SQL'}
     *      output: {true}
     * Example 3:
     *      input: {'*&%@#!}{'}
     *      output: {false}
     * Example 4:
     *      input: {'s3integration.com'}
     *      output: {false}
     * @param text - text to match.
     * */
    boolean haveSetOfCharacters(String text);
    /**
     * Write a Java program that matches a string that has a p followed by zero or more q's.
     * Example 1:
     *      input: {'p'}
     *      output: {'Found a match!'}
     * Example 2:
     *      input: {'pqq'}
     *      output: {'Found a match!'}
     * Example 3:
     *      input: {'pqr'}
     *      output: {'Not matched!'}
     * Example 4:
     *      input: {'prr'}
     *      output: {'Not matched!'}
     * @param text - text to match.
     * */
    String matchByCharacters(String text);
    /**
     * Write a Java program that matches a word containing 'g', not at the start or end of the word.
     * Example 1:
     *      input: {'The quick brown fox jumps over the lazy dog.'}
     *      output: {'Not matched!'}
     ** Example 2:
     *      input: {'Java Exercises.'}
     *      output: {'Not matched!'}
     ** Example 1:
     *      input: {'Do humans eat gizzards?'}
     *      output: {'Not matched!'}
     ** Example 1:
     *      input: {'PostgreSQL'}
     *      output: {'Found a match!'}
     * @param text - text to match.
     * */
    String matchStartAndEnd(String text);
    /**
     * Write a Java program to remove leading zeros from a given IP address.
     * Example 1:
     *     input: {'216.08.094.196'}
     *     output: {'216.8.94.196'}
     ** Example 2:
     *     input: {'08.008.0008.00008'}
     *     output: {'8.8.8.8'}
     ** Example 3:
     *     input: {'01.102.103.104'}
     *     output: {'1.102.103.104'}
     * @param text - text to match.
     * */
    String matchIpAddress(String text);
    /**
     * Write a Java program to remove all the vowels of a given string. Return the new string.
     * Here we consider a, e, i, o, u are vowels (not y).
     * Example 1:
     *     input: {'LOWERED'}
     *     output: {'LWRD'}
     * Example 2:
     *     input: {'Java'}
     *     output: {'Jv'}
     * Example 3:
     *     input: {'MID-CENTRALIZED'}
     *     output: {'MD-CNTRLZD'}
     * Example 4:
     *     input: {'C++'}
     *     output: {'C++'}
     * @param text - text to match.
     * */
    String matchVowels(String text);
    /**
     * (PIN): A personal identification number, or PIN, is a string of at least four
     * digits used to unlock a bank account or card to which it has been assigned.
     * Write a Java program to validate a personal identification number (PIN).
     * Assume the length of a PIN number is 4, 6 or 8.
     * Example 1:
     *     input: {'123'}
     *     output: {false}
     * Example 2:
     *     input: {'1234'}
     *     output: {true}
     * Example 3:
     *     input: {'12345'}
     *     output: {false}
     * Example 4:
     *     input: {'12345678'}
     *     output: {true}
     * @param text - text to match.
     * */
    boolean validatePIN(String text);
    /**
     * Write a Java program that takes a number and set thousands separator in that number.
     * Example 1:
     *     input: {100}
     *     output: {'100'}
     * Example 2:
     *     input: {1000}
     *     output: {'1#000'}
     * Example 3:
     *     input: {10000}
     *     output: {'10#000'}
     * Example 4:
     *     input: {100000}
     *     output: {'100#000'}
     * @param digit - digit to match.
     * */
    String divideDigit(int digit);
    /**
     * Write a Java program to remove all non-alphanumeric characters from a given string.
     * Example 1:
     *     input: {'Java Exercises'}
     *     output: {'JavaExercises'}
     * Example 2:
     *     input: {'Ex@^%&%(ercis*&)&es'}
     *     output: {'Exercises'}
     * @param text - text to match.
     * */
    String removeAllNonAlphanumericCharacters(String text);
    /**
     * Write a Java program to validate a given phone number.
     *
     * Following are valid phone number examples:
     * “(123)4567890", "1234567890", "123-456-7890", "(123)456-7890",
     * Following are invalid phone numbers:
     * "(1234567890)","123)4567890", "12345678901", "(1)234567890",
     * "(123)-4567890", "1", "12-3456-7890", "123-4567", "Hello world"};
     * @param text - text to match.
     * */
    boolean validatePhoneNumber(String text);
    /**
     * Write a Java program to get last (n) vowels of a given string.
     * Example 1:
     *      input: {'Java', 2}
     *      output: {'aa'}
     ** Example 2:
     *      input: {'JavaScript', 2}
     *      output: {'ai'}
     ** Example 3:
     *      input: {'JavaScript', 3}
     *      output: {'aai'}
     ** Example 4:
     *      input: {'SQLite', 2}
     *      output: {'ie'}
     * @param text - text to match.
     * @param n - constraint for extracting characters.
     * */
    String getLastVowelsByConstraint(String text, int n);
    /**
     * Write a Java program to check if a given string is a Mathematical Expression or not.
     * Example 1:
     *      input: {'10'}
     *      output: {true}
     * Example 2:
     *      input: {'10 + 20'}
     *      output: {true}
     * Example 3:
     *      input: {'100 +'}
     *      output: {false}
     * Example 4:
     *      input: {'10 *+ 20 * 30'}
     *      output: {false}
     * @param text - text to match.
     * */
    boolean isMathematicalExpression(String text);
    /**
     * Write a Java program to insert a dash (-) between an upper case letter and a lower case letter in a given string.
     * Example 1:
     *      input: {'Python Exercises'}
     *      output: {'P-ython E-xercises'}
     * Example 2:
     *      input: {'The quick brown Fox jumps over the lazy Dog.'}
     *      output: {'T-he quick brown F-ox jumps over the lazy D-og.'}
     * Example 3:
     *      input: {'java exercises'}
     *      output: {'java exercises'}
     * @param text - text to match.
     * */
    String insertDash(String text);

}
