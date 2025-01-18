package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void getSoundTest() {
        assertEquals("Неверный звук", "Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedMealList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMealList = cat.getFood();
        assertEquals("Данные расходятся", expectedMealList, actualMealList);
    }
}