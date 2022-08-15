package com.knubisoft.base.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTasksImpl implements PatternTasks {

    @Override
    public boolean haveSetOfCharacters(String text) {
        if (text == null || text.trim().isEmpty())
            throw new IllegalArgumentException();
        return Pattern.matches("^[a-zA-Z\\d]+$", text);
    }

    @Override
    public String matchByCharacters(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        return text.matches("pq*") ? "Found a match!" : "Not matched!";
    }

    @Override
    public String matchStartAndEnd(String text) {
        if (text == null)
            throw new IllegalArgumentException();
        Pattern pattern = Pattern.compile("\\Bg\\B");
        Matcher m = pattern.matcher(text);
        return m.find() ? "Found a match!" : "Not matched!";
    }

    @Override
    public String matchIpAddress(String text) {
        if (text == null || text.trim().isEmpty()) throw new IllegalArgumentException();
        return text.replaceAll("(\\.0+)", ".").replaceFirst("^0+", "");
    }

    @Override
    public String matchVowels(String text) {
        if (text == null || text.trim().isEmpty())
            throw new IllegalArgumentException();
        return text.replaceAll("[aeoiuAEOIU]", "");
    }

    @Override
    public boolean validatePIN(String text) {
        if (text == null || text.trim().isEmpty()) throw new IllegalArgumentException();
        return text.matches("\\d{4}|\\d{6}|\\d{8}");
    }

    @Override
    public String divideDigit(int digit) {
        return String.valueOf(digit).replaceAll("0{3}$", "#000");
    }

    @Override
    public String removeAllNonAlphanumericCharacters(String text) {
        return text.replaceAll("\\W", "");
    }

    @Override
    public boolean validatePhoneNumber(String text) {
        if (text == null || text.trim().isEmpty())
            throw new IllegalArgumentException();
        return text.matches("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
    }

    @Override
    public String getLastVowelsByConstraint(String text, int n) {
        if (n == 0) throw new RuntimeException();
        text = text.replaceAll("[^AaEeIiOoUu]", "");
        return text.substring(text.length() - n);
    }

    @Override
    public boolean isMathematicalExpression(String text) {
        if (text == null || text.trim().isEmpty())
            throw new IllegalArgumentException();
        return text.matches("((?:(?:^|[-+_*/])\\s*-?\\d+(\\.\\d+)?(?:[eE][+-]?\\d+)?\\s*)+$)");
    }

    @Override
    public String insertDash(String text) {
        return text.replaceAll("([A-Z](?=[a-z]))", "$1-");
    }
}
