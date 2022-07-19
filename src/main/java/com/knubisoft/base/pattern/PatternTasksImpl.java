package com.knubisoft.base.pattern;

public class PatternTasksImpl implements PatternTasks {

    @Override
    public boolean haveSetOfCharacters(String text) {
        return false;
    }

    @Override
    public String matchByCharacters(String text) {
        return null;
    }

    @Override
    public String matchStartAndEnd(String text) {
        return null;
    }

    @Override
    public String matchIpAddress(String text) {
        return null;
    }

    @Override
    public String matchVowels(String text) {
        return null;
    }

    @Override
    public boolean validatePIN(String text) {
        return false;
    }

    @Override
    public String divideDigit(int digit) {
        return null;
    }

    @Override
    public String removeAllNonAlphanumericCharacters(String text) {
        return null;
    }

    @Override
    public boolean validatePhoneNumber(String text) {
        return false;
    }

    @Override
    public String getLastVowelsByConstraint(String text, int n) {
        return null;
    }

    @Override
    public boolean isMathematicalExpression(String text) {
        return false;
    }

    @Override
    public String insertDash(String text) {
        return null;
    }
}
