package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Article;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.CommentForm;

public interface CommentService {
    void newComment(CommentForm form, Article article, User user);
}
