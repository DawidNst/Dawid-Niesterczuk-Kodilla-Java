package com.kodilla.patterns2.observer.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeworkQueueTest {

    @Test
    public void testUpdateHomeworkList(){
        //Given
        Mentor janusz = new Mentor("Janusz");
        Mentor andrzej = new Mentor("Andrzej");

        Student dawid = new Student("dawid");
        Student kuba = new Student("kuba");
        Student irena = new Student("irena");
        Student halina = new Student("halina");

        dawid.registerObserver(janusz);
        kuba.registerObserver(janusz);
        irena.registerObserver(janusz);
        halina.registerObserver(andrzej);

        //When
        dawid.sendHomework("task1");
        dawid.sendHomework("task2");
        kuba.sendHomework("task1");
        kuba.sendHomework("task2");
        kuba.sendHomework("task3");
        irena.sendHomework("task1");
        halina.sendHomework("task1");
        halina.sendHomework("task2");
        halina.sendHomework("task3");

        //Then
        assertEquals(3, andrzej.getUpdateCount());

    }
}