package com.parv.taskflow.controller;
import jakarta.validation.Valid;
import com.parv.taskflow.entity.User;
import com.parv.taskflow.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@Valid @RequestBody User user) {
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        return userService.createUser(user);
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}