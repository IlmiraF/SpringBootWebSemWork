package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.interfaces;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserForm;

public interface SignUpService {
    void signUp(UserForm form, String siteURL);
    boolean verify(String code);
}
