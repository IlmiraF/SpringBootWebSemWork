package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String hashPassword;

    @NotNull
    @Email
    private String email;

    @Column(name = "verification_code", length = 64)
    private String verificationCode;

    @Column(name = "enable")
    private boolean enabled;

    @OneToMany(mappedBy = "author")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "writer")
    private List<Article> articles;

    @ManyToMany(mappedBy = "writers")
    private List<Petition> petitions;

    @OneToMany(mappedBy = "creator")
    private List<Comment> comments;

    @Enumerated(value = EnumType.STRING)
    private State state;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    public enum State {
        ACTIVE, BANNED
    }

    public enum Role {
        USER, ADMIN
    }

    public boolean isActive() {
        return this.state == State.ACTIVE;
    }

    public boolean isBanned() {
        return this.state == State.BANNED;
    }

    public boolean isAdmin() {
        return this.role == Role.ADMIN;
    }

}
