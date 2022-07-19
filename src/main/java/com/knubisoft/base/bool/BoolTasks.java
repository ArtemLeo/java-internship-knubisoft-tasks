package com.knubisoft.base.bool;

public interface BoolTasks {
    /**
     * Autobox your param and return it only if param is true;
     * @param value - primitive value.
     * */
    Boolean isTrueAutobox(boolean value);
    /**
     * Autobox your param and return it only if param is false;
     * @param value - primitive value.
     * */
    Boolean isFalseAutobox(boolean value);
    /**
     * Unbox your param and return it only if param is true;
     * @param value - primitive value.
     * */
    boolean isTrueUnbox(Boolean value);
    /**
     * Autobox your param and return it only if param is false;
     * @param value - primitive value.
     * */
    Boolean isFalseUnbox(boolean value);
    /**
     * You have to compare two parameters. Convert the second to digit if it possible.
     * You can use only '&&' operator;
     * @param digit - a number value.
     * @param string - a string value.
     * */
    boolean andFunction(int digit, String string);
    /**
     * You have to compare two parameters. Convert the second to digit if it possible.
     * You can use only '||' operator.
     * Please check if the second parameter has a white space or it's a null then return false.
     * @param digit - a number value.
     * @param string - a string value.
     */
    boolean orFunction(int digit, String string);
    /**
     * You need to immediately return true if generated values have the same values;
     * You can use only '&&' operator;
     * Example 1:
     *      input: {4, 4.4, 5}
     *      output: {true}
     * Example 2:
     *      input: {4, 4.0, 5}
     *      output: {true}
     * Example 3:
     *      input: {4, 4.5, 5}
     *      output: {false}
     * @param generatedFirstDigit - a random number in specified range.
     * @param generatedSecondDigit - a random number in specified range.
     * @param range - a range that can be 3 or 5.
     */
    boolean andComplexFunction(int generatedFirstDigit, double generatedSecondDigit, int range);
    /**
     * You need to immediately return true if the first generated value equals to second value or third value;
     * You can use only '||' operator;
     * Example 1:
     *      input: {5, 5.3, 5.5, 6}
     *      output: {true}
     * Example 2:
     *      input: {5, 5.5, 5.3, 6}
     *      output: {true}
     * Example 3:
     *      input: {5, 5.5, 5.5, 6}
     *      output: {false}
     * @param generatedFirstDigit - a random number in specified range.
     * @param generatedSecondDigit - a random number in specified range.
     * @param generatedThirdDigit - a random number in specified range.
     * @param range - a range that can be 5 or 7.
     */
    boolean orComplexFunction(int generatedFirstDigit, double generatedSecondDigit, int generatedThirdDigit, int range);
    /**
     * Convert params to string type and put the checker on them size.
     * Example 1:
     *      input: {'asd', 'qwe'}
     *      output: {true}
     * Example 2:
     *      input: {'asdgdfg', 'qwe'}
     *      output: {false}
     * @param firstArray - array of strings.
     * @param secondArray - array of strings.
     * */
    boolean isSameSizeArray(Object[] firstArray, Object ... secondArray);
    /**
     * Image that you have 2 strings which have already been stored in files.
     * You need to count all characters of them and compare their length with the third param.
     * If the third param is null or one of the strings is empty return false immediately.
     * Example 1:
     *      input: {'johndoe', 'John Doe', 0}
     *      output: {false}
     * Example 2:
     *      input: {'johndoe', '', 8}
     *      output: {false}
     * Example 3:
     *      input: {'', 'John Doe', 8}
     *      output: {false}
     * Example 4:
     *      input: {'johndoe', 'JohnDoe', 8}
     *      output: {true}
     * Example 5:
     *      input: {'DoeJohn', 'JohnDoe', 8}
     *      output: {true}
     * @param username - the username of a user.
     * @param name - the playing name of a user.
     * @param maxLength - the constraint for a username and a name;
     * */
    boolean isSameCharactersCount(String username, String name, int maxLength);
}
