package com.knubisoft.base.string;

import java.util.NoSuchElementException;

public class StringTasksImpl implements StringTasks {

    @Override
    public String reverseString(String original) {
        if (original == null) throw new IllegalArgumentException();

        char[] charArray = original.toCharArray();

        int lastIndex = original.length() - 1;
        char[] reversedCharArray = new char[charArray.length];
        for (int i = 0; lastIndex >= i; i++) {
            reversedCharArray[i] = charArray[lastIndex - i];
        }

        return String.valueOf(reversedCharArray);
    }

    @Override
    public String insertStringInMiddle(String original, String toInsert) {
        if (original == null || toInsert == null || original.isEmpty() || toInsert.isEmpty()) {
            throw new IllegalArgumentException();
        }
        StringBuilder builder = new StringBuilder(original);
        return builder.insert(original.length() / 2, toInsert.replace("\r", "")).toString();
    }

    @Override
    public String insertSymbolInString(String original, char toInsert, int position) {
        if (original == null || position > original.length() - 1 || position < 0)
            throw new IllegalArgumentException();
        StringBuilder builder = new StringBuilder(original);
        return builder.insert(position, toInsert).toString();
    }

    @Override
    public String appendToString(StringBuilder original, String toAppend) {
        try {
            if (original.toString().equals("") || toAppend == null) throw new NoSuchElementException();
            return original.append(toAppend).toString();
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean isPalindrome(String palindrome) {
        if (palindrome == null)
            throw new RuntimeException();
        if (palindrome.equals(""))
            return true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (!(palindrome.charAt(i) == palindrome.charAt(palindrome.length() - 1 - i)))
                return false;
        }
        return true;
    }

    @Override
    public boolean hasLowerCase(String str) {
        if (str == null) throw new IllegalArgumentException();
        return str.equals(str.toLowerCase());
    }

    @Override
    public String uniqueCharacters(String str) {
        try {
            StringBuilder uniqueChars = new StringBuilder();
            int counter = 0;
            for (char i : str.toCharArray()) {
                for (char j : str.toCharArray()) {
                    if (Character.toLowerCase(i) == Character.toLowerCase(j)) counter++;
                    if (counter > 1) break;
                }
                if (counter == 1) uniqueChars.append(i);
                counter = 0;
            }
            return uniqueChars.toString();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String removeAllCharacters(String str, char charToRemove) {
        if (str == null)
            throw new IllegalArgumentException();
        str = str.replaceAll(String.valueOf(charToRemove), "");
        return str;
    }

    @Override
    public String toCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        String[] formattedString = str.split("[\\W_]");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < formattedString.length; i++) {
            String word = formattedString[i];


            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }

            result.append(word);

        }

        return result.toString();
    }

    @Override
    public String getCountRepeatableString(String str) {
        if (str == null) throw new IllegalArgumentException();

        char[] charArray = str.toCharArray();
        StringBuilder numericString = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    counter++;
                    if (counter > 9) counter = 1;
                    numericString.append(counter);
                }
            }
            counter = 0;
        }

        return numericString.toString();
    }

    @Override
    public String sortStringCharactersAsc(String str) {
        if (str == null)
            throw new IllegalArgumentException();
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                if (c[j] == c[j + 1]) {
                    continue;
                }
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        str = String.valueOf(c);
        return str;
    }
}
