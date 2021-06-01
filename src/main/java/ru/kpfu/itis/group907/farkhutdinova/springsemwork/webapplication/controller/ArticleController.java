package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Article;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.ArticleRepo;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepo articleRepo;

    @GetMapping("/article")
    public String getArticles(Model model, @RequestParam(required = false, defaultValue = "") String filter) {
        Iterable<Article> article = articleRepo.findAll();
        if(filter != null && !filter.isEmpty()) {
            article = articleRepo.findByTitleContains(filter);
        } else {
            article = articleRepo.findAll();
        }
        model.addAttribute("articles", article);
        model.addAttribute("filter", filter);
        return "articles";
    }
}
