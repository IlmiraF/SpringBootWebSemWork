package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.NotificationRepo;

@Controller
public class NotificationController {

    @Autowired
    private NotificationRepo notificationRepo;

    @GetMapping("/notification")
    public String getNotifications(Model model, @AuthenticationPrincipal UserDetailsImpl user) {
        model.addAttribute("notifies", notificationRepo.findAll());
        model.addAttribute("user", user);
        return "notifications";
    }
}
