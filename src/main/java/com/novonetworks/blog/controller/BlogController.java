package com.novonetworks.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1>hello spring boot</h1>";
    }
}
