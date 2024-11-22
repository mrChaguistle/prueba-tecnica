package com.prueba.tasksmanager.controller;

import com.prueba.tasksmanager.model.Task;
import com.prueba.tasksmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/task/new")
    public String showTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "createTask";
    }

    @PostMapping("/task/save")
    public String saveTask(Task task) {
        taskService.addTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getTasks());
        return "listTasks";
    }
}
