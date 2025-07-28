package com.spring.crudproject.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/project")
    public String project() {
        return "project";
    }
}
