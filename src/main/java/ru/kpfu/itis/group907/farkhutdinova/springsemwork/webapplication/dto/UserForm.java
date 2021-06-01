package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;

@Data
public class UserForm {
    @NotBlank(message = "Username cannot be empty")
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
}
