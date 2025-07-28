package com.spring.crudproject.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class MainController {

    @PostMapping("/project")
    public String project() {
        return "project";
    }
}
