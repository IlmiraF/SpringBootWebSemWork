package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}