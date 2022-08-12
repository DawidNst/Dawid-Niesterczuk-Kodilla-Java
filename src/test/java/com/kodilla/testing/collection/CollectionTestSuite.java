package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public  void before() {System.out.println("Test case: BEGIN\n");}

    @AfterEach
    public  void after() {System.out.println("Test case: END\n");}

    @BeforeAll
    public static void beforeAll() {System.out.println("Test suite: BEGIN\n");}

    @AfterAll
    public static void afterAll() {System.out.println("Test suite: END\n");}


    @DisplayName("When list is empty " +
            "exterminate method should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList()
    {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("When receives list with numbers  " +
            "exterminate method should return only even numbers")

    @Test
    void testOddNumbersExterminatorNormalList()
    {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer>numbers=new ArrayList<>();
        for (int i=0;i<30;i++){
            numbers.add(i);
        }


        //When
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
        List<Integer>expectedOddNumbers=new ArrayList<>();
        for(int i=0;i<30;i+=2){
            expectedOddNumbers.add(i);
        }
        System.out.println(2);

        //Then
        Assertions.assertEquals(expectedOddNumbers, oddNumbers);
    }
}
