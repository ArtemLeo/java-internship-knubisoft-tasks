package com.knubisoft.base.bool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoolTasksTest {

    BoolTasks instance = new BoolTasksImpl();

    @Test
    public void isTrueAutoboxSuccessful() {
        assertTrue(instance.isTrueAutobox(true));
    }

    @Test
    public void isTrueAutoboxFail() {
        assertFalse(instance.isTrueAutobox(false));
    }

    @Test
    public void isFalseAutoboxSuccessful() {
        assertFalse(instance.isFalseAutobox(false));
    }

    @Test
    public void isFalseAutoboxFail() {
        assertTrue(instance.isFalseAutobox(true));
    }

    @Test
    public void isFalseUnboxSuccessful() {
        assertFalse(instance.isFalseUnbox(false));
    }

    @Test
    public void isFalseUnboxFail() {
        assertTrue(instance.isFalseUnbox(true));
    }

    @Test
    public void isTrueUnboxSuccessful() {
        assertTrue(instance.isTrueUnbox(true));
    }

    @Test
    public void isTrueUnboxFail() {
        assertFalse(instance.isTrueUnbox(false));
    }

    @Test
    public void andFunctionSuccessful() {
        assertTrue(instance.andFunction(0, "0"));
        assertTrue(instance.andFunction(100, "100"));
        assertTrue(instance.andFunction(15235, "15235"));
    }

    @Test
    public void andFunctionFail() {
        assertFalse(instance.andFunction(100, "-2147483648"));
        assertFalse(instance.andFunction(30, "2147483647"));
        assertFalse(instance.andFunction(0, "Hello"));
        assertFalse(instance.andFunction(10, null));
    }

    @Test
    public void orFunctionSuccessful() {
        assertTrue(instance.orFunction(0, "0"));
        assertTrue(instance.orFunction(100, "100"));
        assertTrue(instance.orFunction(15235, "15235"));
    }

    @Test
    public void orFunctionFail() {
        assertFalse(instance.orFunction(100, "-2147483648"));
        assertFalse(instance.orFunction(30, "2147483647"));
        assertFalse(instance.orFunction(0, "Hello"));
        assertFalse(instance.orFunction(0, ""));
        assertFalse(instance.orFunction(0, " "));
        assertFalse(instance.orFunction(10, null));
    }

    @Test
    public void isSameSizeArraySuccessful() {
        assertTrue(instance.isSameSizeArray(new Object[100], new Object[100]));
        assertTrue(instance.isSameSizeArray(new Object[30], new Object[30]));
        assertTrue(instance.isSameSizeArray(new Object[0], new Object[0]));
    }

    @Test
    public void isSameSizeArrayFail() {
        assertFalse(instance.isSameSizeArray(new Object[2], new Object[1]));
        assertFalse(instance.isSameSizeArray(new Object[100], new Object[30]));
        assertFalse(instance.isSameSizeArray(new Object[30], new Object[100]));
        assertFalse(instance.isSameSizeArray(null, new Object[100]));
        assertFalse(instance.isSameSizeArray(new Object[30], null));
        assertFalse(instance.isSameSizeArray(null, null));
    }

    @Test
    public void isSameCharactersCountSuccessful() {
        assertTrue(instance.isSameCharactersCount("johndoe", "JohnDoe", 8));
        assertTrue(instance.isSameCharactersCount("DoeJohn", "JohnDoe", 8));
    }

    @Test
    public void isSameCharactersCountFail() {
        assertFalse(instance.isSameCharactersCount("johndoe", "John Doe", 0));
        assertFalse(instance.isSameCharactersCount("", "John Doe", 8));
        assertFalse(instance.isSameCharactersCount("johndoe", "", 8));
        assertFalse(instance.isSameCharactersCount(null, "", 8));
        assertFalse(instance.isSameCharactersCount("johndoe", null, 8));
        assertFalse(instance.isSameCharactersCount(null, null, 8));
    }
}
