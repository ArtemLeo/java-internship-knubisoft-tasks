package com.knubisoft.base.queue;

import com.knubisoft.base.queue.car.Car;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public interface QueueTasks {

    /**
     * Given a queue, write a recursive function to reverse it.
     *
     * Standard operations allowed :
     * enqueue(x) : Add an item x to rear of queue.
     * dequeue() : Remove an item from front of queue.
     * empty() : Checks if a queue is empty or not.
     *
     * Example 1:
     *
     *     input: [5, 24, 9, 6, 8, 4, 1, 8, 3, 6]
     *     output: [6, 3, 8, 1, 4, 8, 6, 9, 24, 5]
     *
     * Example 2:
     *
     *     input: [8, 7, 2, 5, 1]
     *     output: [1, 5, 2, 7, 8]
     *
     * @param queue Queue of integers.
     * @return Reversed queue.
     */
    Queue<Integer> reverseQueueUsingRecursion(Queue<Integer> queue);

    /**
     * Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue,
     * leaving the other elements in the same relative order.
     *
     * Example 1:
     *
     *     input: queue - [1,2,3,4,5], k - 3
     *     output: [3,2,1,4,5]
     *     explanation: After reversing the given input from the 3rd position the resultan output will be 3 2 1 4 5.
     *
     * Example 2:
     *
     *     input: queue - [4,3,2,1], k-4
     *     output: [1,2,3,4]
     *     explanation: After reversing the give input from the 4th position the resultant output will be 1 2 3 4.
     *
     * @param queue Queue of integers.
     * @param k Number of first elements to reverse.
     * @return Modified queue.
     */
    Queue<Integer> reverseFirstKElementsOfQueue(Queue<Integer> queue, int k);

    /**
     * Given a queue with integer values in a random sequence, your task is to sort the values in ascending order.
     *
     * Example:
     *
     *     input: [45,12,89,22,11,23]
     *     output: [11,12,22,23,45,89]
     *
     * @param queue Queue of integers.
     * @return Sorted queue.
     */
    Queue<Integer> sortQueueOfInt(Queue<Integer> queue);


    /**
     * Given a string parentheses containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     *
     * An input string is valid if:
     *
     *     1.Open brackets must be closed by the same type of brackets.
     *     2.Open brackets must be closed in the correct order.
     *
     * Note: to solve this task, you must use the Deque or Queue data structure.
     *
     * Example 1:
     *
     *     input: "()"
     *     output: true
     *
     * Example 2:
     *
     *     input: "()[]{}"
     *     output: true
     *
     * Example 3:
     *
     *     input: "({[]})"
     *     output: true
     *
     * Example 4:
     *
     *     input: "{)"
     *     output: false
     *
     * @param parentheses String containing parentheses.
     */
    boolean validParentheses(String parentheses);

    /**
     * Your task is to implement a comparator (com.knubisoft.base.queue.car.CarComparator)
     * for the Car class (com.knubisoft.base.queue.car.Car), then implement a method whose result will return
     * a PriorityQueue that stores all the cars from the list (List<Car> cars) and uses your implemented comparator.
     *
     * Note: Comparator must compare car prices in ascending order.
     *
     * (Priority Queue is like a regular queue, but each element has a “priority” associated with it.
     * In a priority queue, an element with high priority is served before an element with low priority.
     * For this, it uses a comparison function which imposes a total ordering of the elements.
     * The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided
     * at queue construction time, depending on which constructor is used)
     *
     * @param cars List of cars (com.knubisoft.base.queue.car.Car).
     * @return Priority Queue of cars
     */
    PriorityQueue<Car> implementPriorityQueueThroughComparator(List<Car> cars);


}
