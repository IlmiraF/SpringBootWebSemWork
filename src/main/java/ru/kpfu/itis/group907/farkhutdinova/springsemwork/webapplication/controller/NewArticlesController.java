package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.ArticleForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.ArticleRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.NewArticleService;

@Controller
public class NewArticlesController {
    @Autowired
    private NewArticleService articleService;

    @GetMapping("/newArticle")
    public String getNewArticle() {
        return "newArticle";
    }

    @PostMapping("newArticle")
    public String postNewArticle(@AuthenticationPrincipal UserDetailsImpl user, ArticleForm form) {
        articleService.newArticle(form, user.getUser());
        return "redirect:/article";
    }
}
