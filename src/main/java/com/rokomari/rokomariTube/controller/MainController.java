package com.rokomari.rokomariTube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashBoard";
    }
}
