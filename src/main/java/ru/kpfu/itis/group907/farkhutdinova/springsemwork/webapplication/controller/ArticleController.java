package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.ArticleRepo;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepo articleRepo;

    @GetMapping("/article")
    public String getArticles(Model model) {
        model.addAttribute("articles", articleRepo.findAll());
        return "articles";
    }
}
