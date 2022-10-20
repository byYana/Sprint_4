package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // в строке не меньше 3 && не больше 19 символов && пробел стоит не в начале и не в конце строки
        if (name.length() >= 3 && name.length() <= 19 && !(name.startsWith(" ") || name.endsWith(" ")) && name.split(" ").length == 2) {
            return true;
        }
        return false;
    }
}