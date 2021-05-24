package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Article;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.CommentForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.ArticleRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.CommentRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.CommentService;

import java.util.Optional;

@Controller
public class CommentController {
    @Autowired
    private ArticleRepo articleRepo;

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentRepo commentRepo;

    @GetMapping("/article/{article_id}")
    public String getArticlePage(@PathVariable("article_id") Long id, @AuthenticationPrincipal UserDetailsImpl user, Model model) {
        model.addAttribute("user", user);
        Optional<Article> article = articleRepo.findById(id);
        model.addAttribute("message", article.get());
        model.addAttribute("comments", commentRepo.findAllByArticle_Id(article.get().getId()));
        return "articlePage";
    }

    @PostMapping("/article/{article_id}")
    public String postArticlePage(@PathVariable("article_id") Long id, @AuthenticationPrincipal UserDetailsImpl user, CommentForm form, Model model) {
        model.addAttribute("user", user);
        Optional<Article> article = articleRepo.findById(id);
        model.addAttribute("message", article.get());
        model.addAttribute("comments", commentRepo.findAllByArticle_Id(article.get().getId()));
        commentService.newComment(form, article.get(), user.getUser());
        return "redirect:/article/" + id;
    }
}
