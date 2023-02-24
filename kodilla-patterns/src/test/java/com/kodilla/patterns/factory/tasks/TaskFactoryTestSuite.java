package com.kodilla.patterns.factory.tasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();

        //Then
        assertEquals("Food", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painntingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        painntingTask.executeTask();

        //Then
        assertTrue(painntingTask.isTaskExecuted());
        assertEquals("Paint", painntingTask.getTaskName());
    }

    @Test
    void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();

        //Then
        assertTrue(drivingTask.isTaskExecuted());
        assertEquals("Afternoon", drivingTask.getTaskName());
    }

}
