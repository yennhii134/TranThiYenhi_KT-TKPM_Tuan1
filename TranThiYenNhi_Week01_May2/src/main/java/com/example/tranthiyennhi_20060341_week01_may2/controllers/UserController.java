package com.example.tranthiyennhi_20060341_week01_may2.controllers;

import com.example.tranthiyennhi_20060341_week01_may2.models.User;
import com.example.tranthiyennhi_20060341_week01_may2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
