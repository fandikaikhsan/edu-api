package com.edu.api.controller;

import com.edu.api.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edu.api.service.UserService;

import java.util.List;

@Controller
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("user/{userEmail}")
    public User user(@PathVariable("userEmail") String email) {
        return this.userService.getUser(email);
    }

    @GetMapping("user/id/{id}")
    public User user(@PathVariable("id") Long id) {
        return this.userService.getUserId(id);
    }

    @GetMapping("users")
    public List<User> users() {
        return this.userService.getAllUsers();
    }

}
