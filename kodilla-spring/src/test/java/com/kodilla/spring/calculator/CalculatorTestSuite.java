package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    void testCalculatorAdd(){
        //Given

        //When
        double result = calculator.add(5.5, 2.5);

        //Then
        assertEquals(8, result);
    }

    @Test
    void testCalculatorSub(){
        //Given

        //When
        double result = calculator.sub(95.5, 56.1);

        //Then
        assertEquals(39.4, result);
    }

    @Test
    void testCalculatorMul(){
        //Given

        //When
        double result = calculator.mul(55.2, 12.9);

        //Then
        assertEquals(712.08, result);
    }

    @Test
    void testCalculatorDiv(){
        //Given

        //When
        double result = calculator.div(9.5, 2.5);

        //Then
        assertEquals(3.8, result);
    }
}