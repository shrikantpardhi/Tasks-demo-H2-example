package com.demo.task.controller;


import com.demo.task.model.Task;
import com.demo.task.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("tasks")
    ResponseEntity<Task> addTask(@RequestBody Task task) {
        Task result = taskService.addTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
