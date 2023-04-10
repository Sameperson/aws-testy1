package com.sameperson.awstesty1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/status")
    public String status() {
        return "status";
    }
}