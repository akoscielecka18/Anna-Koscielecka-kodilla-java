package com.kodilla.spring.portfolio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {
    @Bean
    public Board board() {
        return new Board(toDoList(), inProgress(), doneList());
    }

    @Bean(name = "toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    public TaskList inProgress() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    public TaskList doneList() {
        return new TaskList();
    }
}
