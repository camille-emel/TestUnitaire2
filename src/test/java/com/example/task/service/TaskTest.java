package com.example.task.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task task;
    @BeforeEach
    void setUp() {
        task = new Task(1,"toto");
    }
    @Test
    void isState() {
        assertFalse(task.isState());
    }

    @Test
    void setState() {
        task.setState(true);
        assertTrue(task.isState());
    }
}