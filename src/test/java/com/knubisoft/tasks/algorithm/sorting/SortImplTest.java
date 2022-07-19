package com.knubisoft.tasks.algorithm.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortImplTest {

    private final Sort sort = new SortImpl();

    @Test
    void sortKeysAndValues() {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, Arrays.asList(5, 4, 3, 2, 1));
        map.put(2, Arrays.asList(5, 4, 3, 1, 2));
        map.put(3, Arrays.asList(1, 5, 4, 3, 2));

        int index = 0;
        for (Map.Entry<Integer, List<Integer>> each : sort.sortKeysAndValues(map).entrySet()) {
            index++;
            assertEquals(index, each.getKey());
            assertEquals(List.of(1, 2, 3, 4, 5), each.getValue());
        }
    }
}