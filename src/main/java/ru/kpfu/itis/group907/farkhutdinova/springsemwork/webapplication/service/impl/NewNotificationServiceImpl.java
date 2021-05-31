package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Notification;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.NotificationForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.NotificationRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.interfaces.NewNotificationService;

@Component
public class NewNotificationServiceImpl implements NewNotificationService {

    @Autowired
    private NotificationRepo notificationRepo;

    @Override
    public void newNotification(NotificationForm form, User user) {
        Notification notification = Notification.builder()
                .title(form.getTitle())
                .content(form.getContent())
                .author(user)
                .build();
        notificationRepo.save(notification);
    }
}
