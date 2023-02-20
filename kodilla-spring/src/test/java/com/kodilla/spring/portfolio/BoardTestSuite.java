package com.kodilla.spring.portfolio;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskList() {
        //Given
        //When
        ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
        boolean board1 = context.containsBean("toDoList");
        boolean board2 = context.containsBean("inProgressList");
        boolean board3 = context.containsBean("doneList");
        //Then
        System.out.println("Bean doneList was found in the container: " + board1);
        System.out.println("Bean doneList was found in the container: " + board2);
        System.out.println("Bean doneList was found in the container: " + board3);
    }
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList taskList1 = context.getBean("toDoList", TaskList.class);
        TaskList taskList2= context.getBean("inProgressList", TaskList.class);
        TaskList taskList3 = context.getBean("doneList", TaskList.class);
        //When
        taskList1.getTasks().add("adas");
        taskList2.getTasks().add("adas");
        taskList3.getTasks().add("adas");
        //Then
        //do nothing
    }
}
