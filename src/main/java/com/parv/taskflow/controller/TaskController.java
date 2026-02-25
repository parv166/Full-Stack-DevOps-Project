package com.parv.taskflow.controller;

import com.parv.taskflow.entity.Task;
import com.parv.taskflow.entity.User;
import com.parv.taskflow.repository.TaskRepository;
import com.parv.taskflow.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public TaskController(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/users/{userId}/tasks")
    public Task createTask(@PathVariable Long userId, @RequestBody Task task) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        task.setUser(user);
        return taskRepository.save(task);
    }

    @GetMapping("/users/{userId}/tasks")
    public List<Task> getUserTasks(@PathVariable Long userId) {
        return taskRepository.findByUserId(userId);
    }

    @PutMapping("/tasks/{taskId}/complete")
    public Task markComplete(@PathVariable Long taskId) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setCompleted(true);
        return taskRepository.save(task);
    }

    @DeleteMapping("/tasks/{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        taskRepository.deleteById(taskId);
    }
}