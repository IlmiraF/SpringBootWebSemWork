package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.SignUpService;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
public class RegistrationController {
    @Autowired
    private SignUpService signUpService;

    @PermitAll
    @GetMapping("/registration")
    public String getSignUpPage() {
        return "registration";
    }

    @PermitAll
    @PostMapping("/registration")
    public String signUp(UserForm form, HttpServletRequest request) throws UnsupportedEncodingException, MessagingException {
        signUpService.signUp(form, getSiteURL(request));
        return "redirect:/login";
    }

    private String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }

    @GetMapping("/verify")
    public String verifyUser(@Param("code") String code) {
        if (signUpService.verify(code)) {
            return "verify_success";
        } else {
            return "verify_fail";
        }
    }
}