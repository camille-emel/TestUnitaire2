package com.example.task.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {
    // avant chaque test automate creation
    private TaskService taskService;
    @BeforeEach
    void setUp() {
        taskService = new TaskService();
    }

    @Test
    void addTask() {
        taskService.addTask("test");
        List<Task> tasks = taskService.getTasks();
        assertEquals(1, tasks.size());
    }

    @Test
    void removeTask() {
        taskService.addTask("test");
        taskService.addTask("test");
        List<Task> tasks = taskService.getTasks();
        assertEquals(2, tasks.size());
        taskService.removeTask(tasks.getFirst().getId());
        assertEquals(1, tasks.size());

    }

    @Test
    void markTaskAsDone() {
        taskService.addTask("test");
        List<Task> tasks = taskService.getTasks();
        //vérifie que le state de la premiere task soit false.
        assertFalse(tasks.getFirst().getState());
        taskService.markTaskAsDone(tasks.getFirst().getId());
        assertTrue(tasks.getFirst().getState(), "c'est pas bon");

    }
}