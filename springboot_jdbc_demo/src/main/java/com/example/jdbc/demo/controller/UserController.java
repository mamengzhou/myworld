package com.example.jdbc.demo.controller;

import com.example.jdbc.demo.entity.User;
import com.example.jdbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@EnableAutoConfiguration
public class UserController {
     @Autowired
     private UserService userService;

    @RequestMapping
    public String getUser() {
        userService.updataUserList();
        return "hello";
    }
}
