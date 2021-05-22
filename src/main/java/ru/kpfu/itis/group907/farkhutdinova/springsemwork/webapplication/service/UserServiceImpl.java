package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Role;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import static ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserDto.*;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserDto;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.UserRepo;

import java.util.Collections;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDto getUser(String username) {
        return from(userRepo.findByUsername(username));
    }
}