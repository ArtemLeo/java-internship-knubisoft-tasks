package com.knubisoft.base.bool;

public class BoolTasksImpl implements BoolTasks {

    @Override
    public Boolean isTrueAutobox(boolean value) {
        return value;
    }

    @Override
    public Boolean isFalseAutobox(boolean value) {
        return value;
    }

    @Override
    public boolean isTrueUnbox(Boolean value) {
        return value;
    }

    @Override
    public Boolean isFalseUnbox(boolean value) {
        return value;
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
    public boolean andComplexFunction(int firstNumber, double secondNumber, int diapason) {
        return Math.round(secondNumber) == firstNumber
                && firstNumber <= diapason
                && secondNumber <= diapason;
    }

    @Override
    public boolean orComplexFunction(int firstNumber, double secondNumber, int thirdNumber, int diapason) {
        if (diapason >= 5) {
            if (diapason <= 7)
                return (firstNumber == Math.round(secondNumber)) || (firstNumber == thirdNumber);
        }
        return false;
    }

    @Override
    public boolean isSameSizeArray(Object[] firstArray, Object... secondArray) {
        StringBuilder firstValue = new StringBuilder();
        StringBuilder secondValue = new StringBuilder();
        if (firstArray != null && secondArray != null) {
            for (Object firstObject : firstArray) {
                firstValue.append(firstObject);
            }
            for (Object secondObject : secondArray) {
                secondValue.append(secondObject);
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
        int firstValue = 0;
        int secondValue = 0;
        for (char ignored : username.toCharArray()) {
            firstValue++;
        }
        for (char ignored : name.toCharArray()) {
            secondValue++;
        }
        return firstValue <= maxLength && secondValue <= maxLength;
    }
}
