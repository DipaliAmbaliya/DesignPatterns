package com.example.observer.controller;

import com.example.observer.entity.User;
import com.example.observer.repository.UserRepository;
import com.example.observer.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRegistrationService userRegistrationService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<Object> getEmployees(@RequestParam String name) {
        User user = User.builder().userName(name).build();
        userRegistrationService.registerUser(user);
        return new ResponseEntity<Object>(user.getUserName().toString(), HttpStatus.OK);
    }
}
