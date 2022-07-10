package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // в строке не меньше 3 и не больше 19 символов
        if (name.length() >= 3 && name.length() <= 19) {
            // пробел стоит не в начале и не в конце строки
            if (name.startsWith(" ") || name.endsWith(" ")) {
                return false;
            } else {
                // в строке есть только один пробел
                int j = 0;
                for (int i = 0; i < name.length() - 1; i++) {
                    if (name.charAt(i) == ' ') {
                        j++;
                    }
                }
                if (j == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}