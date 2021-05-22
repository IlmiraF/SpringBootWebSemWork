package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;

@Controller
public class AccountController {

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/profile")
    public String getProfilePage(@AuthenticationPrincipal UserDetailsImpl user, Model model) {
        model.addAttribute("user", user);
        return "account";
    }

    @PostMapping("/profile")
    public String postProfilePage() {
        return "account";
    }
}
