package com.knubisoft.base.arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int rev = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = rev;
        }
        return array;
    }

    @Override
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] merge = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            merge[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            merge[array1.length + i] = array2[i];
        }
        return merge;
    }

    @Override
    public int[] findMax3InArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int firstValue = array[i];

            for (int x = array.length - 1; x >= 0; x--) {
                int lastValue = array[x];

                if (firstValue > lastValue) {
                    array = ArrayUtils.remove(array, x);

                        if (array.length == 3) {

                            return array;
                        }
                }
            }
        }
        return null;
    }

    @Override
    public int findLongestIncreasingContinuesSubsequence(int[] array) {
        return -1;
    }

    @Override
    public int sumOfAllUniqueElements(int[] array) {
        return -1;
    }

    @Override
    public int[] moveZeroes(int[] array) {
        return null;
    }

    @Override
    public int findFinalValue(int[] nums, int original) {
        return -1;
    }

    @Override
    public String longestCommonPrefix(String[] words) {
        return null;
    }

    @Override
    public int missingNumber(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        int number = array.length;
        for (int i = 0; i < number; i++) {
            if (i != array[i]) {
                number = i;
                break;
            }
        }
        return number;
    }

    @Override
    public boolean containsDuplicate(int[] array) {
        return false;
    }
}
