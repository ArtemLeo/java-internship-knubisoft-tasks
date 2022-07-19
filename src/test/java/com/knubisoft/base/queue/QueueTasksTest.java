package com.knubisoft.base.queue;

import com.knubisoft.base.queue.car.Car;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueTasksTest {

    QueueTasks queueTasks = new QueueTasksImpl();

    @Test
    void reverseQueueUsingRecursion(){
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);

        Queue<Integer> expectedQueue1 = new LinkedList<>();
        expectedQueue1.add(5);
        expectedQueue1.add(4);
        expectedQueue1.add(3);
        expectedQueue1.add(2);
        expectedQueue1.add(1);
        assertEquals(expectedQueue1, queueTasks.reverseQueueUsingRecursion(queue1));

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(100);
        queue2.add(6);
        queue2.add(12);
        queue2.add(1);
        queue2.add(3);

        Queue<Integer> expectedQueue2 = new LinkedList<>();
        expectedQueue2.add(3);
        expectedQueue2.add(1);
        expectedQueue2.add(12);
        expectedQueue2.add(6);
        expectedQueue2.add(100);
        assertEquals(expectedQueue2, queueTasks.reverseQueueUsingRecursion(queue2));
    }

    @Test
    void reverseFirstKElementsOfQueue() {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        Queue<Integer> expectedQueue1 = new LinkedList<>();
        expectedQueue1.add(3);
        expectedQueue1.add(2);
        expectedQueue1.add(1);
        expectedQueue1.add(4);
        expectedQueue1.add(5);
        assertEquals(expectedQueue1, queueTasks.reverseFirstKElementsOfQueue(queue1, 3));

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(100);
        queue2.add(90);
        queue2.add(80);
        queue2.add(70);
        queue2.add(60);
        queue2.add(50);
        Queue<Integer> expectedQueue2 = new LinkedList<>();
        expectedQueue2.add(50);
        expectedQueue2.add(60);
        expectedQueue2.add(70);
        expectedQueue2.add(80);
        expectedQueue2.add(90);
        expectedQueue2.add(100);
        assertEquals(expectedQueue2, queueTasks.reverseFirstKElementsOfQueue(queue2, 6));

        Queue<Integer> queue3 = new LinkedList<>();
        queue3.add(1);
        queue3.add(2);
        queue3.add(3);
        queue3.add(4);
        queue3.add(5);
        queue3.add(6);
        Queue<Integer> expectedQueue3 = new LinkedList<>();
        expectedQueue3.add(5);
        expectedQueue3.add(4);
        expectedQueue3.add(3);
        expectedQueue3.add(2);
        expectedQueue3.add(1);
        expectedQueue3.add(6);
        assertEquals(expectedQueue3, queueTasks.reverseFirstKElementsOfQueue(queue3, 5));
    }

    @Test
    void sortQueueOfInt() {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(100);
        queue1.add(6);
        queue1.add(12);
        queue1.add(1);
        queue1.add(3);

        Queue<Integer> expectedQueue1 = new LinkedList<>();
        expectedQueue1.add(1);
        expectedQueue1.add(3);
        expectedQueue1.add(6);
        expectedQueue1.add(12);
        expectedQueue1.add(100);
        assertEquals(expectedQueue1, queueTasks.sortQueueOfInt(queue1));

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(87);
        queue2.add(34);
        queue2.add(12);
        queue2.add(28);
        queue2.add(1);

        Queue<Integer> expectedQueue2 = new LinkedList<>();
        expectedQueue2.add(1);
        expectedQueue2.add(12);
        expectedQueue2.add(28);
        expectedQueue2.add(34);
        expectedQueue2.add(87);
        assertEquals(expectedQueue2, queueTasks.sortQueueOfInt(queue2));

        Queue<Integer> queue3 = new LinkedList<>();
        queue3.add(543);
        queue3.add(1000);
        queue3.add(12);
        queue3.add(41);
        queue3.add(2);

        Queue<Integer> expectedQueue3 = new LinkedList<>();
        expectedQueue3.add(2);
        expectedQueue3.add(12);
        expectedQueue3.add(41);
        expectedQueue3.add(543);
        expectedQueue3.add(1000);
        assertEquals(expectedQueue3, queueTasks.sortQueueOfInt(queue3));
    }

    @Test
    void validParentheses() {
        assertTrue(queueTasks.validParentheses("{}"));
        assertFalse(queueTasks.validParentheses("{]"));
        assertTrue(queueTasks.validParentheses("()"));
        assertFalse(queueTasks.validParentheses("[)"));
        assertTrue(queueTasks.validParentheses("{{[]}}"));
        assertTrue(queueTasks.validParentheses("[({()})]"));
        assertFalse(queueTasks.validParentheses("{(})"));
        assertFalse(queueTasks.validParentheses("([)]"));
    }

    @Test
    void implementPriorityQueueThroughComparator() {
        Car mercedes = new Car("Mercedes", 10000.500);
        Car vw = new Car("Volkswagen", 6000.250);
        Car bmw = new Car("BWM", 9500.0);
        Car mazda = new Car("Mazda", 6500.150);
        Car hyundai = new Car("Hyundai", 5000.175);
        Car toyota = new Car("Toyota", 7000.190);

        List<Car> cars = List.of(hyundai, vw, toyota, mercedes, bmw, mazda);
        PriorityQueue<Car> carsQueue = queueTasks.implementPriorityQueueThroughComparator(cars);

        //car names in ascending order of price
        String expected = "Hyundai Volkswagen Mazda Toyota BWM Mercedes";
        StringBuilder actual = new StringBuilder();
        while (!carsQueue.isEmpty())
            actual.append(carsQueue.poll().getBrand()).append(" ");
        assertEquals(expected, actual.toString().strip());
    }
}