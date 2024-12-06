package com.example.task.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TaskService{
    private final List<Task> tasks = new ArrayList<>();
    private int currentTaskIndex = 0;

    TaskService(){
    }

    void addTask(String description){
        Task task = new Task(currentTaskIndex++, description);
        tasks.add(task);
    }

    void removeTask(int index){
        tasks.removeIf(task -> task.getId() == index);
    }

    public List<Task> getTasks(){
        return tasks;
    }

    void markTaskAsDone(int index){
        for(Task task : tasks){
            if(task.getId() == index){
                task.setState(true);
            }
        }
    }


}
