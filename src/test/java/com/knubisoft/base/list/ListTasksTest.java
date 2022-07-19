package com.knubisoft.base.list;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ListTasksTest {

    ListTasks instance = new ListTasksImpl();

    @Test
    public void addElementsSuccessful() {
        List<String> actual = instance.addElements("Alex", "Bob", "Alica");
        List<String> expected = Arrays.asList("Alex", "Bob", "Alica");
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
        assertEquals(3, actual.size());
        assertEquals("Bob", actual.get(1));
        assertTrue(actual.contains("Alica"));
        assertFalse(actual.isEmpty());
        assertEquals(Collections.emptyList(), instance.addElements());
    }

    @Test
    public void addElementsFail() {
        List<String> actual = instance.addElements("Alex", "Bob", "Alica");
        List<String> expected = Arrays.asList("Tomeu", "Sergio", "Juan");
        for (int i = 0; i < actual.size(); i++) {
            assertNotEquals(expected.get(i), actual.get(i));
        }
        assertFalse(actual.contains("Andreu"));
        assertFalse(actual.size() > 3);
    }

    @Test
    public void getElementsByIndexesSuccessful() {
        List<String> actualFirst = instance
                .getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 3});
        assertEquals("Alex", actualFirst.get(0));
        assertEquals("Bob", actualFirst.get(1));
        assertEquals("Alica", actualFirst.get(2));
        assertEquals("Alica", actualFirst.get(3));
        assertEquals("Alica", actualFirst.get(4));

        List<String> actualSecond = instance
                .getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 2, 1});
        assertEquals("Alex", actualSecond.get(0));
        assertEquals("Bob", actualSecond.get(1));
        assertEquals("Alica", actualSecond.get(2));
        assertEquals("Alica", actualSecond.get(3));
        assertEquals("Alica", actualSecond.get(4));
        assertEquals("Bob", actualSecond.get(5));

        List<String> actualThird = instance
                .getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1});
        assertEquals("Alex", actualThird.get(0));
        assertEquals("Bob", actualThird.get(1));
        assertEquals("Alica", actualThird.get(2));
        assertEquals("Alica", actualThird.get(3));
        assertEquals("Bob", actualThird.get(4));

        List<String> actualFourth = instance
                .getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1, 1, 1});
        assertEquals("Alex", actualFourth.get(0));
        assertEquals("Bob", actualFourth.get(1));
        assertEquals("Alica", actualFourth.get(2));
        assertEquals("Alica", actualFourth.get(3));
        assertEquals("Bob", actualFourth.get(4));
        assertEquals("Bob", actualFourth.get(5));
        assertEquals("Bob", actualFourth.get(6));
    }

    @Test
    public void getElementsByIndexesFail() {
        assertThrows(IllegalArgumentException.class,
                () -> instance.getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), null));
        assertThrows(IllegalArgumentException.class,
                () -> instance.getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {2, Integer.MIN_VALUE}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {Integer.MAX_VALUE, -1}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {0, Integer.MAX_VALUE}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.getElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    public void addElementsByIndexesSuccessful() {
        ArrayList<String> actualFirst = instance
                .addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 3});
        assertEquals("Alex", actualFirst.get(0));
        assertEquals("Bob", actualFirst.get(1));
        assertEquals("Alica", actualFirst.get(2));
        assertEquals("Alica", actualFirst.get(3));
        assertEquals("Alica", actualFirst.get(4));

        ArrayList<String> actualSecond = instance
                .addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1});
        assertEquals("Alex", actualSecond.get(0));
        assertEquals("Bob", actualSecond.get(1));
        assertEquals("Bob", actualSecond.get(2));
        assertEquals("Alica", actualSecond.get(3));
        assertEquals("Alica", actualSecond.get(4));

        ArrayList<String> actualThird = instance
                .addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1});
        assertEquals("Alex", actualThird.get(0));
        assertEquals("Bob", actualThird.get(1));
        assertEquals("Bob", actualThird.get(2));
        assertEquals("Alica", actualThird.get(3));
        assertEquals("Alica", actualThird.get(4));

        ArrayList<String> actualFourth = instance
                .addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1, 1, 1});
        assertEquals("Alex", actualFourth.get(0));
        assertEquals("Bob", actualFourth.get(1));
        assertEquals("Bob", actualFourth.get(2));
        assertEquals("Bob", actualFourth.get(3));
        assertEquals("Bob", actualFourth.get(4));
        assertEquals("Alica", actualFourth.get(5));
        assertEquals("Alica", actualFourth.get(6));
    }

    @Test
    public void addElementsByIndexesFail() {
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), null));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {2, Integer.MIN_VALUE}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {Integer.MAX_VALUE, -1}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {0, Integer.MAX_VALUE}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    public void setElementsByIndexesSuccessful() {
        LinkedList<String> actualFirst = instance
                .setElementsByIndexes(new LinkedList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 2});
        assertEquals("Alex", actualFirst.get(0));
        assertEquals("Bob", actualFirst.get(1));
        assertEquals("Alica", actualFirst.get(2));

        LinkedList<String> actualSecond = instance
                .setElementsByIndexes(new LinkedList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1, 2});
        assertEquals("Alex", actualSecond.get(0));
        assertEquals("Bob", actualSecond.get(1));
        assertEquals("Alica", actualSecond.get(2));

        LinkedList<String> actualThird = instance
                .setElementsByIndexes(new LinkedList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1});
        assertEquals("Alex", actualThird.get(0));
        assertEquals("Bob", actualThird.get(1));
        assertEquals("Alica", actualThird.get(2));

        LinkedList<String> actualFourth = instance
                .setElementsByIndexes(new LinkedList<>(Arrays.asList("Alex", "Bob", "Alica")), new int[]{2, 1, 1, 1});
        assertEquals("Alex", actualFourth.get(0));
        assertEquals("Bob", actualFourth.get(1));
        assertEquals("Alica", actualFourth.get(2));
    }

    @Test
    public void setElementsByIndexesFail() {
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")), null));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {2, Integer.MIN_VALUE}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {Integer.MAX_VALUE, -1}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {0, Integer.MAX_VALUE}));
        assertThrows(IllegalArgumentException.class,
                () -> instance.addElementsByIndexes(new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica")),
                        new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    public void getListSizeSuccessful() {
        List<String> actual = new ArrayList<>(Arrays.asList("Alex", "Bob", "Alica"));
        assertEquals(3, instance.getListSize(actual));
        assertEquals(actual.size(), instance.getListSize(actual));
        assertEquals(0, instance.getListSize(Collections.emptyList()));
        assertEquals(0, instance.getListSize(null));
    }

    @Test
    public void mergeSuccessful() {
        List<Long> longs = Arrays.asList(3l, 4l);
        List<Integer> integers = Arrays.asList(5, 6);
        List<String> strings = new ArrayList<>(Arrays.asList("1", "2"));
        List<Long> merge = instance.merge(integers, longs, strings);
        assertEquals(6, merge.size());
        assertTrue(merge.contains(1l));
        assertTrue(merge.contains(2l));
        assertTrue(merge.contains(3l));
        assertTrue(merge.contains(4l));
        assertTrue(merge.contains(5l));
        assertTrue(merge.contains(6l));
        assertFalse(merge.contains(0l));
        assertFalse(merge.contains(-1l));
    }

    @Test
    public void mergeFail() {
        List<Long> longs = Arrays.asList(3l, 4l);
        List<Integer> integers = Arrays.asList(5, 6);
        assertThrows(IllegalArgumentException.class, () -> instance.merge(integers, longs,
                new ArrayList<>(Arrays.asList("1a", "2"))));
        assertThrows(IllegalArgumentException.class, () -> instance.merge(integers, longs,
                new ArrayList<>(Arrays.asList("1", "2asfsd"))));
        assertThrows(NullPointerException.class, () -> instance.merge(integers, longs,
                new ArrayList<>(Arrays.asList(null, "2"))));
        assertThrows(NullPointerException.class, () -> instance.merge(integers, longs,
                new ArrayList<>(Arrays.asList("1", null))));
        assertThrows(RuntimeException.class, () -> instance.merge(null, longs,
                new ArrayList<>(Arrays.asList("1", "2"))));
        assertThrows(RuntimeException.class, () -> instance.merge(integers, null,
                new ArrayList<>(Arrays.asList("1", "2"))));
        assertThrows(RuntimeException.class, () -> instance.merge(integers, longs, null));
    }

    @Test
    public void findMaxValueSuccessful() {
        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(123, Integer.MAX_VALUE, 0));
        ArrayList<Integer> integers2 = new ArrayList<>(Arrays.asList(1253435, 12413, -1243254));
        ArrayList<Integer> integers3 = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE, 12413, -1243254));
        int maxValue = instance.findMaxValue(integers1, integers2, integers3);
        assertEquals(Integer.MAX_VALUE, maxValue);
    }

    @Test
    public void findMaxValueFail() {
        assertThrows(RuntimeException.class,
                () -> instance.findMaxValue(null, new ArrayList<>(), new ArrayList<>()));
        assertThrows(RuntimeException.class,
                () -> instance.findMaxValue(new ArrayList<>(), null, new ArrayList<>()));
        assertThrows(RuntimeException.class,
                () -> instance.findMaxValue(new ArrayList<>(), new ArrayList<>(), null));
    }

    @Test
    public void findMinValueSuccessful() {
        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(123, Integer.MAX_VALUE, 0));
        ArrayList<Integer> integers2 = new ArrayList<>(Arrays.asList(1253435, 12413, -1243254));
        ArrayList<Integer> integers3 = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE, 12413, -1243254));
        int minValue = instance.findMinValue(integers1, integers2, integers3);
        assertEquals(Integer.MIN_VALUE, minValue);
    }

    @Test
    public void findMinValueFail() {
        assertThrows(RuntimeException.class,
                () -> instance.findMaxValue(null, new ArrayList<>(), new ArrayList<>()));
        assertThrows(RuntimeException.class,
                () -> instance.findMaxValue(new ArrayList<>(), null, new ArrayList<>()));
        assertThrows(RuntimeException.class,
                () -> instance.findMaxValue(new ArrayList<>(), new ArrayList<>(), null));
    }

    @Test
    public void multiplyMax2ElementsSuccessful() {
        int actual1 = instance.multiplyMax2Elements(
                new ArrayList<>(Arrays.asList(1, -1, 1242323)),
                new ArrayList<>(Arrays.asList(1, Integer.MAX_VALUE, 0)),
                new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0))
        );
        assertEquals(1, actual1);
        int actual2 = instance.multiplyMax2Elements(
                new ArrayList<>(Arrays.asList(1, -1, 1242323)),
                new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, 0)),
                new ArrayList<>(Arrays.asList(124, Integer.MIN_VALUE, 0))
        );
        assertEquals(1, actual2);
        int actual3 = instance.multiplyMax2Elements(
                new ArrayList<>(Arrays.asList(1, -1, 12)),
                new ArrayList<>(Arrays.asList(12, Integer.MIN_VALUE, 0)),
                new ArrayList<>(Arrays.asList(-12412, Integer.MIN_VALUE, 0))
        );
        assertEquals(144, actual3);
    }

    @Test
    public void multiplyMax2ElementsFail() {
        assertThrows(RuntimeException.class, () -> instance.multiplyMax2Elements(
                null,
                new ArrayList<>(Arrays.asList(1, Integer.MAX_VALUE, 0)),
                new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0))
        ));
        assertThrows(RuntimeException.class, () -> instance.multiplyMax2Elements(
                new ArrayList<>(Arrays.asList(1, -1, 1242323)),
                null,
                new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0))
        ));
        assertThrows(RuntimeException.class, () -> instance.multiplyMax2Elements(
                new ArrayList<>(Arrays.asList(1, -1, 12)),
                new ArrayList<>(Arrays.asList(12, Integer.MIN_VALUE, 0)),
                null
        ));
    }

    @Test
    public void removeNullsSuccessful() {
        List<String> strings = instance.removeNulls(
                new ArrayList<>(Arrays.asList("Geeks", null, "forGeeks", null, "A computer portal")));
        assertEquals(3, strings.size());
        assertFalse(strings.isEmpty());
        assertEquals("Geeks", strings.get(0));
        assertEquals("forGeeks", strings.get(1));
        assertEquals("A computer portal", strings.get(2));
        List<String> singletonList = instance.removeNulls(
                new ArrayList<>(Collections.singletonList("A computer portal")));
        assertEquals(1, singletonList.size());
        assertEquals("A computer portal", singletonList.get(0));
        List<String> emptyList = instance.removeNulls(new ArrayList<>());
        assertEquals(0, emptyList.size());
        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void removeNullsFail() {
        assertThrows(RuntimeException.class, () -> instance.removeNulls(null));
    }

    @Test
    public void flatMapWithoutNullsSuccessful() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(10, null, 2, null, 1)));
        list.add(new ArrayList<>(Arrays.asList(40, null, 13, null, 9)));
        list.add(new ArrayList<>(Arrays.asList(null, 1991, null, 27, null, 8)));
        list.add(new ArrayList<>(Collections.singletonList(0)));
        list.add(new ArrayList<>());
        List<Integer> integers = instance.flatMapWithoutNulls(list);
        assertFalse(integers.isEmpty());
        assertEquals(10, integers.size());
        assertEquals(10, integers.get(0));
        assertEquals(2, integers.get(1));
        assertEquals(1, integers.get(2));
        assertEquals(40, integers.get(3));
        assertEquals(13, integers.get(4));
        assertEquals(9, integers.get(5));
        assertEquals(1991, integers.get(6));
        assertEquals(27, integers.get(7));
        assertEquals(8, integers.get(8));
        assertEquals(0, integers.get(9));
    }

    @Test
    public void flatMapWithoutNullsFail() {
        assertThrows(NoSuchElementException.class, () -> instance.flatMapWithoutNulls(null));
    }

    @Test
    public void cloneIdsSuccessful() {
        List<Integer> integers1 = instance.cloneIds(new ArrayList<>(Arrays.asList(null, 1, 4, 6, null, 123, null)));
        assertFalse(integers1.isEmpty());
        assertEquals(4, integers1.size());
        assertEquals(1, integers1.get(0));
        assertEquals(4, integers1.get(1));
        assertEquals(6, integers1.get(2));
        assertEquals(123, integers1.get(3));
        List<Integer> integers2 = instance.cloneIds(new ArrayList<>(Arrays.asList(1253, 1, null, 6, null, 123, null)));
        assertFalse(integers2.isEmpty());
        assertEquals(4, integers2.size());
        assertEquals(1253, integers2.get(0));
        assertEquals(1, integers2.get(1));
        assertEquals(6, integers2.get(2));
        assertEquals(123, integers2.get(3));
        List<Integer> integers3 = instance.cloneIds(new ArrayList<>());
        assertTrue(integers3.isEmpty());
        assertEquals(0, integers3.size());
    }

    @Test
    public void cloneIdsFail() {
        assertThrows(NoSuchElementException.class, () -> instance.cloneIds(null));
    }

    @Test
    public void shuffleSuccessful() {
        List<String> shuffle = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "orange"));
        instance.shuffle(shuffle);
        assertFalse(shuffle.isEmpty());
        assertEquals(4, shuffle.size());
        assertTrue(shuffle.contains("Red"));
        assertTrue(shuffle.contains("Green"));
        assertTrue(shuffle.contains("Blue"));
        assertTrue(shuffle.contains("orange"));

        instance.shuffle(shuffle);
        assertFalse(shuffle.isEmpty());
        assertEquals(4, shuffle.size());
        assertTrue(shuffle.contains("Red"));
        assertTrue(shuffle.contains("Green"));
        assertTrue(shuffle.contains("Blue"));
        assertTrue(shuffle.contains("orange"));

        instance.shuffle(shuffle);
        assertFalse(shuffle.isEmpty());
        assertEquals(4, shuffle.size());
        assertTrue(shuffle.contains("Red"));
        assertTrue(shuffle.contains("Green"));
        assertTrue(shuffle.contains("Blue"));
        assertTrue(shuffle.contains("orange"));
    }

    @Test
    public void shuffleSuccessfulFail() {
        List<String> shuffle = new ArrayList<>();
        assertEquals(Collections.emptyList(), instance.shuffle(shuffle));
        assertThrows(RuntimeException.class, () -> instance.shuffle(null));
    }

    @Test
    public void getLastElementSuccessful() {
        LinkedList <String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        String actual = instance.getLastElement(list);
        assertFalse(list.isEmpty());
        assertEquals(5, list.size());
        assertEquals("Pink", actual);
        assertEquals("Pink", instance.getLastElement(list));
    }

    @Test
    public void getLastElementFail() {
        LinkedList <String> list = new LinkedList<>();
        assertEquals("", instance.getLastElement(list));
        assertThrows(NoSuchElementException.class, () -> instance.getLastElement(null));
    }

    @Test
    public void compareElementsSuccessful() {
        List<String> list1 = instance.compareElements(new LinkedList<>(Arrays.asList("Red", "Green", "Blue")),
                new LinkedList<>(Arrays.asList("orange", "Blue")));
        List<String> list2 = instance.compareElements(new LinkedList<>(Arrays.asList("Red", "Green", "Blue")),
                new LinkedList<>(Collections.singletonList("Pink")));
        assertFalse(list1.isEmpty());
        assertTrue(list2.isEmpty());
        assertEquals(1, list1.size());
        assertEquals("Blue", list1.get(0));
        assertEquals(Collections.emptyList(), list2);
    }

    @Test
    public void compareElementsFail() {
        assertEquals(Collections.emptyList(), instance.compareElements(new LinkedList<>(), new LinkedList<>()));
        assertThrows(IllegalArgumentException.class,
                () -> instance.compareElements(null, new LinkedList<>()));
        assertThrows(IllegalArgumentException.class,
                () -> instance.compareElements(new LinkedList<>(), null));
    }

}
