package com.prueba.tasksmanager.service;

import com.prueba.tasksmanager.mapper.TaskMapper;
import com.prueba.tasksmanager.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskMapper taskMapper;

    @Autowired
    public TaskService(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    public void addTask(Task task) {
        taskMapper.insertTask(task);
    }

    public List<Task> getTasks() {
        return taskMapper.getAllTasks();
    }
}
