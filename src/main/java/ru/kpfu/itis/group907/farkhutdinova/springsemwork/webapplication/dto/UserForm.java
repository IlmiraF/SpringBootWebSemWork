package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto;

import lombok.Data;

@Data
public class UserForm {
    private String username;
    private String password;
    private String email;
}
