package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    void testAddToDoList() {
        //Given
        //When
        board.addToDoTask("feed rat");
        String task = board.getToDoTasks().get(0);

        //Then
        assertEquals("feed rat", task);
    }

    @Test
    void testAddInProgressTask() {
        //Given
        //When
        board.addInProgressTask("home");
        String task = board.getInProgressTasks().get(0);

        //Then
        assertEquals("home", task);
    }

    @Test
    void testAddDoneTask() {
        //Given
        //When
        board.addDoneTask("jump");
        String task = board.getDoneTasks().get(0);

        //Then
        assertEquals("jump", task);
    }
}