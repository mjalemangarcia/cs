package com.aleman.aleman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String display() {
        return "welcome";
    }
}

