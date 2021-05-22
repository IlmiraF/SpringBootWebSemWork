package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.security.PermitAll;

@Controller
public class LoginController {
    @PermitAll
    @GetMapping("/login")
    public String getSignInPage() {
        return "login";
    }
}
