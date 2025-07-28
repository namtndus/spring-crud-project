package com.spring.crudproject.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ArticleTemplate {
    private String title;
    private String content;
}
