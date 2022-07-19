package com.knubisoft.tasks.algorithm.pascaltriangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalsTriangleImplTest {

    private final PascalsTriangle triangle = new PascalsTriangleImpl();

    @Test
    void calculateLineOfPascalsTriangle() {
        assertEquals(List.of(1), triangle.calculateLineOfPascalsTriangle(1));
        assertEquals(List.of(1, 1), triangle.calculateLineOfPascalsTriangle(2));
        assertEquals(List.of(1, 2, 1), triangle.calculateLineOfPascalsTriangle(3));
        assertEquals(List.of(1, 3, 3, 1), triangle.calculateLineOfPascalsTriangle(4));
        assertEquals(List.of(1, 4, 6, 4, 1), triangle.calculateLineOfPascalsTriangle(5));
        assertEquals(List.of(1, 5, 10, 10, 5, 1), triangle.calculateLineOfPascalsTriangle(6));
        assertEquals(List.of(1, 6, 15, 20, 15, 6, 1), triangle.calculateLineOfPascalsTriangle(7));
        assertEquals(500, triangle.calculateLineOfPascalsTriangle(500).size());
    }
}