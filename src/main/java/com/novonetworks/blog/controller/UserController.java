package com.novonetworks.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/user/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }


    @GetMapping("/user/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }
}
