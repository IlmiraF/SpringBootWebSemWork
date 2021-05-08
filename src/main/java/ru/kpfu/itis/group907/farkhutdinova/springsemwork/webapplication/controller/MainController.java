package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;

@Controller
public class MainController {
    @GetMapping("/")
    public String greeting(Model model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model, @AuthenticationPrincipal User currentUser) {
        return "main";
    }

    @GetMapping("/chatek")
    public String chat(Model model, @AuthenticationPrincipal User loggedUser) {
        model.addAttribute("loggedUser", loggedUser.getUsername());
        return "chat_page";
    }
}

