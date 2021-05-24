package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.ArticleForm;

public interface NewArticleService {
    void newArticle(ArticleForm form, User user);
}
