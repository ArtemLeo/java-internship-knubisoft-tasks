package com.knubisoft.base.pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternTasksTest {

    PatternTasks instance = new PatternTasksImpl();

    @Test
    public void haveSetOfCharactersSuccessful() {
        assertTrue(instance.haveSetOfCharacters("ABCDEFabcdef123450"));
        assertTrue(instance.haveSetOfCharacters("SQL"));
        assertFalse(instance.haveSetOfCharacters("*&%@#!}{"));
        assertFalse(instance.haveSetOfCharacters("s3integration.com"));
    }

    @Test
    public void haveSetOfCharactersFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.haveSetOfCharacters(null));
        assertThrows(IllegalArgumentException.class, () -> instance.haveSetOfCharacters(""));
        assertThrows(IllegalArgumentException.class, () -> instance.haveSetOfCharacters(" "));
    }

    @Test
    public void matchByCharactersSuccessful() {
        assertEquals("Found a match!", instance.matchByCharacters("p"));
        assertEquals("Found a match!", instance.matchByCharacters("pqq"));
        assertEquals("Not matched!", instance.matchByCharacters("pqr"));
        assertEquals("Not matched!", instance.matchByCharacters("prr"));
        assertEquals("Not matched!", instance.matchByCharacters(""));
        assertEquals("Not matched!", instance.matchByCharacters(" "));
    }

    @Test
    public void matchByCharactersFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.haveSetOfCharacters(null));
    }

    @Test
    public void matchStartAndEndSuccessful() {
        assertEquals("Not matched!",
                instance.matchStartAndEnd("The quick brown fox jumps over the lazy dog."));
        assertEquals("Not matched!",
                instance.matchStartAndEnd("Java Exercises."));
        assertEquals("Not matched!",
                instance.matchStartAndEnd("Do humans eat gizzards?"));
        assertEquals("Found a match!",
                instance.matchStartAndEnd("PostgreSQL"));
    }

    @Test
    public void matchStartAndEndFail() {
        assertThrows(IllegalArgumentException.class,() -> instance.matchStartAndEnd(null));
    }

    @Test
    public void matchIpAddressSuccessful() {
        assertEquals("216.8.94.196", instance.matchIpAddress("216.08.094.196"));
        assertEquals("8.8.8.8", instance.matchIpAddress("08.008.0008.00008"));
        assertEquals("1.102.103.104", instance.matchIpAddress("01.102.103.104"));
    }

    @Test
    public void matchIpAddressFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.matchIpAddress(null));
        assertThrows(IllegalArgumentException.class, () -> instance.matchIpAddress(""));
        assertThrows(IllegalArgumentException.class, () -> instance.matchIpAddress(" "));
    }

    @Test
    public void matchVowelsSuccessful() {
        assertEquals("LWRD", instance.matchVowels("LOWERED"));
        assertEquals("Jv", instance.matchVowels("Java"));
        assertEquals("MD-CNTRLZD", instance.matchVowels("MID-CENTRALIZED"));
        assertEquals("C++", instance.matchVowels("C++"));
    }

    @Test
    public void matchVowelsFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.matchVowels(null));
        assertThrows(IllegalArgumentException.class, () -> instance.matchVowels(""));
        assertThrows(IllegalArgumentException.class, () -> instance.matchVowels(" "));
    }

    @Test
    public void validatePINSuccessful() {
        assertFalse(instance.validatePIN("123"));
        assertFalse(instance.validatePIN("12345"));
        assertFalse(instance.validatePIN("1234567"));
        assertTrue(instance.validatePIN("1234"));
        assertTrue(instance.validatePIN("12345678"));
        assertTrue(instance.validatePIN("123456"));
    }

    @Test
    public void validatePINFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.validatePIN(null));
        assertThrows(IllegalArgumentException.class, () -> instance.validatePIN(""));
        assertThrows(IllegalArgumentException.class, () -> instance.validatePIN(" "));
    }

    @Test
    public void divideDigitSuccessful() {
        assertEquals("100", instance.divideDigit(100));
        assertEquals("1#000", instance.divideDigit(1000));
        assertEquals("10#000", instance.divideDigit(10000));
        assertEquals("100#000", instance.divideDigit(100000));
    }

    @Test
    public void removeAllNonAlphanumericCharactersSuccessful() {
        assertEquals("JavaExercises", instance.removeAllNonAlphanumericCharacters("Java Exercises"));
        assertEquals("Exercises", instance.removeAllNonAlphanumericCharacters("Ex@^%&%(ercis*&)&es"));
    }

    @Test
    public void removeAllNonAlphanumericCharactersFail() {
        assertThrows(RuntimeException.class, () -> instance.removeAllNonAlphanumericCharacters(null));
    }

    @Test
    public void validatePhoneNumberSuccessful() {
        assertTrue(instance.validatePhoneNumber("(123)4567890"));
        assertTrue(instance.validatePhoneNumber("1234567890"));
        assertTrue(instance.validatePhoneNumber("123-456-7890"));
        assertTrue(instance.validatePhoneNumber("(123)456-7890"));
        assertFalse(instance.validatePhoneNumber("(1234567890)"));
        assertFalse(instance.validatePhoneNumber("123)4567890"));
        assertFalse(instance.validatePhoneNumber("12345678901"));
        assertFalse(instance.validatePhoneNumber("(1)234567890"));
        assertFalse(instance.validatePhoneNumber("(123)-4567890"));
        assertFalse(instance.validatePhoneNumber("1"));
        assertFalse(instance.validatePhoneNumber("12-3456-7890"));
        assertFalse(instance.validatePhoneNumber("123-4567"));
        assertFalse(instance.validatePhoneNumber("Hello world"));
    }

    @Test
    public void validatePhoneNumberFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.validatePhoneNumber(null));
        assertThrows(IllegalArgumentException.class, () -> instance.validatePhoneNumber(""));
        assertThrows(IllegalArgumentException.class, () -> instance.validatePhoneNumber(" "));
    }

    @Test
    public void getLastVowelsByConstraintSuccessful() {
        assertEquals("aa", instance.getLastVowelsByConstraint("Java", 2));
        assertEquals("ai", instance.getLastVowelsByConstraint("JavaScript", 2));
        assertEquals("aai", instance.getLastVowelsByConstraint("JavaScript", 3));
        assertEquals("ie", instance.getLastVowelsByConstraint("SQLite", 2));
    }

    @Test
    public void getLastVowelsByConstraintFail() {
        assertThrows(RuntimeException.class,
                () -> instance.getLastVowelsByConstraint("Java", Integer.MIN_VALUE));
        assertThrows(RuntimeException.class,
                () -> instance.getLastVowelsByConstraint("JavaScript", 0));
        assertThrows(RuntimeException.class,
                () -> instance.getLastVowelsByConstraint(null, 3));
        assertThrows(RuntimeException.class,
                () -> instance.getLastVowelsByConstraint("", 3));
        assertThrows(RuntimeException.class,
                () -> instance.getLastVowelsByConstraint(" ", 3));
    }

    @Test
    public void isMathematicalExpressionSuccessful() {
        assertTrue(instance.isMathematicalExpression("10"));
        assertTrue(instance.isMathematicalExpression("10 + 20"));
        assertFalse(instance.isMathematicalExpression("100 +"));
        assertFalse(instance.isMathematicalExpression("10 *+ 20 * 30"));
    }

    @Test
    public void isMathematicalExpressionFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.isMathematicalExpression(null));
        assertThrows(IllegalArgumentException.class, () -> instance.isMathematicalExpression(""));
        assertThrows(IllegalArgumentException.class, () -> instance.isMathematicalExpression(" "));
    }

    @Test
    public void insertDashSuccessful() {
        assertEquals("P-ython E-xercises", instance.insertDash("Python Exercises"));
        assertEquals("T-he quick brown F-ox jumps over the lazy D-og.",
                instance.insertDash("The quick brown Fox jumps over the lazy Dog."));
        assertEquals("java exercises", instance.insertDash("java exercises"));
    }

    @Test
    public void insertDashFail() {
        assertThrows(RuntimeException.class, () -> instance.insertDash(null));
    }
}
