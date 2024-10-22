package com.demo.task.service.impl;

import com.demo.task.model.Task;
import com.demo.task.repository.TaskRepository;
import com.demo.task.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task addTask(Task task) {
        var data = taskRepository.save(task);
        return data;
    }
}
