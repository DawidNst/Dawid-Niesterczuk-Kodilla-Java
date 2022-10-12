package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testLog(){
        //given
        logger = Logger.LOG;
        //when
        logger.log("signed out");
        logger.log("changed");
        logger.log("signed in");
        String lastLog = logger.getLastLog();
        //then
        assertEquals("signed in", lastLog);
    }
}