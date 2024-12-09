package com.example.task.controller;
import com.example.task.service.Task;

import com.example.task.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok("Welcome to the Task Manager API! toto");
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getTasks());
    }

    @PostMapping
    public ResponseEntity<String> addTask(@RequestParam String description) {
        taskService.addTask(description);
        return ResponseEntity.ok("Ok my dude, got you !");
    }
}
