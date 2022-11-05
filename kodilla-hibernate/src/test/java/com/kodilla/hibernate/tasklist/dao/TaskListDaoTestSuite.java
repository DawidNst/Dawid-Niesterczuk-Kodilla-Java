package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "ToDo";
    private static final String DESCRIPTION = "go to running";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        String listName = taskList.getListName();
        taskListDao.save(taskList);

        //When
        List<TaskList> result =  taskListDao.findByListName(listName);

        //Then
        assertEquals(1, result.size());
        assertEquals(listName, result.get(0).getListName());;

        //CleanUp
        int id = result.get(0).getId();
        taskListDao.deleteById(id);
    }
}