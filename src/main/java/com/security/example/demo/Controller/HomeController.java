package com.security.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/admin")
    public String adminIndex(){
        return "admin";
    }

    @GetMapping("/user")
    public String userIndex(){
        return "user";
    }

}
