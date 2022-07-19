package com.knubisoft.base.string;

public interface StringTasks {

    /**
     * Display the string in reverse order.
     * Example 1:
     *      input: {'John'}
     *      output: {'nhoJ'}
     * @param original - a string for reversing.
     * */
    String reverseString(String original);
    /**
     * Insert an additional part of string to the original string in the middle.
     * Example 1:
     *      input: {'Hello, Doe', 'John'}
     *      output: {'Hello, John Doe'}
     * @param original - original text.
     * @param toInsert - a sting to insert.
     * */
    String insertStringInMiddle(String original, String toInsert);
    /**
     * Insert an additional part of string to the original string to a specific position.
     * Example 1:
     *      input: {'Hello, Joh Doe', 'n', 10}
     *      output: {'Hello, John Doe'}
     * Example 2:
     *      input: {'Hello, John Doe', '\n', 6}
     *      output: {'Hello,
     *          John Doe'}
     * Example 3:
     *      input: {'Hello, John Doe', '"', 0}
     *      output: {'"Hello, John Doe'}
     * @param original - original text.
     * @param toInsert - a sting to insert.
     * @param position - a position for new string.
     * */
    String insertSymbolInString(String original, char toInsert, int position);
    /**
     * Join the second param to the original string at the end.
     * Example 1:
     *      input: {'Hello John', ' Doe'}
     *      output: {'Hello, John Doe'}
     * @param original - original string.
     * @param toAppend - the string to append at he end.
     * */
    String appendToString(StringBuilder original, String toAppend);
    /**
     * Write the business logic to allow read the text in different order with the same means.
     * Example 1:
     *      input: {'ABCBA'}
     *      output: {true}
     * Example 2:
     *      input: {'kayak'}
     *      output: {true}
     * Example 3:
     *      input: {'kayaks'}
     *      output: {false}
     * Example 4:
     *      input: {'TRUE'}
     *      output: {false}
     * @param palindrome - string.
     * */
    boolean isPalindrome(String palindrome);
    /**
     * Check if the string has lower case and return a correct boolean value.
     * Example 1:
     *      input: {'okay'}
     *      output: {true}
     * Example 2:
     *      input: {'oKay'}
     *      output: {false}
     * Example 3:
     *      input: {'True'}
     *      output: {false}
     * Example 4:
     *      input: {'false'}
     *      output: {true}
     * @param str - string.
     * */
    boolean hasLowerCase(String str);
    /**
     * Check if the string has all unique characters. If not - return empty string.
     * Example 1:
     *      input: {'okay'}
     *      output: {'okay'}
     * Example 2:
     *      input: {'johnson'}
     *      output: {'jhs'}
     * Example 3:
     *      input: {'string'}
     *      output: {'string'}
     * Example 4:
     *      input: {'Bob'}
     *      output: {'o'}
     * @param str - string.
     * */
    String uniqueCharacters(String str);
    /**
     * Remove all characters from the string by the character defined as the second parameter in the method.
     * Example 1:
     *      input: {'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do', 'l'}
     *      output: {'orem ipsum door sit amet, consectetur adipiscing eit, sed do'}
     * Example 2:
     *      input: {'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do', 'e'}
     *      output: {'Lorm ipsum dolor sit amt, conscttur adipiscing lit, sd do'}
     * Example 3:
     *      input: {'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do', ' '}
     *      output: {'Loremipsumdolorsitamet,consecteturadipiscingelit,seddo'}
     * Example 4:
     *      input: {'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do', ''}
     *      output: {'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do'}
     * @param str - string.
     * @param charToRemove - character for removing in an original text.
     * */
    String removeAllCharacters(String str, char charToRemove);
    /**
     * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * Example 1:
     *      input: {the-stealth-warrior}
     *      output: {theStealthWarrior}
     * Example 2:
     *      input: {The_Stealth_Warrior}
     *      output: {TheStealthWarrior}
     * */
    String toCamelCase(String str);

    /**
     * You are given an input string.
     * For each symbol in the string if it's the first character occurrence, replace it with a '1',
     * else replace it with the amount of times you've already seen it.
     * if the counter more that 9 just reset you counter to 1;
     * if (counter > 9) counter = 1;
     * Example 1:
     *      input = {'Hello, World!'}
     *      output = {'11123121211111111'}
     * Example 2:
     *      input = {'aaaaaaaaaaaa'}
     *      output = {'123456789123123456789121234567891123456789123456781234567123456123451234123121'}
     * @param str - string.
     * */
    String getCountRepeatableString(String str);
    /**
     * Sort by asc the characters in the string.
     * Example 1:
     *      input: {'Hello World'}
     *      output: {'deHllloorW'}
     * Example 2:
     *      input: {'John'}
     *      output: {'hnoJ'}
     * */
    String sortStringCharactersAsc(String str);
}
