package com.kpl.civilwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index"; // templates 폴더에 있는 index.html 템플릿을 반환
    }
}