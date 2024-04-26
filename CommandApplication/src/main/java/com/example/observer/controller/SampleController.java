package com.example.observer.controller;

import com.example.observer.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping(value = "/get")
    public ResponseEntity<?> routeController(@RequestParam String command){
        return new ResponseEntity<String>(sampleService.routeParser(command), HttpStatus.ACCEPTED);
    }
}
