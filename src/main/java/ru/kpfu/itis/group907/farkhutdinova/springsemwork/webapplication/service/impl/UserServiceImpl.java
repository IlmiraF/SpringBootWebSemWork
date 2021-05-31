package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserDto.*;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserDto;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.UserRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDto getUser(String username) {
        return from(userRepo.findByUsername(username));
    }
}