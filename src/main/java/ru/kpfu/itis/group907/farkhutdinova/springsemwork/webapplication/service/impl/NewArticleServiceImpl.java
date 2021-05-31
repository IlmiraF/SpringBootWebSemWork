package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Article;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.ArticleForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.ArticleRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.interfaces.NewArticleService;

@Component
public class NewArticleServiceImpl implements NewArticleService {
    @Autowired
    private ArticleRepo articleRepo;

    @Override
    public void newArticle(ArticleForm form, User user) {
        Article article = Article.builder()
                .title(form.getTitle())
                .content(form.getContent())
                .writer(user)
                .build();

        articleRepo.save(article);
    }
}
