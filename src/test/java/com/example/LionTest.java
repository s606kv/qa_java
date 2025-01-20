package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    Feline feline;

    @Test
    public void getKittensTest () throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actualKittensCount = lion.getKittens();
        assertEquals("Количество потомства не совпадает", 1, actualKittensCount);
    }

    @Test
    public void getFoodTest () throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedMealList = List.of("Животные", "Птицы", "Рыба");
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