package com.knubisoft.base.string;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringTasksTest {

    StringTasks instance = new StringTasksImpl();

    @Test
    public void reverseWordSuccessful() {
        assertEquals("dlroW ,olleH", instance.reverseString("Hello, World"));
        assertEquals("01/7 nasrednA uemoT .tS", instance.reverseString("St. Tomeu Andersan 7/10"));
        assertEquals("htimS nhoJ .rM", instance.reverseString("Mr. John Smith"));
        assertEquals("", instance.reverseString(""));
    }

    @Test
    public void reverseWordEmptySuccessful() {
        assertThrows(IllegalArgumentException.class, () -> instance.reverseString(null));
    }

    @Test
    public void insertStringInMiddleSuccessful() {
        assertEquals("He, Worldllo", instance.insertStringInMiddle("Hello", ", World"));
        assertEquals("St. \n" +
                        " Andersan 7/10Tomeu",
                instance.insertStringInMiddle("St. Tomeu", System.lineSeparator() + " Andersan 7/10"));
    }

    @Test
    public void insertStringInMiddleFail() {
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertStringInMiddle(null, "Empty"));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertStringInMiddle("null", null));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertStringInMiddle(null, null));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertStringInMiddle("", "Empty"));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertStringInMiddle("Empty", ""));
    }

    @Test
    public void insertSymbolInStringSuccessful() {
        assertEquals("Hel!lo", instance.insertSymbolInString("Hello", '!', 3));
        assertEquals("St. Tomeu",
                instance.insertSymbolInString("St. omeu", 'T', 4));
        assertEquals("Mr. John Smith",
                instance.insertSymbolInString("Mr. JohnSmith", ' ', 8));
    }

    @Test
    public void insertSymbolInStringFail() {
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertSymbolInString("Empty", '!', 10));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertSymbolInString("Empty", '!', Integer.MAX_VALUE));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertSymbolInString(null, '0', 0));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertSymbolInString("", '0', 0));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertSymbolInString("Empty", '!', -1));
        assertThrows(IllegalArgumentException.class,
                () -> instance.insertSymbolInString("Empty", '!', Integer.MIN_VALUE));
    }

    @Test
    public void appendToStringSuccessful() {
        assertEquals("Hello,World", instance.appendToString(new StringBuilder("Hello,"), "World"));
        assertEquals("My name's Andreu",
                instance.appendToString(new StringBuilder("My name's"), " Andreu"));
        assertEquals("My favorite color is...",
                instance.appendToString(new StringBuilder("My favorite color"), " is..."));
    }

    @Test
    public void appendToStringFail() {
        assertThrows(NoSuchElementException.class,
                () -> instance.appendToString(new StringBuilder(), "World"));
        assertThrows(NoSuchElementException.class,
                () -> instance.appendToString(new StringBuilder("Hello"), null));
        assertThrows(NoSuchElementException.class,
                () -> instance.appendToString(null, "World"));
    }

    @Test
    public void isPalindromeSuccessful() {
        assertTrue(instance.isPalindrome("ABCBA"));
        assertTrue(instance.isPalindrome("kayak"));
        assertTrue(instance.isPalindrome(""));
        assertFalse(instance.isPalindrome("kayaks"));
        assertFalse(instance.isPalindrome("TRUE"));
    }

    @Test
    public void isPalindromeFail() {
        assertThrows(RuntimeException.class, () -> instance.isPalindrome(null));
    }

    @Test
    public void hasLowerCaseSuccessful() {
        assertTrue(instance.hasLowerCase("okay"));
        assertTrue(instance.hasLowerCase("false"));
        assertFalse(instance.hasLowerCase("oKay"));
        assertFalse(instance.hasLowerCase("True"));
    }

    @Test
    public void hasLowerCaseFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.hasLowerCase(null));
    }

    @Test
    public void uniqueCharactersSuccessful() {
        assertEquals("okay", instance.uniqueCharacters("okay"));
        assertEquals("jhs", instance.uniqueCharacters("johnson"));
        assertEquals("string", instance.uniqueCharacters("string"));
        assertEquals("o", instance.uniqueCharacters("Bob"));
        assertEquals("", instance.uniqueCharacters(""));
    }

    @Test
    public void uniqueCharactersFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.uniqueCharacters(null));
    }

    @Test
    public void removeAllCharactersSuccessful() {
        assertEquals("Lorem ipsum door sit amet, consectetur adipiscing eit, sed do",
                instance.removeAllCharacters("Lorem ipsum dolor sit amet, consectetur "
                + "adipiscing elit, sed do", 'l'));
        assertEquals("Lorm ipsum dolor sit amt, conscttur adipiscing lit, sd do",
                instance.removeAllCharacters("Lorem ipsum dolor sit amet, consectetur "
                + "adipiscing elit, sed do", 'e'));
        assertEquals("Loremipsumdolorsitamet,consecteturadipiscingelit,seddo",
                instance.removeAllCharacters("Lorem ipsum dolor sit amet, consectetur "
                + "adipiscing elit, sed do", ' '));
    }

    @Test
    public void removeAllCharactersFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.removeAllCharacters(null, ' '));
    }

    @Test
    public void toCamelCaseSuccessful() {
        assertEquals("theStealthWarrior", instance.toCamelCase("the-stealth-warrior"));
        assertEquals("theStealthWarrior", instance.toCamelCase("The_Stealth_Warrior"));
        assertEquals("theStealthWarrior", instance.toCamelCase("The stealth warrior"));
    }

    @Test
    public void toCamelCaseFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.toCamelCase(null));
        assertThrows(IllegalArgumentException.class, () -> instance.toCamelCase(""));
    }

    @Test
    public void getCountRepeatableStringSuccessful() {
        assertEquals("11123121211111111", instance.getCountRepeatableString("Hello, World!"));
        assertEquals("123456789123123456789121234567891123456789123456781234567123456123451234123121", instance.getCountRepeatableString("aaaaaaaaaaaa"));
        assertEquals("1", instance.getCountRepeatableString("0"));
        assertEquals("", instance.getCountRepeatableString(""));
    }

    @Test
    public void getCountRepeatableStringFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.getCountRepeatableString(null));
    }

    @Test
    public void sortStringCharactersAscSuccessful() {
        assertEquals(" HWdellloor", instance.sortStringCharactersAsc("Hello World"));
        assertEquals("Jhno", instance.sortStringCharactersAsc("John"));
        assertEquals("", instance.sortStringCharactersAsc(""));
    }

    @Test
    public void sortStringCharactersAscFail() {
        assertThrows(IllegalArgumentException.class, () -> instance.sortStringCharactersAsc(null));
    }
}
