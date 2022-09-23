package com.kodilla.exception.io;


import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("This is the beginning tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end tests.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing test number " + testCounter);
    }

    @Test
    void testSecondChallengeAssertDoesNotThrow() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1.5, 3));
    }

    @Test
    void testSecondChallengeBoundaryValues() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertAll(
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1, 1.4)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2, 1.5))
        );
    }

    @Test
    void testSecondChallengeAssertionThrows() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(4, 1.5));
    }
}
