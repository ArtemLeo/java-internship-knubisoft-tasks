package com.knubisoft.base.bool;

public class BoolTasksImpl implements BoolTasks {

    @Override
    public Boolean isTrueAutobox(boolean value) {
        Boolean b = value;
        if (b){
            return b;
        }
        return false;
    }

    @Override
    public Boolean isFalseAutobox(boolean value) {
        Boolean booleanVariable = value;
        if (!booleanVariable) {
            return booleanVariable;
        }
        return true;
    }

    @Override
    public boolean isTrueUnbox(Boolean value) {
        boolean booleanVariable = value;
        if (booleanVariable) {
            return booleanVariable;
        }
        return false;
    }

    @Override
    public Boolean isFalseUnbox(boolean value) {
        Boolean booleanVariable = value;
        if (!booleanVariable) {
            return booleanVariable;
        }
        return true;
    }

    @Override
    public boolean andFunction(int digit, String string) {
        if (string != null && string.matches(".*\\d.*")) {
            int number = Integer.parseInt(string);
            return digit == number;
        }
        return false;
    }

    @Override
    public boolean orFunction(int digit, String string) {
        if ((string == null || (string.contains(" ")))) {
            return false;
        }
        if (string.matches(".*\\d.*")) {
            int number = Integer.parseInt(string);
            return digit == number;
        } else
            return false;
    }

    @Override
    public boolean andComplexFunction(int generatedFirstDigit, double generatedSecondDigit, int range) {
        if (Math.round(generatedSecondDigit) == generatedFirstDigit
                && generatedFirstDigit <= range
                && generatedSecondDigit <= range) {
            return true;
        }
        return false;
    }

    @Override
    public boolean orComplexFunction(int generatedFirstDigit, double generatedSecondDigit, int generatedThirdDigit, int range) {
        if (range >= 5) {
            if (range <= 7)
                return (generatedFirstDigit == Math.round(generatedSecondDigit)) || (generatedFirstDigit == generatedThirdDigit);
        }
        return false;
    }

    @Override
    public boolean isSameSizeArray(Object[] firstArray, Object... secondArray) {
        String firstValue = "";
        String secondValue = "";
        if (firstArray != null && secondArray != null) {
            for (Object firstObject : firstArray) {
                firstValue += firstObject;
            }
            for (Object secondObject : secondArray) {
                secondValue += secondObject;
            }
            return (firstValue.length() == secondValue.length());
        }
        return false;
    }

    @Override
    public boolean isSameCharactersCount(String username, String name, int maxLength) {
        if (username == null || username.length() == 0 || name == null || name.length() == 0 || maxLength == 0) {
            return false;
        }
        int firstCount = 0;
        int secondCount = 0;
        for (char value : username.toCharArray()) {
            firstCount++;
        }
        for (char value : name.toCharArray()) {
            secondCount++;
        }
        return firstCount <= maxLength && secondCount <= maxLength;
    }
}
