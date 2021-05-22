package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserDto;

public interface UserService {
    UserDto getUser(String username);
}
