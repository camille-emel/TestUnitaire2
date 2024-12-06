package com.example.task.controller;
import com.example.task.service.Task;

import com.example.task.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController // def la class as API Rest
@RequestMapping("/tasks")/*Un “mapping” par défaut est déjà ajouté @RequestMapping("/tasks"). Celà
signie que l'adresse de base de toutes nos routes sera http://localhost:8080/tasks*/
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Welcome to the Task Manager API!");
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getTasks());
    }
}
