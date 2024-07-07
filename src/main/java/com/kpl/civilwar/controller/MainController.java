package com.kpl.civilwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index"; // templates 폴더 아래의 index.html 파일을 반환
    }

    @GetMapping("/matches")
    public String matches() {
        return "matches"; // templates 폴더 아래의 matches.html 파일을 반환
    }

    @GetMapping("/players")
    public String players() {
        return "players"; // templates 폴더 아래의 players.html 파일을 반환
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog"; // templates 폴더 아래의 blog.html 파일을 반환
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // templates 폴더 아래의 contact.html 파일을 반환
    }
}