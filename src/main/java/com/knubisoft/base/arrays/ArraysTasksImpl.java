package com.knubisoft.base.arrays;

import java.util.Arrays;

public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int variable = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[variable] = array[i];
            variable++;
        }
        return reverseArray;
    }

    @Override
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] newLength = Arrays.copyOf(array1, array1.length + array2.length);
        int variable = array1.length;
        for (int number : array2) {
            newLength[variable] = number;
            variable++;
        }
        return newLength;
    }

    @Override
    public int[] findMax3InArray(int[] array) {
        if (array.length < 3) {
            return array;
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
        int variableB = 1;
        if (array.length == 0) {
            return 0;
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
    public int sumOfAllUniqueElements(int[] array) {
        int sumArrayElements = 0;
        int[] element = new int[array.length];
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
    public int[] moveZeroes(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
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
    public int findFinalValue(int[] numbs, int original) {
        boolean variableValue = true;
        while (variableValue) {
            variableValue = false;
            for (int number : numbs) {
                if (original == number) {
                    original = number * 2;
                    variableValue = true;
                }
            }
        }
        return original;
    }

    @Override
    public String longestCommonPrefix(String[] words) {
        String longestPrefix = "";
        if (words.length == 0) {
            return longestPrefix;
        }
        if (words.length == 1) {
            return words[0];
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
    public int missingNumber(int[] array) {
        int variableValue;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
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
    public boolean containsDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
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
