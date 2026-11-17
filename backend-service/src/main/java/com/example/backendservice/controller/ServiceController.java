package com.example.backendservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceController {

    @Value("${service.instance.name:Instance-1}")
    private String instanceName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "Response from " + instanceName + " [Port: " + port + "]";
    }
}
