package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Notification;

import java.util.List;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
