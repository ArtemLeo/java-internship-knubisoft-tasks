package com.knubisoft.base.trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class TreeTasksTest {

    private final TreeTasks treeTasks = new TreeTasksImpl();

    @Test
    void isSameTree() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(3));
        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(3));
        assertTrue(treeTasks.isSameTree(tree1, tree2));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode());
        TreeTasks.TreeNode tree4 = new TreeTasks.TreeNode(1,
                null,
                new TreeTasks.TreeNode(2));
        assertFalse(treeTasks.isSameTree(tree3, tree4));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(1));
        TreeTasks.TreeNode tree6 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(1),
                new TreeTasks.TreeNode(2));
        assertFalse(treeTasks.isSameTree(tree5, tree6));

        TreeTasks.TreeNode tree7 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(23,
                        new TreeTasks.TreeNode(1),
                        new TreeTasks.TreeNode(34)),
                new TreeTasks.TreeNode(12,
                        new TreeTasks.TreeNode(17),
                        new TreeTasks.TreeNode(54)));
        TreeTasks.TreeNode tree8 = new TreeTasks.TreeNode(2,
                new TreeTasks.TreeNode(23,
                        new TreeTasks.TreeNode(1),
                        new TreeTasks.TreeNode(34)),
                new TreeTasks.TreeNode(12,
                        new TreeTasks.TreeNode(17),
                        new TreeTasks.TreeNode(54)));
        assertFalse(treeTasks.isSameTree(tree7, tree8));

        TreeTasks.TreeNode tree9 = new TreeTasks.TreeNode(100,
                new TreeTasks.TreeNode(200,
                        new TreeTasks.TreeNode(201),
                        new TreeTasks.TreeNode(202)),
                new TreeTasks.TreeNode(300,
                        new TreeTasks.TreeNode(301),
                        new TreeTasks.TreeNode(302)));
        TreeTasks.TreeNode tree10 = new TreeTasks.TreeNode(100,
                new TreeTasks.TreeNode(200,
                        new TreeTasks.TreeNode(201),
                        new TreeTasks.TreeNode(202)),
                new TreeTasks.TreeNode(300,
                        new TreeTasks.TreeNode(301),
                        new TreeTasks.TreeNode(302)));
        assertTrue(treeTasks.isSameTree(tree9, tree10));

        TreeTasks.TreeNode tree11 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(3,
                                new TreeTasks.TreeNode(5),
                                new TreeTasks.TreeNode(6)),
                        new TreeTasks.TreeNode(4,
                                new TreeTasks.TreeNode(7),
                                new TreeTasks.TreeNode(8))),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(30,
                                new TreeTasks.TreeNode(31),
                                new TreeTasks.TreeNode(32)),
                        new TreeTasks.TreeNode(40,
                                new TreeTasks.TreeNode(41),
                                new TreeTasks.TreeNode(42))));
        TreeTasks.TreeNode tree12 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(3,
                                new TreeTasks.TreeNode(5),
                                new TreeTasks.TreeNode(6)),
                        new TreeTasks.TreeNode(4,
                                new TreeTasks.TreeNode(7),
                                new TreeTasks.TreeNode(8))),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(30,
                                new TreeTasks.TreeNode(31),
                                new TreeTasks.TreeNode(32)),
                        new TreeTasks.TreeNode(40,
                                new TreeTasks.TreeNode(41),
                                new TreeTasks.TreeNode(42))));
        assertTrue(treeTasks.isSameTree(tree11, tree12));

        TreeTasks.TreeNode tree13 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(1,
                        new TreeTasks.TreeNode(2,
                                new TreeTasks.TreeNode(4),
                                new TreeTasks.TreeNode(5)),
                        new TreeTasks.TreeNode(3,
                                new TreeTasks.TreeNode(6),
                                new TreeTasks.TreeNode(7))),
                new TreeTasks.TreeNode(1,
                        new TreeTasks.TreeNode(2,
                                new TreeTasks.TreeNode(4),
                                new TreeTasks.TreeNode(5)),
                        new TreeTasks.TreeNode(3,
                                new TreeTasks.TreeNode(6),
                                new TreeTasks.TreeNode(7))));
        TreeTasks.TreeNode tree14 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(1,
                        new TreeTasks.TreeNode(2,
                                new TreeTasks.TreeNode(4),
                                new TreeTasks.TreeNode(5)),
                        new TreeTasks.TreeNode(3,
                                new TreeTasks.TreeNode(6),
                                new TreeTasks.TreeNode(7))),
                new TreeTasks.TreeNode(1,
                        new TreeTasks.TreeNode(2,
                                new TreeTasks.TreeNode(4),
                                new TreeTasks.TreeNode(5)),
                        new TreeTasks.TreeNode(3,
                                new TreeTasks.TreeNode(6),
                                new TreeTasks.TreeNode())));
        assertFalse(treeTasks.isSameTree(tree13, tree14));
    }

    @Test
    void inorderTraversal() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(4),
                        new TreeTasks.TreeNode(5)),
                new TreeTasks.TreeNode(3,
                        new TreeTasks.TreeNode(6),
                        new TreeTasks.TreeNode(7)));
        assertEquals(Arrays.asList(4,2,5,1,6,3,7), treeTasks.inorderTraversal(tree1));

        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(4,
                                new TreeTasks.TreeNode(8),
                                new TreeTasks.TreeNode(9)),
                        new TreeTasks.TreeNode(5)),
                new TreeTasks.TreeNode(3,
                        new TreeTasks.TreeNode(6),
                        new TreeTasks.TreeNode(7)));
        assertEquals(Arrays.asList(8,4,9,2,5,1,6,3,7), treeTasks.inorderTraversal(tree2));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(1,
                null,
                new TreeTasks.TreeNode(2, new TreeTasks.TreeNode(3), null));
        assertEquals(Arrays.asList(1,3,2), treeTasks.inorderTraversal(tree3));

        TreeTasks.TreeNode tree4 = new TreeTasks.TreeNode(23,
                new TreeTasks.TreeNode(134),
                new TreeTasks.TreeNode(259,
                        new TreeTasks.TreeNode(77),
                        new TreeTasks.TreeNode(99,
                                null,
                                new TreeTasks.TreeNode(200))));
        assertEquals(Arrays.asList(134,23,77,259,99,200), treeTasks.inorderTraversal(tree4));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(100,
                new TreeTasks.TreeNode(-100,
                        new TreeTasks.TreeNode(-99,
                                new TreeTasks.TreeNode(13),
                                new TreeTasks.TreeNode(1)),
                        null),
                new TreeTasks.TreeNode(24,
                        new TreeTasks.TreeNode(77,
                                new TreeTasks.TreeNode(15),
                                new TreeTasks.TreeNode(29)),
                        new TreeTasks.TreeNode(101,
                                new TreeTasks.TreeNode(71),
                                new TreeTasks.TreeNode(-1))));
        assertEquals(Arrays.asList(13, -99, 1, -100, 100, 15, 77, 29, 24, 71, 101, -1), treeTasks.inorderTraversal(tree5));
    }

    @Test
    void isSymmetric() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(3),
                        new TreeTasks.TreeNode(4)),
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(4),
                        new TreeTasks.TreeNode(3)));
        assertTrue(treeTasks.isSymmetric(tree1));

        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(3),
                        new TreeTasks.TreeNode(4)),
                new TreeTasks.TreeNode(22,
                        new TreeTasks.TreeNode(4),
                        new TreeTasks.TreeNode(3)));
        assertFalse(treeTasks.isSymmetric(tree2));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(-200,
                        new TreeTasks.TreeNode(-300),
                        new TreeTasks.TreeNode(-400)),
                new TreeTasks.TreeNode(200,
                        new TreeTasks.TreeNode(400),
                        new TreeTasks.TreeNode(300)));
        assertFalse(treeTasks.isSymmetric(tree3));

        TreeTasks.TreeNode node4 = new TreeTasks.TreeNode(254,
                new TreeTasks.TreeNode(2,
                        null,
                        new TreeTasks.TreeNode(4)),
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(4),
                        null));
        assertTrue(treeTasks.isSymmetric(node4));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(Integer.MAX_VALUE,
                new TreeTasks.TreeNode(59,
                        new TreeTasks.TreeNode(61),
                        new TreeTasks.TreeNode(Integer.MIN_VALUE)),
                new TreeTasks.TreeNode(59,
                        new TreeTasks.TreeNode(Integer.MIN_VALUE),
                        new TreeTasks.TreeNode(61)));
        assertTrue(treeTasks.isSymmetric(tree5));
    }

    @Test
    void maxDepth() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(3));
        assertEquals(2, treeTasks.maxDepth(tree1));

        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(43),
                        new TreeTasks.TreeNode(534)),
                new TreeTasks.TreeNode(3,
                        new TreeTasks.TreeNode(31,
                                null,
                                new TreeTasks.TreeNode(1)),
                        new TreeTasks.TreeNode(11)));
        assertEquals(4, treeTasks.maxDepth(tree2));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2343,
                        new TreeTasks.TreeNode(43,
                                new TreeTasks.TreeNode(12,
                                        new TreeTasks.TreeNode(54),
                                        new TreeTasks.TreeNode(1122)),
                                new TreeTasks.TreeNode(341,
                                        new TreeTasks.TreeNode(542),
                                        new TreeTasks.TreeNode(11))),
                        new TreeTasks.TreeNode(534)),
                new TreeTasks.TreeNode(1233,
                        new TreeTasks.TreeNode(31,
                                null,
                                new TreeTasks.TreeNode(1)),
                        new TreeTasks.TreeNode(11)));
        assertEquals(5, treeTasks.maxDepth(tree3));

        TreeTasks.TreeNode tree4 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2343,
                        new TreeTasks.TreeNode(43,
                                new TreeTasks.TreeNode(12,
                                        new TreeTasks.TreeNode(54),
                                        new TreeTasks.TreeNode(1122)),
                                new TreeTasks.TreeNode(341,
                                        new TreeTasks.TreeNode(542),
                                        new TreeTasks.TreeNode(11))),
                        new TreeTasks.TreeNode(534)),
                new TreeTasks.TreeNode(1233,
                        new TreeTasks.TreeNode(31,
                                null,
                                new TreeTasks.TreeNode(1,
                                        new TreeTasks.TreeNode(54,
                                                new TreeTasks.TreeNode(98),
                                                new TreeTasks.TreeNode(17)),
                                        new TreeTasks.TreeNode(1122,
                                                new TreeTasks.TreeNode(12),
                                                new TreeTasks.TreeNode(765,
                                                        new TreeTasks.TreeNode(Integer.MAX_VALUE),
                                                        new TreeTasks.TreeNode(Integer.MIN_VALUE))))),
                        new TreeTasks.TreeNode(11)));
        assertEquals(7, treeTasks.maxDepth(tree4));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2343,
                        new TreeTasks.TreeNode(43,
                                new TreeTasks.TreeNode(12,
                                        new TreeTasks.TreeNode(54),
                                        new TreeTasks.TreeNode(1122)),
                                new TreeTasks.TreeNode(341,
                                        new TreeTasks.TreeNode(542,
                                                new TreeTasks.TreeNode(456,
                                                        new TreeTasks.TreeNode(1),
                                                        new TreeTasks.TreeNode(2,
                                                                new TreeTasks.TreeNode(Integer.MAX_VALUE),
                                                                new TreeTasks.TreeNode(798,
                                                                        new TreeTasks.TreeNode(700),
                                                                        new TreeTasks.TreeNode(1,
                                                                                null,
                                                                                new TreeTasks.TreeNode(500))))),
                                                new TreeTasks.TreeNode(11)),
                                        new TreeTasks.TreeNode(11))),
                        new TreeTasks.TreeNode(534)),
                new TreeTasks.TreeNode(1233,
                        new TreeTasks.TreeNode(31,
                                null,
                                new TreeTasks.TreeNode(1,
                                        new TreeTasks.TreeNode(54,
                                                new TreeTasks.TreeNode(98),
                                                new TreeTasks.TreeNode(17)),
                                        new TreeTasks.TreeNode(1122,
                                                new TreeTasks.TreeNode(12),
                                                new TreeTasks.TreeNode(765,
                                                        new TreeTasks.TreeNode(Integer.MAX_VALUE),
                                                        new TreeTasks.TreeNode(Integer.MIN_VALUE))))),
                        new TreeTasks.TreeNode(11)));
        assertEquals(10, treeTasks.maxDepth(tree5));
    }

    @Test
    void hasPathSum() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(3),
                        new TreeTasks.TreeNode(4)),
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(4),
                        new TreeTasks.TreeNode(3)));
        assertTrue(treeTasks.hasPathSum(tree1, 7));

        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(5,
                                new TreeTasks.TreeNode(12),
                                new TreeTasks.TreeNode(22)),
                        new TreeTasks.TreeNode(4,
                                new TreeTasks.TreeNode(12),
                                new TreeTasks.TreeNode(16))),
                new TreeTasks.TreeNode(3,
                        new TreeTasks.TreeNode(4,
                                new TreeTasks.TreeNode(17),
                                new TreeTasks.TreeNode(21)),
                        new TreeTasks.TreeNode(3)));
        assertFalse(treeTasks.hasPathSum(tree2, 24));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(5,
                                new TreeTasks.TreeNode(12),
                                new TreeTasks.TreeNode(22)),
                        new TreeTasks.TreeNode(4,
                                new TreeTasks.TreeNode(12),
                                new TreeTasks.TreeNode(16))),
                new TreeTasks.TreeNode(3,
                        new TreeTasks.TreeNode(4,
                                new TreeTasks.TreeNode(17),
                                new TreeTasks.TreeNode(21)),
                        new TreeTasks.TreeNode(3)));
        assertTrue(treeTasks.hasPathSum(tree3, 19));

        TreeTasks.TreeNode tree4 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2343,
                        new TreeTasks.TreeNode(43,
                                new TreeTasks.TreeNode(12,
                                        new TreeTasks.TreeNode(54),
                                        new TreeTasks.TreeNode(1122)),
                                new TreeTasks.TreeNode(341,
                                        new TreeTasks.TreeNode(542),
                                        new TreeTasks.TreeNode(11))),
                        new TreeTasks.TreeNode(534)),
                new TreeTasks.TreeNode(1233,
                        new TreeTasks.TreeNode(31,
                                null,
                                new TreeTasks.TreeNode(1)),
                        new TreeTasks.TreeNode(11)));
        assertTrue(treeTasks.hasPathSum(tree4, 1266));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(76,
                        new TreeTasks.TreeNode(43,
                                new TreeTasks.TreeNode(12,
                                        new TreeTasks.TreeNode(54),
                                        new TreeTasks.TreeNode(1122)),
                                new TreeTasks.TreeNode(341,
                                        new TreeTasks.TreeNode(542),
                                        new TreeTasks.TreeNode(11))),
                        new TreeTasks.TreeNode(534)),
                new TreeTasks.TreeNode(34,
                        new TreeTasks.TreeNode(31,
                                null,
                                new TreeTasks.TreeNode(1)),
                        new TreeTasks.TreeNode(11)));
        assertFalse(treeTasks.hasPathSum(tree5, 165));

        TreeTasks.TreeNode tree6 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(3));
        assertTrue(treeTasks.hasPathSum(tree6, 3));
    }

    @Test
    void invertTree() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(11,
                        new TreeTasks.TreeNode(17),
                        new TreeTasks.TreeNode(31)),
                new TreeTasks.TreeNode(8,
                        new TreeTasks.TreeNode(54),
                        new TreeTasks.TreeNode(3)));
        TreeTasks.TreeNode expectedTree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(8,
                        new TreeTasks.TreeNode(3),
                        new TreeTasks.TreeNode(54)),
                new TreeTasks.TreeNode(11,
                        new TreeTasks.TreeNode(31),
                        new TreeTasks.TreeNode(17)));
        assertEquals(expectedTree1, treeTasks.invertTree(tree1));

        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(11,
                        new TreeTasks.TreeNode(17),
                        new TreeTasks.TreeNode(31)),
                new TreeTasks.TreeNode(8,
                        new TreeTasks.TreeNode(54),
                        new TreeTasks.TreeNode(3)));
        TreeTasks.TreeNode expectedTree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(11,
                        new TreeTasks.TreeNode(3),
                        new TreeTasks.TreeNode(54)),
                new TreeTasks.TreeNode(8,
                        new TreeTasks.TreeNode(31),
                        new TreeTasks.TreeNode(17)));
        assertNotEquals(expectedTree2, treeTasks.invertTree(tree2));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(17,
                new TreeTasks.TreeNode(100,
                        new TreeTasks.TreeNode(200,
                                new TreeTasks.TreeNode(700),
                                new TreeTasks.TreeNode(800)),
                        new TreeTasks.TreeNode(300,
                                new TreeTasks.TreeNode(900),
                                new TreeTasks.TreeNode(1000))),
                new TreeTasks.TreeNode(400,
                        new TreeTasks.TreeNode(500),
                        new TreeTasks.TreeNode(600)));
        TreeTasks.TreeNode expectedTree3 = new TreeTasks.TreeNode(17,
                new TreeTasks.TreeNode(400,
                        new TreeTasks.TreeNode(600),
                        new TreeTasks.TreeNode(500)),
                new TreeTasks.TreeNode(100,
                        new TreeTasks.TreeNode(300,
                                new TreeTasks.TreeNode(1000),
                                new TreeTasks.TreeNode(900)),
                        new TreeTasks.TreeNode(200,
                                new TreeTasks.TreeNode(800),
                                new TreeTasks.TreeNode(700))));
        assertEquals(expectedTree3, treeTasks.invertTree(tree3));

        TreeTasks.TreeNode tree4 = new TreeTasks.TreeNode(4,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(1),
                        new TreeTasks.TreeNode(3)),
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(6),
                        new TreeTasks.TreeNode(9)));
        TreeTasks.TreeNode expectedTree4 = new TreeTasks.TreeNode(4,
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(9),
                        new TreeTasks.TreeNode(6)),
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(3),
                        new TreeTasks.TreeNode(1)));
        assertEquals(expectedTree4, treeTasks.invertTree(tree4));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(4,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(1,
                                new TreeTasks.TreeNode(50),
                                new TreeTasks.TreeNode(51)),
                        new TreeTasks.TreeNode(3)),
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(6),
                        new TreeTasks.TreeNode(9)));
        TreeTasks.TreeNode expectedTree5 = new TreeTasks.TreeNode(4,
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(9),
                        new TreeTasks.TreeNode(6)),
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(3),
                        new TreeTasks.TreeNode(1,
                                new TreeTasks.TreeNode(51),
                                new TreeTasks.TreeNode(50))));
        assertEquals(expectedTree5, treeTasks.invertTree(tree5));
    }

    @Test
    void sumOfLeftLeaves() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(3,
                new TreeTasks.TreeNode(9),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        new TreeTasks.TreeNode(7)));
        assertEquals(24, treeTasks.sumOfLeftLeaves(tree1));

        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(3,
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(23),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        new TreeTasks.TreeNode(7)));
        assertEquals(38, treeTasks.sumOfLeftLeaves(tree2));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(3,
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(23,
                                new TreeTasks.TreeNode(41),
                                new TreeTasks.TreeNode(16,
                                        new TreeTasks.TreeNode(17),
                                        new TreeTasks.TreeNode(41))),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        new TreeTasks.TreeNode(7)));
        assertEquals(73, treeTasks.sumOfLeftLeaves(tree3));

        TreeTasks.TreeNode tree4 = new TreeTasks.TreeNode(3,
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(23,
                                new TreeTasks.TreeNode(41),
                                new TreeTasks.TreeNode(16,
                                        new TreeTasks.TreeNode(17),
                                        new TreeTasks.TreeNode(41))),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        new TreeTasks.TreeNode(7,
                                new TreeTasks.TreeNode(16),
                                new TreeTasks.TreeNode(40))));
        assertEquals(89, treeTasks.sumOfLeftLeaves(tree4));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(3,
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(23,
                                new TreeTasks.TreeNode(41),
                                new TreeTasks.TreeNode(16,
                                        new TreeTasks.TreeNode(17),
                                        new TreeTasks.TreeNode(41))),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        new TreeTasks.TreeNode(7,
                                new TreeTasks.TreeNode(16),
                                new TreeTasks.TreeNode(40,
                                        new TreeTasks.TreeNode(11),
                                        null))));
        assertEquals(100, treeTasks.sumOfLeftLeaves(tree5));
    }

    @Test
    void mergeTrees() {
        TreeTasks.TreeNode tree1 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(3));
        TreeTasks.TreeNode tree2 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(3));
        TreeTasks.TreeNode expectedTree1 = new TreeTasks.TreeNode(2,
                new TreeTasks.TreeNode(4),
                new TreeTasks.TreeNode(6));
        assertEquals(expectedTree1, treeTasks.mergeTrees(tree1, tree2));

        TreeTasks.TreeNode tree3 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2,
                        new TreeTasks.TreeNode(21),
                        new TreeTasks.TreeNode(17)),
                new TreeTasks.TreeNode(3));
        TreeTasks.TreeNode tree4 = new TreeTasks.TreeNode(1,
                new TreeTasks.TreeNode(2),
                new TreeTasks.TreeNode(3));
        TreeTasks.TreeNode expectedTree2 = new TreeTasks.TreeNode(2,
                new TreeTasks.TreeNode(4,
                        new TreeTasks.TreeNode(21),
                        new TreeTasks.TreeNode(17)),
                new TreeTasks.TreeNode(6));
        assertEquals(expectedTree2, treeTasks.mergeTrees(tree3, tree4));

        TreeTasks.TreeNode tree5 = new TreeTasks.TreeNode(3,
                new TreeTasks.TreeNode(9),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        new TreeTasks.TreeNode(7)));
        TreeTasks.TreeNode tree6 = new TreeTasks.TreeNode(3,
                new TreeTasks.TreeNode(7,
                        new TreeTasks.TreeNode(23),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        new TreeTasks.TreeNode(7)));
        TreeTasks.TreeNode expectedTree3 = new TreeTasks.TreeNode(6,
                new TreeTasks.TreeNode(16,
                        new TreeTasks.TreeNode(23),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(40,
                        new TreeTasks.TreeNode(30),
                        new TreeTasks.TreeNode(14)));
        assertEquals(expectedTree3, treeTasks.mergeTrees(tree5, tree6));

        TreeTasks.TreeNode tree7 = new TreeTasks.TreeNode(43,
                null,
                new TreeTasks.TreeNode(20,
                        new TreeTasks.TreeNode(15),
                        null));
        TreeTasks.TreeNode tree8 = new TreeTasks.TreeNode(6,
                new TreeTasks.TreeNode(16,
                        new TreeTasks.TreeNode(23,
                                null,
                                new TreeTasks.TreeNode(3)),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(40,
                        new TreeTasks.TreeNode(30),
                        new TreeTasks.TreeNode(14,
                                new TreeTasks.TreeNode(14),
                                new TreeTasks.TreeNode(17))));
        TreeTasks.TreeNode expectedTree4 = new TreeTasks.TreeNode(49,
                new TreeTasks.TreeNode(16,
                        new TreeTasks.TreeNode(23,
                                null,
                                new TreeTasks.TreeNode(3)),
                        new TreeTasks.TreeNode(1)),
                new TreeTasks.TreeNode(60,
                        new TreeTasks.TreeNode(45),
                        new TreeTasks.TreeNode(14,
                                new TreeTasks.TreeNode(14),
                                new TreeTasks.TreeNode(17))));
        assertEquals(expectedTree4, treeTasks.mergeTrees(tree7, tree8));
    }
}