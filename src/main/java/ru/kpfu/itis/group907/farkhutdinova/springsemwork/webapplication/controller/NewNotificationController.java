package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.NotificationForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.NewNotificationService;

import javax.persistence.Access;

@Controller
public class NewNotificationController {

    @Autowired
    private NewNotificationService notificationService;

    @GetMapping("/newNotification")
    public String getNotification(@AuthenticationPrincipal UserDetailsImpl user) {
        if(user.isAdmin()) {
            return "newNotification";
        } else {
            return "redirect:/notification";
        }
    }

    @PostMapping("/newNotification")
    public String postNotification(@AuthenticationPrincipal UserDetailsImpl user, NotificationForm form) {
        notificationService.newNotification(form, user.getUser());
        return "redirect:/notification";
    }
}
