package com.spring.crudproject.controller;

import com.spring.crudproject.dto.ArticleTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MainController {

    @PostMapping("/project")
    public ResponseEntity<ArticleTemplate> project(@RequestBody ArticleTemplate article) {
        return article != null ? ResponseEntity.ok(article) : ResponseEntity.notFound().build();
    }
}
