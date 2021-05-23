package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.NotificationForm;

public interface NewNotificationService {
    void newNotification(NotificationForm from, User user);
}
