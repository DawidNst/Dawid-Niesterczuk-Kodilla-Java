package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage()
    {
        //Given
        int[]grades={6,5,6,5,6,5,2,6,3,5};
        //When
        double result=ArrayOperations.getAverage(grades);
        double expected = 4.9;
        //Then
        Assertions.assertEquals(expected,result);
        System.out.println(result);


    }
}
