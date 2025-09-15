package com.crud.api_spring.controller;

import com.crud.api_spring.entity.CourseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @GetMapping
    public List<CourseEntity> list(){
        return null;
    }
}
