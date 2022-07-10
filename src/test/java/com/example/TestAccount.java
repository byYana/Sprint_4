package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAccount {
    private final String name;
    private final boolean expected;

    public TestAccount(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] checkNameToEmboss() {
        return new Object[][]{              //проверка условий
                {"IVANOV IVANIVAN", true},   //19 символов, 1 пробел
                {"IV", false},               // 2 символа
                {"I I", true},               // 3 символа
                {"IVANOVICH IVANIVANIV", false},//20 символов
                {"", false},              // пустая строка
                {" IVANOVIVAN", false},      //пробел в начале
                {"IVANOVIVAN ", false},     // пробел в конце
                {"IVANOVIVAN", false},       // 0 пробелов
                {"IVA NOVI IVAN", false},       //2 пробела
        };
    }

    @Test
    public void testCheckNameToEmboss() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
