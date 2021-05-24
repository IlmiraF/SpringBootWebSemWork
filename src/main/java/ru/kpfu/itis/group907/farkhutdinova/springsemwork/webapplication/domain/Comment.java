package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private User creator;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
