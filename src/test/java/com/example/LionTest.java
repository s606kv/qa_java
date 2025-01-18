package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    Feline feline = new Feline();
    Lion lion = new Lion("Самец", feline);

    public LionTest() throws Exception {
    }

    @Test
    public void getKittensTest () {
    int actualKittensCount = lion.getKittens();
    assertEquals("Количество потомства не совпадает", 1, actualKittensCount);
    }

    @Test
    public void getFoodTest () throws Exception {
        Animal animal = new Animal();
        List<String> expectedMealList = animal.getFood("Хищник");
        List<String> actualMealList = lion.getFood();
        assertEquals("Списки еды не совпадают", expectedMealList, actualMealList);
    }

    @Test
    public void checkIfSexExceptionWasThrown () {
        try {
            new Lion("Иное", feline);
        } catch (Exception e) {
            String expectedExceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals("Расхождение", expectedExceptionMessage, e.getMessage());
        }
    }
}