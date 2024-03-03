package com.betelgeuse.corp.unittest.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.betelgeuse.corp.unittest.models.Calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class ArifmeticalTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator(6, 4);
        int result = calculator.add();

        assertEquals(10, result);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator(6, 4);
        int result = calculator.subtract();

        assertEquals(2, result);
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator(5, 2);
        int result = calculator.multiply();

        assertEquals(10, result);
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator(10, 2);
        int result = calculator.divide();

        assertEquals(5, result);
    }

    //@Test // анатация что метод тестовый
//    @Before анатация выполняется до остальных методов, один раз
//    @After анатация выполняется после остальных методов, один раз
//    @BeforeClass анатация выполняется до остальных методов, но только для статических методов

//    public void testInformation(){
////        assertEquals(ажидаемое, результат);
////        метод нужен для сравнения ожидаемого с получаемым
//
////        assertTrue(true);
////        проверяет условие верное
//
////        assertFalse(false);
////        проверяет условие на неверное
//
////        assertNull(null);
////        проверяет если null то верное
//
////        int[] array = {1,2,3};
////        int[] array2 = {1,2,3};
////        assertArrayEquals(array,array2);
////        проверяет массивы на отличие, если значения разные то не верно
//
//        String word1 = "apple";
//        String word2 = "banana";
//
//        assertEquals(word1, word2);
//    }
}
