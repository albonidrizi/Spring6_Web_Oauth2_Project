package com.example.Spring6_Web_Oauth2_Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to Coding duo Course ";
    }


}
