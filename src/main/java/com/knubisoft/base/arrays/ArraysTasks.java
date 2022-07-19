package com.knubisoft.base.arrays;

public interface ArraysTasks {

    /***
     * Given an array, the task is to reverse the given array.
     *
     * Example 1:
     *
     *     input : [1,2,3,4,5]
     *     output: [5,4,3,2,1]
     *
     * Example 2:
     *
     *     input : [280,345,1,280,1]
     *     output: [1,280,1,345,280]
     *
     * @param array Array with integers.
     * @return array Reversed array.
     */
    int[] reverse(int[] array);

    /**
     * You are given two integer arrays array1 and array2, the task is to merge array1 and array2 into a single array.
     * The elements of the second array must come after all the elements of the first.
     *
     * Example 1:
     *
     *     input: array1 = [1,2,3,4,5] array2 = [34,8,12,17]
     *     output: [1,2,3,4,5,34,8,12,17]
     *
     * Example 2:
     *
     *     input: array1 = [46,245,12,78956,234] array2 = [10,20,30,40]
     *     output: [46,245,12,78956,234,10,20,30,40]
     *
     * @param array1 Array with integers.
     * @param array2 Array with integers.
     * @return Merged array.
     */
    int[] mergeArrays(int[] array1, int[] array2);

    /**
     * Given an array with all distinct positive integers, find the largest three elements in the array.
     *
     * Example 1:
     *
     *     input: [10,1,27,99,123,19,20]
     *     output: [123, 99, 27]
     *
     * Example 2:
     *
     *     input: [234,4,67,1,98,235,7,1020]
     *     output [1020,235,234]
     *
     * If the number of elements in the input array is less than 3, just return it.
     *
     * Example with invalid input:
     *
     *     input: [17,23]
     *     output [17,23]
     *
     * @param array Array with integers.
     * @return Array with 3 largest integers.
     */
    int[] findMax3InArray(int[] array);

    /**
     * Given an integer array, return the length of the longest continuous increasing subsequence.
     * The subsequence must be strictly increasing.
     *
     * Example 1:
     *
     *     input: [1,3,5,4,7]
     *     output: 3
     *     explanation: The longest continuous increasing subsequence is [1,3,5]
     *
     * Example 2:
     *
     *     input: [50, 3, 10, 15, 22, 90, 20, 71]
     *     output: 5
     *     explanation: The longest continuous increasing subsequence is [3,10,15,22,90]
     *
     * Example 3:
     *
     *     input: [10,9,2,5,3,7,101,18]
     *     output: 3
     *     explanation: The longest continuous increasing subsequence is [3,7,101]
     *
     * Example 4:
     *
     *     input: [2,2,2,2,2]
     *     output: 1
     *     explanation: The longest continuous increasing subsequence is [2]
     *
     * @param array Array with integers.
     * @return Length of the longest continuous increasing subsequence.
     */
    int findLongestIncreasingContinuesSubsequence(int[] array);

    /**
     * Given an array of integers that contains duplicates as well.
     * Implement the method to find the sum of all unique elements in the array.
     * This problem is also referred to as find the sum of all distinct elements in the array.
     *
     * Example 1:
     *
     *     input: [22,17,35,22,90,17]
     *     output: 164
     *     explanation: Unique elements are 22, 17, 35, 90
     *
     * Example 2:
     *
     *     input: [1,6,4,3,2,2,3,8,1]
     *     output: 24
     *     explanation: Unique elements are 1, 6, 4, 3, 2, 8
     *
     * Example 3:
     *
     *     input: [1,1,3,2,2,3]
     *     output: 6
     *     explanation: Unique elements are 1, 2, 3
     *
     * Example 4:
     *
     *     input: [7,7,7,7]
     *     output: 7
     *     explanation: Only one unique element 7
     *
     * @param array Array with integers.
     * @return Sum of all unique elements in the array.
     */
    int sumOfAllUniqueElements(int[] array);

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     *
     * Example 1:
     *
     *     input: [0,10,0,0,12,0,15]
     *     output: [10,12,15,0,0,0,0]
     *
     * Example 2:
     *
     *     input: [345,0,12,12,0,78,0]
     *     output: [345,12,12,78,0,0,0]
     *
     * @param array Array with integers.
     * @return Array with zeros moved to the end.
     */
    int[] moveZeroes(int[] array);

    /**
     * You are given an array of integers nums.
     * You are also given an integer original which is the first number that needs to be searched for in nums.
     *
     * You then do the following steps:
     *     1.If original is found in nums, multiply it by two (i.e., set original = 2 * original).
     *     2.Otherwise, stop the process.
     *     3.Repeat this process with the new number as long as you keep finding the number.
     * Return the final value of original.
     *
     * Example 1:
     *
     *     input: nums = [5,3,6,1,12], original = 3
     *     output: 24
     *     explanation:
     *     - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
     *     - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
     *     - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
     *     - 24 is not found in nums. Thus, 24 is returned.
     *
     * Example 2:
     *
     *     input: nums = [2,7,9], original = 4
     *     output: 4
     *     explanation:
     *     - 4 is not found in nums. Thus, 4 is returned.
     *
     * @param nums Array with integers.
     * @param original First number that needs to be searched.
     * @return Final value of original.
     */
    int findFinalValue(int[] nums, int original);

    /**
     * Given an array of strings, find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     *
     * Example 1:
     *
     *     input: ["apple", "ape", "april"]
     *     output: "ap"
     *
     * Example 2:
     *
     *     input: ["flower","flow","flight"]
     *     output: "fl"
     *
     * Example 3:
     *
     *     input: ["dog","racecar","car"]
     *     output: ""
     *
     * @param words Array with strings.
     * @return Longest Common Prefix.
     */
    String longestCommonPrefix(String[] words);

    /**
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     *
     * Example 1:
     *
     *     input: nums = [3,0,1]
     *     output: 2
     *     explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
     *     2 is the missing number in the range since it does not appear in nums.
     *
     * Example 2:
     *
     *     input: nums = [0,1]
     *     output: 2
     *     explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
     *     2 is the missing number in the range since it does not appear in nums.
     *
     * Example 3:
     *
     *     input: nums = [9,6,4,2,3,5,7,0,1]
     *     output: 8
     *     explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
     *     8 is the missing number in the range since it does not appear in nums.
     *
     * @param array Array with integers.
     * @return Missing number
     */
    int missingNumber(int[] array);

    /**
     * Given an integer array, return true if any value appears at least twice in the array, and return false
     * if every element is distinct.
     *
     * Example 1:
     *
     *     input: [1,1,1,3,3,4,3,2,4,2]
     *     output: true
     *
     * Example 2:
     *
     *     input: [1,2,3,4]
     *     output: false
     *
     * Example 2:
     *
     *     input: [10,2,1,45,67,32,11,109,209,2,1,10]
     *     output: true
     *
     * @param array Array with integers.
     */
    boolean containsDuplicate(int[] array);

}
