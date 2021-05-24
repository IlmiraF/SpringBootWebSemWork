package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Article;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Comment;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.CommentForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.CommentRepo;

@Component
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepo commentRepo;

    @Override
    public void newComment(CommentForm form, Article article, User user) {
        Comment comment = Comment.builder()
                .content(form.getContent())
                .article(article)
                .creator(user)
                .build();

        commentRepo.save(comment);
    }
}
