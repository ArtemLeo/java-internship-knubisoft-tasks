package com.knubisoft.base.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface ListTasks {
    /**
     * Add elements from the array to list.
     * */
    List<String> addElements(String ... elements);
    /**
     * Get elements by indexes and return a new list.
     * */
    List<String> getElementsByIndexes(List<String> elements, int[] indexes);
    /**
     * Add elements by indexes and return a new list.
     * */
    ArrayList<String> addElementsByIndexes(ArrayList<String> elements, int[] indexes);
    /**
     * Set elements by indexes and return a new list.
     * */
    LinkedList<String> setElementsByIndexes(LinkedList<String> elements, int[] indexes);
    /**
     * Get size of list.
     * */
    int getListSize(List<String> list);
    /**
     * Write a java program to merge all params in one list.
     * Before that check on internal values if they can be parsed in the Long type.
     * Example 1:
     *      input: {{1,2,3}, {123515235123123, 3874238417264}, {'1', '2'}}
     *      output: {1,2,3,123515235123123,3874238417264,1,2}
     * Example 2:
     *      input: {{1,2,3}, {123515235123123, 3874238417264}, {'John', '2'}}
     *      output: {Collection.empty()}
     * @param first - first collection.
     * @param second - second collection.
     * @param third - third collection.
     * */
    List<Long> merge(List<Integer> first, List<Long> second, List<String> third);
    /**
     * You have to write a java program to find max value from lists.
     * Example 1:
     *      input: {{4,1,5,2,6},{9,4,125,654,1},{9124,2357,1,1,2}}
     *      output: {9124}
     * Example 2:
     *      input: {{4,1,5,2,6},{9,4,1,0,1},{1,1,1,1,2}}
     *      output: {9}
     * @param first - first collection.
     * @param second - second collection.
     * @param third - third collection.
     * */
    int findMaxValue(List<Integer> first, List<Integer> second, List<Integer> third);
    /**
     * You have to write a java program to find min value from lists.
     * Example 1:
     *      input: {{4,1,0,2,6},{9,4,125,654,1},{9124,2357,1,1,2}}
     *      output: {0}
     * Example 2:
     *      input: {{4,1,5,2,6},{9,4,1,0,1},{-1,1,1,1,2}}
     *      output: {-1}
     * @param first - first collection.
     * @param second - second collection.
     * @param third - third collection.
     * */
    int findMinValue(List<Integer> first, List<Integer> second, List<Integer> third);
    /**
     * You have to write a java program to find max 2 elements from all lists and multiply their.
     * Example 1:
     *      input: {{4,1,0,2,6},{9,4,125,45,1},{87,124,1,1,2}}
     *      output: {15500}
     * Example 2:
     *      input: {{4,1,5,2,6},{9,4,1,0,1},{-1,1,1,1,2}}
     *      output: {36}
     * @param first - first collection.
     * @param second - second collection.
     * @param third - third collection.
     * */
    int multiplyMax2Elements(List<Integer> first, List<Integer> second, List<Integer> third);
    /**
     * You have to write a java program to find all nulls and remove their from the list
     * Example 1:
     *      input: {null,1,4,6,null,123,null}
     *      output: {1,4,6,123}
     * Example 2:
     *      input: {1253,1,null,6,null,123,null}
     *      output: {1253,1,6,123}
     * @param list - collection with nulls.
     * */
    List<String> removeNulls(List<String> list);
    /**
     * You have to write a java program to find all nulls and remove their from the list. Try to use Stream API.
     * Example 1:
     *      input: {{null,1,4,6,null,123,null}}
     *      output: {1,4,6,123}
     * Example 2:
     *      input: {1253,1,null,6,null,123,null}
     *      output: {1253,1,6,123}
     * @param list - collection with nulls.
     * */
    List<Integer> flatMapWithoutNulls(List<List<Integer>> list);
    /**
     * Write a Java program to clone an array list to another array list without nulls.
     * Example 1:
     *      input: {null,1,4,6,null,123,null}
     *      output: {1,4,6,123}
     * Example 2:
     *      input: {1253,1,null,6,null,123,null}
     *      output: {1253,1,6,123}
     * @param originalIds - original collection.
     * */
    List<Integer> cloneIds(List<Integer> originalIds);
    /**
     * Write a Java program to shuffle the elements in a linked list.
     * Example 1:
     *      input: {'Red', 'Green', 'Blue', 'orange'}
     *      output: {'Green', 'Red', 'orange', 'Blue'}
     * Example 2:
     *      input: {'Red', 'Green', 'Blue', 'orange'}
     *      output: {'orange', 'Red', 'Green', 'Blue'}
     * Example 3:
     *      input: {'Red', 'Green', 'Blue', 'orange'}
     *      output: {'orange', 'Green', 'Red', 'Blue'}
     * @param originalStrings - original collection.
     * */
    List<String> shuffle(List<String> originalStrings);
    /**
     * Write a Java program to retrieve but does not remove, the last element of a linked list.
     * Example 1:
     *      input: {'Red', 'Green', 'Blue', 'orange'}
     *      output: {'orange'}
     * Example 2:
     *      input: {'Red', 'Green', 'orange', 'Blue'}
     *      output: {'Blue'}
     * Example 3:
     *      input: {'Red', 'orange', 'Blue', 'Green'}
     *      output: {'Green'}
     * @param list - original list.
     * */
    String getLastElement(LinkedList<String> list);
    /**
     * Write a Java program to compare two linked lists and will return elements if the value exists in the both.
     * Example 1:
     *      input: {{'Red', 'Green', 'Blue'},{'orange', 'Blue'}}
     *      output: {'Blue'}
     * Example 2:
     *      input: {{'Red', 'Green', 'orange', 'Blue'},{'Pink'}}
     *      output: {Collection.empty()}
     * */
    List<String> compareElements(LinkedList<String> originalCollection, LinkedList<String> additionalCollection);

}
