package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline mockedFeline;

    @Test
    public void getFamilyTest () {
        String expectedFamily = "Кошачьи";
        String actualFamily = mockedFeline.getFamily();
        assertEquals ("Данные не совпадают", expectedFamily, actualFamily);
    }

    @Test
    public void eatMeatTest () throws Exception {
        List<String> expectedMealList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMealList = mockedFeline.eatMeat();
        assertEquals("Данные не совпадают", expectedMealList, actualMealList);
    }

    @Test
    public void checkGetKittensWithParameterReturnsThisParameter () {
        int expectedKittens = 10;
        int actualKittens = mockedFeline.getKittens(10);
        assertEquals("Количество котят не совпадает", expectedKittens, actualKittens);
    }

    @Test
    public void checkGetKittensWithoutParameterInvokeGetKittensWith1 () {
        mockedFeline.getKittens();
        Mockito.verify(mockedFeline, Mockito.times(1)).getKittens(1);
    }




}