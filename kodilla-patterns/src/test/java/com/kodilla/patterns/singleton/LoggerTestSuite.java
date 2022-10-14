package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void getLogger() {
        logger = Logger.LOG;
        logger.log("Checking");
    }

    @Test
    void testGetLastLogger() {
        //Given

        //When
        String lastLog = logger.getLastLog();

        //Then
        assertEquals("Checking", lastLog);
    }

}