package com.knubisoft.base.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTasksTest {

    private ArraysTasks arraysTasks = new ArraysTasksImpl();

    @Test
    void reverse() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arraysTasks.reverse(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{40, 30, 20, 10}, arraysTasks.reverse(new int[]{10, 20, 30, 40}));
        assertArrayEquals(new int[]{400, 300, 200, 100}, arraysTasks.reverse(new int[]{100, 200, 300, 400}));
        assertArrayEquals(new int[]{12, 876, 334, 324234}, arraysTasks.reverse(new int[]{324234, 334, 876, 12}));
        assertArrayEquals(new int[]{101, 1000, 1, 1000, 100}, arraysTasks.reverse(new int[]{100, 1000, 1, 1000, 101}));
        assertArrayEquals(new int[]{4, 333398, 23434, 578642334}, arraysTasks.reverse(new int[]{578642334, 23434, 333398, 4}));
        assertArrayEquals(new int[]{-423, -98, 23434, 534}, arraysTasks.reverse(new int[]{534, 23434, -98, -423}));
        assertArrayEquals(new int[]{0, -2, 23, 5}, arraysTasks.reverse(new int[]{5, 23, -2, 0}));
        assertArrayEquals(new int[]{0}, arraysTasks.reverse(new int[]{0}));
        assertArrayEquals(new int[]{Integer.MAX_VALUE}, arraysTasks.reverse(new int[]{Integer.MAX_VALUE}));
        assertArrayEquals(new int[0], arraysTasks.reverse(new int[0]));
    }

    @Test
    void mergeArrays() {
        int[] firstMergedArray = arraysTasks.mergeArrays(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10});
        int[] secondMergedArray = arraysTasks.mergeArrays(new int[]{23, 456, 222, 22}, new int[]{1234, 543, 221});
        int[] thirdMergedArray = arraysTasks.mergeArrays(new int[]{17}, new int[]{12345, 6789, 101112, 2});
        int[] fourthMergedArray = arraysTasks.mergeArrays(new int[]{1}, new int[]{1});
        int[] fifthMergedArray = arraysTasks.mergeArrays(new int[0], new int[0]);
        int[] sixthMergedArray = arraysTasks.mergeArrays(new int[0], new int[]{27, 11});
        int[] seventhMergedArray = arraysTasks.mergeArrays(new int[]{4567, 11}, new int[0]);
        int[] eighthMergedArray = arraysTasks.mergeArrays(new int[]{-1, -2, -3, -4}, new int[]{5, 6, 7, 8});
        int[] ninthMergedArray = arraysTasks.mergeArrays(new int[]{Integer.MIN_VALUE}, new int[]{Integer.MAX_VALUE});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, firstMergedArray);
        assertArrayEquals(new int[]{23, 456, 222, 22, 1234, 543, 221}, secondMergedArray);
        assertArrayEquals(new int[]{17, 12345, 6789, 101112, 2}, thirdMergedArray);
        assertArrayEquals(new int[]{1, 1}, fourthMergedArray);
        assertArrayEquals(new int[0], fifthMergedArray);
        assertArrayEquals(new int[]{27, 11}, sixthMergedArray);
        assertArrayEquals(new int[]{4567, 11}, seventhMergedArray);
        assertArrayEquals(new int[]{-1, -2, -3, -4, 5, 6, 7, 8}, eighthMergedArray);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, ninthMergedArray);
    }

    @Test
    void findMax3InArray() {
        int[] first3MaxInts = arraysTasks.findMax3InArray(new int[]{1, 2, 3, 4, 5, 6});
        int[] second3MaxInts = arraysTasks.findMax3InArray(new int[]{255, 20, 22, 1, 2});
        int[] third3MaxInts = arraysTasks.findMax3InArray(new int[]{0, 219, 17});
        int[] fourth3MaxInts = arraysTasks.findMax3InArray(new int[]{456, 789, 22, 234, 21, 678});
        int[] fifth3MaxInts = arraysTasks.findMax3InArray(new int[]{10, 9, 8, 7, 6, 5});
        int[] sixth3MaxInts = arraysTasks.findMax3InArray(new int[]{123452222, 485757377, 133343221, 567654, 1112335, 1});
        int[] seventh3MaxInts = arraysTasks.findMax3InArray(new int[]{1, 2}); //invalid input
        int[] eighth3MaxInts = arraysTasks.findMax3InArray(new int[]{Integer.MAX_VALUE}); //invalid input
        int[] ninth3MaxInts = arraysTasks.findMax3InArray(new int[0]); //invalid input
        assertArrayEquals(new int[]{6, 5, 4}, first3MaxInts);
        assertArrayEquals(new int[]{255, 22, 20}, second3MaxInts);
        assertArrayEquals(new int[]{219, 17, 0}, third3MaxInts);
        assertArrayEquals(new int[]{789, 678, 456}, fourth3MaxInts);
        assertArrayEquals(new int[]{10, 9, 8}, fifth3MaxInts);
        assertArrayEquals(new int[]{485757377, 133343221, 123452222}, sixth3MaxInts);
        assertArrayEquals(new int[]{1, 2}, seventh3MaxInts);
        assertArrayEquals(new int[]{Integer.MAX_VALUE}, eighth3MaxInts);
        assertArrayEquals(new int[0], ninth3MaxInts);
    }

    @Test
    void findLongestIncreasingContinuesSubsequence() {
        assertEquals(4, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{1, 45, 23, 27, 45, 78, 1}));
        assertEquals(6, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{234, 1, 2, 3, 98, 345, 1010}));
        assertEquals(3, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{20345, 237, 10156, 10256, 10250}));
        assertEquals(5, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{12, 13, 12, 13, 12, 13, 12}));
        assertEquals(0, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[0]));
        assertEquals(1, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}));
        assertEquals(1, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{22, 22, 22, 22, 22, 22, 22, 22, 22}));
        assertEquals(1, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{3456, 3455, 3454, 3453}));
        assertEquals(8, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{1, 0, 345, 432, 567, 661, 789, 888, 901}));
        assertEquals(3, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{-1, 0, 1}));
        assertEquals(6, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{-345, -454, -341, -221, -100, -1, 0}));
        assertEquals(1, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        assertEquals(2, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{-1, 0, 0, 1}));
        assertEquals(5, arraysTasks.findLongestIncreasingContinuesSubsequence(new int[]{344, 23, 12, 456, 555, 661, 777, 10}));
    }

    @Test
    void sumOfAllUniqueElements() {
        assertEquals(115, arraysTasks.sumOfAllUniqueElements(new int[]{11, 26, 11, 56, 22, 26}));
        assertEquals(-1, arraysTasks.sumOfAllUniqueElements(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}));
        assertEquals(240, arraysTasks.sumOfAllUniqueElements(new int[]{18, 222, 18, 222, 18, 222}));
        assertEquals(482, arraysTasks.sumOfAllUniqueElements(new int[]{67, 234, 12, 78, 91, 91}));
        assertEquals(0, arraysTasks.sumOfAllUniqueElements(new int[0]));
        assertEquals(-24, arraysTasks.sumOfAllUniqueElements(new int[]{-1, -45, -1, 0, 22}));
        assertEquals(720, arraysTasks.sumOfAllUniqueElements(new int[]{345, 45, 218, 45, 22, 90, 345}));
        assertEquals(115, arraysTasks.sumOfAllUniqueElements(new int[]{-1, -2, -1, -2, -1, -2, -45, -18, -19, 200}));
        assertEquals(266, arraysTasks.sumOfAllUniqueElements(new int[]{246, 1, 2, 3, 4, 10, 246, 10, 1}));
        assertEquals(500, arraysTasks.sumOfAllUniqueElements(new int[]{500, 0, 500}));
        assertEquals(464, arraysTasks.sumOfAllUniqueElements(new int[]{235, 190, 19, 20}));
    }

    @Test
    void moveZeroes() {
        assertArrayEquals(new int[]{12, 45, 78, 11, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{0, 12, 0, 45, 78, 0, 11}));
        assertArrayEquals(new int[]{78, 22, 11, 123, 0, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{78, 0, 22, 0, 11, 0, 123, 0}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{0, 1, 0, 0}));
        assertArrayEquals(new int[]{78, 234, 17, 12, 0, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{78, 0, 0, 234, 0, 17, 12, 0}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{0, 0, 0, 0, 0}));
        assertArrayEquals(new int[]{-34, -1, -456, -123, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{-34, 0, -1, 0, -456, 0, -123}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{1, 2, 0, 0, 0, 3, 4, 5, 6, 7, 0}));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1}, arraysTasks.moveZeroes(new int[]{1, 1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{-5, -12, -17, 0, 0, 0, 0, 0, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{0, 0, 0, 0, -5, -12, -17, 0, 0, 0, 0}));
        assertArrayEquals(new int[]{99, 0, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{0, 0, 0, 0, 99}));
        assertArrayEquals(new int[]{217, 567, 19, 22, 19, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{217, 0, 567, 19, 22, 0, 19, 0}));
        assertArrayEquals(new int[]{91, 22, 46, 7, 1, 0, 0, 0, 0}, arraysTasks.moveZeroes(new int[]{91, 22, 46, 0, 0, 0, 7, 0, 1}));
    }

    @Test
    void findFinalValue() {
        assertEquals(64, arraysTasks.findFinalValue(new int[]{20, 2, 4, 1, 8, 10, 16, 32}, 2));
        assertEquals(2, arraysTasks.findFinalValue(new int[]{3, 1, 6, 18, 198, 17, 3, 11}, 1));
        assertEquals(864, arraysTasks.findFinalValue(new int[]{216, 432, 6, 12, 1, 10, 108, 56, 23, 54}, 54));
        assertEquals(108, arraysTasks.findFinalValue(new int[]{20, 2, 4, 1, 8, 10, 16, 32}, 108));
        assertEquals(59, arraysTasks.findFinalValue(new int[]{0}, 59));
        assertEquals(Integer.MAX_VALUE, arraysTasks.findFinalValue(new int[0], Integer.MAX_VALUE));
        assertEquals(1024, arraysTasks.findFinalValue(new int[]{512, 22, 5, 256, 128, 64}, 64));
        assertEquals(40, arraysTasks.findFinalValue(new int[]{20, 257, 41, 10, 8, 10, 161, 329, 5}, 5));
        assertEquals(32, arraysTasks.findFinalValue(new int[]{2, 4, 8, 16, 31}, 2));
        assertEquals(232, arraysTasks.findFinalValue(new int[]{116, 23, 17, 22, 58, 1, 29}, 29));
        assertEquals(50000, arraysTasks.findFinalValue(new int[]{25000, 111, 12500, 234, 6250, 3125, 221, 789064}, 6250));
    }

    @Test
    void longestCommonPrefix() {
        assertEquals("appl", arraysTasks.longestCommonPrefix(new String[]{"apple", "applause", "application"}));
        assertEquals("java", arraysTasks.longestCommonPrefix(new String[]{"java", "javac", "javadoc"}));
        assertEquals("a", arraysTasks.longestCommonPrefix(new String[]{"animal", "alligator", "anchor"}));
        assertEquals("dev", arraysTasks.longestCommonPrefix(new String[]{"developer", "devote", "device"}));
        assertEquals("", arraysTasks.longestCommonPrefix(new String[]{"postgres", "mysql", "oracle", "mongo", "redis"}));
        assertEquals("java1", arraysTasks.longestCommonPrefix(new String[]{"java11", "java14", "java16", "java17", "java1.8"}));
        assertEquals("", arraysTasks.longestCommonPrefix(new String[]{"view", "viewer", "spring"}));
        assertEquals("car", arraysTasks.longestCommonPrefix(new String[]{"car", "carrier", "cartoon"}));
        assertEquals("string", arraysTasks.longestCommonPrefix(new String[]{"string", "string", "string"}));
        assertEquals("", arraysTasks.longestCommonPrefix(new String[0]));
        assertEquals("1word", arraysTasks.longestCommonPrefix(new String[] {"1word"}));
        assertEquals("fl", arraysTasks.longestCommonPrefix(new String[] {"flower", "flown", "fly"}));
    }

    @Test
    void missingNumber() {
        assertEquals(2, arraysTasks.missingNumber(new int[] {3,0,1}));
        assertEquals(9, arraysTasks.missingNumber(new int[] {10,8,5,6,3,7,2,0,1,4}));
        assertEquals(2, arraysTasks.missingNumber(new int[] {0,1}));
        assertEquals(3, arraysTasks.missingNumber(new int[] {0,1,2,4,5,6,7,8,9,10}));
        assertEquals(1, arraysTasks.missingNumber(new int[] {0,2,3,4}));
        assertEquals(13, arraysTasks.missingNumber(new int[] {15,2,6,14,10,9,12,11,1,0,3,5,4,8,7}));
        assertEquals(0, arraysTasks.missingNumber(new int[] {1,2,3,4,5,6,7,8,9,10}));
        assertEquals(4, arraysTasks.missingNumber(new int[] {5,1,2,3,0}));
        assertEquals(15, arraysTasks.missingNumber(new int[] {20,19,18,17,10,11,2,3,7,8,9,16,14,13,12,4,5,0,1,6}));
        assertEquals(5, arraysTasks.missingNumber(new int[] {0,1,9,8,6,7,4,2,3}));
        assertEquals(9, arraysTasks.missingNumber(new int[] {6,7,8,1,2,3,4,5,0,10}));
    }

    @Test
    void containsDuplicate() {
        assertTrue(arraysTasks.containsDuplicate(new int[] {1,2,3,1,5,6,7,8}));
        assertFalse(arraysTasks.containsDuplicate(new int[] {1,2,3,4,5,6,7,8,9,10}));
        assertTrue(arraysTasks.containsDuplicate(new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE}));
        assertFalse(arraysTasks.containsDuplicate(new int[] {234,21,6789,122223,Integer.MIN_VALUE}));
        assertTrue(arraysTasks.containsDuplicate(new int[] {0,0,-1,1,12}));
        assertFalse(arraysTasks.containsDuplicate(new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE}));
        assertTrue(arraysTasks.containsDuplicate(new int[] {250,456,123,90,87,250,133,-1,-453,0}));
        assertFalse(arraysTasks.containsDuplicate(new int[] {1000,2000,3000,0,-1000,-2000,-3000}));
        assertTrue(arraysTasks.containsDuplicate(new int[] {18,23,79,90,2456,23,18,90}));
        assertFalse(arraysTasks.containsDuplicate(new int[] {546,Integer.MAX_VALUE,234,-11,18,Integer.MIN_VALUE,51,2}));
    }
}