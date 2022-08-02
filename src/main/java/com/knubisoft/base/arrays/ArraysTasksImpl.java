package com.knubisoft.base.arrays;

import java.util.Arrays;

public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {                            // Created a new reverse-array
        int[] newRevArray = new int[array.length];                 // Created an integer variable
        int variable = 0;                                          // Used a "for" cycle with a condition:
        for (int i = array.length - 1; i >= 0; i--) {              // - full length array (-1)
            newRevArray[variable] = array[i];                      // - postfix decrement
            variable++;
        }
        return newRevArray;
    }

    @Override
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] newLength = Arrays.copyOf(array1, array1.length + array2.length);
        int variable = array1.length;
        for (int number : array2) {                 // Connected java.util.Arrays library
            newLength[variable] = number;           // Used "copyO" method (int[] original, int newLength)
            variable++;                             // Used a "foreach" cycle to search through the elements of arrays
        }
        return newLength;
    }

    @Override
    public int[] findMax3InArray(int[] array) {        // Connected java.util.Arrays library
        if (array.length < 3) {                        // Used "copyO" method (int[] original, int newLength 3)
            return array;                              // Used "if" constructions and "for" cycles
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                }
            }
        }
        return Arrays.copyOf(array, 3);
    }

    @Override
    public int findLongestIncreasingContinuesSubsequence(int[] array) {
        int variableA = -1;
        int variableB = 1;                   // Created 2 variables to compare the values in the array in turn
        if (array.length == 0) {             // Used "if" constructions and "for" cycle
            return 0;                        // Used "conjunction" as a criterion for comparing values in the array
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && variableA == -1) {
                variableA = i;
            }
            if (array[i] >= array[i + 1] && variableA != -1) {
                int currentLength = i - variableA + 1;
                if (variableB < currentLength) {
                    variableB = currentLength;
                }
                variableA = -1;
            }
            if (i + 1 == array.length - 1 && array[i] < array[i + 1]) {
                if (variableA == -1) {
                    variableA = i;
                }
                int currentLength = i + 1 - variableA + 1;
                if (variableB < currentLength) {
                    variableB = currentLength;
                }
                variableA = -1;
            }
        }
        return variableB;
    }

    @Override
    public int sumOfAllUniqueElements(int[] array) {   // Created 2 variables (to find unique values and their sum)
        int sumArrayElements = 0;                      // Used "if" constructions and "for" cycles (for unique values)
        int[] element = new int[array.length];         // Used "foreach" (to find the sum of unique values)
        int variableValue = 0;
        boolean x = false;
        for (int number : array) {
            if (variableValue == 0) {
                element[0] = number;
                variableValue = 1;
                continue;
            }
            for (int i = 0; i < variableValue; i++) {
                if (number == element[i]) {
                    x = true;
                    break;
                }
            }
            if (!x) {
                element[variableValue] = number;
                variableValue++;
            }
            x = false;
        }
        for (int elementNumber : element) {
            sumArrayElements += elementNumber;
        }
        return sumArrayElements;
    }

    @Override
    public int[] moveZeroes(int[] array) {                       // Used "if" construction and "for" cycles
        for (int i = 0; i < array.length - 1; i++) {             // Compared each value of the array with 0
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] == 0) {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                }
            }
        }
        return array;
    }

    @Override
    public int findFinalValue(int[] nums, int original) {          // Created a logical variable (boolean)
        boolean variableValue = true;                              // Used "while" and "foreach" cycles
        while (variableValue) {                                    // Used "if" construction
            variableValue = false;
            for (int number : nums) {
                if (original == number) {
                    original = number * 2;
                    variableValue = true;
                }
            }
        }
        return original;
    }

    @Override
    public String longestCommonPrefix(String[] words) {           // Created a string variable (String)
        String longestPrefix = "";                                // Used "if" constructions and "for" cycles
        if (words.length == 0) {                                  // Used the java.lang.String library
            return longestPrefix;
        }                             // Method "substring()" - shows the index value (return part of the string)
        if (words.length == 1) {      // Method "contains()" - whether String contains the specified symbol sequence
            return words[0];          // Method "isEmpty()" – checks if the line size is zero
        }
        for (int i = words[0].length(); i >= 0; i--) {
            for (int j = 1; j < words.length; j++) {
                String sub = words[0].substring(0, i);
                if (!words[j].contains(sub)) {
                    longestPrefix = "";
                    break;
                }
                longestPrefix = sub;
            }
            if (!longestPrefix.isEmpty()) {
                return longestPrefix;
            }
        }
        return longestPrefix;
    }

    @Override
    public int missingNumber(int[] array) {                       // Used "if" constructions
        int variableValue;                                        // Used "for" and "foreach" cycles
        for (int i = 0; i < array.length - 1; i++) {              // Performed the ordering of the values
            for (int j = 0; j < array.length - i - 1; j++) {      // Searched for missing values
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        variableValue = array[0];
        for (int number : array) {
            if (variableValue != number) {
                return variableValue;
            }
            variableValue++;
        }
        if (array[0] == 0) {
            return array[array.length - 1] + 1;
        }
        return 0;
    }

    @Override
    public boolean containsDuplicate(int[] array) {       // Used "if" construction and "for" cycles
        for (int i = 0; i < array.length; i++) {          // Comparison of values between each other for duplication
            for (int j = 0; j < array.length; j++) {
                if (j == i) {
                    continue;
                }
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
