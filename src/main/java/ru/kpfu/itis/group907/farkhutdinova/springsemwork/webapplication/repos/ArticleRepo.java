package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Article;

import java.util.Optional;

public interface ArticleRepo extends JpaRepository<Article, Long> {
    Optional<Article> findById(Long id);
    Iterable<Article> findByTitleContains(String title);
}
