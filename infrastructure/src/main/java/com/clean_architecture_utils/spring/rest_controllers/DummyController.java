package com.clean_architecture_utils.spring.rest_controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clean-architecture")
public class DummyController {

    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }
}
